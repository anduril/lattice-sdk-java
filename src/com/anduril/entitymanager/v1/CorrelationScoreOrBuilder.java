// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/correlations.pub.proto

package com.anduril.entitymanager.v1;

public interface CorrelationScoreOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.CorrelationScore)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string other_entity_id = 1 [json_name = "otherEntityId"];</code>
   * @return The otherEntityId.
   */
  java.lang.String getOtherEntityId();
  /**
   * <code>string other_entity_id = 1 [json_name = "otherEntityId"];</code>
   * @return The bytes for otherEntityId.
   */
  com.google.protobuf.ByteString
      getOtherEntityIdBytes();

  /**
   * <code>float score = 2 [json_name = "score"];</code>
   * @return The score.
   */
  float getScore();

  /**
   * <code>.anduril.entitymanager.v1.ScoreInterpretation interpretation = 3 [json_name = "interpretation"];</code>
   * @return The enum numeric value on the wire for interpretation.
   */
  int getInterpretationValue();
  /**
   * <code>.anduril.entitymanager.v1.ScoreInterpretation interpretation = 3 [json_name = "interpretation"];</code>
   * @return The interpretation.
   */
  com.anduril.entitymanager.v1.ScoreInterpretation getInterpretation();

  /**
   * <pre>
   * Deprecated: do not use
   * </pre>
   *
   * <code>bool link16_compliant = 4 [json_name = "link16Compliant", deprecated = true];</code>
   * @deprecated anduril.entitymanager.v1.CorrelationScore.link16_compliant is deprecated.
   *     See anduril/entitymanager/v1/correlations.pub.proto;l=32
   * @return The link16Compliant.
   */
  @java.lang.Deprecated boolean getLink16Compliant();

  /**
   * <pre>
   * status of other_entity_id correlation, expresses relationship of other to correlation set this entity is part of.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.CorrelationStatus other_status = 5 [json_name = "otherStatus"];</code>
   * @return The enum numeric value on the wire for otherStatus.
   */
  int getOtherStatusValue();
  /**
   * <pre>
   * status of other_entity_id correlation, expresses relationship of other to correlation set this entity is part of.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.CorrelationStatus other_status = 5 [json_name = "otherStatus"];</code>
   * @return The otherStatus.
   */
  com.anduril.entitymanager.v1.CorrelationStatus getOtherStatus();
}