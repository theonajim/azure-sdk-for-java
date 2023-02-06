// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.fluent.models.RulesEngineInner;
import com.azure.resourcemanager.frontdoor.models.MatchProcessingBehavior;
import com.azure.resourcemanager.frontdoor.models.RulesEngineRule;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RulesEngineInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RulesEngineInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"resourceState\":\"Enabled\",\"rules\":[{\"name\":\"q\",\"priority\":567516658,\"matchConditions\":[],\"matchProcessingBehavior\":\"Stop\"},{\"name\":\"rsbfovasrruvw\",\"priority\":2145299291,\"matchConditions\":[],\"matchProcessingBehavior\":\"Stop\"},{\"name\":\"sub\",\"priority\":794984845,\"matchConditions\":[],\"matchProcessingBehavior\":\"Continue\"},{\"name\":\"rxbpyb\",\"priority\":1098405292,\"matchConditions\":[],\"matchProcessingBehavior\":\"Stop\"}]},\"id\":\"fdtwssotft\",\"name\":\"vjz\",\"type\":\"exilzznfqqnvwpmq\"}")
                .toObject(RulesEngineInner.class);
        Assertions.assertEquals("q", model.rules().get(0).name());
        Assertions.assertEquals(567516658, model.rules().get(0).priority());
        Assertions.assertEquals(MatchProcessingBehavior.STOP, model.rules().get(0).matchProcessingBehavior());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RulesEngineInner model =
            new RulesEngineInner()
                .withRules(
                    Arrays
                        .asList(
                            new RulesEngineRule()
                                .withName("q")
                                .withPriority(567516658)
                                .withMatchConditions(Arrays.asList())
                                .withMatchProcessingBehavior(MatchProcessingBehavior.STOP),
                            new RulesEngineRule()
                                .withName("rsbfovasrruvw")
                                .withPriority(2145299291)
                                .withMatchConditions(Arrays.asList())
                                .withMatchProcessingBehavior(MatchProcessingBehavior.STOP),
                            new RulesEngineRule()
                                .withName("sub")
                                .withPriority(794984845)
                                .withMatchConditions(Arrays.asList())
                                .withMatchProcessingBehavior(MatchProcessingBehavior.CONTINUE),
                            new RulesEngineRule()
                                .withName("rxbpyb")
                                .withPriority(1098405292)
                                .withMatchConditions(Arrays.asList())
                                .withMatchProcessingBehavior(MatchProcessingBehavior.STOP)));
        model = BinaryData.fromObject(model).toObject(RulesEngineInner.class);
        Assertions.assertEquals("q", model.rules().get(0).name());
        Assertions.assertEquals(567516658, model.rules().get(0).priority());
        Assertions.assertEquals(MatchProcessingBehavior.STOP, model.rules().get(0).matchProcessingBehavior());
    }
}
