/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.keyvault.models;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The attributes of an issuer managed by the KeyVault service.
 */
public class IssuerAttributes {
    /**
     * Determines whether the issuer is enabled.
     */
    private Boolean enabled;

    /**
     * Creation time in UTC.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long created;

    /**
     * Last updated time in UTC.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long updated;

    /**
     * Get the enabled value.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled value.
     *
     * @param enabled the enabled value to set
     * @return the IssuerAttributes object itself.
     */
    public IssuerAttributes withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the created value.
     *
     * @return the created value
     */
    public DateTime created() {
        if (this.created == null) {
            return null;
        }
        return new DateTime(this.created * 1000L, DateTimeZone.UTC);
    }

    /**
     * Get the updated value.
     *
     * @return the updated value
     */
    public DateTime updated() {
        if (this.updated == null) {
            return null;
        }
        return new DateTime(this.updated * 1000L, DateTimeZone.UTC);
    }

}
