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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = LinearRing.Builder.class)
public final class LinearRing {
    private final Optional<List<GeoPolygonPosition>> positions;

    private final Map<String, Object> additionalProperties;

    private LinearRing(Optional<List<GeoPolygonPosition>> positions, Map<String, Object> additionalProperties) {
        this.positions = positions;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("positions")
    public Optional<List<GeoPolygonPosition>> getPositions() {
        return positions;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LinearRing && equalTo((LinearRing) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(LinearRing other) {
        return positions.equals(other.positions);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.positions);
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
        private Optional<List<GeoPolygonPosition>> positions = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(LinearRing other) {
            positions(other.getPositions());
            return this;
        }

        @JsonSetter(value = "positions", nulls = Nulls.SKIP)
        public Builder positions(Optional<List<GeoPolygonPosition>> positions) {
            this.positions = positions;
            return this;
        }

        public Builder positions(List<GeoPolygonPosition> positions) {
            this.positions = Optional.ofNullable(positions);
            return this;
        }

        public LinearRing build() {
            return new LinearRing(positions, additionalProperties);
        }
    }
}
