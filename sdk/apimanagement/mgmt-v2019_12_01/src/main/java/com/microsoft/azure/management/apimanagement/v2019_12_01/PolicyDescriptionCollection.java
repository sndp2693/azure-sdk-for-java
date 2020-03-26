/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.ApiManagementManager;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.PolicyDescriptionCollectionInner;
import java.util.List;

/**
 * Type representing PolicyDescriptionCollection.
 */
public interface PolicyDescriptionCollection extends HasInner<PolicyDescriptionCollectionInner>, HasManager<ApiManagementManager> {
    /**
     * @return the count value.
     */
    Long count();

    /**
     * @return the value value.
     */
    List<PolicyDescriptionContract> value();

}
