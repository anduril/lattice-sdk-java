// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/taskmanager/v1/task_manager_api.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.taskmanager.v1;

public interface UpdateStatusRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.taskmanager.v1.UpdateStatusRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The updated status.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.StatusUpdate status_update = 1 [json_name = "statusUpdate"];</code>
   * @return Whether the statusUpdate field is set.
   */
  boolean hasStatusUpdate();
  /**
   * <pre>
   * The updated status.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.StatusUpdate status_update = 1 [json_name = "statusUpdate"];</code>
   * @return The statusUpdate.
   */
  com.anduril.taskmanager.v1.StatusUpdate getStatusUpdate();
  /**
   * <pre>
   * The updated status.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.StatusUpdate status_update = 1 [json_name = "statusUpdate"];</code>
   */
  com.anduril.taskmanager.v1.StatusUpdateOrBuilder getStatusUpdateOrBuilder();
}
