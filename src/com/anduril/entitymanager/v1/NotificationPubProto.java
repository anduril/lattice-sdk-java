// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/notification.pub.proto

package com.anduril.entitymanager.v1;

public final class NotificationPubProto {
  private NotificationPubProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_OverrideNotificationPayload_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_OverrideNotificationPayload_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/anduril/entitymanager/v1/notification." +
      "pub.proto\022\030anduril.entitymanager.v1\032)and" +
      "uril/entitymanager/v1/entity.pub.proto\"\274" +
      "\001\n\033OverrideNotificationPayload\0228\n\006entity" +
      "\030\001 \001(\0132 .anduril.entitymanager.v1.Entity" +
      "R\006entity\022\035\n\nfield_path\030\002 \001(\tR\tfieldPath\022" +
      "D\n\nprovenance\030\003 \001(\0132$.anduril.entitymana" +
      "ger.v1.ProvenanceR\nprovenanceB\204\002\n\034com.an" +
      "duril.entitymanager.v1B\024NotificationPubP" +
      "rotoP\001ZLgithub.com/anduril/anduril-java/" +
      "src/anduril/entitymanager/v1;entitymanag" +
      "erv1\242\002\003AEX\252\002\030Anduril.Entitymanager.V1\312\002\030" +
      "Anduril\\Entitymanager\\V1\342\002$Anduril\\Entit" +
      "ymanager\\V1\\GPBMetadata\352\002\032Anduril::Entit" +
      "ymanager::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.anduril.entitymanager.v1.EntityPubProto.getDescriptor(),
        });
    internal_static_anduril_entitymanager_v1_OverrideNotificationPayload_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_anduril_entitymanager_v1_OverrideNotificationPayload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_OverrideNotificationPayload_descriptor,
        new java.lang.String[] { "Entity", "FieldPath", "Provenance", });
    com.anduril.entitymanager.v1.EntityPubProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
