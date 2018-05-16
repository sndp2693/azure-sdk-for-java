/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.implementation;

import com.microsoft.azure.management.recoveryservices.AuthType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Raw certificate data.
 */
public class RawCertificateDataInner {
    /**
     * Specifies the authentication type. Possible values include: 'Invalid',
     * 'ACS', 'AAD', 'AccessControlService', 'AzureActiveDirectory'.
     */
    @JsonProperty(value = "authType")
    private AuthType authType;

    /**
     * The base64 encoded certificate raw data string.
     */
    @JsonProperty(value = "certificate")
    private byte[] certificate;

    /**
     * Get the authType value.
     *
     * @return the authType value
     */
    public AuthType authType() {
        return this.authType;
    }

    /**
     * Set the authType value.
     *
     * @param authType the authType value to set
     * @return the RawCertificateDataInner object itself.
     */
    public RawCertificateDataInner withAuthType(AuthType authType) {
        this.authType = authType;
        return this;
    }

    /**
     * Get the certificate value.
     *
     * @return the certificate value
     */
    public byte[] certificate() {
        return this.certificate;
    }

    /**
     * Set the certificate value.
     *
     * @param certificate the certificate value to set
     * @return the RawCertificateDataInner object itself.
     */
    public RawCertificateDataInner withCertificate(byte[] certificate) {
        this.certificate = certificate;
        return this;
    }

}