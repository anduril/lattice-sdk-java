// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/tasks/jadc2/thirdparty/v1/transit.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.tasks.jadc2.thirdparty.v1;

public final class TransitPubProto {
  private TransitPubProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      TransitPubProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_jadc2_thirdparty_v1_Transit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_tasks_jadc2_thirdparty_v1_Transit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_jadc2_thirdparty_v1_PathSegment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_tasks_jadc2_thirdparty_v1_PathSegment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_jadc2_thirdparty_v1_TeamTransit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_tasks_jadc2_thirdparty_v1_TeamTransit_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3anduril/tasks/jadc2/thirdparty/v1/tran" +
      "sit.pub.proto\022!anduril.tasks.jadc2.third" +
      "party.v1\032\035anduril/type/coords.pub.proto\032" +
      "\036google/protobuf/wrappers.proto\"\225\001\n\007Tran" +
      "sit\022B\n\004path\030\001 \003(\0132..anduril.tasks.jadc2." +
      "thirdparty.v1.PathSegmentR\004path\022F\n\020surfa" +
      "ce_speed_ms\030\002 \001(\0132\034.google.protobuf.Doub" +
      "leValueR\016surfaceSpeedMs\"<\n\013PathSegment\022-" +
      "\n\010endpoint\030\001 \001(\0132\021.anduril.type.LLAR\010end" +
      "point\"\212\001\n\013TeamTransit\0223\n\026transit_zone_en" +
      "tity_id\030\001 \001(\tR\023transitZoneEntityId\022F\n\020su" +
      "rface_speed_ms\030\002 \001(\0132\034.google.protobuf.D" +
      "oubleValueR\016surfaceSpeedMsB\263\002\n%com.andur" +
      "il.tasks.jadc2.thirdparty.v1B\017TransitPub" +
      "ProtoP\001ZPghe.anduril.dev/anduril/anduril" +
      "apis-go/anduril/tasks/jadc2/thirdparty/v" +
      "1;tasksv1\242\002\004ATJT\252\002!Anduril.Tasks.Jadc2.T" +
      "hirdparty.V1\312\002!Anduril\\Tasks\\Jadc2\\Third" +
      "party\\V1\342\002-Anduril\\Tasks\\Jadc2\\Thirdpart" +
      "y\\V1\\GPBMetadata\352\002%Anduril::Tasks::Jadc2" +
      "::Thirdparty::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.anduril.type.CoordsPubProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_anduril_tasks_jadc2_thirdparty_v1_Transit_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_anduril_tasks_jadc2_thirdparty_v1_Transit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_tasks_jadc2_thirdparty_v1_Transit_descriptor,
        new java.lang.String[] { "Path", "SurfaceSpeedMs", });
    internal_static_anduril_tasks_jadc2_thirdparty_v1_PathSegment_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_anduril_tasks_jadc2_thirdparty_v1_PathSegment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_tasks_jadc2_thirdparty_v1_PathSegment_descriptor,
        new java.lang.String[] { "Endpoint", });
    internal_static_anduril_tasks_jadc2_thirdparty_v1_TeamTransit_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_anduril_tasks_jadc2_thirdparty_v1_TeamTransit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_tasks_jadc2_thirdparty_v1_TeamTransit_descriptor,
        new java.lang.String[] { "TransitZoneEntityId", "SurfaceSpeedMs", });
    descriptor.resolveAllFeaturesImmutable();
    com.anduril.type.CoordsPubProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
