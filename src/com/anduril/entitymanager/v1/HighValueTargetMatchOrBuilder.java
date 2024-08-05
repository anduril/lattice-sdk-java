// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/entitymanager/v1/target_priority.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.entitymanager.v1;

public interface HighValueTargetMatchOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.HighValueTargetMatch)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the high value target list that matches the target description.
   * </pre>
   *
   * <code>string high_value_target_list_id = 1 [json_name = "highValueTargetListId"];</code>
   * @return The highValueTargetListId.
   */
  java.lang.String getHighValueTargetListId();
  /**
   * <pre>
   * The ID of the high value target list that matches the target description.
   * </pre>
   *
   * <code>string high_value_target_list_id = 1 [json_name = "highValueTargetListId"];</code>
   * @return The bytes for highValueTargetListId.
   */
  com.google.protobuf.ByteString
      getHighValueTargetListIdBytes();

  /**
   * <pre>
   * The ID of the specific high value target description within a high value target list that was matched against.
   * The ID is considered to be a globally unique identifier across all high value target IDs.
   * </pre>
   *
   * <code>string high_value_target_description_id = 2 [json_name = "highValueTargetDescriptionId"];</code>
   * @return The highValueTargetDescriptionId.
   */
  java.lang.String getHighValueTargetDescriptionId();
  /**
   * <pre>
   * The ID of the specific high value target description within a high value target list that was matched against.
   * The ID is considered to be a globally unique identifier across all high value target IDs.
   * </pre>
   *
   * <code>string high_value_target_description_id = 2 [json_name = "highValueTargetDescriptionId"];</code>
   * @return The bytes for highValueTargetDescriptionId.
   */
  com.google.protobuf.ByteString
      getHighValueTargetDescriptionIdBytes();
}
