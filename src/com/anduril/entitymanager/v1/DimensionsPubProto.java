// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/entitymanager/v1/dimensions.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.entitymanager.v1;

public final class DimensionsPubProto {
  private DimensionsPubProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      DimensionsPubProto.class.getName());
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
    internal_static_anduril_entitymanager_v1_Dimensions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_Dimensions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-anduril/entitymanager/v1/dimensions.pu" +
      "b.proto\022\030anduril.entitymanager.v1\"\'\n\nDim" +
      "ensions\022\031\n\010length_m\030\001 \001(\002R\007lengthMB\212\002\n\034c" +
      "om.anduril.entitymanager.v1B\022DimensionsP" +
      "ubProtoP\001ZTgithub.com/dogun-anduril/andu" +
      "ril-sdk-go/src/anduril/entitymanager/v1;" +
      "entitymanagerv1\242\002\003AEX\252\002\030Anduril.Entityma" +
      "nager.V1\312\002\030Anduril\\Entitymanager\\V1\342\002$An" +
      "duril\\Entitymanager\\V1\\GPBMetadata\352\002\032And" +
      "uril::Entitymanager::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_anduril_entitymanager_v1_Dimensions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_anduril_entitymanager_v1_Dimensions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_Dimensions_descriptor,
        new java.lang.String[] { "LengthM", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
