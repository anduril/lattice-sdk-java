// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/shared/isr.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.tasks.v2;

public interface MapOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.tasks.v2.Map)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Indicates where to perform the SAR.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
   * @return Whether the objective field is set.
   */
  boolean hasObjective();
  /**
   * <pre>
   * Indicates where to perform the SAR.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
   * @return The objective.
   */
  com.anduril.tasks.v2.Objective getObjective();
  /**
   * <pre>
   * Indicates where to perform the SAR.
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

  /**
   * <pre>
   * minimum desired NIIRS (National Image Interpretability Rating Scales) see https://irp.fas.org/imint/niirs.htm
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value min_niirs = 3 [json_name = "minNiirs"];</code>
   * @return Whether the minNiirs field is set.
   */
  boolean hasMinNiirs();
  /**
   * <pre>
   * minimum desired NIIRS (National Image Interpretability Rating Scales) see https://irp.fas.org/imint/niirs.htm
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value min_niirs = 3 [json_name = "minNiirs"];</code>
   * @return The minNiirs.
   */
  com.google.protobuf.UInt32Value getMinNiirs();
  /**
   * <pre>
   * minimum desired NIIRS (National Image Interpretability Rating Scales) see https://irp.fas.org/imint/niirs.htm
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value min_niirs = 3 [json_name = "minNiirs"];</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getMinNiirsOrBuilder();
}
