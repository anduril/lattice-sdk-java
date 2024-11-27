// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/classification.pub.proto

package com.anduril.entitymanager.v1;

public interface FieldClassificationInformationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.FieldClassificationInformation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Proto field path which is the string representation of a field.
   * &gt; example: signal.bandwidth_hz would be bandwidth_hz in the signal component
   * </pre>
   *
   * <code>string field_path = 1 [json_name = "fieldPath"];</code>
   * @return The fieldPath.
   */
  java.lang.String getFieldPath();
  /**
   * <pre>
   * Proto field path which is the string representation of a field.
   * &gt; example: signal.bandwidth_hz would be bandwidth_hz in the signal component
   * </pre>
   *
   * <code>string field_path = 1 [json_name = "fieldPath"];</code>
   * @return The bytes for fieldPath.
   */
  com.google.protobuf.ByteString
      getFieldPathBytes();

  /**
   * <pre>
   * The information which makes up the field level classification marking.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.ClassificationInformation classification_information = 2 [json_name = "classificationInformation"];</code>
   * @return Whether the classificationInformation field is set.
   */
  boolean hasClassificationInformation();
  /**
   * <pre>
   * The information which makes up the field level classification marking.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.ClassificationInformation classification_information = 2 [json_name = "classificationInformation"];</code>
   * @return The classificationInformation.
   */
  com.anduril.entitymanager.v1.ClassificationInformation getClassificationInformation();
  /**
   * <pre>
   * The information which makes up the field level classification marking.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.ClassificationInformation classification_information = 2 [json_name = "classificationInformation"];</code>
   */
  com.anduril.entitymanager.v1.ClassificationInformationOrBuilder getClassificationInformationOrBuilder();
}