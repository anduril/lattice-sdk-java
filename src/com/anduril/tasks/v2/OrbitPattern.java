// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/shared/isr.pub.proto

package com.anduril.tasks.v2;

/**
 * Protobuf enum {@code anduril.tasks.v2.OrbitPattern}
 */
public enum OrbitPattern
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ORBIT_PATTERN_INVALID = 0;</code>
   */
  ORBIT_PATTERN_INVALID(0),
  /**
   * <code>ORBIT_PATTERN_CIRCLE = 1;</code>
   */
  ORBIT_PATTERN_CIRCLE(1),
  /**
   * <code>ORBIT_PATTERN_RACETRACK = 2;</code>
   */
  ORBIT_PATTERN_RACETRACK(2),
  /**
   * <code>ORBIT_PATTERN_FIGURE_EIGHT = 3;</code>
   */
  ORBIT_PATTERN_FIGURE_EIGHT(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ORBIT_PATTERN_INVALID = 0;</code>
   */
  public static final int ORBIT_PATTERN_INVALID_VALUE = 0;
  /**
   * <code>ORBIT_PATTERN_CIRCLE = 1;</code>
   */
  public static final int ORBIT_PATTERN_CIRCLE_VALUE = 1;
  /**
   * <code>ORBIT_PATTERN_RACETRACK = 2;</code>
   */
  public static final int ORBIT_PATTERN_RACETRACK_VALUE = 2;
  /**
   * <code>ORBIT_PATTERN_FIGURE_EIGHT = 3;</code>
   */
  public static final int ORBIT_PATTERN_FIGURE_EIGHT_VALUE = 3;


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
  public static OrbitPattern valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OrbitPattern forNumber(int value) {
    switch (value) {
      case 0: return ORBIT_PATTERN_INVALID;
      case 1: return ORBIT_PATTERN_CIRCLE;
      case 2: return ORBIT_PATTERN_RACETRACK;
      case 3: return ORBIT_PATTERN_FIGURE_EIGHT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OrbitPattern>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OrbitPattern> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OrbitPattern>() {
          public OrbitPattern findValueByNumber(int number) {
            return OrbitPattern.forNumber(number);
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
    return com.anduril.tasks.v2.IsrPubProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final OrbitPattern[] VALUES = values();

  public static OrbitPattern valueOf(
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

  private OrbitPattern(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:anduril.tasks.v2.OrbitPattern)
}
