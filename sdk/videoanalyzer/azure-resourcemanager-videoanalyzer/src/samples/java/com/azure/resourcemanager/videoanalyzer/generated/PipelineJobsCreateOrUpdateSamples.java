// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.generated;

import com.azure.resourcemanager.videoanalyzer.models.ParameterDefinition;
import java.util.Arrays;

/** Samples for PipelineJobs CreateOrUpdate. */
public final class PipelineJobsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/videoanalyzer/resource-manager/Microsoft.Media/preview/2021-11-01-preview/examples/pipeline-job-create.json
     */
    /**
     * Sample code: Create or update a pipeline job.
     *
     * @param manager Entry point to VideoAnalyzerManager.
     */
    public static void createOrUpdateAPipelineJob(
        com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager manager) {
        manager
            .pipelineJobs()
            .define("pipelineJob1")
            .withExistingVideoAnalyzer("testrg", "testaccount2")
            .withTopologyName("pipelinetopology1")
            .withDescription("Pipeline Job 1 Dsecription")
            .withParameters(
                Arrays
                    .asList(
                        new ParameterDefinition()
                            .withName("timesequences")
                            .withValue("[[\"2020-10-05T03:30:00Z\", \"2020-10-05T04:30:00Z\"]]"),
                        new ParameterDefinition().withName("videoSourceName").withValue("camera001")))
            .create();
    }
}
