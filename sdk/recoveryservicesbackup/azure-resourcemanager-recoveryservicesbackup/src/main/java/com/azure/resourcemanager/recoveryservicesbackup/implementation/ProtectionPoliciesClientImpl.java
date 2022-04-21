// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ProtectionPoliciesClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ProtectionPolicyResourceInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ProtectionPoliciesClient. */
public final class ProtectionPoliciesClientImpl implements ProtectionPoliciesClient {
    private final ClientLogger logger = new ClientLogger(ProtectionPoliciesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ProtectionPoliciesService service;

    /** The service client containing this operation class. */
    private final RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of ProtectionPoliciesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ProtectionPoliciesClientImpl(RecoveryServicesBackupClientImpl client) {
        this.service =
            RestProxy.create(ProtectionPoliciesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for RecoveryServicesBackupClientProtectionPolicies to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "RecoveryServicesBack")
    private interface ProtectionPoliciesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices"
                + "/vaults/{vaultName}/backupPolicies/{policyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ProtectionPolicyResourceInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("vaultName") String vaultName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("policyName") String policyName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices"
                + "/vaults/{vaultName}/backupPolicies/{policyName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ProtectionPolicyResourceInner>> createOrUpdate(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("vaultName") String vaultName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("policyName") String policyName,
            @BodyParam("application/json") ProtectionPolicyResourceInner parameters,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices"
                + "/vaults/{vaultName}/backupPolicies/{policyName}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> delete(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("vaultName") String vaultName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("policyName") String policyName,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Provides the details of the backup policies associated to Recovery Services Vault. This is an asynchronous
     * operation. Status of the operation can be fetched using GetPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy information to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ProtectionPolicyResourceInner>> getWithResponseAsync(
        String vaultName, String resourceGroupName, String policyName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (policyName == null) {
            return Mono.error(new IllegalArgumentException("Parameter policyName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            vaultName,
                            resourceGroupName,
                            this.client.getSubscriptionId(),
                            policyName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Provides the details of the backup policies associated to Recovery Services Vault. This is an asynchronous
     * operation. Status of the operation can be fetched using GetPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy information to be fetched.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ProtectionPolicyResourceInner>> getWithResponseAsync(
        String vaultName, String resourceGroupName, String policyName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (policyName == null) {
            return Mono.error(new IllegalArgumentException("Parameter policyName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                vaultName,
                resourceGroupName,
                this.client.getSubscriptionId(),
                policyName,
                accept,
                context);
    }

    /**
     * Provides the details of the backup policies associated to Recovery Services Vault. This is an asynchronous
     * operation. Status of the operation can be fetched using GetPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy information to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ProtectionPolicyResourceInner> getAsync(
        String vaultName, String resourceGroupName, String policyName) {
        return getWithResponseAsync(vaultName, resourceGroupName, policyName)
            .flatMap(
                (Response<ProtectionPolicyResourceInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Provides the details of the backup policies associated to Recovery Services Vault. This is an asynchronous
     * operation. Status of the operation can be fetched using GetPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy information to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ProtectionPolicyResourceInner get(String vaultName, String resourceGroupName, String policyName) {
        return getAsync(vaultName, resourceGroupName, policyName).block();
    }

    /**
     * Provides the details of the backup policies associated to Recovery Services Vault. This is an asynchronous
     * operation. Status of the operation can be fetched using GetPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy information to be fetched.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ProtectionPolicyResourceInner> getWithResponse(
        String vaultName, String resourceGroupName, String policyName, Context context) {
        return getWithResponseAsync(vaultName, resourceGroupName, policyName, context).block();
    }

    /**
     * Creates or modifies a backup policy. This is an asynchronous operation. Status of the operation can be fetched
     * using GetPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy to be created.
     * @param parameters resource backup policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ProtectionPolicyResourceInner>> createOrUpdateWithResponseAsync(
        String vaultName, String resourceGroupName, String policyName, ProtectionPolicyResourceInner parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (policyName == null) {
            return Mono.error(new IllegalArgumentException("Parameter policyName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            vaultName,
                            resourceGroupName,
                            this.client.getSubscriptionId(),
                            policyName,
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Creates or modifies a backup policy. This is an asynchronous operation. Status of the operation can be fetched
     * using GetPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy to be created.
     * @param parameters resource backup policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ProtectionPolicyResourceInner>> createOrUpdateWithResponseAsync(
        String vaultName,
        String resourceGroupName,
        String policyName,
        ProtectionPolicyResourceInner parameters,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (policyName == null) {
            return Mono.error(new IllegalArgumentException("Parameter policyName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .createOrUpdate(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                vaultName,
                resourceGroupName,
                this.client.getSubscriptionId(),
                policyName,
                parameters,
                accept,
                context);
    }

    /**
     * Creates or modifies a backup policy. This is an asynchronous operation. Status of the operation can be fetched
     * using GetPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy to be created.
     * @param parameters resource backup policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ProtectionPolicyResourceInner> createOrUpdateAsync(
        String vaultName, String resourceGroupName, String policyName, ProtectionPolicyResourceInner parameters) {
        return createOrUpdateWithResponseAsync(vaultName, resourceGroupName, policyName, parameters)
            .flatMap(
                (Response<ProtectionPolicyResourceInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Creates or modifies a backup policy. This is an asynchronous operation. Status of the operation can be fetched
     * using GetPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy to be created.
     * @param parameters resource backup policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ProtectionPolicyResourceInner createOrUpdate(
        String vaultName, String resourceGroupName, String policyName, ProtectionPolicyResourceInner parameters) {
        return createOrUpdateAsync(vaultName, resourceGroupName, policyName, parameters).block();
    }

    /**
     * Creates or modifies a backup policy. This is an asynchronous operation. Status of the operation can be fetched
     * using GetPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy to be created.
     * @param parameters resource backup policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ProtectionPolicyResourceInner> createOrUpdateWithResponse(
        String vaultName,
        String resourceGroupName,
        String policyName,
        ProtectionPolicyResourceInner parameters,
        Context context) {
        return createOrUpdateWithResponseAsync(vaultName, resourceGroupName, policyName, parameters, context).block();
    }

    /**
     * Deletes specified backup policy from your Recovery Services Vault. This is an asynchronous operation. Status of
     * the operation can be fetched using GetProtectionPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String vaultName, String resourceGroupName, String policyName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (policyName == null) {
            return Mono.error(new IllegalArgumentException("Parameter policyName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .delete(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            vaultName,
                            resourceGroupName,
                            this.client.getSubscriptionId(),
                            policyName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Deletes specified backup policy from your Recovery Services Vault. This is an asynchronous operation. Status of
     * the operation can be fetched using GetProtectionPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String vaultName, String resourceGroupName, String policyName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (policyName == null) {
            return Mono.error(new IllegalArgumentException("Parameter policyName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .delete(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                vaultName,
                resourceGroupName,
                this.client.getSubscriptionId(),
                policyName,
                accept,
                context);
    }

    /**
     * Deletes specified backup policy from your Recovery Services Vault. This is an asynchronous operation. Status of
     * the operation can be fetched using GetProtectionPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String vaultName, String resourceGroupName, String policyName) {
        Mono<Response<Flux<ByteBuffer>>> mono = deleteWithResponseAsync(vaultName, resourceGroupName, policyName);
        return this
            .client
            .<Void, Void>getLroResult(
                mono, this.client.getHttpPipeline(), Void.class, Void.class, this.client.getContext());
    }

    /**
     * Deletes specified backup policy from your Recovery Services Vault. This is an asynchronous operation. Status of
     * the operation can be fetched using GetProtectionPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String vaultName, String resourceGroupName, String policyName, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono =
            deleteWithResponseAsync(vaultName, resourceGroupName, policyName, context);
        return this
            .client
            .<Void, Void>getLroResult(mono, this.client.getHttpPipeline(), Void.class, Void.class, context);
    }

    /**
     * Deletes specified backup policy from your Recovery Services Vault. This is an asynchronous operation. Status of
     * the operation can be fetched using GetProtectionPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<Void>, Void> beginDelete(
        String vaultName, String resourceGroupName, String policyName) {
        return beginDeleteAsync(vaultName, resourceGroupName, policyName).getSyncPoller();
    }

    /**
     * Deletes specified backup policy from your Recovery Services Vault. This is an asynchronous operation. Status of
     * the operation can be fetched using GetProtectionPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<Void>, Void> beginDelete(
        String vaultName, String resourceGroupName, String policyName, Context context) {
        return beginDeleteAsync(vaultName, resourceGroupName, policyName, context).getSyncPoller();
    }

    /**
     * Deletes specified backup policy from your Recovery Services Vault. This is an asynchronous operation. Status of
     * the operation can be fetched using GetProtectionPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> deleteAsync(String vaultName, String resourceGroupName, String policyName) {
        return beginDeleteAsync(vaultName, resourceGroupName, policyName)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Deletes specified backup policy from your Recovery Services Vault. This is an asynchronous operation. Status of
     * the operation can be fetched using GetProtectionPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> deleteAsync(String vaultName, String resourceGroupName, String policyName, Context context) {
        return beginDeleteAsync(vaultName, resourceGroupName, policyName, context)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Deletes specified backup policy from your Recovery Services Vault. This is an asynchronous operation. Status of
     * the operation can be fetched using GetProtectionPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String vaultName, String resourceGroupName, String policyName) {
        deleteAsync(vaultName, resourceGroupName, policyName).block();
    }

    /**
     * Deletes specified backup policy from your Recovery Services Vault. This is an asynchronous operation. Status of
     * the operation can be fetched using GetProtectionPolicyOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String vaultName, String resourceGroupName, String policyName, Context context) {
        deleteAsync(vaultName, resourceGroupName, policyName, context).block();
    }
}
