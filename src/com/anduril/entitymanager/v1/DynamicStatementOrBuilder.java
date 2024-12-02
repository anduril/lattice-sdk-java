// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/filter_dynamic.pub.proto

package com.anduril.entitymanager.v1;

public interface DynamicStatementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.DynamicStatement)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The filter statement is used to determine which entities can be compared to the dynamic series
   * of entities aggregated by the selector statement.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Statement filter = 1 [json_name = "filter"];</code>
   * @return Whether the filter field is set.
   */
  boolean hasFilter();
  /**
   * <pre>
   * The filter statement is used to determine which entities can be compared to the dynamic series
   * of entities aggregated by the selector statement.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Statement filter = 1 [json_name = "filter"];</code>
   * @return The filter.
   */
  com.anduril.entitymanager.v1.Statement getFilter();
  /**
   * <pre>
   * The filter statement is used to determine which entities can be compared to the dynamic series
   * of entities aggregated by the selector statement.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Statement filter = 1 [json_name = "filter"];</code>
   */
  com.anduril.entitymanager.v1.StatementOrBuilder getFilterOrBuilder();

  /**
   * <pre>
   * The selector statement is used to determine which entities should be a part of dynamically
   * changing set. The selector should be reevaluated as entites are created or deleted.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Statement selector = 2 [json_name = "selector"];</code>
   * @return Whether the selector field is set.
   */
  boolean hasSelector();
  /**
   * <pre>
   * The selector statement is used to determine which entities should be a part of dynamically
   * changing set. The selector should be reevaluated as entites are created or deleted.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Statement selector = 2 [json_name = "selector"];</code>
   * @return The selector.
   */
  com.anduril.entitymanager.v1.Statement getSelector();
  /**
   * <pre>
   * The selector statement is used to determine which entities should be a part of dynamically
   * changing set. The selector should be reevaluated as entites are created or deleted.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Statement selector = 2 [json_name = "selector"];</code>
   */
  com.anduril.entitymanager.v1.StatementOrBuilder getSelectorOrBuilder();

  /**
   * <pre>
   * The comparator specifies how the set intersection operation will be performed.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.IntersectionComparator comparator = 3 [json_name = "comparator"];</code>
   * @return Whether the comparator field is set.
   */
  boolean hasComparator();
  /**
   * <pre>
   * The comparator specifies how the set intersection operation will be performed.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.IntersectionComparator comparator = 3 [json_name = "comparator"];</code>
   * @return The comparator.
   */
  com.anduril.entitymanager.v1.IntersectionComparator getComparator();
  /**
   * <pre>
   * The comparator specifies how the set intersection operation will be performed.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.IntersectionComparator comparator = 3 [json_name = "comparator"];</code>
   */
  com.anduril.entitymanager.v1.IntersectionComparatorOrBuilder getComparatorOrBuilder();
}