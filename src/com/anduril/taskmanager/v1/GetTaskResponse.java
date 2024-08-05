// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/taskmanager/v1/task_manager_api.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.taskmanager.v1;

/**
 * <pre>
 * Response to a Get Task request.
 * </pre>
 *
 * Protobuf type {@code anduril.taskmanager.v1.GetTaskResponse}
 */
public final class GetTaskResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:anduril.taskmanager.v1.GetTaskResponse)
    GetTaskResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      GetTaskResponse.class.getName());
  }
  // Use GetTaskResponse.newBuilder() to construct.
  private GetTaskResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetTaskResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.taskmanager.v1.TaskManagerApiPubProto.internal_static_anduril_taskmanager_v1_GetTaskResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.taskmanager.v1.TaskManagerApiPubProto.internal_static_anduril_taskmanager_v1_GetTaskResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.taskmanager.v1.GetTaskResponse.class, com.anduril.taskmanager.v1.GetTaskResponse.Builder.class);
  }

  private int bitField0_;
  public static final int TASK_FIELD_NUMBER = 1;
  private com.anduril.taskmanager.v1.Task task_;
  /**
   * <pre>
   * Task that received.
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
   * Task that received.
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
   * Task that received.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Task task = 1 [json_name = "task"];</code>
   */
  @java.lang.Override
  public com.anduril.taskmanager.v1.TaskOrBuilder getTaskOrBuilder() {
    return task_ == null ? com.anduril.taskmanager.v1.Task.getDefaultInstance() : task_;
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
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.anduril.taskmanager.v1.GetTaskResponse)) {
      return super.equals(obj);
    }
    com.anduril.taskmanager.v1.GetTaskResponse other = (com.anduril.taskmanager.v1.GetTaskResponse) obj;

    if (hasTask() != other.hasTask()) return false;
    if (hasTask()) {
      if (!getTask()
          .equals(other.getTask())) return false;
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
    if (hasTask()) {
      hash = (37 * hash) + TASK_FIELD_NUMBER;
      hash = (53 * hash) + getTask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.taskmanager.v1.GetTaskResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.taskmanager.v1.GetTaskResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.GetTaskResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.taskmanager.v1.GetTaskResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.GetTaskResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.taskmanager.v1.GetTaskResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.GetTaskResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.taskmanager.v1.GetTaskResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.taskmanager.v1.GetTaskResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.taskmanager.v1.GetTaskResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.GetTaskResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.taskmanager.v1.GetTaskResponse parseFrom(
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
  public static Builder newBuilder(com.anduril.taskmanager.v1.GetTaskResponse prototype) {
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
   * Response to a Get Task request.
   * </pre>
   *
   * Protobuf type {@code anduril.taskmanager.v1.GetTaskResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.taskmanager.v1.GetTaskResponse)
      com.anduril.taskmanager.v1.GetTaskResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.taskmanager.v1.TaskManagerApiPubProto.internal_static_anduril_taskmanager_v1_GetTaskResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.taskmanager.v1.TaskManagerApiPubProto.internal_static_anduril_taskmanager_v1_GetTaskResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.taskmanager.v1.GetTaskResponse.class, com.anduril.taskmanager.v1.GetTaskResponse.Builder.class);
    }

    // Construct using com.anduril.taskmanager.v1.GetTaskResponse.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.taskmanager.v1.TaskManagerApiPubProto.internal_static_anduril_taskmanager_v1_GetTaskResponse_descriptor;
    }

    @java.lang.Override
    public com.anduril.taskmanager.v1.GetTaskResponse getDefaultInstanceForType() {
      return com.anduril.taskmanager.v1.GetTaskResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.taskmanager.v1.GetTaskResponse build() {
      com.anduril.taskmanager.v1.GetTaskResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.taskmanager.v1.GetTaskResponse buildPartial() {
      com.anduril.taskmanager.v1.GetTaskResponse result = new com.anduril.taskmanager.v1.GetTaskResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.taskmanager.v1.GetTaskResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.task_ = taskBuilder_ == null
            ? task_
            : taskBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.taskmanager.v1.GetTaskResponse) {
        return mergeFrom((com.anduril.taskmanager.v1.GetTaskResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.taskmanager.v1.GetTaskResponse other) {
      if (other == com.anduril.taskmanager.v1.GetTaskResponse.getDefaultInstance()) return this;
      if (other.hasTask()) {
        mergeTask(other.getTask());
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
     * Task that received.
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
     * Task that received.
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
     * Task that received.
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
     * Task that received.
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
     * Task that received.
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
     * Task that received.
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
     * Task that received.
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
     * Task that received.
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
     * Task that received.
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

    // @@protoc_insertion_point(builder_scope:anduril.taskmanager.v1.GetTaskResponse)
  }

  // @@protoc_insertion_point(class_scope:anduril.taskmanager.v1.GetTaskResponse)
  private static final com.anduril.taskmanager.v1.GetTaskResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.taskmanager.v1.GetTaskResponse();
  }

  public static com.anduril.taskmanager.v1.GetTaskResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTaskResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetTaskResponse>() {
    @java.lang.Override
    public GetTaskResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetTaskResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTaskResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.taskmanager.v1.GetTaskResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

