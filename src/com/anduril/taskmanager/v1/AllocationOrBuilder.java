// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/taskmanager/v1/task.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.taskmanager.v1;

public interface AllocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.taskmanager.v1.Allocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Agents actively being utilized in a Task.
   * </pre>
   *
   * <code>repeated .anduril.taskmanager.v1.Agent active_agents = 1 [json_name = "activeAgents"];</code>
   */
  java.util.List<com.anduril.taskmanager.v1.Agent> 
      getActiveAgentsList();
  /**
   * <pre>
   * Agents actively being utilized in a Task.
   * </pre>
   *
   * <code>repeated .anduril.taskmanager.v1.Agent active_agents = 1 [json_name = "activeAgents"];</code>
   */
  com.anduril.taskmanager.v1.Agent getActiveAgents(int index);
  /**
   * <pre>
   * Agents actively being utilized in a Task.
   * </pre>
   *
   * <code>repeated .anduril.taskmanager.v1.Agent active_agents = 1 [json_name = "activeAgents"];</code>
   */
  int getActiveAgentsCount();
  /**
   * <pre>
   * Agents actively being utilized in a Task.
   * </pre>
   *
   * <code>repeated .anduril.taskmanager.v1.Agent active_agents = 1 [json_name = "activeAgents"];</code>
   */
  java.util.List<? extends com.anduril.taskmanager.v1.AgentOrBuilder> 
      getActiveAgentsOrBuilderList();
  /**
   * <pre>
   * Agents actively being utilized in a Task.
   * </pre>
   *
   * <code>repeated .anduril.taskmanager.v1.Agent active_agents = 1 [json_name = "activeAgents"];</code>
   */
  com.anduril.taskmanager.v1.AgentOrBuilder getActiveAgentsOrBuilder(
      int index);
}
