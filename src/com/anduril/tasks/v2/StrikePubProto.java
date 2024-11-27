// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/shared/strike.pub.proto

package com.anduril.tasks.v2;

public final class StrikePubProto {
  private StrikePubProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_v2_Smack_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_v2_Smack_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_v2_Strike_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_v2_Strike_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_v2_StrikeReleaseConstraint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_v2_StrikeReleaseConstraint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_v2_StrikeParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_v2_StrikeParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_v2_PayloadConfiguration_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_v2_PayloadConfiguration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_v2_ReleasePayload_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_v2_ReleasePayload_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(anduril/tasks/v2/shared/strike.pub.pro" +
      "to\022\020anduril.tasks.v2\032!anduril/tasks/v2/c" +
      "ommon.pub.proto\032$anduril/tasks/v2/object" +
      "ive.pub.proto\032\036google/protobuf/duration." +
      "proto\032\033google/protobuf/empty.proto\"\206\001\n\005S" +
      "mack\0229\n\tobjective\030\001 \001(\0132\033.anduril.tasks." +
      "v2.ObjectiveR\tobjective\022B\n\nparameters\030\002 " +
      "\001(\0132\".anduril.tasks.v2.StrikeParametersR" +
      "\nparameters\"\260\002\n\006Strike\0229\n\tobjective\030\001 \001(" +
      "\0132\033.anduril.tasks.v2.ObjectiveR\tobjectiv" +
      "e\022@\n\ringress_angle\030\002 \001(\0132\033.anduril.tasks" +
      ".v2.AnglePairR\014ingressAngle\022e\n\031strike_re" +
      "lease_constraint\030\003 \001(\0132).anduril.tasks.v" +
      "2.StrikeReleaseConstraintR\027strikeRelease" +
      "Constraint\022B\n\nparameters\030\004 \001(\0132\".anduril" +
      ".tasks.v2.StrikeParametersR\nparameters\"~" +
      "\n\027StrikeReleaseConstraint\022F\n\014release_are" +
      "a\030\001 \001(\0132!.anduril.tasks.v2.AreaConstrain" +
      "tsH\000R\013releaseAreaB\033\n\031strike_release_cons" +
      "traint\"\205\002\n\020StrikeParameters\022T\n\022payloads_" +
      "to_employ\030\001 \003(\0132&.anduril.tasks.v2.Paylo" +
      "adConfigurationR\020payloadsToEmploy\022I\n\023des" +
      "ired_impact_time\030\002 \001(\0132\031.google.protobuf" +
      ".DurationR\021desiredImpactTime\022$\n\016run_in_b" +
      "earing\030\003 \001(\001R\014runInBearing\022*\n\021glide_slop" +
      "e_angle\030\004 \001(\001R\017glideSlopeAngle\"W\n\024Payloa" +
      "dConfiguration\022#\n\rcapability_id\030\001 \001(\tR\014c" +
      "apabilityId\022\032\n\010quantity\030\002 \001(\rR\010quantity\"" +
      "\350\001\n\016ReleasePayload\022B\n\010payloads\030\001 \003(\0132&.a" +
      "nduril.tasks.v2.PayloadConfigurationR\010pa" +
      "yloads\0229\n\tobjective\030\002 \001(\0132\033.anduril.task" +
      "s.v2.ObjectiveR\tobjective\022E\n\021precision_r" +
      "elease\030\003 \001(\0132\026.google.protobuf.EmptyH\000R\020" +
      "precisionReleaseB\020\n\016release_methodB\321\001\n\024c" +
      "om.anduril.tasks.v2B\016StrikePubProtoP\001ZGg" +
      "ithub.com/anduril/lattice-sdk-java/src/a" +
      "nduril/tasks/v2/shared;tasksv2\242\002\003ATX\252\002\020A" +
      "nduril.Tasks.V2\312\002\020Anduril\\Tasks\\V2\342\002\034And" +
      "uril\\Tasks\\V2\\GPBMetadata\352\002\022Anduril::Tas" +
      "ks::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.anduril.tasks.v2.CommonPubProto.getDescriptor(),
          com.anduril.tasks.v2.ObjectivePubProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_anduril_tasks_v2_Smack_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_anduril_tasks_v2_Smack_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_v2_Smack_descriptor,
        new java.lang.String[] { "Objective", "Parameters", });
    internal_static_anduril_tasks_v2_Strike_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_anduril_tasks_v2_Strike_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_v2_Strike_descriptor,
        new java.lang.String[] { "Objective", "IngressAngle", "StrikeReleaseConstraint", "Parameters", });
    internal_static_anduril_tasks_v2_StrikeReleaseConstraint_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_anduril_tasks_v2_StrikeReleaseConstraint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_v2_StrikeReleaseConstraint_descriptor,
        new java.lang.String[] { "ReleaseArea", "StrikeReleaseConstraint", });
    internal_static_anduril_tasks_v2_StrikeParameters_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_anduril_tasks_v2_StrikeParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_v2_StrikeParameters_descriptor,
        new java.lang.String[] { "PayloadsToEmploy", "DesiredImpactTime", "RunInBearing", "GlideSlopeAngle", });
    internal_static_anduril_tasks_v2_PayloadConfiguration_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_anduril_tasks_v2_PayloadConfiguration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_v2_PayloadConfiguration_descriptor,
        new java.lang.String[] { "CapabilityId", "Quantity", });
    internal_static_anduril_tasks_v2_ReleasePayload_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_anduril_tasks_v2_ReleasePayload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_v2_ReleasePayload_descriptor,
        new java.lang.String[] { "Payloads", "Objective", "PrecisionRelease", "ReleaseMethod", });
    com.anduril.tasks.v2.CommonPubProto.getDescriptor();
    com.anduril.tasks.v2.ObjectivePubProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}