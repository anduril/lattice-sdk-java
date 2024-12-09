// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/entity.pub.proto

package com.anduril.entitymanager.v1;

public interface SecondaryCorrelationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.SecondaryCorrelation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The primary of this correlation.
   * </pre>
   *
   * <code>string primary_entity_id = 1 [json_name = "primaryEntityId"];</code>
   * @return The primaryEntityId.
   */
  java.lang.String getPrimaryEntityId();
  /**
   * <pre>
   * The primary of this correlation.
   * </pre>
   *
   * <code>string primary_entity_id = 1 [json_name = "primaryEntityId"];</code>
   * @return The bytes for primaryEntityId.
   */
  com.google.protobuf.ByteString
      getPrimaryEntityIdBytes();

  /**
   * <pre>
   * Metadata about the correlation.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.CorrelationMetadata metadata = 2 [json_name = "metadata"];</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * Metadata about the correlation.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.CorrelationMetadata metadata = 2 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  com.anduril.entitymanager.v1.CorrelationMetadata getMetadata();
  /**
   * <pre>
   * Metadata about the correlation.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.CorrelationMetadata metadata = 2 [json_name = "metadata"];</code>
   */
  com.anduril.entitymanager.v1.CorrelationMetadataOrBuilder getMetadataOrBuilder();
}