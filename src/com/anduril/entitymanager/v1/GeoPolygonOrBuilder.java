// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/entitymanager/v1/geoentity.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.entitymanager.v1;

public interface GeoPolygonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.GeoPolygon)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
   * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
   */
  java.util.List<com.anduril.entitymanager.v1.LinearRing> 
      getRingsList();
  /**
   * <pre>
   * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
   * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
   */
  com.anduril.entitymanager.v1.LinearRing getRings(int index);
  /**
   * <pre>
   * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
   * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
   */
  int getRingsCount();
  /**
   * <pre>
   * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
   * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
   */
  java.util.List<? extends com.anduril.entitymanager.v1.LinearRingOrBuilder> 
      getRingsOrBuilderList();
  /**
   * <pre>
   * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
   * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
   */
  com.anduril.entitymanager.v1.LinearRingOrBuilder getRingsOrBuilder(
      int index);

  /**
   * <pre>
   * An extension hint that this polygon is a rectangle. When true this implies several things:
   * * exactly 1 linear ring with 5 points (starting corner, 3 other corners and start again)
   * * each point has the same altitude corresponding with the plane of the rectangle
   * * each point has the same height (either all present and equal, or all not present)
   * </pre>
   *
   * <code>bool is_rectangle = 2 [json_name = "isRectangle"];</code>
   * @return The isRectangle.
   */
  boolean getIsRectangle();
}
