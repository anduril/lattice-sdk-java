// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/geoentity.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.entitymanager.v1;

public interface GeoVisualDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.GeoVisualDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *A string describing the fill color of a geo-entity.
   * </pre>
   *
   * <code>.anduril.type.Color fill_color = 1 [json_name = "fillColor"];</code>
   * @return Whether the fillColor field is set.
   */
  boolean hasFillColor();
  /**
   * <pre>
   *A string describing the fill color of a geo-entity.
   * </pre>
   *
   * <code>.anduril.type.Color fill_color = 1 [json_name = "fillColor"];</code>
   * @return The fillColor.
   */
  com.anduril.type.Color getFillColor();
  /**
   * <pre>
   *A string describing the fill color of a geo-entity.
   * </pre>
   *
   * <code>.anduril.type.Color fill_color = 1 [json_name = "fillColor"];</code>
   */
  com.anduril.type.ColorOrBuilder getFillColorOrBuilder();

  /**
   * <pre>
   *A string describing the line color of a geo-entity.
   * </pre>
   *
   * <code>.anduril.type.Color line_color = 2 [json_name = "lineColor"];</code>
   * @return Whether the lineColor field is set.
   */
  boolean hasLineColor();
  /**
   * <pre>
   *A string describing the line color of a geo-entity.
   * </pre>
   *
   * <code>.anduril.type.Color line_color = 2 [json_name = "lineColor"];</code>
   * @return The lineColor.
   */
  com.anduril.type.Color getLineColor();
  /**
   * <pre>
   *A string describing the line color of a geo-entity.
   * </pre>
   *
   * <code>.anduril.type.Color line_color = 2 [json_name = "lineColor"];</code>
   */
  com.anduril.type.ColorOrBuilder getLineColorOrBuilder();
}
