// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/objective.pub.proto

package com.anduril.tasks.v2;

public final class ObjectivePubProto {
  private ObjectivePubProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_v2_Objective_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_v2_Objective_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_v2_Point_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_v2_Point_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$anduril/tasks/v2/objective.pub.proto\022\020" +
      "anduril.tasks.v2\032\035anduril/type/coords.pu" +
      "b.proto\"\231\001\n\tObjective\022\035\n\tentity_id\030\001 \001(\t" +
      "H\000R\010entityId\022/\n\005point\030\005 \001(\0132\027.anduril.ta" +
      "sks.v2.PointH\000R\005point\022/\n\024produced_by_ass" +
      "et_id\030\002 \001(\tR\021producedByAssetIdB\013\n\tobject" +
      "ive\"\177\n\005Point\022%\n\016reference_name\030\001 \001(\tR\rre" +
      "ferenceName\022#\n\003lla\030\002 \001(\0132\021.anduril.type." +
      "LLAR\003lla\022*\n\021backing_entity_id\030\003 \001(\tR\017bac" +
      "kingEntityIdB\311\001\n\024com.anduril.tasks.v2B\021O" +
      "bjectivePubProtoP\001Z<github.com/anduril/a" +
      "nduril-java/src/anduril/tasks/v2;tasksv2" +
      "\242\002\003ATX\252\002\020Anduril.Tasks.V2\312\002\020Anduril\\Task" +
      "s\\V2\342\002\034Anduril\\Tasks\\V2\\GPBMetadata\352\002\022An" +
      "duril::Tasks::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.anduril.type.CoordsPubProto.getDescriptor(),
        });
    internal_static_anduril_tasks_v2_Objective_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_anduril_tasks_v2_Objective_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_v2_Objective_descriptor,
        new java.lang.String[] { "EntityId", "Point", "ProducedByAssetId", "Objective", });
    internal_static_anduril_tasks_v2_Point_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_anduril_tasks_v2_Point_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_v2_Point_descriptor,
        new java.lang.String[] { "ReferenceName", "Lla", "BackingEntityId", });
    com.anduril.type.CoordsPubProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
