// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/entity.pub.proto

package com.anduril.entitymanager.v1;

public interface AlternateIdOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.AlternateId)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * deprecated in favor of type
   * </pre>
   *
   * <code>string source = 1 [json_name = "source", deprecated = true];</code>
   * @deprecated anduril.entitymanager.v1.AlternateId.source is deprecated.
   *     See anduril/entitymanager/v1/entity.pub.proto;l=300
   * @return The source.
   */
  @java.lang.Deprecated java.lang.String getSource();
  /**
   * <pre>
   * deprecated in favor of type
   * </pre>
   *
   * <code>string source = 1 [json_name = "source", deprecated = true];</code>
   * @deprecated anduril.entitymanager.v1.AlternateId.source is deprecated.
   *     See anduril/entitymanager/v1/entity.pub.proto;l=300
   * @return The bytes for source.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getSourceBytes();

  /**
   * <code>string id = 2 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 2 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>.anduril.entitymanager.v1.AltIdType type = 3 [json_name = "type", (.anduril.entitymanager.v1.componentIdentifier) = true];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.anduril.entitymanager.v1.AltIdType type = 3 [json_name = "type", (.anduril.entitymanager.v1.componentIdentifier) = true];</code>
   * @return The type.
   */
  com.anduril.entitymanager.v1.AltIdType getType();
}
