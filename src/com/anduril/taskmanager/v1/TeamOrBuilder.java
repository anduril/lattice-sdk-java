// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/taskmanager/v1/task.pub.proto

package com.anduril.taskmanager.v1;

public interface TeamOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.taskmanager.v1.Team)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Entity ID of the team
   * </pre>
   *
   * <code>string entity_id = 1 [json_name = "entityId"];</code>
   * @return The entityId.
   */
  java.lang.String getEntityId();
  /**
   * <pre>
   * Entity ID of the team
   * </pre>
   *
   * <code>string entity_id = 1 [json_name = "entityId"];</code>
   * @return The bytes for entityId.
   */
  com.google.protobuf.ByteString
      getEntityIdBytes();

  /**
   * <code>repeated .anduril.taskmanager.v1.Agent members = 2 [json_name = "members"];</code>
   */
  java.util.List<com.anduril.taskmanager.v1.Agent> 
      getMembersList();
  /**
   * <code>repeated .anduril.taskmanager.v1.Agent members = 2 [json_name = "members"];</code>
   */
  com.anduril.taskmanager.v1.Agent getMembers(int index);
  /**
   * <code>repeated .anduril.taskmanager.v1.Agent members = 2 [json_name = "members"];</code>
   */
  int getMembersCount();
  /**
   * <code>repeated .anduril.taskmanager.v1.Agent members = 2 [json_name = "members"];</code>
   */
  java.util.List<? extends com.anduril.taskmanager.v1.AgentOrBuilder> 
      getMembersOrBuilderList();
  /**
   * <code>repeated .anduril.taskmanager.v1.Agent members = 2 [json_name = "members"];</code>
   */
  com.anduril.taskmanager.v1.AgentOrBuilder getMembersOrBuilder(
      int index);
}
