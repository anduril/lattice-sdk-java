// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/entitymanager/v1/schedule.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.entitymanager.v1;

public interface ScheduleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.Schedule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * expression that represents this schedule's "ON" state
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.CronWindow windows = 1 [json_name = "windows"];</code>
   */
  java.util.List<com.anduril.entitymanager.v1.CronWindow> 
      getWindowsList();
  /**
   * <pre>
   * expression that represents this schedule's "ON" state
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.CronWindow windows = 1 [json_name = "windows"];</code>
   */
  com.anduril.entitymanager.v1.CronWindow getWindows(int index);
  /**
   * <pre>
   * expression that represents this schedule's "ON" state
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.CronWindow windows = 1 [json_name = "windows"];</code>
   */
  int getWindowsCount();
  /**
   * <pre>
   * expression that represents this schedule's "ON" state
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.CronWindow windows = 1 [json_name = "windows"];</code>
   */
  java.util.List<? extends com.anduril.entitymanager.v1.CronWindowOrBuilder> 
      getWindowsOrBuilderList();
  /**
   * <pre>
   * expression that represents this schedule's "ON" state
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.CronWindow windows = 1 [json_name = "windows"];</code>
   */
  com.anduril.entitymanager.v1.CronWindowOrBuilder getWindowsOrBuilder(
      int index);

  /**
   * <pre>
   * A unique identifier for this schedule.
   * </pre>
   *
   * <code>string schedule_id = 2 [json_name = "scheduleId"];</code>
   * @return The scheduleId.
   */
  java.lang.String getScheduleId();
  /**
   * <pre>
   * A unique identifier for this schedule.
   * </pre>
   *
   * <code>string schedule_id = 2 [json_name = "scheduleId"];</code>
   * @return The bytes for scheduleId.
   */
  com.google.protobuf.ByteString
      getScheduleIdBytes();

  /**
   * <pre>
   * The schedule type
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.ScheduleType schedule_type = 3 [json_name = "scheduleType"];</code>
   * @return The enum numeric value on the wire for scheduleType.
   */
  int getScheduleTypeValue();
  /**
   * <pre>
   * The schedule type
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.ScheduleType schedule_type = 3 [json_name = "scheduleType"];</code>
   * @return The scheduleType.
   */
  com.anduril.entitymanager.v1.ScheduleType getScheduleType();
}
