// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/entitymanager/v1/signal.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * Enumerates the possible modulation types
 * </pre>
 *
 * Protobuf enum {@code anduril.entitymanager.v1.ModulationType}
 */
public enum ModulationType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MODULATION_TYPE_INVALID = 0;</code>
   */
  MODULATION_TYPE_INVALID(0),
  /**
   * <code>MODULATION_TYPE_AMPLITUDE = 1;</code>
   */
  MODULATION_TYPE_AMPLITUDE(1),
  /**
   * <code>MODULATION_TYPE_FREQUENCY = 2;</code>
   */
  MODULATION_TYPE_FREQUENCY(2),
  /**
   * <code>MODULATION_TYPE_PHASE = 3;</code>
   */
  MODULATION_TYPE_PHASE(3),
  /**
   * <code>MODULATION_TYPE_SPACED = 4;</code>
   */
  MODULATION_TYPE_SPACED(4),
  /**
   * <code>MODULATION_TYPE_AMPLITUDE_SHIFT_KEYING = 5;</code>
   */
  MODULATION_TYPE_AMPLITUDE_SHIFT_KEYING(5),
  /**
   * <code>MODULATION_TYPE_FREQUENCY_SHIFT_KEYING = 6;</code>
   */
  MODULATION_TYPE_FREQUENCY_SHIFT_KEYING(6),
  /**
   * <code>MODULATION_TYPE_PHASE_SHIFT_KEYING = 7;</code>
   */
  MODULATION_TYPE_PHASE_SHIFT_KEYING(7),
  /**
   * <code>MODULATION_TYPE_MINIMUM_SHIFT_KEYING = 8;</code>
   */
  MODULATION_TYPE_MINIMUM_SHIFT_KEYING(8),
  /**
   * <code>MODULATION_TYPE_MINIMUM_SHIFT_KEYING_GAUSSIAN = 9;</code>
   */
  MODULATION_TYPE_MINIMUM_SHIFT_KEYING_GAUSSIAN(9),
  /**
   * <code>MODULATION_TYPE_SINGLE_SIDE_BAND_UPPER = 10;</code>
   */
  MODULATION_TYPE_SINGLE_SIDE_BAND_UPPER(10),
  /**
   * <code>MODULATION_TYPE_SINGLE_SIDE_BAND_LOWER = 11;</code>
   */
  MODULATION_TYPE_SINGLE_SIDE_BAND_LOWER(11),
  /**
   * <code>MODULATION_TYPE_SINGLE_SIDE_BAND_FULL_CARRIER = 12;</code>
   */
  MODULATION_TYPE_SINGLE_SIDE_BAND_FULL_CARRIER(12),
  /**
   * <code>MODULATION_TYPE_SINGLE_SIDE_BAND_SUPPRESSED_CARRIER = 13;</code>
   */
  MODULATION_TYPE_SINGLE_SIDE_BAND_SUPPRESSED_CARRIER(13),
  /**
   * <code>MODULATION_TYPE_SINGLE_SIDE_BAND_REDUCED_CARRIER = 14;</code>
   */
  MODULATION_TYPE_SINGLE_SIDE_BAND_REDUCED_CARRIER(14),
  /**
   * <code>MODULATION_TYPE_SINGLE_SIDE_BAND_WITHOUT_CARRIER = 15;</code>
   */
  MODULATION_TYPE_SINGLE_SIDE_BAND_WITHOUT_CARRIER(15),
  /**
   * <code>MODULATION_TYPE_DUAL_SIDE_BAND_FULL_CARRIER = 16;</code>
   */
  MODULATION_TYPE_DUAL_SIDE_BAND_FULL_CARRIER(16),
  /**
   * <code>MODULATION_TYPE_DUAL_SIDE_BAND_SUPPRESSED_CARRIER = 17;</code>
   */
  MODULATION_TYPE_DUAL_SIDE_BAND_SUPPRESSED_CARRIER(17),
  /**
   * <code>MODULATION_TYPE_DUAL_SIDE_BAND_REDUCED_CARRIER = 18;</code>
   */
  MODULATION_TYPE_DUAL_SIDE_BAND_REDUCED_CARRIER(18),
  /**
   * <code>MODULATION_TYPE_DUAL_SIDE_BAND_WITHOUT_CARRIER = 19;</code>
   */
  MODULATION_TYPE_DUAL_SIDE_BAND_WITHOUT_CARRIER(19),
  /**
   * <code>MODULATION_TYPE_INDEPENDENT_SIDE_BAND = 20;</code>
   */
  MODULATION_TYPE_INDEPENDENT_SIDE_BAND(20),
  /**
   * <code>MODULATION_TYPE_VESTIGIAL_SIDE_BAND = 21;</code>
   */
  MODULATION_TYPE_VESTIGIAL_SIDE_BAND(21),
  /**
   * <code>MODULATION_TYPE_ON_OFF_KEYING = 22;</code>
   */
  MODULATION_TYPE_ON_OFF_KEYING(22),
  /**
   * <code>MODULATION_TYPE_MULTI_FREQUENCY_SHIFT_KEYING = 23;</code>
   */
  MODULATION_TYPE_MULTI_FREQUENCY_SHIFT_KEYING(23),
  /**
   * <code>MODULATION_TYPE_AUDIO_FREQUENCY_SHIFT_KEYING = 24;</code>
   */
  MODULATION_TYPE_AUDIO_FREQUENCY_SHIFT_KEYING(24),
  /**
   * <code>MODULATION_TYPE_CONTINUOUS_PHASE_FREQUENCY_SHIFT_KEYING = 25;</code>
   */
  MODULATION_TYPE_CONTINUOUS_PHASE_FREQUENCY_SHIFT_KEYING(25),
  /**
   * <code>MODULATION_TYPE_C_PHASE_SHIFT_KEYING = 26;</code>
   */
  MODULATION_TYPE_C_PHASE_SHIFT_KEYING(26),
  /**
   * <code>MODULATION_TYPE_DIFFERENTIALLY_ENCODED_BINARY_PHASE_SHIFT_KEYING = 27;</code>
   */
  MODULATION_TYPE_DIFFERENTIALLY_ENCODED_BINARY_PHASE_SHIFT_KEYING(27),
  /**
   * <code>MODULATION_TYPE_DIFFERENTIALLY_ENCODED_QUADRATURE_PHASE_SHIFT_KEYING = 28;</code>
   */
  MODULATION_TYPE_DIFFERENTIALLY_ENCODED_QUADRATURE_PHASE_SHIFT_KEYING(28),
  /**
   * <code>MODULATION_TYPE_OFFSET_QUADRATURE_PHASE_SHIFT_KEYING = 29;</code>
   */
  MODULATION_TYPE_OFFSET_QUADRATURE_PHASE_SHIFT_KEYING(29),
  /**
   * <code>MODULATION_TYPE_DIFFERENTIAL_PHASE_SHIFT_KEYING = 30;</code>
   */
  MODULATION_TYPE_DIFFERENTIAL_PHASE_SHIFT_KEYING(30),
  /**
   * <code>MODULATION_TYPE_PI_4_QUADRATURE_PHASE_SHIFT_KEYING = 31;</code>
   */
  MODULATION_TYPE_PI_4_QUADRATURE_PHASE_SHIFT_KEYING(31),
  /**
   * <code>MODULATION_TYPE_STACKED_OVERLAPPING_QUADRATURE_PHASE_SHIFT_KEYING = 32;</code>
   */
  MODULATION_TYPE_STACKED_OVERLAPPING_QUADRATURE_PHASE_SHIFT_KEYING(32),
  /**
   * <code>MODULATION_TYPE_F_QUADRATURE_PHASE_SHIFT_KEYING = 33;</code>
   */
  MODULATION_TYPE_F_QUADRATURE_PHASE_SHIFT_KEYING(33),
  /**
   * <code>MODULATION_TYPE_QUADRATURE_AMPLITUDE_ANALOG = 34;</code>
   */
  MODULATION_TYPE_QUADRATURE_AMPLITUDE_ANALOG(34),
  /**
   * <code>MODULATION_TYPE_QUADRATURE_AMPLITUDE_DIGITAL = 35;</code>
   */
  MODULATION_TYPE_QUADRATURE_AMPLITUDE_DIGITAL(35),
  /**
   * <code>MODULATION_TYPE_CONTINUOUS_PHASE = 36;</code>
   */
  MODULATION_TYPE_CONTINUOUS_PHASE(36),
  /**
   * <code>MODULATION_TYPE_PULSE_POSITION = 37;</code>
   */
  MODULATION_TYPE_PULSE_POSITION(37),
  /**
   * <code>MODULATION_TYPE_TRELLIS_CODE = 38;</code>
   */
  MODULATION_TYPE_TRELLIS_CODE(38),
  /**
   * <code>MODULATION_TYPE_ORTHOGONAL_FREQUENCY_DIVISION_MULTIPLEXING = 39;</code>
   */
  MODULATION_TYPE_ORTHOGONAL_FREQUENCY_DIVISION_MULTIPLEXING(39),
  /**
   * <code>MODULATION_TYPE_FREQUENCY_HOPPING_SPREAD_SPECTRUM = 40;</code>
   */
  MODULATION_TYPE_FREQUENCY_HOPPING_SPREAD_SPECTRUM(40),
  /**
   * <code>MODULATION_TYPE_DIGITAL_SEQUENCE_SPREAD_SPECTRUM = 41;</code>
   */
  MODULATION_TYPE_DIGITAL_SEQUENCE_SPREAD_SPECTRUM(41),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      ModulationType.class.getName());
  }
  /**
   * <code>MODULATION_TYPE_INVALID = 0;</code>
   */
  public static final int MODULATION_TYPE_INVALID_VALUE = 0;
  /**
   * <code>MODULATION_TYPE_AMPLITUDE = 1;</code>
   */
  public static final int MODULATION_TYPE_AMPLITUDE_VALUE = 1;
  /**
   * <code>MODULATION_TYPE_FREQUENCY = 2;</code>
   */
  public static final int MODULATION_TYPE_FREQUENCY_VALUE = 2;
  /**
   * <code>MODULATION_TYPE_PHASE = 3;</code>
   */
  public static final int MODULATION_TYPE_PHASE_VALUE = 3;
  /**
   * <code>MODULATION_TYPE_SPACED = 4;</code>
   */
  public static final int MODULATION_TYPE_SPACED_VALUE = 4;
  /**
   * <code>MODULATION_TYPE_AMPLITUDE_SHIFT_KEYING = 5;</code>
   */
  public static final int MODULATION_TYPE_AMPLITUDE_SHIFT_KEYING_VALUE = 5;
  /**
   * <code>MODULATION_TYPE_FREQUENCY_SHIFT_KEYING = 6;</code>
   */
  public static final int MODULATION_TYPE_FREQUENCY_SHIFT_KEYING_VALUE = 6;
  /**
   * <code>MODULATION_TYPE_PHASE_SHIFT_KEYING = 7;</code>
   */
  public static final int MODULATION_TYPE_PHASE_SHIFT_KEYING_VALUE = 7;
  /**
   * <code>MODULATION_TYPE_MINIMUM_SHIFT_KEYING = 8;</code>
   */
  public static final int MODULATION_TYPE_MINIMUM_SHIFT_KEYING_VALUE = 8;
  /**
   * <code>MODULATION_TYPE_MINIMUM_SHIFT_KEYING_GAUSSIAN = 9;</code>
   */
  public static final int MODULATION_TYPE_MINIMUM_SHIFT_KEYING_GAUSSIAN_VALUE = 9;
  /**
   * <code>MODULATION_TYPE_SINGLE_SIDE_BAND_UPPER = 10;</code>
   */
  public static final int MODULATION_TYPE_SINGLE_SIDE_BAND_UPPER_VALUE = 10;
  /**
   * <code>MODULATION_TYPE_SINGLE_SIDE_BAND_LOWER = 11;</code>
   */
  public static final int MODULATION_TYPE_SINGLE_SIDE_BAND_LOWER_VALUE = 11;
  /**
   * <code>MODULATION_TYPE_SINGLE_SIDE_BAND_FULL_CARRIER = 12;</code>
   */
  public static final int MODULATION_TYPE_SINGLE_SIDE_BAND_FULL_CARRIER_VALUE = 12;
  /**
   * <code>MODULATION_TYPE_SINGLE_SIDE_BAND_SUPPRESSED_CARRIER = 13;</code>
   */
  public static final int MODULATION_TYPE_SINGLE_SIDE_BAND_SUPPRESSED_CARRIER_VALUE = 13;
  /**
   * <code>MODULATION_TYPE_SINGLE_SIDE_BAND_REDUCED_CARRIER = 14;</code>
   */
  public static final int MODULATION_TYPE_SINGLE_SIDE_BAND_REDUCED_CARRIER_VALUE = 14;
  /**
   * <code>MODULATION_TYPE_SINGLE_SIDE_BAND_WITHOUT_CARRIER = 15;</code>
   */
  public static final int MODULATION_TYPE_SINGLE_SIDE_BAND_WITHOUT_CARRIER_VALUE = 15;
  /**
   * <code>MODULATION_TYPE_DUAL_SIDE_BAND_FULL_CARRIER = 16;</code>
   */
  public static final int MODULATION_TYPE_DUAL_SIDE_BAND_FULL_CARRIER_VALUE = 16;
  /**
   * <code>MODULATION_TYPE_DUAL_SIDE_BAND_SUPPRESSED_CARRIER = 17;</code>
   */
  public static final int MODULATION_TYPE_DUAL_SIDE_BAND_SUPPRESSED_CARRIER_VALUE = 17;
  /**
   * <code>MODULATION_TYPE_DUAL_SIDE_BAND_REDUCED_CARRIER = 18;</code>
   */
  public static final int MODULATION_TYPE_DUAL_SIDE_BAND_REDUCED_CARRIER_VALUE = 18;
  /**
   * <code>MODULATION_TYPE_DUAL_SIDE_BAND_WITHOUT_CARRIER = 19;</code>
   */
  public static final int MODULATION_TYPE_DUAL_SIDE_BAND_WITHOUT_CARRIER_VALUE = 19;
  /**
   * <code>MODULATION_TYPE_INDEPENDENT_SIDE_BAND = 20;</code>
   */
  public static final int MODULATION_TYPE_INDEPENDENT_SIDE_BAND_VALUE = 20;
  /**
   * <code>MODULATION_TYPE_VESTIGIAL_SIDE_BAND = 21;</code>
   */
  public static final int MODULATION_TYPE_VESTIGIAL_SIDE_BAND_VALUE = 21;
  /**
   * <code>MODULATION_TYPE_ON_OFF_KEYING = 22;</code>
   */
  public static final int MODULATION_TYPE_ON_OFF_KEYING_VALUE = 22;
  /**
   * <code>MODULATION_TYPE_MULTI_FREQUENCY_SHIFT_KEYING = 23;</code>
   */
  public static final int MODULATION_TYPE_MULTI_FREQUENCY_SHIFT_KEYING_VALUE = 23;
  /**
   * <code>MODULATION_TYPE_AUDIO_FREQUENCY_SHIFT_KEYING = 24;</code>
   */
  public static final int MODULATION_TYPE_AUDIO_FREQUENCY_SHIFT_KEYING_VALUE = 24;
  /**
   * <code>MODULATION_TYPE_CONTINUOUS_PHASE_FREQUENCY_SHIFT_KEYING = 25;</code>
   */
  public static final int MODULATION_TYPE_CONTINUOUS_PHASE_FREQUENCY_SHIFT_KEYING_VALUE = 25;
  /**
   * <code>MODULATION_TYPE_C_PHASE_SHIFT_KEYING = 26;</code>
   */
  public static final int MODULATION_TYPE_C_PHASE_SHIFT_KEYING_VALUE = 26;
  /**
   * <code>MODULATION_TYPE_DIFFERENTIALLY_ENCODED_BINARY_PHASE_SHIFT_KEYING = 27;</code>
   */
  public static final int MODULATION_TYPE_DIFFERENTIALLY_ENCODED_BINARY_PHASE_SHIFT_KEYING_VALUE = 27;
  /**
   * <code>MODULATION_TYPE_DIFFERENTIALLY_ENCODED_QUADRATURE_PHASE_SHIFT_KEYING = 28;</code>
   */
  public static final int MODULATION_TYPE_DIFFERENTIALLY_ENCODED_QUADRATURE_PHASE_SHIFT_KEYING_VALUE = 28;
  /**
   * <code>MODULATION_TYPE_OFFSET_QUADRATURE_PHASE_SHIFT_KEYING = 29;</code>
   */
  public static final int MODULATION_TYPE_OFFSET_QUADRATURE_PHASE_SHIFT_KEYING_VALUE = 29;
  /**
   * <code>MODULATION_TYPE_DIFFERENTIAL_PHASE_SHIFT_KEYING = 30;</code>
   */
  public static final int MODULATION_TYPE_DIFFERENTIAL_PHASE_SHIFT_KEYING_VALUE = 30;
  /**
   * <code>MODULATION_TYPE_PI_4_QUADRATURE_PHASE_SHIFT_KEYING = 31;</code>
   */
  public static final int MODULATION_TYPE_PI_4_QUADRATURE_PHASE_SHIFT_KEYING_VALUE = 31;
  /**
   * <code>MODULATION_TYPE_STACKED_OVERLAPPING_QUADRATURE_PHASE_SHIFT_KEYING = 32;</code>
   */
  public static final int MODULATION_TYPE_STACKED_OVERLAPPING_QUADRATURE_PHASE_SHIFT_KEYING_VALUE = 32;
  /**
   * <code>MODULATION_TYPE_F_QUADRATURE_PHASE_SHIFT_KEYING = 33;</code>
   */
  public static final int MODULATION_TYPE_F_QUADRATURE_PHASE_SHIFT_KEYING_VALUE = 33;
  /**
   * <code>MODULATION_TYPE_QUADRATURE_AMPLITUDE_ANALOG = 34;</code>
   */
  public static final int MODULATION_TYPE_QUADRATURE_AMPLITUDE_ANALOG_VALUE = 34;
  /**
   * <code>MODULATION_TYPE_QUADRATURE_AMPLITUDE_DIGITAL = 35;</code>
   */
  public static final int MODULATION_TYPE_QUADRATURE_AMPLITUDE_DIGITAL_VALUE = 35;
  /**
   * <code>MODULATION_TYPE_CONTINUOUS_PHASE = 36;</code>
   */
  public static final int MODULATION_TYPE_CONTINUOUS_PHASE_VALUE = 36;
  /**
   * <code>MODULATION_TYPE_PULSE_POSITION = 37;</code>
   */
  public static final int MODULATION_TYPE_PULSE_POSITION_VALUE = 37;
  /**
   * <code>MODULATION_TYPE_TRELLIS_CODE = 38;</code>
   */
  public static final int MODULATION_TYPE_TRELLIS_CODE_VALUE = 38;
  /**
   * <code>MODULATION_TYPE_ORTHOGONAL_FREQUENCY_DIVISION_MULTIPLEXING = 39;</code>
   */
  public static final int MODULATION_TYPE_ORTHOGONAL_FREQUENCY_DIVISION_MULTIPLEXING_VALUE = 39;
  /**
   * <code>MODULATION_TYPE_FREQUENCY_HOPPING_SPREAD_SPECTRUM = 40;</code>
   */
  public static final int MODULATION_TYPE_FREQUENCY_HOPPING_SPREAD_SPECTRUM_VALUE = 40;
  /**
   * <code>MODULATION_TYPE_DIGITAL_SEQUENCE_SPREAD_SPECTRUM = 41;</code>
   */
  public static final int MODULATION_TYPE_DIGITAL_SEQUENCE_SPREAD_SPECTRUM_VALUE = 41;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ModulationType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ModulationType forNumber(int value) {
    switch (value) {
      case 0: return MODULATION_TYPE_INVALID;
      case 1: return MODULATION_TYPE_AMPLITUDE;
      case 2: return MODULATION_TYPE_FREQUENCY;
      case 3: return MODULATION_TYPE_PHASE;
      case 4: return MODULATION_TYPE_SPACED;
      case 5: return MODULATION_TYPE_AMPLITUDE_SHIFT_KEYING;
      case 6: return MODULATION_TYPE_FREQUENCY_SHIFT_KEYING;
      case 7: return MODULATION_TYPE_PHASE_SHIFT_KEYING;
      case 8: return MODULATION_TYPE_MINIMUM_SHIFT_KEYING;
      case 9: return MODULATION_TYPE_MINIMUM_SHIFT_KEYING_GAUSSIAN;
      case 10: return MODULATION_TYPE_SINGLE_SIDE_BAND_UPPER;
      case 11: return MODULATION_TYPE_SINGLE_SIDE_BAND_LOWER;
      case 12: return MODULATION_TYPE_SINGLE_SIDE_BAND_FULL_CARRIER;
      case 13: return MODULATION_TYPE_SINGLE_SIDE_BAND_SUPPRESSED_CARRIER;
      case 14: return MODULATION_TYPE_SINGLE_SIDE_BAND_REDUCED_CARRIER;
      case 15: return MODULATION_TYPE_SINGLE_SIDE_BAND_WITHOUT_CARRIER;
      case 16: return MODULATION_TYPE_DUAL_SIDE_BAND_FULL_CARRIER;
      case 17: return MODULATION_TYPE_DUAL_SIDE_BAND_SUPPRESSED_CARRIER;
      case 18: return MODULATION_TYPE_DUAL_SIDE_BAND_REDUCED_CARRIER;
      case 19: return MODULATION_TYPE_DUAL_SIDE_BAND_WITHOUT_CARRIER;
      case 20: return MODULATION_TYPE_INDEPENDENT_SIDE_BAND;
      case 21: return MODULATION_TYPE_VESTIGIAL_SIDE_BAND;
      case 22: return MODULATION_TYPE_ON_OFF_KEYING;
      case 23: return MODULATION_TYPE_MULTI_FREQUENCY_SHIFT_KEYING;
      case 24: return MODULATION_TYPE_AUDIO_FREQUENCY_SHIFT_KEYING;
      case 25: return MODULATION_TYPE_CONTINUOUS_PHASE_FREQUENCY_SHIFT_KEYING;
      case 26: return MODULATION_TYPE_C_PHASE_SHIFT_KEYING;
      case 27: return MODULATION_TYPE_DIFFERENTIALLY_ENCODED_BINARY_PHASE_SHIFT_KEYING;
      case 28: return MODULATION_TYPE_DIFFERENTIALLY_ENCODED_QUADRATURE_PHASE_SHIFT_KEYING;
      case 29: return MODULATION_TYPE_OFFSET_QUADRATURE_PHASE_SHIFT_KEYING;
      case 30: return MODULATION_TYPE_DIFFERENTIAL_PHASE_SHIFT_KEYING;
      case 31: return MODULATION_TYPE_PI_4_QUADRATURE_PHASE_SHIFT_KEYING;
      case 32: return MODULATION_TYPE_STACKED_OVERLAPPING_QUADRATURE_PHASE_SHIFT_KEYING;
      case 33: return MODULATION_TYPE_F_QUADRATURE_PHASE_SHIFT_KEYING;
      case 34: return MODULATION_TYPE_QUADRATURE_AMPLITUDE_ANALOG;
      case 35: return MODULATION_TYPE_QUADRATURE_AMPLITUDE_DIGITAL;
      case 36: return MODULATION_TYPE_CONTINUOUS_PHASE;
      case 37: return MODULATION_TYPE_PULSE_POSITION;
      case 38: return MODULATION_TYPE_TRELLIS_CODE;
      case 39: return MODULATION_TYPE_ORTHOGONAL_FREQUENCY_DIVISION_MULTIPLEXING;
      case 40: return MODULATION_TYPE_FREQUENCY_HOPPING_SPREAD_SPECTRUM;
      case 41: return MODULATION_TYPE_DIGITAL_SEQUENCE_SPREAD_SPECTRUM;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ModulationType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ModulationType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ModulationType>() {
          public ModulationType findValueByNumber(int number) {
            return ModulationType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.SignalPubProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ModulationType[] VALUES = values();

  public static ModulationType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ModulationType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:anduril.entitymanager.v1.ModulationType)
}

