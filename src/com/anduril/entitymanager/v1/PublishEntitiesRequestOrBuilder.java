// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/entity_manager_grpcapi.pub.proto

package com.anduril.entitymanager.v1;

public interface PublishEntitiesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.PublishEntitiesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Sends a stream of entity objects to publish.
   * Each entity requires the following fields:
   *   * expiry_time. This must be in the future, but less than 30 days from now.
   *   * provenance.data_type.
   *   * provenance.source_update_time. This can be earlier than the RPC call if the data entered is older.
   *   * aliases.name
   *   * ontology.template
   * For additional required fields that are determined by template, see com.anduril.entitymanager.v1.Template.
   * If an entity_id is provided, the entity updates. If no entity_id is provided, the entity is created.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
   * @return Whether the entity field is set.
   */
  boolean hasEntity();
  /**
   * <pre>
   * Sends a stream of entity objects to publish.
   * Each entity requires the following fields:
   *   * expiry_time. This must be in the future, but less than 30 days from now.
   *   * provenance.data_type.
   *   * provenance.source_update_time. This can be earlier than the RPC call if the data entered is older.
   *   * aliases.name
   *   * ontology.template
   * For additional required fields that are determined by template, see com.anduril.entitymanager.v1.Template.
   * If an entity_id is provided, the entity updates. If no entity_id is provided, the entity is created.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
   * @return The entity.
   */
  com.anduril.entitymanager.v1.Entity getEntity();
  /**
   * <pre>
   * Sends a stream of entity objects to publish.
   * Each entity requires the following fields:
   *   * expiry_time. This must be in the future, but less than 30 days from now.
   *   * provenance.data_type.
   *   * provenance.source_update_time. This can be earlier than the RPC call if the data entered is older.
   *   * aliases.name
   *   * ontology.template
   * For additional required fields that are determined by template, see com.anduril.entitymanager.v1.Template.
   * If an entity_id is provided, the entity updates. If no entity_id is provided, the entity is created.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
   */
  com.anduril.entitymanager.v1.EntityOrBuilder getEntityOrBuilder();
}
