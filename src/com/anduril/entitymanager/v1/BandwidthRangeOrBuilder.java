// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/sensors.pub.proto

package com.anduril.entitymanager.v1;

public interface BandwidthRangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.BandwidthRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.anduril.entitymanager.v1.Bandwidth minimum_bandwidth = 1 [json_name = "minimumBandwidth"];</code>
   * @return Whether the minimumBandwidth field is set.
   */
  boolean hasMinimumBandwidth();
  /**
   * <code>.anduril.entitymanager.v1.Bandwidth minimum_bandwidth = 1 [json_name = "minimumBandwidth"];</code>
   * @return The minimumBandwidth.
   */
  com.anduril.entitymanager.v1.Bandwidth getMinimumBandwidth();
  /**
   * <code>.anduril.entitymanager.v1.Bandwidth minimum_bandwidth = 1 [json_name = "minimumBandwidth"];</code>
   */
  com.anduril.entitymanager.v1.BandwidthOrBuilder getMinimumBandwidthOrBuilder();

  /**
   * <code>.anduril.entitymanager.v1.Bandwidth maximum_bandwidth = 2 [json_name = "maximumBandwidth"];</code>
   * @return Whether the maximumBandwidth field is set.
   */
  boolean hasMaximumBandwidth();
  /**
   * <code>.anduril.entitymanager.v1.Bandwidth maximum_bandwidth = 2 [json_name = "maximumBandwidth"];</code>
   * @return The maximumBandwidth.
   */
  com.anduril.entitymanager.v1.Bandwidth getMaximumBandwidth();
  /**
   * <code>.anduril.entitymanager.v1.Bandwidth maximum_bandwidth = 2 [json_name = "maximumBandwidth"];</code>
   */
  com.anduril.entitymanager.v1.BandwidthOrBuilder getMaximumBandwidthOrBuilder();
}
