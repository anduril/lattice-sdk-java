// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/entity.pub.proto

package com.anduril.entitymanager.v1;

public interface TrackedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.Tracked)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Quality score, 0-15, nil if none
   * </pre>
   *
   * <code>.google.protobuf.Int32Value track_quality_wrapper = 2 [json_name = "trackQualityWrapper"];</code>
   * @return Whether the trackQualityWrapper field is set.
   */
  boolean hasTrackQualityWrapper();
  /**
   * <pre>
   * Quality score, 0-15, nil if none
   * </pre>
   *
   * <code>.google.protobuf.Int32Value track_quality_wrapper = 2 [json_name = "trackQualityWrapper"];</code>
   * @return The trackQualityWrapper.
   */
  com.google.protobuf.Int32Value getTrackQualityWrapper();
  /**
   * <pre>
   * Quality score, 0-15, nil if none
   * </pre>
   *
   * <code>.google.protobuf.Int32Value track_quality_wrapper = 2 [json_name = "trackQualityWrapper"];</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getTrackQualityWrapperOrBuilder();

  /**
   * <pre>
   * Sensor hits aggregation on the tracked entity.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value sensor_hits = 3 [json_name = "sensorHits"];</code>
   * @return Whether the sensorHits field is set.
   */
  boolean hasSensorHits();
  /**
   * <pre>
   * Sensor hits aggregation on the tracked entity.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value sensor_hits = 3 [json_name = "sensorHits"];</code>
   * @return The sensorHits.
   */
  com.google.protobuf.Int32Value getSensorHits();
  /**
   * <pre>
   * Sensor hits aggregation on the tracked entity.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value sensor_hits = 3 [json_name = "sensorHits"];</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getSensorHitsOrBuilder();

  /**
   * <pre>
   * Estimated number of objects or units that are represented by this entity. Known as Strength in certain contexts (Link16)
   * if UpperBound == LowerBound; (strength = LowerBound)
   * If both UpperBound and LowerBound are defined; strength is between LowerBound and UpperBound (represented as string "Strength: 4-5")
   * If UpperBound is defined only (LowerBound unset), Strength ≤ UpperBound
   * If LowerBound is defined only (UpperBound unset), LowerBound ≤ Strength
   * 0 indicates unset.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.UInt32Range number_of_objects = 4 [json_name = "numberOfObjects"];</code>
   * @return Whether the numberOfObjects field is set.
   */
  boolean hasNumberOfObjects();
  /**
   * <pre>
   * Estimated number of objects or units that are represented by this entity. Known as Strength in certain contexts (Link16)
   * if UpperBound == LowerBound; (strength = LowerBound)
   * If both UpperBound and LowerBound are defined; strength is between LowerBound and UpperBound (represented as string "Strength: 4-5")
   * If UpperBound is defined only (LowerBound unset), Strength ≤ UpperBound
   * If LowerBound is defined only (UpperBound unset), LowerBound ≤ Strength
   * 0 indicates unset.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.UInt32Range number_of_objects = 4 [json_name = "numberOfObjects"];</code>
   * @return The numberOfObjects.
   */
  com.anduril.entitymanager.v1.UInt32Range getNumberOfObjects();
  /**
   * <pre>
   * Estimated number of objects or units that are represented by this entity. Known as Strength in certain contexts (Link16)
   * if UpperBound == LowerBound; (strength = LowerBound)
   * If both UpperBound and LowerBound are defined; strength is between LowerBound and UpperBound (represented as string "Strength: 4-5")
   * If UpperBound is defined only (LowerBound unset), Strength ≤ UpperBound
   * If LowerBound is defined only (UpperBound unset), LowerBound ≤ Strength
   * 0 indicates unset.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.UInt32Range number_of_objects = 4 [json_name = "numberOfObjects"];</code>
   */
  com.anduril.entitymanager.v1.UInt32RangeOrBuilder getNumberOfObjectsOrBuilder();

  /**
   * <pre>
   * The radar cross section (RCS) is a measure of how detectable an object is by radar. A large RCS indicates an object is more easily
   * detected. The unit is “decibels per square meter,” or dBsm
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue radar_cross_section = 6 [json_name = "radarCrossSection"];</code>
   * @return Whether the radarCrossSection field is set.
   */
  boolean hasRadarCrossSection();
  /**
   * <pre>
   * The radar cross section (RCS) is a measure of how detectable an object is by radar. A large RCS indicates an object is more easily
   * detected. The unit is “decibels per square meter,” or dBsm
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue radar_cross_section = 6 [json_name = "radarCrossSection"];</code>
   * @return The radarCrossSection.
   */
  com.google.protobuf.DoubleValue getRadarCrossSection();
  /**
   * <pre>
   * The radar cross section (RCS) is a measure of how detectable an object is by radar. A large RCS indicates an object is more easily
   * detected. The unit is “decibels per square meter,” or dBsm
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue radar_cross_section = 6 [json_name = "radarCrossSection"];</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getRadarCrossSectionOrBuilder();

  /**
   * <pre>
   * Timestamp of the latest tracking measurement for this entity.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_measurement_time = 7 [json_name = "lastMeasurementTime"];</code>
   * @return Whether the lastMeasurementTime field is set.
   */
  boolean hasLastMeasurementTime();
  /**
   * <pre>
   * Timestamp of the latest tracking measurement for this entity.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_measurement_time = 7 [json_name = "lastMeasurementTime"];</code>
   * @return The lastMeasurementTime.
   */
  com.google.protobuf.Timestamp getLastMeasurementTime();
  /**
   * <pre>
   * Timestamp of the latest tracking measurement for this entity.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_measurement_time = 7 [json_name = "lastMeasurementTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastMeasurementTimeOrBuilder();

  /**
   * <pre>
   * The relative position of a track with respect to the entity that is tracking it. Used for tracks that do not yet have a 3D position.
   * For this entity (A), being tracked by some entity (B), this LineOfBearing would express a ray from B to A.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.LineOfBearing line_of_bearing = 9 [json_name = "lineOfBearing"];</code>
   * @return Whether the lineOfBearing field is set.
   */
  boolean hasLineOfBearing();
  /**
   * <pre>
   * The relative position of a track with respect to the entity that is tracking it. Used for tracks that do not yet have a 3D position.
   * For this entity (A), being tracked by some entity (B), this LineOfBearing would express a ray from B to A.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.LineOfBearing line_of_bearing = 9 [json_name = "lineOfBearing"];</code>
   * @return The lineOfBearing.
   */
  com.anduril.entitymanager.v1.LineOfBearing getLineOfBearing();
  /**
   * <pre>
   * The relative position of a track with respect to the entity that is tracking it. Used for tracks that do not yet have a 3D position.
   * For this entity (A), being tracked by some entity (B), this LineOfBearing would express a ray from B to A.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.LineOfBearing line_of_bearing = 9 [json_name = "lineOfBearing"];</code>
   */
  com.anduril.entitymanager.v1.LineOfBearingOrBuilder getLineOfBearingOrBuilder();
}
