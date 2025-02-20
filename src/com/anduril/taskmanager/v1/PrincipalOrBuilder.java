// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/taskmanager/v1/task.pub.proto

package com.anduril.taskmanager.v1;

public interface PrincipalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.taskmanager.v1.Principal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.anduril.taskmanager.v1.System system = 1 [json_name = "system"];</code>
   * @return Whether the system field is set.
   */
  boolean hasSystem();
  /**
   * <code>.anduril.taskmanager.v1.System system = 1 [json_name = "system"];</code>
   * @return The system.
   */
  com.anduril.taskmanager.v1.System getSystem();
  /**
   * <code>.anduril.taskmanager.v1.System system = 1 [json_name = "system"];</code>
   */
  com.anduril.taskmanager.v1.SystemOrBuilder getSystemOrBuilder();

  /**
   * <code>.anduril.taskmanager.v1.User user = 2 [json_name = "user"];</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <code>.anduril.taskmanager.v1.User user = 2 [json_name = "user"];</code>
   * @return The user.
   */
  com.anduril.taskmanager.v1.User getUser();
  /**
   * <code>.anduril.taskmanager.v1.User user = 2 [json_name = "user"];</code>
   */
  com.anduril.taskmanager.v1.UserOrBuilder getUserOrBuilder();

  /**
   * <code>.anduril.taskmanager.v1.Team team = 4 [json_name = "team"];</code>
   * @return Whether the team field is set.
   */
  boolean hasTeam();
  /**
   * <code>.anduril.taskmanager.v1.Team team = 4 [json_name = "team"];</code>
   * @return The team.
   */
  com.anduril.taskmanager.v1.Team getTeam();
  /**
   * <code>.anduril.taskmanager.v1.Team team = 4 [json_name = "team"];</code>
   */
  com.anduril.taskmanager.v1.TeamOrBuilder getTeamOrBuilder();

  /**
   * <pre>
   * The Principal _this_ Principal is acting on behalf of.
   *
   * Likely only populated once in the nesting (i.e. the "on_behalf_of" Principal would not have another "on_behalf_of" in most cases).
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Principal on_behalf_of = 3 [json_name = "onBehalfOf"];</code>
   * @return Whether the onBehalfOf field is set.
   */
  boolean hasOnBehalfOf();
  /**
   * <pre>
   * The Principal _this_ Principal is acting on behalf of.
   *
   * Likely only populated once in the nesting (i.e. the "on_behalf_of" Principal would not have another "on_behalf_of" in most cases).
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Principal on_behalf_of = 3 [json_name = "onBehalfOf"];</code>
   * @return The onBehalfOf.
   */
  com.anduril.taskmanager.v1.Principal getOnBehalfOf();
  /**
   * <pre>
   * The Principal _this_ Principal is acting on behalf of.
   *
   * Likely only populated once in the nesting (i.e. the "on_behalf_of" Principal would not have another "on_behalf_of" in most cases).
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Principal on_behalf_of = 3 [json_name = "onBehalfOf"];</code>
   */
  com.anduril.taskmanager.v1.PrincipalOrBuilder getOnBehalfOfOrBuilder();

  com.anduril.taskmanager.v1.Principal.AgentCase getAgentCase();
}
