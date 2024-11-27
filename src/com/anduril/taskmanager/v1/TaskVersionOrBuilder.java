// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/taskmanager/v1/task.pub.proto

package com.anduril.taskmanager.v1;

public interface TaskVersionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.taskmanager.v1.TaskVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The unique ID for this Task.
   * </pre>
   *
   * <code>string task_id = 1 [json_name = "taskId"];</code>
   * @return The taskId.
   */
  java.lang.String getTaskId();
  /**
   * <pre>
   * The unique ID for this Task.
   * </pre>
   *
   * <code>string task_id = 1 [json_name = "taskId"];</code>
   * @return The bytes for taskId.
   */
  com.google.protobuf.ByteString
      getTaskIdBytes();

  /**
   * <pre>
   * Increments on definition (i.e. not TaskStatus) change. 0 is unset, starts at 1 on creation.
   * </pre>
   *
   * <code>uint32 definition_version = 2 [json_name = "definitionVersion"];</code>
   * @return The definitionVersion.
   */
  int getDefinitionVersion();

  /**
   * <pre>
   * Increments on changes to TaskStatus. 0 is unset, starts at 1 on creation.
   * </pre>
   *
   * <code>uint32 status_version = 3 [json_name = "statusVersion"];</code>
   * @return The statusVersion.
   */
  int getStatusVersion();
}