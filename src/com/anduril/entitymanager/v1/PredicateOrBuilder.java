// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/entitymanager/v1/filter.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.entitymanager.v1;

public interface PredicateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.Predicate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The field_path determines which field on an entity is being referenced in this predicate. For
   * example: correlated.primary_entity_id would be primary_entity_id in correlated component.
   * </pre>
   *
   * <code>string field_path = 1 [json_name = "fieldPath"];</code>
   * @return The fieldPath.
   */
  java.lang.String getFieldPath();
  /**
   * <pre>
   * The field_path determines which field on an entity is being referenced in this predicate. For
   * example: correlated.primary_entity_id would be primary_entity_id in correlated component.
   * </pre>
   *
   * <code>string field_path = 1 [json_name = "fieldPath"];</code>
   * @return The bytes for fieldPath.
   */
  com.google.protobuf.ByteString
      getFieldPathBytes();

  /**
   * <pre>
   * The value determines the fixed value against which the entity field is to be compared.
   * In the case of COMPARATOR_MATCH_ALL, the value contents do not matter as long as the Value is a supported
   * type.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Value value = 2 [json_name = "value"];</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <pre>
   * The value determines the fixed value against which the entity field is to be compared.
   * In the case of COMPARATOR_MATCH_ALL, the value contents do not matter as long as the Value is a supported
   * type.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Value value = 2 [json_name = "value"];</code>
   * @return The value.
   */
  com.anduril.entitymanager.v1.Value getValue();
  /**
   * <pre>
   * The value determines the fixed value against which the entity field is to be compared.
   * In the case of COMPARATOR_MATCH_ALL, the value contents do not matter as long as the Value is a supported
   * type.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Value value = 2 [json_name = "value"];</code>
   */
  com.anduril.entitymanager.v1.ValueOrBuilder getValueOrBuilder();

  /**
   * <pre>
   * The comparator determines the manner in which the entity field and static value are compared.
   * Comparators may only be applied to certain values. For example, the WITHIN comparator cannot
   * be used for a boolean value comparison.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Comparator comparator = 3 [json_name = "comparator"];</code>
   * @return The enum numeric value on the wire for comparator.
   */
  int getComparatorValue();
  /**
   * <pre>
   * The comparator determines the manner in which the entity field and static value are compared.
   * Comparators may only be applied to certain values. For example, the WITHIN comparator cannot
   * be used for a boolean value comparison.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Comparator comparator = 3 [json_name = "comparator"];</code>
   * @return The comparator.
   */
  com.anduril.entitymanager.v1.Comparator getComparator();
}
