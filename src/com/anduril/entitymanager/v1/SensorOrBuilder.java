// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/sensors.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.entitymanager.v1;

public interface SensorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.Sensor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This generally is used to indicate a specific type at a more detailed granularity. E.g. COMInt, LWIR or Echodyne
   * </pre>
   *
   * <code>string sensor_id = 1 [json_name = "sensorId", (.anduril.entitymanager.v1.componentIdentifier) = true];</code>
   * @return The sensorId.
   */
  java.lang.String getSensorId();
  /**
   * <pre>
   * This generally is used to indicate a specific type at a more detailed granularity. E.g. COMInt, LWIR or Echodyne
   * </pre>
   *
   * <code>string sensor_id = 1 [json_name = "sensorId", (.anduril.entitymanager.v1.componentIdentifier) = true];</code>
   * @return The bytes for sensorId.
   */
  com.google.protobuf.ByteString
      getSensorIdBytes();

  /**
   * <code>.anduril.entitymanager.v1.OperationalState operational_state = 3 [json_name = "operationalState"];</code>
   * @return The enum numeric value on the wire for operationalState.
   */
  int getOperationalStateValue();
  /**
   * <code>.anduril.entitymanager.v1.OperationalState operational_state = 3 [json_name = "operationalState"];</code>
   * @return The operationalState.
   */
  com.anduril.entitymanager.v1.OperationalState getOperationalState();

  /**
   * <pre>
   * DEPRECATED -- use `fields_of_view` instead. This field will be marked deprecated and no longer populated by 11/26/2023.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.FieldOfView field_of_view = 4 [json_name = "fieldOfView"];</code>
   * @return Whether the fieldOfView field is set.
   */
  boolean hasFieldOfView();
  /**
   * <pre>
   * DEPRECATED -- use `fields_of_view` instead. This field will be marked deprecated and no longer populated by 11/26/2023.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.FieldOfView field_of_view = 4 [json_name = "fieldOfView"];</code>
   * @return The fieldOfView.
   */
  com.anduril.entitymanager.v1.FieldOfView getFieldOfView();
  /**
   * <pre>
   * DEPRECATED -- use `fields_of_view` instead. This field will be marked deprecated and no longer populated by 11/26/2023.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.FieldOfView field_of_view = 4 [json_name = "fieldOfView"];</code>
   */
  com.anduril.entitymanager.v1.FieldOfViewOrBuilder getFieldOfViewOrBuilder();

  /**
   * <pre>
   * The type of sensor
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.SensorType sensor_type = 5 [json_name = "sensorType"];</code>
   * @return The enum numeric value on the wire for sensorType.
   */
  int getSensorTypeValue();
  /**
   * <pre>
   * The type of sensor
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.SensorType sensor_type = 5 [json_name = "sensorType"];</code>
   * @return The sensorType.
   */
  com.anduril.entitymanager.v1.SensorType getSensorType();

  /**
   * <pre>
   * A human readable description of the sensor
   * </pre>
   *
   * <code>string sensor_description = 6 [json_name = "sensorDescription"];</code>
   * @return The sensorDescription.
   */
  java.lang.String getSensorDescription();
  /**
   * <pre>
   * A human readable description of the sensor
   * </pre>
   *
   * <code>string sensor_description = 6 [json_name = "sensorDescription"];</code>
   * @return The bytes for sensorDescription.
   */
  com.google.protobuf.ByteString
      getSensorDescriptionBytes();

  /**
   * <pre>
   * RF configuration details of the sensor
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.RFConfiguration rf_configuraton = 7 [json_name = "rfConfiguraton"];</code>
   * @return Whether the rfConfiguraton field is set.
   */
  boolean hasRfConfiguraton();
  /**
   * <pre>
   * RF configuration details of the sensor
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.RFConfiguration rf_configuraton = 7 [json_name = "rfConfiguraton"];</code>
   * @return The rfConfiguraton.
   */
  com.anduril.entitymanager.v1.RFConfiguration getRfConfiguraton();
  /**
   * <pre>
   * RF configuration details of the sensor
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.RFConfiguration rf_configuraton = 7 [json_name = "rfConfiguraton"];</code>
   */
  com.anduril.entitymanager.v1.RFConfigurationOrBuilder getRfConfiguratonOrBuilder();

  /**
   * <pre>
   * Time of the latest detection from the sensor
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_detection_timestamp = 8 [json_name = "lastDetectionTimestamp"];</code>
   * @return Whether the lastDetectionTimestamp field is set.
   */
  boolean hasLastDetectionTimestamp();
  /**
   * <pre>
   * Time of the latest detection from the sensor
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_detection_timestamp = 8 [json_name = "lastDetectionTimestamp"];</code>
   * @return The lastDetectionTimestamp.
   */
  com.google.protobuf.Timestamp getLastDetectionTimestamp();
  /**
   * <pre>
   * Time of the latest detection from the sensor
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_detection_timestamp = 8 [json_name = "lastDetectionTimestamp"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastDetectionTimestampOrBuilder();

  /**
   * <pre>
   * Multiple fields of view for a single sensor component
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.FieldOfView fields_of_view = 9 [json_name = "fieldsOfView"];</code>
   */
  java.util.List<com.anduril.entitymanager.v1.FieldOfView> 
      getFieldsOfViewList();
  /**
   * <pre>
   * Multiple fields of view for a single sensor component
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.FieldOfView fields_of_view = 9 [json_name = "fieldsOfView"];</code>
   */
  com.anduril.entitymanager.v1.FieldOfView getFieldsOfView(int index);
  /**
   * <pre>
   * Multiple fields of view for a single sensor component
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.FieldOfView fields_of_view = 9 [json_name = "fieldsOfView"];</code>
   */
  int getFieldsOfViewCount();
  /**
   * <pre>
   * Multiple fields of view for a single sensor component
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.FieldOfView fields_of_view = 9 [json_name = "fieldsOfView"];</code>
   */
  java.util.List<? extends com.anduril.entitymanager.v1.FieldOfViewOrBuilder> 
      getFieldsOfViewOrBuilderList();
  /**
   * <pre>
   * Multiple fields of view for a single sensor component
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.FieldOfView fields_of_view = 9 [json_name = "fieldsOfView"];</code>
   */
  com.anduril.entitymanager.v1.FieldOfViewOrBuilder getFieldsOfViewOrBuilder(
      int index);
}
