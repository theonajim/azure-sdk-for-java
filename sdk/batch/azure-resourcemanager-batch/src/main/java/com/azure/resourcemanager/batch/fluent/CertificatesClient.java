// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.batch.fluent.models.CertificateInner;
import com.azure.resourcemanager.batch.models.CertificateCreateOrUpdateParameters;
import com.azure.resourcemanager.batch.models.CertificatesCancelDeletionResponse;
import com.azure.resourcemanager.batch.models.CertificatesCreateResponse;
import com.azure.resourcemanager.batch.models.CertificatesGetResponse;
import com.azure.resourcemanager.batch.models.CertificatesUpdateResponse;

/** An instance of this class provides access to all the operations defined in CertificatesClient. */
public interface CertificatesClient {
    /**
     * Lists all of the certificates in the specified account.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return values returned by the List operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CertificateInner> listByBatchAccount(String resourceGroupName, String accountName);

    /**
     * Lists all of the certificates in the specified account.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param maxresults The maximum number of items to return in the response.
     * @param select Comma separated list of properties that should be returned. e.g. "properties/provisioningState".
     *     Only top level properties under properties/ are valid for selection.
     * @param filter OData filter expression. Valid properties for filtering are "properties/provisioningState",
     *     "properties/provisioningStateTransitionTime", "name".
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return values returned by the List operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CertificateInner> listByBatchAccount(
        String resourceGroupName,
        String accountName,
        Integer maxresults,
        String select,
        String filter,
        Context context);

    /**
     * Creates a new certificate inside the specified account.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param certificateName The identifier for the certificate. This must be made up of algorithm and thumbprint
     *     separated by a dash, and must match the certificate data in the request. For example SHA1-a3d1c5.
     * @param parameters Additional parameters for certificate creation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a certificate.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CertificateInner create(
        String resourceGroupName,
        String accountName,
        String certificateName,
        CertificateCreateOrUpdateParameters parameters);

    /**
     * Creates a new certificate inside the specified account.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param certificateName The identifier for the certificate. This must be made up of algorithm and thumbprint
     *     separated by a dash, and must match the certificate data in the request. For example SHA1-a3d1c5.
     * @param parameters Additional parameters for certificate creation.
     * @param ifMatch The entity state (ETag) version of the certificate to update. A value of "*" can be used to apply
     *     the operation only if the certificate already exists. If omitted, this operation will always be applied.
     * @param ifNoneMatch Set to '*' to allow a new certificate to be created, but to prevent updating an existing
     *     certificate. Other values will be ignored.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a certificate.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CertificatesCreateResponse createWithResponse(
        String resourceGroupName,
        String accountName,
        String certificateName,
        CertificateCreateOrUpdateParameters parameters,
        String ifMatch,
        String ifNoneMatch,
        Context context);

    /**
     * Updates the properties of an existing certificate.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param certificateName The identifier for the certificate. This must be made up of algorithm and thumbprint
     *     separated by a dash, and must match the certificate data in the request. For example SHA1-a3d1c5.
     * @param parameters Certificate entity to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a certificate.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CertificateInner update(
        String resourceGroupName,
        String accountName,
        String certificateName,
        CertificateCreateOrUpdateParameters parameters);

    /**
     * Updates the properties of an existing certificate.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param certificateName The identifier for the certificate. This must be made up of algorithm and thumbprint
     *     separated by a dash, and must match the certificate data in the request. For example SHA1-a3d1c5.
     * @param parameters Certificate entity to update.
     * @param ifMatch The entity state (ETag) version of the certificate to update. This value can be omitted or set to
     *     "*" to apply the operation unconditionally.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a certificate.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CertificatesUpdateResponse updateWithResponse(
        String resourceGroupName,
        String accountName,
        String certificateName,
        CertificateCreateOrUpdateParameters parameters,
        String ifMatch,
        Context context);

    /**
     * Deletes the specified certificate.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param certificateName The identifier for the certificate. This must be made up of algorithm and thumbprint
     *     separated by a dash, and must match the certificate data in the request. For example SHA1-a3d1c5.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String accountName, String certificateName);

    /**
     * Deletes the specified certificate.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param certificateName The identifier for the certificate. This must be made up of algorithm and thumbprint
     *     separated by a dash, and must match the certificate data in the request. For example SHA1-a3d1c5.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String accountName, String certificateName, Context context);

    /**
     * Deletes the specified certificate.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param certificateName The identifier for the certificate. This must be made up of algorithm and thumbprint
     *     separated by a dash, and must match the certificate data in the request. For example SHA1-a3d1c5.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String certificateName);

    /**
     * Deletes the specified certificate.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param certificateName The identifier for the certificate. This must be made up of algorithm and thumbprint
     *     separated by a dash, and must match the certificate data in the request. For example SHA1-a3d1c5.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String certificateName, Context context);

    /**
     * Gets information about the specified certificate.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param certificateName The identifier for the certificate. This must be made up of algorithm and thumbprint
     *     separated by a dash, and must match the certificate data in the request. For example SHA1-a3d1c5.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified certificate.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CertificateInner get(String resourceGroupName, String accountName, String certificateName);

    /**
     * Gets information about the specified certificate.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param certificateName The identifier for the certificate. This must be made up of algorithm and thumbprint
     *     separated by a dash, and must match the certificate data in the request. For example SHA1-a3d1c5.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified certificate.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CertificatesGetResponse getWithResponse(
        String resourceGroupName, String accountName, String certificateName, Context context);

    /**
     * If you try to delete a certificate that is being used by a pool or compute node, the status of the certificate
     * changes to deleteFailed. If you decide that you want to continue using the certificate, you can use this
     * operation to set the status of the certificate back to active. If you intend to delete the certificate, you do
     * not need to run this operation after the deletion failed. You must make sure that the certificate is not being
     * used by any resources, and then you can try again to delete the certificate.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param certificateName The identifier for the certificate. This must be made up of algorithm and thumbprint
     *     separated by a dash, and must match the certificate data in the request. For example SHA1-a3d1c5.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a certificate.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CertificateInner cancelDeletion(String resourceGroupName, String accountName, String certificateName);

    /**
     * If you try to delete a certificate that is being used by a pool or compute node, the status of the certificate
     * changes to deleteFailed. If you decide that you want to continue using the certificate, you can use this
     * operation to set the status of the certificate back to active. If you intend to delete the certificate, you do
     * not need to run this operation after the deletion failed. You must make sure that the certificate is not being
     * used by any resources, and then you can try again to delete the certificate.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param certificateName The identifier for the certificate. This must be made up of algorithm and thumbprint
     *     separated by a dash, and must match the certificate data in the request. For example SHA1-a3d1c5.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a certificate.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CertificatesCancelDeletionResponse cancelDeletionWithResponse(
        String resourceGroupName, String accountName, String certificateName, Context context);
}
