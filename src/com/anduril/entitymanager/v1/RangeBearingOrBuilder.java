// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/signal.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.entitymanager.v1;

public interface RangeBearingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.RangeBearing)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The range to a target along the measured angle in meters with its one sigma error value.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Measurement range_m = 1 [json_name = "rangeM"];</code>
   * @return Whether the rangeM field is set.
   */
  boolean hasRangeM();
  /**
   * <pre>
   * The range to a target along the measured angle in meters with its one sigma error value.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Measurement range_m = 1 [json_name = "rangeM"];</code>
   * @return The rangeM.
   */
  com.anduril.entitymanager.v1.Measurement getRangeM();
  /**
   * <pre>
   * The range to a target along the measured angle in meters with its one sigma error value.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Measurement range_m = 1 [json_name = "rangeM"];</code>
   */
  com.anduril.entitymanager.v1.MeasurementOrBuilder getRangeMOrBuilder();

  /**
   * <pre>
   * Horizontal angle - degrees rotated clockwise from origin_heading: 0-360.
   * Sigma is the standard deviation of the horizontal angular measurement in decimal degrees: 0-180 degrees.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Measurement range_angle_d = 2 [json_name = "rangeAngleD"];</code>
   * @return Whether the rangeAngleD field is set.
   */
  boolean hasRangeAngleD();
  /**
   * <pre>
   * Horizontal angle - degrees rotated clockwise from origin_heading: 0-360.
   * Sigma is the standard deviation of the horizontal angular measurement in decimal degrees: 0-180 degrees.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Measurement range_angle_d = 2 [json_name = "rangeAngleD"];</code>
   * @return The rangeAngleD.
   */
  com.anduril.entitymanager.v1.Measurement getRangeAngleD();
  /**
   * <pre>
   * Horizontal angle - degrees rotated clockwise from origin_heading: 0-360.
   * Sigma is the standard deviation of the horizontal angular measurement in decimal degrees: 0-180 degrees.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Measurement range_angle_d = 2 [json_name = "rangeAngleD"];</code>
   */
  com.anduril.entitymanager.v1.MeasurementOrBuilder getRangeAngleDOrBuilder();
}
