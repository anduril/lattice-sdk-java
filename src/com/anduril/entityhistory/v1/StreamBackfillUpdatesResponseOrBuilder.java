// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/entityhistory/v1/entity_history_api.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.entityhistory.v1;

public interface StreamBackfillUpdatesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entityhistory.v1.StreamBackfillUpdatesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .anduril.entityhistory.v1.BackfillUpdate backfill_updates = 1 [json_name = "backfillUpdates"];</code>
   */
  java.util.List<com.anduril.entityhistory.v1.BackfillUpdate> 
      getBackfillUpdatesList();
  /**
   * <code>repeated .anduril.entityhistory.v1.BackfillUpdate backfill_updates = 1 [json_name = "backfillUpdates"];</code>
   */
  com.anduril.entityhistory.v1.BackfillUpdate getBackfillUpdates(int index);
  /**
   * <code>repeated .anduril.entityhistory.v1.BackfillUpdate backfill_updates = 1 [json_name = "backfillUpdates"];</code>
   */
  int getBackfillUpdatesCount();
  /**
   * <code>repeated .anduril.entityhistory.v1.BackfillUpdate backfill_updates = 1 [json_name = "backfillUpdates"];</code>
   */
  java.util.List<? extends com.anduril.entityhistory.v1.BackfillUpdateOrBuilder> 
      getBackfillUpdatesOrBuilderList();
  /**
   * <code>repeated .anduril.entityhistory.v1.BackfillUpdate backfill_updates = 1 [json_name = "backfillUpdates"];</code>
   */
  com.anduril.entityhistory.v1.BackfillUpdateOrBuilder getBackfillUpdatesOrBuilder(
      int index);
}
