// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/entity_manager_grpcapi.pub.proto

package com.anduril.entitymanager.v1;

public interface EntityEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.EntityEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.anduril.entitymanager.v1.EventType event_type = 1 [json_name = "eventType"];</code>
   * @return The enum numeric value on the wire for eventType.
   */
  int getEventTypeValue();
  /**
   * <code>.anduril.entitymanager.v1.EventType event_type = 1 [json_name = "eventType"];</code>
   * @return The eventType.
   */
  com.anduril.entitymanager.v1.EventType getEventType();

  /**
   * <code>.google.protobuf.Timestamp time = 2 [json_name = "time"];</code>
   * @return Whether the time field is set.
   */
  boolean hasTime();
  /**
   * <code>.google.protobuf.Timestamp time = 2 [json_name = "time"];</code>
   * @return The time.
   */
  com.google.protobuf.Timestamp getTime();
  /**
   * <code>.google.protobuf.Timestamp time = 2 [json_name = "time"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeOrBuilder();

  /**
   * <code>.anduril.entitymanager.v1.Entity entity = 3 [json_name = "entity"];</code>
   * @return Whether the entity field is set.
   */
  boolean hasEntity();
  /**
   * <code>.anduril.entitymanager.v1.Entity entity = 3 [json_name = "entity"];</code>
   * @return The entity.
   */
  com.anduril.entitymanager.v1.Entity getEntity();
  /**
   * <code>.anduril.entitymanager.v1.Entity entity = 3 [json_name = "entity"];</code>
   */
  com.anduril.entitymanager.v1.EntityOrBuilder getEntityOrBuilder();
}
