// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for JobTargetType. */
public final class JobTargetType extends ExpandableStringEnum<JobTargetType> {
    /** Static value TargetGroup for JobTargetType. */
    public static final JobTargetType TARGET_GROUP = fromString("TargetGroup");

    /** Static value SqlDatabase for JobTargetType. */
    public static final JobTargetType SQL_DATABASE = fromString("SqlDatabase");

    /** Static value SqlElasticPool for JobTargetType. */
    public static final JobTargetType SQL_ELASTIC_POOL = fromString("SqlElasticPool");

    /** Static value SqlShardMap for JobTargetType. */
    public static final JobTargetType SQL_SHARD_MAP = fromString("SqlShardMap");

    /** Static value SqlServer for JobTargetType. */
    public static final JobTargetType SQL_SERVER = fromString("SqlServer");

    /**
     * Creates or finds a JobTargetType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding JobTargetType.
     */
    @JsonCreator
    public static JobTargetType fromString(String name) {
        return fromString(name, JobTargetType.class);
    }

    /**
     * Gets known JobTargetType values.
     *
     * @return known JobTargetType values.
     */
    public static Collection<JobTargetType> values() {
        return values(JobTargetType.class);
    }
}
