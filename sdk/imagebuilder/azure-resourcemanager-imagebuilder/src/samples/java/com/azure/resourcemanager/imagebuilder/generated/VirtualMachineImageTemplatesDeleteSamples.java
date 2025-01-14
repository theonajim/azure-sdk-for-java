// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachineImageTemplates Delete. */
public final class VirtualMachineImageTemplatesDeleteSamples {
    /*
     * x-ms-original-file: specification/imagebuilder/resource-manager/Microsoft.VirtualMachineImages/stable/2022-02-14/examples/DeleteImageTemplate.json
     */
    /**
     * Sample code: Delete an Image Template.
     *
     * @param manager Entry point to ImageBuilderManager.
     */
    public static void deleteAnImageTemplate(com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager) {
        manager.virtualMachineImageTemplates().delete("myResourceGroup", "myImageTemplate", Context.NONE);
    }
}
