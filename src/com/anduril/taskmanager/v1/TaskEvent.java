// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/taskmanager/v1/task.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.taskmanager.v1;

/**
 * <pre>
 * Holds Tasks and its associated Events, e.g. CREATED.
 * </pre>
 *
 * Protobuf type {@code anduril.taskmanager.v1.TaskEvent}
 */
public final class TaskEvent extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:anduril.taskmanager.v1.TaskEvent)
    TaskEventOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      TaskEvent.class.getName());
  }
  // Use TaskEvent.newBuilder() to construct.
  private TaskEvent(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private TaskEvent() {
    eventType_ = 0;
    taskView_ = 0;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.taskmanager.v1.TaskPubProto.internal_static_anduril_taskmanager_v1_TaskEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.taskmanager.v1.TaskPubProto.internal_static_anduril_taskmanager_v1_TaskEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.taskmanager.v1.TaskEvent.class, com.anduril.taskmanager.v1.TaskEvent.Builder.class);
  }

  private int bitField0_;
  public static final int EVENT_TYPE_FIELD_NUMBER = 1;
  private int eventType_ = 0;
  /**
   * <pre>
   * Type of Event.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.EventType event_type = 1 [json_name = "eventType"];</code>
   * @return The enum numeric value on the wire for eventType.
   */
  @java.lang.Override public int getEventTypeValue() {
    return eventType_;
  }
  /**
   * <pre>
   * Type of Event.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.EventType event_type = 1 [json_name = "eventType"];</code>
   * @return The eventType.
   */
  @java.lang.Override public com.anduril.taskmanager.v1.EventType getEventType() {
    com.anduril.taskmanager.v1.EventType result = com.anduril.taskmanager.v1.EventType.forNumber(eventType_);
    return result == null ? com.anduril.taskmanager.v1.EventType.UNRECOGNIZED : result;
  }

  public static final int TASK_FIELD_NUMBER = 2;
  private com.anduril.taskmanager.v1.Task task_;
  /**
   * <pre>
   * Task associated with this TaskEvent.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Task task = 2 [json_name = "task"];</code>
   * @return Whether the task field is set.
   */
  @java.lang.Override
  public boolean hasTask() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Task associated with this TaskEvent.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Task task = 2 [json_name = "task"];</code>
   * @return The task.
   */
  @java.lang.Override
  public com.anduril.taskmanager.v1.Task getTask() {
    return task_ == null ? com.anduril.taskmanager.v1.Task.getDefaultInstance() : task_;
  }
  /**
   * <pre>
   * Task associated with this TaskEvent.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Task task = 2 [json_name = "task"];</code>
   */
  @java.lang.Override
  public com.anduril.taskmanager.v1.TaskOrBuilder getTaskOrBuilder() {
    return task_ == null ? com.anduril.taskmanager.v1.Task.getDefaultInstance() : task_;
  }

  public static final int TASK_VIEW_FIELD_NUMBER = 3;
  private int taskView_ = 0;
  /**
   * <pre>
   * View associated with this task.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.TaskView task_view = 3 [json_name = "taskView"];</code>
   * @return The enum numeric value on the wire for taskView.
   */
  @java.lang.Override public int getTaskViewValue() {
    return taskView_;
  }
  /**
   * <pre>
   * View associated with this task.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.TaskView task_view = 3 [json_name = "taskView"];</code>
   * @return The taskView.
   */
  @java.lang.Override public com.anduril.taskmanager.v1.TaskView getTaskView() {
    com.anduril.taskmanager.v1.TaskView result = com.anduril.taskmanager.v1.TaskView.forNumber(taskView_);
    return result == null ? com.anduril.taskmanager.v1.TaskView.UNRECOGNIZED : result;
  }

  public static final int TIME_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp time_;
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
  @java.lang.Override
  public boolean hasTime() {
    return ((bitField0_ & 0x00000002) != 0);
  }
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
  @java.lang.Override
  public com.google.protobuf.Timestamp getTime() {
    return time_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : time_;
  }
  /**
   * <pre>
   * ===== Time Series Updates =====
   *
   * Timestamp for time-series to index.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 4 [json_name = "time"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getTimeOrBuilder() {
    return time_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : time_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (eventType_ != com.anduril.taskmanager.v1.EventType.EVENT_TYPE_INVALID.getNumber()) {
      output.writeEnum(1, eventType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getTask());
    }
    if (taskView_ != com.anduril.taskmanager.v1.TaskView.TASK_VIEW_INVALID.getNumber()) {
      output.writeEnum(3, taskView_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(4, getTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (eventType_ != com.anduril.taskmanager.v1.EventType.EVENT_TYPE_INVALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, eventType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTask());
    }
    if (taskView_ != com.anduril.taskmanager.v1.TaskView.TASK_VIEW_INVALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, taskView_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getTime());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.anduril.taskmanager.v1.TaskEvent)) {
      return super.equals(obj);
    }
    com.anduril.taskmanager.v1.TaskEvent other = (com.anduril.taskmanager.v1.TaskEvent) obj;

    if (eventType_ != other.eventType_) return false;
    if (hasTask() != other.hasTask()) return false;
    if (hasTask()) {
      if (!getTask()
          .equals(other.getTask())) return false;
    }
    if (taskView_ != other.taskView_) return false;
    if (hasTime() != other.hasTime()) return false;
    if (hasTime()) {
      if (!getTime()
          .equals(other.getTime())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + EVENT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + eventType_;
    if (hasTask()) {
      hash = (37 * hash) + TASK_FIELD_NUMBER;
      hash = (53 * hash) + getTask().hashCode();
    }
    hash = (37 * hash) + TASK_VIEW_FIELD_NUMBER;
    hash = (53 * hash) + taskView_;
    if (hasTime()) {
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.taskmanager.v1.TaskEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.taskmanager.v1.TaskEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.TaskEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.taskmanager.v1.TaskEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.TaskEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.taskmanager.v1.TaskEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.TaskEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.taskmanager.v1.TaskEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.taskmanager.v1.TaskEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.taskmanager.v1.TaskEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.TaskEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.taskmanager.v1.TaskEvent parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.anduril.taskmanager.v1.TaskEvent prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Holds Tasks and its associated Events, e.g. CREATED.
   * </pre>
   *
   * Protobuf type {@code anduril.taskmanager.v1.TaskEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.taskmanager.v1.TaskEvent)
      com.anduril.taskmanager.v1.TaskEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.taskmanager.v1.TaskPubProto.internal_static_anduril_taskmanager_v1_TaskEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.taskmanager.v1.TaskPubProto.internal_static_anduril_taskmanager_v1_TaskEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.taskmanager.v1.TaskEvent.class, com.anduril.taskmanager.v1.TaskEvent.Builder.class);
    }

    // Construct using com.anduril.taskmanager.v1.TaskEvent.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getTaskFieldBuilder();
        getTimeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      eventType_ = 0;
      task_ = null;
      if (taskBuilder_ != null) {
        taskBuilder_.dispose();
        taskBuilder_ = null;
      }
      taskView_ = 0;
      time_ = null;
      if (timeBuilder_ != null) {
        timeBuilder_.dispose();
        timeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.taskmanager.v1.TaskPubProto.internal_static_anduril_taskmanager_v1_TaskEvent_descriptor;
    }

    @java.lang.Override
    public com.anduril.taskmanager.v1.TaskEvent getDefaultInstanceForType() {
      return com.anduril.taskmanager.v1.TaskEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.taskmanager.v1.TaskEvent build() {
      com.anduril.taskmanager.v1.TaskEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.taskmanager.v1.TaskEvent buildPartial() {
      com.anduril.taskmanager.v1.TaskEvent result = new com.anduril.taskmanager.v1.TaskEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.taskmanager.v1.TaskEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.eventType_ = eventType_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.task_ = taskBuilder_ == null
            ? task_
            : taskBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.taskView_ = taskView_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.time_ = timeBuilder_ == null
            ? time_
            : timeBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.taskmanager.v1.TaskEvent) {
        return mergeFrom((com.anduril.taskmanager.v1.TaskEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.taskmanager.v1.TaskEvent other) {
      if (other == com.anduril.taskmanager.v1.TaskEvent.getDefaultInstance()) return this;
      if (other.eventType_ != 0) {
        setEventTypeValue(other.getEventTypeValue());
      }
      if (other.hasTask()) {
        mergeTask(other.getTask());
      }
      if (other.taskView_ != 0) {
        setTaskViewValue(other.getTaskViewValue());
      }
      if (other.hasTime()) {
        mergeTime(other.getTime());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              eventType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getTaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              taskView_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int eventType_ = 0;
    /**
     * <pre>
     * Type of Event.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.EventType event_type = 1 [json_name = "eventType"];</code>
     * @return The enum numeric value on the wire for eventType.
     */
    @java.lang.Override public int getEventTypeValue() {
      return eventType_;
    }
    /**
     * <pre>
     * Type of Event.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.EventType event_type = 1 [json_name = "eventType"];</code>
     * @param value The enum numeric value on the wire for eventType to set.
     * @return This builder for chaining.
     */
    public Builder setEventTypeValue(int value) {
      eventType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of Event.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.EventType event_type = 1 [json_name = "eventType"];</code>
     * @return The eventType.
     */
    @java.lang.Override
    public com.anduril.taskmanager.v1.EventType getEventType() {
      com.anduril.taskmanager.v1.EventType result = com.anduril.taskmanager.v1.EventType.forNumber(eventType_);
      return result == null ? com.anduril.taskmanager.v1.EventType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Type of Event.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.EventType event_type = 1 [json_name = "eventType"];</code>
     * @param value The eventType to set.
     * @return This builder for chaining.
     */
    public Builder setEventType(com.anduril.taskmanager.v1.EventType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      eventType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of Event.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.EventType event_type = 1 [json_name = "eventType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEventType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      eventType_ = 0;
      onChanged();
      return this;
    }

    private com.anduril.taskmanager.v1.Task task_;
    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.taskmanager.v1.Task, com.anduril.taskmanager.v1.Task.Builder, com.anduril.taskmanager.v1.TaskOrBuilder> taskBuilder_;
    /**
     * <pre>
     * Task associated with this TaskEvent.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Task task = 2 [json_name = "task"];</code>
     * @return Whether the task field is set.
     */
    public boolean hasTask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Task associated with this TaskEvent.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Task task = 2 [json_name = "task"];</code>
     * @return The task.
     */
    public com.anduril.taskmanager.v1.Task getTask() {
      if (taskBuilder_ == null) {
        return task_ == null ? com.anduril.taskmanager.v1.Task.getDefaultInstance() : task_;
      } else {
        return taskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Task associated with this TaskEvent.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Task task = 2 [json_name = "task"];</code>
     */
    public Builder setTask(com.anduril.taskmanager.v1.Task value) {
      if (taskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        task_ = value;
      } else {
        taskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Task associated with this TaskEvent.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Task task = 2 [json_name = "task"];</code>
     */
    public Builder setTask(
        com.anduril.taskmanager.v1.Task.Builder builderForValue) {
      if (taskBuilder_ == null) {
        task_ = builderForValue.build();
      } else {
        taskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Task associated with this TaskEvent.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Task task = 2 [json_name = "task"];</code>
     */
    public Builder mergeTask(com.anduril.taskmanager.v1.Task value) {
      if (taskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          task_ != null &&
          task_ != com.anduril.taskmanager.v1.Task.getDefaultInstance()) {
          getTaskBuilder().mergeFrom(value);
        } else {
          task_ = value;
        }
      } else {
        taskBuilder_.mergeFrom(value);
      }
      if (task_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Task associated with this TaskEvent.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Task task = 2 [json_name = "task"];</code>
     */
    public Builder clearTask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      task_ = null;
      if (taskBuilder_ != null) {
        taskBuilder_.dispose();
        taskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Task associated with this TaskEvent.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Task task = 2 [json_name = "task"];</code>
     */
    public com.anduril.taskmanager.v1.Task.Builder getTaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Task associated with this TaskEvent.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Task task = 2 [json_name = "task"];</code>
     */
    public com.anduril.taskmanager.v1.TaskOrBuilder getTaskOrBuilder() {
      if (taskBuilder_ != null) {
        return taskBuilder_.getMessageOrBuilder();
      } else {
        return task_ == null ?
            com.anduril.taskmanager.v1.Task.getDefaultInstance() : task_;
      }
    }
    /**
     * <pre>
     * Task associated with this TaskEvent.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Task task = 2 [json_name = "task"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.taskmanager.v1.Task, com.anduril.taskmanager.v1.Task.Builder, com.anduril.taskmanager.v1.TaskOrBuilder> 
        getTaskFieldBuilder() {
      if (taskBuilder_ == null) {
        taskBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.anduril.taskmanager.v1.Task, com.anduril.taskmanager.v1.Task.Builder, com.anduril.taskmanager.v1.TaskOrBuilder>(
                getTask(),
                getParentForChildren(),
                isClean());
        task_ = null;
      }
      return taskBuilder_;
    }

    private int taskView_ = 0;
    /**
     * <pre>
     * View associated with this task.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.TaskView task_view = 3 [json_name = "taskView"];</code>
     * @return The enum numeric value on the wire for taskView.
     */
    @java.lang.Override public int getTaskViewValue() {
      return taskView_;
    }
    /**
     * <pre>
     * View associated with this task.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.TaskView task_view = 3 [json_name = "taskView"];</code>
     * @param value The enum numeric value on the wire for taskView to set.
     * @return This builder for chaining.
     */
    public Builder setTaskViewValue(int value) {
      taskView_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * View associated with this task.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.TaskView task_view = 3 [json_name = "taskView"];</code>
     * @return The taskView.
     */
    @java.lang.Override
    public com.anduril.taskmanager.v1.TaskView getTaskView() {
      com.anduril.taskmanager.v1.TaskView result = com.anduril.taskmanager.v1.TaskView.forNumber(taskView_);
      return result == null ? com.anduril.taskmanager.v1.TaskView.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * View associated with this task.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.TaskView task_view = 3 [json_name = "taskView"];</code>
     * @param value The taskView to set.
     * @return This builder for chaining.
     */
    public Builder setTaskView(com.anduril.taskmanager.v1.TaskView value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      taskView_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * View associated with this task.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.TaskView task_view = 3 [json_name = "taskView"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTaskView() {
      bitField0_ = (bitField0_ & ~0x00000004);
      taskView_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp time_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timeBuilder_;
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
    public boolean hasTime() {
      return ((bitField0_ & 0x00000008) != 0);
    }
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
    public com.google.protobuf.Timestamp getTime() {
      if (timeBuilder_ == null) {
        return time_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : time_;
      } else {
        return timeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * ===== Time Series Updates =====
     *
     * Timestamp for time-series to index.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 4 [json_name = "time"];</code>
     */
    public Builder setTime(com.google.protobuf.Timestamp value) {
      if (timeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        time_ = value;
      } else {
        timeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ===== Time Series Updates =====
     *
     * Timestamp for time-series to index.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 4 [json_name = "time"];</code>
     */
    public Builder setTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timeBuilder_ == null) {
        time_ = builderForValue.build();
      } else {
        timeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ===== Time Series Updates =====
     *
     * Timestamp for time-series to index.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 4 [json_name = "time"];</code>
     */
    public Builder mergeTime(com.google.protobuf.Timestamp value) {
      if (timeBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          time_ != null &&
          time_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getTimeBuilder().mergeFrom(value);
        } else {
          time_ = value;
        }
      } else {
        timeBuilder_.mergeFrom(value);
      }
      if (time_ != null) {
        bitField0_ |= 0x00000008;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * ===== Time Series Updates =====
     *
     * Timestamp for time-series to index.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 4 [json_name = "time"];</code>
     */
    public Builder clearTime() {
      bitField0_ = (bitField0_ & ~0x00000008);
      time_ = null;
      if (timeBuilder_ != null) {
        timeBuilder_.dispose();
        timeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ===== Time Series Updates =====
     *
     * Timestamp for time-series to index.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 4 [json_name = "time"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimeBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * ===== Time Series Updates =====
     *
     * Timestamp for time-series to index.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 4 [json_name = "time"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimeOrBuilder() {
      if (timeBuilder_ != null) {
        return timeBuilder_.getMessageOrBuilder();
      } else {
        return time_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : time_;
      }
    }
    /**
     * <pre>
     * ===== Time Series Updates =====
     *
     * Timestamp for time-series to index.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp time = 4 [json_name = "time"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimeFieldBuilder() {
      if (timeBuilder_ == null) {
        timeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTime(),
                getParentForChildren(),
                isClean());
        time_ = null;
      }
      return timeBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:anduril.taskmanager.v1.TaskEvent)
  }

  // @@protoc_insertion_point(class_scope:anduril.taskmanager.v1.TaskEvent)
  private static final com.anduril.taskmanager.v1.TaskEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.taskmanager.v1.TaskEvent();
  }

  public static com.anduril.taskmanager.v1.TaskEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskEvent>
      PARSER = new com.google.protobuf.AbstractParser<TaskEvent>() {
    @java.lang.Override
    public TaskEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<TaskEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.taskmanager.v1.TaskEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

