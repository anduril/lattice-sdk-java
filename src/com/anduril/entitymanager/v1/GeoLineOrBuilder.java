// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/geoentity.pub.proto

package com.anduril.entitymanager.v1;

public interface GeoLineOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.GeoLine)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .anduril.entitymanager.v1.Position positions = 1 [json_name = "positions"];</code>
   */
  java.util.List<com.anduril.entitymanager.v1.Position> 
      getPositionsList();
  /**
   * <code>repeated .anduril.entitymanager.v1.Position positions = 1 [json_name = "positions"];</code>
   */
  com.anduril.entitymanager.v1.Position getPositions(int index);
  /**
   * <code>repeated .anduril.entitymanager.v1.Position positions = 1 [json_name = "positions"];</code>
   */
  int getPositionsCount();
  /**
   * <code>repeated .anduril.entitymanager.v1.Position positions = 1 [json_name = "positions"];</code>
   */
  java.util.List<? extends com.anduril.entitymanager.v1.PositionOrBuilder> 
      getPositionsOrBuilderList();
  /**
   * <code>repeated .anduril.entitymanager.v1.Position positions = 1 [json_name = "positions"];</code>
   */
  com.anduril.entitymanager.v1.PositionOrBuilder getPositionsOrBuilder(
      int index);
}
