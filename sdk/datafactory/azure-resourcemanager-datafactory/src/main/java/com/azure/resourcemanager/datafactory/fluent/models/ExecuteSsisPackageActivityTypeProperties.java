// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.SsisExecutionCredential;
import com.azure.resourcemanager.datafactory.models.SsisExecutionParameter;
import com.azure.resourcemanager.datafactory.models.SsisLogLocation;
import com.azure.resourcemanager.datafactory.models.SsisPackageLocation;
import com.azure.resourcemanager.datafactory.models.SsisPropertyOverride;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Execute SSIS package activity properties. */
@Fluent
public final class ExecuteSsisPackageActivityTypeProperties {
    /*
     * SSIS package location.
     */
    @JsonProperty(value = "packageLocation", required = true)
    private SsisPackageLocation packageLocation;

    /*
     * Specifies the runtime to execute SSIS package. The value should be "x86" or "x64". Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "runtime")
    private Object runtime;

    /*
     * The logging level of SSIS package execution. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "loggingLevel")
    private Object loggingLevel;

    /*
     * The environment path to execute the SSIS package. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "environmentPath")
    private Object environmentPath;

    /*
     * The package execution credential.
     */
    @JsonProperty(value = "executionCredential")
    private SsisExecutionCredential executionCredential;

    /*
     * The integration runtime reference.
     */
    @JsonProperty(value = "connectVia", required = true)
    private IntegrationRuntimeReference connectVia;

    /*
     * The project level parameters to execute the SSIS package.
     */
    @JsonProperty(value = "projectParameters")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, SsisExecutionParameter> projectParameters;

    /*
     * The package level parameters to execute the SSIS package.
     */
    @JsonProperty(value = "packageParameters")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, SsisExecutionParameter> packageParameters;

    /*
     * The project level connection managers to execute the SSIS package.
     */
    @JsonProperty(value = "projectConnectionManagers")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Map<String, SsisExecutionParameter>> projectConnectionManagers;

    /*
     * The package level connection managers to execute the SSIS package.
     */
    @JsonProperty(value = "packageConnectionManagers")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Map<String, SsisExecutionParameter>> packageConnectionManagers;

    /*
     * The property overrides to execute the SSIS package.
     */
    @JsonProperty(value = "propertyOverrides")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, SsisPropertyOverride> propertyOverrides;

    /*
     * SSIS package execution log location.
     */
    @JsonProperty(value = "logLocation")
    private SsisLogLocation logLocation;

    /**
     * Get the packageLocation property: SSIS package location.
     *
     * @return the packageLocation value.
     */
    public SsisPackageLocation packageLocation() {
        return this.packageLocation;
    }

    /**
     * Set the packageLocation property: SSIS package location.
     *
     * @param packageLocation the packageLocation value to set.
     * @return the ExecuteSsisPackageActivityTypeProperties object itself.
     */
    public ExecuteSsisPackageActivityTypeProperties withPackageLocation(SsisPackageLocation packageLocation) {
        this.packageLocation = packageLocation;
        return this;
    }

    /**
     * Get the runtime property: Specifies the runtime to execute SSIS package. The value should be "x86" or "x64".
     * Type: string (or Expression with resultType string).
     *
     * @return the runtime value.
     */
    public Object runtime() {
        return this.runtime;
    }

