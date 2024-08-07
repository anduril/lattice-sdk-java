// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/entity_manager_api.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.entitymanager.v1;

public interface OverrideEntityRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.OverrideEntityRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The entity containing the overwritten fields. The service will extract the overridable fields from the entity
   * object and ignore any other fields.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
   * @return Whether the entity field is set.
   */
  boolean hasEntity();
  /**
   * <pre>
   * The entity containing the overwritten fields. The service will extract the overridable fields from the entity
   * object and ignore any other fields.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
   * @return The entity.
   */
  com.anduril.entitymanager.v1.Entity getEntity();
  /**
   * <pre>
   * The entity containing the overwritten fields. The service will extract the overridable fields from the entity
   * object and ignore any other fields.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
   */
  com.anduril.entitymanager.v1.EntityOrBuilder getEntityOrBuilder();

  /**
   * <pre>
   * The field paths that will be extracted from the Entity and saved as an override. Only fields marked overridable can
   * be overriden.
   * </pre>
   *
   * <code>repeated string field_path = 2 [json_name = "fieldPath"];</code>
   * @return A list containing the fieldPath.
   */
  java.util.List<java.lang.String>
      getFieldPathList();
  /**
   * <pre>
   * The field paths that will be extracted from the Entity and saved as an override. Only fields marked overridable can
   * be overriden.
   * </pre>
   *
   * <code>repeated string field_path = 2 [json_name = "fieldPath"];</code>
   * @return The count of fieldPath.
   */
  int getFieldPathCount();
  /**
   * <pre>
   * The field paths that will be extracted from the Entity and saved as an override. Only fields marked overridable can
   * be overriden.
   * </pre>
   *
   * <code>repeated string field_path = 2 [json_name = "fieldPath"];</code>
   * @param index The index of the element to return.
   * @return The fieldPath at the given index.
   */
  java.lang.String getFieldPath(int index);
  /**
   * <pre>
   * The field paths that will be extracted from the Entity and saved as an override. Only fields marked overridable can
   * be overriden.
   * </pre>
   *
   * <code>repeated string field_path = 2 [json_name = "fieldPath"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the fieldPath at the given index.
   */
  com.google.protobuf.ByteString
      getFieldPathBytes(int index);

  /**
   * <pre>
   * Additional information about the source of the override
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Provenance provenance = 3 [json_name = "provenance"];</code>
   * @return Whether the provenance field is set.
   */
  boolean hasProvenance();
  /**
   * <pre>
   * Additional information about the source of the override
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Provenance provenance = 3 [json_name = "provenance"];</code>
   * @return The provenance.
   */
  com.anduril.entitymanager.v1.Provenance getProvenance();
  /**
   * <pre>
   * Additional information about the source of the override
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Provenance provenance = 3 [json_name = "provenance"];</code>
   */
  com.anduril.entitymanager.v1.ProvenanceOrBuilder getProvenanceOrBuilder();
}
