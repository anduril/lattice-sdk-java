// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/taskmanager/v1/task_manager_grpcapi.pub.proto

package com.anduril.taskmanager.v1;

public interface UpdateStatusResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.taskmanager.v1.UpdateStatusResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The updated Task.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Task task = 1 [json_name = "task"];</code>
   * @return Whether the task field is set.
   */
  boolean hasTask();
  /**
   * <pre>
   * The updated Task.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Task task = 1 [json_name = "task"];</code>
   * @return The task.
   */
  com.anduril.taskmanager.v1.Task getTask();
  /**
   * <pre>
   * The updated Task.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Task task = 1 [json_name = "task"];</code>
   */
  com.anduril.taskmanager.v1.TaskOrBuilder getTaskOrBuilder();
}
