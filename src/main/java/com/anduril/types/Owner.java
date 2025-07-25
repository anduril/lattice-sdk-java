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
@JsonDeserialize(builder = Owner.Builder.class)
public final class Owner {
    private final Optional<String> entityId;

    private final Map<String, Object> additionalProperties;

    private Owner(Optional<String> entityId, Map<String, Object> additionalProperties) {
        this.entityId = entityId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Entity ID of the owner.
     */
    @JsonProperty("entityId")
    public Optional<String> getEntityId() {
        return entityId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Owner && equalTo((Owner) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Owner other) {
        return entityId.equals(other.entityId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.entityId);
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
        private Optional<String> entityId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(Owner other) {
            entityId(other.getEntityId());
            return this;
        }

        /**
         * <p>Entity ID of the owner.</p>
         */
        @JsonSetter(value = "entityId", nulls = Nulls.SKIP)
        public Builder entityId(Optional<String> entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder entityId(String entityId) {
            this.entityId = Optional.ofNullable(entityId);
            return this;
        }

        public Owner build() {
            return new Owner(entityId, additionalProperties);
        }
    }
}
