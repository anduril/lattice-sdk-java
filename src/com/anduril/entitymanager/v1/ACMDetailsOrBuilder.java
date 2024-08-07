// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/geoentity.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.entitymanager.v1;

public interface ACMDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.ACMDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.anduril.entitymanager.v1.ACMDetailType acm_type = 1 [json_name = "acmType"];</code>
   * @return The enum numeric value on the wire for acmType.
   */
  int getAcmTypeValue();
  /**
   * <code>.anduril.entitymanager.v1.ACMDetailType acm_type = 1 [json_name = "acmType"];</code>
   * @return The acmType.
   */
  com.anduril.entitymanager.v1.ACMDetailType getAcmType();

  /**
   * <pre>
   * Used for loosely typed associations, such as assignment to a specific fires unit
   * Limit to 150 characters
   * </pre>
   *
   * <code>string acm_description = 2 [json_name = "acmDescription"];</code>
   * @return The acmDescription.
   */
  java.lang.String getAcmDescription();
  /**
   * <pre>
   * Used for loosely typed associations, such as assignment to a specific fires unit
   * Limit to 150 characters
   * </pre>
   *
   * <code>string acm_description = 2 [json_name = "acmDescription"];</code>
   * @return The bytes for acmDescription.
   */
  com.google.protobuf.ByteString
      getAcmDescriptionBytes();
}
