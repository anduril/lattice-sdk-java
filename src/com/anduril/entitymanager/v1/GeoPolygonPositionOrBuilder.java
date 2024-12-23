// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/geoentity.pub.proto

package com.anduril.entitymanager.v1;

public interface GeoPolygonPositionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.GeoPolygonPosition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * base position. if no altitude set, its on the ground.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Position position = 1 [json_name = "position"];</code>
   * @return Whether the position field is set.
   */
  boolean hasPosition();
  /**
   * <pre>
   * base position. if no altitude set, its on the ground.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Position position = 1 [json_name = "position"];</code>
   * @return The position.
   */
  com.anduril.entitymanager.v1.Position getPosition();
  /**
   * <pre>
   * base position. if no altitude set, its on the ground.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Position position = 1 [json_name = "position"];</code>
   */
  com.anduril.entitymanager.v1.PositionOrBuilder getPositionOrBuilder();

  /**
   * <pre>
   * optional height above base position to extrude in meters.
   * for a given polygon, all points should have a height or none of them.
   * strictly GeoJSON compatible polygons will not have this set.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue height_m = 2 [json_name = "heightM"];</code>
   * @return Whether the heightM field is set.
   */
  boolean hasHeightM();
  /**
   * <pre>
   * optional height above base position to extrude in meters.
   * for a given polygon, all points should have a height or none of them.
   * strictly GeoJSON compatible polygons will not have this set.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue height_m = 2 [json_name = "heightM"];</code>
   * @return The heightM.
   */
  com.google.protobuf.FloatValue getHeightM();
  /**
   * <pre>
   * optional height above base position to extrude in meters.
   * for a given polygon, all points should have a height or none of them.
   * strictly GeoJSON compatible polygons will not have this set.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue height_m = 2 [json_name = "heightM"];</code>
   */
  com.google.protobuf.FloatValueOrBuilder getHeightMOrBuilder();
}
