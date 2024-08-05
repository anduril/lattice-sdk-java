// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/communicationsmanager/v1/integration.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.communicationsmanager.v1;

public final class IntegrationPubProto {
  private IntegrationPubProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      IntegrationPubProto.class.getName());
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
    internal_static_anduril_communicationsmanager_v1_RegisterIntegrationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_communicationsmanager_v1_RegisterIntegrationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_communicationsmanager_v1_RegisteredIntegration_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_communicationsmanager_v1_RegisteredIntegration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_communicationsmanager_v1_IntegrationDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_communicationsmanager_v1_IntegrationDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_communicationsmanager_v1_DeregisterIntegrationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_communicationsmanager_v1_DeregisterIntegrationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_communicationsmanager_v1_DeregisterIntegrationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_communicationsmanager_v1_DeregisterIntegrationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_communicationsmanager_v1_GetIntegrationsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_communicationsmanager_v1_GetIntegrationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_communicationsmanager_v1_GetIntegrationsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_communicationsmanager_v1_GetIntegrationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_communicationsmanager_v1_AllNodes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_communicationsmanager_v1_AllNodes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_communicationsmanager_v1_LocalNode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_communicationsmanager_v1_LocalNode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_communicationsmanager_v1_StreamIntegrationsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_communicationsmanager_v1_StreamIntegrationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_communicationsmanager_v1_IntegrationEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_communicationsmanager_v1_IntegrationEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_communicationsmanager_v1_StreamIntegrationsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_communicationsmanager_v1_StreamIntegrationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_communicationsmanager_v1_IntegrationHealthUpdateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_communicationsmanager_v1_IntegrationHealthUpdateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_communicationsmanager_v1_IntegrationHealthUpdateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_communicationsmanager_v1_IntegrationHealthUpdateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_communicationsmanager_v1_IntegrationHealthState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_communicationsmanager_v1_IntegrationHealthState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6anduril/communicationsmanager/v1/integ" +
      "ration.pub.proto\022 anduril.communications" +
      "manager.v1\0320anduril/communicationsmanage" +
      "r/v1/blobs.pub.proto\0321anduril/communicat" +
      "ionsmanager/v1/common.pub.proto\0321anduril" +
      "/communicationsmanager/v1/entity.pub.pro" +
      "to\032\037google/protobuf/timestamp.proto\"\227\001\n\032" +
      "RegisterIntegrationRequest\022)\n\020integratio" +
      "n_name\030\001 \001(\tR\017integrationName\022N\n\007details" +
      "\030\002 \001(\01324.anduril.communicationsmanager.v" +
      "1.IntegrationDetailsR\007details\"\300\002\n\025Regist" +
      "eredIntegration\022)\n\020integration_name\030\001 \001(" +
      "\tR\017integrationName\022\027\n\007node_id\030\002 \001(\tR\006nod" +
      "eId\022\037\n\013version_num\030\004 \001(\003R\nversionNum\022e\n\023" +
      "integration_details\030\003 \001(\01324.anduril.comm" +
      "unicationsmanager.v1.IntegrationDetailsR" +
      "\022integrationDetails\022[\n\014health_state\030\005 \001(" +
      "\01328.anduril.communicationsmanager.v1.Int" +
      "egrationHealthStateR\013healthState\"\325\001\n\022Int" +
      "egrationDetails\022a\n\016entity_details\030\001 \001(\0132" +
      ":.anduril.communicationsmanager.v1.Entit" +
      "yIntegrationDetailsR\rentityDetails\022\\\n\014bl" +
      "ob_details\030\002 \001(\01329.anduril.communication" +
      "smanager.v1.BlobsIntegrationDetailsR\013blo" +
      "bDetails\"h\n\034DeregisterIntegrationRequest" +
      "\022)\n\020integration_name\030\001 \001(\tR\017integrationN" +
      "ame\022\027\n\007node_id\030\002 \001(\tR\006nodeIdJ\004\010\003\020\004\"\037\n\035De" +
      "registerIntegrationResponse\".\n\026GetIntegr" +
      "ationsRequest\022\024\n\005nodes\030\001 \003(\tR\005nodes\"t\n\027G" +
      "etIntegrationsResponse\022Y\n\013integration\030\001 " +
      "\003(\01327.anduril.communicationsmanager.v1.R" +
      "egisteredIntegrationR\013integration\"\n\n\010All" +
      "Nodes\"\013\n\tLocalNode\"\357\001\n\031StreamIntegration" +
      "sRequest\022I\n\tall_nodes\030\001 \001(\0132*.anduril.co" +
      "mmunicationsmanager.v1.AllNodesH\000R\010allNo" +
      "des\022L\n\nlocal_node\030\002 \001(\0132+.anduril.commun" +
      "icationsmanager.v1.LocalNodeH\000R\tlocalNod" +
      "e\022)\n\020preexisting_only\030\003 \001(\010R\017preexisting" +
      "OnlyB\016\n\014owner_filter\"\351\001\n\020IntegrationEven" +
      "t\022J\n\nevent_type\030\001 \001(\0162+.anduril.communic" +
      "ationsmanager.v1.EventTypeR\teventType\022.\n" +
      "\004time\030\002 \001(\0132\032.google.protobuf.TimestampR" +
      "\004time\022Y\n\013integration\030\003 \001(\01327.anduril.com" +
      "municationsmanager.v1.RegisteredIntegrat" +
      "ionR\013integration\"}\n\032StreamIntegrationsRe" +
      "sponse\022_\n\021integration_event\030\001 \001(\01322.andu" +
      "ril.communicationsmanager.v1.Integration" +
      "EventR\020integrationEvent\"\250\001\n\036IntegrationH" +
      "ealthUpdateRequest\022)\n\020integration_name\030\001" +
      " \001(\tR\017integrationName\022[\n\014health_state\030\002 " +
      "\001(\01328.anduril.communicationsmanager.v1.I" +
      "ntegrationHealthStateR\013healthState\"!\n\037In" +
      "tegrationHealthUpdateResponse\"\232\001\n\026Integr" +
      "ationHealthState\022^\n\rhealth_status\030\001 \001(\0162" +
      "9.anduril.communicationsmanager.v1.Integ" +
      "rationHealthStatusR\014healthStatus\022 \n\013desc" +
      "ription\030\002 \001(\tR\013description*\267\001\n\027Integrati" +
      "onHealthStatus\022%\n!INTEGRATION_HEALTH_STA" +
      "TUS_INVALID\020\000\022%\n!INTEGRATION_HEALTH_STAT" +
      "US_UNKNOWN\020\001\022%\n!INTEGRATION_HEALTH_STATU" +
      "S_HEALTHY\020\002\022\'\n#INTEGRATION_HEALTH_STATUS" +
      "_UNHEALTHY\020\003B\246\002\n$com.anduril.communicati" +
      "onsmanager.v1B\023IntegrationPubProtoP\001ZGgh" +
      "e.anduril.dev/anduril/andurilapis-go/and" +
      "uril/communicationsmanager/v1\242\002\003ACX\252\002 An" +
      "duril.Communicationsmanager.V1\312\002 Anduril" +
      "\\Communicationsmanager\\V1\342\002,Anduril\\Comm" +
      "unicationsmanager\\V1\\GPBMetadata\352\002\"Andur" +
      "il::Communicationsmanager::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.anduril.communicationsmanager.v1.BlobsPubProto.getDescriptor(),
          com.anduril.communicationsmanager.v1.CommonPubProto.getDescriptor(),
          com.anduril.communicationsmanager.v1.EntityPubProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_anduril_communicationsmanager_v1_RegisterIntegrationRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_anduril_communicationsmanager_v1_RegisterIntegrationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_communicationsmanager_v1_RegisterIntegrationRequest_descriptor,
        new java.lang.String[] { "IntegrationName", "Details", });
    internal_static_anduril_communicationsmanager_v1_RegisteredIntegration_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_anduril_communicationsmanager_v1_RegisteredIntegration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_communicationsmanager_v1_RegisteredIntegration_descriptor,
        new java.lang.String[] { "IntegrationName", "NodeId", "VersionNum", "IntegrationDetails", "HealthState", });
    internal_static_anduril_communicationsmanager_v1_IntegrationDetails_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_anduril_communicationsmanager_v1_IntegrationDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_communicationsmanager_v1_IntegrationDetails_descriptor,
        new java.lang.String[] { "EntityDetails", "BlobDetails", });
    internal_static_anduril_communicationsmanager_v1_DeregisterIntegrationRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_anduril_communicationsmanager_v1_DeregisterIntegrationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_communicationsmanager_v1_DeregisterIntegrationRequest_descriptor,
        new java.lang.String[] { "IntegrationName", "NodeId", });
    internal_static_anduril_communicationsmanager_v1_DeregisterIntegrationResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_anduril_communicationsmanager_v1_DeregisterIntegrationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_communicationsmanager_v1_DeregisterIntegrationResponse_descriptor,
        new java.lang.String[] { });
    internal_static_anduril_communicationsmanager_v1_GetIntegrationsRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_anduril_communicationsmanager_v1_GetIntegrationsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_communicationsmanager_v1_GetIntegrationsRequest_descriptor,
        new java.lang.String[] { "Nodes", });
    internal_static_anduril_communicationsmanager_v1_GetIntegrationsResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_anduril_communicationsmanager_v1_GetIntegrationsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_communicationsmanager_v1_GetIntegrationsResponse_descriptor,
        new java.lang.String[] { "Integration", });
    internal_static_anduril_communicationsmanager_v1_AllNodes_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_anduril_communicationsmanager_v1_AllNodes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_communicationsmanager_v1_AllNodes_descriptor,
        new java.lang.String[] { });
    internal_static_anduril_communicationsmanager_v1_LocalNode_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_anduril_communicationsmanager_v1_LocalNode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_communicationsmanager_v1_LocalNode_descriptor,
        new java.lang.String[] { });
    internal_static_anduril_communicationsmanager_v1_StreamIntegrationsRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_anduril_communicationsmanager_v1_StreamIntegrationsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_communicationsmanager_v1_StreamIntegrationsRequest_descriptor,
        new java.lang.String[] { "AllNodes", "LocalNode", "PreexistingOnly", "OwnerFilter", });
    internal_static_anduril_communicationsmanager_v1_IntegrationEvent_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_anduril_communicationsmanager_v1_IntegrationEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_communicationsmanager_v1_IntegrationEvent_descriptor,
        new java.lang.String[] { "EventType", "Time", "Integration", });
    internal_static_anduril_communicationsmanager_v1_StreamIntegrationsResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_anduril_communicationsmanager_v1_StreamIntegrationsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_communicationsmanager_v1_StreamIntegrationsResponse_descriptor,
        new java.lang.String[] { "IntegrationEvent", });
    internal_static_anduril_communicationsmanager_v1_IntegrationHealthUpdateRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_anduril_communicationsmanager_v1_IntegrationHealthUpdateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_communicationsmanager_v1_IntegrationHealthUpdateRequest_descriptor,
        new java.lang.String[] { "IntegrationName", "HealthState", });
    internal_static_anduril_communicationsmanager_v1_IntegrationHealthUpdateResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_anduril_communicationsmanager_v1_IntegrationHealthUpdateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_communicationsmanager_v1_IntegrationHealthUpdateResponse_descriptor,
        new java.lang.String[] { });
    internal_static_anduril_communicationsmanager_v1_IntegrationHealthState_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_anduril_communicationsmanager_v1_IntegrationHealthState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_communicationsmanager_v1_IntegrationHealthState_descriptor,
        new java.lang.String[] { "HealthStatus", "Description", });
    descriptor.resolveAllFeaturesImmutable();
    com.anduril.communicationsmanager.v1.BlobsPubProto.getDescriptor();
    com.anduril.communicationsmanager.v1.CommonPubProto.getDescriptor();
    com.anduril.communicationsmanager.v1.EntityPubProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
