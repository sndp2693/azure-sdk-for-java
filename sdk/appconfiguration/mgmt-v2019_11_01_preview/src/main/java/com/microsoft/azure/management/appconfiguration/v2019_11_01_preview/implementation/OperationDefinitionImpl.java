/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appconfiguration.v2019_11_01_preview.implementation;

import com.microsoft.azure.management.appconfiguration.v2019_11_01_preview.OperationDefinition;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appconfiguration.v2019_11_01_preview.OperationDefinitionDisplay;

class OperationDefinitionImpl extends WrapperImpl<OperationDefinitionInner> implements OperationDefinition {
    private final AppConfigurationManager manager;
    OperationDefinitionImpl(OperationDefinitionInner inner, AppConfigurationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppConfigurationManager manager() {
        return this.manager;
    }

    @Override
    public OperationDefinitionDisplay display() {
        return this.inner().display();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

}
