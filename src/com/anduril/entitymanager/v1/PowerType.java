// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/entitymanager/v1/power.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.entitymanager.v1;

/**
 * Protobuf enum {@code anduril.entitymanager.v1.PowerType}
 */
public enum PowerType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>POWER_TYPE_INVALID = 0;</code>
   */
  POWER_TYPE_INVALID(0),
  /**
   * <code>POWER_TYPE_UNKNOWN = 1;</code>
   */
  POWER_TYPE_UNKNOWN(1),
  /**
   * <code>POWER_TYPE_GAS = 2;</code>
   */
  POWER_TYPE_GAS(2),
  /**
   * <code>POWER_TYPE_BATTERY = 3;</code>
   */
  POWER_TYPE_BATTERY(3),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      PowerType.class.getName());
  }
  /**
   * <code>POWER_TYPE_INVALID = 0;</code>
   */
  public static final int POWER_TYPE_INVALID_VALUE = 0;
  /**
   * <code>POWER_TYPE_UNKNOWN = 1;</code>
   */
  public static final int POWER_TYPE_UNKNOWN_VALUE = 1;
  /**
   * <code>POWER_TYPE_GAS = 2;</code>
   */
  public static final int POWER_TYPE_GAS_VALUE = 2;
  /**
   * <code>POWER_TYPE_BATTERY = 3;</code>
   */
  public static final int POWER_TYPE_BATTERY_VALUE = 3;


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
  public static PowerType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PowerType forNumber(int value) {
    switch (value) {
      case 0: return POWER_TYPE_INVALID;
      case 1: return POWER_TYPE_UNKNOWN;
      case 2: return POWER_TYPE_GAS;
      case 3: return POWER_TYPE_BATTERY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PowerType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PowerType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PowerType>() {
          public PowerType findValueByNumber(int number) {
            return PowerType.forNumber(number);
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
    return com.anduril.entitymanager.v1.PowerPubProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final PowerType[] VALUES = values();

  public static PowerType valueOf(
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

  private PowerType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:anduril.entitymanager.v1.PowerType)
}

