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
@JsonDeserialize(builder = Relations.Builder.class)
public final class Relations {
    private final Optional<Principal> assignee;

    private final Optional<String> parentTaskId;

    private final Map<String, Object> additionalProperties;

    private Relations(
            Optional<Principal> assignee, Optional<String> parentTaskId, Map<String, Object> additionalProperties) {
        this.assignee = assignee;
        this.parentTaskId = parentTaskId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Who or what, if anyone, this Task is currently assigned to.
     */
    @JsonProperty("assignee")
    public Optional<Principal> getAssignee() {
        return assignee;
    }

    /**
     * @return If this Task is a &quot;sub-Task&quot;, what is its parent, none if empty.
     */
    @JsonProperty("parentTaskId")
    public Optional<String> getParentTaskId() {
        return parentTaskId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Relations && equalTo((Relations) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Relations other) {
        return assignee.equals(other.assignee) && parentTaskId.equals(other.parentTaskId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.assignee, this.parentTaskId);
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
        private Optional<Principal> assignee = Optional.empty();

        private Optional<String> parentTaskId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(Relations other) {
            assignee(other.getAssignee());
            parentTaskId(other.getParentTaskId());
            return this;
        }

        /**
         * <p>Who or what, if anyone, this Task is currently assigned to.</p>
         */
        @JsonSetter(value = "assignee", nulls = Nulls.SKIP)
        public Builder assignee(Optional<Principal> assignee) {
            this.assignee = assignee;
            return this;
        }

        public Builder assignee(Principal assignee) {
            this.assignee = Optional.ofNullable(assignee);
            return this;
        }

        /**
         * <p>If this Task is a &quot;sub-Task&quot;, what is its parent, none if empty.</p>
         */
        @JsonSetter(value = "parentTaskId", nulls = Nulls.SKIP)
        public Builder parentTaskId(Optional<String> parentTaskId) {
            this.parentTaskId = parentTaskId;
            return this;
        }

        public Builder parentTaskId(String parentTaskId) {
            this.parentTaskId = Optional.ofNullable(parentTaskId);
            return this;
        }

        public Relations build() {
            return new Relations(assignee, parentTaskId, additionalProperties);
        }
    }
}
