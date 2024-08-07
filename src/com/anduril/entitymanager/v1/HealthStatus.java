// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/health_status.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.entitymanager.v1;

/**
 * <pre>
 * Enumeration of possible health states.
 * </pre>
 *
 * Protobuf enum {@code anduril.entitymanager.v1.HealthStatus}
 */
public enum HealthStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>HEALTH_STATUS_INVALID = 0;</code>
   */
  HEALTH_STATUS_INVALID(0),
  /**
   * <pre>
   * Indicates that the component is operating as intended.
   * </pre>
   *
   * <code>HEALTH_STATUS_HEALTHY = 1;</code>
   */
  HEALTH_STATUS_HEALTHY(1),
  /**
   * <pre>
   * Indicates that the component is at risk of transitioning into a HEALTH_STATUS_FAIL
   * state or that the component is operating in a degraded state.
   * </pre>
   *
   * <code>HEALTH_STATUS_WARN = 2;</code>
   */
  HEALTH_STATUS_WARN(2),
  /**
   * <pre>
   * Indicates that the component is not functioning as intended.
   * </pre>
   *
   * <code>HEALTH_STATUS_FAIL = 3;</code>
   */
  HEALTH_STATUS_FAIL(3),
  /**
   * <pre>
   * Indicates that the component is offline.
   * </pre>
   *
   * <code>HEALTH_STATUS_OFFLINE = 4;</code>
   */
  HEALTH_STATUS_OFFLINE(4),
  /**
   * <pre>
   * Indicates that the component is not yet functioning, but it is transitioning into a
   * HEALTH_STATUS_HEALTHY state. A component should only report this state temporarily.
   * </pre>
   *
   * <code>HEALTH_STATUS_NOT_READY = 5;</code>
   */
  HEALTH_STATUS_NOT_READY(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>HEALTH_STATUS_INVALID = 0;</code>
   */
  public static final int HEALTH_STATUS_INVALID_VALUE = 0;
  /**
   * <pre>
   * Indicates that the component is operating as intended.
   * </pre>
   *
   * <code>HEALTH_STATUS_HEALTHY = 1;</code>
   */
  public static final int HEALTH_STATUS_HEALTHY_VALUE = 1;
  /**
   * <pre>
   * Indicates that the component is at risk of transitioning into a HEALTH_STATUS_FAIL
   * state or that the component is operating in a degraded state.
   * </pre>
   *
   * <code>HEALTH_STATUS_WARN = 2;</code>
   */
  public static final int HEALTH_STATUS_WARN_VALUE = 2;
  /**
   * <pre>
   * Indicates that the component is not functioning as intended.
   * </pre>
   *
   * <code>HEALTH_STATUS_FAIL = 3;</code>
   */
  public static final int HEALTH_STATUS_FAIL_VALUE = 3;
  /**
   * <pre>
   * Indicates that the component is offline.
   * </pre>
   *
   * <code>HEALTH_STATUS_OFFLINE = 4;</code>
   */
  public static final int HEALTH_STATUS_OFFLINE_VALUE = 4;
  /**
   * <pre>
   * Indicates that the component is not yet functioning, but it is transitioning into a
   * HEALTH_STATUS_HEALTHY state. A component should only report this state temporarily.
   * </pre>
   *
   * <code>HEALTH_STATUS_NOT_READY = 5;</code>
   */
  public static final int HEALTH_STATUS_NOT_READY_VALUE = 5;


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
  public static HealthStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static HealthStatus forNumber(int value) {
    switch (value) {
      case 0: return HEALTH_STATUS_INVALID;
      case 1: return HEALTH_STATUS_HEALTHY;
      case 2: return HEALTH_STATUS_WARN;
      case 3: return HEALTH_STATUS_FAIL;
      case 4: return HEALTH_STATUS_OFFLINE;
      case 5: return HEALTH_STATUS_NOT_READY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HealthStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      HealthStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<HealthStatus>() {
          public HealthStatus findValueByNumber(int number) {
            return HealthStatus.forNumber(number);
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
    return com.anduril.entitymanager.v1.HealthStatusPubProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final HealthStatus[] VALUES = values();

  public static HealthStatus valueOf(
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

  private HealthStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:anduril.entitymanager.v1.HealthStatus)
}

