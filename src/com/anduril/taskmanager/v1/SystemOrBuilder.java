// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/taskmanager/v1/task.pub.proto

package com.anduril.taskmanager.v1;

public interface SystemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.taskmanager.v1.System)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the service associated with this System.
   * </pre>
   *
   * <code>string service_name = 1 [json_name = "serviceName"];</code>
   * @return The serviceName.
   */
  java.lang.String getServiceName();
  /**
   * <pre>
   * Name of the service associated with this System.
   * </pre>
   *
   * <code>string service_name = 1 [json_name = "serviceName"];</code>
   * @return The bytes for serviceName.
   */
  com.google.protobuf.ByteString
      getServiceNameBytes();

  /**
   * <pre>
   * The Entity ID of the System.
   * </pre>
   *
   * <code>string entity_id = 2 [json_name = "entityId"];</code>
   * @return The entityId.
   */
  java.lang.String getEntityId();
  /**
   * <pre>
   * The Entity ID of the System.
   * </pre>
   *
   * <code>string entity_id = 2 [json_name = "entityId"];</code>
   * @return The bytes for entityId.
   */
  com.google.protobuf.ByteString
      getEntityIdBytes();

  /**
   * <pre>
   * Whether the System Principal (for example, an Asset) can own scheduling.
   * This means we bypass manager-owned scheduling and defer to the system
   * Principal to handle scheduling and give us status updates for the Task.
   * Regardless of the value defined by the client, the Task Manager will
   * determine and set this value appropriately.
   * </pre>
   *
   * <code>bool manages_own_scheduling = 4 [json_name = "managesOwnScheduling"];</code>
   * @return The managesOwnScheduling.
   */
  boolean getManagesOwnScheduling();
}
