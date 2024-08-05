// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/entitymanager/v1/target_priority.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.entitymanager.v1;

public final class TargetPriorityPubProto {
  private TargetPriorityPubProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      TargetPriorityPubProto.class.getName());
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
    internal_static_anduril_entitymanager_v1_TargetPriority_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_TargetPriority_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_HighValueTarget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_HighValueTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_HighValueTargetMatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_HighValueTargetMatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_Threat_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_Threat_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2anduril/entitymanager/v1/target_priori" +
      "ty.pub.proto\022\030anduril.entitymanager.v1\032*" +
      "anduril/entitymanager/v1/options.pub.pro" +
      "to\"\246\001\n\016TargetPriority\022Z\n\021high_value_targ" +
      "et\030\001 \001(\0132).anduril.entitymanager.v1.High" +
      "ValueTargetB\003\310>\001R\017highValueTarget\0228\n\006thr" +
      "eat\030\002 \001(\0132 .anduril.entitymanager.v1.Thr" +
      "eatR\006threat\"\365\001\n\017HighValueTarget\022/\n\024is_hi" +
      "gh_value_target\030\001 \001(\010R\021isHighValueTarget" +
      "\022\'\n\017target_priority\030\002 \001(\rR\016targetPriorit" +
      "y\022U\n\016target_matches\030\003 \003(\0132..anduril.enti" +
      "tymanager.v1.HighValueTargetMatchR\rtarge" +
      "tMatches\0221\n\025is_high_payoff_target\030\004 \001(\010R" +
      "\022isHighPayoffTarget\"\230\001\n\024HighValueTargetM" +
      "atch\0228\n\031high_value_target_list_id\030\001 \001(\tR" +
      "\025highValueTargetListId\022F\n high_value_tar" +
      "get_description_id\030\002 \001(\tR\034highValueTarge" +
      "tDescriptionId\"%\n\006Threat\022\033\n\tis_threat\030\001 " +
      "\001(\010R\010isThreatB\216\002\n\034com.anduril.entitymana" +
      "ger.v1B\026TargetPriorityPubProtoP\001ZTgithub" +
      ".com/dogun-anduril/anduril-sdk-go/src/an" +
      "duril/entitymanager/v1;entitymanagerv1\242\002" +
      "\003AEX\252\002\030Anduril.Entitymanager.V1\312\002\030Anduri" +
      "l\\Entitymanager\\V1\342\002$Anduril\\Entitymanag" +
      "er\\V1\\GPBMetadata\352\002\032Anduril::Entitymanag" +
      "er::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.anduril.entitymanager.v1.OptionsPubProto.getDescriptor(),
        });
    internal_static_anduril_entitymanager_v1_TargetPriority_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_anduril_entitymanager_v1_TargetPriority_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_TargetPriority_descriptor,
        new java.lang.String[] { "HighValueTarget", "Threat", });
    internal_static_anduril_entitymanager_v1_HighValueTarget_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_anduril_entitymanager_v1_HighValueTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_HighValueTarget_descriptor,
        new java.lang.String[] { "IsHighValueTarget", "TargetPriority", "TargetMatches", "IsHighPayoffTarget", });
    internal_static_anduril_entitymanager_v1_HighValueTargetMatch_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_anduril_entitymanager_v1_HighValueTargetMatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_HighValueTargetMatch_descriptor,
        new java.lang.String[] { "HighValueTargetListId", "HighValueTargetDescriptionId", });
    internal_static_anduril_entitymanager_v1_Threat_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_anduril_entitymanager_v1_Threat_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_Threat_descriptor,
        new java.lang.String[] { "IsThreat", });
    descriptor.resolveAllFeaturesImmutable();
    com.anduril.entitymanager.v1.OptionsPubProto.getDescriptor();
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.anduril.entitymanager.v1.OptionsPubProto.overridable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
