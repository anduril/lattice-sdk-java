// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/entitymanager/v1/media.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.entitymanager.v1;

public final class MediaPubProto {
  private MediaPubProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      MediaPubProto.class.getName());
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
    internal_static_anduril_entitymanager_v1_Media_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_Media_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_MediaItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_MediaItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(anduril/entitymanager/v1/media.pub.pro" +
      "to\022\030anduril.entitymanager.v1\032*anduril/en" +
      "titymanager/v1/options.pub.proto\"G\n\005Medi" +
      "a\022>\n\005media\030\001 \003(\0132#.anduril.entitymanager" +
      ".v1.MediaItemB\003\310>\001R\005media\"{\n\tMediaItem\022\020" +
      "\n\003url\030\001 \001(\tR\003url\0227\n\004type\030\002 \001(\0162#.anduril" +
      ".entitymanager.v1.MediaTypeR\004type\022#\n\rrel" +
      "ative_path\030\003 \001(\tR\014relativePath*\206\001\n\tMedia" +
      "Type\022\026\n\022MEDIA_TYPE_INVALID\020\000\022\030\n\024MEDIA_TY" +
      "PE_THUMBNAIL\020\001\022\024\n\020MEDIA_TYPE_IMAGE\020\002\022\024\n\020" +
      "MEDIA_TYPE_VIDEO\020\003\022\033\n\027MEDIA_TYPE_SLIPPY_" +
      "TILES\020\004B\376\001\n\034com.anduril.entitymanager.v1" +
      "B\rMediaPubProtoP\001ZMghe.anduril.dev/andur" +
      "il/andurilapis-go/anduril/entitymanager/" +
      "v1;entitymanager\242\002\003AEX\252\002\030Anduril.Entitym" +
      "anager.V1\312\002\030Anduril\\Entitymanager\\V1\342\002$A" +
      "nduril\\Entitymanager\\V1\\GPBMetadata\352\002\032An" +
      "duril::Entitymanager::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.anduril.entitymanager.v1.OptionsPubProto.getDescriptor(),
        });
    internal_static_anduril_entitymanager_v1_Media_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_anduril_entitymanager_v1_Media_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_Media_descriptor,
        new java.lang.String[] { "Media", });
    internal_static_anduril_entitymanager_v1_MediaItem_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_anduril_entitymanager_v1_MediaItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_MediaItem_descriptor,
        new java.lang.String[] { "Url", "Type", "RelativePath", });
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
