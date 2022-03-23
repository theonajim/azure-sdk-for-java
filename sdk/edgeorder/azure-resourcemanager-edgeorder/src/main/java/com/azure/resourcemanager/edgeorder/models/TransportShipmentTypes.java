// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TransportShipmentTypes. */
public final class TransportShipmentTypes extends ExpandableStringEnum<TransportShipmentTypes> {
    /** Static value CustomerManaged for TransportShipmentTypes. */
    public static final TransportShipmentTypes CUSTOMER_MANAGED = fromString("CustomerManaged");

    /** Static value MicrosoftManaged for TransportShipmentTypes. */
    public static final TransportShipmentTypes MICROSOFT_MANAGED = fromString("MicrosoftManaged");

    /**
     * Creates or finds a TransportShipmentTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TransportShipmentTypes.
     */
    @JsonCreator
    public static TransportShipmentTypes fromString(String name) {
        return fromString(name, TransportShipmentTypes.class);
    }

    /** @return known TransportShipmentTypes values. */
    public static Collection<TransportShipmentTypes> values() {
        return values(TransportShipmentTypes.class);
    }
}
