// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** An enumeration of SQL Server Database states. */
public final class DatabaseState extends ExpandableStringEnum<DatabaseState> {
    /** Static value Online for DatabaseState. */
    public static final DatabaseState ONLINE = fromString("Online");

    /** Static value Restoring for DatabaseState. */
    public static final DatabaseState RESTORING = fromString("Restoring");

    /** Static value Recovering for DatabaseState. */
    public static final DatabaseState RECOVERING = fromString("Recovering");

    /** Static value RecoveryPending for DatabaseState. */
    public static final DatabaseState RECOVERY_PENDING = fromString("RecoveryPending");

    /** Static value Suspect for DatabaseState. */
    public static final DatabaseState SUSPECT = fromString("Suspect");

    /** Static value Emergency for DatabaseState. */
    public static final DatabaseState EMERGENCY = fromString("Emergency");

    /** Static value Offline for DatabaseState. */
    public static final DatabaseState OFFLINE = fromString("Offline");

    /** Static value Copying for DatabaseState. */
    public static final DatabaseState COPYING = fromString("Copying");

    /** Static value OfflineSecondary for DatabaseState. */
    public static final DatabaseState OFFLINE_SECONDARY = fromString("OfflineSecondary");

    /**
     * Creates a new instance of DatabaseState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DatabaseState() {
    }

    /**
     * Creates or finds a DatabaseState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DatabaseState.
     */
    @JsonCreator
    public static DatabaseState fromString(String name) {
        return fromString(name, DatabaseState.class);
    }

    /**
     * Gets known DatabaseState values.
     *
     * @return known DatabaseState values.
     */
    public static Collection<DatabaseState> values() {
        return values(DatabaseState.class);
    }
}
