/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceCall;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Tenants.
 */
public final class TenantsInner {
    /** The Retrofit service to perform REST calls. */
    private TenantsService service;
    /** The service client containing this operation class. */
    private SubscriptionClientImpl client;

    /**
     * Initializes an instance of TenantsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public TenantsInner(Retrofit retrofit, SubscriptionClientImpl client) {
        this.service = retrofit.create(TenantsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Tenants to be
     * used by Retrofit to perform actually REST calls.
     */
    interface TenantsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("tenants")
        Observable<Response<ResponseBody>> list(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("{nextLink}")
        Observable<Response<ResponseBody>> listNext(@Path(value = "nextLink", encoded = true) String nextPageLink, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a list of the tenantIds.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;TenantIdDescriptionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PagedList<TenantIdDescriptionInner>> list() throws CloudException, IOException, IllegalArgumentException {
        ServiceResponse<Page<TenantIdDescriptionInner>> response = listSinglePageAsync().toBlocking().single();
        PagedList<TenantIdDescriptionInner> pagedList = new PagedList<TenantIdDescriptionInner>(response.getBody()) {
            @Override
            public Page<TenantIdDescriptionInner> nextPage(String nextPageLink) throws RestException, IOException {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().getBody();
            }
        };
        return new ServiceResponse<PagedList<TenantIdDescriptionInner>>(pagedList, response.getResponse());
    }

    /**
     * Gets a list of the tenantIds.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<List<TenantIdDescriptionInner>> listAsync(final ListOperationCallback<TenantIdDescriptionInner> serviceCallback) {
        return AzureServiceCall.create(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<TenantIdDescriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TenantIdDescriptionInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets a list of the tenantIds.
     *
     * @return the observable to the List&lt;TenantIdDescriptionInner&gt; object
     */
    public Observable<ServiceResponse<Page<TenantIdDescriptionInner>>> listAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<TenantIdDescriptionInner>>, Observable<ServiceResponse<Page<TenantIdDescriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TenantIdDescriptionInner>>> call(ServiceResponse<Page<TenantIdDescriptionInner>> page) {
                    String nextPageLink = page.getBody().getNextPageLink();
                    return listNextSinglePageAsync(nextPageLink);
                }
            });
    }

    /**
     * Gets a list of the tenantIds.
     *
     * @return the List&lt;TenantIdDescriptionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<TenantIdDescriptionInner>>> listSinglePageAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<TenantIdDescriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TenantIdDescriptionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<TenantIdDescriptionInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<TenantIdDescriptionInner>>(result.getBody(), result.getResponse()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<TenantIdDescriptionInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl1<TenantIdDescriptionInner>, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<PageImpl1<TenantIdDescriptionInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a list of the tenantIds.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;TenantIdDescriptionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PagedList<TenantIdDescriptionInner>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException {
        ServiceResponse<Page<TenantIdDescriptionInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        PagedList<TenantIdDescriptionInner> pagedList = new PagedList<TenantIdDescriptionInner>(response.getBody()) {
            @Override
            public Page<TenantIdDescriptionInner> nextPage(String nextPageLink) throws RestException, IOException {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().getBody();
            }
        };
        return new ServiceResponse<PagedList<TenantIdDescriptionInner>>(pagedList, response.getResponse());
    }

    /**
     * Gets a list of the tenantIds.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<List<TenantIdDescriptionInner>> listNextAsync(final String nextPageLink, final ServiceCall<List<TenantIdDescriptionInner>> serviceCall, final ListOperationCallback<TenantIdDescriptionInner> serviceCallback) {
        return AzureServiceCall.create(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<TenantIdDescriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TenantIdDescriptionInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets a list of the tenantIds.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the observable to the List&lt;TenantIdDescriptionInner&gt; object
     */
    public Observable<ServiceResponse<Page<TenantIdDescriptionInner>>> listNextAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<TenantIdDescriptionInner>>, Observable<ServiceResponse<Page<TenantIdDescriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TenantIdDescriptionInner>>> call(ServiceResponse<Page<TenantIdDescriptionInner>> page) {
                    String nextPageLink = page.getBody().getNextPageLink();
                    return listNextSinglePageAsync(nextPageLink);
                }
            });
    }

    /**
     * Gets a list of the tenantIds.
     *
    ServiceResponse<PageImpl1<TenantIdDescriptionInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the List&lt;TenantIdDescriptionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<TenantIdDescriptionInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        return service.listNext(nextPageLink, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<TenantIdDescriptionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TenantIdDescriptionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<TenantIdDescriptionInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<TenantIdDescriptionInner>>(result.getBody(), result.getResponse()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<TenantIdDescriptionInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl1<TenantIdDescriptionInner>, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<PageImpl1<TenantIdDescriptionInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
