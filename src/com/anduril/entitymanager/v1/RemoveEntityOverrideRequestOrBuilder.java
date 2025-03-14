// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/entity_manager_grpcapi.pub.proto

package com.anduril.entitymanager.v1;

public interface RemoveEntityOverrideRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.RemoveEntityOverrideRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The entity ID that the override will be removed from.
   * </pre>
   *
   * <code>string entity_id = 1 [json_name = "entityId"];</code>
   * @return The entityId.
   */
  java.lang.String getEntityId();
  /**
   * <pre>
   * The entity ID that the override will be removed from.
   * </pre>
   *
   * <code>string entity_id = 1 [json_name = "entityId"];</code>
   * @return The bytes for entityId.
   */
  com.google.protobuf.ByteString
      getEntityIdBytes();

  /**
   * <pre>
   * The field paths to remove from the override store for the provided entityId.
   * </pre>
   *
   * <code>repeated string field_path = 2 [json_name = "fieldPath"];</code>
   * @return A list containing the fieldPath.
   */
  java.util.List<java.lang.String>
      getFieldPathList();
  /**
   * <pre>
   * The field paths to remove from the override store for the provided entityId.
   * </pre>
   *
   * <code>repeated string field_path = 2 [json_name = "fieldPath"];</code>
   * @return The count of fieldPath.
   */
  int getFieldPathCount();
  /**
   * <pre>
   * The field paths to remove from the override store for the provided entityId.
   * </pre>
   *
   * <code>repeated string field_path = 2 [json_name = "fieldPath"];</code>
   * @param index The index of the element to return.
   * @return The fieldPath at the given index.
   */
  java.lang.String getFieldPath(int index);
  /**
   * <pre>
   * The field paths to remove from the override store for the provided entityId.
   * </pre>
   *
   * <code>repeated string field_path = 2 [json_name = "fieldPath"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the fieldPath at the given index.
   */
  com.google.protobuf.ByteString
      getFieldPathBytes(int index);
}
