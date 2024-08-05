// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/taskmanager/v1/task.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.taskmanager.v1;

public interface TaskEntityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.taskmanager.v1.TaskEntity)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The wrapped entity-manager entity.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
   * @return Whether the entity field is set.
   */
  boolean hasEntity();
  /**
   * <pre>
   * The wrapped entity-manager entity.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
   * @return The entity.
   */
  com.anduril.entitymanager.v1.Entity getEntity();
  /**
   * <pre>
   * The wrapped entity-manager entity.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
   */
  com.anduril.entitymanager.v1.EntityOrBuilder getEntityOrBuilder();

  /**
   * <pre>
   * Indicates that this entity was generated from a snapshot of a live entity.
   * </pre>
   *
   * <code>bool snapshot = 2 [json_name = "snapshot"];</code>
   * @return The snapshot.
   */
  boolean getSnapshot();
}
