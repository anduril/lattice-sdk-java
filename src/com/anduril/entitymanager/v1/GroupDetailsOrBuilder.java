// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/group.pub.proto

package com.anduril.entitymanager.v1;

public interface GroupDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.GroupDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.anduril.entitymanager.v1.Team team = 1 [json_name = "team"];</code>
   * @return Whether the team field is set.
   */
  boolean hasTeam();
  /**
   * <code>.anduril.entitymanager.v1.Team team = 1 [json_name = "team"];</code>
   * @return The team.
   */
  com.anduril.entitymanager.v1.Team getTeam();
  /**
   * <code>.anduril.entitymanager.v1.Team team = 1 [json_name = "team"];</code>
   */
  com.anduril.entitymanager.v1.TeamOrBuilder getTeamOrBuilder();

  /**
   * <code>.anduril.entitymanager.v1.Echelon echelon = 3 [json_name = "echelon"];</code>
   * @return Whether the echelon field is set.
   */
  boolean hasEchelon();
  /**
   * <code>.anduril.entitymanager.v1.Echelon echelon = 3 [json_name = "echelon"];</code>
   * @return The echelon.
   */
  com.anduril.entitymanager.v1.Echelon getEchelon();
  /**
   * <code>.anduril.entitymanager.v1.Echelon echelon = 3 [json_name = "echelon"];</code>
   */
  com.anduril.entitymanager.v1.EchelonOrBuilder getEchelonOrBuilder();

  com.anduril.entitymanager.v1.GroupDetails.GroupTypeCase getGroupTypeCase();
}
