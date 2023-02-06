// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.vmwarecloudsimple.fluent.VirtualMachineTemplatesClient;
import com.azure.resourcemanager.vmwarecloudsimple.fluent.models.VirtualMachineTemplateInner;
import com.azure.resourcemanager.vmwarecloudsimple.models.VirtualMachineTemplateListResponse;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in VirtualMachineTemplatesClient. */
public final class VirtualMachineTemplatesClientImpl implements VirtualMachineTemplatesClient {
    /** The proxy service used to perform REST calls. */
    private final VirtualMachineTemplatesService service;

    /** The service client containing this operation class. */
    private final VMwareCloudSimpleImpl client;

    /**
     * Initializes an instance of VirtualMachineTemplatesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    VirtualMachineTemplatesClientImpl(VMwareCloudSimpleImpl client) {
        this.service =
            RestProxy
                .create(VirtualMachineTemplatesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for VMwareCloudSimpleVirtualMachineTemplates to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "VMwareCloudSimpleVir")
    public interface VirtualMachineTemplatesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.VMwareCloudSimple/locations/{regionId}/privateClouds"
                + "/{pcName}/virtualMachineTemplates")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<VirtualMachineTemplateListResponse>> list(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @PathParam("pcName") String pcName,
            @PathParam("regionId") String regionId,
            @QueryParam("resourcePoolName") String resourcePoolName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.VMwareCloudSimple/locations/{regionId}/privateClouds"
                + "/{pcName}/virtualMachineTemplates/{virtualMachineTemplateName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<VirtualMachineTemplateInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("regionId") String regionId,
            @PathParam("pcName") String pcName,
            @PathParam("virtualMachineTemplateName") String virtualMachineTemplateName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<VirtualMachineTemplateListResponse>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Implements list of available VM templates
     *
     * <p>Returns list of virtual machine templates in region for private cloud.
     *
     * @param pcName The private cloud name.
     * @param regionId The region Id (westus, eastus).
     * @param resourcePoolName Resource pool used to derive vSphere cluster which contains VM templates.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of virtual machine templates along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<VirtualMachineTemplateInner>> listSinglePageAsync(
        String pcName, String regionId, String resourcePoolName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (pcName == null) {
            return Mono.error(new IllegalArgumentException("Parameter pcName is required and cannot be null."));
        }
        if (regionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter regionId is required and cannot be null."));
        }
        if (resourcePoolName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourcePoolName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            pcName,
                            regionId,
                            resourcePoolName,
                            accept,
                            context))
            .<PagedResponse<VirtualMachineTemplateInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Implements list of available VM templates
     *
     * <p>Returns list of virtual machine templates in region for private cloud.
     *
     * @param pcName The private cloud name.
     * @param regionId The region Id (westus, eastus).
     * @param resourcePoolName Resource pool used to derive vSphere cluster which contains VM templates.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of virtual machine templates along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<VirtualMachineTemplateInner>> listSinglePageAsync(
        String pcName, String regionId, String resourcePoolName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (pcName == null) {
            return Mono.error(new IllegalArgumentException("Parameter pcName is required and cannot be null."));
        }
        if (regionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter regionId is required and cannot be null."));
        }
        if (resourcePoolName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourcePoolName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                pcName,
                regionId,
                resourcePoolName,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Implements list of available VM templates
     *
     * <p>Returns list of virtual machine templates in region for private cloud.
     *
     * @param pcName The private cloud name.
     * @param regionId The region Id (westus, eastus).
     * @param resourcePoolName Resource pool used to derive vSphere cluster which contains VM templates.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of virtual machine templates as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<VirtualMachineTemplateInner> listAsync(String pcName, String regionId, String resourcePoolName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(pcName, regionId, resourcePoolName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Implements list of available VM templates
     *
     * <p>Returns list of virtual machine templates in region for private cloud.
     *
     * @param pcName The private cloud name.
     * @param regionId The region Id (westus, eastus).
     * @param resourcePoolName Resource pool used to derive vSphere cluster which contains VM templates.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of virtual machine templates as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<VirtualMachineTemplateInner> listAsync(
        String pcName, String regionId, String resourcePoolName, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(pcName, regionId, resourcePoolName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Implements list of available VM templates
     *
     * <p>Returns list of virtual machine templates in region for private cloud.
     *
     * @param pcName The private cloud name.
     * @param regionId The region Id (westus, eastus).
     * @param resourcePoolName Resource pool used to derive vSphere cluster which contains VM templates.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of virtual machine templates as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VirtualMachineTemplateInner> list(String pcName, String regionId, String resourcePoolName) {
        return new PagedIterable<>(listAsync(pcName, regionId, resourcePoolName));
    }

    /**
     * Implements list of available VM templates
     *
     * <p>Returns list of virtual machine templates in region for private cloud.
     *
     * @param pcName The private cloud name.
     * @param regionId The region Id (westus, eastus).
     * @param resourcePoolName Resource pool used to derive vSphere cluster which contains VM templates.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of virtual machine templates as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VirtualMachineTemplateInner> list(
        String pcName, String regionId, String resourcePoolName, Context context) {
        return new PagedIterable<>(listAsync(pcName, regionId, resourcePoolName, context));
    }

    /**
     * Implements virtual machine template GET method
     *
     * <p>Returns virtual machine templates by its name.
     *
     * @param regionId The region Id (westus, eastus).
     * @param pcName The private cloud name.
     * @param virtualMachineTemplateName virtual machine template id (vsphereId).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual machine template model along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<VirtualMachineTemplateInner>> getWithResponseAsync(
        String regionId, String pcName, String virtualMachineTemplateName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (regionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter regionId is required and cannot be null."));
        }
        if (pcName == null) {
            return Mono.error(new IllegalArgumentException("Parameter pcName is required and cannot be null."));
        }
        if (virtualMachineTemplateName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter virtualMachineTemplateName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            regionId,
                            pcName,
                            virtualMachineTemplateName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Implements virtual machine template GET method
     *
     * <p>Returns virtual machine templates by its name.
     *
     * @param regionId The region Id (westus, eastus).
     * @param pcName The private cloud name.
     * @param virtualMachineTemplateName virtual machine template id (vsphereId).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual machine template model along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<VirtualMachineTemplateInner>> getWithResponseAsync(
        String regionId, String pcName, String virtualMachineTemplateName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (regionId == null) {
            return Mono.error(new IllegalArgumentException("Parameter regionId is required and cannot be null."));
        }
        if (pcName == null) {
            return Mono.error(new IllegalArgumentException("Parameter pcName is required and cannot be null."));
        }
        if (virtualMachineTemplateName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter virtualMachineTemplateName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                regionId,
                pcName,
                virtualMachineTemplateName,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Implements virtual machine template GET method
     *
     * <p>Returns virtual machine templates by its name.
     *
     * @param regionId The region Id (westus, eastus).
     * @param pcName The private cloud name.
     * @param virtualMachineTemplateName virtual machine template id (vsphereId).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual machine template model on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<VirtualMachineTemplateInner> getAsync(
        String regionId, String pcName, String virtualMachineTemplateName) {
        return getWithResponseAsync(regionId, pcName, virtualMachineTemplateName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Implements virtual machine template GET method
     *
     * <p>Returns virtual machine templates by its name.
     *
     * @param regionId The region Id (westus, eastus).
     * @param pcName The private cloud name.
     * @param virtualMachineTemplateName virtual machine template id (vsphereId).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual machine template model along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<VirtualMachineTemplateInner> getWithResponse(
        String regionId, String pcName, String virtualMachineTemplateName, Context context) {
        return getWithResponseAsync(regionId, pcName, virtualMachineTemplateName, context).block();
    }

    /**
     * Implements virtual machine template GET method
     *
     * <p>Returns virtual machine templates by its name.
     *
     * @param regionId The region Id (westus, eastus).
     * @param pcName The private cloud name.
     * @param virtualMachineTemplateName virtual machine template id (vsphereId).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual machine template model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualMachineTemplateInner get(String regionId, String pcName, String virtualMachineTemplateName) {
        return getWithResponse(regionId, pcName, virtualMachineTemplateName, Context.NONE).getValue();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of virtual machine templates along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<VirtualMachineTemplateInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<VirtualMachineTemplateInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of virtual machine templates along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<VirtualMachineTemplateInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
