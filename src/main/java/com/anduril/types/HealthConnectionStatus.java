/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.anduril.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum HealthConnectionStatus {
    CONNECTION_STATUS_INVALID("CONNECTION_STATUS_INVALID"),

    CONNECTION_STATUS_ONLINE("CONNECTION_STATUS_ONLINE"),

    CONNECTION_STATUS_OFFLINE("CONNECTION_STATUS_OFFLINE");

    private final String value;

    HealthConnectionStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
