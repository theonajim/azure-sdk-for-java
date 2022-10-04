// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.confidentialledger;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Configuration;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class UserTests extends ConfidentialLedgerClientTestBase {
    @Test
    public void testGetUserTests() throws Exception {
        String userAad = Configuration.getGlobalConfiguration().get("USER_AAD", "ec667af1-0642-45f0-be8a-b76758a35dde");
        RequestOptions requestOptions = new RequestOptions();

        Response<BinaryData> response = confidentialLedgerClient.getUserWithResponse(userAad, requestOptions);
        
        BinaryData parsedResponse = response.getValue();

        Assertions.assertEquals(200, response.getStatusCode());

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode responseBodyJson = null;

        try {
            responseBodyJson = objectMapper.readTree(parsedResponse.toBytes());
        } catch (IOException e) {
            e.printStackTrace();
            Assertions.assertTrue(false);
        }

        Assertions.assertEquals(responseBodyJson.get("assignedRole").asText(), "Administrator");
        Assertions.assertEquals(responseBodyJson.get("userId").asText(), userAad);
    }
}
