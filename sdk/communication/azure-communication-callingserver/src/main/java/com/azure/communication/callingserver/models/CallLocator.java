// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.models;

/** The locator used for joining or taking action on a call. */
public abstract class CallLocator {
    /*
     * The call locator kind.
     */
    private final CallLocatorKind kind;

    /**
     * The constructor
     *
     * @param kind Specify the call locator kind.
     */
    CallLocator(CallLocatorKind kind) {
        if (kind == CallLocatorKind.GROUP_CALL_LOCATOR || kind == CallLocatorKind.SERVER_CALL_LOCATOR) {
            this.kind = kind;
        } else {
            throw new IllegalArgumentException("Illegal callLocator kind");
        }
    }

    /**
     * Get the kind property: The call locator kind.
     *
     * @return the kind value.
     */
    public CallLocatorKind getKind() {
        return this.kind;
    }
}
