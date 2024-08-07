// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/communicationsmanager/v1/common.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.communicationsmanager.v1;

public interface SourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.communicationsmanager.v1.Source)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The source is a particular asset ID.
   * </pre>
   *
   * <code>string asset_id = 1 [json_name = "assetId", deprecated = true];</code>
   * @deprecated anduril.communicationsmanager.v1.Source.asset_id is deprecated.
   *     See anduril/communicationsmanager/v1/common.pub.proto;l=132
   * @return Whether the assetId field is set.
   */
  @java.lang.Deprecated boolean hasAssetId();
  /**
   * <pre>
   * The source is a particular asset ID.
   * </pre>
   *
   * <code>string asset_id = 1 [json_name = "assetId", deprecated = true];</code>
   * @deprecated anduril.communicationsmanager.v1.Source.asset_id is deprecated.
   *     See anduril/communicationsmanager/v1/common.pub.proto;l=132
   * @return The assetId.
   */
  @java.lang.Deprecated java.lang.String getAssetId();
  /**
   * <pre>
   * The source is a particular asset ID.
   * </pre>
   *
   * <code>string asset_id = 1 [json_name = "assetId", deprecated = true];</code>
   * @deprecated anduril.communicationsmanager.v1.Source.asset_id is deprecated.
   *     See anduril/communicationsmanager/v1/common.pub.proto;l=132
   * @return The bytes for assetId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getAssetIdBytes();

  /**
   * <pre>
   * The source is all sources. This selection is only used for inbound rules.
   * </pre>
   *
   * <code>bool all = 2 [json_name = "all"];</code>
   * @return Whether the all field is set.
   */
  boolean hasAll();
  /**
   * <pre>
   * The source is all sources. This selection is only used for inbound rules.
   * </pre>
   *
   * <code>bool all = 2 [json_name = "all"];</code>
   * @return The all.
   */
  boolean getAll();

  /**
   * <pre>
   * The source is a particular host ID.
   * </pre>
   *
   * <code>string host_id = 3 [json_name = "hostId"];</code>
   * @return Whether the hostId field is set.
   */
  boolean hasHostId();
  /**
   * <pre>
   * The source is a particular host ID.
   * </pre>
   *
   * <code>string host_id = 3 [json_name = "hostId"];</code>
   * @return The hostId.
   */
  java.lang.String getHostId();
  /**
   * <pre>
   * The source is a particular host ID.
   * </pre>
   *
   * <code>string host_id = 3 [json_name = "hostId"];</code>
   * @return The bytes for hostId.
   */
  com.google.protobuf.ByteString
      getHostIdBytes();

  com.anduril.communicationsmanager.v1.Source.SourceCase getSourceCase();
}
