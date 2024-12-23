// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/location.pub.proto

package com.anduril.entitymanager.v1;

public interface PositionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.Position)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * WGS84 geodetic latitude in decimal degrees.
   * </pre>
   *
   * <code>double latitude_degrees = 1 [json_name = "latitudeDegrees"];</code>
   * @return The latitudeDegrees.
   */
  double getLatitudeDegrees();

  /**
   * <pre>
   * WGS84 longitude in decimal degrees.
   * </pre>
   *
   * <code>double longitude_degrees = 2 [json_name = "longitudeDegrees"];</code>
   * @return The longitudeDegrees.
   */
  double getLongitudeDegrees();

  /**
   * <pre>
   * altitude as height above ellipsoid (WGS84) in meters. DoubleValue wrapper is used to distinguish optional from
   * default 0.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue altitude_hae_meters = 3 [json_name = "altitudeHaeMeters"];</code>
   * @return Whether the altitudeHaeMeters field is set.
   */
  boolean hasAltitudeHaeMeters();
  /**
   * <pre>
   * altitude as height above ellipsoid (WGS84) in meters. DoubleValue wrapper is used to distinguish optional from
   * default 0.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue altitude_hae_meters = 3 [json_name = "altitudeHaeMeters"];</code>
   * @return The altitudeHaeMeters.
   */
  com.google.protobuf.DoubleValue getAltitudeHaeMeters();
  /**
   * <pre>
   * altitude as height above ellipsoid (WGS84) in meters. DoubleValue wrapper is used to distinguish optional from
   * default 0.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue altitude_hae_meters = 3 [json_name = "altitudeHaeMeters"];</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getAltitudeHaeMetersOrBuilder();

  /**
   * <pre>
   * Altitude as AGL (Above Ground Level) if the upstream data source has this value set. This value represents the
   * entity's height above the terrain. This is typically measured with a radar altimeter or by using a terrain tile
   * set lookup. If the value is not set from the upstream, this value is not set.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue altitude_agl_meters = 4 [json_name = "altitudeAglMeters"];</code>
   * @return Whether the altitudeAglMeters field is set.
   */
  boolean hasAltitudeAglMeters();
  /**
   * <pre>
   * Altitude as AGL (Above Ground Level) if the upstream data source has this value set. This value represents the
   * entity's height above the terrain. This is typically measured with a radar altimeter or by using a terrain tile
   * set lookup. If the value is not set from the upstream, this value is not set.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue altitude_agl_meters = 4 [json_name = "altitudeAglMeters"];</code>
   * @return The altitudeAglMeters.
   */
  com.google.protobuf.DoubleValue getAltitudeAglMeters();
  /**
   * <pre>
   * Altitude as AGL (Above Ground Level) if the upstream data source has this value set. This value represents the
   * entity's height above the terrain. This is typically measured with a radar altimeter or by using a terrain tile
   * set lookup. If the value is not set from the upstream, this value is not set.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue altitude_agl_meters = 4 [json_name = "altitudeAglMeters"];</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getAltitudeAglMetersOrBuilder();

  /**
   * <pre>
   * Altitude as ASF (Above Sea Floor) if the upstream data source has this value set. If the value is not set from the upstream, this value is
   * not set.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue altitude_asf_meters = 5 [json_name = "altitudeAsfMeters"];</code>
   * @return Whether the altitudeAsfMeters field is set.
   */
  boolean hasAltitudeAsfMeters();
  /**
   * <pre>
   * Altitude as ASF (Above Sea Floor) if the upstream data source has this value set. If the value is not set from the upstream, this value is
   * not set.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue altitude_asf_meters = 5 [json_name = "altitudeAsfMeters"];</code>
   * @return The altitudeAsfMeters.
   */
  com.google.protobuf.DoubleValue getAltitudeAsfMeters();
  /**
   * <pre>
   * Altitude as ASF (Above Sea Floor) if the upstream data source has this value set. If the value is not set from the upstream, this value is
   * not set.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue altitude_asf_meters = 5 [json_name = "altitudeAsfMeters"];</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getAltitudeAsfMetersOrBuilder();

  /**
   * <pre>
   * The depth of the entity from the surface of the water through sensor measurements based on differential pressure
   * between the interior and exterior of the vessel. If the value is not set from the upstream, this value is not set.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue pressure_depth_meters = 6 [json_name = "pressureDepthMeters"];</code>
   * @return Whether the pressureDepthMeters field is set.
   */
  boolean hasPressureDepthMeters();
  /**
   * <pre>
   * The depth of the entity from the surface of the water through sensor measurements based on differential pressure
   * between the interior and exterior of the vessel. If the value is not set from the upstream, this value is not set.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue pressure_depth_meters = 6 [json_name = "pressureDepthMeters"];</code>
   * @return The pressureDepthMeters.
   */
  com.google.protobuf.DoubleValue getPressureDepthMeters();
  /**
   * <pre>
   * The depth of the entity from the surface of the water through sensor measurements based on differential pressure
   * between the interior and exterior of the vessel. If the value is not set from the upstream, this value is not set.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue pressure_depth_meters = 6 [json_name = "pressureDepthMeters"];</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getPressureDepthMetersOrBuilder();
}
