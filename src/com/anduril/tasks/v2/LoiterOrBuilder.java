// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/shared/isr.pub.proto

package com.anduril.tasks.v2;

public interface LoiterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.tasks.v2.Loiter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Indicates where to perform the loiter.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
   * @return Whether the objective field is set.
   */
  boolean hasObjective();
  /**
   * <pre>
   * Indicates where to perform the loiter.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
   * @return The objective.
   */
  com.anduril.tasks.v2.Objective getObjective();
  /**
   * <pre>
   * Indicates where to perform the loiter.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
   */
  com.anduril.tasks.v2.ObjectiveOrBuilder getObjectiveOrBuilder();

  /**
   * <pre>
   * Specifies the details of the loiter.
   * </pre>
   *
   * <code>.anduril.tasks.v2.LoiterType loiter_type = 2 [json_name = "loiterType"];</code>
   * @return Whether the loiterType field is set.
   */
  boolean hasLoiterType();
  /**
   * <pre>
   * Specifies the details of the loiter.
   * </pre>
   *
   * <code>.anduril.tasks.v2.LoiterType loiter_type = 2 [json_name = "loiterType"];</code>
   * @return The loiterType.
   */
  com.anduril.tasks.v2.LoiterType getLoiterType();
  /**
   * <pre>
   * Specifies the details of the loiter.
   * </pre>
   *
   * <code>.anduril.tasks.v2.LoiterType loiter_type = 2 [json_name = "loiterType"];</code>
   */
  com.anduril.tasks.v2.LoiterTypeOrBuilder getLoiterTypeOrBuilder();

  /**
   * <pre>
   * Optional common ISR parameters.
   * The loiter radius and bearing should be inferred from the standoff_distance and standoff_angle respectively.
   * </pre>
   *
   * <code>.anduril.tasks.v2.ISRParameters parameters = 3 [json_name = "parameters"];</code>
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();
  /**
   * <pre>
   * Optional common ISR parameters.
   * The loiter radius and bearing should be inferred from the standoff_distance and standoff_angle respectively.
   * </pre>
   *
   * <code>.anduril.tasks.v2.ISRParameters parameters = 3 [json_name = "parameters"];</code>
   * @return The parameters.
   */
  com.anduril.tasks.v2.ISRParameters getParameters();
  /**
   * <pre>
   * Optional common ISR parameters.
   * The loiter radius and bearing should be inferred from the standoff_distance and standoff_angle respectively.
   * </pre>
   *
   * <code>.anduril.tasks.v2.ISRParameters parameters = 3 [json_name = "parameters"];</code>
   */
  com.anduril.tasks.v2.ISRParametersOrBuilder getParametersOrBuilder();
}
