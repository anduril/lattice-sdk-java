// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/shared/isr.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.tasks.v2;

/**
 * <pre>
 * Direction of the loiter relative to the front of the vehicle.
 * </pre>
 *
 * Protobuf enum {@code anduril.tasks.v2.OrbitDirection}
 */
public enum OrbitDirection
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ORBIT_DIRECTION_DIRECTION_INVALID = 0;</code>
   */
  ORBIT_DIRECTION_DIRECTION_INVALID(0),
  /**
   * <code>ORBIT_DIRECTION_RIGHT = 1;</code>
   */
  ORBIT_DIRECTION_RIGHT(1),
  /**
   * <code>ORBIT_DIRECTION_LEFT = 2;</code>
   */
  ORBIT_DIRECTION_LEFT(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ORBIT_DIRECTION_DIRECTION_INVALID = 0;</code>
   */
  public static final int ORBIT_DIRECTION_DIRECTION_INVALID_VALUE = 0;
  /**
   * <code>ORBIT_DIRECTION_RIGHT = 1;</code>
   */
  public static final int ORBIT_DIRECTION_RIGHT_VALUE = 1;
  /**
   * <code>ORBIT_DIRECTION_LEFT = 2;</code>
   */
  public static final int ORBIT_DIRECTION_LEFT_VALUE = 2;


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
  public static OrbitDirection valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OrbitDirection forNumber(int value) {
    switch (value) {
      case 0: return ORBIT_DIRECTION_DIRECTION_INVALID;
      case 1: return ORBIT_DIRECTION_RIGHT;
      case 2: return ORBIT_DIRECTION_LEFT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OrbitDirection>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OrbitDirection> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OrbitDirection>() {
          public OrbitDirection findValueByNumber(int number) {
            return OrbitDirection.forNumber(number);
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
    return com.anduril.tasks.v2.IsrPubProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final OrbitDirection[] VALUES = values();

  public static OrbitDirection valueOf(
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

  private OrbitDirection(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:anduril.tasks.v2.OrbitDirection)
}

