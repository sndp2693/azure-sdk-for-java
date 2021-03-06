/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The managed artifact.
 */
public class ManagedArtifact {
    /**
     * The managed artifact id.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get the managed artifact id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the managed artifact id.
     *
     * @param id the id value to set
     * @return the ManagedArtifact object itself.
     */
    public ManagedArtifact withId(String id) {
        this.id = id;
        return this;
    }

}
