// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The benchmark references. */
@Fluent
public final class BenchmarkReference {
    /*
     * The benchmark name.
     */
    @JsonProperty(value = "benchmark")
    private String benchmark;

    /*
     * The benchmark reference.
     */
    @JsonProperty(value = "reference")
    private String reference;

    /**
     * Get the benchmark property: The benchmark name.
     *
     * @return the benchmark value.
     */
    public String benchmark() {
        return this.benchmark;
    }

    /**
     * Set the benchmark property: The benchmark name.
     *
     * @param benchmark the benchmark value to set.
     * @return the BenchmarkReference object itself.
     */
    public BenchmarkReference withBenchmark(String benchmark) {
        this.benchmark = benchmark;
        return this;
    }

    /**
     * Get the reference property: The benchmark reference.
     *
     * @return the reference value.
     */
    public String reference() {
        return this.reference;
    }

    /**
     * Set the reference property: The benchmark reference.
     *
     * @param reference the reference value to set.
     * @return the BenchmarkReference object itself.
     */
    public BenchmarkReference withReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
