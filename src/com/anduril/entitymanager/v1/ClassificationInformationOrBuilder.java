// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/entitymanager/v1/classification.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.entitymanager.v1;

public interface ClassificationInformationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.ClassificationInformation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Classification level to be applied to the information in question.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.ClassificationLevels level = 1 [json_name = "level"];</code>
   * @return The enum numeric value on the wire for level.
   */
  int getLevelValue();
  /**
   * <pre>
   * Classification level to be applied to the information in question.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.ClassificationLevels level = 1 [json_name = "level"];</code>
   * @return The level.
   */
  com.anduril.entitymanager.v1.ClassificationLevels getLevel();

  /**
   * <pre>
   * Caveats that may further restrict how the information can be disseminated.
   * </pre>
   *
   * <code>repeated string caveats = 2 [json_name = "caveats"];</code>
   * @return A list containing the caveats.
   */
  java.util.List<java.lang.String>
      getCaveatsList();
  /**
   * <pre>
   * Caveats that may further restrict how the information can be disseminated.
   * </pre>
   *
   * <code>repeated string caveats = 2 [json_name = "caveats"];</code>
   * @return The count of caveats.
   */
  int getCaveatsCount();
  /**
   * <pre>
   * Caveats that may further restrict how the information can be disseminated.
   * </pre>
   *
   * <code>repeated string caveats = 2 [json_name = "caveats"];</code>
   * @param index The index of the element to return.
   * @return The caveats at the given index.
   */
  java.lang.String getCaveats(int index);
  /**
   * <pre>
   * Caveats that may further restrict how the information can be disseminated.
   * </pre>
   *
   * <code>repeated string caveats = 2 [json_name = "caveats"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the caveats at the given index.
   */
  com.google.protobuf.ByteString
      getCaveatsBytes(int index);
}
