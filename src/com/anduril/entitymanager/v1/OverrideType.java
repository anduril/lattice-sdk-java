// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/types.pub.proto

package com.anduril.entitymanager.v1;

/**
 * Protobuf enum {@code anduril.entitymanager.v1.OverrideType}
 */
public enum OverrideType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * The override type value was not set. This value is interpreted as OVERRIDE_TYPE_LIVE for backward compatibility.
   * </pre>
   *
   * <code>OVERRIDE_TYPE_INVALID = 0;</code>
   */
  OVERRIDE_TYPE_INVALID(0),
  /**
   * <pre>
   * Override was requested when the entity was live according to the Entity Manager instance that handled the request.
   * </pre>
   *
   * <code>OVERRIDE_TYPE_LIVE = 1;</code>
   */
  OVERRIDE_TYPE_LIVE(1),
  /**
   * <pre>
   * Override was requested after the entity expired according to the Entity Manager instance that handled the request.
   * </pre>
   *
   * <code>OVERRIDE_TYPE_POST_EXPIRY = 2;</code>
   */
  OVERRIDE_TYPE_POST_EXPIRY(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The override type value was not set. This value is interpreted as OVERRIDE_TYPE_LIVE for backward compatibility.
   * </pre>
   *
   * <code>OVERRIDE_TYPE_INVALID = 0;</code>
   */
  public static final int OVERRIDE_TYPE_INVALID_VALUE = 0;
  /**
   * <pre>
   * Override was requested when the entity was live according to the Entity Manager instance that handled the request.
   * </pre>
   *
   * <code>OVERRIDE_TYPE_LIVE = 1;</code>
   */
  public static final int OVERRIDE_TYPE_LIVE_VALUE = 1;
  /**
   * <pre>
   * Override was requested after the entity expired according to the Entity Manager instance that handled the request.
   * </pre>
   *
   * <code>OVERRIDE_TYPE_POST_EXPIRY = 2;</code>
   */
  public static final int OVERRIDE_TYPE_POST_EXPIRY_VALUE = 2;


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
  public static OverrideType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OverrideType forNumber(int value) {
    switch (value) {
      case 0: return OVERRIDE_TYPE_INVALID;
      case 1: return OVERRIDE_TYPE_LIVE;
      case 2: return OVERRIDE_TYPE_POST_EXPIRY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OverrideType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OverrideType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OverrideType>() {
          public OverrideType findValueByNumber(int number) {
            return OverrideType.forNumber(number);
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
    return com.anduril.entitymanager.v1.TypesPubProto.getDescriptor().getEnumTypes().get(4);
  }

  private static final OverrideType[] VALUES = values();

  public static OverrideType valueOf(
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

  private OverrideType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:anduril.entitymanager.v1.OverrideType)
}

