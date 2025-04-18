// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/taskmanager/v1/task_manager_grpcapi.pub.proto

package com.anduril.taskmanager.v1;

public interface GetTaskRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.taskmanager.v1.GetTaskRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of Task to get.
   * </pre>
   *
   * <code>string task_id = 1 [json_name = "taskId"];</code>
   * @return The taskId.
   */
  java.lang.String getTaskId();
  /**
   * <pre>
   * ID of Task to get.
   * </pre>
   *
   * <code>string task_id = 1 [json_name = "taskId"];</code>
   * @return The bytes for taskId.
   */
  com.google.protobuf.ByteString
      getTaskIdBytes();

  /**
   * <pre>
   * Optional - if &gt; 0, will get specific definition_version, otherwise latest (highest) definition_version is used.
   * </pre>
   *
   * <code>uint32 definition_version = 2 [json_name = "definitionVersion"];</code>
   * @return The definitionVersion.
   */
  int getDefinitionVersion();

  /**
   * <pre>
   * Optional - select which view of the task to fetch. If not set, defaults to TASK_VIEW_MANAGER.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.TaskView task_view = 3 [json_name = "taskView"];</code>
   * @return The enum numeric value on the wire for taskView.
   */
  int getTaskViewValue();
  /**
   * <pre>
   * Optional - select which view of the task to fetch. If not set, defaults to TASK_VIEW_MANAGER.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.TaskView task_view = 3 [json_name = "taskView"];</code>
   * @return The taskView.
   */
  com.anduril.taskmanager.v1.TaskView getTaskView();
}
