// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/entity.pub.proto

package com.anduril.entitymanager.v1;

public interface IndicatorsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.Indicators)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.BoolValue simulated = 1 [json_name = "simulated"];</code>
   * @return Whether the simulated field is set.
   */
  boolean hasSimulated();
  /**
   * <code>.google.protobuf.BoolValue simulated = 1 [json_name = "simulated"];</code>
   * @return The simulated.
   */
  com.google.protobuf.BoolValue getSimulated();
  /**
   * <code>.google.protobuf.BoolValue simulated = 1 [json_name = "simulated"];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getSimulatedOrBuilder();

  /**
   * <code>.google.protobuf.BoolValue exercise = 2 [json_name = "exercise"];</code>
   * @return Whether the exercise field is set.
   */
  boolean hasExercise();
  /**
   * <code>.google.protobuf.BoolValue exercise = 2 [json_name = "exercise"];</code>
   * @return The exercise.
   */
  com.google.protobuf.BoolValue getExercise();
  /**
   * <code>.google.protobuf.BoolValue exercise = 2 [json_name = "exercise"];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getExerciseOrBuilder();

  /**
   * <code>.google.protobuf.BoolValue emergency = 3 [json_name = "emergency"];</code>
   * @return Whether the emergency field is set.
   */
  boolean hasEmergency();
  /**
   * <code>.google.protobuf.BoolValue emergency = 3 [json_name = "emergency"];</code>
   * @return The emergency.
   */
  com.google.protobuf.BoolValue getEmergency();
  /**
   * <code>.google.protobuf.BoolValue emergency = 3 [json_name = "emergency"];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getEmergencyOrBuilder();

  /**
   * <code>.google.protobuf.BoolValue c2 = 4 [json_name = "c2"];</code>
   * @return Whether the c2 field is set.
   */
  boolean hasC2();
  /**
   * <code>.google.protobuf.BoolValue c2 = 4 [json_name = "c2"];</code>
   * @return The c2.
   */
  com.google.protobuf.BoolValue getC2();
  /**
   * <code>.google.protobuf.BoolValue c2 = 4 [json_name = "c2"];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getC2OrBuilder();

  /**
   * <pre>
   * Indicates the Entity should be egressed to external sources.
   * Integrations choose how the egressing happens (e.g. if an Entity needs fuzzing).
   * </pre>
   *
   * <code>.google.protobuf.BoolValue egressable = 6 [json_name = "egressable", (.anduril.entitymanager.v1.overridable) = true];</code>
   * @return Whether the egressable field is set.
   */
  boolean hasEgressable();
  /**
   * <pre>
   * Indicates the Entity should be egressed to external sources.
   * Integrations choose how the egressing happens (e.g. if an Entity needs fuzzing).
   * </pre>
   *
   * <code>.google.protobuf.BoolValue egressable = 6 [json_name = "egressable", (.anduril.entitymanager.v1.overridable) = true];</code>
   * @return The egressable.
   */
  com.google.protobuf.BoolValue getEgressable();
  /**
   * <pre>
   * Indicates the Entity should be egressed to external sources.
   * Integrations choose how the egressing happens (e.g. if an Entity needs fuzzing).
   * </pre>
   *
   * <code>.google.protobuf.BoolValue egressable = 6 [json_name = "egressable", (.anduril.entitymanager.v1.overridable) = true];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getEgressableOrBuilder();

  /**
   * <pre>
   * A signal of arbitrary importance such that the entity should be globally marked for all users
   * </pre>
   *
   * <code>.google.protobuf.BoolValue starred = 7 [json_name = "starred", (.anduril.entitymanager.v1.overridable) = true];</code>
   * @return Whether the starred field is set.
   */
  boolean hasStarred();
  /**
   * <pre>
   * A signal of arbitrary importance such that the entity should be globally marked for all users
   * </pre>
   *
   * <code>.google.protobuf.BoolValue starred = 7 [json_name = "starred", (.anduril.entitymanager.v1.overridable) = true];</code>
   * @return The starred.
   */
  com.google.protobuf.BoolValue getStarred();
  /**
   * <pre>
   * A signal of arbitrary importance such that the entity should be globally marked for all users
   * </pre>
   *
   * <code>.google.protobuf.BoolValue starred = 7 [json_name = "starred", (.anduril.entitymanager.v1.overridable) = true];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getStarredOrBuilder();
}
