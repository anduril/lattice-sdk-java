// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/ad/desertguardian/rf/v1/rf_tasks.pub.proto

package com.anduril.tasks.ad.desertguardian.rf.v1;

/**
 * Protobuf enum {@code anduril.tasks.ad.desertguardian.rf.v1.SurveillanceState}
 */
public enum SurveillanceState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SURVEILLANCE_STATE_INVALID = 0;</code>
   */
  SURVEILLANCE_STATE_INVALID(0),
  /**
   * <code>SURVEILLANCE_STATE_SURVEILLING = 1;</code>
   */
  SURVEILLANCE_STATE_SURVEILLING(1),
  /**
   * <code>SURVEILLANCE_STATE_NOT_SURVEILLING = 2;</code>
   */
  SURVEILLANCE_STATE_NOT_SURVEILLING(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SURVEILLANCE_STATE_INVALID = 0;</code>
   */
  public static final int SURVEILLANCE_STATE_INVALID_VALUE = 0;
  /**
   * <code>SURVEILLANCE_STATE_SURVEILLING = 1;</code>
   */
  public static final int SURVEILLANCE_STATE_SURVEILLING_VALUE = 1;
  /**
   * <code>SURVEILLANCE_STATE_NOT_SURVEILLING = 2;</code>
   */
  public static final int SURVEILLANCE_STATE_NOT_SURVEILLING_VALUE = 2;


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
  public static SurveillanceState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SurveillanceState forNumber(int value) {
    switch (value) {
      case 0: return SURVEILLANCE_STATE_INVALID;
      case 1: return SURVEILLANCE_STATE_SURVEILLING;
      case 2: return SURVEILLANCE_STATE_NOT_SURVEILLING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SurveillanceState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SurveillanceState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SurveillanceState>() {
          public SurveillanceState findValueByNumber(int number) {
            return SurveillanceState.forNumber(number);
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
    return com.anduril.tasks.ad.desertguardian.rf.v1.RfTasksPubProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final SurveillanceState[] VALUES = values();

  public static SurveillanceState valueOf(
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

  private SurveillanceState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:anduril.tasks.ad.desertguardian.rf.v1.SurveillanceState)
}

