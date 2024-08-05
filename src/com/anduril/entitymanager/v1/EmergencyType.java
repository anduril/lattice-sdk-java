// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/entitymanager/v1/geoentity.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * Type of an emergency.
 * </pre>
 *
 * Protobuf enum {@code anduril.entitymanager.v1.EmergencyType}
 */
public enum EmergencyType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>EMERGENCY_TYPE_INVALID = 0;</code>
   */
  EMERGENCY_TYPE_INVALID(0),
  /**
   * <code>EMERGENCY_TYPE_DOWN_AIRCRAFT = 1;</code>
   */
  EMERGENCY_TYPE_DOWN_AIRCRAFT(1),
  /**
   * <code>EMERGENCY_TYPE_MAN_IN_WATER = 2;</code>
   */
  EMERGENCY_TYPE_MAN_IN_WATER(2),
  /**
   * <code>EMERGENCY_TYPE_DITCHING = 3;</code>
   */
  EMERGENCY_TYPE_DITCHING(3),
  /**
   * <code>EMERGENCY_TYPE_BAILOUT = 4;</code>
   */
  EMERGENCY_TYPE_BAILOUT(4),
  /**
   * <code>EMERGENCY_TYPE_DISTRESSED_VEHICLE = 5;</code>
   */
  EMERGENCY_TYPE_DISTRESSED_VEHICLE(5),
  /**
   * <code>EMERGENCY_TYPE_GROUND_INCIDENT = 6;</code>
   */
  EMERGENCY_TYPE_GROUND_INCIDENT(6),
  /**
   * <code>EMERGENCY_TYPE_MEDICAL = 7;</code>
   */
  EMERGENCY_TYPE_MEDICAL(7),
  /**
   * <code>EMERGENCY_TYPE_ISOLATED_PERSON = 8;</code>
   */
  EMERGENCY_TYPE_ISOLATED_PERSON(8),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      EmergencyType.class.getName());
  }
  /**
   * <code>EMERGENCY_TYPE_INVALID = 0;</code>
   */
  public static final int EMERGENCY_TYPE_INVALID_VALUE = 0;
  /**
   * <code>EMERGENCY_TYPE_DOWN_AIRCRAFT = 1;</code>
   */
  public static final int EMERGENCY_TYPE_DOWN_AIRCRAFT_VALUE = 1;
  /**
   * <code>EMERGENCY_TYPE_MAN_IN_WATER = 2;</code>
   */
  public static final int EMERGENCY_TYPE_MAN_IN_WATER_VALUE = 2;
  /**
   * <code>EMERGENCY_TYPE_DITCHING = 3;</code>
   */
  public static final int EMERGENCY_TYPE_DITCHING_VALUE = 3;
  /**
   * <code>EMERGENCY_TYPE_BAILOUT = 4;</code>
   */
  public static final int EMERGENCY_TYPE_BAILOUT_VALUE = 4;
  /**
   * <code>EMERGENCY_TYPE_DISTRESSED_VEHICLE = 5;</code>
   */
  public static final int EMERGENCY_TYPE_DISTRESSED_VEHICLE_VALUE = 5;
  /**
   * <code>EMERGENCY_TYPE_GROUND_INCIDENT = 6;</code>
   */
  public static final int EMERGENCY_TYPE_GROUND_INCIDENT_VALUE = 6;
  /**
   * <code>EMERGENCY_TYPE_MEDICAL = 7;</code>
   */
  public static final int EMERGENCY_TYPE_MEDICAL_VALUE = 7;
  /**
   * <code>EMERGENCY_TYPE_ISOLATED_PERSON = 8;</code>
   */
  public static final int EMERGENCY_TYPE_ISOLATED_PERSON_VALUE = 8;


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
  public static EmergencyType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EmergencyType forNumber(int value) {
    switch (value) {
      case 0: return EMERGENCY_TYPE_INVALID;
      case 1: return EMERGENCY_TYPE_DOWN_AIRCRAFT;
      case 2: return EMERGENCY_TYPE_MAN_IN_WATER;
      case 3: return EMERGENCY_TYPE_DITCHING;
      case 4: return EMERGENCY_TYPE_BAILOUT;
      case 5: return EMERGENCY_TYPE_DISTRESSED_VEHICLE;
      case 6: return EMERGENCY_TYPE_GROUND_INCIDENT;
      case 7: return EMERGENCY_TYPE_MEDICAL;
      case 8: return EMERGENCY_TYPE_ISOLATED_PERSON;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EmergencyType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EmergencyType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EmergencyType>() {
          public EmergencyType findValueByNumber(int number) {
            return EmergencyType.forNumber(number);
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
    return com.anduril.entitymanager.v1.GeoentityPubProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final EmergencyType[] VALUES = values();

  public static EmergencyType valueOf(
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

  private EmergencyType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:anduril.entitymanager.v1.EmergencyType)
}

