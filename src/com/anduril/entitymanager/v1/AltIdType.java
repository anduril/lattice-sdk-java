// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/types.pub.proto

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * The type of alternate id.
 * </pre>
 *
 * Protobuf enum {@code anduril.entitymanager.v1.AltIdType}
 */
public enum AltIdType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ALT_ID_TYPE_INVALID = 0;</code>
   */
  ALT_ID_TYPE_INVALID(0),
  /**
   * <pre>
   * an Anduril trackId_2
   * </pre>
   *
   * <code>ALT_ID_TYPE_TRACK_ID_2 = 1;</code>
   */
  ALT_ID_TYPE_TRACK_ID_2(1),
  /**
   * <pre>
   * an Anduril trackId_1
   * </pre>
   *
   * <code>ALT_ID_TYPE_TRACK_ID_1 = 12;</code>
   */
  ALT_ID_TYPE_TRACK_ID_1(12),
  /**
   * <pre>
   * an Anduril Sensor Point of Interest ID
   * </pre>
   *
   * <code>ALT_ID_TYPE_SPI_ID = 2;</code>
   */
  ALT_ID_TYPE_SPI_ID(2),
  /**
   * <pre>
   * NITF file title
   * </pre>
   *
   * <code>ALT_ID_TYPE_NITF_FILE_TITLE = 3;</code>
   */
  ALT_ID_TYPE_NITF_FILE_TITLE(3),
  /**
   * <pre>
   * Track repo alert ID
   * </pre>
   *
   * <code>ALT_ID_TYPE_TRACK_REPO_ALERT_ID = 4;</code>
   */
  ALT_ID_TYPE_TRACK_REPO_ALERT_ID(4),
  /**
   * <pre>
   * an Anduril AssetId
   * </pre>
   *
   * <code>ALT_ID_TYPE_ASSET_ID = 5;</code>
   */
  ALT_ID_TYPE_ASSET_ID(5),
  /**
   * <pre>
   * deprecated, do not use
   * </pre>
   *
   * <code>ALT_ID_TYPE_LINK16_TRACK_NUMBER = 6 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  ALT_ID_TYPE_LINK16_TRACK_NUMBER(6),
  /**
   * <pre>
   * a Link 16 track number. This will allow a link 16 asset (STN) or track (RefTN) to be identified.
   * </pre>
   *
   * <code>ALT_ID_TYPE_LINK16_JU = 7;</code>
   */
  ALT_ID_TYPE_LINK16_JU(7),
  /**
   * <pre>
   * an NCCT message ID
   * </pre>
   *
   * <code>ALT_ID_TYPE_NCCT_MESSAGE_ID = 8;</code>
   */
  ALT_ID_TYPE_NCCT_MESSAGE_ID(8),
  /**
   * <pre>
   * callsign for the entity. e.g. a TAK callsign or an aircraft callsign
   * </pre>
   *
   * <code>ALT_ID_TYPE_CALLSIGN = 9;</code>
   */
  ALT_ID_TYPE_CALLSIGN(9),
  /**
   * <pre>
   * the Maritime Mobile Service Identity for a maritime object (vessel, offshore installation, etc.)
   * </pre>
   *
   * <code>ALT_ID_TYPE_MMSI_ID = 10;</code>
   */
  ALT_ID_TYPE_MMSI_ID(10),
  /**
   * <pre>
   * A VMF URN that uniquely identifies the URN on the VMF network.
   * </pre>
   *
   * <code>ALT_ID_TYPE_VMF_URN = 11;</code>
   */
  ALT_ID_TYPE_VMF_URN(11),
  /**
   * <pre>
   * the International Maritime Organization number for identifying maritime objects (vessel, offshore installation, etc.)
   * </pre>
   *
   * <code>ALT_ID_TYPE_IMO_ID = 13;</code>
   */
  ALT_ID_TYPE_IMO_ID(13),
  /**
   * <pre>
   * A VMF target number that uniquely identifies the target on the VMF network
   * </pre>
   *
   * <code>ALT_ID_TYPE_VMF_TARGET_NUMBER = 14;</code>
   */
  ALT_ID_TYPE_VMF_TARGET_NUMBER(14),
  /**
   * <pre>
   * A serial number that uniquely identifies the entity and is permanently associated with only one entity. This
   * identifier is assigned by some authority and only ever identifies a single thing. Examples include a
   * Vehicle Identification Number (VIN) or ship hull identification number (hull number). This is a generalized
   * component and should not be used if a more specific registration type is already defined (i.e., ALT_ID_TYPE_VMF_URN).
   * </pre>
   *
   * <code>ALT_ID_TYPE_SERIAL_NUMBER = 15;</code>
   */
  ALT_ID_TYPE_SERIAL_NUMBER(15),
  /**
   * <pre>
   * A registration identifier assigned by a local or national authority. This identifier is not permanently fixed
   * to one specific entity and may be reassigned on change of ownership, destruction, or other conditions set
   * forth by the authority. Examples include a vehicle license plate or aircraft tail number. This is a generalized
   * component and should not be used if a more specific registration type is already defined (i.e., ALT_ID_TYPE_IMO_ID).
   * </pre>
   *
   * <code>ALT_ID_TYPE_REGISTRATION_ID = 16;</code>
   */
  ALT_ID_TYPE_REGISTRATION_ID(16),
  /**
   * <pre>
   * Integrated Broadcast Service Common Message Format Global Identifier
   * </pre>
   *
   * <code>ALT_ID_TYPE_IBS_GID = 17;</code>
   */
  ALT_ID_TYPE_IBS_GID(17),
  /**
   * <pre>
   * Department of Defense Activity Address Code uniquely identifies a unit, activity, or organization with the DoDAAD. A single unit could have multiple DoDAACs
   * </pre>
   *
   * <code>ALT_ID_TYPE_DODAAC = 18;</code>
   */
  ALT_ID_TYPE_DODAAC(18),
  /**
   * <pre>
   * Unit Identification Code uniquely identifies each US Department of Defense entity
   * </pre>
   *
   * <code>ALT_ID_TYPE_UIC = 19;</code>
   */
  ALT_ID_TYPE_UIC(19),
  /**
   * <pre>
   * A NORAD Satellite Catalog Number, a 9-digit number uniquely representing orbital objects around Earth. This is
   * the standard ID used for satellites by the DOD.
   * Note that there is ongoing work to replace the 9-digit number with a 9-digit alphanumeric sequence to accommodate
   * ever-increasing numbers of satellites (and space debris). Treat the accompanied ID field as alphanumeric instead
   * of strictly numeric.
   * </pre>
   *
   * <code>ALT_ID_TYPE_NORAD_CAT_ID = 20;</code>
   */
  ALT_ID_TYPE_NORAD_CAT_ID(20),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ALT_ID_TYPE_INVALID = 0;</code>
   */
  public static final int ALT_ID_TYPE_INVALID_VALUE = 0;
  /**
   * <pre>
   * an Anduril trackId_2
   * </pre>
   *
   * <code>ALT_ID_TYPE_TRACK_ID_2 = 1;</code>
   */
  public static final int ALT_ID_TYPE_TRACK_ID_2_VALUE = 1;
  /**
   * <pre>
   * an Anduril trackId_1
   * </pre>
   *
   * <code>ALT_ID_TYPE_TRACK_ID_1 = 12;</code>
   */
  public static final int ALT_ID_TYPE_TRACK_ID_1_VALUE = 12;
  /**
   * <pre>
   * an Anduril Sensor Point of Interest ID
   * </pre>
   *
   * <code>ALT_ID_TYPE_SPI_ID = 2;</code>
   */
  public static final int ALT_ID_TYPE_SPI_ID_VALUE = 2;
  /**
   * <pre>
   * NITF file title
   * </pre>
   *
   * <code>ALT_ID_TYPE_NITF_FILE_TITLE = 3;</code>
   */
  public static final int ALT_ID_TYPE_NITF_FILE_TITLE_VALUE = 3;
  /**
   * <pre>
   * Track repo alert ID
   * </pre>
   *
   * <code>ALT_ID_TYPE_TRACK_REPO_ALERT_ID = 4;</code>
   */
  public static final int ALT_ID_TYPE_TRACK_REPO_ALERT_ID_VALUE = 4;
  /**
   * <pre>
   * an Anduril AssetId
   * </pre>
   *
   * <code>ALT_ID_TYPE_ASSET_ID = 5;</code>
   */
  public static final int ALT_ID_TYPE_ASSET_ID_VALUE = 5;
  /**
   * <pre>
   * deprecated, do not use
   * </pre>
   *
   * <code>ALT_ID_TYPE_LINK16_TRACK_NUMBER = 6 [deprecated = true];</code>
   */
  @java.lang.Deprecated public static final int ALT_ID_TYPE_LINK16_TRACK_NUMBER_VALUE = 6;
  /**
   * <pre>
   * a Link 16 track number. This will allow a link 16 asset (STN) or track (RefTN) to be identified.
   * </pre>
   *
   * <code>ALT_ID_TYPE_LINK16_JU = 7;</code>
   */
  public static final int ALT_ID_TYPE_LINK16_JU_VALUE = 7;
  /**
   * <pre>
   * an NCCT message ID
   * </pre>
   *
   * <code>ALT_ID_TYPE_NCCT_MESSAGE_ID = 8;</code>
   */
  public static final int ALT_ID_TYPE_NCCT_MESSAGE_ID_VALUE = 8;
  /**
   * <pre>
   * callsign for the entity. e.g. a TAK callsign or an aircraft callsign
   * </pre>
   *
   * <code>ALT_ID_TYPE_CALLSIGN = 9;</code>
   */
  public static final int ALT_ID_TYPE_CALLSIGN_VALUE = 9;
  /**
   * <pre>
   * the Maritime Mobile Service Identity for a maritime object (vessel, offshore installation, etc.)
   * </pre>
   *
   * <code>ALT_ID_TYPE_MMSI_ID = 10;</code>
   */
  public static final int ALT_ID_TYPE_MMSI_ID_VALUE = 10;
  /**
   * <pre>
   * A VMF URN that uniquely identifies the URN on the VMF network.
   * </pre>
   *
   * <code>ALT_ID_TYPE_VMF_URN = 11;</code>
   */
  public static final int ALT_ID_TYPE_VMF_URN_VALUE = 11;
  /**
   * <pre>
   * the International Maritime Organization number for identifying maritime objects (vessel, offshore installation, etc.)
   * </pre>
   *
   * <code>ALT_ID_TYPE_IMO_ID = 13;</code>
   */
  public static final int ALT_ID_TYPE_IMO_ID_VALUE = 13;
  /**
   * <pre>
   * A VMF target number that uniquely identifies the target on the VMF network
   * </pre>
   *
   * <code>ALT_ID_TYPE_VMF_TARGET_NUMBER = 14;</code>
   */
  public static final int ALT_ID_TYPE_VMF_TARGET_NUMBER_VALUE = 14;
  /**
   * <pre>
   * A serial number that uniquely identifies the entity and is permanently associated with only one entity. This
   * identifier is assigned by some authority and only ever identifies a single thing. Examples include a
   * Vehicle Identification Number (VIN) or ship hull identification number (hull number). This is a generalized
   * component and should not be used if a more specific registration type is already defined (i.e., ALT_ID_TYPE_VMF_URN).
   * </pre>
   *
   * <code>ALT_ID_TYPE_SERIAL_NUMBER = 15;</code>
   */
  public static final int ALT_ID_TYPE_SERIAL_NUMBER_VALUE = 15;
  /**
   * <pre>
   * A registration identifier assigned by a local or national authority. This identifier is not permanently fixed
   * to one specific entity and may be reassigned on change of ownership, destruction, or other conditions set
   * forth by the authority. Examples include a vehicle license plate or aircraft tail number. This is a generalized
   * component and should not be used if a more specific registration type is already defined (i.e., ALT_ID_TYPE_IMO_ID).
   * </pre>
   *
   * <code>ALT_ID_TYPE_REGISTRATION_ID = 16;</code>
   */
  public static final int ALT_ID_TYPE_REGISTRATION_ID_VALUE = 16;
  /**
   * <pre>
   * Integrated Broadcast Service Common Message Format Global Identifier
   * </pre>
   *
   * <code>ALT_ID_TYPE_IBS_GID = 17;</code>
   */
  public static final int ALT_ID_TYPE_IBS_GID_VALUE = 17;
  /**
   * <pre>
   * Department of Defense Activity Address Code uniquely identifies a unit, activity, or organization with the DoDAAD. A single unit could have multiple DoDAACs
   * </pre>
   *
   * <code>ALT_ID_TYPE_DODAAC = 18;</code>
   */
  public static final int ALT_ID_TYPE_DODAAC_VALUE = 18;
  /**
   * <pre>
   * Unit Identification Code uniquely identifies each US Department of Defense entity
   * </pre>
   *
   * <code>ALT_ID_TYPE_UIC = 19;</code>
   */
  public static final int ALT_ID_TYPE_UIC_VALUE = 19;
  /**
   * <pre>
   * A NORAD Satellite Catalog Number, a 9-digit number uniquely representing orbital objects around Earth. This is
   * the standard ID used for satellites by the DOD.
   * Note that there is ongoing work to replace the 9-digit number with a 9-digit alphanumeric sequence to accommodate
   * ever-increasing numbers of satellites (and space debris). Treat the accompanied ID field as alphanumeric instead
   * of strictly numeric.
   * </pre>
   *
   * <code>ALT_ID_TYPE_NORAD_CAT_ID = 20;</code>
   */
  public static final int ALT_ID_TYPE_NORAD_CAT_ID_VALUE = 20;


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
  public static AltIdType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AltIdType forNumber(int value) {
    switch (value) {
      case 0: return ALT_ID_TYPE_INVALID;
      case 1: return ALT_ID_TYPE_TRACK_ID_2;
      case 12: return ALT_ID_TYPE_TRACK_ID_1;
      case 2: return ALT_ID_TYPE_SPI_ID;
      case 3: return ALT_ID_TYPE_NITF_FILE_TITLE;
      case 4: return ALT_ID_TYPE_TRACK_REPO_ALERT_ID;
      case 5: return ALT_ID_TYPE_ASSET_ID;
      case 6: return ALT_ID_TYPE_LINK16_TRACK_NUMBER;
      case 7: return ALT_ID_TYPE_LINK16_JU;
      case 8: return ALT_ID_TYPE_NCCT_MESSAGE_ID;
      case 9: return ALT_ID_TYPE_CALLSIGN;
      case 10: return ALT_ID_TYPE_MMSI_ID;
      case 11: return ALT_ID_TYPE_VMF_URN;
      case 13: return ALT_ID_TYPE_IMO_ID;
      case 14: return ALT_ID_TYPE_VMF_TARGET_NUMBER;
      case 15: return ALT_ID_TYPE_SERIAL_NUMBER;
      case 16: return ALT_ID_TYPE_REGISTRATION_ID;
      case 17: return ALT_ID_TYPE_IBS_GID;
      case 18: return ALT_ID_TYPE_DODAAC;
      case 19: return ALT_ID_TYPE_UIC;
      case 20: return ALT_ID_TYPE_NORAD_CAT_ID;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AltIdType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AltIdType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AltIdType>() {
          public AltIdType findValueByNumber(int number) {
            return AltIdType.forNumber(number);
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
    return com.anduril.entitymanager.v1.TypesPubProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final AltIdType[] VALUES = values();

  public static AltIdType valueOf(
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

  private AltIdType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:anduril.entitymanager.v1.AltIdType)
}

