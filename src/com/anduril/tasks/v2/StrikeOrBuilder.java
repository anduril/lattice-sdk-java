// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/shared/strike.pub.proto

package com.anduril.tasks.v2;

public interface StrikeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.tasks.v2.Strike)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Objective to Strike.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
   * @return Whether the objective field is set.
   */
  boolean hasObjective();
  /**
   * <pre>
   * Objective to Strike.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
   * @return The objective.
   */
  com.anduril.tasks.v2.Objective getObjective();
  /**
   * <pre>
   * Objective to Strike.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
   */
  com.anduril.tasks.v2.ObjectiveOrBuilder getObjectiveOrBuilder();

  /**
   * <pre>
   * Angle range within which to ingress.
   * </pre>
   *
   * <code>.anduril.tasks.v2.AnglePair ingress_angle = 2 [json_name = "ingressAngle"];</code>
   * @return Whether the ingressAngle field is set.
   */
  boolean hasIngressAngle();
  /**
   * <pre>
   * Angle range within which to ingress.
   * </pre>
   *
   * <code>.anduril.tasks.v2.AnglePair ingress_angle = 2 [json_name = "ingressAngle"];</code>
   * @return The ingressAngle.
   */
  com.anduril.tasks.v2.AnglePair getIngressAngle();
  /**
   * <pre>
   * Angle range within which to ingress.
   * </pre>
   *
   * <code>.anduril.tasks.v2.AnglePair ingress_angle = 2 [json_name = "ingressAngle"];</code>
   */
  com.anduril.tasks.v2.AnglePairOrBuilder getIngressAngleOrBuilder();

  /**
   * <pre>
   * Distance at which to yield flight control to the onboard flight computer rather than
   * higher level autonomy.
   * </pre>
   *
   * <code>.anduril.tasks.v2.StrikeReleaseConstraint strike_release_constraint = 3 [json_name = "strikeReleaseConstraint"];</code>
   * @return Whether the strikeReleaseConstraint field is set.
   */
  boolean hasStrikeReleaseConstraint();
  /**
   * <pre>
   * Distance at which to yield flight control to the onboard flight computer rather than
   * higher level autonomy.
   * </pre>
   *
   * <code>.anduril.tasks.v2.StrikeReleaseConstraint strike_release_constraint = 3 [json_name = "strikeReleaseConstraint"];</code>
   * @return The strikeReleaseConstraint.
   */
  com.anduril.tasks.v2.StrikeReleaseConstraint getStrikeReleaseConstraint();
  /**
   * <pre>
   * Distance at which to yield flight control to the onboard flight computer rather than
   * higher level autonomy.
   * </pre>
   *
   * <code>.anduril.tasks.v2.StrikeReleaseConstraint strike_release_constraint = 3 [json_name = "strikeReleaseConstraint"];</code>
   */
  com.anduril.tasks.v2.StrikeReleaseConstraintOrBuilder getStrikeReleaseConstraintOrBuilder();

  /**
   * <pre>
   * Optional parameters associated with the Strike task.
   * </pre>
   *
   * <code>.anduril.tasks.v2.StrikeParameters parameters = 4 [json_name = "parameters"];</code>
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();
  /**
   * <pre>
   * Optional parameters associated with the Strike task.
   * </pre>
   *
   * <code>.anduril.tasks.v2.StrikeParameters parameters = 4 [json_name = "parameters"];</code>
   * @return The parameters.
   */
  com.anduril.tasks.v2.StrikeParameters getParameters();
  /**
   * <pre>
   * Optional parameters associated with the Strike task.
   * </pre>
   *
   * <code>.anduril.tasks.v2.StrikeParameters parameters = 4 [json_name = "parameters"];</code>
   */
  com.anduril.tasks.v2.StrikeParametersOrBuilder getParametersOrBuilder();
}