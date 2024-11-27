// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/shared/strike.pub.proto

package com.anduril.tasks.v2;

public interface ReleasePayloadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.tasks.v2.ReleasePayload)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The payload(s) that will be released
   * </pre>
   *
   * <code>repeated .anduril.tasks.v2.PayloadConfiguration payloads = 1 [json_name = "payloads"];</code>
   */
  java.util.List<com.anduril.tasks.v2.PayloadConfiguration> 
      getPayloadsList();
  /**
   * <pre>
   * The payload(s) that will be released
   * </pre>
   *
   * <code>repeated .anduril.tasks.v2.PayloadConfiguration payloads = 1 [json_name = "payloads"];</code>
   */
  com.anduril.tasks.v2.PayloadConfiguration getPayloads(int index);
  /**
   * <pre>
   * The payload(s) that will be released
   * </pre>
   *
   * <code>repeated .anduril.tasks.v2.PayloadConfiguration payloads = 1 [json_name = "payloads"];</code>
   */
  int getPayloadsCount();
  /**
   * <pre>
   * The payload(s) that will be released
   * </pre>
   *
   * <code>repeated .anduril.tasks.v2.PayloadConfiguration payloads = 1 [json_name = "payloads"];</code>
   */
  java.util.List<? extends com.anduril.tasks.v2.PayloadConfigurationOrBuilder> 
      getPayloadsOrBuilderList();
  /**
   * <pre>
   * The payload(s) that will be released
   * </pre>
   *
   * <code>repeated .anduril.tasks.v2.PayloadConfiguration payloads = 1 [json_name = "payloads"];</code>
   */
  com.anduril.tasks.v2.PayloadConfigurationOrBuilder getPayloadsOrBuilder(
      int index);

  /**
   * <pre>
   * Optional objective, of where the payload should be dropped. If omitted the payload will drop the current location
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective objective = 2 [json_name = "objective"];</code>
   * @return Whether the objective field is set.
   */
  boolean hasObjective();
  /**
   * <pre>
   * Optional objective, of where the payload should be dropped. If omitted the payload will drop the current location
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective objective = 2 [json_name = "objective"];</code>
   * @return The objective.
   */
  com.anduril.tasks.v2.Objective getObjective();
  /**
   * <pre>
   * Optional objective, of where the payload should be dropped. If omitted the payload will drop the current location
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective objective = 2 [json_name = "objective"];</code>
   */
  com.anduril.tasks.v2.ObjectiveOrBuilder getObjectiveOrBuilder();

  /**
   * <pre>
   * Attempt to place the payload delicately from a standstill
   * </pre>
   *
   * <code>.google.protobuf.Empty precision_release = 3 [json_name = "precisionRelease"];</code>
   * @return Whether the precisionRelease field is set.
   */
  boolean hasPrecisionRelease();
  /**
   * <pre>
   * Attempt to place the payload delicately from a standstill
   * </pre>
   *
   * <code>.google.protobuf.Empty precision_release = 3 [json_name = "precisionRelease"];</code>
   * @return The precisionRelease.
   */
  com.google.protobuf.Empty getPrecisionRelease();
  /**
   * <pre>
   * Attempt to place the payload delicately from a standstill
   * </pre>
   *
   * <code>.google.protobuf.Empty precision_release = 3 [json_name = "precisionRelease"];</code>
   */
  com.google.protobuf.EmptyOrBuilder getPrecisionReleaseOrBuilder();

  com.anduril.tasks.v2.ReleasePayload.ReleaseMethodCase getReleaseMethodCase();
}