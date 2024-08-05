// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/tasks/v2/shared/isr.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.tasks.v2;

public interface InvestigateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.tasks.v2.Investigate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Indicates where to investigate.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
   * @return Whether the objective field is set.
   */
  boolean hasObjective();
  /**
   * <pre>
   * Indicates where to investigate.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
   * @return The objective.
   */
  com.anduril.tasks.v2.Objective getObjective();
  /**
   * <pre>
   * Indicates where to investigate.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
   */
  com.anduril.tasks.v2.ObjectiveOrBuilder getObjectiveOrBuilder();

  /**
   * <pre>
   * Optional common ISR parameters.
   * </pre>
   *
   * <code>.anduril.tasks.v2.ISRParameters parameters = 2 [json_name = "parameters"];</code>
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();
  /**
   * <pre>
   * Optional common ISR parameters.
   * </pre>
   *
   * <code>.anduril.tasks.v2.ISRParameters parameters = 2 [json_name = "parameters"];</code>
   * @return The parameters.
   */
  com.anduril.tasks.v2.ISRParameters getParameters();
  /**
   * <pre>
   * Optional common ISR parameters.
   * </pre>
   *
   * <code>.anduril.tasks.v2.ISRParameters parameters = 2 [json_name = "parameters"];</code>
   */
  com.anduril.tasks.v2.ISRParametersOrBuilder getParametersOrBuilder();
}
