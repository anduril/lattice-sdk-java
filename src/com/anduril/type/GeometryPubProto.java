// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/type/geometry.pub.proto

package com.anduril.type;

public final class GeometryPubProto {
  private GeometryPubProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_type_Grid_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_type_Grid_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037anduril/type/geometry.pub.proto\022\014andur" +
      "il.type\032\035anduril/type/coords.pub.proto\"\331" +
      "\001\n\004Grid\0229\n\017bottom_left_pos\030\001 \001(\0132\021.andur" +
      "il.type.LLAR\rbottomLeftPos\0225\n\rtop_right_" +
      "pos\030\002 \001(\0132\021.anduril.type.LLAR\013topRightPo" +
      "s\022\035\n\ngrid_width\030\003 \001(\rR\tgridWidth\022\037\n\013grid" +
      "_height\030\004 \001(\rR\ngridHeight\022\037\n\013cell_values" +
      "\030\005 \001(\014R\ncellValuesB\253\001\n\020com.anduril.typeB" +
      "\020GeometryPubProtoP\001Z4github.com/anduril/" +
      "lattice-sdk-java/src/anduril/type\242\002\003ATX\252" +
      "\002\014Anduril.Type\312\002\014Anduril\\Type\342\002\030Anduril\\" +
      "Type\\GPBMetadata\352\002\rAnduril::Typeb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.anduril.type.CoordsPubProto.getDescriptor(),
        });
    internal_static_anduril_type_Grid_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_anduril_type_Grid_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_type_Grid_descriptor,
        new java.lang.String[] { "BottomLeftPos", "TopRightPos", "GridWidth", "GridHeight", "CellValues", });
    com.anduril.type.CoordsPubProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
