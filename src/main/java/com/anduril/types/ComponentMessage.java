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
@JsonDeserialize(builder = ComponentMessage.Builder.class)
public final class ComponentMessage {
    private final Optional<ComponentMessageStatus> status;

    private final Optional<String> message;

    private final Map<String, Object> additionalProperties;

    private ComponentMessage(
            Optional<ComponentMessageStatus> status,
            Optional<String> message,
            Map<String, Object> additionalProperties) {
        this.status = status;
        this.message = message;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The status associated with this message.
     */
    @JsonProperty("status")
    public Optional<ComponentMessageStatus> getStatus() {
        return status;
    }

    /**
     * @return The human-readable content of the message.
     */
    @JsonProperty("message")
    public Optional<String> getMessage() {
        return message;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ComponentMessage && equalTo((ComponentMessage) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ComponentMessage other) {
        return status.equals(other.status) && message.equals(other.message);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.status, this.message);
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
        private Optional<ComponentMessageStatus> status = Optional.empty();

        private Optional<String> message = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ComponentMessage other) {
            status(other.getStatus());
            message(other.getMessage());
            return this;
        }

        /**
         * <p>The status associated with this message.</p>
         */
        @JsonSetter(value = "status", nulls = Nulls.SKIP)
        public Builder status(Optional<ComponentMessageStatus> status) {
            this.status = status;
            return this;
        }

        public Builder status(ComponentMessageStatus status) {
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * <p>The human-readable content of the message.</p>
         */
        @JsonSetter(value = "message", nulls = Nulls.SKIP)
        public Builder message(Optional<String> message) {
            this.message = message;
            return this;
        }

        public Builder message(String message) {
            this.message = Optional.ofNullable(message);
            return this;
        }

        public ComponentMessage build() {
            return new ComponentMessage(status, message, additionalProperties);
        }
    }
}
