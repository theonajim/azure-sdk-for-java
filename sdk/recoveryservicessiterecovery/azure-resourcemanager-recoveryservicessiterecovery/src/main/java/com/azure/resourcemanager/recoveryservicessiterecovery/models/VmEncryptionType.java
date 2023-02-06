// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The encryption type of the VM. */
public final class VmEncryptionType extends ExpandableStringEnum<VmEncryptionType> {
    /** Static value NotEncrypted for VmEncryptionType. */
    public static final VmEncryptionType NOT_ENCRYPTED = fromString("NotEncrypted");

    /** Static value OnePassEncrypted for VmEncryptionType. */
    public static final VmEncryptionType ONE_PASS_ENCRYPTED = fromString("OnePassEncrypted");

    /** Static value TwoPassEncrypted for VmEncryptionType. */
    public static final VmEncryptionType TWO_PASS_ENCRYPTED = fromString("TwoPassEncrypted");

    /**
     * Creates a new instance of VmEncryptionType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VmEncryptionType() {
    }

    /**
     * Creates or finds a VmEncryptionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VmEncryptionType.
     */
    @JsonCreator
    public static VmEncryptionType fromString(String name) {
        return fromString(name, VmEncryptionType.class);
    }

    /**
     * Gets known VmEncryptionType values.
     *
     * @return known VmEncryptionType values.
     */
    public static Collection<VmEncryptionType> values() {
        return values(VmEncryptionType.class);
    }
}
