// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oep.implementation;

import com.azure.resourcemanager.oep.fluent.models.OperationListResultInner;
import com.azure.resourcemanager.oep.models.Operation;
import com.azure.resourcemanager.oep.models.OperationListResult;
import java.util.Collections;
import java.util.List;

public final class OperationListResultImpl implements OperationListResult {
    private OperationListResultInner innerObject;

    private final com.azure.resourcemanager.oep.OepManager serviceManager;

    OperationListResultImpl(
        OperationListResultInner innerObject, com.azure.resourcemanager.oep.OepManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<Operation> value() {
        List<Operation> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public OperationListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.oep.OepManager manager() {
        return this.serviceManager;
    }
}