    /**
     * Set the runtime property: Specifies the runtime to execute SSIS package. The value should be "x86" or "x64".
     * Type: string (or Expression with resultType string).
     *
     * @param runtime the runtime value to set.
     * @return the ExecuteSsisPackageActivityTypeProperties object itself.
     */
    public ExecuteSsisPackageActivityTypeProperties withRuntime(Object runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * Get the loggingLevel property: The logging level of SSIS package execution. Type: string (or Expression with
     * resultType string).
     *
     * @return the loggingLevel value.
     */
    public Object loggingLevel() {
        return this.loggingLevel;
    }

    /**
     * Set the loggingLevel property: The logging level of SSIS package execution. Type: string (or Expression with
     * resultType string).
     *
     * @param loggingLevel the loggingLevel value to set.
     * @return the ExecuteSsisPackageActivityTypeProperties object itself.
     */
    public ExecuteSsisPackageActivityTypeProperties withLoggingLevel(Object loggingLevel) {
        this.loggingLevel = loggingLevel;
        return this;
    }

    /**
     * Get the environmentPath property: The environment path to execute the SSIS package. Type: string (or Expression
     * with resultType string).
     *
     * @return the environmentPath value.
     */
    public Object environmentPath() {
        return this.environmentPath;
    }

    /**
     * Set the environmentPath property: The environment path to execute the SSIS package. Type: string (or Expression
     * with resultType string).
     *
     * @param environmentPath the environmentPath value to set.
     * @return the ExecuteSsisPackageActivityTypeProperties object itself.
     */
    public ExecuteSsisPackageActivityTypeProperties withEnvironmentPath(Object environmentPath) {
        this.environmentPath = environmentPath;
        return this;
    }

    /**
     * Get the executionCredential property: The package execution credential.
     *
     * @return the executionCredential value.
     */
    public SsisExecutionCredential executionCredential() {
        return this.executionCredential;
    }

    /**
     * Set the executionCredential property: The package execution credential.
     *
     * @param executionCredential the executionCredential value to set.
     * @return the ExecuteSsisPackageActivityTypeProperties object itself.
     */
    public ExecuteSsisPackageActivityTypeProperties withExecutionCredential(
        SsisExecutionCredential executionCredential) {
        this.executionCredential = executionCredential;
        return this;
    }

    /**
     * Get the connectVia property: The integration runtime reference.
     *
     * @return the connectVia value.
     */
    public IntegrationRuntimeReference connectVia() {
        return this.connectVia;
    }

    /**
     * Set the connectVia property: The integration runtime reference.
     *
     * @param connectVia the connectVia value to set.
     * @return the ExecuteSsisPackageActivityTypeProperties object itself.
     */
    public ExecuteSsisPackageActivityTypeProperties withConnectVia(IntegrationRuntimeReference connectVia) {
        this.connectVia = connectVia;
        return this;
    }

    /**
     * Get the projectParameters property: The project level parameters to execute the SSIS package.
     *
     * @return the projectParameters value.
     */
    public Map<String, SsisExecutionParameter> projectParameters() {
        return this.projectParameters;
    }

    /**
     * Set the projectParameters property: The project level parameters to execute the SSIS package.
     *
     * @param projectParameters the projectParameters value to set.
     * @return the ExecuteSsisPackageActivityTypeProperties object itself.
     */
    public ExecuteSsisPackageActivityTypeProperties withProjectParameters(
        Map<String, SsisExecutionParameter> projectParameters) {
        this.projectParameters = projectParameters;
        return this;
    }

    /**
     * Get the packageParameters property: The package level parameters to execute the SSIS package.
     *
     * @return the packageParameters value.
     */
    public Map<String, SsisExecutionParameter> packageParameters() {
        return this.packageParameters;
    }

    /**
     * Set the packageParameters property: The package level parameters to execute the SSIS package.
     *
     * @param packageParameters the packageParameters value to set.
     * @return the ExecuteSsisPackageActivityTypeProperties object itself.
     */
    public ExecuteSsisPackageActivityTypeProperties withPackageParameters(
        Map<String, SsisExecutionParameter> packageParameters) {
        this.packageParameters = packageParameters;
        return this;
    }

    /**
     * Get the projectConnectionManagers property: The project level connection managers to execute the SSIS package.
     *
     * @return the projectConnectionManagers value.
     */
    public Map<String, Map<String, SsisExecutionParameter>> projectConnectionManagers() {
        return this.projectConnectionManagers;
    }

    /**
     * Set the projectConnectionManagers property: The project level connection managers to execute the SSIS package.
     *
     * @param projectConnectionManagers the projectConnectionManagers value to set.
     * @return the ExecuteSsisPackageActivityTypeProperties object itself.
     */
    public ExecuteSsisPackageActivityTypeProperties withProjectConnectionManagers(
        Map<String, Map<String, SsisExecutionParameter>> projectConnectionManagers) {
        this.projectConnectionManagers = projectConnectionManagers;
        return this;
    }

    /**
     * Get the packageConnectionManagers property: The package level connection managers to execute the SSIS package.
     *
     * @return the packageConnectionManagers value.
     */
    public Map<String, Map<String, SsisExecutionParameter>> packageConnectionManagers() {
        return this.packageConnectionManagers;
    }

    /**
     * Set the packageConnectionManagers property: The package level connection managers to execute the SSIS package.
     *
     * @param packageConnectionManagers the packageConnectionManagers value to set.
     * @return the ExecuteSsisPackageActivityTypeProperties object itself.
     */
    public ExecuteSsisPackageActivityTypeProperties withPackageConnectionManagers(
        Map<String, Map<String, SsisExecutionParameter>> packageConnectionManagers) {
        this.packageConnectionManagers = packageConnectionManagers;
        return this;
    }

    /**
     * Get the propertyOverrides property: The property overrides to execute the SSIS package.
     *
     * @return the propertyOverrides value.
     */
    public Map<String, SsisPropertyOverride> propertyOverrides() {
        return this.propertyOverrides;
    }

    /**
     * Set the propertyOverrides property: The property overrides to execute the SSIS package.
     *
     * @param propertyOverrides the propertyOverrides value to set.
     * @return the ExecuteSsisPackageActivityTypeProperties object itself.
     */
    public ExecuteSsisPackageActivityTypeProperties withPropertyOverrides(
        Map<String, SsisPropertyOverride> propertyOverrides) {
        this.propertyOverrides = propertyOverrides;
        return this;
    }

    /**
     * Get the logLocation property: SSIS package execution log location.
     *
     * @return the logLocation value.
     */
    public SsisLogLocation logLocation() {
        return this.logLocation;
    }

    /**
     * Set the logLocation property: SSIS package execution log location.
     *
     * @param logLocation the logLocation value to set.
     * @return the ExecuteSsisPackageActivityTypeProperties object itself.
     */
    public ExecuteSsisPackageActivityTypeProperties withLogLocation(SsisLogLocation logLocation) {
        this.logLocation = logLocation;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (packageLocation() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property packageLocation in model ExecuteSsisPackageActivityTypeProperties"));
        } else {
            packageLocation().validate();
        }
        if (executionCredential() != null) {
            executionCredential().validate();
        }
        if (connectVia() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property connectVia in model ExecuteSsisPackageActivityTypeProperties"));
        } else {
            connectVia().validate();
        }
        if (projectParameters() != null) {
            projectParameters()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (packageParameters() != null) {
            packageParameters()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (projectConnectionManagers() != null) {
            projectConnectionManagers()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e
                                .values()
                                .forEach(
                                    e1 -> {
                                        if (e1 != null) {
                                            e1.validate();
                                        }
                                    });
                        }
                    });
        }
        if (packageConnectionManagers() != null) {
            packageConnectionManagers()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e
                                .values()
                                .forEach(
                                    e1 -> {
                                        if (e1 != null) {
                                            e1.validate();
                                        }
                                    });
                        }
                    });
        }
        if (propertyOverrides() != null) {
            propertyOverrides()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (logLocation() != null) {
            logLocation().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExecuteSsisPackageActivityTypeProperties.class);
}
