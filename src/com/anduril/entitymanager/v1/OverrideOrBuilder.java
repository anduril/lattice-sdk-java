// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/entity.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.entitymanager.v1;

public interface OverrideOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.Override)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * override request id for an override request
   * </pre>
   *
   * <code>string request_id = 1 [json_name = "requestId"];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * override request id for an override request
   * </pre>
   *
   * <code>string request_id = 1 [json_name = "requestId"];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <pre>
   * proto field path which is the string representation of a field.
   * example: correlated.primary_entity_id would be primary_entity_id in correlated component
   * </pre>
   *
   * <code>string field_path = 2 [json_name = "fieldPath"];</code>
   * @return The fieldPath.
   */
  java.lang.String getFieldPath();
  /**
   * <pre>
   * proto field path which is the string representation of a field.
   * example: correlated.primary_entity_id would be primary_entity_id in correlated component
   * </pre>
   *
   * <code>string field_path = 2 [json_name = "fieldPath"];</code>
   * @return The bytes for fieldPath.
   */
  com.google.protobuf.ByteString
      getFieldPathBytes();

  /**
   * <pre>
   * new field value corresponding to field path. In the shape of an empty entity with only the changed value.
   * example: entity: { mil_view: { disposition: Disposition_DISPOSITION_HOSTILE } }
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Entity masked_field_value = 3 [json_name = "maskedFieldValue"];</code>
   * @return Whether the maskedFieldValue field is set.
   */
  boolean hasMaskedFieldValue();
  /**
   * <pre>
   * new field value corresponding to field path. In the shape of an empty entity with only the changed value.
   * example: entity: { mil_view: { disposition: Disposition_DISPOSITION_HOSTILE } }
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Entity masked_field_value = 3 [json_name = "maskedFieldValue"];</code>
   * @return The maskedFieldValue.
   */
  com.anduril.entitymanager.v1.Entity getMaskedFieldValue();
  /**
   * <pre>
   * new field value corresponding to field path. In the shape of an empty entity with only the changed value.
   * example: entity: { mil_view: { disposition: Disposition_DISPOSITION_HOSTILE } }
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Entity masked_field_value = 3 [json_name = "maskedFieldValue"];</code>
   */
  com.anduril.entitymanager.v1.EntityOrBuilder getMaskedFieldValueOrBuilder();

  /**
   * <pre>
   * status of the override
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.OverrideStatus status = 4 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * status of the override
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.OverrideStatus status = 4 [json_name = "status"];</code>
   * @return The status.
   */
  com.anduril.entitymanager.v1.OverrideStatus getStatus();

  /**
   * <code>.anduril.entitymanager.v1.Provenance provenance = 5 [json_name = "provenance"];</code>
   * @return Whether the provenance field is set.
   */
  boolean hasProvenance();
  /**
   * <code>.anduril.entitymanager.v1.Provenance provenance = 5 [json_name = "provenance"];</code>
   * @return The provenance.
   */
  com.anduril.entitymanager.v1.Provenance getProvenance();
  /**
   * <code>.anduril.entitymanager.v1.Provenance provenance = 5 [json_name = "provenance"];</code>
   */
  com.anduril.entitymanager.v1.ProvenanceOrBuilder getProvenanceOrBuilder();

  /**
   * <pre>
   * The type of the override, defined by the stage of the entity lifecycle that the entity was in when the override
   * was requested.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.OverrideType type = 6 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * The type of the override, defined by the stage of the entity lifecycle that the entity was in when the override
   * was requested.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.OverrideType type = 6 [json_name = "type"];</code>
   * @return The type.
   */
  com.anduril.entitymanager.v1.OverrideType getType();

  /**
   * <pre>
   * Timestamp of the override request. The timestamp is generated by the Entity Manager instance that receives the request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp request_timestamp = 7 [json_name = "requestTimestamp"];</code>
   * @return Whether the requestTimestamp field is set.
   */
  boolean hasRequestTimestamp();
  /**
   * <pre>
   * Timestamp of the override request. The timestamp is generated by the Entity Manager instance that receives the request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp request_timestamp = 7 [json_name = "requestTimestamp"];</code>
   * @return The requestTimestamp.
   */
  com.google.protobuf.Timestamp getRequestTimestamp();
  /**
   * <pre>
   * Timestamp of the override request. The timestamp is generated by the Entity Manager instance that receives the request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp request_timestamp = 7 [json_name = "requestTimestamp"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getRequestTimestampOrBuilder();
}
