/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.anduril.resources.entities.types;

import com.anduril.types.EntityStreamEvent;
import com.anduril.types.EntityStreamHeartbeat;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;

public final class SseEntityEventsResponse {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private SseEntityEventsResponse(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static SseEntityEventsResponse heartbeat(EntityStreamHeartbeat value) {
        return new SseEntityEventsResponse(new HeartbeatValue(value));
    }

    public static SseEntityEventsResponse entity(EntityStreamEvent value) {
        return new SseEntityEventsResponse(new EntityValue(value));
    }

    public boolean isHeartbeat() {
        return value instanceof HeartbeatValue;
    }

    public boolean isEntity() {
        return value instanceof EntityValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<EntityStreamHeartbeat> getHeartbeat() {
        if (isHeartbeat()) {
            return Optional.of(((HeartbeatValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<EntityStreamEvent> getEntity() {
        if (isEntity()) {
            return Optional.of(((EntityValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<Object> _getUnknown() {
        if (_isUnknown()) {
            return Optional.of(((_UnknownValue) value).value);
        }
        return Optional.empty();
    }

    @JsonValue
    private Value getValue() {
        return this.value;
    }

    public interface Visitor<T> {
        T visitHeartbeat(EntityStreamHeartbeat heartbeat);

        T visitEntity(EntityStreamEvent entity);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "event", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({@JsonSubTypes.Type(HeartbeatValue.class), @JsonSubTypes.Type(EntityValue.class)})
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("heartbeat")
    @JsonIgnoreProperties("event")
    private static final class HeartbeatValue implements Value {
        @JsonUnwrapped
        private EntityStreamHeartbeat value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private HeartbeatValue() {}

        private HeartbeatValue(EntityStreamHeartbeat value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitHeartbeat(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof HeartbeatValue && equalTo((HeartbeatValue) other);
        }

        private boolean equalTo(HeartbeatValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "SseEntityEventsResponse{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("entity")
    @JsonIgnoreProperties("event")
    private static final class EntityValue implements Value {
        @JsonUnwrapped
        private EntityStreamEvent value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private EntityValue() {}

        private EntityValue(EntityStreamEvent value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitEntity(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof EntityValue && equalTo((EntityValue) other);
        }

        private boolean equalTo(EntityValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "SseEntityEventsResponse{" + "value: " + value + "}";
        }
    }

    @JsonIgnoreProperties("event")
    private static final class _UnknownValue implements Value {
        private String type;

        @JsonValue
        private Object value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private _UnknownValue(@JsonProperty("value") Object value) {}

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor._visitUnknown(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof _UnknownValue && equalTo((_UnknownValue) other);
        }

        private boolean equalTo(_UnknownValue other) {
            return type.equals(other.type) && value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.type, this.value);
        }

        @java.lang.Override
        public String toString() {
            return "SseEntityEventsResponse{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
