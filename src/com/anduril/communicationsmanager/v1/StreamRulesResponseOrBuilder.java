// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/communicationsmanager/v1/communications_manager_api.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.communicationsmanager.v1;

public interface StreamRulesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.communicationsmanager.v1.StreamRulesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.anduril.communicationsmanager.v1.RuleEvent rule_event = 2 [json_name = "ruleEvent"];</code>
   * @return Whether the ruleEvent field is set.
   */
  boolean hasRuleEvent();
  /**
   * <code>.anduril.communicationsmanager.v1.RuleEvent rule_event = 2 [json_name = "ruleEvent"];</code>
   * @return The ruleEvent.
   */
  com.anduril.communicationsmanager.v1.RuleEvent getRuleEvent();
  /**
   * <code>.anduril.communicationsmanager.v1.RuleEvent rule_event = 2 [json_name = "ruleEvent"];</code>
   */
  com.anduril.communicationsmanager.v1.RuleEventOrBuilder getRuleEventOrBuilder();

  /**
   * <pre>
   * To be DEPRECATED. Use `RuleEvent`
   * </pre>
   *
   * <code>.anduril.communicationsmanager.v1.DistributionRuleEvent distribution_rule_event = 1 [json_name = "distributionRuleEvent"];</code>
   * @return Whether the distributionRuleEvent field is set.
   */
  boolean hasDistributionRuleEvent();
  /**
   * <pre>
   * To be DEPRECATED. Use `RuleEvent`
   * </pre>
   *
   * <code>.anduril.communicationsmanager.v1.DistributionRuleEvent distribution_rule_event = 1 [json_name = "distributionRuleEvent"];</code>
   * @return The distributionRuleEvent.
   */
  com.anduril.communicationsmanager.v1.DistributionRuleEvent getDistributionRuleEvent();
  /**
   * <pre>
   * To be DEPRECATED. Use `RuleEvent`
   * </pre>
   *
   * <code>.anduril.communicationsmanager.v1.DistributionRuleEvent distribution_rule_event = 1 [json_name = "distributionRuleEvent"];</code>
   */
  com.anduril.communicationsmanager.v1.DistributionRuleEventOrBuilder getDistributionRuleEventOrBuilder();
}
