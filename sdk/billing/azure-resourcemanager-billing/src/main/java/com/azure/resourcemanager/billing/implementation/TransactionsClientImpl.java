// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

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
import com.azure.resourcemanager.billing.fluent.TransactionsClient;
import com.azure.resourcemanager.billing.fluent.models.TransactionInner;
import com.azure.resourcemanager.billing.models.TransactionListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in TransactionsClient. */
public final class TransactionsClientImpl implements TransactionsClient {
    /** The proxy service used to perform REST calls. */
    private final TransactionsService service;

    /** The service client containing this operation class. */
    private final BillingManagementClientImpl client;

    /**
     * Initializes an instance of TransactionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    TransactionsClientImpl(BillingManagementClientImpl client) {
        this.service =
            RestProxy.create(TransactionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for BillingManagementClientTransactions to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "BillingManagementCli")
    public interface TransactionsService {
        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.Billing/billingAccounts/{billingAccountName}/invoices/{invoiceName}/transactions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<TransactionListResult>> listByInvoice(
            @HostParam("$host") String endpoint,
            @PathParam("billingAccountName") String billingAccountName,
            @PathParam("invoiceName") String invoiceName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<TransactionListResult>> listByInvoiceNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Lists the transactions for an invoice. Transactions include purchases, refunds and Azure usage charges.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of transactions along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TransactionInner>> listByInvoiceSinglePageAsync(
        String billingAccountName, String invoiceName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (billingAccountName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingAccountName is required and cannot be null."));
        }
        if (invoiceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter invoiceName is required and cannot be null."));
        }
        final String apiVersion = "2020-05-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByInvoice(
                            this.client.getEndpoint(), billingAccountName, invoiceName, apiVersion, accept, context))
            .<PagedResponse<TransactionInner>>map(
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
     * Lists the transactions for an invoice. Transactions include purchases, refunds and Azure usage charges.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of transactions along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TransactionInner>> listByInvoiceSinglePageAsync(
        String billingAccountName, String invoiceName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (billingAccountName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingAccountName is required and cannot be null."));
        }
        if (invoiceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter invoiceName is required and cannot be null."));
        }
        final String apiVersion = "2020-05-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByInvoice(this.client.getEndpoint(), billingAccountName, invoiceName, apiVersion, accept, context)
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
     * Lists the transactions for an invoice. Transactions include purchases, refunds and Azure usage charges.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of transactions as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<TransactionInner> listByInvoiceAsync(String billingAccountName, String invoiceName) {
        return new PagedFlux<>(
            () -> listByInvoiceSinglePageAsync(billingAccountName, invoiceName),
            nextLink -> listByInvoiceNextSinglePageAsync(nextLink));
    }

    /**
     * Lists the transactions for an invoice. Transactions include purchases, refunds and Azure usage charges.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of transactions as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<TransactionInner> listByInvoiceAsync(
        String billingAccountName, String invoiceName, Context context) {
        return new PagedFlux<>(
            () -> listByInvoiceSinglePageAsync(billingAccountName, invoiceName, context),
            nextLink -> listByInvoiceNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists the transactions for an invoice. Transactions include purchases, refunds and Azure usage charges.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of transactions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TransactionInner> listByInvoice(String billingAccountName, String invoiceName) {
        return new PagedIterable<>(listByInvoiceAsync(billingAccountName, invoiceName));
    }

    /**
     * Lists the transactions for an invoice. Transactions include purchases, refunds and Azure usage charges.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of transactions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TransactionInner> listByInvoice(
        String billingAccountName, String invoiceName, Context context) {
        return new PagedIterable<>(listByInvoiceAsync(billingAccountName, invoiceName, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of transactions along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TransactionInner>> listByInvoiceNextSinglePageAsync(String nextLink) {
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
            .withContext(context -> service.listByInvoiceNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<TransactionInner>>map(
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
     * @return the list of transactions along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TransactionInner>> listByInvoiceNextSinglePageAsync(String nextLink, Context context) {
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
            .listByInvoiceNext(nextLink, this.client.getEndpoint(), accept, context)
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
