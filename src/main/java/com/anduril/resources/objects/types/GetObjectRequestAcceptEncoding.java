/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.anduril.resources.objects.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum GetObjectRequestAcceptEncoding {
    IDENTITY("identity"),

    ZSTD("zstd");

    private final String value;

    GetObjectRequestAcceptEncoding(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
