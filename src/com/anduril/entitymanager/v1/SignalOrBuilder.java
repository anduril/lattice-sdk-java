// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/signal.pub.proto

package com.anduril.entitymanager.v1;

public interface SignalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.Signal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.anduril.entitymanager.v1.Frequency frequency_center = 1 [json_name = "frequencyCenter"];</code>
   * @return Whether the frequencyCenter field is set.
   */
  boolean hasFrequencyCenter();
  /**
   * <code>.anduril.entitymanager.v1.Frequency frequency_center = 1 [json_name = "frequencyCenter"];</code>
   * @return The frequencyCenter.
   */
  com.anduril.entitymanager.v1.Frequency getFrequencyCenter();
  /**
   * <code>.anduril.entitymanager.v1.Frequency frequency_center = 1 [json_name = "frequencyCenter"];</code>
   */
  com.anduril.entitymanager.v1.FrequencyOrBuilder getFrequencyCenterOrBuilder();

  /**
   * <code>.anduril.entitymanager.v1.FrequencyRange frequency_range = 2 [json_name = "frequencyRange"];</code>
   * @return Whether the frequencyRange field is set.
   */
  boolean hasFrequencyRange();
  /**
   * <code>.anduril.entitymanager.v1.FrequencyRange frequency_range = 2 [json_name = "frequencyRange"];</code>
   * @return The frequencyRange.
   */
  com.anduril.entitymanager.v1.FrequencyRange getFrequencyRange();
  /**
   * <code>.anduril.entitymanager.v1.FrequencyRange frequency_range = 2 [json_name = "frequencyRange"];</code>
   */
  com.anduril.entitymanager.v1.FrequencyRangeOrBuilder getFrequencyRangeOrBuilder();

  /**
   * <pre>
   * Indicates the bandwidth of a signal (Hz).
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue bandwidth_hz = 3 [json_name = "bandwidthHz"];</code>
   * @return Whether the bandwidthHz field is set.
   */
  boolean hasBandwidthHz();
  /**
   * <pre>
   * Indicates the bandwidth of a signal (Hz).
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue bandwidth_hz = 3 [json_name = "bandwidthHz"];</code>
   * @return The bandwidthHz.
   */
  com.google.protobuf.DoubleValue getBandwidthHz();
  /**
   * <pre>
   * Indicates the bandwidth of a signal (Hz).
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue bandwidth_hz = 3 [json_name = "bandwidthHz"];</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getBandwidthHzOrBuilder();

  /**
   * <pre>
   * Indicates the signal to noise (SNR) of this signal.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue signal_to_noise_ratio = 4 [json_name = "signalToNoiseRatio"];</code>
   * @return Whether the signalToNoiseRatio field is set.
   */
  boolean hasSignalToNoiseRatio();
  /**
   * <pre>
   * Indicates the signal to noise (SNR) of this signal.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue signal_to_noise_ratio = 4 [json_name = "signalToNoiseRatio"];</code>
   * @return The signalToNoiseRatio.
   */
  com.google.protobuf.DoubleValue getSignalToNoiseRatio();
  /**
   * <pre>
   * Indicates the signal to noise (SNR) of this signal.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue signal_to_noise_ratio = 4 [json_name = "signalToNoiseRatio"];</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getSignalToNoiseRatioOrBuilder();

  /**
   * <code>.anduril.entitymanager.v1.LineOfBearing line_of_bearing = 5 [json_name = "lineOfBearing"];</code>
   * @return Whether the lineOfBearing field is set.
   */
  boolean hasLineOfBearing();
  /**
   * <code>.anduril.entitymanager.v1.LineOfBearing line_of_bearing = 5 [json_name = "lineOfBearing"];</code>
   * @return The lineOfBearing.
   */
  com.anduril.entitymanager.v1.LineOfBearing getLineOfBearing();
  /**
   * <code>.anduril.entitymanager.v1.LineOfBearing line_of_bearing = 5 [json_name = "lineOfBearing"];</code>
   */
  com.anduril.entitymanager.v1.LineOfBearingOrBuilder getLineOfBearingOrBuilder();

  /**
   * <code>.anduril.entitymanager.v1.Fixed fixed = 6 [json_name = "fixed"];</code>
   * @return Whether the fixed field is set.
   */
  boolean hasFixed();
  /**
   * <code>.anduril.entitymanager.v1.Fixed fixed = 6 [json_name = "fixed"];</code>
   * @return The fixed.
   */
  com.anduril.entitymanager.v1.Fixed getFixed();
  /**
   * <code>.anduril.entitymanager.v1.Fixed fixed = 6 [json_name = "fixed"];</code>
   */
  com.anduril.entitymanager.v1.FixedOrBuilder getFixedOrBuilder();

  /**
   * <pre>
   * Emitter notations associated with this entity.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.EmitterNotation emitter_notations = 7 [json_name = "emitterNotations"];</code>
   */
  java.util.List<com.anduril.entitymanager.v1.EmitterNotation> 
      getEmitterNotationsList();
  /**
   * <pre>
   * Emitter notations associated with this entity.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.EmitterNotation emitter_notations = 7 [json_name = "emitterNotations"];</code>
   */
  com.anduril.entitymanager.v1.EmitterNotation getEmitterNotations(int index);
  /**
   * <pre>
   * Emitter notations associated with this entity.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.EmitterNotation emitter_notations = 7 [json_name = "emitterNotations"];</code>
   */
  int getEmitterNotationsCount();
  /**
   * <pre>
   * Emitter notations associated with this entity.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.EmitterNotation emitter_notations = 7 [json_name = "emitterNotations"];</code>
   */
  java.util.List<? extends com.anduril.entitymanager.v1.EmitterNotationOrBuilder> 
      getEmitterNotationsOrBuilderList();
  /**
   * <pre>
   * Emitter notations associated with this entity.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.EmitterNotation emitter_notations = 7 [json_name = "emitterNotations"];</code>
   */
  com.anduril.entitymanager.v1.EmitterNotationOrBuilder getEmitterNotationsOrBuilder(
      int index);

  /**
   * <pre>
   * length in time of a single pulse
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue pulse_width_s = 8 [json_name = "pulseWidthS"];</code>
   * @return Whether the pulseWidthS field is set.
   */
  boolean hasPulseWidthS();
  /**
   * <pre>
   * length in time of a single pulse
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue pulse_width_s = 8 [json_name = "pulseWidthS"];</code>
   * @return The pulseWidthS.
   */
  com.google.protobuf.DoubleValue getPulseWidthS();
  /**
   * <pre>
   * length in time of a single pulse
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue pulse_width_s = 8 [json_name = "pulseWidthS"];</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getPulseWidthSOrBuilder();

  /**
   * <pre>
   * length in time between the start of two pulses
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.PulseRepetitionInterval pulse_repetition_interval = 9 [json_name = "pulseRepetitionInterval"];</code>
   * @return Whether the pulseRepetitionInterval field is set.
   */
  boolean hasPulseRepetitionInterval();
  /**
   * <pre>
   * length in time between the start of two pulses
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.PulseRepetitionInterval pulse_repetition_interval = 9 [json_name = "pulseRepetitionInterval"];</code>
   * @return The pulseRepetitionInterval.
   */
  com.anduril.entitymanager.v1.PulseRepetitionInterval getPulseRepetitionInterval();
  /**
   * <pre>
   * length in time between the start of two pulses
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.PulseRepetitionInterval pulse_repetition_interval = 9 [json_name = "pulseRepetitionInterval"];</code>
   */
  com.anduril.entitymanager.v1.PulseRepetitionIntervalOrBuilder getPulseRepetitionIntervalOrBuilder();

  /**
   * <pre>
   * describes how a signal is observing the environment
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.ScanCharacteristics scan_characteristics = 11 [json_name = "scanCharacteristics"];</code>
   * @return Whether the scanCharacteristics field is set.
   */
  boolean hasScanCharacteristics();
  /**
   * <pre>
   * describes how a signal is observing the environment
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.ScanCharacteristics scan_characteristics = 11 [json_name = "scanCharacteristics"];</code>
   * @return The scanCharacteristics.
   */
  com.anduril.entitymanager.v1.ScanCharacteristics getScanCharacteristics();
  /**
   * <pre>
   * describes how a signal is observing the environment
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.ScanCharacteristics scan_characteristics = 11 [json_name = "scanCharacteristics"];</code>
   */
  com.anduril.entitymanager.v1.ScanCharacteristicsOrBuilder getScanCharacteristicsOrBuilder();

  com.anduril.entitymanager.v1.Signal.FrequencyMeasurementCase getFrequencyMeasurementCase();

  com.anduril.entitymanager.v1.Signal.ReportCase getReportCase();
}
