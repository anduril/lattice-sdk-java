// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/shared/strike.pub.proto

package com.anduril.tasks.v2;

public interface PayloadConfigurationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.tasks.v2.PayloadConfiguration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique ID or descriptor for the capability.
   * </pre>
   *
   * <code>string capability_id = 1 [json_name = "capabilityId"];</code>
   * @return The capabilityId.
   */
  java.lang.String getCapabilityId();
  /**
   * <pre>
   * Unique ID or descriptor for the capability.
   * </pre>
   *
   * <code>string capability_id = 1 [json_name = "capabilityId"];</code>
   * @return The bytes for capabilityId.
   */
  com.google.protobuf.ByteString
      getCapabilityIdBytes();

  /**
   * <code>uint32 quantity = 2 [json_name = "quantity"];</code>
   * @return The quantity.
   */
  int getQuantity();
}