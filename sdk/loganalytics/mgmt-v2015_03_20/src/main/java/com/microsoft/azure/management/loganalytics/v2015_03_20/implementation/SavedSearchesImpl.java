/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.loganalytics.v2015_03_20.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.loganalytics.v2015_03_20.SavedSearches;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.loganalytics.v2015_03_20.SavedSearchesListResult;
import com.microsoft.azure.management.loganalytics.v2015_03_20.SavedSearch;
import com.microsoft.azure.management.loganalytics.v2015_03_20.SearchResultsResponse;

class SavedSearchesImpl extends WrapperImpl<SavedSearchesInner> implements SavedSearches {
    private final LogAnalyticsManager manager;

    SavedSearchesImpl(LogAnalyticsManager manager) {
        super(manager.inner().savedSearches());
        this.manager = manager;
    }

    public LogAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    public SavedSearchImpl define(String name) {
        return wrapModel(name);
    }

    private SavedSearchImpl wrapModel(SavedSearchInner inner) {
        return  new SavedSearchImpl(inner, manager());
    }

    private SavedSearchImpl wrapModel(String name) {
        return new SavedSearchImpl(name, this.manager());
    }

    @Override
    public Observable<SavedSearchesListResult> listByWorkspaceAsync(String resourceGroupName, String workspaceName) {
        SavedSearchesInner client = this.inner();
        return client.listByWorkspaceAsync(resourceGroupName, workspaceName)
        .map(new Func1<SavedSearchesListResultInner, SavedSearchesListResult>() {
            @Override
            public SavedSearchesListResult call(SavedSearchesListResultInner inner) {
                return new SavedSearchesListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SavedSearch> getAsync(String resourceGroupName, String workspaceName, String savedSearchId) {
        SavedSearchesInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, savedSearchId)
        .map(new Func1<SavedSearchInner, SavedSearch>() {
            @Override
            public SavedSearch call(SavedSearchInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String workspaceName, String savedSearchId) {
        SavedSearchesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, workspaceName, savedSearchId).toCompletable();
    }

    @Override
    public Observable<SearchResultsResponse> getResultsAsync(String resourceGroupName, String workspaceName, String savedSearchId) {
        SavedSearchesInner client = this.inner();
        return client.getResultsAsync(resourceGroupName, workspaceName, savedSearchId)
        .map(new Func1<SearchResultsResponseInner, SearchResultsResponse>() {
            @Override
            public SearchResultsResponse call(SearchResultsResponseInner inner) {
                return new SearchResultsResponseImpl(inner, manager());
            }
        });
    }

}
