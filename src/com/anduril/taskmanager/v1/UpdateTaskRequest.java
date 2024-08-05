// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/taskmanager/v1/task_manager_api.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.taskmanager.v1;

/**
 * <pre>
 * Request to update a Task.
 * </pre>
 *
 * Protobuf type {@code anduril.taskmanager.v1.UpdateTaskRequest}
 */
public final class UpdateTaskRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:anduril.taskmanager.v1.UpdateTaskRequest)
    UpdateTaskRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      UpdateTaskRequest.class.getName());
  }
  // Use UpdateTaskRequest.newBuilder() to construct.
  private UpdateTaskRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UpdateTaskRequest() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.taskmanager.v1.TaskManagerApiPubProto.internal_static_anduril_taskmanager_v1_UpdateTaskRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.taskmanager.v1.TaskManagerApiPubProto.internal_static_anduril_taskmanager_v1_UpdateTaskRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.taskmanager.v1.UpdateTaskRequest.class, com.anduril.taskmanager.v1.UpdateTaskRequest.Builder.class);
  }

  private int bitField0_;
  public static final int TASK_FIELD_NUMBER = 1;
  private com.anduril.taskmanager.v1.Task task_;
  /**
   * <pre>
   * New Task definition.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Task task = 1 [json_name = "task"];</code>
   * @return Whether the task field is set.
   */
  @java.lang.Override
  public boolean hasTask() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * New Task definition.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Task task = 1 [json_name = "task"];</code>
   * @return The task.
   */
  @java.lang.Override
  public com.anduril.taskmanager.v1.Task getTask() {
    return task_ == null ? com.anduril.taskmanager.v1.Task.getDefaultInstance() : task_;
  }
  /**
   * <pre>
   * New Task definition.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Task task = 1 [json_name = "task"];</code>
   */
  @java.lang.Override
  public com.anduril.taskmanager.v1.TaskOrBuilder getTaskOrBuilder() {
    return task_ == null ? com.anduril.taskmanager.v1.Task.getDefaultInstance() : task_;
  }

  public static final int IS_EXECUTED_ELSEWHERE_FIELD_NUMBER = 7;
  private boolean isExecutedElsewhere_ = false;
  /**
   * <pre>
   * If set, execution of this Task is managed elsewhere, not by task-manager.
   * In other words, Task Manager will not attempt to update the assigned agent with execution instructions.
   * We note that this will also override the existing is_executed_elsewhere value in the Task
   * object provided in this request.
   * </pre>
   *
   * <code>bool is_executed_elsewhere = 7 [json_name = "isExecutedElsewhere"];</code>
   * @return The isExecutedElsewhere.
   */
  @java.lang.Override
  public boolean getIsExecutedElsewhere() {
    return isExecutedElsewhere_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getTask());
    }
    if (isExecutedElsewhere_ != false) {
      output.writeBool(7, isExecutedElsewhere_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTask());
    }
    if (isExecutedElsewhere_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, isExecutedElsewhere_);
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
    if (!(obj instanceof com.anduril.taskmanager.v1.UpdateTaskRequest)) {
      return super.equals(obj);
    }
    com.anduril.taskmanager.v1.UpdateTaskRequest other = (com.anduril.taskmanager.v1.UpdateTaskRequest) obj;

    if (hasTask() != other.hasTask()) return false;
    if (hasTask()) {
      if (!getTask()
          .equals(other.getTask())) return false;
    }
    if (getIsExecutedElsewhere()
        != other.getIsExecutedElsewhere()) return false;
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
    if (hasTask()) {
      hash = (37 * hash) + TASK_FIELD_NUMBER;
      hash = (53 * hash) + getTask().hashCode();
    }
    hash = (37 * hash) + IS_EXECUTED_ELSEWHERE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsExecutedElsewhere());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.taskmanager.v1.UpdateTaskRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.taskmanager.v1.UpdateTaskRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.UpdateTaskRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.taskmanager.v1.UpdateTaskRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.UpdateTaskRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.taskmanager.v1.UpdateTaskRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.UpdateTaskRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.taskmanager.v1.UpdateTaskRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.taskmanager.v1.UpdateTaskRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.taskmanager.v1.UpdateTaskRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.UpdateTaskRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.taskmanager.v1.UpdateTaskRequest parseFrom(
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
  public static Builder newBuilder(com.anduril.taskmanager.v1.UpdateTaskRequest prototype) {
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
   * Request to update a Task.
   * </pre>
   *
   * Protobuf type {@code anduril.taskmanager.v1.UpdateTaskRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.taskmanager.v1.UpdateTaskRequest)
      com.anduril.taskmanager.v1.UpdateTaskRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.taskmanager.v1.TaskManagerApiPubProto.internal_static_anduril_taskmanager_v1_UpdateTaskRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.taskmanager.v1.TaskManagerApiPubProto.internal_static_anduril_taskmanager_v1_UpdateTaskRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.taskmanager.v1.UpdateTaskRequest.class, com.anduril.taskmanager.v1.UpdateTaskRequest.Builder.class);
    }

    // Construct using com.anduril.taskmanager.v1.UpdateTaskRequest.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      task_ = null;
      if (taskBuilder_ != null) {
        taskBuilder_.dispose();
        taskBuilder_ = null;
      }
      isExecutedElsewhere_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.taskmanager.v1.TaskManagerApiPubProto.internal_static_anduril_taskmanager_v1_UpdateTaskRequest_descriptor;
    }

    @java.lang.Override
    public com.anduril.taskmanager.v1.UpdateTaskRequest getDefaultInstanceForType() {
      return com.anduril.taskmanager.v1.UpdateTaskRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.taskmanager.v1.UpdateTaskRequest build() {
      com.anduril.taskmanager.v1.UpdateTaskRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.taskmanager.v1.UpdateTaskRequest buildPartial() {
      com.anduril.taskmanager.v1.UpdateTaskRequest result = new com.anduril.taskmanager.v1.UpdateTaskRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.taskmanager.v1.UpdateTaskRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.task_ = taskBuilder_ == null
            ? task_
            : taskBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.isExecutedElsewhere_ = isExecutedElsewhere_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.taskmanager.v1.UpdateTaskRequest) {
        return mergeFrom((com.anduril.taskmanager.v1.UpdateTaskRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.taskmanager.v1.UpdateTaskRequest other) {
      if (other == com.anduril.taskmanager.v1.UpdateTaskRequest.getDefaultInstance()) return this;
      if (other.hasTask()) {
        mergeTask(other.getTask());
      }
      if (other.getIsExecutedElsewhere() != false) {
        setIsExecutedElsewhere(other.getIsExecutedElsewhere());
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
            case 10: {
              input.readMessage(
                  getTaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 56: {
              isExecutedElsewhere_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 56
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

    private com.anduril.taskmanager.v1.Task task_;
    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.taskmanager.v1.Task, com.anduril.taskmanager.v1.Task.Builder, com.anduril.taskmanager.v1.TaskOrBuilder> taskBuilder_;
    /**
     * <pre>
     * New Task definition.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Task task = 1 [json_name = "task"];</code>
     * @return Whether the task field is set.
     */
    public boolean hasTask() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * New Task definition.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Task task = 1 [json_name = "task"];</code>
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
     * New Task definition.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Task task = 1 [json_name = "task"];</code>
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * New Task definition.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Task task = 1 [json_name = "task"];</code>
     */
    public Builder setTask(
        com.anduril.taskmanager.v1.Task.Builder builderForValue) {
      if (taskBuilder_ == null) {
        task_ = builderForValue.build();
      } else {
        taskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * New Task definition.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Task task = 1 [json_name = "task"];</code>
     */
    public Builder mergeTask(com.anduril.taskmanager.v1.Task value) {
      if (taskBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
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
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * New Task definition.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Task task = 1 [json_name = "task"];</code>
     */
    public Builder clearTask() {
      bitField0_ = (bitField0_ & ~0x00000001);
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
     * New Task definition.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Task task = 1 [json_name = "task"];</code>
     */
    public com.anduril.taskmanager.v1.Task.Builder getTaskBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * New Task definition.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Task task = 1 [json_name = "task"];</code>
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
     * New Task definition.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Task task = 1 [json_name = "task"];</code>
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

    private boolean isExecutedElsewhere_ ;
    /**
     * <pre>
     * If set, execution of this Task is managed elsewhere, not by task-manager.
     * In other words, Task Manager will not attempt to update the assigned agent with execution instructions.
     * We note that this will also override the existing is_executed_elsewhere value in the Task
     * object provided in this request.
     * </pre>
     *
     * <code>bool is_executed_elsewhere = 7 [json_name = "isExecutedElsewhere"];</code>
     * @return The isExecutedElsewhere.
     */
    @java.lang.Override
    public boolean getIsExecutedElsewhere() {
      return isExecutedElsewhere_;
    }
    /**
     * <pre>
     * If set, execution of this Task is managed elsewhere, not by task-manager.
     * In other words, Task Manager will not attempt to update the assigned agent with execution instructions.
     * We note that this will also override the existing is_executed_elsewhere value in the Task
     * object provided in this request.
     * </pre>
     *
     * <code>bool is_executed_elsewhere = 7 [json_name = "isExecutedElsewhere"];</code>
     * @param value The isExecutedElsewhere to set.
     * @return This builder for chaining.
     */
    public Builder setIsExecutedElsewhere(boolean value) {

      isExecutedElsewhere_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, execution of this Task is managed elsewhere, not by task-manager.
     * In other words, Task Manager will not attempt to update the assigned agent with execution instructions.
     * We note that this will also override the existing is_executed_elsewhere value in the Task
     * object provided in this request.
     * </pre>
     *
     * <code>bool is_executed_elsewhere = 7 [json_name = "isExecutedElsewhere"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIsExecutedElsewhere() {
      bitField0_ = (bitField0_ & ~0x00000002);
      isExecutedElsewhere_ = false;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:anduril.taskmanager.v1.UpdateTaskRequest)
  }

  // @@protoc_insertion_point(class_scope:anduril.taskmanager.v1.UpdateTaskRequest)
  private static final com.anduril.taskmanager.v1.UpdateTaskRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.taskmanager.v1.UpdateTaskRequest();
  }

  public static com.anduril.taskmanager.v1.UpdateTaskRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateTaskRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateTaskRequest>() {
    @java.lang.Override
    public UpdateTaskRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateTaskRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateTaskRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.taskmanager.v1.UpdateTaskRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

