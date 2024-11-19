// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/taskmanager/v1/task.pub.proto

package com.anduril.taskmanager.v1;

public final class TaskPubProto {
  private TaskPubProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_taskmanager_v1_Task_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_taskmanager_v1_Task_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_taskmanager_v1_TaskStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_taskmanager_v1_TaskStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_taskmanager_v1_TaskError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_taskmanager_v1_TaskError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_taskmanager_v1_Principal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_taskmanager_v1_Principal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_taskmanager_v1_System_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_taskmanager_v1_System_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_taskmanager_v1_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_taskmanager_v1_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_taskmanager_v1_Relations_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_taskmanager_v1_Relations_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_taskmanager_v1_TaskEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_taskmanager_v1_TaskEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_taskmanager_v1_TaskVersion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_taskmanager_v1_TaskVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_taskmanager_v1_StatusUpdate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_taskmanager_v1_StatusUpdate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_taskmanager_v1_DefinitionUpdate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_taskmanager_v1_DefinitionUpdate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_taskmanager_v1_Owner_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_taskmanager_v1_Owner_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_taskmanager_v1_Replication_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_taskmanager_v1_Replication_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_taskmanager_v1_Allocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_taskmanager_v1_Allocation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_taskmanager_v1_Team_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_taskmanager_v1_Team_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_taskmanager_v1_Agent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_taskmanager_v1_Agent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_taskmanager_v1_TaskEntity_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_taskmanager_v1_TaskEntity_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%anduril/taskmanager/v1/task.pub.proto\022" +
      "\026anduril.taskmanager.v1\032)anduril/entitym" +
      "anager/v1/entity.pub.proto\032\031google/proto" +
      "buf/any.proto\032\037google/protobuf/timestamp" +
      ".proto\"\233\007\n\004Task\022=\n\007version\030\001 \001(\0132#.andur" +
      "il.taskmanager.v1.TaskVersionR\007version\022!" +
      "\n\014display_name\030\002 \001(\tR\013displayName\022:\n\rspe" +
      "cification\030\003 \001(\0132\024.google.protobuf.AnyR\r" +
      "specification\022@\n\ncreated_by\030\020 \001(\0132!.andu" +
      "ril.taskmanager.v1.PrincipalR\tcreatedBy\022" +
      "I\n\017last_updated_by\030\004 \001(\0132!.anduril.taskm" +
      "anager.v1.PrincipalR\rlastUpdatedBy\022D\n\020la" +
      "st_update_time\030\t \001(\0132\032.google.protobuf.T" +
      "imestampR\016lastUpdateTime\022:\n\006status\030\005 \001(\013" +
      "2\".anduril.taskmanager.v1.TaskStatusR\006st" +
      "atus\022A\n\016scheduled_time\030\006 \001(\0132\032.google.pr" +
      "otobuf.TimestampR\rscheduledTime\022?\n\trelat" +
      "ions\030\010 \001(\0132!.anduril.taskmanager.v1.Rela" +
      "tionsR\trelations\022 \n\013description\030\n \001(\tR\013d" +
      "escription\0222\n\025is_executed_elsewhere\030\013 \001(" +
      "\010R\023isExecutedElsewhere\022;\n\013create_time\030\r " +
      "\001(\0132\032.google.protobuf.TimestampR\ncreateT" +
      "ime\022E\n\013replication\030\016 \001(\0132#.anduril.taskm" +
      "anager.v1.ReplicationR\013replication\022M\n\020in" +
      "itial_entities\030\017 \003(\0132\".anduril.taskmanag" +
      "er.v1.TaskEntityR\017initialEntities\0223\n\005own" +
      "er\030\014 \001(\0132\035.anduril.taskmanager.v1.OwnerR" +
      "\005ownerJ\004\010\007\020\010\"\227\003\n\nTaskStatus\0226\n\006status\030\001 " +
      "\001(\0162\036.anduril.taskmanager.v1.StatusR\006sta" +
      "tus\022@\n\ntask_error\030\002 \001(\0132!.anduril.taskma" +
      "nager.v1.TaskErrorR\ttaskError\0220\n\010progres" +
      "s\030\004 \001(\0132\024.google.protobuf.AnyR\010progress\022" +
      ",\n\006result\030\005 \001(\0132\024.google.protobuf.AnyR\006r" +
      "esult\0229\n\nstart_time\030\006 \001(\0132\032.google.proto" +
      "buf.TimestampR\tstartTime\0220\n\010estimate\030\007 \001" +
      "(\0132\024.google.protobuf.AnyR\010estimate\022B\n\nal" +
      "location\030\010 \001(\0132\".anduril.taskmanager.v1." +
      "AllocationR\nallocation\"\227\001\n\tTaskError\0225\n\004" +
      "code\030\001 \001(\0162!.anduril.taskmanager.v1.Erro" +
      "rCodeR\004code\022\030\n\007message\030\002 \001(\tR\007message\0229\n" +
      "\rerror_details\030\003 \001(\0132\024.google.protobuf.A" +
      "nyR\014errorDetails\"\373\001\n\tPrincipal\0228\n\006system" +
      "\030\001 \001(\0132\036.anduril.taskmanager.v1.SystemH\000" +
      "R\006system\0222\n\004user\030\002 \001(\0132\034.anduril.taskman" +
      "ager.v1.UserH\000R\004user\0222\n\004team\030\004 \001(\0132\034.and" +
      "uril.taskmanager.v1.TeamH\000R\004team\022C\n\014on_b" +
      "ehalf_of\030\003 \001(\0132!.anduril.taskmanager.v1." +
      "PrincipalR\nonBehalfOfB\007\n\005agent\"\231\001\n\006Syste" +
      "m\022!\n\014service_name\030\001 \001(\tR\013serviceName\022\033\n\t" +
      "entity_id\030\002 \001(\tR\010entityId\022\031\n\010asset_id\030\003 " +
      "\001(\tR\007assetId\0224\n\026manages_own_scheduling\030\004" +
      " \001(\010R\024managesOwnScheduling\"\037\n\004User\022\027\n\007us" +
      "er_id\030\001 \001(\tR\006userId\"p\n\tRelations\022=\n\010assi" +
      "gnee\030\001 \001(\0132!.anduril.taskmanager.v1.Prin" +
      "cipalR\010assignee\022$\n\016parent_task_id\030\002 \001(\tR" +
      "\014parentTaskId\"\356\001\n\tTaskEvent\022@\n\nevent_typ" +
      "e\030\001 \001(\0162!.anduril.taskmanager.v1.EventTy" +
      "peR\teventType\0220\n\004task\030\002 \001(\0132\034.anduril.ta" +
      "skmanager.v1.TaskR\004task\022=\n\ttask_view\030\003 \001" +
      "(\0162 .anduril.taskmanager.v1.TaskViewR\010ta" +
      "skView\022.\n\004time\030\004 \001(\0132\032.google.protobuf.T" +
      "imestampR\004time\"|\n\013TaskVersion\022\027\n\007task_id" +
      "\030\001 \001(\tR\006taskId\022-\n\022definition_version\030\002 \001" +
      "(\rR\021definitionVersion\022%\n\016status_version\030" +
      "\003 \001(\rR\rstatusVersion\"\207\002\n\014StatusUpdate\022=\n" +
      "\007version\030\001 \001(\0132#.anduril.taskmanager.v1." +
      "TaskVersionR\007version\022:\n\006status\030\002 \001(\0132\".a" +
      "nduril.taskmanager.v1.TaskStatusR\006status" +
      "\0229\n\006author\030\003 \001(\0132!.anduril.taskmanager.v" +
      "1.PrincipalR\006author\022A\n\016scheduled_time\030\004 " +
      "\001(\0132\032.google.protobuf.TimestampR\rschedul" +
      "edTime\"D\n\020DefinitionUpdate\0220\n\004task\030\001 \001(\013" +
      "2\034.anduril.taskmanager.v1.TaskR\004task\"?\n\005" +
      "Owner\022\031\n\010asset_id\030\001 \001(\tR\007assetId\022\033\n\tenti" +
      "ty_id\030\002 \001(\tR\010entityId\"H\n\013Replication\0229\n\n" +
      "stale_time\030\001 \001(\0132\032.google.protobuf.Times" +
      "tampR\tstaleTime\"P\n\nAllocation\022B\n\ractive_" +
      "agents\030\001 \003(\0132\035.anduril.taskmanager.v1.Ag" +
      "entR\014activeAgents\"\\\n\004Team\022\033\n\tentity_id\030\001" +
      " \001(\tR\010entityId\0227\n\007members\030\002 \003(\0132\035.anduri" +
      "l.taskmanager.v1.AgentR\007members\"?\n\005Agent" +
      "\022\031\n\010asset_id\030\001 \001(\tR\007assetId\022\033\n\tentity_id" +
      "\030\002 \001(\tR\010entityId\"b\n\nTaskEntity\0228\n\006entity" +
      "\030\001 \001(\0132 .anduril.entitymanager.v1.Entity" +
      "R\006entity\022\032\n\010snapshot\030\002 \001(\010R\010snapshot*\357\002\n" +
      "\006Status\022\022\n\016STATUS_INVALID\020\000\022\022\n\016STATUS_CR" +
      "EATED\020\001\022\037\n\033STATUS_SCHEDULED_IN_MANAGER\020\002" +
      "\022\017\n\013STATUS_SENT\020\003\022\032\n\026STATUS_MACHINE_RECE" +
      "IPT\020\004\022\016\n\nSTATUS_ACK\020\005\022\020\n\014STATUS_WILCO\020\006\022" +
      "\024\n\020STATUS_EXECUTING\020\007\022\035\n\031STATUS_WAITING_" +
      "FOR_UPDATE\020\010\022\022\n\016STATUS_DONE_OK\020\t\022\026\n\022STAT" +
      "US_DONE_NOT_OK\020\n\022\023\n\017STATUS_REPLACED\020\013\022\033\n" +
      "\027STATUS_CANCEL_REQUESTED\020\014\022\035\n\031STATUS_COM" +
      "PLETE_REQUESTED\020\r\022\033\n\027STATUS_VERSION_REJE" +
      "CTED\020\016*\205\001\n\tErrorCode\022\026\n\022ERROR_CODE_INVAL" +
      "ID\020\000\022\030\n\024ERROR_CODE_CANCELLED\020\001\022\027\n\023ERROR_" +
      "CODE_REJECTED\020\002\022\026\n\022ERROR_CODE_TIMEOUT\020\003\022" +
      "\025\n\021ERROR_CODE_FAILED\020\004*n\n\tEventType\022\026\n\022E" +
      "VENT_TYPE_INVALID\020\000\022\026\n\022EVENT_TYPE_CREATE" +
      "D\020\001\022\025\n\021EVENT_TYPE_UPDATE\020\002\022\032\n\026EVENT_TYPE" +
      "_PREEXISTING\020\003*M\n\010TaskView\022\025\n\021TASK_VIEW_" +
      "INVALID\020\000\022\025\n\021TASK_VIEW_MANAGER\020\001\022\023\n\017TASK" +
      "_VIEW_AGENT\020\002B\362\001\n\032com.anduril.taskmanage" +
      "r.v1B\014TaskPubProtoP\001ZLgithub.com/anduril" +
      "/lattice-sdk-java/src/anduril/taskmanage" +
      "r/v1;taskmanagerv1\242\002\003ATX\252\002\026Anduril.Taskm" +
      "anager.V1\312\002\026Anduril\\Taskmanager\\V1\342\002\"And" +
      "uril\\Taskmanager\\V1\\GPBMetadata\352\002\030Anduri" +
      "l::Taskmanager::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.anduril.entitymanager.v1.EntityPubProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_anduril_taskmanager_v1_Task_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_anduril_taskmanager_v1_Task_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_taskmanager_v1_Task_descriptor,
        new java.lang.String[] { "Version", "DisplayName", "Specification", "CreatedBy", "LastUpdatedBy", "LastUpdateTime", "Status", "ScheduledTime", "Relations", "Description", "IsExecutedElsewhere", "CreateTime", "Replication", "InitialEntities", "Owner", });
    internal_static_anduril_taskmanager_v1_TaskStatus_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_anduril_taskmanager_v1_TaskStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_taskmanager_v1_TaskStatus_descriptor,
        new java.lang.String[] { "Status", "TaskError", "Progress", "Result", "StartTime", "Estimate", "Allocation", });
    internal_static_anduril_taskmanager_v1_TaskError_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_anduril_taskmanager_v1_TaskError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_taskmanager_v1_TaskError_descriptor,
        new java.lang.String[] { "Code", "Message", "ErrorDetails", });
    internal_static_anduril_taskmanager_v1_Principal_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_anduril_taskmanager_v1_Principal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_taskmanager_v1_Principal_descriptor,
        new java.lang.String[] { "System", "User", "Team", "OnBehalfOf", "Agent", });
    internal_static_anduril_taskmanager_v1_System_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_anduril_taskmanager_v1_System_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_taskmanager_v1_System_descriptor,
        new java.lang.String[] { "ServiceName", "EntityId", "AssetId", "ManagesOwnScheduling", });
    internal_static_anduril_taskmanager_v1_User_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_anduril_taskmanager_v1_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_taskmanager_v1_User_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_anduril_taskmanager_v1_Relations_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_anduril_taskmanager_v1_Relations_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_taskmanager_v1_Relations_descriptor,
        new java.lang.String[] { "Assignee", "ParentTaskId", });
    internal_static_anduril_taskmanager_v1_TaskEvent_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_anduril_taskmanager_v1_TaskEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_taskmanager_v1_TaskEvent_descriptor,
        new java.lang.String[] { "EventType", "Task", "TaskView", "Time", });
    internal_static_anduril_taskmanager_v1_TaskVersion_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_anduril_taskmanager_v1_TaskVersion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_taskmanager_v1_TaskVersion_descriptor,
        new java.lang.String[] { "TaskId", "DefinitionVersion", "StatusVersion", });
    internal_static_anduril_taskmanager_v1_StatusUpdate_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_anduril_taskmanager_v1_StatusUpdate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_taskmanager_v1_StatusUpdate_descriptor,
        new java.lang.String[] { "Version", "Status", "Author", "ScheduledTime", });
    internal_static_anduril_taskmanager_v1_DefinitionUpdate_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_anduril_taskmanager_v1_DefinitionUpdate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_taskmanager_v1_DefinitionUpdate_descriptor,
        new java.lang.String[] { "Task", });
    internal_static_anduril_taskmanager_v1_Owner_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_anduril_taskmanager_v1_Owner_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_taskmanager_v1_Owner_descriptor,
        new java.lang.String[] { "AssetId", "EntityId", });
    internal_static_anduril_taskmanager_v1_Replication_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_anduril_taskmanager_v1_Replication_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_taskmanager_v1_Replication_descriptor,
        new java.lang.String[] { "StaleTime", });
    internal_static_anduril_taskmanager_v1_Allocation_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_anduril_taskmanager_v1_Allocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_taskmanager_v1_Allocation_descriptor,
        new java.lang.String[] { "ActiveAgents", });
    internal_static_anduril_taskmanager_v1_Team_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_anduril_taskmanager_v1_Team_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_taskmanager_v1_Team_descriptor,
        new java.lang.String[] { "EntityId", "Members", });
    internal_static_anduril_taskmanager_v1_Agent_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_anduril_taskmanager_v1_Agent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_taskmanager_v1_Agent_descriptor,
        new java.lang.String[] { "AssetId", "EntityId", });
    internal_static_anduril_taskmanager_v1_TaskEntity_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_anduril_taskmanager_v1_TaskEntity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_taskmanager_v1_TaskEntity_descriptor,
        new java.lang.String[] { "Entity", "Snapshot", });
    com.anduril.entitymanager.v1.EntityPubProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
