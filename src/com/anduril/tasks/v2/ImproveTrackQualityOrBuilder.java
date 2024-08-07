// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/shared/isr.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.tasks.v2;

public interface ImproveTrackQualityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.tasks.v2.ImproveTrackQuality)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Indicates the target track that is having its quality improved.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
   * @return Whether the objective field is set.
   */
  boolean hasObjective();
  /**
   * <pre>
   * Indicates the target track that is having its quality improved.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
   * @return The objective.
   */
  com.anduril.tasks.v2.Objective getObjective();
  /**
   * <pre>
   * Indicates the target track that is having its quality improved.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
   */
  com.anduril.tasks.v2.ObjectiveOrBuilder getObjectiveOrBuilder();

  /**
   * <pre>
   * Task will complete when the requested track reaches a TQ &gt;= the termination_track_quality.
   * </pre>
   *
   * <code>uint32 termination_track_quality = 2 [json_name = "terminationTrackQuality"];</code>
   * @return The terminationTrackQuality.
   */
  int getTerminationTrackQuality();
}
