/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.anduril.types;

import com.anduril.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ScanCharacteristics.Builder.class)
public final class ScanCharacteristics {
    private final Optional<ScanCharacteristicsScanType> scanType;

    private final Optional<Double> scanPeriodS;

    private final Map<String, Object> additionalProperties;

    private ScanCharacteristics(
            Optional<ScanCharacteristicsScanType> scanType,
            Optional<Double> scanPeriodS,
            Map<String, Object> additionalProperties) {
        this.scanType = scanType;
        this.scanPeriodS = scanPeriodS;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("scanType")
    public Optional<ScanCharacteristicsScanType> getScanType() {
        return scanType;
    }

    @JsonProperty("scanPeriodS")
    public Optional<Double> getScanPeriodS() {
        return scanPeriodS;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ScanCharacteristics && equalTo((ScanCharacteristics) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ScanCharacteristics other) {
        return scanType.equals(other.scanType) && scanPeriodS.equals(other.scanPeriodS);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.scanType, this.scanPeriodS);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<ScanCharacteristicsScanType> scanType = Optional.empty();

        private Optional<Double> scanPeriodS = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ScanCharacteristics other) {
            scanType(other.getScanType());
            scanPeriodS(other.getScanPeriodS());
            return this;
        }

        @JsonSetter(value = "scanType", nulls = Nulls.SKIP)
        public Builder scanType(Optional<ScanCharacteristicsScanType> scanType) {
            this.scanType = scanType;
            return this;
        }

        public Builder scanType(ScanCharacteristicsScanType scanType) {
            this.scanType = Optional.ofNullable(scanType);
            return this;
        }

        @JsonSetter(value = "scanPeriodS", nulls = Nulls.SKIP)
        public Builder scanPeriodS(Optional<Double> scanPeriodS) {
            this.scanPeriodS = scanPeriodS;
            return this;
        }

        public Builder scanPeriodS(Double scanPeriodS) {
            this.scanPeriodS = Optional.ofNullable(scanPeriodS);
            return this;
        }

        public ScanCharacteristics build() {
            return new ScanCharacteristics(scanType, scanPeriodS, additionalProperties);
        }
    }
}
