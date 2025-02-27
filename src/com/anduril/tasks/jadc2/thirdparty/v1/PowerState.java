// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/jadc2/thirdparty/v1/power.pub.proto

package com.anduril.tasks.jadc2.thirdparty.v1;

/**
 * Protobuf enum {@code anduril.tasks.jadc2.thirdparty.v1.PowerState}
 */
public enum PowerState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>POWER_STATE_INVALID = 0;</code>
   */
  POWER_STATE_INVALID(0),
  /**
   * <code>POWER_STATE_ON = 1;</code>
   */
  POWER_STATE_ON(1),
  /**
   * <code>POWER_STATE_OFF = 2;</code>
   */
  POWER_STATE_OFF(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>POWER_STATE_INVALID = 0;</code>
   */
  public static final int POWER_STATE_INVALID_VALUE = 0;
  /**
   * <code>POWER_STATE_ON = 1;</code>
   */
  public static final int POWER_STATE_ON_VALUE = 1;
  /**
   * <code>POWER_STATE_OFF = 2;</code>
   */
  public static final int POWER_STATE_OFF_VALUE = 2;


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
  public static PowerState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PowerState forNumber(int value) {
    switch (value) {
      case 0: return POWER_STATE_INVALID;
      case 1: return POWER_STATE_ON;
      case 2: return POWER_STATE_OFF;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PowerState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PowerState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PowerState>() {
          public PowerState findValueByNumber(int number) {
            return PowerState.forNumber(number);
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
    return com.anduril.tasks.jadc2.thirdparty.v1.PowerPubProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final PowerState[] VALUES = values();

  public static PowerState valueOf(
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

  private PowerState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:anduril.tasks.jadc2.thirdparty.v1.PowerState)
}

