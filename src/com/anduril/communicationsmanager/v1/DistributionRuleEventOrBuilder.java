// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/communicationsmanager/v1/common.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.communicationsmanager.v1;

public interface DistributionRuleEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.communicationsmanager.v1.DistributionRuleEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The type of distribution rule event.
   * </pre>
   *
   * <code>.anduril.communicationsmanager.v1.EventType event_type = 1 [json_name = "eventType"];</code>
   * @return The enum numeric value on the wire for eventType.
   */
  int getEventTypeValue();
  /**
   * <pre>
   * The type of distribution rule event.
   * </pre>
   *
   * <code>.anduril.communicationsmanager.v1.EventType event_type = 1 [json_name = "eventType"];</code>
   * @return The eventType.
   */
  com.anduril.communicationsmanager.v1.EventType getEventType();

  /**
   * <code>.google.protobuf.Timestamp time = 2 [json_name = "time"];</code>
   * @return Whether the time field is set.
   */
  boolean hasTime();
  /**
   * <code>.google.protobuf.Timestamp time = 2 [json_name = "time"];</code>
   * @return The time.
   */
  com.google.protobuf.Timestamp getTime();
  /**
   * <code>.google.protobuf.Timestamp time = 2 [json_name = "time"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeOrBuilder();

  /**
   * <code>.anduril.communicationsmanager.v1.DistributionRule distribution_rule = 3 [json_name = "distributionRule"];</code>
   * @return Whether the distributionRule field is set.
   */
  boolean hasDistributionRule();
  /**
   * <code>.anduril.communicationsmanager.v1.DistributionRule distribution_rule = 3 [json_name = "distributionRule"];</code>
   * @return The distributionRule.
   */
  com.anduril.communicationsmanager.v1.DistributionRule getDistributionRule();
  /**
   * <code>.anduril.communicationsmanager.v1.DistributionRule distribution_rule = 3 [json_name = "distributionRule"];</code>
   */
  com.anduril.communicationsmanager.v1.DistributionRuleOrBuilder getDistributionRuleOrBuilder();
}
