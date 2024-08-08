// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/target_priority.pub.proto

package com.anduril.entitymanager.v1;

public interface HighValueTargetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.HighValueTarget)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Indicates whether the target matches any description from a high value target list.
   * </pre>
   *
   * <code>bool is_high_value_target = 1 [json_name = "isHighValueTarget"];</code>
   * @return The isHighValueTarget.
   */
  boolean getIsHighValueTarget();

  /**
   * <pre>
   * The priority associated with the target. If the target's description appears on multiple high value target lists,
   * the priority will be a reflection of the highest priority of all of those list's target description.
   *
   * A lower value indicates the target is of a higher priority, with 1 being the highest possible priority. A value of
   * 0 indicates there is no priority associated with this target.
   * </pre>
   *
   * <code>uint32 target_priority = 2 [json_name = "targetPriority"];</code>
   * @return The targetPriority.
   */
  int getTargetPriority();

  /**
   * <pre>
   * All of the high value target descriptions that the target matches against.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.HighValueTargetMatch target_matches = 3 [json_name = "targetMatches"];</code>
   */
  java.util.List<com.anduril.entitymanager.v1.HighValueTargetMatch> 
      getTargetMatchesList();
  /**
   * <pre>
   * All of the high value target descriptions that the target matches against.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.HighValueTargetMatch target_matches = 3 [json_name = "targetMatches"];</code>
   */
  com.anduril.entitymanager.v1.HighValueTargetMatch getTargetMatches(int index);
  /**
   * <pre>
   * All of the high value target descriptions that the target matches against.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.HighValueTargetMatch target_matches = 3 [json_name = "targetMatches"];</code>
   */
  int getTargetMatchesCount();
  /**
   * <pre>
   * All of the high value target descriptions that the target matches against.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.HighValueTargetMatch target_matches = 3 [json_name = "targetMatches"];</code>
   */
  java.util.List<? extends com.anduril.entitymanager.v1.HighValueTargetMatchOrBuilder> 
      getTargetMatchesOrBuilderList();
  /**
   * <pre>
   * All of the high value target descriptions that the target matches against.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.HighValueTargetMatch target_matches = 3 [json_name = "targetMatches"];</code>
   */
  com.anduril.entitymanager.v1.HighValueTargetMatchOrBuilder getTargetMatchesOrBuilder(
      int index);

  /**
   * <pre>
   * Indicates whether the target is a 'High Payoff Target'. Targets can be one or both of high value and high payoff.
   * Semantically a High Value Target characterizes the target's importance to Red, whereas a High Payoff Target
   * indicates prosecuting the target furthers Blue's specific objectives.
   * </pre>
   *
   * <code>bool is_high_payoff_target = 4 [json_name = "isHighPayoffTarget"];</code>
   * @return The isHighPayoffTarget.
   */
  boolean getIsHighPayoffTarget();
}
