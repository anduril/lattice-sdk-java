// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/shared/strike.pub.proto

package com.anduril.tasks.v2;

public interface StrikeParametersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.tasks.v2.StrikeParameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .anduril.tasks.v2.PayloadConfiguration payloads_to_employ = 1 [json_name = "payloadsToEmploy"];</code>
   */
  java.util.List<com.anduril.tasks.v2.PayloadConfiguration> 
      getPayloadsToEmployList();
  /**
   * <code>repeated .anduril.tasks.v2.PayloadConfiguration payloads_to_employ = 1 [json_name = "payloadsToEmploy"];</code>
   */
  com.anduril.tasks.v2.PayloadConfiguration getPayloadsToEmploy(int index);
  /**
   * <code>repeated .anduril.tasks.v2.PayloadConfiguration payloads_to_employ = 1 [json_name = "payloadsToEmploy"];</code>
   */
  int getPayloadsToEmployCount();
  /**
   * <code>repeated .anduril.tasks.v2.PayloadConfiguration payloads_to_employ = 1 [json_name = "payloadsToEmploy"];</code>
   */
  java.util.List<? extends com.anduril.tasks.v2.PayloadConfigurationOrBuilder> 
      getPayloadsToEmployOrBuilderList();
  /**
   * <code>repeated .anduril.tasks.v2.PayloadConfiguration payloads_to_employ = 1 [json_name = "payloadsToEmploy"];</code>
   */
  com.anduril.tasks.v2.PayloadConfigurationOrBuilder getPayloadsToEmployOrBuilder(
      int index);

  /**
   * <pre>
   * GPS time at which the strike should be performed.
   * </pre>
   *
   * <code>.google.protobuf.Duration desired_impact_time = 2 [json_name = "desiredImpactTime"];</code>
   * @return Whether the desiredImpactTime field is set.
   */
  boolean hasDesiredImpactTime();
  /**
   * <pre>
   * GPS time at which the strike should be performed.
   * </pre>
   *
   * <code>.google.protobuf.Duration desired_impact_time = 2 [json_name = "desiredImpactTime"];</code>
   * @return The desiredImpactTime.
   */
  com.google.protobuf.Duration getDesiredImpactTime();
  /**
   * <pre>
   * GPS time at which the strike should be performed.
   * </pre>
   *
   * <code>.google.protobuf.Duration desired_impact_time = 2 [json_name = "desiredImpactTime"];</code>
   */
  com.google.protobuf.DurationOrBuilder getDesiredImpactTimeOrBuilder();

  /**
   * <pre>
   * Bearing at which to perform the run in for a strike.
   * </pre>
   *
   * <code>double run_in_bearing = 3 [json_name = "runInBearing"];</code>
   * @return The runInBearing.
   */
  double getRunInBearing();

  /**
   * <pre>
   * Angle which to glide into the run in for a strike.
   * </pre>
   *
   * <code>double glide_slope_angle = 4 [json_name = "glideSlopeAngle"];</code>
   * @return The glideSlopeAngle.
   */
  double getGlideSlopeAngle();
}
