// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/taskmanager/v1/task_manager_grpcapi.pub.proto

package com.anduril.taskmanager.v1;

public interface ListenAsAgentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.taskmanager.v1.ListenAsAgentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.anduril.taskmanager.v1.ExecuteRequest execute_request = 1 [json_name = "executeRequest"];</code>
   * @return Whether the executeRequest field is set.
   */
  boolean hasExecuteRequest();
  /**
   * <code>.anduril.taskmanager.v1.ExecuteRequest execute_request = 1 [json_name = "executeRequest"];</code>
   * @return The executeRequest.
   */
  com.anduril.taskmanager.v1.ExecuteRequest getExecuteRequest();
  /**
   * <code>.anduril.taskmanager.v1.ExecuteRequest execute_request = 1 [json_name = "executeRequest"];</code>
   */
  com.anduril.taskmanager.v1.ExecuteRequestOrBuilder getExecuteRequestOrBuilder();

  /**
   * <code>.anduril.taskmanager.v1.CancelRequest cancel_request = 2 [json_name = "cancelRequest"];</code>
   * @return Whether the cancelRequest field is set.
   */
  boolean hasCancelRequest();
  /**
   * <code>.anduril.taskmanager.v1.CancelRequest cancel_request = 2 [json_name = "cancelRequest"];</code>
   * @return The cancelRequest.
   */
  com.anduril.taskmanager.v1.CancelRequest getCancelRequest();
  /**
   * <code>.anduril.taskmanager.v1.CancelRequest cancel_request = 2 [json_name = "cancelRequest"];</code>
   */
  com.anduril.taskmanager.v1.CancelRequestOrBuilder getCancelRequestOrBuilder();

  /**
   * <code>.anduril.taskmanager.v1.CompleteRequest complete_request = 3 [json_name = "completeRequest"];</code>
   * @return Whether the completeRequest field is set.
   */
  boolean hasCompleteRequest();
  /**
   * <code>.anduril.taskmanager.v1.CompleteRequest complete_request = 3 [json_name = "completeRequest"];</code>
   * @return The completeRequest.
   */
  com.anduril.taskmanager.v1.CompleteRequest getCompleteRequest();
  /**
   * <code>.anduril.taskmanager.v1.CompleteRequest complete_request = 3 [json_name = "completeRequest"];</code>
   */
  com.anduril.taskmanager.v1.CompleteRequestOrBuilder getCompleteRequestOrBuilder();

  com.anduril.taskmanager.v1.ListenAsAgentResponse.RequestCase getRequestCase();
}
