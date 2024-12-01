// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/taskmanager/v1/task.pub.proto

package com.anduril.taskmanager.v1;

public interface TaskStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.taskmanager.v1.TaskStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Status of the Task.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Status status = 1 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Status of the Task.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Status status = 1 [json_name = "status"];</code>
   * @return The status.
   */
  com.anduril.taskmanager.v1.Status getStatus();

  /**
   * <pre>
   * Any errors associated with the Task.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.TaskError task_error = 2 [json_name = "taskError"];</code>
   * @return Whether the taskError field is set.
   */
  boolean hasTaskError();
  /**
   * <pre>
   * Any errors associated with the Task.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.TaskError task_error = 2 [json_name = "taskError"];</code>
   * @return The taskError.
   */
  com.anduril.taskmanager.v1.TaskError getTaskError();
  /**
   * <pre>
   * Any errors associated with the Task.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.TaskError task_error = 2 [json_name = "taskError"];</code>
   */
  com.anduril.taskmanager.v1.TaskErrorOrBuilder getTaskErrorOrBuilder();

  /**
   * <pre>
   * Any incremental progress on the Task, should be from the tasks/v*&#47;progress folder.
   * </pre>
   *
   * <code>.google.protobuf.Any progress = 4 [json_name = "progress"];</code>
   * @return Whether the progress field is set.
   */
  boolean hasProgress();
  /**
   * <pre>
   * Any incremental progress on the Task, should be from the tasks/v*&#47;progress folder.
   * </pre>
   *
   * <code>.google.protobuf.Any progress = 4 [json_name = "progress"];</code>
   * @return The progress.
   */
  com.google.protobuf.Any getProgress();
  /**
   * <pre>
   * Any incremental progress on the Task, should be from the tasks/v*&#47;progress folder.
   * </pre>
   *
   * <code>.google.protobuf.Any progress = 4 [json_name = "progress"];</code>
   */
  com.google.protobuf.AnyOrBuilder getProgressOrBuilder();

  /**
   * <pre>
   * Any final result of the Task, should be from tasks/v*&#47;result folder.
   * </pre>
   *
   * <code>.google.protobuf.Any result = 5 [json_name = "result"];</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <pre>
   * Any final result of the Task, should be from tasks/v*&#47;result folder.
   * </pre>
   *
   * <code>.google.protobuf.Any result = 5 [json_name = "result"];</code>
   * @return The result.
   */
  com.google.protobuf.Any getResult();
  /**
   * <pre>
   * Any final result of the Task, should be from tasks/v*&#47;result folder.
   * </pre>
   *
   * <code>.google.protobuf.Any result = 5 [json_name = "result"];</code>
   */
  com.google.protobuf.AnyOrBuilder getResultOrBuilder();

  /**
   * <pre>
   * Time the Task began execution, may not be known even for executing Tasks.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 6 [json_name = "startTime"];</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * Time the Task began execution, may not be known even for executing Tasks.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 6 [json_name = "startTime"];</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * Time the Task began execution, may not be known even for executing Tasks.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 6 [json_name = "startTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * Any estimate for how the Task will progress, should be from tasks/v*&#47;estimates folder.
   * </pre>
   *
   * <code>.google.protobuf.Any estimate = 7 [json_name = "estimate"];</code>
   * @return Whether the estimate field is set.
   */
  boolean hasEstimate();
  /**
   * <pre>
   * Any estimate for how the Task will progress, should be from tasks/v*&#47;estimates folder.
   * </pre>
   *
   * <code>.google.protobuf.Any estimate = 7 [json_name = "estimate"];</code>
   * @return The estimate.
   */
  com.google.protobuf.Any getEstimate();
  /**
   * <pre>
   * Any estimate for how the Task will progress, should be from tasks/v*&#47;estimates folder.
   * </pre>
   *
   * <code>.google.protobuf.Any estimate = 7 [json_name = "estimate"];</code>
   */
  com.google.protobuf.AnyOrBuilder getEstimateOrBuilder();

  /**
   * <pre>
   * Any allocated agents of the Task.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Allocation allocation = 8 [json_name = "allocation"];</code>
   * @return Whether the allocation field is set.
   */
  boolean hasAllocation();
  /**
   * <pre>
   * Any allocated agents of the Task.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Allocation allocation = 8 [json_name = "allocation"];</code>
   * @return The allocation.
   */
  com.anduril.taskmanager.v1.Allocation getAllocation();
  /**
   * <pre>
   * Any allocated agents of the Task.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Allocation allocation = 8 [json_name = "allocation"];</code>
   */
  com.anduril.taskmanager.v1.AllocationOrBuilder getAllocationOrBuilder();
}
