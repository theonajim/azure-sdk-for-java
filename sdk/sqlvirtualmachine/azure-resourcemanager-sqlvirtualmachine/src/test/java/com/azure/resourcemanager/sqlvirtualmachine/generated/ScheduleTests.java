// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sqlvirtualmachine.models.AssessmentDayOfWeek;
import com.azure.resourcemanager.sqlvirtualmachine.models.Schedule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ScheduleTests {
    @Test
    public void testDeserialize() {
        Schedule model =
            BinaryData
                .fromString(
                    "{\"enable\":false,\"weeklyInterval\":945771375,\"monthlyOccurrence\":2032893006,\"dayOfWeek\":\"Monday\",\"startTime\":\"na\"}")
                .toObject(Schedule.class);
        Assertions.assertEquals(false, model.enable());
        Assertions.assertEquals(945771375, model.weeklyInterval());
        Assertions.assertEquals(2032893006, model.monthlyOccurrence());
        Assertions.assertEquals(AssessmentDayOfWeek.MONDAY, model.dayOfWeek());
        Assertions.assertEquals("na", model.startTime());
    }

    @Test
    public void testSerialize() {
        Schedule model =
            new Schedule()
                .withEnable(false)
                .withWeeklyInterval(945771375)
                .withMonthlyOccurrence(2032893006)
                .withDayOfWeek(AssessmentDayOfWeek.MONDAY)
                .withStartTime("na");
        model = BinaryData.fromObject(model).toObject(Schedule.class);
        Assertions.assertEquals(false, model.enable());
        Assertions.assertEquals(945771375, model.weeklyInterval());
        Assertions.assertEquals(2032893006, model.monthlyOccurrence());
        Assertions.assertEquals(AssessmentDayOfWeek.MONDAY, model.dayOfWeek());
        Assertions.assertEquals("na", model.startTime());
    }
}
