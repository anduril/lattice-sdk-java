// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/classification.pub.proto

package com.anduril.entitymanager.v1;

public final class ClassificationPubProto {
  private ClassificationPubProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_Classification_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_Classification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_FieldClassificationInformation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_FieldClassificationInformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_ClassificationInformation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_ClassificationInformation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1anduril/entitymanager/v1/classificatio" +
      "n.pub.proto\022\030anduril.entitymanager.v1\"\267\001" +
      "\n\016Classification\022M\n\007default\030\002 \001(\01323.andu" +
      "ril.entitymanager.v1.ClassificationInfor" +
      "mationR\007default\022P\n\006fields\030\003 \003(\01328.anduri" +
      "l.entitymanager.v1.FieldClassificationIn" +
      "formationR\006fieldsJ\004\010\001\020\002\"\263\001\n\036FieldClassif" +
      "icationInformation\022\035\n\nfield_path\030\001 \001(\tR\t" +
      "fieldPath\022r\n\032classification_information\030" +
      "\002 \001(\01323.anduril.entitymanager.v1.Classif" +
      "icationInformationR\031classificationInform" +
      "ation\"{\n\031ClassificationInformation\022D\n\005le" +
      "vel\030\001 \001(\0162..anduril.entitymanager.v1.Cla" +
      "ssificationLevelsR\005level\022\030\n\007caveats\030\002 \003(" +
      "\tR\007caveats*\204\002\n\024ClassificationLevels\022!\n\035C" +
      "LASSIFICATION_LEVELS_INVALID\020\000\022&\n\"CLASSI" +
      "FICATION_LEVELS_UNCLASSIFIED\020\001\0221\n-CLASSI" +
      "FICATION_LEVELS_CONTROLLED_UNCLASSIFIED\020" +
      "\002\022&\n\"CLASSIFICATION_LEVELS_CONFIDENTIAL\020" +
      "\003\022 \n\034CLASSIFICATION_LEVELS_SECRET\020\004\022$\n C" +
      "LASSIFICATION_LEVELS_TOP_SECRET\020\005B\212\002\n\034co" +
      "m.anduril.entitymanager.v1B\026Classificati" +
      "onPubProtoP\001ZPgithub.com/anduril/lattice" +
      "-sdk-java/src/anduril/entitymanager/v1;e" +
      "ntitymanagerv1\242\002\003AEX\252\002\030Anduril.Entityman" +
      "ager.V1\312\002\030Anduril\\Entitymanager\\V1\342\002$And" +
      "uril\\Entitymanager\\V1\\GPBMetadata\352\002\032Andu" +
      "ril::Entitymanager::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_anduril_entitymanager_v1_Classification_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_anduril_entitymanager_v1_Classification_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_Classification_descriptor,
        new java.lang.String[] { "Default", "Fields", });
    internal_static_anduril_entitymanager_v1_FieldClassificationInformation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_anduril_entitymanager_v1_FieldClassificationInformation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_FieldClassificationInformation_descriptor,
        new java.lang.String[] { "FieldPath", "ClassificationInformation", });
    internal_static_anduril_entitymanager_v1_ClassificationInformation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_anduril_entitymanager_v1_ClassificationInformation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_ClassificationInformation_descriptor,
        new java.lang.String[] { "Level", "Caveats", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
