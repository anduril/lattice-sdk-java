// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/jadc2/thirdparty/v1/transit.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.tasks.jadc2.thirdparty.v1;

public interface TransitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.tasks.jadc2.thirdparty.v1.Transit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The path consisting of all segments to be taken for this transit task.
   * </pre>
   *
   * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
   */
  java.util.List<com.anduril.tasks.jadc2.thirdparty.v1.PathSegment> 
      getPathList();
  /**
   * <pre>
   * The path consisting of all segments to be taken for this transit task.
   * </pre>
   *
   * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
   */
  com.anduril.tasks.jadc2.thirdparty.v1.PathSegment getPath(int index);
  /**
   * <pre>
   * The path consisting of all segments to be taken for this transit task.
   * </pre>
   *
   * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
   */
  int getPathCount();
  /**
   * <pre>
   * The path consisting of all segments to be taken for this transit task.
   * </pre>
   *
   * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
   */
  java.util.List<? extends com.anduril.tasks.jadc2.thirdparty.v1.PathSegmentOrBuilder> 
      getPathOrBuilderList();
  /**
   * <pre>
   * The path consisting of all segments to be taken for this transit task.
   * </pre>
   *
   * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
   */
  com.anduril.tasks.jadc2.thirdparty.v1.PathSegmentOrBuilder getPathOrBuilder(
      int index);

  /**
   * <pre>
   * Speed in which the vehicle will move through each of the path segments.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue surface_speed_ms = 2 [json_name = "surfaceSpeedMs"];</code>
   * @return Whether the surfaceSpeedMs field is set.
   */
  boolean hasSurfaceSpeedMs();
  /**
   * <pre>
   * Speed in which the vehicle will move through each of the path segments.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue surface_speed_ms = 2 [json_name = "surfaceSpeedMs"];</code>
   * @return The surfaceSpeedMs.
   */
  com.google.protobuf.DoubleValue getSurfaceSpeedMs();
  /**
   * <pre>
   * Speed in which the vehicle will move through each of the path segments.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue surface_speed_ms = 2 [json_name = "surfaceSpeedMs"];</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getSurfaceSpeedMsOrBuilder();
}
