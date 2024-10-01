// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/health_status.pub.proto

package com.anduril.entitymanager.v1;

public interface AlertConditionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.AlertCondition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Short, machine-readable code that describes this condition. This code is intended to provide systems off-asset
   * with a lookup key to retrieve more detailed information about the condition.
   * </pre>
   *
   * <code>string condition_code = 1 [json_name = "conditionCode"];</code>
   * @return The conditionCode.
   */
  java.lang.String getConditionCode();
  /**
   * <pre>
   * Short, machine-readable code that describes this condition. This code is intended to provide systems off-asset
   * with a lookup key to retrieve more detailed information about the condition.
   * </pre>
   *
   * <code>string condition_code = 1 [json_name = "conditionCode"];</code>
   * @return The bytes for conditionCode.
   */
  com.google.protobuf.ByteString
      getConditionCodeBytes();

  /**
   * <pre>
   * Human-readable description of this condition. The description is intended for display in the UI for human
   * understanding and should not be used for machine processing. If the description is fixed and the vehicle controller
   * provides no dynamic substitutions, then prefer lookup based on condition_code.
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Human-readable description of this condition. The description is intended for display in the UI for human
   * understanding and should not be used for machine processing. If the description is fixed and the vehicle controller
   * provides no dynamic substitutions, then prefer lookup based on condition_code.
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}
