// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/taskmanager/v1/task_manager_grpcapi.pub.proto

package com.anduril.taskmanager.v1;

public interface HeartbeatOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.taskmanager.v1.Heartbeat)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The time at which the Heartbeat was sent.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <pre>
   * The time at which the Heartbeat was sent.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
   * @return The timestamp.
   */
  com.google.protobuf.Timestamp getTimestamp();
  /**
   * <pre>
   * The time at which the Heartbeat was sent.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();
}
