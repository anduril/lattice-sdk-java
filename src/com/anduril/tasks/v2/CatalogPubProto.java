// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/catalog.pub.proto

package com.anduril.tasks.v2;

public final class CatalogPubProto {
  private CatalogPubProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_v2_TaskCatalog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_v2_TaskCatalog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_v2_TaskDefinition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_v2_TaskDefinition_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"anduril/tasks/v2/catalog.pub.proto\022\020an" +
      "duril.tasks.v2\"`\n\013TaskCatalog\022K\n\020task_de" +
      "finitions\030\001 \003(\0132 .anduril.tasks.v2.TaskD" +
      "efinitionR\017taskDefinitionsJ\004\010\002\020\003\"i\n\016Task" +
      "Definition\0224\n\026task_specification_url\030\001 \001" +
      "(\tR\024taskSpecificationUrl\022!\n\014display_name" +
      "\030\002 \001(\tR\013displayNameB\313\001\n\024com.anduril.task" +
      "s.v2B\017CatalogPubProtoP\001Z@github.com/andu" +
      "ril/lattice-sdk-java/src/anduril/tasks/v" +
      "2;tasksv2\242\002\003ATX\252\002\020Anduril.Tasks.V2\312\002\020And" +
      "uril\\Tasks\\V2\342\002\034Anduril\\Tasks\\V2\\GPBMeta" +
      "data\352\002\022Anduril::Tasks::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_anduril_tasks_v2_TaskCatalog_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_anduril_tasks_v2_TaskCatalog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_v2_TaskCatalog_descriptor,
        new java.lang.String[] { "TaskDefinitions", });
    internal_static_anduril_tasks_v2_TaskDefinition_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_anduril_tasks_v2_TaskDefinition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_v2_TaskDefinition_descriptor,
        new java.lang.String[] { "TaskSpecificationUrl", "DisplayName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
