// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/signal.pub.proto

package com.anduril.entitymanager.v1;

public interface AngleOfArrivalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.AngleOfArrival)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Origin (LLA) and attitude (relative to ENU) of a ray pointing towards the detection. The attitude represents a
   * forward-left-up (FLU) frame where the x-axis (1, 0, 0) is pointing towards the target.
   * </pre>
   *
   * <code>.anduril.type.Pose relative_pose = 1 [json_name = "relativePose"];</code>
   * @return Whether the relativePose field is set.
   */
  boolean hasRelativePose();
  /**
   * <pre>
   * Origin (LLA) and attitude (relative to ENU) of a ray pointing towards the detection. The attitude represents a
   * forward-left-up (FLU) frame where the x-axis (1, 0, 0) is pointing towards the target.
   * </pre>
   *
   * <code>.anduril.type.Pose relative_pose = 1 [json_name = "relativePose"];</code>
   * @return The relativePose.
   */
  com.anduril.type.Pose getRelativePose();
  /**
   * <pre>
   * Origin (LLA) and attitude (relative to ENU) of a ray pointing towards the detection. The attitude represents a
   * forward-left-up (FLU) frame where the x-axis (1, 0, 0) is pointing towards the target.
   * </pre>
   *
   * <code>.anduril.type.Pose relative_pose = 1 [json_name = "relativePose"];</code>
   */
  com.anduril.type.PoseOrBuilder getRelativePoseOrBuilder();

  /**
   * <pre>
   * Bearing/elevation covariance matrix where bearing is defined in radians CCW+ about the z-axis from the x-axis of FLU frame
   * and elevation is positive down from the FL/XY plane.
   * mxx = bearing variance in rad^2
   * mxy = bearing/elevation covariance in rad^2
   * myy = elevation variance in rad^2
   * </pre>
   *
   * <code>.anduril.type.TMat2 bearing_elevation_covariance_rad2 = 2 [json_name = "bearingElevationCovarianceRad2"];</code>
   * @return Whether the bearingElevationCovarianceRad2 field is set.
   */
  boolean hasBearingElevationCovarianceRad2();
  /**
   * <pre>
   * Bearing/elevation covariance matrix where bearing is defined in radians CCW+ about the z-axis from the x-axis of FLU frame
   * and elevation is positive down from the FL/XY plane.
   * mxx = bearing variance in rad^2
   * mxy = bearing/elevation covariance in rad^2
   * myy = elevation variance in rad^2
   * </pre>
   *
   * <code>.anduril.type.TMat2 bearing_elevation_covariance_rad2 = 2 [json_name = "bearingElevationCovarianceRad2"];</code>
   * @return The bearingElevationCovarianceRad2.
   */
  com.anduril.type.TMat2 getBearingElevationCovarianceRad2();
  /**
   * <pre>
   * Bearing/elevation covariance matrix where bearing is defined in radians CCW+ about the z-axis from the x-axis of FLU frame
   * and elevation is positive down from the FL/XY plane.
   * mxx = bearing variance in rad^2
   * mxy = bearing/elevation covariance in rad^2
   * myy = elevation variance in rad^2
   * </pre>
   *
   * <code>.anduril.type.TMat2 bearing_elevation_covariance_rad2 = 2 [json_name = "bearingElevationCovarianceRad2"];</code>
   */
  com.anduril.type.TMat2OrBuilder getBearingElevationCovarianceRad2OrBuilder();
}