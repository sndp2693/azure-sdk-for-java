/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2019_12_01.ApiPolicys;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.apimanagement.v2019_12_01.PolicyCollection;
import com.microsoft.azure.management.apimanagement.v2019_12_01.ApiPolicyContract;

class ApiPolicysImpl extends WrapperImpl<ApiPolicysInner> implements ApiPolicys {
    private final ApiManagementManager manager;

    ApiPolicysImpl(ApiManagementManager manager) {
        super(manager.inner().apiPolicys());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public ApiPolicyContractImpl define(String name) {
        return wrapModel(name);
    }

    private ApiPolicyContractImpl wrapModel(PolicyContractInner inner) {
        return  new ApiPolicyContractImpl(inner, manager());
    }

    private ApiPolicyContractImpl wrapModel(String name) {
        return new ApiPolicyContractImpl(name, this.manager());
    }

    @Override
    public Observable<PolicyCollection> listByApiAsync(String resourceGroupName, String serviceName, String apiId) {
        ApiPolicysInner client = this.inner();
        return client.listByApiAsync(resourceGroupName, serviceName, apiId)
        .map(new Func1<PolicyCollectionInner, PolicyCollection>() {
            @Override
            public PolicyCollection call(PolicyCollectionInner inner) {
                return new PolicyCollectionImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable getEntityTagAsync(String resourceGroupName, String serviceName, String apiId) {
        ApiPolicysInner client = this.inner();
        return client.getEntityTagAsync(resourceGroupName, serviceName, apiId).toCompletable();
    }

    @Override
    public Observable<ApiPolicyContract> getAsync(String resourceGroupName, String serviceName, String apiId) {
        ApiPolicysInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName, apiId)
        .flatMap(new Func1<PolicyContractInner, Observable<ApiPolicyContract>>() {
            @Override
            public Observable<ApiPolicyContract> call(PolicyContractInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ApiPolicyContract)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serviceName, String apiId, String ifMatch) {
        ApiPolicysInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceName, apiId, ifMatch).toCompletable();
    }

}
