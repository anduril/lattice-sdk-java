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
@JsonDeserialize(builder = GeoPolygonPosition.Builder.class)
public final class GeoPolygonPosition {
    private final Optional<Position> position;

    private final Optional<Float> heightM;

    private final Map<String, Object> additionalProperties;

    private GeoPolygonPosition(
            Optional<Position> position, Optional<Float> heightM, Map<String, Object> additionalProperties) {
        this.position = position;
        this.heightM = heightM;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return base position. if no altitude set, its on the ground.
     */
    @JsonProperty("position")
    public Optional<Position> getPosition() {
        return position;
    }

    /**
     * @return optional height above base position to extrude in meters.
     * for a given polygon, all points should have a height or none of them.
     * strictly GeoJSON compatible polygons will not have this set.
     */
    @JsonProperty("heightM")
    public Optional<Float> getHeightM() {
        return heightM;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GeoPolygonPosition && equalTo((GeoPolygonPosition) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GeoPolygonPosition other) {
        return position.equals(other.position) && heightM.equals(other.heightM);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.position, this.heightM);
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
        private Optional<Position> position = Optional.empty();

        private Optional<Float> heightM = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(GeoPolygonPosition other) {
            position(other.getPosition());
            heightM(other.getHeightM());
            return this;
        }

        /**
         * <p>base position. if no altitude set, its on the ground.</p>
         */
        @JsonSetter(value = "position", nulls = Nulls.SKIP)
        public Builder position(Optional<Position> position) {
            this.position = position;
            return this;
        }

        public Builder position(Position position) {
            this.position = Optional.ofNullable(position);
            return this;
        }

        /**
         * <p>optional height above base position to extrude in meters.
         * for a given polygon, all points should have a height or none of them.
         * strictly GeoJSON compatible polygons will not have this set.</p>
         */
        @JsonSetter(value = "heightM", nulls = Nulls.SKIP)
        public Builder heightM(Optional<Float> heightM) {
            this.heightM = heightM;
            return this;
        }

        public Builder heightM(Float heightM) {
            this.heightM = Optional.ofNullable(heightM);
            return this;
        }

        public GeoPolygonPosition build() {
            return new GeoPolygonPosition(position, heightM, additionalProperties);
        }
    }
}
