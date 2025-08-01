/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.anduril.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PowerSourcePowerStatus {
    POWER_STATUS_INVALID("POWER_STATUS_INVALID"),

    POWER_STATUS_UNKNOWN("POWER_STATUS_UNKNOWN"),

    POWER_STATUS_NOT_PRESENT("POWER_STATUS_NOT_PRESENT"),

    POWER_STATUS_OPERATING("POWER_STATUS_OPERATING"),

    POWER_STATUS_DISABLED("POWER_STATUS_DISABLED"),

    POWER_STATUS_ERROR("POWER_STATUS_ERROR");

    private final String value;

    PowerSourcePowerStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
