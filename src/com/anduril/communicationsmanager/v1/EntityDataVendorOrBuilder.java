// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/communicationsmanager/v1/entity.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.communicationsmanager.v1;

public interface EntityDataVendorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.communicationsmanager.v1.EntityDataVendor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string vendor_name = 1 [json_name = "vendorName"];</code>
   * @return The vendorName.
   */
  java.lang.String getVendorName();
  /**
   * <code>string vendor_name = 1 [json_name = "vendorName"];</code>
   * @return The bytes for vendorName.
   */
  com.google.protobuf.ByteString
      getVendorNameBytes();

  /**
   * <code>repeated string data_type = 2 [json_name = "dataType"];</code>
   * @return A list containing the dataType.
   */
  java.util.List<java.lang.String>
      getDataTypeList();
  /**
   * <code>repeated string data_type = 2 [json_name = "dataType"];</code>
   * @return The count of dataType.
   */
  int getDataTypeCount();
  /**
   * <code>repeated string data_type = 2 [json_name = "dataType"];</code>
   * @param index The index of the element to return.
   * @return The dataType at the given index.
   */
  java.lang.String getDataType(int index);
  /**
   * <code>repeated string data_type = 2 [json_name = "dataType"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the dataType at the given index.
   */
  com.google.protobuf.ByteString
      getDataTypeBytes(int index);
}
