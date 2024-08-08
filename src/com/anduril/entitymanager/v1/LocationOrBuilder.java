// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/location.pub.proto

package com.anduril.entitymanager.v1;

public interface LocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.Location)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * see Position definition for details. We opt not to use anduril type for altitude clarity.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Position position = 1 [json_name = "position"];</code>
   * @return Whether the position field is set.
   */
  boolean hasPosition();
  /**
   * <pre>
   * see Position definition for details. We opt not to use anduril type for altitude clarity.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Position position = 1 [json_name = "position"];</code>
   * @return The position.
   */
  com.anduril.entitymanager.v1.Position getPosition();
  /**
   * <pre>
   * see Position definition for details. We opt not to use anduril type for altitude clarity.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Position position = 1 [json_name = "position"];</code>
   */
  com.anduril.entitymanager.v1.PositionOrBuilder getPositionOrBuilder();

  /**
   * <pre>
   * Velocity in an ENU reference frame centered on the corresponding position. All units are meters per second.
   * </pre>
   *
   * <code>.anduril.type.ENU velocity_enu = 2 [json_name = "velocityEnu"];</code>
   * @return Whether the velocityEnu field is set.
   */
  boolean hasVelocityEnu();
  /**
   * <pre>
   * Velocity in an ENU reference frame centered on the corresponding position. All units are meters per second.
   * </pre>
   *
   * <code>.anduril.type.ENU velocity_enu = 2 [json_name = "velocityEnu"];</code>
   * @return The velocityEnu.
   */
  com.anduril.type.ENU getVelocityEnu();
  /**
   * <pre>
   * Velocity in an ENU reference frame centered on the corresponding position. All units are meters per second.
   * </pre>
   *
   * <code>.anduril.type.ENU velocity_enu = 2 [json_name = "velocityEnu"];</code>
   */
  com.anduril.type.ENUOrBuilder getVelocityEnuOrBuilder();

  /**
   * <pre>
   * Speed is the magnitude of velocity_enu vector [sqrt(e^2 + n^2 + u^2)] when present, measured in m/s.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue speed_mps = 5 [json_name = "speedMps"];</code>
   * @return Whether the speedMps field is set.
   */
  boolean hasSpeedMps();
  /**
   * <pre>
   * Speed is the magnitude of velocity_enu vector [sqrt(e^2 + n^2 + u^2)] when present, measured in m/s.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue speed_mps = 5 [json_name = "speedMps"];</code>
   * @return The speedMps.
   */
  com.google.protobuf.DoubleValue getSpeedMps();
  /**
   * <pre>
   * Speed is the magnitude of velocity_enu vector [sqrt(e^2 + n^2 + u^2)] when present, measured in m/s.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue speed_mps = 5 [json_name = "speedMps"];</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getSpeedMpsOrBuilder();

  /**
   * <pre>
   * The entity's acceleration in meters/s^2.
   * </pre>
   *
   * <code>.anduril.type.ENU acceleration = 4 [json_name = "acceleration"];</code>
   * @return Whether the acceleration field is set.
   */
  boolean hasAcceleration();
  /**
   * <pre>
   * The entity's acceleration in meters/s^2.
   * </pre>
   *
   * <code>.anduril.type.ENU acceleration = 4 [json_name = "acceleration"];</code>
   * @return The acceleration.
   */
  com.anduril.type.ENU getAcceleration();
  /**
   * <pre>
   * The entity's acceleration in meters/s^2.
   * </pre>
   *
   * <code>.anduril.type.ENU acceleration = 4 [json_name = "acceleration"];</code>
   */
  com.anduril.type.ENUOrBuilder getAccelerationOrBuilder();

  /**
   * <pre>
   * quaternion to translate from entity body frame to it's ENU frame
   * </pre>
   *
   * <code>.anduril.type.Quaternion attitude_enu = 3 [json_name = "attitudeEnu"];</code>
   * @return Whether the attitudeEnu field is set.
   */
  boolean hasAttitudeEnu();
  /**
   * <pre>
   * quaternion to translate from entity body frame to it's ENU frame
   * </pre>
   *
   * <code>.anduril.type.Quaternion attitude_enu = 3 [json_name = "attitudeEnu"];</code>
   * @return The attitudeEnu.
   */
  com.anduril.type.Quaternion getAttitudeEnu();
  /**
   * <pre>
   * quaternion to translate from entity body frame to it's ENU frame
   * </pre>
   *
   * <code>.anduril.type.Quaternion attitude_enu = 3 [json_name = "attitudeEnu"];</code>
   */
  com.anduril.type.QuaternionOrBuilder getAttitudeEnuOrBuilder();
}
