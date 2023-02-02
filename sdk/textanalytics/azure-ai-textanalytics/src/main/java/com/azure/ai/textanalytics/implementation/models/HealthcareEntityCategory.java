// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Healthcare Entity Category. */
public final class HealthcareEntityCategory extends ExpandableStringEnum<HealthcareEntityCategory> {
    /** Static value BodyStructure for HealthcareEntityCategory. */
    public static final HealthcareEntityCategory BODY_STRUCTURE = fromString("BodyStructure");

    /** Static value Age for HealthcareEntityCategory. */
    public static final HealthcareEntityCategory AGE = fromString("Age");

    /** Static value Gender for HealthcareEntityCategory. */
    public static final HealthcareEntityCategory GENDER = fromString("Gender");

    /** Static value ExaminationName for HealthcareEntityCategory. */
    public static final HealthcareEntityCategory EXAMINATION_NAME = fromString("ExaminationName");

    /** Static value Date for HealthcareEntityCategory. */
    public static final HealthcareEntityCategory DATE = fromString("Date");

    /** Static value Direction for HealthcareEntityCategory. */
    public static final HealthcareEntityCategory DIRECTION = fromString("Direction");

    /** Static value Frequency for HealthcareEntityCategory. */
    public static final HealthcareEntityCategory FREQUENCY = fromString("Frequency");

    /** Static value MeasurementValue for HealthcareEntityCategory. */
    public static final HealthcareEntityCategory MEASUREMENT_VALUE = fromString("MeasurementValue");

    /** Static value MeasurementUnit for HealthcareEntityCategory. */
    public static final HealthcareEntityCategory MEASUREMENT_UNIT = fromString("MeasurementUnit");

    /** Static value RelationalOperator for HealthcareEntityCategory. */
    public static final HealthcareEntityCategory RELATIONAL_OPERATOR = fromString("RelationalOperator");

    /** Static value Time for HealthcareEntityCategory. */
    public static final HealthcareEntityCategory TIME = fromString("Time");

    /** Static value GeneOrProtein for HealthcareEntityCategory. */
    public static final HealthcareEntityCategory GENE_OR_PROTEIN = fromString("GeneOrProtein");

    /** Static value Variant for HealthcareEntityCategory. */
    public static final HealthcareEntityCategory VARIANT = fromString("Variant");

    /** Static value AdministrativeEvent for HealthcareEntityCategory. */
    public static final HealthcareEntityCategory ADMINISTRATIVE_EVENT = fromString("AdministrativeEvent");

    /** Static value CareEnvironment for HealthcareEntityCategory. */
    public static final HealthcareEntityCategory CARE_ENVIRONMENT = fromString("CareEnvironment");

    /** Static value HealthcareProfession for HealthcareEntityCategory. */
    public static final HealthcareEntityCategory HEALTHCARE_PROFESSION = fromString("HealthcareProfession");

    /** Static value Diagnosis for HealthcareEntityCategory. */
    public static final HealthcareEntityCategory DIAGNOSIS = fromString("Diagnosis");

    /** Static value SymptomOrSign for HealthcareEntityCategory. */
    public static final HealthcareEntityCategory SYMPTOM_OR_SIGN = fromString("SymptomOrSign");

    /** Static value ConditionQualifier for HealthcareEntityCategory. */
    public static final HealthcareEntityCategory CONDITION_QUALIFIER = fromString("ConditionQualifier");

    /** Static value MedicationClass for HealthcareEntityCategory. */
    public static final HealthcareEntityCategory MEDICATION_CLASS = fromString("MedicationClass");

    /** Static value MedicationName for HealthcareEntityCategory. */
    public static final HealthcareEntityCategory MEDICATION_NAME = fromString("MedicationName");

    /** Static value Dosage for HealthcareEntityCategory. */
    public static final HealthcareEntityCategory DOSAGE = fromString("Dosage");

    /** Static value MedicationForm for HealthcareEntityCategory. */
    public static final HealthcareEntityCategory MEDICATION_FORM = fromString("MedicationForm");

    /** Static value MedicationRoute for HealthcareEntityCategory. */
    public static final HealthcareEntityCategory MEDICATION_ROUTE = fromString("MedicationRoute");

    /** Static value FamilyRelation for HealthcareEntityCategory. */
    public static final HealthcareEntityCategory FAMILY_RELATION = fromString("FamilyRelation");

    /** Static value TreatmentName for HealthcareEntityCategory. */
    public static final HealthcareEntityCategory TREATMENT_NAME = fromString("TreatmentName");

    /**
     * Creates or finds a HealthcareEntityCategory from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HealthcareEntityCategory.
     */
    @JsonCreator
    public static HealthcareEntityCategory fromString(String name) {
        return fromString(name, HealthcareEntityCategory.class);
    }

    /**
     * Gets known HealthcareEntityCategory values.
     *
     * @return known HealthcareEntityCategory values.
     */
    public static Collection<HealthcareEntityCategory> values() {
        return values(HealthcareEntityCategory.class);
    }
}
