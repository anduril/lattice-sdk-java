// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/blobs/v1/common.pub.proto

package com.anduril.blobs.v1;

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
    internal_static_anduril_blobs_v1_BlobMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_blobs_v1_BlobMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_blobs_v1_BlobProvenance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_blobs_v1_BlobProvenance_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!anduril/blobs/v1/common.pub.proto\022\020and" +
      "uril.blobs.v1\032\037google/protobuf/timestamp" +
      ".proto\"\246\002\n\014BlobMetadata\022=\n\014created_time\030" +
      "\001 \001(\0132\032.google.protobuf.TimestampR\013creat" +
      "edTime\022A\n\016retention_time\030\002 \001(\0132\032.google." +
      "protobuf.TimestampR\rretentionTime\022\035\n\nsiz" +
      "e_bytes\030\003 \001(\004R\tsizeBytes\022\020\n\003md5\030\004 \001(\014R\003m" +
      "d5\022!\n\014content_type\030\005 \001(\tR\013contentType\022@\n" +
      "\nprovenance\030\006 \001(\0132 .anduril.blobs.v1.Blo" +
      "bProvenanceR\nprovenance\"X\n\016BlobProvenanc" +
      "e\022)\n\020integration_name\030\001 \001(\tR\017integration" +
      "Name\022\033\n\tdata_type\030\002 \001(\tR\010dataTypeB\306\001\n\024co" +
      "m.anduril.blobs.v1B\016CommonPubProtoP\001Z<gi" +
      "thub.com/anduril/anduril-java/src/anduri" +
      "l/blobs/v1;blobsv1\242\002\003ABX\252\002\020Anduril.Blobs" +
      ".V1\312\002\020Anduril\\Blobs\\V1\342\002\034Anduril\\Blobs\\V" +
      "1\\GPBMetadata\352\002\022Anduril::Blobs::V1b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_anduril_blobs_v1_BlobMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_anduril_blobs_v1_BlobMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_blobs_v1_BlobMetadata_descriptor,
        new java.lang.String[] { "CreatedTime", "RetentionTime", "SizeBytes", "Md5", "ContentType", "Provenance", });
    internal_static_anduril_blobs_v1_BlobProvenance_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_anduril_blobs_v1_BlobProvenance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_blobs_v1_BlobProvenance_descriptor,
        new java.lang.String[] { "IntegrationName", "DataType", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
