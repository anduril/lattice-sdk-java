// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/taskmanager/v1/task_manager_api.pub.proto

package com.anduril.taskmanager.v1;

public interface CreateTaskResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.taskmanager.v1.CreateTaskResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Task that was created.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Task task = 1 [json_name = "task"];</code>
   * @return Whether the task field is set.
   */
  boolean hasTask();
  /**
   * <pre>
   * Task that was created.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Task task = 1 [json_name = "task"];</code>
   * @return The task.
   */
  com.anduril.taskmanager.v1.Task getTask();
  /**
   * <pre>
   * Task that was created.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Task task = 1 [json_name = "task"];</code>
   */
  com.anduril.taskmanager.v1.TaskOrBuilder getTaskOrBuilder();
}
