// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/types.pub.proto

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * The state of an override.
 * </pre>
 *
 * Protobuf enum {@code anduril.entitymanager.v1.OverrideStatus}
 */
public enum OverrideStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>OVERRIDE_STATUS_INVALID = 0;</code>
   */
  OVERRIDE_STATUS_INVALID(0),
  /**
   * <pre>
   * the override was applied to the entity.
   * </pre>
   *
   * <code>OVERRIDE_STATUS_APPLIED = 1;</code>
   */
  OVERRIDE_STATUS_APPLIED(1),
  /**
   * <pre>
   * the override is pending action.
   * </pre>
   *
   * <code>OVERRIDE_STATUS_PENDING = 2;</code>
   */
  OVERRIDE_STATUS_PENDING(2),
  /**
   * <pre>
   * the override has been timed out.
   * </pre>
   *
   * <code>OVERRIDE_STATUS_TIMEOUT = 3;</code>
   */
  OVERRIDE_STATUS_TIMEOUT(3),
  /**
   * <pre>
   * the override has been rejected
   * </pre>
   *
   * <code>OVERRIDE_STATUS_REJECTED = 4;</code>
   */
  OVERRIDE_STATUS_REJECTED(4),
  /**
   * <pre>
   * The override is pending deletion.
   * </pre>
   *
   * <code>OVERRIDE_STATUS_DELETION_PENDING = 5;</code>
   */
  OVERRIDE_STATUS_DELETION_PENDING(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>OVERRIDE_STATUS_INVALID = 0;</code>
   */
  public static final int OVERRIDE_STATUS_INVALID_VALUE = 0;
  /**
   * <pre>
   * the override was applied to the entity.
   * </pre>
   *
   * <code>OVERRIDE_STATUS_APPLIED = 1;</code>
   */
  public static final int OVERRIDE_STATUS_APPLIED_VALUE = 1;
  /**
   * <pre>
   * the override is pending action.
   * </pre>
   *
   * <code>OVERRIDE_STATUS_PENDING = 2;</code>
   */
  public static final int OVERRIDE_STATUS_PENDING_VALUE = 2;
  /**
   * <pre>
   * the override has been timed out.
   * </pre>
   *
   * <code>OVERRIDE_STATUS_TIMEOUT = 3;</code>
   */
  public static final int OVERRIDE_STATUS_TIMEOUT_VALUE = 3;
  /**
   * <pre>
   * the override has been rejected
   * </pre>
   *
   * <code>OVERRIDE_STATUS_REJECTED = 4;</code>
   */
  public static final int OVERRIDE_STATUS_REJECTED_VALUE = 4;
  /**
   * <pre>
   * The override is pending deletion.
   * </pre>
   *
   * <code>OVERRIDE_STATUS_DELETION_PENDING = 5;</code>
   */
  public static final int OVERRIDE_STATUS_DELETION_PENDING_VALUE = 5;


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
  public static OverrideStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OverrideStatus forNumber(int value) {
    switch (value) {
      case 0: return OVERRIDE_STATUS_INVALID;
      case 1: return OVERRIDE_STATUS_APPLIED;
      case 2: return OVERRIDE_STATUS_PENDING;
      case 3: return OVERRIDE_STATUS_TIMEOUT;
      case 4: return OVERRIDE_STATUS_REJECTED;
      case 5: return OVERRIDE_STATUS_DELETION_PENDING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OverrideStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OverrideStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OverrideStatus>() {
          public OverrideStatus findValueByNumber(int number) {
            return OverrideStatus.forNumber(number);
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
    return com.anduril.entitymanager.v1.TypesPubProto.getDescriptor().getEnumTypes().get(3);
  }

  private static final OverrideStatus[] VALUES = values();

  public static OverrideStatus valueOf(
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

  private OverrideStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:anduril.entitymanager.v1.OverrideStatus)
}

