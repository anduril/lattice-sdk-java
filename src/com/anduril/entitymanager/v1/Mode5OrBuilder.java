// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/transponder_codes.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.entitymanager.v1;

public interface Mode5OrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.Mode5)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The validity of the response from the Mode 5 interrogation.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.InterrogationResponse mode5_interrogation_response = 1 [json_name = "mode5InterrogationResponse"];</code>
   * @return The enum numeric value on the wire for mode5InterrogationResponse.
   */
  int getMode5InterrogationResponseValue();
  /**
   * <pre>
   * The validity of the response from the Mode 5 interrogation.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.InterrogationResponse mode5_interrogation_response = 1 [json_name = "mode5InterrogationResponse"];</code>
   * @return The mode5InterrogationResponse.
   */
  com.anduril.entitymanager.v1.InterrogationResponse getMode5InterrogationResponse();

  /**
   * <pre>
   * The Mode 5 code assigned to military assets. Mode 5 is a 12-bit decimal (1-4095) value. If displaying to a user,
   * convert to 4 digit octal 0001-7777. Note that Mode 5 codes are NOT unique by themselves, but should be used in
   * conjunction with the Mode 5 platform ID &amp; nationality to provide unique identification.
   * A zero mode code indicates No Statement.
   * </pre>
   *
   * <code>uint32 mode5 = 2 [json_name = "mode5"];</code>
   * @return The mode5.
   */
  int getMode5();

  /**
   * <pre>
   * The Mode 5 platform identification code. Expected values are between 1 and 16383. Used in conjunction with the
   * Nationality it provides IFF/SIF capabilities.
   * A zero platform id indicates No Statement.
   * </pre>
   *
   * <code>uint32 mode5_platform_id = 3 [json_name = "mode5PlatformId"];</code>
   * @return The mode5PlatformId.
   */
  int getMode5PlatformId();
}
