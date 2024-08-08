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
      "e.protobuf.TimestampR\nupdateTime\"\266\002\n\006Hea" +
      "lth\022W\n\021connection_status\030\001 \001(\0162*.anduril" +
      ".entitymanager.v1.ConnectionStatusR\020conn" +
      "ectionStatus\022K\n\rhealth_status\030\002 \001(\0162&.an" +
      "duril.entitymanager.v1.HealthStatusR\014hea" +
      "lthStatus\022I\n\ncomponents\030\003 \003(\0132).anduril." +
      "entitymanager.v1.ComponentHealthR\ncompon" +
      "ents\022;\n\013update_time\030\004 \001(\0132\032.google.proto" +
      "buf.TimestampR\nupdateTime*n\n\020ConnectionS" +
      "tatus\022\035\n\031CONNECTION_STATUS_INVALID\020\000\022\034\n\030" +
      "CONNECTION_STATUS_ONLINE\020\001\022\035\n\031CONNECTION" +
      "_STATUS_OFFLINE\020\002*\254\001\n\014HealthStatus\022\031\n\025HE" +
      "ALTH_STATUS_INVALID\020\000\022\031\n\025HEALTH_STATUS_H" +
      "EALTHY\020\001\022\026\n\022HEALTH_STATUS_WARN\020\002\022\026\n\022HEAL" +
      "TH_STATUS_FAIL\020\003\022\031\n\025HEALTH_STATUS_OFFLIN" +
      "E\020\004\022\033\n\027HEALTH_STATUS_NOT_READY\020\005B\204\002\n\034com" +
      ".anduril.entitymanager.v1B\024HealthStatusP" +
      "ubProtoP\001ZLgithub.com/anduril/anduril-ja" +
      "va/src/anduril/entitymanager/v1;entityma" +
      "nagerv1\242\002\003AEX\252\002\030Anduril.Entitymanager.V1" +
      "\312\002\030Anduril\\Entitymanager\\V1\342\002$Anduril\\En" +
      "titymanager\\V1\\GPBMetadata\352\002\032Anduril::En" +
      "titymanager::V1b\006proto3"
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
        new java.lang.String[] { "ConnectionStatus", "HealthStatus", "Components", "UpdateTime", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
