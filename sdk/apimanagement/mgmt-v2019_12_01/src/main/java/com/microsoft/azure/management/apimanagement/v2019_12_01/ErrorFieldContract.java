/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error Field contract.
 */
public class ErrorFieldContract {
    /**
     * Property level error code.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * Human-readable representation of property-level error.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Property name.
     */
    @JsonProperty(value = "target")
    private String target;

    /**
     * Get property level error code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set property level error code.
     *
     * @param code the code value to set
     * @return the ErrorFieldContract object itself.
     */
    public ErrorFieldContract withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get human-readable representation of property-level error.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set human-readable representation of property-level error.
     *
     * @param message the message value to set
     * @return the ErrorFieldContract object itself.
     */
    public ErrorFieldContract withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get property name.
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Set property name.
     *
     * @param target the target value to set
     * @return the ErrorFieldContract object itself.
     */
    public ErrorFieldContract withTarget(String target) {
        this.target = target;
        return this;
    }

}
