// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/filter.pub.proto

package com.anduril.entitymanager.v1;

public final class FilterPubProto {
  private FilterPubProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_Statement_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_Statement_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_AndOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_AndOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_OrOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_OrOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_NotOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_NotOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_ListOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_ListOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_PredicateSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_PredicateSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_StatementSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_StatementSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_Predicate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_Predicate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_Value_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_Value_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_BooleanType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_BooleanType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_NumericType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_NumericType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_StringType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_StringType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_EnumType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_EnumType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_ListType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_ListType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_TimestampType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_TimestampType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_PositionType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_PositionType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_BoundedShapeType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_BoundedShapeType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_HeadingType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_HeadingType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_RangeType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_RangeType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)anduril/entitymanager/v1/filter.pub.pr" +
      "oto\022\030anduril.entitymanager.v1\032,anduril/e" +
      "ntitymanager/v1/geoentity.pub.proto\032+and" +
      "uril/entitymanager/v1/location.pub.proto" +
      "\032\037google/protobuf/timestamp.proto\"\315\002\n\tSt" +
      "atement\022:\n\003and\030\001 \001(\0132&.anduril.entityman" +
      "ager.v1.AndOperationH\000R\003and\0227\n\002or\030\002 \001(\0132" +
      "%.anduril.entitymanager.v1.OrOperationH\000" +
      "R\002or\022:\n\003not\030\003 \001(\0132&.anduril.entitymanage" +
      "r.v1.NotOperationH\000R\003not\022=\n\004list\030\004 \001(\0132\'" +
      ".anduril.entitymanager.v1.ListOperationH" +
      "\000R\004list\022C\n\tpredicate\030\005 \001(\0132#.anduril.ent" +
      "itymanager.v1.PredicateH\000R\tpredicateB\013\n\t" +
      "operation\"\270\001\n\014AndOperation\022M\n\rpredicate_" +
      "set\030\001 \001(\0132&.anduril.entitymanager.v1.Pre" +
      "dicateSetH\000R\014predicateSet\022M\n\rstatement_s" +
      "et\030\002 \001(\0132&.anduril.entitymanager.v1.Stat" +
      "ementSetH\000R\014statementSetB\n\n\010children\"\267\001\n" +
      "\013OrOperation\022M\n\rpredicate_set\030\001 \001(\0132&.an" +
      "duril.entitymanager.v1.PredicateSetH\000R\014p" +
      "redicateSet\022M\n\rstatement_set\030\002 \001(\0132&.and" +
      "uril.entitymanager.v1.StatementSetH\000R\014st" +
      "atementSetB\n\n\010children\"\241\001\n\014NotOperation\022" +
      "C\n\tpredicate\030\001 \001(\0132#.anduril.entitymanag" +
      "er.v1.PredicateH\000R\tpredicate\022C\n\tstatemen" +
      "t\030\002 \001(\0132#.anduril.entitymanager.v1.State" +
      "mentH\000R\tstatementB\007\n\005child\"\302\001\n\rListOpera" +
      "tion\022\033\n\tlist_path\030\001 \001(\tR\010listPath\022Q\n\017lis" +
      "t_comparator\030\002 \001(\0162(.anduril.entitymanag" +
      "er.v1.ListComparatorR\016listComparator\022A\n\t" +
      "statement\030\003 \001(\0132#.anduril.entitymanager." +
      "v1.StatementR\tstatement\"S\n\014PredicateSet\022" +
      "C\n\npredicates\030\001 \003(\0132#.anduril.entitymana" +
      "ger.v1.PredicateR\npredicates\"S\n\014Statemen" +
      "tSet\022C\n\nstatements\030\001 \003(\0132#.anduril.entit" +
      "ymanager.v1.StatementR\nstatements\"\247\001\n\tPr" +
      "edicate\022\035\n\nfield_path\030\001 \001(\tR\tfieldPath\0225" +
      "\n\005value\030\002 \001(\0132\037.anduril.entitymanager.v1" +
      ".ValueR\005value\022D\n\ncomparator\030\003 \001(\0162$.andu" +
      "ril.entitymanager.v1.ComparatorR\ncompara" +
      "tor\"\205\006\n\005Value\022J\n\014boolean_type\030\001 \001(\0132%.an" +
      "duril.entitymanager.v1.BooleanTypeH\000R\013bo" +
      "oleanType\022J\n\014numeric_type\030\002 \001(\0132%.anduri" +
      "l.entitymanager.v1.NumericTypeH\000R\013numeri" +
      "cType\022G\n\013string_type\030\003 \001(\0132$.anduril.ent" +
      "itymanager.v1.StringTypeH\000R\nstringType\022A" +
      "\n\tenum_type\030\004 \001(\0132\".anduril.entitymanage" +
      "r.v1.EnumTypeH\000R\010enumType\022P\n\016timestamp_t" +
      "ype\030\005 \001(\0132\'.anduril.entitymanager.v1.Tim" +
      "estampTypeH\000R\rtimestampType\022Z\n\022bounded_s" +
      "hape_type\030\006 \001(\0132*.anduril.entitymanager." +
      "v1.BoundedShapeTypeH\000R\020boundedShapeType\022" +
      "M\n\rposition_type\030\007 \001(\0132&.anduril.entitym" +
      "anager.v1.PositionTypeH\000R\014positionType\022J" +
      "\n\014heading_type\030\010 \001(\0132%.anduril.entityman" +
      "ager.v1.HeadingTypeH\000R\013headingType\022A\n\tli" +
      "st_type\030\t \001(\0132\".anduril.entitymanager.v1" +
      ".ListTypeH\000R\010listType\022D\n\nrange_type\030\n \001(" +
      "\0132#.anduril.entitymanager.v1.RangeTypeH\000" +
      "R\trangeTypeB\006\n\004type\"#\n\013BooleanType\022\024\n\005va" +
      "lue\030\001 \001(\010R\005value\"\356\001\n\013NumericType\022#\n\014doub" +
      "le_value\030\001 \001(\001H\000R\013doubleValue\022!\n\013float_v" +
      "alue\030\002 \001(\002H\000R\nfloatValue\022!\n\013int32_value\030" +
      "\003 \001(\005H\000R\nint32Value\022!\n\013int64_value\030\004 \001(\003" +
      "H\000R\nint64Value\022#\n\014uint32_value\030\005 \001(\rH\000R\013" +
      "uint32Value\022#\n\014uint64_value\030\006 \001(\004H\000R\013uin" +
      "t64ValueB\007\n\005value\"\"\n\nStringType\022\024\n\005value" +
      "\030\001 \001(\tR\005value\" \n\010EnumType\022\024\n\005value\030\001 \001(\005" +
      "R\005value\"C\n\010ListType\0227\n\006values\030\001 \003(\0132\037.an" +
      "duril.entitymanager.v1.ValueR\006values\"A\n\r" +
      "TimestampType\0220\n\005value\030\001 \001(\0132\032.google.pr" +
      "otobuf.TimestampR\005value\"H\n\014PositionType\022" +
      "8\n\005value\030\001 \001(\0132\".anduril.entitymanager.v" +
      "1.PositionR\005value\"h\n\020BoundedShapeType\022K\n" +
      "\rpolygon_value\030\001 \001(\0132$.anduril.entityman" +
      "ager.v1.GeoPolygonH\000R\014polygonValueB\007\n\005va" +
      "lue\"#\n\013HeadingType\022\024\n\005value\030\001 \001(\005R\005value" +
      "\"\201\001\n\tRangeType\022;\n\005start\030\001 \001(\0132%.anduril." +
      "entitymanager.v1.NumericTypeR\005start\0227\n\003e" +
      "nd\030\002 \001(\0132%.anduril.entitymanager.v1.Nume" +
      "ricTypeR\003end*\214\003\n\nComparator\022\026\n\022COMPARATO" +
      "R_INVALID\020\000\022\030\n\024COMPARATOR_MATCH_ALL\020\013\022\027\n" +
      "\023COMPARATOR_EQUALITY\020\001\022\021\n\rCOMPARATOR_IN\020" +
      "\t\022\030\n\024COMPARATOR_LESS_THAN\020\002\022\033\n\027COMPARATO" +
      "R_GREATER_THAN\020\003\022!\n\035COMPARATOR_LESS_THAN" +
      "_EQUAL_TO\020\004\022$\n COMPARATOR_GREATER_THAN_E" +
      "QUAL_TO\020\005\022\025\n\021COMPARATOR_WITHIN\020\006\022\025\n\021COMP" +
      "ARATOR_EXISTS\020\007\022(\n$COMPARATOR_CASE_INSEN" +
      "SITIVE_EQUALITY\020\010\022+\n\'COMPARATOR_CASE_INS" +
      "ENSITIVE_EQUALITY_IN\020\n\022\033\n\027COMPARATOR_RAN" +
      "GE_CLOSED\020\014*I\n\016ListComparator\022\033\n\027LIST_CO" +
      "MPARATOR_INVALID\020\000\022\032\n\026LIST_COMPARATOR_AN" +
      "Y_OF\020\001B\202\002\n\034com.anduril.entitymanager.v1B" +
      "\016FilterPubProtoP\001ZPgithub.com/anduril/la" +
      "ttice-sdk-java/src/anduril/entitymanager" +
      "/v1;entitymanagerv1\242\002\003AEX\252\002\030Anduril.Enti" +
      "tymanager.V1\312\002\030Anduril\\Entitymanager\\V1\342" +
      "\002$Anduril\\Entitymanager\\V1\\GPBMetadata\352\002" +
      "\032Anduril::Entitymanager::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.anduril.entitymanager.v1.GeoentityPubProto.getDescriptor(),
          com.anduril.entitymanager.v1.LocationPubProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_anduril_entitymanager_v1_Statement_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_anduril_entitymanager_v1_Statement_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_Statement_descriptor,
        new java.lang.String[] { "And", "Or", "Not", "List", "Predicate", "Operation", });
    internal_static_anduril_entitymanager_v1_AndOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_anduril_entitymanager_v1_AndOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_AndOperation_descriptor,
        new java.lang.String[] { "PredicateSet", "StatementSet", "Children", });
    internal_static_anduril_entitymanager_v1_OrOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_anduril_entitymanager_v1_OrOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_OrOperation_descriptor,
        new java.lang.String[] { "PredicateSet", "StatementSet", "Children", });
    internal_static_anduril_entitymanager_v1_NotOperation_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_anduril_entitymanager_v1_NotOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_NotOperation_descriptor,
        new java.lang.String[] { "Predicate", "Statement", "Child", });
    internal_static_anduril_entitymanager_v1_ListOperation_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_anduril_entitymanager_v1_ListOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_ListOperation_descriptor,
        new java.lang.String[] { "ListPath", "ListComparator", "Statement", });
    internal_static_anduril_entitymanager_v1_PredicateSet_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_anduril_entitymanager_v1_PredicateSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_PredicateSet_descriptor,
        new java.lang.String[] { "Predicates", });
    internal_static_anduril_entitymanager_v1_StatementSet_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_anduril_entitymanager_v1_StatementSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_StatementSet_descriptor,
        new java.lang.String[] { "Statements", });
    internal_static_anduril_entitymanager_v1_Predicate_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_anduril_entitymanager_v1_Predicate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_Predicate_descriptor,
        new java.lang.String[] { "FieldPath", "Value", "Comparator", });
    internal_static_anduril_entitymanager_v1_Value_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_anduril_entitymanager_v1_Value_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_Value_descriptor,
        new java.lang.String[] { "BooleanType", "NumericType", "StringType", "EnumType", "TimestampType", "BoundedShapeType", "PositionType", "HeadingType", "ListType", "RangeType", "Type", });
    internal_static_anduril_entitymanager_v1_BooleanType_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_anduril_entitymanager_v1_BooleanType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_BooleanType_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_anduril_entitymanager_v1_NumericType_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_anduril_entitymanager_v1_NumericType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_NumericType_descriptor,
        new java.lang.String[] { "DoubleValue", "FloatValue", "Int32Value", "Int64Value", "Uint32Value", "Uint64Value", "Value", });
    internal_static_anduril_entitymanager_v1_StringType_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_anduril_entitymanager_v1_StringType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_StringType_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_anduril_entitymanager_v1_EnumType_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_anduril_entitymanager_v1_EnumType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_EnumType_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_anduril_entitymanager_v1_ListType_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_anduril_entitymanager_v1_ListType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_ListType_descriptor,
        new java.lang.String[] { "Values", });
    internal_static_anduril_entitymanager_v1_TimestampType_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_anduril_entitymanager_v1_TimestampType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_TimestampType_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_anduril_entitymanager_v1_PositionType_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_anduril_entitymanager_v1_PositionType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_PositionType_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_anduril_entitymanager_v1_BoundedShapeType_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_anduril_entitymanager_v1_BoundedShapeType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_BoundedShapeType_descriptor,
        new java.lang.String[] { "PolygonValue", "Value", });
    internal_static_anduril_entitymanager_v1_HeadingType_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_anduril_entitymanager_v1_HeadingType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_HeadingType_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_anduril_entitymanager_v1_RangeType_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_anduril_entitymanager_v1_RangeType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_RangeType_descriptor,
        new java.lang.String[] { "Start", "End", });
    com.anduril.entitymanager.v1.GeoentityPubProto.getDescriptor();
    com.anduril.entitymanager.v1.LocationPubProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
