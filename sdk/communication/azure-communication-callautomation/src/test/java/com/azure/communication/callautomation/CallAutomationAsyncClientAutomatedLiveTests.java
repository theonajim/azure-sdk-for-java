// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callautomation;

import com.azure.communication.callautomation.models.AnswerCallResult;
import com.azure.communication.callautomation.models.CreateCallOptions;
import com.azure.communication.callautomation.models.CreateCallResult;
import com.azure.communication.common.CommunicationIdentifier;
import com.azure.communication.identity.CommunicationIdentityAsyncClient;
import com.azure.core.http.HttpClient;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

public class CallAutomationAsyncClientAutomatedLiveTests extends CallAutomationAutomatedLiveTestBase {
    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    @DisabledIfEnvironmentVariable(
        named = "SKIP_LIVE_TEST",
        matches = "(?i)(true)",
        disabledReason = "Requires environment to be set up")
    public void createVOIPCallAndHangupAutomatedTest(HttpClient httpClient) {
        /* Test case: ACS to ACS call
         * 1. create a CallAutomationClient.
         * 2. create a call from source to one ACS target.
         * 3. get updated call properties and check for the connected state.
         * 4. hang up the call.
         * 5. once call is hung up, verify disconnected event
         */
        CallAutomationAsyncClient callClient = getCallAutomationClientUsingConnectionString(httpClient)
            .addPolicy((context, next) -> logHeaders("createVOIPCallAndHangupAutomatedTest", next))
            .buildAsyncClient();

        CommunicationIdentityAsyncClient identityClient = getCommunicationIdentityClientUsingConnectionString(httpClient)
            .addPolicy((context, next) -> logHeaders("createVOIPCallAndHangupAutomatedTest", next))
            .buildAsyncClient();

        try {
            // create caller and receiver
            CommunicationIdentifier caller = identityClient.createUser().block();
            CommunicationIdentifier target = identityClient.createUser().block();

            String uniqueId = serviceBusWithNewCall(caller, target).block();

            // create a call
            List<CommunicationIdentifier> targets = new ArrayList<>(Collections.singletonList(target));
            CreateCallOptions createCallOptions = new CreateCallOptions(caller, targets,
                DISPATCHER_CALLBACK + String.format("?q=%s", uniqueId));
            CreateCallResult createCallResult = callClient.createCall(createCallOptions).block();
            String callConnectionId = createCallResult.getCallConnectionProperties().getCallConnectionId();
            assertNotNull(callConnectionId);

            // wait for the incomingCallContext
            System.out.println("Waiting for incomingCallContext");
            waitForOperationCompletion(8000);

            // answer the call
            String incomingCallContext = incomingCallContextStore.get(uniqueId);
            assertNotNull(incomingCallContext);

            AnswerCallResult answerCallResult = callClient.answerCall(incomingCallContext, DISPATCHER_CALLBACK).block();
            assertNotNull(answerCallResult);
            assertNotNull(answerCallResult.getCallConnection());
            waitForOperationCompletion(3000);

            answerCallResult.getCallConnectionAsync().hangUp(true).block();
            waitForOperationCompletion(2000);

            System.out.println("Test ended, please check if callback events are received.");
        } catch (Exception ex) {
            fail("Unexpected exception received", ex);
        }
    }
}
