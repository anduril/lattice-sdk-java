// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/blobs/v1/blobs_api.pub.proto

package com.anduril.blobs.v1;

public interface StreamBlobMetadataRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.blobs.v1.StreamBlobMetadataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The blob client_id to stream.
   * </pre>
   *
   * <code>string client_id = 1 [json_name = "clientId"];</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <pre>
   * The blob client_id to stream.
   * </pre>
   *
   * <code>string client_id = 1 [json_name = "clientId"];</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();
}
