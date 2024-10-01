// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/health_status.pub.proto

package com.anduril.entitymanager.v1;

public final class HealthStatusPubProto {
  private HealthStatusPubProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_ComponentMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_ComponentMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_ComponentHealth_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_ComponentHealth_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_Health_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_Health_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_Alert_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_Alert_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_AlertCondition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_AlertCondition_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0anduril/entitymanager/v1/health_status" +
      ".pub.proto\022\030anduril.entitymanager.v1\032\037go" +
      "ogle/protobuf/timestamp.proto\"l\n\020Compone" +
      "ntMessage\022>\n\006status\030\001 \001(\0162&.anduril.enti" +
      "tymanager.v1.HealthStatusR\006status\022\030\n\007mes" +
      "sage\030\002 \001(\tR\007message\"\372\001\n\017ComponentHealth\022" +
      "\016\n\002id\030\001 \001(\tR\002id\022\022\n\004name\030\002 \001(\tR\004name\022>\n\006h" +
      "ealth\030\003 \001(\0162&.anduril.entitymanager.v1.H" +
      "ealthStatusR\006health\022F\n\010messages\030\004 \003(\0132*." +
      "anduril.entitymanager.v1.ComponentMessag" +
      "eR\010messages\022;\n\013update_time\030\005 \001(\0132\032.googl" +
      "e.protobuf.TimestampR\nupdateTime\"\374\002\n\006Hea" +
      "lth\022W\n\021connection_status\030\001 \001(\0162*.anduril" +
      ".entitymanager.v1.ConnectionStatusR\020conn" +
      "ectionStatus\022K\n\rhealth_status\030\002 \001(\0162&.an" +
      "duril.entitymanager.v1.HealthStatusR\014hea" +
      "lthStatus\022I\n\ncomponents\030\003 \003(\0132).anduril." +
      "entitymanager.v1.ComponentHealthR\ncompon" +
      "ents\022;\n\013update_time\030\004 \001(\0132\032.google.proto" +
      "buf.TimestampR\nupdateTime\022D\n\ractive_aler" +
      "ts\030\005 \003(\0132\037.anduril.entitymanager.v1.Aler" +
      "tR\014activeAlerts\"\236\002\n\005Alert\022\035\n\nalert_code\030" +
      "\001 \001(\tR\talertCode\022 \n\013description\030\002 \001(\tR\013d" +
      "escription\022:\n\005level\030\003 \001(\0162$.anduril.enti" +
      "tymanager.v1.AlertLevelR\005level\022A\n\016activa" +
      "ted_time\030\004 \001(\0132\032.google.protobuf.Timesta" +
      "mpR\ractivatedTime\022U\n\021active_conditions\030\005" +
      " \003(\0132(.anduril.entitymanager.v1.AlertCon" +
      "ditionR\020activeConditions\"Y\n\016AlertConditi" +
      "on\022%\n\016condition_code\030\001 \001(\tR\rconditionCod" +
      "e\022 \n\013description\030\002 \001(\tR\013description*n\n\020C" +
      "onnectionStatus\022\035\n\031CONNECTION_STATUS_INV" +
      "ALID\020\000\022\034\n\030CONNECTION_STATUS_ONLINE\020\001\022\035\n\031" +
      "CONNECTION_STATUS_OFFLINE\020\002*\254\001\n\014HealthSt" +
      "atus\022\031\n\025HEALTH_STATUS_INVALID\020\000\022\031\n\025HEALT" +
      "H_STATUS_HEALTHY\020\001\022\026\n\022HEALTH_STATUS_WARN" +
      "\020\002\022\026\n\022HEALTH_STATUS_FAIL\020\003\022\031\n\025HEALTH_STA" +
      "TUS_OFFLINE\020\004\022\033\n\027HEALTH_STATUS_NOT_READY" +
      "\020\005*q\n\nAlertLevel\022\027\n\023ALERT_LEVEL_INVALID\020" +
      "\000\022\030\n\024ALERT_LEVEL_ADVISORY\020\001\022\027\n\023ALERT_LEV" +
      "EL_CAUTION\020\002\022\027\n\023ALERT_LEVEL_WARNING\020\003B\204\002" +
      "\n\034com.anduril.entitymanager.v1B\024HealthSt" +
      "atusPubProtoP\001ZLgithub.com/anduril/andur" +
      "il-java/src/anduril/entitymanager/v1;ent" +
      "itymanagerv1\242\002\003AEX\252\002\030Anduril.Entitymanag" +
      "er.V1\312\002\030Anduril\\Entitymanager\\V1\342\002$Andur" +
      "il\\Entitymanager\\V1\\GPBMetadata\352\002\032Anduri" +
      "l::Entitymanager::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_anduril_entitymanager_v1_ComponentMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_anduril_entitymanager_v1_ComponentMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_ComponentMessage_descriptor,
        new java.lang.String[] { "Status", "Message", });
    internal_static_anduril_entitymanager_v1_ComponentHealth_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_anduril_entitymanager_v1_ComponentHealth_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_ComponentHealth_descriptor,
        new java.lang.String[] { "Id", "Name", "Health", "Messages", "UpdateTime", });
    internal_static_anduril_entitymanager_v1_Health_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_anduril_entitymanager_v1_Health_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_Health_descriptor,
        new java.lang.String[] { "ConnectionStatus", "HealthStatus", "Components", "UpdateTime", "ActiveAlerts", });
    internal_static_anduril_entitymanager_v1_Alert_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_anduril_entitymanager_v1_Alert_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_Alert_descriptor,
        new java.lang.String[] { "AlertCode", "Description", "Level", "ActivatedTime", "ActiveConditions", });
    internal_static_anduril_entitymanager_v1_AlertCondition_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_anduril_entitymanager_v1_AlertCondition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_AlertCondition_descriptor,
        new java.lang.String[] { "ConditionCode", "Description", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
