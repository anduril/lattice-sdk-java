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
@JsonDeserialize(builder = Measurement.Builder.class)
public final class Measurement {
    private final Optional<Double> value;

    private final Optional<Double> sigma;

    private final Map<String, Object> additionalProperties;

    private Measurement(Optional<Double> value, Optional<Double> sigma, Map<String, Object> additionalProperties) {
        this.value = value;
        this.sigma = sigma;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The value of the measurement.
     */
    @JsonProperty("value")
    public Optional<Double> getValue() {
        return value;
    }

    /**
     * @return Estimated one standard deviation in same unit as the value.
     */
    @JsonProperty("sigma")
    public Optional<Double> getSigma() {
        return sigma;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Measurement && equalTo((Measurement) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Measurement other) {
        return value.equals(other.value) && sigma.equals(other.sigma);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.value, this.sigma);
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
        private Optional<Double> value = Optional.empty();

        private Optional<Double> sigma = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(Measurement other) {
            value(other.getValue());
            sigma(other.getSigma());
            return this;
        }

        /**
         * <p>The value of the measurement.</p>
         */
        @JsonSetter(value = "value", nulls = Nulls.SKIP)
        public Builder value(Optional<Double> value) {
            this.value = value;
            return this;
        }

        public Builder value(Double value) {
            this.value = Optional.ofNullable(value);
            return this;
        }

        /**
         * <p>Estimated one standard deviation in same unit as the value.</p>
         */
        @JsonSetter(value = "sigma", nulls = Nulls.SKIP)
        public Builder sigma(Optional<Double> sigma) {
            this.sigma = sigma;
            return this;
        }

        public Builder sigma(Double sigma) {
            this.sigma = Optional.ofNullable(sigma);
            return this;
        }

        public Measurement build() {
            return new Measurement(value, sigma, additionalProperties);
        }
    }
}
