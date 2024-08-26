// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/entity_manager_api.pub.proto

package com.anduril.entitymanager.v1;

public interface RelateEntityRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.RelateEntityRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The entity onto which relationships are being added.
   * </pre>
   *
   * <code>string entity_id = 1 [json_name = "entityId"];</code>
   * @return The entityId.
   */
  java.lang.String getEntityId();
  /**
   * <pre>
   * The entity onto which relationships are being added.
   * </pre>
   *
   * <code>string entity_id = 1 [json_name = "entityId"];</code>
   * @return The bytes for entityId.
   */
  com.google.protobuf.ByteString
      getEntityIdBytes();

  /**
   * <pre>
   * The relationships to add to the entity.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.RelationshipRequest relationships = 2 [json_name = "relationships"];</code>
   */
  java.util.List<com.anduril.entitymanager.v1.RelationshipRequest> 
      getRelationshipsList();
  /**
   * <pre>
   * The relationships to add to the entity.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.RelationshipRequest relationships = 2 [json_name = "relationships"];</code>
   */
  com.anduril.entitymanager.v1.RelationshipRequest getRelationships(int index);
  /**
   * <pre>
   * The relationships to add to the entity.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.RelationshipRequest relationships = 2 [json_name = "relationships"];</code>
   */
  int getRelationshipsCount();
  /**
   * <pre>
   * The relationships to add to the entity.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.RelationshipRequest relationships = 2 [json_name = "relationships"];</code>
   */
  java.util.List<? extends com.anduril.entitymanager.v1.RelationshipRequestOrBuilder> 
      getRelationshipsOrBuilderList();
  /**
   * <pre>
   * The relationships to add to the entity.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.RelationshipRequest relationships = 2 [json_name = "relationships"];</code>
   */
  com.anduril.entitymanager.v1.RelationshipRequestOrBuilder getRelationshipsOrBuilder(
      int index);
}
