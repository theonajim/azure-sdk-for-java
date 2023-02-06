// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deploymentmanager.models.DeploymentMode;
import com.azure.resourcemanager.deploymentmanager.models.RolloutStep;
import com.azure.resourcemanager.deploymentmanager.models.ServiceUnit;
import com.azure.resourcemanager.deploymentmanager.models.ServiceUnitArtifacts;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ServiceUnitTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceUnit model =
            BinaryData
                .fromString(
                    "{\"name\":\"y\",\"steps\":[{\"name\":\"vkwlzuvccfwnf\",\"status\":\"acfi\",\"stepGroup\":\"l\",\"operationInfo\":{\"deploymentName\":\"etqgtzxdpnq\",\"correlationId\":\"qwxrjfeallnw\",\"startTime\":\"2021-09-26T11:55:16Z\",\"endTime\":\"2021-03-05T06:08:28Z\",\"lastUpdatedTime\":\"2021-07-20T03:53:27Z\"},\"resourceOperations\":[],\"messages\":[]},{\"name\":\"gnzscxaqwo\",\"status\":\"hcbonqvpkvlr\",\"stepGroup\":\"jease\",\"operationInfo\":{\"deploymentName\":\"eo\",\"correlationId\":\"okeyyienj\",\"startTime\":\"2021-04-10T02:54:21Z\",\"endTime\":\"2021-10-26T11:35:52Z\",\"lastUpdatedTime\":\"2021-11-01T19:43:22Z\"},\"resourceOperations\":[],\"messages\":[]},{\"name\":\"jumasx\",\"status\":\"jpqyegu\",\"stepGroup\":\"hb\",\"operationInfo\":{\"deploymentName\":\"e\",\"correlationId\":\"zzvdudgwds\",\"startTime\":\"2021-10-12T16:16:59Z\",\"endTime\":\"2021-04-13T10:18:16Z\",\"lastUpdatedTime\":\"2021-01-22T04:20:18Z\"},\"resourceOperations\":[],\"messages\":[]},{\"name\":\"lbjnpgacftadehx\",\"status\":\"tyfsoppusuesn\",\"stepGroup\":\"dejbavo\",\"operationInfo\":{\"deploymentName\":\"dmoh\",\"correlationId\":\"bqvudwxdndn\",\"startTime\":\"2021-04-03T23:08:08Z\",\"endTime\":\"2021-02-13T18:55:04Z\",\"lastUpdatedTime\":\"2021-04-01T22:15:23Z\"},\"resourceOperations\":[],\"messages\":[]}],\"targetResourceGroup\":\"cglhslazjdyggdt\",\"deploymentMode\":\"Complete\",\"artifacts\":{\"templateUri\":\"b\",\"parametersUri\":\"ofqweykhmenevfye\",\"templateArtifactSourceRelativePath\":\"whybcib\",\"parametersArtifactSourceRelativePath\":\"vdcsitynn\"}}")
                .toObject(ServiceUnit.class);
        Assertions.assertEquals("cglhslazjdyggdt", model.targetResourceGroup());
        Assertions.assertEquals(DeploymentMode.COMPLETE, model.deploymentMode());
        Assertions.assertEquals("b", model.artifacts().templateUri());
        Assertions.assertEquals("ofqweykhmenevfye", model.artifacts().parametersUri());
        Assertions.assertEquals("whybcib", model.artifacts().templateArtifactSourceRelativePath());
        Assertions.assertEquals("vdcsitynn", model.artifacts().parametersArtifactSourceRelativePath());
        Assertions.assertEquals("y", model.name());
        Assertions.assertEquals("vkwlzuvccfwnf", model.steps().get(0).name());
        Assertions.assertEquals("l", model.steps().get(0).stepGroup());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceUnit model =
            new ServiceUnit()
                .withTargetResourceGroup("cglhslazjdyggdt")
                .withDeploymentMode(DeploymentMode.COMPLETE)
                .withArtifacts(
                    new ServiceUnitArtifacts()
                        .withTemplateUri("b")
                        .withParametersUri("ofqweykhmenevfye")
                        .withTemplateArtifactSourceRelativePath("whybcib")
                        .withParametersArtifactSourceRelativePath("vdcsitynn"))
                .withName("y")
                .withSteps(
                    Arrays
                        .asList(
                            new RolloutStep().withName("vkwlzuvccfwnf").withStepGroup("l"),
                            new RolloutStep().withName("gnzscxaqwo").withStepGroup("jease"),
                            new RolloutStep().withName("jumasx").withStepGroup("hb"),
                            new RolloutStep().withName("lbjnpgacftadehx").withStepGroup("dejbavo")));
        model = BinaryData.fromObject(model).toObject(ServiceUnit.class);
        Assertions.assertEquals("cglhslazjdyggdt", model.targetResourceGroup());
        Assertions.assertEquals(DeploymentMode.COMPLETE, model.deploymentMode());
        Assertions.assertEquals("b", model.artifacts().templateUri());
        Assertions.assertEquals("ofqweykhmenevfye", model.artifacts().parametersUri());
        Assertions.assertEquals("whybcib", model.artifacts().templateArtifactSourceRelativePath());
        Assertions.assertEquals("vdcsitynn", model.artifacts().parametersArtifactSourceRelativePath());
        Assertions.assertEquals("y", model.name());
        Assertions.assertEquals("vkwlzuvccfwnf", model.steps().get(0).name());
        Assertions.assertEquals("l", model.steps().get(0).stepGroup());
    }
}
