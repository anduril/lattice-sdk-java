// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/entity.pub.proto

package com.anduril.entitymanager.v1;

public interface PrimaryCorrelationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.PrimaryCorrelation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The secondary entity IDs part of this correlation.
   * </pre>
   *
   * <code>repeated string secondary_entity_ids = 1 [json_name = "secondaryEntityIds"];</code>
   * @return A list containing the secondaryEntityIds.
   */
  java.util.List<java.lang.String>
      getSecondaryEntityIdsList();
  /**
   * <pre>
   * The secondary entity IDs part of this correlation.
   * </pre>
   *
   * <code>repeated string secondary_entity_ids = 1 [json_name = "secondaryEntityIds"];</code>
   * @return The count of secondaryEntityIds.
   */
  int getSecondaryEntityIdsCount();
  /**
   * <pre>
   * The secondary entity IDs part of this correlation.
   * </pre>
   *
   * <code>repeated string secondary_entity_ids = 1 [json_name = "secondaryEntityIds"];</code>
   * @param index The index of the element to return.
   * @return The secondaryEntityIds at the given index.
   */
  java.lang.String getSecondaryEntityIds(int index);
  /**
   * <pre>
   * The secondary entity IDs part of this correlation.
   * </pre>
   *
   * <code>repeated string secondary_entity_ids = 1 [json_name = "secondaryEntityIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the secondaryEntityIds at the given index.
   */
  com.google.protobuf.ByteString
      getSecondaryEntityIdsBytes(int index);
}
