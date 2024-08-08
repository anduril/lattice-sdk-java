// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/blobs/v1/common.pub.proto

package com.anduril.blobs.v1;

public interface BlobMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.blobs.v1.BlobMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * timestamp of when blob was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_time = 1 [json_name = "createdTime"];</code>
   * @return Whether the createdTime field is set.
   */
  boolean hasCreatedTime();
  /**
   * <pre>
   * timestamp of when blob was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_time = 1 [json_name = "createdTime"];</code>
   * @return The createdTime.
   */
  com.google.protobuf.Timestamp getCreatedTime();
  /**
   * <pre>
   * timestamp of when blob was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_time = 1 [json_name = "createdTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedTimeOrBuilder();

  /**
   * <pre>
   * timestamp of when this blob will be retained until.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp retention_time = 2 [json_name = "retentionTime"];</code>
   * @return Whether the retentionTime field is set.
   */
  boolean hasRetentionTime();
  /**
   * <pre>
   * timestamp of when this blob will be retained until.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp retention_time = 2 [json_name = "retentionTime"];</code>
   * @return The retentionTime.
   */
  com.google.protobuf.Timestamp getRetentionTime();
  /**
   * <pre>
   * timestamp of when this blob will be retained until.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp retention_time = 2 [json_name = "retentionTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getRetentionTimeOrBuilder();

  /**
   * <pre>
   * size of the blob contents in bytes
   * </pre>
   *
   * <code>uint64 size_bytes = 3 [json_name = "sizeBytes"];</code>
   * @return The sizeBytes.
   */
  long getSizeBytes();

  /**
   * <pre>
   * md5 sum/hash of blob contents
   * </pre>
   *
   * <code>bytes md5 = 4 [json_name = "md5"];</code>
   * @return The md5.
   */
  com.google.protobuf.ByteString getMd5();

  /**
   * <pre>
   * MIME type of blob contents
   * </pre>
   *
   * <code>string content_type = 5 [json_name = "contentType"];</code>
   * @return The contentType.
   */
  java.lang.String getContentType();
  /**
   * <pre>
   * MIME type of blob contents
   * </pre>
   *
   * <code>string content_type = 5 [json_name = "contentType"];</code>
   * @return The bytes for contentType.
   */
  com.google.protobuf.ByteString
      getContentTypeBytes();

  /**
   * <pre>
   * details regarding the blob's origin - aka source and type
   * </pre>
   *
   * <code>.anduril.blobs.v1.BlobProvenance provenance = 6 [json_name = "provenance"];</code>
   * @return Whether the provenance field is set.
   */
  boolean hasProvenance();
  /**
   * <pre>
   * details regarding the blob's origin - aka source and type
   * </pre>
   *
   * <code>.anduril.blobs.v1.BlobProvenance provenance = 6 [json_name = "provenance"];</code>
   * @return The provenance.
   */
  com.anduril.blobs.v1.BlobProvenance getProvenance();
  /**
   * <pre>
   * details regarding the blob's origin - aka source and type
   * </pre>
   *
   * <code>.anduril.blobs.v1.BlobProvenance provenance = 6 [json_name = "provenance"];</code>
   */
  com.anduril.blobs.v1.BlobProvenanceOrBuilder getProvenanceOrBuilder();
}
