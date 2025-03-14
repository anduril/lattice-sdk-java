// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/common.pub.proto

package com.anduril.tasks.v2;

/**
 * Protobuf enum {@code anduril.tasks.v2.ControlAreaType}
 */
public enum ControlAreaType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CONTROL_AREA_TYPE_INVALID = 0;</code>
   */
  CONTROL_AREA_TYPE_INVALID(0),
  /**
   * <code>CONTROL_AREA_TYPE_KEEP_IN_ZONE = 1;</code>
   */
  CONTROL_AREA_TYPE_KEEP_IN_ZONE(1),
  /**
   * <code>CONTROL_AREA_TYPE_KEEP_OUT_ZONE = 2;</code>
   */
  CONTROL_AREA_TYPE_KEEP_OUT_ZONE(2),
  /**
   * <pre>
   * Zone for an autonomous asset to nose-dive into
   * when its assignment has been concluded
   * </pre>
   *
   * <code>CONTROL_AREA_TYPE_DITCH_ZONE = 3;</code>
   */
  CONTROL_AREA_TYPE_DITCH_ZONE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CONTROL_AREA_TYPE_INVALID = 0;</code>
   */
  public static final int CONTROL_AREA_TYPE_INVALID_VALUE = 0;
  /**
   * <code>CONTROL_AREA_TYPE_KEEP_IN_ZONE = 1;</code>
   */
  public static final int CONTROL_AREA_TYPE_KEEP_IN_ZONE_VALUE = 1;
  /**
   * <code>CONTROL_AREA_TYPE_KEEP_OUT_ZONE = 2;</code>
   */
  public static final int CONTROL_AREA_TYPE_KEEP_OUT_ZONE_VALUE = 2;
  /**
   * <pre>
   * Zone for an autonomous asset to nose-dive into
   * when its assignment has been concluded
   * </pre>
   *
   * <code>CONTROL_AREA_TYPE_DITCH_ZONE = 3;</code>
   */
  public static final int CONTROL_AREA_TYPE_DITCH_ZONE_VALUE = 3;


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
  public static ControlAreaType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ControlAreaType forNumber(int value) {
    switch (value) {
      case 0: return CONTROL_AREA_TYPE_INVALID;
      case 1: return CONTROL_AREA_TYPE_KEEP_IN_ZONE;
      case 2: return CONTROL_AREA_TYPE_KEEP_OUT_ZONE;
      case 3: return CONTROL_AREA_TYPE_DITCH_ZONE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ControlAreaType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ControlAreaType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ControlAreaType>() {
          public ControlAreaType findValueByNumber(int number) {
            return ControlAreaType.forNumber(number);
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
    return com.anduril.tasks.v2.CommonPubProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ControlAreaType[] VALUES = values();

  public static ControlAreaType valueOf(
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

  private ControlAreaType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:anduril.tasks.v2.ControlAreaType)
}

