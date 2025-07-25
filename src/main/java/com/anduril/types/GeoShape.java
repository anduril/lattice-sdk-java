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
@JsonDeserialize(builder = GeoShape.Builder.class)
public final class GeoShape {
    private final Optional<GeoPoint> point;

    private final Optional<GeoLine> line;

    private final Optional<GeoPolygon> polygon;

    private final Optional<GeoEllipse> ellipse;

    private final Optional<GeoEllipsoid> ellipsoid;

    private final Map<String, Object> additionalProperties;

    private GeoShape(
            Optional<GeoPoint> point,
            Optional<GeoLine> line,
            Optional<GeoPolygon> polygon,
            Optional<GeoEllipse> ellipse,
            Optional<GeoEllipsoid> ellipsoid,
            Map<String, Object> additionalProperties) {
        this.point = point;
        this.line = line;
        this.polygon = polygon;
        this.ellipse = ellipse;
        this.ellipsoid = ellipsoid;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("point")
    public Optional<GeoPoint> getPoint() {
        return point;
    }

    @JsonProperty("line")
    public Optional<GeoLine> getLine() {
        return line;
    }

    @JsonProperty("polygon")
    public Optional<GeoPolygon> getPolygon() {
        return polygon;
    }

    @JsonProperty("ellipse")
    public Optional<GeoEllipse> getEllipse() {
        return ellipse;
    }

    @JsonProperty("ellipsoid")
    public Optional<GeoEllipsoid> getEllipsoid() {
        return ellipsoid;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GeoShape && equalTo((GeoShape) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GeoShape other) {
        return point.equals(other.point)
                && line.equals(other.line)
                && polygon.equals(other.polygon)
                && ellipse.equals(other.ellipse)
                && ellipsoid.equals(other.ellipsoid);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.point, this.line, this.polygon, this.ellipse, this.ellipsoid);
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
        private Optional<GeoPoint> point = Optional.empty();

        private Optional<GeoLine> line = Optional.empty();

        private Optional<GeoPolygon> polygon = Optional.empty();

        private Optional<GeoEllipse> ellipse = Optional.empty();

        private Optional<GeoEllipsoid> ellipsoid = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(GeoShape other) {
            point(other.getPoint());
            line(other.getLine());
            polygon(other.getPolygon());
            ellipse(other.getEllipse());
            ellipsoid(other.getEllipsoid());
            return this;
        }

        @JsonSetter(value = "point", nulls = Nulls.SKIP)
        public Builder point(Optional<GeoPoint> point) {
            this.point = point;
            return this;
        }

        public Builder point(GeoPoint point) {
            this.point = Optional.ofNullable(point);
            return this;
        }

        @JsonSetter(value = "line", nulls = Nulls.SKIP)
        public Builder line(Optional<GeoLine> line) {
            this.line = line;
            return this;
        }

        public Builder line(GeoLine line) {
            this.line = Optional.ofNullable(line);
            return this;
        }

        @JsonSetter(value = "polygon", nulls = Nulls.SKIP)
        public Builder polygon(Optional<GeoPolygon> polygon) {
            this.polygon = polygon;
            return this;
        }

        public Builder polygon(GeoPolygon polygon) {
            this.polygon = Optional.ofNullable(polygon);
            return this;
        }

        @JsonSetter(value = "ellipse", nulls = Nulls.SKIP)
        public Builder ellipse(Optional<GeoEllipse> ellipse) {
            this.ellipse = ellipse;
            return this;
        }

        public Builder ellipse(GeoEllipse ellipse) {
            this.ellipse = Optional.ofNullable(ellipse);
            return this;
        }

        @JsonSetter(value = "ellipsoid", nulls = Nulls.SKIP)
        public Builder ellipsoid(Optional<GeoEllipsoid> ellipsoid) {
            this.ellipsoid = ellipsoid;
            return this;
        }

        public Builder ellipsoid(GeoEllipsoid ellipsoid) {
            this.ellipsoid = Optional.ofNullable(ellipsoid);
            return this;
        }

        public GeoShape build() {
            return new GeoShape(point, line, polygon, ellipse, ellipsoid, additionalProperties);
        }
    }
}
