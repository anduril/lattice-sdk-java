// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/entitymanager/v1/filter.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.entitymanager.v1;

public interface NumericTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.NumericType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>double double_value = 1 [json_name = "doubleValue"];</code>
   * @return Whether the doubleValue field is set.
   */
  boolean hasDoubleValue();
  /**
   * <code>double double_value = 1 [json_name = "doubleValue"];</code>
   * @return The doubleValue.
   */
  double getDoubleValue();

  /**
   * <code>float float_value = 2 [json_name = "floatValue"];</code>
   * @return Whether the floatValue field is set.
   */
  boolean hasFloatValue();
  /**
   * <code>float float_value = 2 [json_name = "floatValue"];</code>
   * @return The floatValue.
   */
  float getFloatValue();

  /**
   * <code>int32 int32_value = 3 [json_name = "int32Value"];</code>
   * @return Whether the int32Value field is set.
   */
  boolean hasInt32Value();
  /**
   * <code>int32 int32_value = 3 [json_name = "int32Value"];</code>
   * @return The int32Value.
   */
  int getInt32Value();

  /**
   * <code>int64 int64_value = 4 [json_name = "int64Value"];</code>
   * @return Whether the int64Value field is set.
   */
  boolean hasInt64Value();
  /**
   * <code>int64 int64_value = 4 [json_name = "int64Value"];</code>
   * @return The int64Value.
   */
  long getInt64Value();

  /**
   * <code>uint32 uint32_value = 5 [json_name = "uint32Value"];</code>
   * @return Whether the uint32Value field is set.
   */
  boolean hasUint32Value();
  /**
   * <code>uint32 uint32_value = 5 [json_name = "uint32Value"];</code>
   * @return The uint32Value.
   */
  int getUint32Value();

  /**
   * <code>uint64 uint64_value = 6 [json_name = "uint64Value"];</code>
   * @return Whether the uint64Value field is set.
   */
  boolean hasUint64Value();
  /**
   * <code>uint64 uint64_value = 6 [json_name = "uint64Value"];</code>
   * @return The uint64Value.
   */
  long getUint64Value();

  com.anduril.entitymanager.v1.NumericType.ValueCase getValueCase();
}
