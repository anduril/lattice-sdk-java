// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/ad/desertguardian/rf/v1/rf_tasks.pub.proto

package com.anduril.tasks.ad.desertguardian.rf.v1;

/**
 * Protobuf enum {@code anduril.tasks.ad.desertguardian.rf.v1.EmissionControlState}
 */
public enum EmissionControlState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>EMISSION_CONTROL_STATE_INVALID = 0;</code>
   */
  EMISSION_CONTROL_STATE_INVALID(0),
  /**
   * <code>EMISSION_CONTROL_STATE_ALLOWED = 1;</code>
   */
  EMISSION_CONTROL_STATE_ALLOWED(1),
  /**
   * <code>EMISSION_CONTROL_STATE_NOT_ALLOWED = 2;</code>
   */
  EMISSION_CONTROL_STATE_NOT_ALLOWED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>EMISSION_CONTROL_STATE_INVALID = 0;</code>
   */
  public static final int EMISSION_CONTROL_STATE_INVALID_VALUE = 0;
  /**
   * <code>EMISSION_CONTROL_STATE_ALLOWED = 1;</code>
   */
  public static final int EMISSION_CONTROL_STATE_ALLOWED_VALUE = 1;
  /**
   * <code>EMISSION_CONTROL_STATE_NOT_ALLOWED = 2;</code>
   */
  public static final int EMISSION_CONTROL_STATE_NOT_ALLOWED_VALUE = 2;


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
  public static EmissionControlState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EmissionControlState forNumber(int value) {
    switch (value) {
      case 0: return EMISSION_CONTROL_STATE_INVALID;
      case 1: return EMISSION_CONTROL_STATE_ALLOWED;
      case 2: return EMISSION_CONTROL_STATE_NOT_ALLOWED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EmissionControlState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EmissionControlState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EmissionControlState>() {
          public EmissionControlState findValueByNumber(int number) {
            return EmissionControlState.forNumber(number);
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
    return com.anduril.tasks.ad.desertguardian.rf.v1.RfTasksPubProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final EmissionControlState[] VALUES = values();

  public static EmissionControlState valueOf(
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

  private EmissionControlState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:anduril.tasks.ad.desertguardian.rf.v1.EmissionControlState)
}
