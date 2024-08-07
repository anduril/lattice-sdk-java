// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/shared/isr.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.tasks.v2;

public interface MonitorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.tasks.v2.Monitor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Indicates objective to monitor.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
   * @return Whether the objective field is set.
   */
  boolean hasObjective();
  /**
   * <pre>
   * Indicates objective to monitor.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
   * @return The objective.
   */
  com.anduril.tasks.v2.Objective getObjective();
  /**
   * <pre>
   * Indicates objective to monitor.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
   */
  com.anduril.tasks.v2.ObjectiveOrBuilder getObjectiveOrBuilder();

  /**
   * <pre>
   * Identifies track to monitor.
   * </pre>
   *
   * <code>string track_id = 2 [json_name = "trackId"];</code>
   * @return The trackId.
   */
  java.lang.String getTrackId();
  /**
   * <pre>
   * Identifies track to monitor.
   * </pre>
   *
   * <code>string track_id = 2 [json_name = "trackId"];</code>
   * @return The bytes for trackId.
   */
  com.google.protobuf.ByteString
      getTrackIdBytes();

  /**
   * <pre>
   * AssetId2 of asset that produced track.
   * </pre>
   *
   * <code>string track_producer = 3 [json_name = "trackProducer"];</code>
   * @return The trackProducer.
   */
  java.lang.String getTrackProducer();
  /**
   * <pre>
   * AssetId2 of asset that produced track.
   * </pre>
   *
   * <code>string track_producer = 3 [json_name = "trackProducer"];</code>
   * @return The bytes for trackProducer.
   */
  com.google.protobuf.ByteString
      getTrackProducerBytes();
}
