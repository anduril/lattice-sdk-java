// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/entitymanager/v1/classification.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.entitymanager.v1;

public interface ClassificationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.Classification)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.anduril.entitymanager.v1.ClassificationLevels level = 1 [json_name = "level", deprecated = true];</code>
   * @deprecated anduril.entitymanager.v1.Classification.level is deprecated.
   *     See anduril/entitymanager/v1/classification.pub.proto;l=13
   * @return The enum numeric value on the wire for level.
   */
  @java.lang.Deprecated int getLevelValue();
  /**
   * <code>.anduril.entitymanager.v1.ClassificationLevels level = 1 [json_name = "level", deprecated = true];</code>
   * @deprecated anduril.entitymanager.v1.Classification.level is deprecated.
   *     See anduril/entitymanager/v1/classification.pub.proto;l=13
   * @return The level.
   */
  @java.lang.Deprecated com.anduril.entitymanager.v1.ClassificationLevels getLevel();

  /**
   * <pre>
   * The default classification information which should be assumed to apply to everything in
   * the entity unless a specific field level classification is present.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.ClassificationInformation default = 2 [json_name = "default"];</code>
   * @return Whether the default field is set.
   */
  boolean hasDefault();
  /**
   * <pre>
   * The default classification information which should be assumed to apply to everything in
   * the entity unless a specific field level classification is present.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.ClassificationInformation default = 2 [json_name = "default"];</code>
   * @return The default.
   */
  com.anduril.entitymanager.v1.ClassificationInformation getDefault();
  /**
   * <pre>
   * The default classification information which should be assumed to apply to everything in
   * the entity unless a specific field level classification is present.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.ClassificationInformation default = 2 [json_name = "default"];</code>
   */
  com.anduril.entitymanager.v1.ClassificationInformationOrBuilder getDefaultOrBuilder();

  /**
   * <pre>
   * The set of individual field classification information which should always precedence
   * over the default classification information.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.FieldClassificationInformation fields = 3 [json_name = "fields"];</code>
   */
  java.util.List<com.anduril.entitymanager.v1.FieldClassificationInformation> 
      getFieldsList();
  /**
   * <pre>
   * The set of individual field classification information which should always precedence
   * over the default classification information.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.FieldClassificationInformation fields = 3 [json_name = "fields"];</code>
   */
  com.anduril.entitymanager.v1.FieldClassificationInformation getFields(int index);
  /**
   * <pre>
   * The set of individual field classification information which should always precedence
   * over the default classification information.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.FieldClassificationInformation fields = 3 [json_name = "fields"];</code>
   */
  int getFieldsCount();
  /**
   * <pre>
   * The set of individual field classification information which should always precedence
   * over the default classification information.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.FieldClassificationInformation fields = 3 [json_name = "fields"];</code>
   */
  java.util.List<? extends com.anduril.entitymanager.v1.FieldClassificationInformationOrBuilder> 
      getFieldsOrBuilderList();
  /**
   * <pre>
   * The set of individual field classification information which should always precedence
   * over the default classification information.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.FieldClassificationInformation fields = 3 [json_name = "fields"];</code>
   */
  com.anduril.entitymanager.v1.FieldClassificationInformationOrBuilder getFieldsOrBuilder(
      int index);
}
