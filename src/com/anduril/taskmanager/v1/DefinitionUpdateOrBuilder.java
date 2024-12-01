// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/taskmanager/v1/task.pub.proto

package com.anduril.taskmanager.v1;

public interface DefinitionUpdateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.taskmanager.v1.DefinitionUpdate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * New task definition being created or updated.
   * The last_updated_by and specification fields inside the task object must be defined.
   * Definition version must also be incremented by the publisher on updates.
   * We do not look at the fields create_time or last_update_time in this object,
   * they are instead set by task-manager.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Task task = 1 [json_name = "task"];</code>
   * @return Whether the task field is set.
   */
  boolean hasTask();
  /**
   * <pre>
   * New task definition being created or updated.
   * The last_updated_by and specification fields inside the task object must be defined.
   * Definition version must also be incremented by the publisher on updates.
   * We do not look at the fields create_time or last_update_time in this object,
   * they are instead set by task-manager.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Task task = 1 [json_name = "task"];</code>
   * @return The task.
   */
  com.anduril.taskmanager.v1.Task getTask();
  /**
   * <pre>
   * New task definition being created or updated.
   * The last_updated_by and specification fields inside the task object must be defined.
   * Definition version must also be incremented by the publisher on updates.
   * We do not look at the fields create_time or last_update_time in this object,
   * they are instead set by task-manager.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Task task = 1 [json_name = "task"];</code>
   */
  com.anduril.taskmanager.v1.TaskOrBuilder getTaskOrBuilder();
}
