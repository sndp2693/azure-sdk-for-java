/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policy.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Identity for the resource.
 */
public class Identity {
    /**
     * The principal ID of the resource identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /**
     * The tenant ID of the resource identity.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * The identity type. This is the only required field when adding a system
     * assigned identity to a resource. Possible values include:
     * 'SystemAssigned', 'None'.
     */
    @JsonProperty(value = "type")
    private ResourceIdentityType type;

    /**
     * Get the principal ID of the resource identity.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenant ID of the resource identity.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the identity type. This is the only required field when adding a system assigned identity to a resource. Possible values include: 'SystemAssigned', 'None'.
     *
     * @return the type value
     */
    public ResourceIdentityType type() {
        return this.type;
    }

    /**
     * Set the identity type. This is the only required field when adding a system assigned identity to a resource. Possible values include: 'SystemAssigned', 'None'.
     *
     * @param type the type value to set
     * @return the Identity object itself.
     */
    public Identity withType(ResourceIdentityType type) {
        this.type = type;
        return this;
    }

}
