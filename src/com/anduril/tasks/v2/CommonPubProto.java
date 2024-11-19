// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/common.pub.proto

package com.anduril.tasks.v2;

public final class CommonPubProto {
  private CommonPubProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_v2_DurationRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_v2_DurationRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_v2_AnglePair_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_v2_AnglePair_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_v2_AreaConstraints_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_v2_AreaConstraints_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_v2_AltitudeConstraint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_v2_AltitudeConstraint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_v2_Agent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_v2_Agent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_v2_ControlArea_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_v2_ControlArea_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!anduril/tasks/v2/common.pub.proto\022\020and" +
      "uril.tasks.v2\032\036google/protobuf/duration." +
      "proto\"i\n\rDurationRange\022+\n\003min\030\001 \001(\0132\031.go" +
      "ogle.protobuf.DurationR\003min\022+\n\003max\030\002 \001(\013" +
      "2\031.google.protobuf.DurationR\003max\"/\n\tAngl" +
      "ePair\022\020\n\003min\030\001 \001(\001R\003min\022\020\n\003max\030\002 \001(\001R\003ma" +
      "x\"h\n\017AreaConstraints\022U\n\023altitude_constra" +
      "int\030\001 \001(\0132$.anduril.tasks.v2.AltitudeCon" +
      "straintR\022altitudeConstraint\"8\n\022AltitudeC" +
      "onstraint\022\020\n\003min\030\001 \001(\001R\003min\022\020\n\003max\030\002 \001(\001" +
      "R\003max\"?\n\005Agent\022\031\n\010asset_id\030\001 \001(\tR\007assetI" +
      "d\022\033\n\tentity_id\030\002 \001(\tR\010entityId\"y\n\013Contro" +
      "lArea\022\033\n\tentity_id\030\001 \001(\tR\010entityId\022M\n\021co" +
      "ntrol_area_type\030\002 \001(\0162!.anduril.tasks.v2" +
      ".ControlAreaTypeR\017controlAreaType*\233\001\n\017Co" +
      "ntrolAreaType\022\035\n\031CONTROL_AREA_TYPE_INVAL" +
      "ID\020\000\022\"\n\036CONTROL_AREA_TYPE_KEEP_IN_ZONE\020\001" +
      "\022#\n\037CONTROL_AREA_TYPE_KEEP_OUT_ZONE\020\002\022 \n" +
      "\034CONTROL_AREA_TYPE_DITCH_ZONE\020\003B\312\001\n\024com." +
      "anduril.tasks.v2B\016CommonPubProtoP\001Z@gith" +
      "ub.com/anduril/lattice-sdk-java/src/andu" +
      "ril/tasks/v2;tasksv2\242\002\003ATX\252\002\020Anduril.Tas" +
      "ks.V2\312\002\020Anduril\\Tasks\\V2\342\002\034Anduril\\Tasks" +
      "\\V2\\GPBMetadata\352\002\022Anduril::Tasks::V2b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DurationProto.getDescriptor(),
        });
    internal_static_anduril_tasks_v2_DurationRange_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_anduril_tasks_v2_DurationRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_v2_DurationRange_descriptor,
        new java.lang.String[] { "Min", "Max", });
    internal_static_anduril_tasks_v2_AnglePair_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_anduril_tasks_v2_AnglePair_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_v2_AnglePair_descriptor,
        new java.lang.String[] { "Min", "Max", });
    internal_static_anduril_tasks_v2_AreaConstraints_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_anduril_tasks_v2_AreaConstraints_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_v2_AreaConstraints_descriptor,
        new java.lang.String[] { "AltitudeConstraint", });
    internal_static_anduril_tasks_v2_AltitudeConstraint_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_anduril_tasks_v2_AltitudeConstraint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_v2_AltitudeConstraint_descriptor,
        new java.lang.String[] { "Min", "Max", });
    internal_static_anduril_tasks_v2_Agent_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_anduril_tasks_v2_Agent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_v2_Agent_descriptor,
        new java.lang.String[] { "AssetId", "EntityId", });
    internal_static_anduril_tasks_v2_ControlArea_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_anduril_tasks_v2_ControlArea_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_v2_ControlArea_descriptor,
        new java.lang.String[] { "EntityId", "ControlAreaType", });
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
