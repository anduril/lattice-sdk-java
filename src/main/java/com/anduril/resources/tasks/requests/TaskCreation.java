/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.anduril.resources.tasks.requests;

import com.anduril.core.ObjectMappers;
import com.anduril.types.GoogleProtobufAny;
import com.anduril.types.Principal;
import com.anduril.types.Relations;
import com.anduril.types.TaskEntity;
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
@JsonDeserialize(builder = TaskCreation.Builder.class)
public final class TaskCreation {
    private final Optional<String> taskId;

    private final Optional<String> displayName;

    private final Optional<String> description;

    private final Optional<GoogleProtobufAny> specification;

    private final Optional<Principal> author;

    private final Optional<Relations> relations;

    private final Optional<Boolean> isExecutedElsewhere;

    private final Optional<List<TaskEntity>> initialEntities;

    private final Map<String, Object> additionalProperties;

    private TaskCreation(
            Optional<String> taskId,
            Optional<String> displayName,
            Optional<String> description,
            Optional<GoogleProtobufAny> specification,
            Optional<Principal> author,
            Optional<Relations> relations,
            Optional<Boolean> isExecutedElsewhere,
            Optional<List<TaskEntity>> initialEntities,
            Map<String, Object> additionalProperties) {
        this.taskId = taskId;
        this.displayName = displayName;
        this.description = description;
        this.specification = specification;
        this.author = author;
        this.relations = relations;
        this.isExecutedElsewhere = isExecutedElsewhere;
        this.initialEntities = initialEntities;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return If non-empty, will set the requested Task ID, otherwise will generate a new random
     * GUID. Will reject if supplied Task ID does not match [A-Za-z0-9_-.]{5,36}.
     */
    @JsonProperty("taskId")
    public Optional<String> getTaskId() {
        return taskId;
    }

    /**
     * @return Human readable display name for this Task, should be short (&lt;100 chars).
     */
    @JsonProperty("displayName")
    public Optional<String> getDisplayName() {
        return displayName;
    }

    /**
     * @return Longer, free form human readable description of this Task.
     */
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    /**
     * @return Full set of task parameters.
     */
    @JsonProperty("specification")
    public Optional<GoogleProtobufAny> getSpecification() {
        return specification;
    }

    @JsonProperty("author")
    public Optional<Principal> getAuthor() {
        return author;
    }

    /**
     * @return Any relationships associated with this Task, such as a parent Task or an assignee
     * this Task is designated to for execution.
     */
    @JsonProperty("relations")
    public Optional<Relations> getRelations() {
        return relations;
    }

    /**
     * @return If set, then the service will not trigger execution of this task on an agent. Useful
     * for when ingesting tasks from an external system that is triggering execution of tasks
     * on agents.
     */
    @JsonProperty("isExecutedElsewhere")
    public Optional<Boolean> getIsExecutedElsewhere() {
        return isExecutedElsewhere;
    }

    /**
     * @return Indicates an initial set of entities that can be used to execute an entity aware
     * task. For example, an entity Objective, an entity Keep In Zone, etc.
     */
    @JsonProperty("initialEntities")
    public Optional<List<TaskEntity>> getInitialEntities() {
        return initialEntities;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TaskCreation && equalTo((TaskCreation) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TaskCreation other) {
        return taskId.equals(other.taskId)
                && displayName.equals(other.displayName)
                && description.equals(other.description)
                && specification.equals(other.specification)
                && author.equals(other.author)
                && relations.equals(other.relations)
                && isExecutedElsewhere.equals(other.isExecutedElsewhere)
                && initialEntities.equals(other.initialEntities);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.taskId,
                this.displayName,
                this.description,
                this.specification,
                this.author,
                this.relations,
                this.isExecutedElsewhere,
                this.initialEntities);
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
        private Optional<String> taskId = Optional.empty();

        private Optional<String> displayName = Optional.empty();

        private Optional<String> description = Optional.empty();

        private Optional<GoogleProtobufAny> specification = Optional.empty();

        private Optional<Principal> author = Optional.empty();

        private Optional<Relations> relations = Optional.empty();

        private Optional<Boolean> isExecutedElsewhere = Optional.empty();

        private Optional<List<TaskEntity>> initialEntities = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(TaskCreation other) {
            taskId(other.getTaskId());
            displayName(other.getDisplayName());
            description(other.getDescription());
            specification(other.getSpecification());
            author(other.getAuthor());
            relations(other.getRelations());
            isExecutedElsewhere(other.getIsExecutedElsewhere());
            initialEntities(other.getInitialEntities());
            return this;
        }

        /**
         * <p>If non-empty, will set the requested Task ID, otherwise will generate a new random
         * GUID. Will reject if supplied Task ID does not match [A-Za-z0-9_-.]{5,36}.</p>
         */
        @JsonSetter(value = "taskId", nulls = Nulls.SKIP)
        public Builder taskId(Optional<String> taskId) {
            this.taskId = taskId;
            return this;
        }

        public Builder taskId(String taskId) {
            this.taskId = Optional.ofNullable(taskId);
            return this;
        }

        /**
         * <p>Human readable display name for this Task, should be short (&lt;100 chars).</p>
         */
        @JsonSetter(value = "displayName", nulls = Nulls.SKIP)
        public Builder displayName(Optional<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Optional.ofNullable(displayName);
            return this;
        }

        /**
         * <p>Longer, free form human readable description of this Task.</p>
         */
        @JsonSetter(value = "description", nulls = Nulls.SKIP)
        public Builder description(Optional<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(String description) {
            this.description = Optional.ofNullable(description);
            return this;
        }

        /**
         * <p>Full set of task parameters.</p>
         */
        @JsonSetter(value = "specification", nulls = Nulls.SKIP)
        public Builder specification(Optional<GoogleProtobufAny> specification) {
            this.specification = specification;
            return this;
        }

        public Builder specification(GoogleProtobufAny specification) {
            this.specification = Optional.ofNullable(specification);
            return this;
        }

        @JsonSetter(value = "author", nulls = Nulls.SKIP)
        public Builder author(Optional<Principal> author) {
            this.author = author;
            return this;
        }

        public Builder author(Principal author) {
            this.author = Optional.ofNullable(author);
            return this;
        }

        /**
         * <p>Any relationships associated with this Task, such as a parent Task or an assignee
         * this Task is designated to for execution.</p>
         */
        @JsonSetter(value = "relations", nulls = Nulls.SKIP)
        public Builder relations(Optional<Relations> relations) {
            this.relations = relations;
            return this;
        }

        public Builder relations(Relations relations) {
            this.relations = Optional.ofNullable(relations);
            return this;
        }

        /**
         * <p>If set, then the service will not trigger execution of this task on an agent. Useful
         * for when ingesting tasks from an external system that is triggering execution of tasks
         * on agents.</p>
         */
        @JsonSetter(value = "isExecutedElsewhere", nulls = Nulls.SKIP)
        public Builder isExecutedElsewhere(Optional<Boolean> isExecutedElsewhere) {
            this.isExecutedElsewhere = isExecutedElsewhere;
            return this;
        }

        public Builder isExecutedElsewhere(Boolean isExecutedElsewhere) {
            this.isExecutedElsewhere = Optional.ofNullable(isExecutedElsewhere);
            return this;
        }

        /**
         * <p>Indicates an initial set of entities that can be used to execute an entity aware
         * task. For example, an entity Objective, an entity Keep In Zone, etc.</p>
         */
        @JsonSetter(value = "initialEntities", nulls = Nulls.SKIP)
        public Builder initialEntities(Optional<List<TaskEntity>> initialEntities) {
            this.initialEntities = initialEntities;
            return this;
        }

        public Builder initialEntities(List<TaskEntity> initialEntities) {
            this.initialEntities = Optional.ofNullable(initialEntities);
            return this;
        }

        public TaskCreation build() {
            return new TaskCreation(
                    taskId,
                    displayName,
                    description,
                    specification,
                    author,
                    relations,
                    isExecutedElsewhere,
                    initialEntities,
                    additionalProperties);
        }
    }
}
