// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/entity.pub.proto

package com.anduril.entitymanager.v1;

public interface ProvenanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.Provenance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the integration that produced this entity
   * </pre>
   *
   * <code>string integration_name = 5 [json_name = "integrationName"];</code>
   * @return The integrationName.
   */
  java.lang.String getIntegrationName();
  /**
   * <pre>
   * Name of the integration that produced this entity
   * </pre>
   *
   * <code>string integration_name = 5 [json_name = "integrationName"];</code>
   * @return The bytes for integrationName.
   */
  com.google.protobuf.ByteString
      getIntegrationNameBytes();

  /**
   * <pre>
   * Source data type of this entity. Examples: ADSB, Link16, etc.
   * </pre>
   *
   * <code>string data_type = 6 [json_name = "dataType"];</code>
   * @return The dataType.
   */
  java.lang.String getDataType();
  /**
   * <pre>
   * Source data type of this entity. Examples: ADSB, Link16, etc.
   * </pre>
   *
   * <code>string data_type = 6 [json_name = "dataType"];</code>
   * @return The bytes for dataType.
   */
  com.google.protobuf.ByteString
      getDataTypeBytes();

  /**
   * <pre>
   * Enum defining the source TO BE DEPRECATED
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Source source = 1 [json_name = "source"];</code>
   * @return The enum numeric value on the wire for source.
   */
  int getSourceValue();
  /**
   * <pre>
   * Enum defining the source TO BE DEPRECATED
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Source source = 1 [json_name = "source"];</code>
   * @return The source.
   */
  com.anduril.entitymanager.v1.Source getSource();

  /**
   * <pre>
   * An ID that allows an element from a source to be uniquely identified
   * </pre>
   *
   * <code>string source_id = 3 [json_name = "sourceId"];</code>
   * @return The sourceId.
   */
  java.lang.String getSourceId();
  /**
   * <pre>
   * An ID that allows an element from a source to be uniquely identified
   * </pre>
   *
   * <code>string source_id = 3 [json_name = "sourceId"];</code>
   * @return The bytes for sourceId.
   */
  com.google.protobuf.ByteString
      getSourceIdBytes();

  /**
   * <pre>
   * The time, according to the source system, that the data in the entity was last modified. Generally, this should
   * be the time that the source-reported time of validity of the data in the entity. This field must be
   * updated with every change to the entity or else Entity Manager will discard the update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp source_update_time = 2 [json_name = "sourceUpdateTime"];</code>
   * @return Whether the sourceUpdateTime field is set.
   */
  boolean hasSourceUpdateTime();
  /**
   * <pre>
   * The time, according to the source system, that the data in the entity was last modified. Generally, this should
   * be the time that the source-reported time of validity of the data in the entity. This field must be
   * updated with every change to the entity or else Entity Manager will discard the update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp source_update_time = 2 [json_name = "sourceUpdateTime"];</code>
   * @return The sourceUpdateTime.
   */
  com.google.protobuf.Timestamp getSourceUpdateTime();
  /**
   * <pre>
   * The time, according to the source system, that the data in the entity was last modified. Generally, this should
   * be the time that the source-reported time of validity of the data in the entity. This field must be
   * updated with every change to the entity or else Entity Manager will discard the update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp source_update_time = 2 [json_name = "sourceUpdateTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getSourceUpdateTimeOrBuilder();

  /**
   * <pre>
   * Description of the modification source. In the case of a user this is the email address.
   * </pre>
   *
   * <code>string source_description = 4 [json_name = "sourceDescription"];</code>
   * @return The sourceDescription.
   */
  java.lang.String getSourceDescription();
  /**
   * <pre>
   * Description of the modification source. In the case of a user this is the email address.
   * </pre>
   *
   * <code>string source_description = 4 [json_name = "sourceDescription"];</code>
   * @return The bytes for sourceDescription.
   */
  com.google.protobuf.ByteString
      getSourceDescriptionBytes();
}
