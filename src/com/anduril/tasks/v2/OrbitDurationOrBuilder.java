// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/shared/isr.pub.proto

package com.anduril.tasks.v2;

public interface OrbitDurationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.tasks.v2.OrbitDuration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.anduril.tasks.v2.DurationRange duration_range = 1 [json_name = "durationRange"];</code>
   * @return Whether the durationRange field is set.
   */
  boolean hasDurationRange();
  /**
   * <code>.anduril.tasks.v2.DurationRange duration_range = 1 [json_name = "durationRange"];</code>
   * @return The durationRange.
   */
  com.anduril.tasks.v2.DurationRange getDurationRange();
  /**
   * <code>.anduril.tasks.v2.DurationRange duration_range = 1 [json_name = "durationRange"];</code>
   */
  com.anduril.tasks.v2.DurationRangeOrBuilder getDurationRangeOrBuilder();

  /**
   * <code>uint64 num_of_orbits = 2 [json_name = "numOfOrbits"];</code>
   * @return Whether the numOfOrbits field is set.
   */
  boolean hasNumOfOrbits();
  /**
   * <code>uint64 num_of_orbits = 2 [json_name = "numOfOrbits"];</code>
   * @return The numOfOrbits.
   */
  long getNumOfOrbits();

  com.anduril.tasks.v2.OrbitDuration.DurationCase getDurationCase();
}
