// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/shared/isr.pub.proto

package com.anduril.tasks.v2;

public interface ISRParametersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.tasks.v2.ISRParameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Indicates the target speed of the asset. DEPRECATION NOTE: deprecated in favor
   * of speed_ms since we might have legacy integrations not conforming to the meters per second units.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue speed = 1 [json_name = "speed", deprecated = true];</code>
   * @deprecated anduril.tasks.v2.ISRParameters.speed is deprecated.
   *     See anduril/tasks/v2/shared/isr.pub.proto;l=144
   * @return Whether the speed field is set.
   */
  @java.lang.Deprecated boolean hasSpeed();
  /**
   * <pre>
   * Indicates the target speed of the asset. DEPRECATION NOTE: deprecated in favor
   * of speed_ms since we might have legacy integrations not conforming to the meters per second units.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue speed = 1 [json_name = "speed", deprecated = true];</code>
   * @deprecated anduril.tasks.v2.ISRParameters.speed is deprecated.
   *     See anduril/tasks/v2/shared/isr.pub.proto;l=144
   * @return The speed.
   */
  @java.lang.Deprecated com.google.protobuf.FloatValue getSpeed();
  /**
   * <pre>
   * Indicates the target speed of the asset. DEPRECATION NOTE: deprecated in favor
   * of speed_ms since we might have legacy integrations not conforming to the meters per second units.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue speed = 1 [json_name = "speed", deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.FloatValueOrBuilder getSpeedOrBuilder();

  /**
   * <pre>
   * Indicates the target speed of the asset. Units are meters per second.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue speed_m_s = 2 [json_name = "speedMS"];</code>
   * @return Whether the speedMS field is set.
   */
  boolean hasSpeedMS();
  /**
   * <pre>
   * Indicates the target speed of the asset. Units are meters per second.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue speed_m_s = 2 [json_name = "speedMS"];</code>
   * @return The speedMS.
   */
  com.google.protobuf.FloatValue getSpeedMS();
  /**
   * <pre>
   * Indicates the target speed of the asset. Units are meters per second.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue speed_m_s = 2 [json_name = "speedMS"];</code>
   */
  com.google.protobuf.FloatValueOrBuilder getSpeedMSOrBuilder();

  /**
   * <pre>
   * Indicates the standoff distance from the objective. The units are in meters.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue standoff_distance_m = 3 [json_name = "standoffDistanceM"];</code>
   * @return Whether the standoffDistanceM field is set.
   */
  boolean hasStandoffDistanceM();
  /**
   * <pre>
   * Indicates the standoff distance from the objective. The units are in meters.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue standoff_distance_m = 3 [json_name = "standoffDistanceM"];</code>
   * @return The standoffDistanceM.
   */
  com.google.protobuf.FloatValue getStandoffDistanceM();
  /**
   * <pre>
   * Indicates the standoff distance from the objective. The units are in meters.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue standoff_distance_m = 3 [json_name = "standoffDistanceM"];</code>
   */
  com.google.protobuf.FloatValueOrBuilder getStandoffDistanceMOrBuilder();

  /**
   * <pre>
   * Indicates the standoff distance from the objective. DEPRECATION NOTE: deprecated in favor of standoff_distance_m
   *  since we might have legacy integrations not conforming to the meters unit.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue standoff_distance = 4 [json_name = "standoffDistance", deprecated = true];</code>
   * @deprecated anduril.tasks.v2.ISRParameters.standoff_distance is deprecated.
   *     See anduril/tasks/v2/shared/isr.pub.proto;l=151
   * @return Whether the standoffDistance field is set.
   */
  @java.lang.Deprecated boolean hasStandoffDistance();
  /**
   * <pre>
   * Indicates the standoff distance from the objective. DEPRECATION NOTE: deprecated in favor of standoff_distance_m
   *  since we might have legacy integrations not conforming to the meters unit.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue standoff_distance = 4 [json_name = "standoffDistance", deprecated = true];</code>
   * @deprecated anduril.tasks.v2.ISRParameters.standoff_distance is deprecated.
   *     See anduril/tasks/v2/shared/isr.pub.proto;l=151
   * @return The standoffDistance.
   */
  @java.lang.Deprecated com.google.protobuf.FloatValue getStandoffDistance();
  /**
   * <pre>
   * Indicates the standoff distance from the objective. DEPRECATION NOTE: deprecated in favor of standoff_distance_m
   *  since we might have legacy integrations not conforming to the meters unit.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue standoff_distance = 4 [json_name = "standoffDistance", deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.FloatValueOrBuilder getStandoffDistanceOrBuilder();

  /**
   * <pre>
   * Indicates the standoff angle relative to the objective's bearing orientation (defaults to north).
   * In particular, the asset should approach target from this angle. Units in degrees.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue standoff_angle = 5 [json_name = "standoffAngle"];</code>
   * @return Whether the standoffAngle field is set.
   */
  boolean hasStandoffAngle();
  /**
   * <pre>
   * Indicates the standoff angle relative to the objective's bearing orientation (defaults to north).
   * In particular, the asset should approach target from this angle. Units in degrees.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue standoff_angle = 5 [json_name = "standoffAngle"];</code>
   * @return The standoffAngle.
   */
  com.google.protobuf.FloatValue getStandoffAngle();
  /**
   * <pre>
   * Indicates the standoff angle relative to the objective's bearing orientation (defaults to north).
   * In particular, the asset should approach target from this angle. Units in degrees.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue standoff_angle = 5 [json_name = "standoffAngle"];</code>
   */
  com.google.protobuf.FloatValueOrBuilder getStandoffAngleOrBuilder();

  /**
   * <pre>
   * Indicates the amount of time in milliseconds to execute an ISR task before expiring. 0 value indicates no
   * expiration.
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value expiration_time_ms = 6 [json_name = "expirationTimeMs"];</code>
   * @return Whether the expirationTimeMs field is set.
   */
  boolean hasExpirationTimeMs();
  /**
   * <pre>
   * Indicates the amount of time in milliseconds to execute an ISR task before expiring. 0 value indicates no
   * expiration.
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value expiration_time_ms = 6 [json_name = "expirationTimeMs"];</code>
   * @return The expirationTimeMs.
   */
  com.google.protobuf.UInt64Value getExpirationTimeMs();
  /**
   * <pre>
   * Indicates the amount of time in milliseconds to execute an ISR task before expiring. 0 value indicates no
   * expiration.
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value expiration_time_ms = 6 [json_name = "expirationTimeMs"];</code>
   */
  com.google.protobuf.UInt64ValueOrBuilder getExpirationTimeMsOrBuilder();
}