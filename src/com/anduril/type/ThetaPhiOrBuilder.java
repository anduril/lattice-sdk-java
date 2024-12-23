// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/type/coords.pub.proto

package com.anduril.type;

public interface ThetaPhiOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.type.ThetaPhi)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Angle clockwise relative to forward in degrees (Azimuth).
   * </pre>
   *
   * <code>double theta = 1 [json_name = "theta"];</code>
   * @return The theta.
   */
  double getTheta();

  /**
   * <pre>
   * Angle upward relative to forward in degrees (Elevation).
   * </pre>
   *
   * <code>double phi = 2 [json_name = "phi"];</code>
   * @return The phi.
   */
  double getPhi();
}
