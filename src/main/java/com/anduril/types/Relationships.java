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
@JsonDeserialize(builder = Relationships.Builder.class)
public final class Relationships {
    private final Optional<List<Relationship>> relationships;

    private final Map<String, Object> additionalProperties;

    private Relationships(Optional<List<Relationship>> relationships, Map<String, Object> additionalProperties) {
        this.relationships = relationships;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("relationships")
    public Optional<List<Relationship>> getRelationships() {
        return relationships;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Relationships && equalTo((Relationships) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Relationships other) {
        return relationships.equals(other.relationships);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.relationships);
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
        private Optional<List<Relationship>> relationships = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(Relationships other) {
            relationships(other.getRelationships());
            return this;
        }

        @JsonSetter(value = "relationships", nulls = Nulls.SKIP)
        public Builder relationships(Optional<List<Relationship>> relationships) {
            this.relationships = relationships;
            return this;
        }

        public Builder relationships(List<Relationship> relationships) {
            this.relationships = Optional.ofNullable(relationships);
            return this;
        }

        public Relationships build() {
            return new Relationships(relationships, additionalProperties);
        }
    }
}
