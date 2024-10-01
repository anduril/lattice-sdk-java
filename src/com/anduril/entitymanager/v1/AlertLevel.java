// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/health_status.pub.proto

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * Alerts are categorized into one of three levels - Warnings, Cautions, and Advisories (WCAs).
 * </pre>
 *
 * Protobuf enum {@code anduril.entitymanager.v1.AlertLevel}
 */
public enum AlertLevel
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ALERT_LEVEL_INVALID = 0;</code>
   */
  ALERT_LEVEL_INVALID(0),
  /**
   * <pre>
   * For conditions that require awareness and may require subsequent response.
   * </pre>
   *
   * <code>ALERT_LEVEL_ADVISORY = 1;</code>
   */
  ALERT_LEVEL_ADVISORY(1),
  /**
   * <pre>
   * For conditions that require immediate awareness and subsequent response.
   * </pre>
   *
   * <code>ALERT_LEVEL_CAUTION = 2;</code>
   */
  ALERT_LEVEL_CAUTION(2),
  /**
   * <pre>
   * For conditions that require immediate awareness and response.
   * </pre>
   *
   * <code>ALERT_LEVEL_WARNING = 3;</code>
   */
  ALERT_LEVEL_WARNING(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ALERT_LEVEL_INVALID = 0;</code>
   */
  public static final int ALERT_LEVEL_INVALID_VALUE = 0;
  /**
   * <pre>
   * For conditions that require awareness and may require subsequent response.
   * </pre>
   *
   * <code>ALERT_LEVEL_ADVISORY = 1;</code>
   */
  public static final int ALERT_LEVEL_ADVISORY_VALUE = 1;
  /**
   * <pre>
   * For conditions that require immediate awareness and subsequent response.
   * </pre>
   *
   * <code>ALERT_LEVEL_CAUTION = 2;</code>
   */
  public static final int ALERT_LEVEL_CAUTION_VALUE = 2;
  /**
   * <pre>
   * For conditions that require immediate awareness and response.
   * </pre>
   *
   * <code>ALERT_LEVEL_WARNING = 3;</code>
   */
  public static final int ALERT_LEVEL_WARNING_VALUE = 3;


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
  public static AlertLevel valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AlertLevel forNumber(int value) {
    switch (value) {
      case 0: return ALERT_LEVEL_INVALID;
      case 1: return ALERT_LEVEL_ADVISORY;
      case 2: return ALERT_LEVEL_CAUTION;
      case 3: return ALERT_LEVEL_WARNING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AlertLevel>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AlertLevel> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AlertLevel>() {
          public AlertLevel findValueByNumber(int number) {
            return AlertLevel.forNumber(number);
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
    return com.anduril.entitymanager.v1.HealthStatusPubProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final AlertLevel[] VALUES = values();

  public static AlertLevel valueOf(
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

  private AlertLevel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:anduril.entitymanager.v1.AlertLevel)
}

