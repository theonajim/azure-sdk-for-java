// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.timezone.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/** Details in effect at the local time. */
@Immutable
public final class ReferenceTime {
    /*
     * Time zone name in effect at the reference timestamp (i.e. PST or PDT
     * depending whether Daylight Savings Time is in effect).
     */
    @JsonProperty(value = "Tag", access = JsonProperty.Access.WRITE_ONLY)
    private String tag;

    /*
     * UTC offset in effect at the `ReferenceUTCTimestamp`.
     */
    @JsonProperty(value = "StandardOffset", access = JsonProperty.Access.WRITE_ONLY)
    private String standardOffset;

    /*
     * Time saving in minutes in effect at the `ReferenceUTCTimestamp`.
     */
    @JsonProperty(value = "DaylightSavings", access = JsonProperty.Access.WRITE_ONLY)
    private String daylightSavings;

    /*
     * Current wall time at the given time zone as shown in the `Tag` property.
     */
    @JsonProperty(value = "WallTime", access = JsonProperty.Access.WRITE_ONLY)
    private String wallTime;

    /*
     * The year this POSIX string is valid for. Note: A POSIX string will only
     * be valid in the given year.
     */
    @JsonProperty(value = "PosixTzValidYear", access = JsonProperty.Access.WRITE_ONLY)
    private Integer posixTzValidYear;

    /*
     * POSIX string used to set the time zone environment variable.
     */
    @JsonProperty(value = "PosixTz", access = JsonProperty.Access.WRITE_ONLY)
    private String posixTz;

    /*
     * Sunrise at the given time zone as shown in the `Tag` property. The
     * sunrise is described in the ISO8601 format. (Only be populated if the
     * call is byCoordinates)
     */
    @JsonProperty(value = "Sunrise", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime sunrise;

    /*
     * Sunset at the given time zone as shown in the `Tag` property. The sunset
     * is described in the ISO8601 format.(Only be populated if the call is
     * byCoordinates)
     */
    @JsonProperty(value = "Sunset", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime sunset;

    /** ReferenceTime constructor */
    private ReferenceTime() {}

    /**
     * ReferenceTime constructor
     *
     * @param daylightSavings daylightSavings Time saving in minutes in effect at the `ReferenceUTCTimestamp`.
     * @param standardOffset UTC offset in effect at the `ReferenceUTCTimestamp`.
     */
    private ReferenceTime(ZoneOffset daylightSavings, ZoneOffset standardOffset) {
        this.daylightSavings = daylightSavings.toString();
        this.standardOffset = standardOffset.toString();
    }

    /**
     * Get the tag property: Time zone name in effect at the reference timestamp (i.e. PST or PDT depending whether
     * Daylight Savings Time is in effect).
     *
     * @return the tag value.
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * Get the posixTzValidYear property: The year this POSIX string is valid for. Note: A POSIX string will only be
     * valid in the given year.
     *
     * @return the posixTzValidYear value.
     */
    public Integer getPosixTzValidYear() {
        return this.posixTzValidYear;
    }

    /**
     * Get the posixTz property: POSIX string used to set the time zone environment variable.
     *
     * @return the posixTz value.
     */
    public String getPosixTz() {
        return this.posixTz;
    }

    /**
     * Get the sunrise property: Sunrise at the given time zone as shown in the `Tag` property. The sunrise is described
     * in the ISO8601 format. (Only be populated if the call is byCoordinates).
     *
     * @return the sunrise value.
     */
    public OffsetDateTime getSunrise() {
        return this.sunrise;
    }

    /**
     * Get the sunset property: Sunset at the given time zone as shown in the `Tag` property. The sunset is described in
     * the ISO8601 format.(Only be populated if the call is byCoordinates).
     *
     * @return the sunset value.
     */
    public OffsetDateTime getSunset() {
        return this.sunset;
    }

    /**
     * Get the standard offset.
     *
     * @return Returns a {@link ZoneOffset} time offset.
     */
    public ZoneOffset getStandardOffset() {
        if (standardOffset.charAt(0) != '+' && standardOffset.charAt(0) != '-') {
            standardOffset = "+" + standardOffset;
        }
        return ZoneOffset.of(standardOffset);
    }

    /**
     * Returns the daylight savings value
     *
     * @return Returns a {@link ZoneOffset} daylight savings. Get the daylightSavings property: Time saving in minutes
     *     in effect at the `ReferenceUTCTimestamp.
     */
    public ZoneOffset getDaylightSavings() {
        if (daylightSavings.charAt(0) != '+' && daylightSavings.charAt(0) != '-') {
            daylightSavings = "+" + daylightSavings;
        }
        return ZoneOffset.of(daylightSavings);
    }

    /**
     * Returns the wall time
     *
     * @return Returns a {@link OffsetDateTime} offset date time.
     */
    public OffsetDateTime getWallTime() {
        return OffsetDateTime.parse(wallTime);
    }
}
