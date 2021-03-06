/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for FailoverDeploymentModel.
 */
public final class FailoverDeploymentModel extends ExpandableStringEnum<FailoverDeploymentModel> {
    /** Static value NotApplicable for FailoverDeploymentModel. */
    public static final FailoverDeploymentModel NOT_APPLICABLE = fromString("NotApplicable");

    /** Static value Classic for FailoverDeploymentModel. */
    public static final FailoverDeploymentModel CLASSIC = fromString("Classic");

    /** Static value ResourceManager for FailoverDeploymentModel. */
    public static final FailoverDeploymentModel RESOURCE_MANAGER = fromString("ResourceManager");

    /**
     * Creates or finds a FailoverDeploymentModel from its string representation.
     * @param name a name to look for
     * @return the corresponding FailoverDeploymentModel
     */
    @JsonCreator
    public static FailoverDeploymentModel fromString(String name) {
        return fromString(name, FailoverDeploymentModel.class);
    }

    /**
     * @return known FailoverDeploymentModel values
     */
    public static Collection<FailoverDeploymentModel> values() {
        return values(FailoverDeploymentModel.class);
    }
}
