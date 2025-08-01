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
@JsonDeserialize(builder = OrbitMeanElements.Builder.class)
public final class OrbitMeanElements {
    private final Optional<OrbitMeanElementsMetadata> metadata;

    private final Optional<MeanKeplerianElements> meanKeplerianElements;

    private final Optional<TleParameters> tleParameters;

    private final Map<String, Object> additionalProperties;

    private OrbitMeanElements(
            Optional<OrbitMeanElementsMetadata> metadata,
            Optional<MeanKeplerianElements> meanKeplerianElements,
            Optional<TleParameters> tleParameters,
            Map<String, Object> additionalProperties) {
        this.metadata = metadata;
        this.meanKeplerianElements = meanKeplerianElements;
        this.tleParameters = tleParameters;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("metadata")
    public Optional<OrbitMeanElementsMetadata> getMetadata() {
        return metadata;
    }

    @JsonProperty("meanKeplerianElements")
    public Optional<MeanKeplerianElements> getMeanKeplerianElements() {
        return meanKeplerianElements;
    }

    @JsonProperty("tleParameters")
    public Optional<TleParameters> getTleParameters() {
        return tleParameters;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof OrbitMeanElements && equalTo((OrbitMeanElements) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(OrbitMeanElements other) {
        return metadata.equals(other.metadata)
                && meanKeplerianElements.equals(other.meanKeplerianElements)
                && tleParameters.equals(other.tleParameters);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.metadata, this.meanKeplerianElements, this.tleParameters);
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
        private Optional<OrbitMeanElementsMetadata> metadata = Optional.empty();

        private Optional<MeanKeplerianElements> meanKeplerianElements = Optional.empty();

        private Optional<TleParameters> tleParameters = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(OrbitMeanElements other) {
            metadata(other.getMetadata());
            meanKeplerianElements(other.getMeanKeplerianElements());
            tleParameters(other.getTleParameters());
            return this;
        }

        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public Builder metadata(Optional<OrbitMeanElementsMetadata> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(OrbitMeanElementsMetadata metadata) {
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        @JsonSetter(value = "meanKeplerianElements", nulls = Nulls.SKIP)
        public Builder meanKeplerianElements(Optional<MeanKeplerianElements> meanKeplerianElements) {
            this.meanKeplerianElements = meanKeplerianElements;
            return this;
        }

        public Builder meanKeplerianElements(MeanKeplerianElements meanKeplerianElements) {
            this.meanKeplerianElements = Optional.ofNullable(meanKeplerianElements);
            return this;
        }

        @JsonSetter(value = "tleParameters", nulls = Nulls.SKIP)
        public Builder tleParameters(Optional<TleParameters> tleParameters) {
            this.tleParameters = tleParameters;
            return this;
        }

        public Builder tleParameters(TleParameters tleParameters) {
            this.tleParameters = Optional.ofNullable(tleParameters);
            return this;
        }

        public OrbitMeanElements build() {
            return new OrbitMeanElements(metadata, meanKeplerianElements, tleParameters, additionalProperties);
        }
    }
}
