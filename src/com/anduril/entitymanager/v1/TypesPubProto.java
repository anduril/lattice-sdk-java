// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/types.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.entitymanager.v1;

public final class TypesPubProto {
  private TypesPubProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_UInt32Range_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_UInt32Range_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_FloatRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_FloatRange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(anduril/entitymanager/v1/types.pub.pro" +
      "to\022\030anduril.entitymanager.v1\"O\n\013UInt32Ra" +
      "nge\022\037\n\013lower_bound\030\001 \001(\rR\nlowerBound\022\037\n\013" +
      "upper_bound\030\002 \001(\rR\nupperBound\"N\n\nFloatRa" +
      "nge\022\037\n\013lower_bound\030\001 \001(\002R\nlowerBound\022\037\n\013" +
      "upper_bound\030\002 \001(\002R\nupperBound*\344\004\n\tAltIdT" +
      "ype\022\027\n\023ALT_ID_TYPE_INVALID\020\000\022\032\n\026ALT_ID_T" +
      "YPE_TRACK_ID_2\020\001\022\032\n\026ALT_ID_TYPE_TRACK_ID" +
      "_1\020\014\022\026\n\022ALT_ID_TYPE_SPI_ID\020\002\022\037\n\033ALT_ID_T" +
      "YPE_NITF_FILE_TITLE\020\003\022#\n\037ALT_ID_TYPE_TRA" +
      "CK_REPO_ALERT_ID\020\004\022\030\n\024ALT_ID_TYPE_ASSET_" +
      "ID\020\005\022\'\n\037ALT_ID_TYPE_LINK16_TRACK_NUMBER\020" +
      "\006\032\002\010\001\022\031\n\025ALT_ID_TYPE_LINK16_JU\020\007\022\037\n\033ALT_" +
      "ID_TYPE_NCCT_MESSAGE_ID\020\010\022\030\n\024ALT_ID_TYPE" +
      "_CALLSIGN\020\t\022\027\n\023ALT_ID_TYPE_MMSI_ID\020\n\022\027\n\023" +
      "ALT_ID_TYPE_VMF_URN\020\013\022\026\n\022ALT_ID_TYPE_IMO" +
      "_ID\020\r\022!\n\035ALT_ID_TYPE_VMF_TARGET_NUMBER\020\016" +
      "\022\035\n\031ALT_ID_TYPE_SERIAL_NUMBER\020\017\022\037\n\033ALT_I" +
      "D_TYPE_REGISTRATION_ID\020\020\022\027\n\023ALT_ID_TYPE_" +
      "IBS_GID\020\021\022\026\n\022ALT_ID_TYPE_DODAAC\020\022\022\023\n\017ALT" +
      "_ID_TYPE_UIC\020\023\022\034\n\030ALT_ID_TYPE_NORAD_CAT_" +
      "ID\020\024*\242\001\n\010Template\022\024\n\020TEMPLATE_INVALID\020\000\022" +
      "\022\n\016TEMPLATE_TRACK\020\001\022%\n!TEMPLATE_SENSOR_P" +
      "OINT_OF_INTEREST\020\002\022\022\n\016TEMPLATE_ASSET\020\003\022\020" +
      "\n\014TEMPLATE_GEO\020\004\022\037\n\033TEMPLATE_SIGNAL_OF_I" +
      "NTEREST\020\005*\254\006\n\006Source\022\022\n\016SOURCE_INVALID\020\000" +
      "\022\022\n\016SOURCE_ANDURIL\020\001\022\022\n\016SOURCE_LINK_16\020\002" +
      "\022\016\n\nSOURCE_VMF\020\003\022\017\n\013SOURCE_ADSB\020\004\022\033\n\027SOU" +
      "RCE_CURSOR_ON_TARGET\020\005\022\020\n\014SOURCE_MAXAR\020\006" +
      "\022\021\n\rSOURCE_MARTAC\020\007\022\024\n\020SOURCE_SAILDRONE\020" +
      "\010\022\021\n\rSOURCE_HE_360\020\t\022\016\n\nSOURCE_OFX\020\n\022\020\n\014" +
      "SOURCE_BAS_T\020\013\022\023\n\017SOURCE_KINETICA\020\014\022\017\n\013S" +
      "OURCE_USER\020\r\022\017\n\013SOURCE_NCCT\020\016\022\016\n\nSOURCE_" +
      "AIS\020\017\022\016\n\nSOURCE_KLV\020\020\022\017\n\013SOURCE_NITF\020\021\022\016" +
      "\n\nSOURCE_TAK\020\022\022\024\n\020SOURCE_SPIRE_AIS\020\023\022\017\n\013" +
      "SOURCE_SEFI\020\024\022\030\n\024SOURCE_ADSB_EXCHANGE\020\025\022" +
      "\026\n\022SOURCE_LIVE_UA_MAP\020\026\022\023\n\017SOURCE_CRUCIB" +
      "LE\020\027\022\016\n\nSOURCE_IBS\020\030\022\021\n\rSOURCE_ADVANA\020\031\022" +
      "\023\n\017SOURCE_THRESHER\020\032\022\024\n\020SOURCE_SEATRACKS" +
      "\020\033\022\017\n\013SOURCE_TASS\020\034\022\027\n\023SOURCE_SMART_SENS" +
      "OR\020\036\022\026\n\022SOURCE_STRIVEWORKS\020\037\022\024\n\020SOURCE_L" +
      "3H_THEIA\020 \022\033\n\027SOURCE_TALON_POWDERHORN\020!\022" +
      "\033\n\027SOURCE_IDT_VIRTUAL_TWIN\020\"\022\033\n\027SOURCE_M" +
      "ISSION_AUTONOMY\020#\022\017\n\013SOURCE_GCCS\020$\022\022\n\016SO" +
      "URCE_FOUNDRY\020%\022\017\n\013SOURCE_MIDB\020&\022\016\n\nSOURC" +
      "E_FOM\020\'\022\017\n\013SOURCE_GALE\020(*\310\001\n\016OverrideSta" +
      "tus\022\033\n\027OVERRIDE_STATUS_INVALID\020\000\022\033\n\027OVER" +
      "RIDE_STATUS_APPLIED\020\001\022\033\n\027OVERRIDE_STATUS" +
      "_PENDING\020\002\022\033\n\027OVERRIDE_STATUS_TIMEOUT\020\003\022" +
      "\034\n\030OVERRIDE_STATUS_REJECTED\020\004\022$\n OVERRID" +
      "E_STATUS_DELETION_PENDING\020\005*`\n\014OverrideT" +
      "ype\022\031\n\025OVERRIDE_TYPE_INVALID\020\000\022\026\n\022OVERRI" +
      "DE_TYPE_LIVE\020\001\022\035\n\031OVERRIDE_TYPE_POST_EXP" +
      "IRY\020\002B\375\001\n\034com.anduril.entitymanager.v1B\r" +
      "TypesPubProtoP\001ZLgithub.com/anduril/andu" +
      "ril-java/src/anduril/entitymanager/v1;en" +
      "titymanagerv1\242\002\003AEX\252\002\030Anduril.Entitymana" +
      "ger.V1\312\002\030Anduril\\Entitymanager\\V1\342\002$Andu" +
      "ril\\Entitymanager\\V1\\GPBMetadata\352\002\032Andur" +
      "il::Entitymanager::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_anduril_entitymanager_v1_UInt32Range_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_anduril_entitymanager_v1_UInt32Range_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_UInt32Range_descriptor,
        new java.lang.String[] { "LowerBound", "UpperBound", });
    internal_static_anduril_entitymanager_v1_FloatRange_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_anduril_entitymanager_v1_FloatRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_FloatRange_descriptor,
        new java.lang.String[] { "LowerBound", "UpperBound", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
