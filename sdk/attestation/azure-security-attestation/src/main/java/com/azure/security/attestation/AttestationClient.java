// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.security.attestation.models.AttestationData;
import com.azure.security.attestation.models.AttestationOpenIdMetadata;
import com.azure.security.attestation.models.AttestationOptions;
import com.azure.security.attestation.models.AttestationResult;
import com.azure.security.attestation.models.AttestationSigner;
import com.azure.security.attestation.models.AttestationToken;

import java.util.List;

/**
 * The AttestationClient implements the functionality required by the "Attest" family of APIs.
 * <p>
 * An enclave (or Trusted Execution Environment) is a chunk of code that is isolated from the host
 * (think: "encrypted VM" or "encrypted container"). But there's one key attribute of the enclave:
 * It is encrypted.That means that
 * if data is sent from the enclave, there is no way of knowing that the data came from the enclave.
 * </p>
 * <p>
 *     And even worse, there is no way of securely communicating with the enclave (since the enclave is
 *     fully isolated from the host, all information passed into the enclave has to go through its host
 *     first).
 * </p>
 * <p>To solve the communication problem, the Attest API can be used to facilitate what is
 * known as the "Secure Key Release" (SKR) protocol.</p>
 * <p>
 * There are 4 parties involved in an attestation operation:
 * </p>
 * <ul>
 *     <li>The host (which hosts the enclave)</li>
 *     <li>The enclave (which is the enclave :)  encrypted, nobody can see what goes on inside it),</li>
 *     <li>The "verifier" which verifies the evidence from the enclave (this is the attestation service) and
 *     generates a token which can be received by a relying party, and </li>
 *     <li>The "relying party" which will interpret the token from the service. For the Secure Key Release Protocol,
 *     this is the entity which wishes to communicate with the enclave.</li>
 * </ul>
 * <p>
 *   It's possible that all these parties are on the same computer, it's possible theyre on multiple computers.<br>
 *   It's possible that the host is also the relying party. It's possible that the relying party is a component
 *   like Azure Managed HSM.
 * </p>
 *
 * <p>
 * There are three primary pieces of data received by the service for the Attest family of APIs. All of them
 * are arrays of bytes, and all of them originate from code running in the enclave (thus they need to be
 * treated as opaque arrays of bytes by the SDK):
 * </p>
 *
 * <ol>
 * <li>Evidence. For Intel SGX enclaves, this has two forms, either an SGX 'Quote' or an
 * OpenEnclave 'Report'. It is required for attestation operations.</li>
 * <li>InitTimeData  This is data which is specified at Initialization Time. It is optional
 * (and not currently supported on all enclave types in Azure)</li>
 * <li>RunTimeData  this is data which is specified at the time the quote is generated (at runtime).
 * It is optional, but required for the Secure Key Release protocol.</li>
 * </ol>
 * <p>
 * The Evidence is cryptographically signed by a known authority (for Intel SGX Quotes or OpenEnclave reports, this
 * is a key owned by Intel which represents that the SGX enclave is valid and can be trusted).<br>
 * The core idea for all attestation operations is to take advantage of a region within the Evidence which
 * is controlled by enclave. For SGX Enclaves, this is the 64 bytes of "user data" contained within SGX quote.
 * </p>
 * <p>
 *     For the Secure Key Release protocol, code inside the enclave generates an asymmetric key and serializes the public
 *     key into a byte buffer. It then calculates the SHA256 hash of the serialized key and creates a quote
 *     containing that SHA256 hash. We now have a cryptographically validated indication that the contents
 *     of the byte buffer was known inside the enclave.
 *</p>
 * <p>
 * The enclave then hands the byte buffer and the quote to its host. The host sends the quote and byte
 * buffer as the "RunTime Data" to the via the {@link AttestationClient#attestSgxEnclave(BinaryData)}  or
 * {@link AttestationClient#attestOpenEnclave} API. Assuming the byte buffer and quote are valid,
 * and the quote contains the hash of the byte buffer, the attestation service responds with an {@link AttestationToken}
 * signed by the attestation service, whose body is an {@link AttestationResult}.
 * </p>
 * <p>
 *     The token generated also includes the contents of the InitTimeData and/or RunTimeData if it was
 *     provided in the Attest API call.
 * </p>
 * <p>
 * The host then sends the token to the relying party.  The relying party verifies the token
 * and verifies the claims within the token indicate that the enclave is the correct enclave.
 * It then takes the key from the token and uses it to encrypt the data to be sent to the
 * enclave and sends that back to the host, which passes it into the enclave.
 *
 *</p>
 * <p>
 *     That completes the secure key release protocol.
 * </p><br>
 * <p>When the Attestation Token is generated by the attestation service, as mentioned, it contains the
 * InitTime and RunTime data.</p>
 * <p>There are two possible representations for RunTime Data in the attestation token, depending on the requirements of the relying party:<br>
 * The first is as JSON formatted data. That can be convenient if the relying party expects to receive its
 * public key as a JSON Web Key <br>
 * The second is as a binary blob of data. That is needed if either the data sent by the enclave isn't
 * a JSON object - for instance, if the RunTime data contained an asymmetric key which is formatted as a
 * PEM encoded key, it should be interpreted as a binary blob</p>
 *
 * If you ask for the RunTime data to be included in the token as binary, then it will be base64url
 * encoded in the "x-ms-maa-enclavehelddata" claim in the output token (the
 * {@link AttestationResult#getEnclaveHeldData()} property).
 * <br>
 * If you ask for the RunTime data to be included in the token as JSON, then it will be included in the
 * "x-ms-maa-runtimeClaims" claim in the output token (the {@link AttestationResult#getRuntimeClaims()} property).
 *
 * <p>
 *     In addition to the Attest APIs, the {@link AttestationClient} object also contains helper APIs
 *     which can be used to retrieve the OpenId Metadata document and signing keys from the service.
 *
 * </p>
 * <p>
 *     The OpenId Metadata document contains properties which describe the attestation service.
 *     </p>
 * <p>
 *     The Attestation Signing Keys describe the keys which will be used to sign tokens generated by
 *     the attestation service. All tokens emitted by the attestation service will be signed by one
 *     of the certificates listed in the attestation signing keys.
 * </p>
 * <p>
 *     <strong>Note:</strong> The {@link Response} returned by the {@code WithResponse} APIs is actually an
 * {@link AttestationToken} object, which contains a method {@link AttestationToken#serialize()} which returns the
 * actual JSON Web Token returned by the attestation service. If a client is going to be transmitting the attestation
 * token from the MAA service to an external relying party, they should send the actual token from the service to
 * the relying party.
 * </p>
 */
