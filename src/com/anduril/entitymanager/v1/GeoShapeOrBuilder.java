// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/geoentity.pub.proto

package com.anduril.entitymanager.v1;

public interface GeoShapeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.GeoShape)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.anduril.entitymanager.v1.GeoPoint point = 1 [json_name = "point"];</code>
   * @return Whether the point field is set.
   */
  boolean hasPoint();
  /**
   * <code>.anduril.entitymanager.v1.GeoPoint point = 1 [json_name = "point"];</code>
   * @return The point.
   */
  com.anduril.entitymanager.v1.GeoPoint getPoint();
  /**
   * <code>.anduril.entitymanager.v1.GeoPoint point = 1 [json_name = "point"];</code>
   */
  com.anduril.entitymanager.v1.GeoPointOrBuilder getPointOrBuilder();

  /**
   * <code>.anduril.entitymanager.v1.GeoLine line = 2 [json_name = "line"];</code>
   * @return Whether the line field is set.
   */
  boolean hasLine();
  /**
   * <code>.anduril.entitymanager.v1.GeoLine line = 2 [json_name = "line"];</code>
   * @return The line.
   */
  com.anduril.entitymanager.v1.GeoLine getLine();
  /**
   * <code>.anduril.entitymanager.v1.GeoLine line = 2 [json_name = "line"];</code>
   */
  com.anduril.entitymanager.v1.GeoLineOrBuilder getLineOrBuilder();

  /**
   * <code>.anduril.entitymanager.v1.GeoPolygon polygon = 3 [json_name = "polygon"];</code>
   * @return Whether the polygon field is set.
   */
  boolean hasPolygon();
  /**
   * <code>.anduril.entitymanager.v1.GeoPolygon polygon = 3 [json_name = "polygon"];</code>
   * @return The polygon.
   */
  com.anduril.entitymanager.v1.GeoPolygon getPolygon();
  /**
   * <code>.anduril.entitymanager.v1.GeoPolygon polygon = 3 [json_name = "polygon"];</code>
   */
  com.anduril.entitymanager.v1.GeoPolygonOrBuilder getPolygonOrBuilder();

  /**
   * <code>.anduril.entitymanager.v1.GeoEllipse ellipse = 4 [json_name = "ellipse"];</code>
   * @return Whether the ellipse field is set.
   */
  boolean hasEllipse();
  /**
   * <code>.anduril.entitymanager.v1.GeoEllipse ellipse = 4 [json_name = "ellipse"];</code>
   * @return The ellipse.
   */
  com.anduril.entitymanager.v1.GeoEllipse getEllipse();
  /**
   * <code>.anduril.entitymanager.v1.GeoEllipse ellipse = 4 [json_name = "ellipse"];</code>
   */
  com.anduril.entitymanager.v1.GeoEllipseOrBuilder getEllipseOrBuilder();

  /**
   * <code>.anduril.entitymanager.v1.GeoEllipsoid ellipsoid = 5 [json_name = "ellipsoid"];</code>
   * @return Whether the ellipsoid field is set.
   */
  boolean hasEllipsoid();
  /**
   * <code>.anduril.entitymanager.v1.GeoEllipsoid ellipsoid = 5 [json_name = "ellipsoid"];</code>
   * @return The ellipsoid.
   */
  com.anduril.entitymanager.v1.GeoEllipsoid getEllipsoid();
  /**
   * <code>.anduril.entitymanager.v1.GeoEllipsoid ellipsoid = 5 [json_name = "ellipsoid"];</code>
   */
  com.anduril.entitymanager.v1.GeoEllipsoidOrBuilder getEllipsoidOrBuilder();

  com.anduril.entitymanager.v1.GeoShape.ShapeCase getShapeCase();
}