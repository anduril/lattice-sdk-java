// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/entitymanager/v1/transponder_codes.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.entitymanager.v1;

public interface ModeSOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.ModeS)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Mode S identifier which comprises of 8 alphanumeric characters.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Mode S identifier which comprises of 8 alphanumeric characters.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The Mode S ICAO aircraft address. Expected values are between 1 and 16777214 decimal. The Mode S address is
   * considered unique.
   * </pre>
   *
   * <code>uint32 address = 2 [json_name = "address"];</code>
   * @return The address.
   */
  int getAddress();
}
