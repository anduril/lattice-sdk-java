// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/communicationsmanager/v1/common.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.communicationsmanager.v1;

public interface EntityDistributionRuleDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.communicationsmanager.v1.EntityDistributionRuleDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Controls the filtering which should be applied in the compliant service.
   * TO BE DEPRECATED, use entity_filter_selection
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Statement entity_filter = 1 [json_name = "entityFilter"];</code>
   * @return Whether the entityFilter field is set.
   */
  boolean hasEntityFilter();
  /**
   * <pre>
   * Controls the filtering which should be applied in the compliant service.
   * TO BE DEPRECATED, use entity_filter_selection
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Statement entity_filter = 1 [json_name = "entityFilter"];</code>
   * @return The entityFilter.
   */
  com.anduril.entitymanager.v1.Statement getEntityFilter();
  /**
   * <pre>
   * Controls the filtering which should be applied in the compliant service.
   * TO BE DEPRECATED, use entity_filter_selection
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Statement entity_filter = 1 [json_name = "entityFilter"];</code>
   */
  com.anduril.entitymanager.v1.StatementOrBuilder getEntityFilterOrBuilder();

  /**
   * <pre>
   * Controls the filtering which should be applied in the compliant service.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Statement static_statement = 2 [json_name = "staticStatement"];</code>
   * @return Whether the staticStatement field is set.
   */
  boolean hasStaticStatement();
  /**
   * <pre>
   * Controls the filtering which should be applied in the compliant service.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Statement static_statement = 2 [json_name = "staticStatement"];</code>
   * @return The staticStatement.
   */
  com.anduril.entitymanager.v1.Statement getStaticStatement();
  /**
   * <pre>
   * Controls the filtering which should be applied in the compliant service.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Statement static_statement = 2 [json_name = "staticStatement"];</code>
   */
  com.anduril.entitymanager.v1.StatementOrBuilder getStaticStatementOrBuilder();

  /**
   * <pre>
   * Used for matching location details.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.DynamicStatement dynamic_statement = 3 [json_name = "dynamicStatement"];</code>
   * @return Whether the dynamicStatement field is set.
   */
  boolean hasDynamicStatement();
  /**
   * <pre>
   * Used for matching location details.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.DynamicStatement dynamic_statement = 3 [json_name = "dynamicStatement"];</code>
   * @return The dynamicStatement.
   */
  com.anduril.entitymanager.v1.DynamicStatement getDynamicStatement();
  /**
   * <pre>
   * Used for matching location details.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.DynamicStatement dynamic_statement = 3 [json_name = "dynamicStatement"];</code>
   */
  com.anduril.entitymanager.v1.DynamicStatementOrBuilder getDynamicStatementOrBuilder();

  com.anduril.communicationsmanager.v1.EntityDistributionRuleDetails.EntityFilterSelectionCase getEntityFilterSelectionCase();
}
