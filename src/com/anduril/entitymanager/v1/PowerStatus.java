// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/power.pub.proto

package com.anduril.entitymanager.v1;

/**
 * Protobuf enum {@code anduril.entitymanager.v1.PowerStatus}
 */
public enum PowerStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>POWER_STATUS_INVALID = 0;</code>
   */
  POWER_STATUS_INVALID(0),
  /**
   * <pre>
   * Indeterminate condition of whether the power system is present or absent.
   * </pre>
   *
   * <code>POWER_STATUS_UNKNOWN = 1;</code>
   */
  POWER_STATUS_UNKNOWN(1),
  /**
   * <pre>
   * Power system is not configured/present. This is considered a normal/expected condition, as opposed to the
   * system is expected to be present but is missing.
   * </pre>
   *
   * <code>POWER_STATUS_NOT_PRESENT = 2;</code>
   */
  POWER_STATUS_NOT_PRESENT(2),
  /**
   * <pre>
   * Power system is present and operating normally.
   * </pre>
   *
   * <code>POWER_STATUS_OPERATING = 3;</code>
   */
  POWER_STATUS_OPERATING(3),
  /**
   * <pre>
   * Power system is present and is in an expected disabled state. For example, if the generator was shut off for
   * operational reasons.
   * </pre>
   *
   * <code>POWER_STATUS_DISABLED = 4;</code>
   */
  POWER_STATUS_DISABLED(4),
  /**
   * <pre>
   * Power system is non-functional.
   * </pre>
   *
   * <code>POWER_STATUS_ERROR = 5;</code>
   */
  POWER_STATUS_ERROR(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>POWER_STATUS_INVALID = 0;</code>
   */
  public static final int POWER_STATUS_INVALID_VALUE = 0;
  /**
   * <pre>
   * Indeterminate condition of whether the power system is present or absent.
   * </pre>
   *
   * <code>POWER_STATUS_UNKNOWN = 1;</code>
   */
  public static final int POWER_STATUS_UNKNOWN_VALUE = 1;
  /**
   * <pre>
   * Power system is not configured/present. This is considered a normal/expected condition, as opposed to the
   * system is expected to be present but is missing.
   * </pre>
   *
   * <code>POWER_STATUS_NOT_PRESENT = 2;</code>
   */
  public static final int POWER_STATUS_NOT_PRESENT_VALUE = 2;
  /**
   * <pre>
   * Power system is present and operating normally.
   * </pre>
   *
   * <code>POWER_STATUS_OPERATING = 3;</code>
   */
  public static final int POWER_STATUS_OPERATING_VALUE = 3;
  /**
   * <pre>
   * Power system is present and is in an expected disabled state. For example, if the generator was shut off for
   * operational reasons.
   * </pre>
   *
   * <code>POWER_STATUS_DISABLED = 4;</code>
   */
  public static final int POWER_STATUS_DISABLED_VALUE = 4;
  /**
   * <pre>
   * Power system is non-functional.
   * </pre>
   *
   * <code>POWER_STATUS_ERROR = 5;</code>
   */
  public static final int POWER_STATUS_ERROR_VALUE = 5;


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
  public static PowerStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PowerStatus forNumber(int value) {
    switch (value) {
      case 0: return POWER_STATUS_INVALID;
      case 1: return POWER_STATUS_UNKNOWN;
      case 2: return POWER_STATUS_NOT_PRESENT;
      case 3: return POWER_STATUS_OPERATING;
      case 4: return POWER_STATUS_DISABLED;
      case 5: return POWER_STATUS_ERROR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PowerStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PowerStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PowerStatus>() {
          public PowerStatus findValueByNumber(int number) {
            return PowerStatus.forNumber(number);
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
    return com.anduril.entitymanager.v1.PowerPubProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final PowerStatus[] VALUES = values();

  public static PowerStatus valueOf(
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

  private PowerStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:anduril.entitymanager.v1.PowerStatus)
}
