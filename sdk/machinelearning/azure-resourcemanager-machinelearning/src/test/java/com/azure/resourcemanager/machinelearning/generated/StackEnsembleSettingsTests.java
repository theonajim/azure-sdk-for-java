// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.StackEnsembleSettings;
import com.azure.resourcemanager.machinelearning.models.StackMetaLearnerType;
import org.junit.jupiter.api.Assertions;

public final class StackEnsembleSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StackEnsembleSettings model =
            BinaryData
                .fromString(
                    "{\"stackMetaLearnerKWargs\":\"datandlqvtwknvgmmbu\",\"stackMetaLearnerTrainPercentage\":7.642157888085865,\"stackMetaLearnerType\":\"LogisticRegression\"}")
                .toObject(StackEnsembleSettings.class);
        Assertions.assertEquals(7.642157888085865D, model.stackMetaLearnerTrainPercentage());
        Assertions.assertEquals(StackMetaLearnerType.LOGISTIC_REGRESSION, model.stackMetaLearnerType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StackEnsembleSettings model =
            new StackEnsembleSettings()
                .withStackMetaLearnerKWargs("datandlqvtwknvgmmbu")
                .withStackMetaLearnerTrainPercentage(7.642157888085865D)
                .withStackMetaLearnerType(StackMetaLearnerType.LOGISTIC_REGRESSION);
        model = BinaryData.fromObject(model).toObject(StackEnsembleSettings.class);
        Assertions.assertEquals(7.642157888085865D, model.stackMetaLearnerTrainPercentage());
        Assertions.assertEquals(StackMetaLearnerType.LOGISTIC_REGRESSION, model.stackMetaLearnerType());
    }
}
