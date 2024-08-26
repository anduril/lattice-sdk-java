// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/orbit.pub.proto

package com.anduril.entitymanager.v1;

public interface OrbitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.Orbit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Orbit Mean Elements data, analogous to the Orbit Mean Elements Message in CCSDS 502.0-B-3
   * </pre>
   *
   * <code>.anduril.type.OrbitMeanElements orbit_mean_elements = 1 [json_name = "orbitMeanElements"];</code>
   * @return Whether the orbitMeanElements field is set.
   */
  boolean hasOrbitMeanElements();
  /**
   * <pre>
   * Orbit Mean Elements data, analogous to the Orbit Mean Elements Message in CCSDS 502.0-B-3
   * </pre>
   *
   * <code>.anduril.type.OrbitMeanElements orbit_mean_elements = 1 [json_name = "orbitMeanElements"];</code>
   * @return The orbitMeanElements.
   */
  com.anduril.type.OrbitMeanElements getOrbitMeanElements();
  /**
   * <pre>
   * Orbit Mean Elements data, analogous to the Orbit Mean Elements Message in CCSDS 502.0-B-3
   * </pre>
   *
   * <code>.anduril.type.OrbitMeanElements orbit_mean_elements = 1 [json_name = "orbitMeanElements"];</code>
   */
  com.anduril.type.OrbitMeanElementsOrBuilder getOrbitMeanElementsOrBuilder();
}
