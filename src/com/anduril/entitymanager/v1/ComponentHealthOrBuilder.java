// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/health_status.pub.proto

package com.anduril.entitymanager.v1;

public interface ComponentHealthOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.ComponentHealth)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Consistent internal ID for this component.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Consistent internal ID for this component.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Display name for this component.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Display name for this component.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Health for this component.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.HealthStatus health = 3 [json_name = "health"];</code>
   * @return The enum numeric value on the wire for health.
   */
  int getHealthValue();
  /**
   * <pre>
   * Health for this component.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.HealthStatus health = 3 [json_name = "health"];</code>
   * @return The health.
   */
  com.anduril.entitymanager.v1.HealthStatus getHealth();

  /**
   * <pre>
   * Human-readable describing the component state. These messages should be understandable by end users.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.ComponentMessage messages = 4 [json_name = "messages"];</code>
   */
  java.util.List<com.anduril.entitymanager.v1.ComponentMessage> 
      getMessagesList();
  /**
   * <pre>
   * Human-readable describing the component state. These messages should be understandable by end users.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.ComponentMessage messages = 4 [json_name = "messages"];</code>
   */
  com.anduril.entitymanager.v1.ComponentMessage getMessages(int index);
  /**
   * <pre>
   * Human-readable describing the component state. These messages should be understandable by end users.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.ComponentMessage messages = 4 [json_name = "messages"];</code>
   */
  int getMessagesCount();
  /**
   * <pre>
   * Human-readable describing the component state. These messages should be understandable by end users.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.ComponentMessage messages = 4 [json_name = "messages"];</code>
   */
  java.util.List<? extends com.anduril.entitymanager.v1.ComponentMessageOrBuilder> 
      getMessagesOrBuilderList();
  /**
   * <pre>
   * Human-readable describing the component state. These messages should be understandable by end users.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.ComponentMessage messages = 4 [json_name = "messages"];</code>
   */
  com.anduril.entitymanager.v1.ComponentMessageOrBuilder getMessagesOrBuilder(
      int index);

  /**
   * <pre>
   * The last update time for this specific component.
   * If this timestamp is unset, the data is assumed to be most recent
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [json_name = "updateTime"];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * The last update time for this specific component.
   * If this timestamp is unset, the data is assumed to be most recent
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [json_name = "updateTime"];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * The last update time for this specific component.
   * If this timestamp is unset, the data is assumed to be most recent
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [json_name = "updateTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}