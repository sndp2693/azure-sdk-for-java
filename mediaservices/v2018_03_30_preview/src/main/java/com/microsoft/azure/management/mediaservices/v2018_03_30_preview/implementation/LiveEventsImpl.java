/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.mediaservices.v2018_03_30_preview.LiveEvents;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.mediaservices.v2018_03_30_preview.LiveEvent;
import com.microsoft.azure.management.mediaservices.v2018_03_30_preview.LiveOutputs;

class LiveEventsImpl extends WrapperImpl<LiveEventsInner> implements LiveEvents {
    private final MediaManager manager;

    LiveEventsImpl(MediaManager manager) {
        super(manager.inner().liveEvents());
        this.manager = manager;
    }

    @Override
    public LiveOutputs liveOutputs() {
        LiveOutputs accessor = this.manager().liveOutputs();
        return accessor;
    }

    public MediaManager manager() {
        return this.manager;
    }

    @Override
    public LiveEventImpl define(String name) {
        return new LiveEventImpl(name, this.manager());
    }

    private LiveEventImpl wrapModel(LiveEventInner inner) {
        return  new LiveEventImpl(inner, manager());
    }

    @Override
    public Completable startAsync(String resourceGroupName, String accountName, String liveEventName) {
        LiveEventsInner client = this.inner();
        return client.startAsync(resourceGroupName, accountName, liveEventName).toCompletable();
    }

    @Override
    public Completable stopAsync(String resourceGroupName, String accountName, String liveEventName) {
        LiveEventsInner client = this.inner();
        return client.stopAsync(resourceGroupName, accountName, liveEventName).toCompletable();
    }

    @Override
    public Completable resetAsync(String resourceGroupName, String accountName, String liveEventName) {
        LiveEventsInner client = this.inner();
        return client.resetAsync(resourceGroupName, accountName, liveEventName).toCompletable();
    }

    private Observable<Page<LiveEventInner>> listByMediaserviceNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        LiveEventsInner client = this.inner();
        return client.listNextAsync(nextLink)
        .flatMap(new Func1<Page<LiveEventInner>, Observable<Page<LiveEventInner>>>() {
            @Override
            public Observable<Page<LiveEventInner>> call(Page<LiveEventInner> page) {
                return Observable.just(page).concatWith(listByMediaserviceNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<LiveEvent> listByMediaserviceAsync(final String resourceGroupName, final String accountName) {
        LiveEventsInner client = this.inner();
        return client.listAsync(resourceGroupName, accountName)
        .flatMap(new Func1<Page<LiveEventInner>, Observable<Page<LiveEventInner>>>() {
            @Override
            public Observable<Page<LiveEventInner>> call(Page<LiveEventInner> page) {
                return listByMediaserviceNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<LiveEventInner>, Iterable<LiveEventInner>>() {
            @Override
            public Iterable<LiveEventInner> call(Page<LiveEventInner> page) {
                return page.items();
            }
       })
        .map(new Func1<LiveEventInner, LiveEvent>() {
            @Override
            public LiveEvent call(LiveEventInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Observable<LiveEvent> getByMediaserviceAsync(String resourceGroupName, String accountName, String liveEventName) {
        LiveEventsInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName, liveEventName)
        .map(new Func1<LiveEventInner, LiveEvent>() {
            @Override
            public LiveEvent call(LiveEventInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteByMediaserviceAsync(String resourceGroupName, String accountName, String liveEventName) {
        LiveEventsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName, liveEventName).toCompletable();
    }

}