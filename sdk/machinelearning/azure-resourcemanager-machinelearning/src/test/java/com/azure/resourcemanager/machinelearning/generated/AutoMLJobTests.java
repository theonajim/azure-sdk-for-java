// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.AutoMLJob;
import com.azure.resourcemanager.machinelearning.models.AutoMLVertical;
import com.azure.resourcemanager.machinelearning.models.IdentityConfiguration;
import com.azure.resourcemanager.machinelearning.models.InputDeliveryMode;
import com.azure.resourcemanager.machinelearning.models.JobOutput;
import com.azure.resourcemanager.machinelearning.models.JobResourceConfiguration;
import com.azure.resourcemanager.machinelearning.models.JobService;
import com.azure.resourcemanager.machinelearning.models.LogVerbosity;
import com.azure.resourcemanager.machinelearning.models.MLTableJobInput;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AutoMLJobTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AutoMLJob model =
            BinaryData
                .fromString(
                    "{\"jobType\":\"AutoML\",\"environmentId\":\"uttdiygbp\",\"environmentVariables\":{\"ctwwgzw\":\"swmtxk\",\"og\":\"jlmec\"},\"outputs\":{\"zaifghtmoqqtlff\":{\"jobOutputType\":\"JobOutput\",\"description\":\"vne\"},\"avfqnvhnqoewdogi\":{\"jobOutputType\":\"JobOutput\",\"description\":\"bkrkjj\"},\"t\":{\"jobOutputType\":\"JobOutput\",\"description\":\"tesypvidbztjh\"},\"p\":{\"jobOutputType\":\"JobOutput\",\"description\":\"ovnynkbwetnju\"}},\"resources\":{\"dockerArgs\":\"kzyaup\",\"shmSize\":\"ccxnafbwqroohtuo\",\"instanceCount\":339434421,\"instanceType\":\"nur\",\"properties\":{\"ecmslclbl\":\"datamghihp\",\"bsjuscvsfx\":\"datajxl\",\"cydrtceukdqkk\":\"datagctmgxuupbezq\",\"chillcecf\":\"dataihztgeqmgqzgwldo\"}},\"taskDetails\":{\"taskType\":\"AutoMLVertical\",\"logVerbosity\":\"Debug\",\"targetColumnName\":\"aoaguhicqlli\",\"trainingData\":{\"jobInputType\":\"mltable\",\"mode\":\"EvalMount\",\"uri\":\"ac\",\"description\":\"vhrweftkwqejpmv\"}},\"componentId\":\"ehaepwamcxtc\",\"computeId\":\"upeuknijduyye\",\"displayName\":\"ydjfb\",\"experimentName\":\"yv\",\"identity\":{\"identityType\":\"IdentityConfiguration\"},\"isArchived\":true,\"services\":{\"xjcmmzrrsc\":{\"endpoint\":\"wikdmh\",\"errorMessage\":\"kuflgbh\",\"jobServiceType\":\"uacdixmxuf\",\"port\":2084049172,\"properties\":{\"kfnozoeoqbvj\":\"qg\",\"ay\":\"vefgwbmqjchntas\",\"wyvf\":\"xbulpzealbmqkyo\"},\"status\":\"btsuahxs\"},\"k\":{\"endpoint\":\"i\",\"errorMessage\":\"drnpxqwodiff\",\"jobServiceType\":\"cjrmmua\",\"port\":1056195369,\"properties\":{\"e\":\"jogjonmc\",\"akpoldtvevbo\":\"oyzbamwineofvf\",\"zjknyuxg\":\"lz\",\"mrdixtreki\":\"ttxpnrupza\"},\"status\":\"wyskbruffgll\"}},\"status\":\"Paused\",\"description\":\"lxhrp\",\"properties\":{\"iryr\":\"mblcouqehbhbcds\",\"pmbltoormkfql\":\"ndo\",\"nbmjksibjgsjjxxa\":\"xldykalsygaolnjp\"},\"tags\":{\"gxyivpinbmh\":\"nadzyq\",\"bkezn\":\"bjijkgqxnh\",\"nggiycwkdtaa\":\"aujvaa\",\"ekaum\":\"xw\"}}")
                .toObject(AutoMLJob.class);
        Assertions.assertEquals("lxhrp", model.description());
        Assertions.assertEquals("mblcouqehbhbcds", model.properties().get("iryr"));
        Assertions.assertEquals("nadzyq", model.tags().get("gxyivpinbmh"));
        Assertions.assertEquals("ehaepwamcxtc", model.componentId());
        Assertions.assertEquals("upeuknijduyye", model.computeId());
        Assertions.assertEquals("ydjfb", model.displayName());
        Assertions.assertEquals("yv", model.experimentName());
        Assertions.assertEquals(true, model.isArchived());
        Assertions.assertEquals("wikdmh", model.services().get("xjcmmzrrsc").endpoint());
        Assertions.assertEquals("uacdixmxuf", model.services().get("xjcmmzrrsc").jobServiceType());
        Assertions.assertEquals(2084049172, model.services().get("xjcmmzrrsc").port());
        Assertions.assertEquals("qg", model.services().get("xjcmmzrrsc").properties().get("kfnozoeoqbvj"));
        Assertions.assertEquals("uttdiygbp", model.environmentId());
        Assertions.assertEquals("swmtxk", model.environmentVariables().get("ctwwgzw"));
        Assertions.assertEquals("vne", model.outputs().get("zaifghtmoqqtlff").description());
        Assertions.assertEquals(339434421, model.resources().instanceCount());
        Assertions.assertEquals("nur", model.resources().instanceType());
        Assertions.assertEquals("kzyaup", model.resources().dockerArgs());
        Assertions.assertEquals("ccxnafbwqroohtuo", model.resources().shmSize());
        Assertions.assertEquals(LogVerbosity.DEBUG, model.taskDetails().logVerbosity());
        Assertions.assertEquals("aoaguhicqlli", model.taskDetails().targetColumnName());
        Assertions.assertEquals("vhrweftkwqejpmv", model.taskDetails().trainingData().description());
        Assertions.assertEquals(InputDeliveryMode.EVAL_MOUNT, model.taskDetails().trainingData().mode());
        Assertions.assertEquals("ac", model.taskDetails().trainingData().uri());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AutoMLJob model =
            new AutoMLJob()
                .withDescription("lxhrp")
                .withProperties(
                    mapOf("iryr", "mblcouqehbhbcds", "pmbltoormkfql", "ndo", "nbmjksibjgsjjxxa", "xldykalsygaolnjp"))
                .withTags(
                    mapOf("gxyivpinbmh", "nadzyq", "bkezn", "bjijkgqxnh", "nggiycwkdtaa", "aujvaa", "ekaum", "xw"))
                .withComponentId("ehaepwamcxtc")
                .withComputeId("upeuknijduyye")
                .withDisplayName("ydjfb")
                .withExperimentName("yv")
                .withIdentity(new IdentityConfiguration())
                .withIsArchived(true)
                .withServices(
                    mapOf(
                        "xjcmmzrrsc",
                        new JobService()
                            .withEndpoint("wikdmh")
                            .withJobServiceType("uacdixmxuf")
                            .withPort(2084049172)
                            .withProperties(
                                mapOf("kfnozoeoqbvj", "qg", "ay", "vefgwbmqjchntas", "wyvf", "xbulpzealbmqkyo")),
                        "k",
                        new JobService()
                            .withEndpoint("i")
                            .withJobServiceType("cjrmmua")
                            .withPort(1056195369)
                            .withProperties(
                                mapOf(
                                    "e",
                                    "jogjonmc",
                                    "akpoldtvevbo",
                                    "oyzbamwineofvf",
                                    "zjknyuxg",
                                    "lz",
                                    "mrdixtreki",
                                    "ttxpnrupza"))))
                .withEnvironmentId("uttdiygbp")
                .withEnvironmentVariables(mapOf("ctwwgzw", "swmtxk", "og", "jlmec"))
                .withOutputs(
                    mapOf(
                        "zaifghtmoqqtlff",
                        new JobOutput().withDescription("vne"),
                        "avfqnvhnqoewdogi",
                        new JobOutput().withDescription("bkrkjj"),
                        "t",
                        new JobOutput().withDescription("tesypvidbztjh"),
                        "p",
                        new JobOutput().withDescription("ovnynkbwetnju")))
                .withResources(
                    new JobResourceConfiguration()
                        .withInstanceCount(339434421)
                        .withInstanceType("nur")
                        .withProperties(
                            mapOf(
                                "ecmslclbl",
                                "datamghihp",
                                "bsjuscvsfx",
                                "datajxl",
                                "cydrtceukdqkk",
                                "datagctmgxuupbezq",
                                "chillcecf",
                                "dataihztgeqmgqzgwldo"))
                        .withDockerArgs("kzyaup")
                        .withShmSize("ccxnafbwqroohtuo"))
                .withTaskDetails(
                    new AutoMLVertical()
                        .withLogVerbosity(LogVerbosity.DEBUG)
                        .withTargetColumnName("aoaguhicqlli")
                        .withTrainingData(
                            new MLTableJobInput()
                                .withDescription("vhrweftkwqejpmv")
                                .withMode(InputDeliveryMode.EVAL_MOUNT)
                                .withUri("ac")));
        model = BinaryData.fromObject(model).toObject(AutoMLJob.class);
        Assertions.assertEquals("lxhrp", model.description());
        Assertions.assertEquals("mblcouqehbhbcds", model.properties().get("iryr"));
        Assertions.assertEquals("nadzyq", model.tags().get("gxyivpinbmh"));
        Assertions.assertEquals("ehaepwamcxtc", model.componentId());
        Assertions.assertEquals("upeuknijduyye", model.computeId());
        Assertions.assertEquals("ydjfb", model.displayName());
        Assertions.assertEquals("yv", model.experimentName());
        Assertions.assertEquals(true, model.isArchived());
        Assertions.assertEquals("wikdmh", model.services().get("xjcmmzrrsc").endpoint());
        Assertions.assertEquals("uacdixmxuf", model.services().get("xjcmmzrrsc").jobServiceType());
        Assertions.assertEquals(2084049172, model.services().get("xjcmmzrrsc").port());
        Assertions.assertEquals("qg", model.services().get("xjcmmzrrsc").properties().get("kfnozoeoqbvj"));
        Assertions.assertEquals("uttdiygbp", model.environmentId());
        Assertions.assertEquals("swmtxk", model.environmentVariables().get("ctwwgzw"));
        Assertions.assertEquals("vne", model.outputs().get("zaifghtmoqqtlff").description());
        Assertions.assertEquals(339434421, model.resources().instanceCount());
        Assertions.assertEquals("nur", model.resources().instanceType());
        Assertions.assertEquals("kzyaup", model.resources().dockerArgs());
        Assertions.assertEquals("ccxnafbwqroohtuo", model.resources().shmSize());
        Assertions.assertEquals(LogVerbosity.DEBUG, model.taskDetails().logVerbosity());
        Assertions.assertEquals("aoaguhicqlli", model.taskDetails().targetColumnName());
        Assertions.assertEquals("vhrweftkwqejpmv", model.taskDetails().trainingData().description());
        Assertions.assertEquals(InputDeliveryMode.EVAL_MOUNT, model.taskDetails().trainingData().mode());
        Assertions.assertEquals("ac", model.taskDetails().trainingData().uri());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
