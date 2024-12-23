// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/taskmanager/v1/task.pub.proto

package com.anduril.taskmanager.v1;

/**
 * <pre>
 * The Status of a Task definition through its lifecycle. Each Definition Version can have its own Status.
 * For example, Definition v1 could go CREATED -&gt; SENT -&gt; WILCO -&gt; REPLACED, with v2 then potentially in sent Status.
 * </pre>
 *
 * Protobuf enum {@code anduril.taskmanager.v1.Status}
 */
public enum Status
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>STATUS_INVALID = 0;</code>
   */
  STATUS_INVALID(0),
  /**
   * <pre>
   * Initial creation Status.
   * </pre>
   *
   * <code>STATUS_CREATED = 1;</code>
   */
  STATUS_CREATED(1),
  /**
   * <pre>
   * Scheduled within Task Manager to be sent at a future time.
   * </pre>
   *
   * <code>STATUS_SCHEDULED_IN_MANAGER = 2;</code>
   */
  STATUS_SCHEDULED_IN_MANAGER(2),
  /**
   * <pre>
   * Sent to another system (Asset), no receipt yet.
   * </pre>
   *
   * <code>STATUS_SENT = 3;</code>
   */
  STATUS_SENT(3),
  /**
   * <pre>
   * Task was sent to Assignee, and some system was reachable and responded.
   * However, the system responsible for execution on the Assignee has not yet acknowledged the Task.
   * </pre>
   *
   * <code>STATUS_MACHINE_RECEIPT = 4;</code>
   */
  STATUS_MACHINE_RECEIPT(4),
  /**
   * <pre>
   * System responsible for execution on the Assignee has acknowledged the Task.
   * </pre>
   *
   * <code>STATUS_ACK = 5;</code>
   */
  STATUS_ACK(5),
  /**
   * <pre>
   * Assignee confirmed they "will comply" / intend to execute Task.
   * </pre>
   *
   * <code>STATUS_WILCO = 6;</code>
   */
  STATUS_WILCO(6),
  /**
   * <pre>
   * Task was started and is actively executing.
   * </pre>
   *
   * <code>STATUS_EXECUTING = 7;</code>
   */
  STATUS_EXECUTING(7),
  /**
   * <pre>
   * Task is on hold, waiting for additional updates/information before proceeding.
   * </pre>
   *
   * <code>STATUS_WAITING_FOR_UPDATE = 8;</code>
   */
  STATUS_WAITING_FOR_UPDATE(8),
  /**
   * <pre>
   * Task was completed successfully.
   * </pre>
   *
   * <code>STATUS_DONE_OK = 9;</code>
   */
  STATUS_DONE_OK(9),
  /**
   * <pre>
   * Task has reached a terminal state but did not complete successfully, see error code/message.
   * </pre>
   *
   * <code>STATUS_DONE_NOT_OK = 10;</code>
   */
  STATUS_DONE_NOT_OK(10),
  /**
   * <pre>
   * This definition version was replaced.
   * </pre>
   *
   * <code>STATUS_REPLACED = 11;</code>
   */
  STATUS_REPLACED(11),
  /**
   * <pre>
   * A Task was requested to be cancelled but not yet confirmed, will eventually move to DONE_NOT_OK.
   * </pre>
   *
   * <code>STATUS_CANCEL_REQUESTED = 12;</code>
   */
  STATUS_CANCEL_REQUESTED(12),
  /**
   * <pre>
   * A Task was requested to be completed successfully but not yet confirmed, will eventually move to DONE_NOT_OK / DONE_OK.
   * </pre>
   *
   * <code>STATUS_COMPLETE_REQUESTED = 13;</code>
   */
  STATUS_COMPLETE_REQUESTED(13),
  /**
   * <pre>
   * This definition version was rejected, intended to be used when an Agent does not accept a new version of a task
   * and continues using previous version
   * </pre>
   *
   * <code>STATUS_VERSION_REJECTED = 14;</code>
   */
  STATUS_VERSION_REJECTED(14),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>STATUS_INVALID = 0;</code>
   */
  public static final int STATUS_INVALID_VALUE = 0;
  /**
   * <pre>
   * Initial creation Status.
   * </pre>
   *
   * <code>STATUS_CREATED = 1;</code>
   */
  public static final int STATUS_CREATED_VALUE = 1;
  /**
   * <pre>
   * Scheduled within Task Manager to be sent at a future time.
   * </pre>
   *
   * <code>STATUS_SCHEDULED_IN_MANAGER = 2;</code>
   */
  public static final int STATUS_SCHEDULED_IN_MANAGER_VALUE = 2;
  /**
   * <pre>
   * Sent to another system (Asset), no receipt yet.
   * </pre>
   *
   * <code>STATUS_SENT = 3;</code>
   */
  public static final int STATUS_SENT_VALUE = 3;
  /**
   * <pre>
   * Task was sent to Assignee, and some system was reachable and responded.
   * However, the system responsible for execution on the Assignee has not yet acknowledged the Task.
   * </pre>
   *
   * <code>STATUS_MACHINE_RECEIPT = 4;</code>
   */
  public static final int STATUS_MACHINE_RECEIPT_VALUE = 4;
  /**
   * <pre>
   * System responsible for execution on the Assignee has acknowledged the Task.
   * </pre>
   *
   * <code>STATUS_ACK = 5;</code>
   */
  public static final int STATUS_ACK_VALUE = 5;
  /**
   * <pre>
   * Assignee confirmed they "will comply" / intend to execute Task.
   * </pre>
   *
   * <code>STATUS_WILCO = 6;</code>
   */
  public static final int STATUS_WILCO_VALUE = 6;
  /**
   * <pre>
   * Task was started and is actively executing.
   * </pre>
   *
   * <code>STATUS_EXECUTING = 7;</code>
   */
  public static final int STATUS_EXECUTING_VALUE = 7;
  /**
   * <pre>
   * Task is on hold, waiting for additional updates/information before proceeding.
   * </pre>
   *
   * <code>STATUS_WAITING_FOR_UPDATE = 8;</code>
   */
  public static final int STATUS_WAITING_FOR_UPDATE_VALUE = 8;
  /**
   * <pre>
   * Task was completed successfully.
   * </pre>
   *
   * <code>STATUS_DONE_OK = 9;</code>
   */
  public static final int STATUS_DONE_OK_VALUE = 9;
  /**
   * <pre>
   * Task has reached a terminal state but did not complete successfully, see error code/message.
   * </pre>
   *
   * <code>STATUS_DONE_NOT_OK = 10;</code>
   */
  public static final int STATUS_DONE_NOT_OK_VALUE = 10;
  /**
   * <pre>
   * This definition version was replaced.
   * </pre>
   *
   * <code>STATUS_REPLACED = 11;</code>
   */
  public static final int STATUS_REPLACED_VALUE = 11;
  /**
   * <pre>
   * A Task was requested to be cancelled but not yet confirmed, will eventually move to DONE_NOT_OK.
   * </pre>
   *
   * <code>STATUS_CANCEL_REQUESTED = 12;</code>
   */
  public static final int STATUS_CANCEL_REQUESTED_VALUE = 12;
  /**
   * <pre>
   * A Task was requested to be completed successfully but not yet confirmed, will eventually move to DONE_NOT_OK / DONE_OK.
   * </pre>
   *
   * <code>STATUS_COMPLETE_REQUESTED = 13;</code>
   */
  public static final int STATUS_COMPLETE_REQUESTED_VALUE = 13;
  /**
   * <pre>
   * This definition version was rejected, intended to be used when an Agent does not accept a new version of a task
   * and continues using previous version
   * </pre>
   *
   * <code>STATUS_VERSION_REJECTED = 14;</code>
   */
  public static final int STATUS_VERSION_REJECTED_VALUE = 14;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Status valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Status forNumber(int value) {
    switch (value) {
      case 0: return STATUS_INVALID;
      case 1: return STATUS_CREATED;
      case 2: return STATUS_SCHEDULED_IN_MANAGER;
      case 3: return STATUS_SENT;
      case 4: return STATUS_MACHINE_RECEIPT;
      case 5: return STATUS_ACK;
      case 6: return STATUS_WILCO;
      case 7: return STATUS_EXECUTING;
      case 8: return STATUS_WAITING_FOR_UPDATE;
      case 9: return STATUS_DONE_OK;
      case 10: return STATUS_DONE_NOT_OK;
      case 11: return STATUS_REPLACED;
      case 12: return STATUS_CANCEL_REQUESTED;
      case 13: return STATUS_COMPLETE_REQUESTED;
      case 14: return STATUS_VERSION_REJECTED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Status>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Status> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Status>() {
          public Status findValueByNumber(int number) {
            return Status.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.anduril.taskmanager.v1.TaskPubProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Status[] VALUES = values();

  public static Status valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Status(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:anduril.taskmanager.v1.Status)
}

