// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/taskmanager/v1/task.pub.proto

package com.anduril.taskmanager.v1;

public interface TaskEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.taskmanager.v1.TaskEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of Event.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.EventType event_type = 1 [json_name = "eventType"];</code>
   * @return The enum numeric value on the wire for eventType.
   */
  int getEventTypeValue();
  /**
   * <pre>
   * Type of Event.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.EventType event_type = 1 [json_name = "eventType"];</code>
   * @return The eventType.
   */
  com.anduril.taskmanager.v1.EventType getEventType();

  /**
   * <pre>
   * Task associated with this TaskEvent.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Task task = 2 [json_name = "task"];</code>
   * @return Whether the task field is set.
   */
  boolean hasTask();
  /**
   * <pre>
   * Task associated with this TaskEvent.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Task task = 2 [json_name = "task"];</code>
   * @return The task.
   */
  com.anduril.taskmanager.v1.Task getTask();
  /**
   * <pre>
   * Task associated with this TaskEvent.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Task task = 2 [json_name = "task"];</code>
   */
  com.anduril.taskmanager.v1.TaskOrBuilder getTaskOrBuilder();

  /**
   * <pre>
   * View associated with this task.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.TaskView task_view = 3 [json_name = "taskView"];</code>
   * @return The enum numeric value on the wire for taskView.
   */
  int getTaskViewValue();
  /**
   * <pre>
   * View associated with this task.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.TaskView task_view = 3 [json_name = "taskView"];</code>
   * @return The taskView.
   */
  com.anduril.taskmanager.v1.TaskView getTaskView();

  /**
   * <pre>
   * ===== Time Series Updates =====
   *
   * Timestamp for time-series to index.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 4 [json_name = "time"];</code>
   * @return Whether the time field is set.
   */
  boolean hasTime();
  /**
   * <pre>
   * ===== Time Series Updates =====
   *
   * Timestamp for time-series to index.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 4 [json_name = "time"];</code>
   * @return The time.
   */
  com.google.protobuf.Timestamp getTime();
  /**
   * <pre>
   * ===== Time Series Updates =====
   *
   * Timestamp for time-series to index.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 4 [json_name = "time"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeOrBuilder();
}