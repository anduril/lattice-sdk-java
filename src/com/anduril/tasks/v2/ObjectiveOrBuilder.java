// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/objective.pub.proto

package com.anduril.tasks.v2;

public interface ObjectiveOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.tasks.v2.Objective)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Prefer Entity Objectives whenever the objective is in fact an entity. In other words, don't take position/point
   * out of an entity and pass it as a simple point.
   * </pre>
   *
   * <code>string entity_id = 1 [json_name = "entityId"];</code>
   * @return Whether the entityId field is set.
   */
  boolean hasEntityId();
  /**
   * <pre>
   * Prefer Entity Objectives whenever the objective is in fact an entity. In other words, don't take position/point
   * out of an entity and pass it as a simple point.
   * </pre>
   *
   * <code>string entity_id = 1 [json_name = "entityId"];</code>
   * @return The entityId.
   */
  java.lang.String getEntityId();
  /**
   * <pre>
   * Prefer Entity Objectives whenever the objective is in fact an entity. In other words, don't take position/point
   * out of an entity and pass it as a simple point.
   * </pre>
   *
   * <code>string entity_id = 1 [json_name = "entityId"];</code>
   * @return The bytes for entityId.
   */
  com.google.protobuf.ByteString
      getEntityIdBytes();

  /**
   * <pre>
   * Point objectives for simple reference points that are not geo entities.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Point point = 5 [json_name = "point"];</code>
   * @return Whether the point field is set.
   */
  boolean hasPoint();
  /**
   * <pre>
   * Point objectives for simple reference points that are not geo entities.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Point point = 5 [json_name = "point"];</code>
   * @return The point.
   */
  com.anduril.tasks.v2.Point getPoint();
  /**
   * <pre>
   * Point objectives for simple reference points that are not geo entities.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Point point = 5 [json_name = "point"];</code>
   */
  com.anduril.tasks.v2.PointOrBuilder getPointOrBuilder();

  /**
   * <pre>
   * the asset (if known) which produced the objective (useful for time-series lookups of historical objectives).
   * </pre>
   *
   * <code>string produced_by_asset_id = 2 [json_name = "producedByAssetId"];</code>
   * @return The producedByAssetId.
   */
  java.lang.String getProducedByAssetId();
  /**
   * <pre>
   * the asset (if known) which produced the objective (useful for time-series lookups of historical objectives).
   * </pre>
   *
   * <code>string produced_by_asset_id = 2 [json_name = "producedByAssetId"];</code>
   * @return The bytes for producedByAssetId.
   */
  com.google.protobuf.ByteString
      getProducedByAssetIdBytes();

  com.anduril.tasks.v2.Objective.ObjectiveCase getObjectiveCase();
}
