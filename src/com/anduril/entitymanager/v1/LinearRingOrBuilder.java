// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/geoentity.pub.proto

package com.anduril.entitymanager.v1;

public interface LinearRingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.LinearRing)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Deprecated: do not use, use positions instead
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.Position points = 1 [json_name = "points", deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<com.anduril.entitymanager.v1.Position> 
      getPointsList();
  /**
   * <pre>
   * Deprecated: do not use, use positions instead
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.Position points = 1 [json_name = "points", deprecated = true];</code>
   */
  @java.lang.Deprecated com.anduril.entitymanager.v1.Position getPoints(int index);
  /**
   * <pre>
   * Deprecated: do not use, use positions instead
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.Position points = 1 [json_name = "points", deprecated = true];</code>
   */
  @java.lang.Deprecated int getPointsCount();
  /**
   * <pre>
   * Deprecated: do not use, use positions instead
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.Position points = 1 [json_name = "points", deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<? extends com.anduril.entitymanager.v1.PositionOrBuilder> 
      getPointsOrBuilderList();
  /**
   * <pre>
   * Deprecated: do not use, use positions instead
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.Position points = 1 [json_name = "points", deprecated = true];</code>
   */
  @java.lang.Deprecated com.anduril.entitymanager.v1.PositionOrBuilder getPointsOrBuilder(
      int index);

  /**
   * <code>repeated .anduril.entitymanager.v1.GeoPolygonPosition positions = 2 [json_name = "positions"];</code>
   */
  java.util.List<com.anduril.entitymanager.v1.GeoPolygonPosition> 
      getPositionsList();
  /**
   * <code>repeated .anduril.entitymanager.v1.GeoPolygonPosition positions = 2 [json_name = "positions"];</code>
   */
  com.anduril.entitymanager.v1.GeoPolygonPosition getPositions(int index);
  /**
   * <code>repeated .anduril.entitymanager.v1.GeoPolygonPosition positions = 2 [json_name = "positions"];</code>
   */
  int getPositionsCount();
  /**
   * <code>repeated .anduril.entitymanager.v1.GeoPolygonPosition positions = 2 [json_name = "positions"];</code>
   */
  java.util.List<? extends com.anduril.entitymanager.v1.GeoPolygonPositionOrBuilder> 
      getPositionsOrBuilderList();
  /**
   * <code>repeated .anduril.entitymanager.v1.GeoPolygonPosition positions = 2 [json_name = "positions"];</code>
   */
  com.anduril.entitymanager.v1.GeoPolygonPositionOrBuilder getPositionsOrBuilder(
      int index);
}