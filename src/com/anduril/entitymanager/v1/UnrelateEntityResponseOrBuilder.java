// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/entity_manager_api.pub.proto

package com.anduril.entitymanager.v1;

public interface UnrelateEntityResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.UnrelateEntityResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Updated entity object with only Relationships component present.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
   * @return Whether the entity field is set.
   */
  boolean hasEntity();
  /**
   * <pre>
   * Updated entity object with only Relationships component present.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
   * @return The entity.
   */
  com.anduril.entitymanager.v1.Entity getEntity();
  /**
   * <pre>
   * Updated entity object with only Relationships component present.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
   */
  com.anduril.entitymanager.v1.EntityOrBuilder getEntityOrBuilder();
}
