// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/power.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.entitymanager.v1;

public final class PowerPubProto {
  private PowerPubProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_PowerState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_PowerState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_PowerState_SourceIdToStateEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_PowerState_SourceIdToStateEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_PowerSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_PowerSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_PowerLevel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_PowerLevel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(anduril/entitymanager/v1/power.pub.pro" +
      "to\022\030anduril.entitymanager.v1\032\036google/pro" +
      "tobuf/wrappers.proto\"\340\003\n\nPowerState\022f\n\022s" +
      "ource_id_to_state\030\005 \003(\01329.anduril.entity" +
      "manager.v1.PowerState.SourceIdToStateEnt" +
      "ryR\017sourceIdToState\022L\n\014power_status\030\001 \001(" +
      "\0162%.anduril.entitymanager.v1.PowerStatus" +
      "B\002\030\001R\013powerStatus\022F\n\npower_type\030\002 \001(\0162#." +
      "anduril.entitymanager.v1.PowerTypeB\002\030\001R\t" +
      "powerType\022I\n\013power_level\030\003 \001(\0132$.anduril" +
      ".entitymanager.v1.PowerLevelB\002\030\001R\npowerL" +
      "evel\022\036\n\010messages\030\004 \003(\tB\002\030\001R\010messages\032i\n\024" +
      "SourceIdToStateEntry\022\020\n\003key\030\001 \001(\tR\003key\022;" +
      "\n\005value\030\002 \001(\0132%.anduril.entitymanager.v1" +
      ".PowerSourceR\005value:\0028\001\"\274\002\n\013PowerSource\022" +
      "H\n\014power_status\030\001 \001(\0162%.anduril.entityma" +
      "nager.v1.PowerStatusR\013powerStatus\022B\n\npow" +
      "er_type\030\002 \001(\0162#.anduril.entitymanager.v1" +
      ".PowerTypeR\tpowerType\022E\n\013power_level\030\003 \001" +
      "(\0132$.anduril.entitymanager.v1.PowerLevel" +
      "R\npowerLevel\022\032\n\010messages\030\004 \003(\tR\010messages" +
      "\022<\n\013offloadable\030\005 \001(\0132\032.google.protobuf." +
      "BoolValueR\013offloadable\"\224\003\n\nPowerLevel\022\032\n" +
      "\010capacity\030\001 \001(\002R\010capacity\022\034\n\tremaining\030\002" +
      " \001(\002R\tremaining\022+\n\021percent_remaining\030\003 \001" +
      "(\002R\020percentRemaining\0226\n\007voltage\030\004 \001(\0132\034." +
      "google.protobuf.DoubleValueR\007voltage\022?\n\014" +
      "current_amps\030\005 \001(\0132\034.google.protobuf.Dou" +
      "bleValueR\013currentAmps\022P\n\026run_time_to_emp" +
      "ty_mins\030\006 \001(\0132\034.google.protobuf.DoubleVa" +
      "lueR\022runTimeToEmptyMins\022T\n\030consumption_r" +
      "ate_l_per_s\030\007 \001(\0132\034.google.protobuf.Doub" +
      "leValueR\024consumptionRateLPerS*\256\001\n\013PowerS" +
      "tatus\022\030\n\024POWER_STATUS_INVALID\020\000\022\030\n\024POWER" +
      "_STATUS_UNKNOWN\020\001\022\034\n\030POWER_STATUS_NOT_PR" +
      "ESENT\020\002\022\032\n\026POWER_STATUS_OPERATING\020\003\022\031\n\025P" +
      "OWER_STATUS_DISABLED\020\004\022\026\n\022POWER_STATUS_E" +
      "RROR\020\005*g\n\tPowerType\022\026\n\022POWER_TYPE_INVALI" +
      "D\020\000\022\026\n\022POWER_TYPE_UNKNOWN\020\001\022\022\n\016POWER_TYP" +
      "E_GAS\020\002\022\026\n\022POWER_TYPE_BATTERY\020\003B\375\001\n\034com." +
      "anduril.entitymanager.v1B\rPowerPubProtoP" +
      "\001ZLgithub.com/anduril/anduril-java/src/a" +
      "nduril/entitymanager/v1;entitymanagerv1\242" +
      "\002\003AEX\252\002\030Anduril.Entitymanager.V1\312\002\030Andur" +
      "il\\Entitymanager\\V1\342\002$Anduril\\Entitymana" +
      "ger\\V1\\GPBMetadata\352\002\032Anduril::Entitymana" +
      "ger::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_anduril_entitymanager_v1_PowerState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_anduril_entitymanager_v1_PowerState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_PowerState_descriptor,
        new java.lang.String[] { "SourceIdToState", "PowerStatus", "PowerType", "PowerLevel", "Messages", });
    internal_static_anduril_entitymanager_v1_PowerState_SourceIdToStateEntry_descriptor =
      internal_static_anduril_entitymanager_v1_PowerState_descriptor.getNestedTypes().get(0);
    internal_static_anduril_entitymanager_v1_PowerState_SourceIdToStateEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_PowerState_SourceIdToStateEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_anduril_entitymanager_v1_PowerSource_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_anduril_entitymanager_v1_PowerSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_PowerSource_descriptor,
        new java.lang.String[] { "PowerStatus", "PowerType", "PowerLevel", "Messages", "Offloadable", });
    internal_static_anduril_entitymanager_v1_PowerLevel_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_anduril_entitymanager_v1_PowerLevel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_PowerLevel_descriptor,
        new java.lang.String[] { "Capacity", "Remaining", "PercentRemaining", "Voltage", "CurrentAmps", "RunTimeToEmptyMins", "ConsumptionRateLPerS", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