@ServiceClient(builder = AttestationClientBuilder.class)
public final class AttestationClient {
    private final AttestationAsyncClient asyncClient;

    /**
     * Initializes an instance of Attestations client.
     *
     * @param serviceClient the service client implementation.
     */
    AttestationClient(AttestationAsyncClient serviceClient) {
        this.asyncClient = serviceClient;
    }

    /**
     * Retrieves the open-id metadata about the attestation signing keys in use by the attestation service.
     *
     * <p>
     *     The attestation service exposes a standard <a href='https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata'>OpenID metadata Discovery Document</a> which
     *     can be used to discover attributes of the attestation service.
     * </p>
     * <p>The {@code getOpenIdMetadata} API allows the client to retrieve the information contained in
     * the metadata discovery document.
     * </p><p>This is required if an application is manually validating the tokens returned from the attestation
     * service.</p>
     * <p><strong>Retrieve the OpenID metadata for this client.</strong></p>
     * <!-- src_embed com.azure.security.attestation.AttestationClient.getOpenIdMetadata -->
     * <pre>
     * AttestationOpenIdMetadata openIdMetadata = client.getOpenIdMetadata&#40;&#41;;
     * </pre>
     * <!-- end com.azure.security.attestation.AttestationClient.getOpenIdMetadata -->
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return An {@link AttestationOpenIdMetadata} object containing the MAA provided OpenID connect information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AttestationOpenIdMetadata getOpenIdMetadata() {
        return asyncClient.getOpenIdMetadataWithResponse()
            .map(Response::getValue).block();
    }

    /**
     * Retrieves the open-id metadata about the attestation signing keys in use by the attestation service.
     *
     * <p>
     *     The attestation service exposes a standard <a href='https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata'>OpenID metadata Discovery Document</a> which
     *     can be used to discover attributes of the attestation service.
     * </p>
     * <p>The {@code getOpenIdMetadata} API allows the client to retrieve the information contained in
     * the metadata discovery document.
     * </p><p>This is required if an application is manually validating the tokens returned from the attestation
     * service.</p>
     * <p><strong>Retrieve the OpenID metadata for this attestation instance.</strong></p>
     * <!-- src_embed com.azure.security.attestation.AttestationClient.getOpenIdMetadataWithResponse -->
     * <pre>
     * Response&lt;AttestationOpenIdMetadata&gt; response = client.getOpenIdMetadataWithResponse&#40;Context.NONE&#41;;
     * </pre>
     * <!-- end com.azure.security.attestation.AttestationClient.getOpenIdMetadataWithResponse -->
     *
     * @param context Context for the operation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return An {@link AttestationOpenIdMetadata} object containing the MAA provided OpenID connect information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AttestationOpenIdMetadata> getOpenIdMetadataWithResponse(Context context) {
        return asyncClient.getOpenIdMetadataWithResponse(context).block();
    }

    /**
     * Retrieves the list of {@link AttestationSigner} objects associated with this attestation instance.
     * <p>
     *  An {@link AttestationSigner} represents an X.509 certificate chain and KeyId which can be used
     *  to validate an attestation token returned by the service.
     * </p>
     * <p><strong>Retrieve Attestation Signers for this async client.</strong></p>
     * <!-- src_embed com.azure.security.attestation.AttestationClient.getAttestationSigners -->
     * <pre>
     * List&lt;AttestationSigner&gt; signers = client.listAttestationSigners&#40;&#41;;
     * signers.forEach&#40;cert -&gt; &#123;
     *     System.out.println&#40;&quot;Found certificate.&quot;&#41;;
     *     if &#40;cert.getKeyId&#40;&#41; != null&#41; &#123;
     *         System.out.println&#40;&quot;    Certificate Key ID: &quot; + cert.getKeyId&#40;&#41;&#41;;
     *     &#125; else &#123;
     *         System.out.println&#40;&quot;    Signer does not have a Key ID&quot;&#41;;
     *     &#125;
     *     cert.getCertificates&#40;&#41;.forEach&#40;chainElement -&gt; &#123;
     *         System.out.println&#40;&quot;        Cert Subject: &quot; + chainElement.getSubjectDN&#40;&#41;.getName&#40;&#41;&#41;;
     *         System.out.println&#40;&quot;        Cert Issuer: &quot; + chainElement.getIssuerDN&#40;&#41;.getName&#40;&#41;&#41;;
     *     &#125;&#41;;
     * &#125;&#41;;
     * </pre>
     * <!-- end com.azure.security.attestation.AttestationClient.getAttestationSigners -->
     *
     * @return Returns an array of {@link AttestationSigner} objects which will be used to sign tokens returned from the attestation service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<AttestationSigner> listAttestationSigners() {
        return asyncClient.listAttestationSignersWithResponse()
            .map(Response::getValue).block();
    }

    /**
     * Retrieves the list of {@link AttestationSigner} objects associated with this attestation instance.
     * An {@link AttestationSigner} represents an X.509 certificate chain and KeyId which can be used
     * to validate an attestation token returned by the service.
     *
     * <!-- src_embed com.azure.security.attestation.AttestationClient.getAttestationSignersWithResponse -->
     * <pre>
     * Response&lt;List&lt;AttestationSigner&gt;&gt; responseOfSigners = client.listAttestationSignersWithResponse&#40;Context.NONE&#41;;
     * </pre>
     * <!-- end com.azure.security.attestation.AttestationClient.getAttestationSignersWithResponse -->
     *
     *
     * @param context Context for operation.
     * @return Returns an array of {@link AttestationSigner} objects.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<List<AttestationSigner>> listAttestationSignersWithResponse(Context context) {
        return asyncClient.listAttestationSignersWithResponse(context).block();
    }



    /**
     * Attest an OpenEnclave report.
     *
     * <p>This method is a convenience method which attests evidence from an OpenEnclave enclave
     * with no {@code RuntimeData} or {@code InitTimeData}.</p>
     * <p>The {@code report} is generated via the <a href='https://openenclave.github.io/openenclave/api/enclave_8h_aefcb89c91a9078d595e255bd7901ac71.html'>{@code }oe_get_report}</a>.</p>
     * It returns an {@link AttestationResult} containing the claims emitted by the attestation service.
     * <!-- src_embed com.azure.security.attestation.AttestationClient.attestOpenEnclaveWithReport -->
     * <pre>
     * AttestationResult resultWithReport = client.attestOpenEnclave&#40;openEnclaveReport&#41;;
     * </pre>
     * <!-- end com.azure.security.attestation.AttestationClient.attestOpenEnclaveWithReport -->
     *
     * @param report - OpenEnclave generated report.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an attestation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AttestationResult attestOpenEnclave(BinaryData report) {
        return asyncClient.attestOpenEnclave(new AttestationOptions(report)).block();
    }

    /**
     * Attest an OpenEnclave report.
     *
     * <p>This method is a convenience method which attests evidence from an OpenEnclave enclave
     * with no {@code RuntimeData} or {@code InitTimeData}.</p>
     * <p>The {@code report} is generated via the <a href='https://openenclave.github.io/openenclave/api/enclave_8h_aefcb89c91a9078d595e255bd7901ac71.html'>{@code }oe_get_report}</a>.</p>
     * It returns an {@link AttestationResult} containing the claims emitted by the attestation service.
     * <!-- src_embed com.azure.security.attestation.AttestationClient.attestOpenEnclaveWithResponseWithReport -->
     * <pre>
     * Response&lt;AttestationResult&gt; responseWithReport = client.attestOpenEnclaveWithResponse&#40;openEnclaveReport,
     *     Context.NONE&#41;;
     * </pre>
     * <!-- end com.azure.security.attestation.AttestationClient.attestOpenEnclaveWithResponseWithReport -->
     *
     * @param report OpenEnclave generated report.
     * @param context Context for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an attestation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AttestationResult> attestOpenEnclaveWithResponse(
        BinaryData report, Context context) {
        return asyncClient.attestOpenEnclaveWithResponse(new AttestationOptions(report), context).block();
    }

    /**
     * Attest an OpenEnclave report, specifying RunTimeData and InitTimeData.
     *
     * The {@link AttestationOptions} parameter allows the caller to specify the OpenEnclave {@code report} which
     * contains evidence from the enclave, and runtime data which allows the enclave to specify additional
     * data from within the enclave.
     *
     * When calling the {@link AttestationOptions#setRunTimeData(AttestationData)} API, the caller
     * can specify whether the attestation service should treat the runtime data as binary or as JSON when it is
     * included in the response attestation token.
     *
     * <p><strong>Attest an OpenEnclave enclave with attestation options.</strong></p>
     * <!-- src_embed com.azure.security.attestation.AttestationClient.attestOpenEnclave -->
     * <pre>
     * AttestationResult result = client.attestOpenEnclave&#40;new AttestationOptions&#40;openEnclaveReport&#41;
     *     .setRunTimeData&#40;new AttestationData&#40;runtimeData, AttestationDataInterpretation.BINARY&#41;&#41;&#41;;
     *
     * </pre>
     * <!-- end com.azure.security.attestation.AttestationClient.attestOpenEnclave -->
     *
     *
     * @param options Attestation options for an OpenEnclave enclave.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an attestation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AttestationResult attestOpenEnclave(AttestationOptions options) {
        return asyncClient.attestOpenEnclave(options).block();
    }

    /**
     * Attest an OpenEnclave report, specifying RunTimeData and InitTimeData.
     *
     * The {@link AttestationOptions} parameter allows the caller to specify the OpenEnclave {@code report} which
     * contains evidence from the enclave, and runtime data which allows the enclave to specify additional
     * data from within the enclave.
     *
     * When calling the {@link AttestationOptions#setRunTimeData(AttestationData)} API, the caller
     * can specify whether the attestation service should treat the runtime data as binary or as JSON when it is
     * included in the response attestation token.
     *
     * <p><strong>Attest an OpenEnclave enclave with attestation options.</strong></p>
     * <!-- src_embed com.azure.security.attestation.AttestationClient.attestOpenEnclaveWithResponse -->
     * <pre>
     * Response&lt;AttestationResult&gt; openEnclaveResponse = client.attestOpenEnclaveWithResponse&#40;
     *     new AttestationOptions&#40;openEnclaveReport&#41;
     *         .setRunTimeData&#40;new AttestationData&#40;runtimeData, AttestationDataInterpretation.JSON&#41;&#41;, Context.NONE&#41;;
     *
     * </pre>
     * <!-- end com.azure.security.attestation.AttestationClient.attestOpenEnclaveWithResponse -->
     *
     * @param options Attestation request for Intel SGX enclaves.
     * @param context Context for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an attestation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AttestationResult> attestOpenEnclaveWithResponse(
        AttestationOptions options, Context context) {
        return asyncClient.attestOpenEnclaveWithResponse(options, context).block();
    }

    /**
     * Attest an SGX Enclave Quote.
     *
     * <p>This method is a convenience method which attests evidence from an Intel SGX enclave
     * with no {@code RuntimeData} or {@code InitTimeData}.</p>
     * It returns an {@link AttestationResult} containing the claims emitted by the attestation service.
     * <!-- src_embed com.azure.security.attestation.AttestationClient.attestSgxEnclaveWithReport -->
     * <pre>
     * AttestationResult resultWithReport = client.attestSgxEnclave&#40;sgxEnclaveReport&#41;;
     * </pre>
     * <!-- end com.azure.security.attestation.AttestationClient.attestSgxEnclaveWithReport -->
     *
     * @param quote SGX Quote to attest.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an attestation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AttestationResult attestSgxEnclave(BinaryData quote) {
        return asyncClient.attestSgxEnclave(quote).block();
    }

    /**
     * Attest an SGX Enclave Quote.
     *
     * <p>This method is a convenience method which attests evidence from an OpenEnclave enclave
     * with no {@code RuntimeData} or {@code InitTimeData}.</p>
     * <p>The {@code report} is generated via the <a href='https://openenclave.github.io/openenclave/api/enclave_8h_aefcb89c91a9078d595e255bd7901ac71.html'>{@code }oe_get_report}</a>.</p>
     * It returns an {@link AttestationResult} containing the claims emitted by the attestation service.
     * <!-- src_embed com.azure.security.attestation.AttestationClient.attestSgxEnclaveWithResponseWithReport -->
     * <pre>
     * Response&lt;AttestationResult&gt; responseWithReport = client.attestSgxEnclaveWithResponse&#40;sgxQuote, Context.NONE&#41;;
     * </pre>
     * <!-- end com.azure.security.attestation.AttestationClient.attestSgxEnclaveWithResponseWithReport -->
     *
     * @param quote Intel SGX Quote to validate.
     * @param context Context for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an attestation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AttestationResult> attestSgxEnclaveWithResponse(BinaryData quote, Context context) {
        return asyncClient.attestSgxEnclaveWithResponse(new AttestationOptions(quote), context).block();
    }


    /**
     * Attest an SGX enclave quote, specifying RunTimeData and InitTimeData.
     *
     * The {@link AttestationOptions} parameter allows the caller to specify the SGX {@code quote} which
     * contains evidence from the enclave, and runtime data which allows the enclave to specify additional
     * data from within the enclave.
     *
     * When calling the {@link AttestationOptions#setRunTimeData(AttestationData)} API, the caller
     * can specify whether the attestation service should treat the runtime data as binary or as JSON when it is
     * included in the response attestation token.
     *
     * <p><strong>Attest an OpenEnclave enclave with attestation options.</strong></p>
     * <!-- src_embed com.azure.security.attestation.AttestationClient.attestSgxEnclave -->
     * <pre>
     * AttestationResult result = client.attestSgxEnclave&#40;new AttestationOptions&#40;sgxQuote&#41;
     *     .setRunTimeData&#40;new AttestationData&#40;runtimeData, AttestationDataInterpretation.BINARY&#41;&#41;&#41;;
     *
     * </pre>
     * <!-- end com.azure.security.attestation.AttestationClient.attestSgxEnclave -->
     *
     * @param options Attestation options for Intel SGX enclaves.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an attestation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AttestationResult attestSgxEnclave(AttestationOptions options) {
        return asyncClient.attestSgxEnclave(options).block();
    }

    /**
     * Attest an SGX enclave report, specifying RunTimeData and InitTimeData.
     *
     * The {@link AttestationOptions} parameter allows the caller to specify the OpenEnclave {@code report} which
     * contains evidence from the enclave, and runtime data which allows the enclave to specify additional
     * data from within the enclave.
     *
     * When calling the {@link AttestationOptions#setRunTimeData(AttestationData)} API, the caller
     * can specify whether the attestation service should treat the runtime data as binary or as JSON when it is
     * included in the response attestation token.
     *
     * <p><strong>Attest an OpenEnclave enclave with attestation options.</strong></p>
     * <!-- src_embed com.azure.security.attestation.AttestationClient.attestSgxEnclaveWithResponse -->
     * <pre>
     * Response&lt;AttestationResult&gt; openEnclaveResponse = client.attestSgxEnclaveWithResponse&#40;
     *     new AttestationOptions&#40;sgxQuote&#41;
     *         .setRunTimeData&#40;new AttestationData&#40;runtimeData, AttestationDataInterpretation.JSON&#41;&#41;, Context.NONE&#41;;
     *
     * </pre>
     * <!-- end com.azure.security.attestation.AttestationClient.attestSgxEnclaveWithResponse -->
     *
     * @param request Attestation request for Intel SGX enclaves.
     * @param context Context for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of an attestation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AttestationResult> attestSgxEnclaveWithResponse(
        AttestationOptions request, Context context) {
        return asyncClient.attestSgxEnclaveWithResponse(request, context).block();
    }

    /** Performs TPM attestation.
     *
     * Processes attestation evidence from a VBS enclave, producing an attestation result.
     * <p>The TPM attestation protocol is defined <a href='https://docs.microsoft.com/azure/attestation/virtualization-based-security-protocol'>here.</a></p>
     * <p>Unlike OpenEnclave reports and SGX enclave quotes, TPM attestation is implemented using JSON encoded
     * strings. </p><p>The client formats a string serialized JSON request to the service, which responds with a
     * JSON response. The serialized JSON object exchange continues until the service responds with a JSON string
     * with a property named {@code "report"}, whose value will be an attestation result token.</p>
     * <p><strong>Perform the first leg of a TPM attestation operation</strong></p>
     * <!-- src_embed com.azure.security.attestation.AttestationClient.attestTpm -->
     * <pre>
     * &#47;&#47; The initial payload for TPM attestation is a JSON object with a property named &quot;payload&quot;,
     * &#47;&#47; containing an object with a property named &quot;type&quot; whose value is &quot;aikcert&quot;.
     *
     * String attestInitialPayload = &quot;&#123;&#92;&quot;payload&#92;&quot;: &#123; &#92;&quot;type&#92;&quot;: &#92;&quot;aikcert&#92;&quot; &#125; &#125;&quot;;
     * String tpmResponse = client.attestTpm&#40;attestInitialPayload&#41;;
     * </pre>
     * <!-- end com.azure.security.attestation.AttestationClient.attestTpm -->
     *
     * @param request Attestation request for Trusted Platform Module (TPM) attestation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return attestation response for Trusted Platform Module (TPM) attestation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public String attestTpm(String request) {
        return asyncClient.attestTpm(request).block();
    }

    /** Performs TPM attestation.
     *
     * Processes attestation evidence from a VBS enclave, producing an attestation result.
     * <p>The TPM attestation protocol is defined <a href='https://docs.microsoft.com/azure/attestation/virtualization-based-security-protocol'>here.</a></p>
     * <p>Unlike OpenEnclave reports and SGX enclave quotes, TPM attestation is implemented using JSON encoded
     * strings. </p><p>The client formats a string serialized JSON request to the service, which responds with a
     * JSON response. The serialized JSON object exchange continues until the service responds with a JSON string
     * with a property named {@code "report"}, whose value will be an attestation result token.</p>
     * <p><strong>Perform the first leg of a TPM attestation operation</strong></p>
     * <!-- src_embed com.azure.security.attestation.AttestationClient.attestTpmWithResponse -->
     * <pre>
     * &#47;&#47; The initial payload for TPM attestation is a JSON object with a property named &quot;payload&quot;,
     * &#47;&#47; containing an object with a property named &quot;type&quot; whose value is &quot;aikcert&quot;.
     *
     * String attestInitialPayload = &quot;&#123;&#92;&quot;payload&#92;&quot;: &#123; &#92;&quot;type&#92;&quot;: &#92;&quot;aikcert&#92;&quot; &#125; &#125;&quot;;
     * Response&lt;String&gt; tpmResponse = client.attestTpmWithResponse&#40;attestInitialPayload, Context.NONE&#41;;
     * </pre>
     * <!-- end com.azure.security.attestation.AttestationClient.attestTpmWithResponse -->
     *
     * @param request Attestation request for Trusted Platform Module (TPM) attestation.
     * @param context Context for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return attestation response for Trusted Platform Module (TPM) attestation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<String> attestTpmWithResponse(String request, Context context) {
        return asyncClient.attestTpmWithResponse(request, context).block();
    }
}
