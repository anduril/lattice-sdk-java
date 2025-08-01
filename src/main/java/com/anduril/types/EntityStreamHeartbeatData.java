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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = EntityStreamHeartbeatData.Builder.class)
public final class EntityStreamHeartbeatData {
    private final Optional<OffsetDateTime> timestamp;

    private final Map<String, Object> additionalProperties;

    private EntityStreamHeartbeatData(Optional<OffsetDateTime> timestamp, Map<String, Object> additionalProperties) {
        this.timestamp = timestamp;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return timestamp of the heartbeat
     */
    @JsonProperty("timestamp")
    public Optional<OffsetDateTime> getTimestamp() {
        return timestamp;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EntityStreamHeartbeatData && equalTo((EntityStreamHeartbeatData) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EntityStreamHeartbeatData other) {
        return timestamp.equals(other.timestamp);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.timestamp);
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
        private Optional<OffsetDateTime> timestamp = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(EntityStreamHeartbeatData other) {
            timestamp(other.getTimestamp());
            return this;
        }

        /**
         * <p>timestamp of the heartbeat</p>
         */
        @JsonSetter(value = "timestamp", nulls = Nulls.SKIP)
        public Builder timestamp(Optional<OffsetDateTime> timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder timestamp(OffsetDateTime timestamp) {
            this.timestamp = Optional.ofNullable(timestamp);
            return this;
        }

        public EntityStreamHeartbeatData build() {
            return new EntityStreamHeartbeatData(timestamp, additionalProperties);
        }
    }
}
