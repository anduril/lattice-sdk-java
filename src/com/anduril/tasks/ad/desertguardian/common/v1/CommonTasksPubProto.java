// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/ad/desertguardian/common/v1/common_tasks.pub.proto

package com.anduril.tasks.ad.desertguardian.common.v1;

public final class CommonTasksPubProto {
  private CommonTasksPubProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_ad_desertguardian_common_v1_SetPowerState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_ad_desertguardian_common_v1_SetPowerState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_ad_desertguardian_common_v1_DeleteTrack_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_ad_desertguardian_common_v1_DeleteTrack_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_ad_desertguardian_common_v1_SetHighPriorityTrack_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_ad_desertguardian_common_v1_SetHighPriorityTrack_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_tasks_ad_desertguardian_common_v1_RemoveHighPriorityTrack_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_tasks_ad_desertguardian_common_v1_RemoveHighPriorityTrack_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@anduril/tasks/ad/desertguardian/common" +
      "/v1/common_tasks.pub.proto\022)anduril.task" +
      "s.ad.desertguardian.common.v1\"g\n\rSetPowe" +
      "rState\022V\n\013power_state\030\001 \001(\01625.anduril.ta" +
      "sks.ad.desertguardian.common.v1.PowerSta" +
      "teR\npowerState\"*\n\013DeleteTrack\022\033\n\tentity_" +
      "id\030\001 \001(\tR\010entityId\"3\n\024SetHighPriorityTra" +
      "ck\022\033\n\tentity_id\030\001 \001(\tR\010entityId\"6\n\027Remov" +
      "eHighPriorityTrack\022\033\n\tentity_id\030\001 \001(\tR\010e" +
      "ntityId*N\n\nPowerState\022\027\n\023POWER_STATE_INV" +
      "ALID\020\000\022\022\n\016POWER_STATE_ON\020\001\022\023\n\017POWER_STAT" +
      "E_OFF\020\002B\353\002\n-com.anduril.tasks.ad.desertg" +
      "uardian.common.v1B\023CommonTasksPubProtoP\001" +
      "ZZgithub.com/anduril/lattice-sdk-java/sr" +
      "c/anduril/tasks/ad/desertguardian/common" +
      "/v1;commonv1\242\002\005ATADC\252\002)Anduril.Tasks.Ad." +
      "Desertguardian.Common.V1\312\002)Anduril\\Tasks" +
      "\\Ad\\Desertguardian\\Common\\V1\342\0025Anduril\\T" +
      "asks\\Ad\\Desertguardian\\Common\\V1\\GPBMeta" +
      "data\352\002.Anduril::Tasks::Ad::Desertguardia" +
      "n::Common::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_anduril_tasks_ad_desertguardian_common_v1_SetPowerState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_anduril_tasks_ad_desertguardian_common_v1_SetPowerState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_ad_desertguardian_common_v1_SetPowerState_descriptor,
        new java.lang.String[] { "PowerState", });
    internal_static_anduril_tasks_ad_desertguardian_common_v1_DeleteTrack_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_anduril_tasks_ad_desertguardian_common_v1_DeleteTrack_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_ad_desertguardian_common_v1_DeleteTrack_descriptor,
        new java.lang.String[] { "EntityId", });
    internal_static_anduril_tasks_ad_desertguardian_common_v1_SetHighPriorityTrack_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_anduril_tasks_ad_desertguardian_common_v1_SetHighPriorityTrack_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_ad_desertguardian_common_v1_SetHighPriorityTrack_descriptor,
        new java.lang.String[] { "EntityId", });
    internal_static_anduril_tasks_ad_desertguardian_common_v1_RemoveHighPriorityTrack_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_anduril_tasks_ad_desertguardian_common_v1_RemoveHighPriorityTrack_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_tasks_ad_desertguardian_common_v1_RemoveHighPriorityTrack_descriptor,
        new java.lang.String[] { "EntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
