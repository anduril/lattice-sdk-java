// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/shared/maneuver.pub.proto

package com.anduril.tasks.v2;

public final class ManeuverPubProto {
  private ManeuverPubProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_v2_Marshal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_v2_Marshal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_v2_Transit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_v2_Transit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_v2_RoutePlan_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_v2_RoutePlan_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_v2_Route_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_v2_Route_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_v2_PathSegment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_v2_PathSegment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_v2_Waypoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_v2_Waypoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_v2_SetLaunchRoute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_v2_SetLaunchRoute_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*anduril/tasks/v2/shared/maneuver.pub.p" +
      "roto\022\020anduril.tasks.v2\032$anduril/tasks/v2" +
      "/objective.pub.proto\032%anduril/tasks/v2/s" +
      "hared/isr.pub.proto\"D\n\007Marshal\0229\n\tobject" +
      "ive\030\001 \001(\0132\033.anduril.tasks.v2.ObjectiveR\t" +
      "objective\":\n\007Transit\022/\n\004plan\030\001 \001(\0132\033.and" +
      "uril.tasks.v2.RoutePlanR\004plan\":\n\tRoutePl" +
      "an\022-\n\005route\030\001 \001(\0132\027.anduril.tasks.v2.Rou" +
      "teR\005route\":\n\005Route\0221\n\004path\030\001 \003(\0132\035.andur" +
      "il.tasks.v2.PathSegmentR\004path\"\210\001\n\013PathSe" +
      "gment\0228\n\010waypoint\030\001 \001(\0132\032.anduril.tasks." +
      "v2.WaypointH\000R\010waypoint\0222\n\006loiter\030\002 \001(\0132" +
      "\030.anduril.tasks.v2.LoiterH\000R\006loiterB\013\n\te" +
      "nd_point\"K\n\010Waypoint\0226\n\tlla_point\030\001 \001(\0132" +
      "\027.anduril.tasks.v2.PointH\000R\010llaPointB\007\n\005" +
      "point\"\214\001\n\016SetLaunchRoute\022/\n\004plan\030\001 \001(\0132\033" +
      ".anduril.tasks.v2.RoutePlanR\004plan\022I\n\rtra" +
      "cking_mode\030\002 \001(\0162$.anduril.tasks.v2.Laun" +
      "chTrackingModeR\014trackingMode*\213\001\n\022LaunchT" +
      "rackingMode\022 \n\034LAUNCH_TRACKING_MODE_INVA" +
      "LID\020\000\022\'\n#LAUNCH_TRACKING_MODE_GO_TO_WAYP" +
      "OINT\020\001\022*\n&LAUNCH_TRACKING_MODE_TRACK_TO_" +
      "WAYPOINT\020\002B\323\001\n\024com.anduril.tasks.v2B\020Man" +
      "euverPubProtoP\001ZGgithub.com/anduril/latt" +
      "ice-sdk-java/src/anduril/tasks/v2/shared" +
      ";tasksv2\242\002\003ATX\252\002\020Anduril.Tasks.V2\312\002\020Andu" +
      "ril\\Tasks\\V2\342\002\034Anduril\\Tasks\\V2\\GPBMetad" +
      "ata\352\002\022Anduril::Tasks::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.anduril.tasks.v2.ObjectivePubProto.getDescriptor(),
          com.anduril.tasks.v2.IsrPubProto.getDescriptor(),
        });
    internal_static_anduril_tasks_v2_Marshal_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_anduril_tasks_v2_Marshal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_v2_Marshal_descriptor,
        new java.lang.String[] { "Objective", });
    internal_static_anduril_tasks_v2_Transit_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_anduril_tasks_v2_Transit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_v2_Transit_descriptor,
        new java.lang.String[] { "Plan", });
    internal_static_anduril_tasks_v2_RoutePlan_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_anduril_tasks_v2_RoutePlan_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_v2_RoutePlan_descriptor,
        new java.lang.String[] { "Route", });
    internal_static_anduril_tasks_v2_Route_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_anduril_tasks_v2_Route_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_v2_Route_descriptor,
        new java.lang.String[] { "Path", });
    internal_static_anduril_tasks_v2_PathSegment_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_anduril_tasks_v2_PathSegment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_v2_PathSegment_descriptor,
        new java.lang.String[] { "Waypoint", "Loiter", "EndPoint", });
    internal_static_anduril_tasks_v2_Waypoint_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_anduril_tasks_v2_Waypoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_v2_Waypoint_descriptor,
        new java.lang.String[] { "LlaPoint", "Point", });
    internal_static_anduril_tasks_v2_SetLaunchRoute_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_anduril_tasks_v2_SetLaunchRoute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_v2_SetLaunchRoute_descriptor,
        new java.lang.String[] { "Plan", "TrackingMode", });
    com.anduril.tasks.v2.ObjectivePubProto.getDescriptor();
    com.anduril.tasks.v2.IsrPubProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}