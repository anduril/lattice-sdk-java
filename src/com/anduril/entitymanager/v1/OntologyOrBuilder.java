// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/ontology.pub.proto

package com.anduril.entitymanager.v1;

public interface OntologyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.Ontology)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A string that describes the entity's high-level type with natural language.
   * Examples include "FIGHTER", "TANK", "AIRCRAFT CARRIER", "UAV".
   * </pre>
   *
   * <code>string platform_type = 3 [json_name = "platformType", (.anduril.entitymanager.v1.overridable) = true];</code>
   * @return The platformType.
   */
  java.lang.String getPlatformType();
  /**
   * <pre>
   * A string that describes the entity's high-level type with natural language.
   * Examples include "FIGHTER", "TANK", "AIRCRAFT CARRIER", "UAV".
   * </pre>
   *
   * <code>string platform_type = 3 [json_name = "platformType", (.anduril.entitymanager.v1.overridable) = true];</code>
   * @return The bytes for platformType.
   */
  com.google.protobuf.ByteString
      getPlatformTypeBytes();

  /**
   * <pre>
   * A string that describes the entity's exact model or type.
   * Examples include "F-16", "NASAMS-LCHR", "ARLEIGH BURKE DDG", "GHOST".
   * </pre>
   *
   * <code>string specific_type = 4 [json_name = "specificType", (.anduril.entitymanager.v1.overridable) = true];</code>
   * @return The specificType.
   */
  java.lang.String getSpecificType();
  /**
   * <pre>
   * A string that describes the entity's exact model or type.
   * Examples include "F-16", "NASAMS-LCHR", "ARLEIGH BURKE DDG", "GHOST".
   * </pre>
   *
   * <code>string specific_type = 4 [json_name = "specificType", (.anduril.entitymanager.v1.overridable) = true];</code>
   * @return The bytes for specificType.
   */
  com.google.protobuf.ByteString
      getSpecificTypeBytes();

  /**
   * <pre>
   * The template used when creating this entity. Specifies minimum required components.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Template template = 2 [json_name = "template"];</code>
   * @return The enum numeric value on the wire for template.
   */
  int getTemplateValue();
  /**
   * <pre>
   * The template used when creating this entity. Specifies minimum required components.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Template template = 2 [json_name = "template"];</code>
   * @return The template.
   */
  com.anduril.entitymanager.v1.Template getTemplate();
}
