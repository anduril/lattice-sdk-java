// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/health_status.pub.proto

package com.anduril.entitymanager.v1;

public interface ComponentMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.ComponentMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The status associated with this message.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.HealthStatus status = 1 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * The status associated with this message.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.HealthStatus status = 1 [json_name = "status"];</code>
   * @return The status.
   */
  com.anduril.entitymanager.v1.HealthStatus getStatus();

  /**
   * <pre>
   * The human-readable content of the message.
   * </pre>
   *
   * <code>string message = 2 [json_name = "message"];</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * The human-readable content of the message.
   * </pre>
   *
   * <code>string message = 2 [json_name = "message"];</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
