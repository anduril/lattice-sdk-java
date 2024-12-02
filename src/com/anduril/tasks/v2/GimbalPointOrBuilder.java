// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/shared/isr.pub.proto

package com.anduril.tasks.v2;

public interface GimbalPointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.tasks.v2.GimbalPoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Point the gimbal at and lock on, continuing to look at a specific objective even as the platform moves.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective look_at = 1 [json_name = "lookAt"];</code>
   * @return Whether the lookAt field is set.
   */
  boolean hasLookAt();
  /**
   * <pre>
   * Point the gimbal at and lock on, continuing to look at a specific objective even as the platform moves.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective look_at = 1 [json_name = "lookAt"];</code>
   * @return The lookAt.
   */
  com.anduril.tasks.v2.Objective getLookAt();
  /**
   * <pre>
   * Point the gimbal at and lock on, continuing to look at a specific objective even as the platform moves.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective look_at = 1 [json_name = "lookAt"];</code>
   */
  com.anduril.tasks.v2.ObjectiveOrBuilder getLookAtOrBuilder();

  /**
   * <pre>
   * Point the gimbal at a fixed azimuth/elevation with respect to the platform frame.
   * </pre>
   *
   * <code>.anduril.tasks.v2.AzimuthElevationPoint celestial_location = 2 [json_name = "celestialLocation"];</code>
   * @return Whether the celestialLocation field is set.
   */
  boolean hasCelestialLocation();
  /**
   * <pre>
   * Point the gimbal at a fixed azimuth/elevation with respect to the platform frame.
   * </pre>
   *
   * <code>.anduril.tasks.v2.AzimuthElevationPoint celestial_location = 2 [json_name = "celestialLocation"];</code>
   * @return The celestialLocation.
   */
  com.anduril.tasks.v2.AzimuthElevationPoint getCelestialLocation();
  /**
   * <pre>
   * Point the gimbal at a fixed azimuth/elevation with respect to the platform frame.
   * </pre>
   *
   * <code>.anduril.tasks.v2.AzimuthElevationPoint celestial_location = 2 [json_name = "celestialLocation"];</code>
   */
  com.anduril.tasks.v2.AzimuthElevationPointOrBuilder getCelestialLocationOrBuilder();

  /**
   * <pre>
   * Point gimbal to an [x, y] location in the video feed.
   * </pre>
   *
   * <code>.anduril.tasks.v2.FramePoint frame_location = 4 [json_name = "frameLocation"];</code>
   * @return Whether the frameLocation field is set.
   */
  boolean hasFrameLocation();
  /**
   * <pre>
   * Point gimbal to an [x, y] location in the video feed.
   * </pre>
   *
   * <code>.anduril.tasks.v2.FramePoint frame_location = 4 [json_name = "frameLocation"];</code>
   * @return The frameLocation.
   */
  com.anduril.tasks.v2.FramePoint getFrameLocation();
  /**
   * <pre>
   * Point gimbal to an [x, y] location in the video feed.
   * </pre>
   *
   * <code>.anduril.tasks.v2.FramePoint frame_location = 4 [json_name = "frameLocation"];</code>
   */
  com.anduril.tasks.v2.FramePointOrBuilder getFrameLocationOrBuilder();

  /**
   * <pre>
   * Optional common ISR parameters.
   * </pre>
   *
   * <code>.anduril.tasks.v2.ISRParameters parameters = 3 [json_name = "parameters"];</code>
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();
  /**
   * <pre>
   * Optional common ISR parameters.
   * </pre>
   *
   * <code>.anduril.tasks.v2.ISRParameters parameters = 3 [json_name = "parameters"];</code>
   * @return The parameters.
   */
  com.anduril.tasks.v2.ISRParameters getParameters();
  /**
   * <pre>
   * Optional common ISR parameters.
   * </pre>
   *
   * <code>.anduril.tasks.v2.ISRParameters parameters = 3 [json_name = "parameters"];</code>
   */
  com.anduril.tasks.v2.ISRParametersOrBuilder getParametersOrBuilder();

  com.anduril.tasks.v2.GimbalPoint.PointTypeCase getPointTypeCase();
}