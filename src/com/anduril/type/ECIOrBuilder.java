// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/type/coords.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.type;

public interface ECIOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.type.ECI)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Holds the x-coordinate of ECI.
   * </pre>
   *
   * <code>double x = 1 [json_name = "x"];</code>
   * @return The x.
   */
  double getX();

  /**
   * <pre>
   * Holds the y-coordinate of ECI.
   * </pre>
   *
   * <code>double y = 2 [json_name = "y"];</code>
   * @return The y.
   */
  double getY();

  /**
   * <pre>
   * Holds the z-coordinate of ECI.
   * </pre>
   *
   * <code>double z = 3 [json_name = "z"];</code>
   * @return The z.
   */
  double getZ();
}
