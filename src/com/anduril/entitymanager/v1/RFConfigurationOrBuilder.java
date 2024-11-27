// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/sensors.pub.proto

package com.anduril.entitymanager.v1;

public interface RFConfigurationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.RFConfiguration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Frequency ranges that are available for this sensor.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.FloatRange frequency_range = 1 [json_name = "frequencyRange", deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<com.anduril.entitymanager.v1.FloatRange> 
      getFrequencyRangeList();
  /**
   * <pre>
   * Frequency ranges that are available for this sensor.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.FloatRange frequency_range = 1 [json_name = "frequencyRange", deprecated = true];</code>
   */
  @java.lang.Deprecated com.anduril.entitymanager.v1.FloatRange getFrequencyRange(int index);
  /**
   * <pre>
   * Frequency ranges that are available for this sensor.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.FloatRange frequency_range = 1 [json_name = "frequencyRange", deprecated = true];</code>
   */
  @java.lang.Deprecated int getFrequencyRangeCount();
  /**
   * <pre>
   * Frequency ranges that are available for this sensor.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.FloatRange frequency_range = 1 [json_name = "frequencyRange", deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<? extends com.anduril.entitymanager.v1.FloatRangeOrBuilder> 
      getFrequencyRangeOrBuilderList();
  /**
   * <pre>
   * Frequency ranges that are available for this sensor.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.FloatRange frequency_range = 1 [json_name = "frequencyRange", deprecated = true];</code>
   */
  @java.lang.Deprecated com.anduril.entitymanager.v1.FloatRangeOrBuilder getFrequencyRangeOrBuilder(
      int index);

  /**
   * <pre>
   * Bandwidth ranges that are available for this sensor.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.FloatRange bandwidth_range = 2 [json_name = "bandwidthRange", deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<com.anduril.entitymanager.v1.FloatRange> 
      getBandwidthRangeList();
  /**
   * <pre>
   * Bandwidth ranges that are available for this sensor.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.FloatRange bandwidth_range = 2 [json_name = "bandwidthRange", deprecated = true];</code>
   */
  @java.lang.Deprecated com.anduril.entitymanager.v1.FloatRange getBandwidthRange(int index);
  /**
   * <pre>
   * Bandwidth ranges that are available for this sensor.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.FloatRange bandwidth_range = 2 [json_name = "bandwidthRange", deprecated = true];</code>
   */
  @java.lang.Deprecated int getBandwidthRangeCount();
  /**
   * <pre>
   * Bandwidth ranges that are available for this sensor.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.FloatRange bandwidth_range = 2 [json_name = "bandwidthRange", deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<? extends com.anduril.entitymanager.v1.FloatRangeOrBuilder> 
      getBandwidthRangeOrBuilderList();
  /**
   * <pre>
   * Bandwidth ranges that are available for this sensor.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.FloatRange bandwidth_range = 2 [json_name = "bandwidthRange", deprecated = true];</code>
   */
  @java.lang.Deprecated com.anduril.entitymanager.v1.FloatRangeOrBuilder getBandwidthRangeOrBuilder(
      int index);

  /**
   * <pre>
   * Frequency ranges that are available for this sensor.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.FrequencyRange frequency_range_hz = 3 [json_name = "frequencyRangeHz"];</code>
   */
  java.util.List<com.anduril.entitymanager.v1.FrequencyRange> 
      getFrequencyRangeHzList();
  /**
   * <pre>
   * Frequency ranges that are available for this sensor.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.FrequencyRange frequency_range_hz = 3 [json_name = "frequencyRangeHz"];</code>
   */
  com.anduril.entitymanager.v1.FrequencyRange getFrequencyRangeHz(int index);
  /**
   * <pre>
   * Frequency ranges that are available for this sensor.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.FrequencyRange frequency_range_hz = 3 [json_name = "frequencyRangeHz"];</code>
   */
  int getFrequencyRangeHzCount();
  /**
   * <pre>
   * Frequency ranges that are available for this sensor.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.FrequencyRange frequency_range_hz = 3 [json_name = "frequencyRangeHz"];</code>
   */
  java.util.List<? extends com.anduril.entitymanager.v1.FrequencyRangeOrBuilder> 
      getFrequencyRangeHzOrBuilderList();
  /**
   * <pre>
   * Frequency ranges that are available for this sensor.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.FrequencyRange frequency_range_hz = 3 [json_name = "frequencyRangeHz"];</code>
   */
  com.anduril.entitymanager.v1.FrequencyRangeOrBuilder getFrequencyRangeHzOrBuilder(
      int index);

  /**
   * <pre>
   * Bandwidth ranges that are available for this sensor.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.BandwidthRange bandwidth_range_hz = 4 [json_name = "bandwidthRangeHz"];</code>
   */
  java.util.List<com.anduril.entitymanager.v1.BandwidthRange> 
      getBandwidthRangeHzList();
  /**
   * <pre>
   * Bandwidth ranges that are available for this sensor.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.BandwidthRange bandwidth_range_hz = 4 [json_name = "bandwidthRangeHz"];</code>
   */
  com.anduril.entitymanager.v1.BandwidthRange getBandwidthRangeHz(int index);
  /**
   * <pre>
   * Bandwidth ranges that are available for this sensor.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.BandwidthRange bandwidth_range_hz = 4 [json_name = "bandwidthRangeHz"];</code>
   */
  int getBandwidthRangeHzCount();
  /**
   * <pre>
   * Bandwidth ranges that are available for this sensor.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.BandwidthRange bandwidth_range_hz = 4 [json_name = "bandwidthRangeHz"];</code>
   */
  java.util.List<? extends com.anduril.entitymanager.v1.BandwidthRangeOrBuilder> 
      getBandwidthRangeHzOrBuilderList();
  /**
   * <pre>
   * Bandwidth ranges that are available for this sensor.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.BandwidthRange bandwidth_range_hz = 4 [json_name = "bandwidthRangeHz"];</code>
   */
  com.anduril.entitymanager.v1.BandwidthRangeOrBuilder getBandwidthRangeHzOrBuilder(
      int index);
}