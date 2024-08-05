// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/entityhistory/v1/history.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.entityhistory.v1;

public final class HistoryPubProto {
  private HistoryPubProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      HistoryPubProto.class.getName());
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
    internal_static_anduril_entityhistory_v1_HistoryPage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_entityhistory_v1_HistoryPage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entityhistory_v1_SnapshotPage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_entityhistory_v1_SnapshotPage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entityhistory_v1_TrailPage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_entityhistory_v1_TrailPage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entityhistory_v1_CompositePage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_entityhistory_v1_CompositePage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entityhistory_v1_Snapshot_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_entityhistory_v1_Snapshot_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entityhistory_v1_SnapshotEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_entityhistory_v1_SnapshotEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entityhistory_v1_EntityChangeEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_entityhistory_v1_EntityChangeEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entityhistory_v1_Trail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_entityhistory_v1_Trail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entityhistory_v1_TrailPoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_entityhistory_v1_TrailPoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entityhistory_v1_HistoryPageToken_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_entityhistory_v1_HistoryPageToken_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*anduril/entityhistory/v1/history.pub.p" +
      "roto\022\030anduril.entityhistory.v1\032)anduril/" +
      "entitymanager/v1/entity.pub.proto\0325andur" +
      "il/entitymanager/v1/entity_manager_api.p" +
      "ub.proto\032+anduril/entitymanager/v1/locat" +
      "ion.pub.proto\032\037google/protobuf/timestamp" +
      ".proto\"\374\001\n\013HistoryPage\022D\n\ntrail_page\030\001 \001" +
      "(\0132#.anduril.entityhistory.v1.TrailPageH" +
      "\000R\ttrailPage\022M\n\rsnapshot_page\030\002 \001(\0132&.an" +
      "duril.entityhistory.v1.SnapshotPageH\000R\014s" +
      "napshotPage\022P\n\016composite_page\030\003 \001(\0132\'.an" +
      "duril.entityhistory.v1.CompositePageH\000R\r" +
      "compositePageB\006\n\004type\"P\n\014SnapshotPage\022@\n" +
      "\tsnapshots\030\001 \003(\0132\".anduril.entityhistory" +
      ".v1.SnapshotR\tsnapshots\"D\n\tTrailPage\0227\n\006" +
      "trails\030\001 \003(\0132\037.anduril.entityhistory.v1." +
      "TrailR\006trails\"\212\001\n\rCompositePage\022@\n\tsnaps" +
      "hots\030\001 \003(\0132\".anduril.entityhistory.v1.Sn" +
      "apshotR\tsnapshots\0227\n\006trails\030\002 \003(\0132\037.andu" +
      "ril.entityhistory.v1.TrailR\006trails\"\352\001\n\010S" +
      "napshot\022C\n\014latest_state\030\001 \001(\0132 .anduril." +
      "entitymanager.v1.EntityR\013latestState\022G\n\016" +
      "original_state\030\002 \001(\0132 .anduril.entityman" +
      "ager.v1.EntityR\roriginalState\022P\n\017snapsho" +
      "t_events\030\003 \003(\0132\'.anduril.entityhistory.v" +
      "1.SnapshotEventR\016snapshotEvents\"\374\001\n\rSnap" +
      "shotEvent\0228\n\ttimestamp\030\001 \001(\0132\032.google.pr" +
      "otobuf.TimestampR\ttimestamp\022]\n\023entity_ch" +
      "ange_event\030\002 \001(\0132+.anduril.entityhistory" +
      ".v1.EntityChangeEventH\000R\021entityChangeEve" +
      "nt\022J\n\014entity_state\030\003 \001(\0132%.anduril.entit" +
      "ymanager.v1.EntityEventH\000R\013entityStateB\006" +
      "\n\004type\"{\n\021EntityChangeEvent\0224\n\004from\030\001 \001(" +
      "\0132 .anduril.entitymanager.v1.EntityR\004fro" +
      "m\0220\n\002to\030\002 \001(\0132 .anduril.entitymanager.v1" +
      ".EntityR\002to\"m\n\005Trail\022\033\n\tentity_id\030\001 \001(\tR" +
      "\010entityId\022G\n\014trail_points\030\002 \003(\0132$.anduri" +
      "l.entityhistory.v1.TrailPointR\013trailPoin" +
      "ts\"\350\001\n\nTrailPoint\0228\n\ttimestamp\030\001 \001(\0132\032.g" +
      "oogle.protobuf.TimestampR\ttimestamp\022>\n\010l" +
      "ocation\030\002 \001(\0132\".anduril.entitymanager.v1" +
      ".LocationR\010location\022`\n\024location_uncertai" +
      "nty\030\003 \001(\0132-.anduril.entitymanager.v1.Loc" +
      "ationUncertaintyR\023locationUncertainty\"\365\001" +
      "\n\020HistoryPageToken\022\031\n\010query_id\030\001 \001(\tR\007qu" +
      "eryId\022\031\n\010page_num\030\002 \001(\005R\007pageNum\022\033\n\tenti" +
      "ty_id\030\003 \001(\tR\010entityId\022N\n\016storage_system\030" +
      "\004 \001(\0162\'.anduril.entityhistory.v1.Storage" +
      "SystemR\rstorageSystem\022\035\n\nstart_time\030\005 \001(" +
      "\tR\tstartTime\022\037\n\013is_complete\030\006 \001(\010R\nisCom" +
      "plete*v\n\013HistoryType\022\030\n\024HISTORY_TYPE_INV" +
      "ALID\020\000\022\026\n\022HISTORY_TYPE_TRAIL\020\001\022\031\n\025HISTOR" +
      "Y_TYPE_SNAPSHOT\020\002\022\032\n\026HISTORY_TYPE_COMPOS" +
      "ITE\020\003*h\n\rStorageSystem\022\032\n\026STORAGE_SYSTEM" +
      "_INVALID\020\000\022\035\n\031STORAGE_SYSTEM_PERSISTENT\020" +
      "\001\022\034\n\030STORAGE_SYSTEM_EPHEMERAL\020\002B\207\002\n\034com." +
      "anduril.entityhistory.v1B\017HistoryPubProt" +
      "oP\001ZTgithub.com/dogun-anduril/anduril-sd" +
      "k-go/src/anduril/entityhistory/v1;entity" +
      "historyv1\242\002\003AEX\252\002\030Anduril.Entityhistory." +
      "V1\312\002\030Anduril\\Entityhistory\\V1\342\002$Anduril\\" +
      "Entityhistory\\V1\\GPBMetadata\352\002\032Anduril::" +
      "Entityhistory::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.anduril.entitymanager.v1.EntityPubProto.getDescriptor(),
          com.anduril.entitymanager.v1.EntityManagerApiPubProto.getDescriptor(),
          com.anduril.entitymanager.v1.LocationPubProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_anduril_entityhistory_v1_HistoryPage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_anduril_entityhistory_v1_HistoryPage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_entityhistory_v1_HistoryPage_descriptor,
        new java.lang.String[] { "TrailPage", "SnapshotPage", "CompositePage", "Type", });
    internal_static_anduril_entityhistory_v1_SnapshotPage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_anduril_entityhistory_v1_SnapshotPage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_entityhistory_v1_SnapshotPage_descriptor,
        new java.lang.String[] { "Snapshots", });
    internal_static_anduril_entityhistory_v1_TrailPage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_anduril_entityhistory_v1_TrailPage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_entityhistory_v1_TrailPage_descriptor,
        new java.lang.String[] { "Trails", });
    internal_static_anduril_entityhistory_v1_CompositePage_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_anduril_entityhistory_v1_CompositePage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_entityhistory_v1_CompositePage_descriptor,
        new java.lang.String[] { "Snapshots", "Trails", });
    internal_static_anduril_entityhistory_v1_Snapshot_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_anduril_entityhistory_v1_Snapshot_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_entityhistory_v1_Snapshot_descriptor,
        new java.lang.String[] { "LatestState", "OriginalState", "SnapshotEvents", });
    internal_static_anduril_entityhistory_v1_SnapshotEvent_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_anduril_entityhistory_v1_SnapshotEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_entityhistory_v1_SnapshotEvent_descriptor,
        new java.lang.String[] { "Timestamp", "EntityChangeEvent", "EntityState", "Type", });
    internal_static_anduril_entityhistory_v1_EntityChangeEvent_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_anduril_entityhistory_v1_EntityChangeEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_entityhistory_v1_EntityChangeEvent_descriptor,
        new java.lang.String[] { "From", "To", });
    internal_static_anduril_entityhistory_v1_Trail_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_anduril_entityhistory_v1_Trail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_entityhistory_v1_Trail_descriptor,
        new java.lang.String[] { "EntityId", "TrailPoints", });
    internal_static_anduril_entityhistory_v1_TrailPoint_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_anduril_entityhistory_v1_TrailPoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_entityhistory_v1_TrailPoint_descriptor,
        new java.lang.String[] { "Timestamp", "Location", "LocationUncertainty", });
    internal_static_anduril_entityhistory_v1_HistoryPageToken_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_anduril_entityhistory_v1_HistoryPageToken_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_entityhistory_v1_HistoryPageToken_descriptor,
        new java.lang.String[] { "QueryId", "PageNum", "EntityId", "StorageSystem", "StartTime", "IsComplete", });
    descriptor.resolveAllFeaturesImmutable();
    com.anduril.entitymanager.v1.EntityPubProto.getDescriptor();
    com.anduril.entitymanager.v1.EntityManagerApiPubProto.getDescriptor();
    com.anduril.entitymanager.v1.LocationPubProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
