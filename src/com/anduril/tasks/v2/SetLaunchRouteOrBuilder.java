// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/shared/maneuver.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.tasks.v2;

public interface SetLaunchRouteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.tasks.v2.SetLaunchRoute)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.anduril.tasks.v2.RoutePlan plan = 1 [json_name = "plan"];</code>
   * @return Whether the plan field is set.
   */
  boolean hasPlan();
  /**
   * <code>.anduril.tasks.v2.RoutePlan plan = 1 [json_name = "plan"];</code>
   * @return The plan.
   */
  com.anduril.tasks.v2.RoutePlan getPlan();
  /**
   * <code>.anduril.tasks.v2.RoutePlan plan = 1 [json_name = "plan"];</code>
   */
  com.anduril.tasks.v2.RoutePlanOrBuilder getPlanOrBuilder();

  /**
   * <code>.anduril.tasks.v2.LaunchTrackingMode tracking_mode = 2 [json_name = "trackingMode"];</code>
   * @return The enum numeric value on the wire for trackingMode.
   */
  int getTrackingModeValue();
  /**
   * <code>.anduril.tasks.v2.LaunchTrackingMode tracking_mode = 2 [json_name = "trackingMode"];</code>
   * @return The trackingMode.
   */
  com.anduril.tasks.v2.LaunchTrackingMode getTrackingMode();
}
