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
@JsonDeserialize(builder = HighValueTargetMatch.Builder.class)
public final class HighValueTargetMatch {
    private final Optional<String> highValueTargetListId;

    private final Optional<String> highValueTargetDescriptionId;

    private final Map<String, Object> additionalProperties;

    private HighValueTargetMatch(
            Optional<String> highValueTargetListId,
            Optional<String> highValueTargetDescriptionId,
            Map<String, Object> additionalProperties) {
        this.highValueTargetListId = highValueTargetListId;
        this.highValueTargetDescriptionId = highValueTargetDescriptionId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The ID of the high value target list that matches the target description.
     */
    @JsonProperty("highValueTargetListId")
    public Optional<String> getHighValueTargetListId() {
        return highValueTargetListId;
    }

    /**
     * @return The ID of the specific high value target description within a high value target list that was matched against.
     * The ID is considered to be a globally unique identifier across all high value target IDs.
     */
    @JsonProperty("highValueTargetDescriptionId")
    public Optional<String> getHighValueTargetDescriptionId() {
        return highValueTargetDescriptionId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof HighValueTargetMatch && equalTo((HighValueTargetMatch) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(HighValueTargetMatch other) {
        return highValueTargetListId.equals(other.highValueTargetListId)
                && highValueTargetDescriptionId.equals(other.highValueTargetDescriptionId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.highValueTargetListId, this.highValueTargetDescriptionId);
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
        private Optional<String> highValueTargetListId = Optional.empty();

        private Optional<String> highValueTargetDescriptionId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(HighValueTargetMatch other) {
            highValueTargetListId(other.getHighValueTargetListId());
            highValueTargetDescriptionId(other.getHighValueTargetDescriptionId());
            return this;
        }

        /**
         * <p>The ID of the high value target list that matches the target description.</p>
         */
        @JsonSetter(value = "highValueTargetListId", nulls = Nulls.SKIP)
        public Builder highValueTargetListId(Optional<String> highValueTargetListId) {
            this.highValueTargetListId = highValueTargetListId;
            return this;
        }

        public Builder highValueTargetListId(String highValueTargetListId) {
            this.highValueTargetListId = Optional.ofNullable(highValueTargetListId);
            return this;
        }

        /**
         * <p>The ID of the specific high value target description within a high value target list that was matched against.
         * The ID is considered to be a globally unique identifier across all high value target IDs.</p>
         */
        @JsonSetter(value = "highValueTargetDescriptionId", nulls = Nulls.SKIP)
        public Builder highValueTargetDescriptionId(Optional<String> highValueTargetDescriptionId) {
            this.highValueTargetDescriptionId = highValueTargetDescriptionId;
            return this;
        }

        public Builder highValueTargetDescriptionId(String highValueTargetDescriptionId) {
            this.highValueTargetDescriptionId = Optional.ofNullable(highValueTargetDescriptionId);
            return this;
        }

        public HighValueTargetMatch build() {
            return new HighValueTargetMatch(highValueTargetListId, highValueTargetDescriptionId, additionalProperties);
        }
    }
}
