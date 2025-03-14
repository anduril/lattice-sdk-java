// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/taskmanager/v1/task_manager_grpcapi.pub.proto

package com.anduril.taskmanager.v1;

/**
 * <pre>
 * Response to a Query Task request.
 * </pre>
 *
 * Protobuf type {@code anduril.taskmanager.v1.QueryTasksResponse}
 */
public final class QueryTasksResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.taskmanager.v1.QueryTasksResponse)
    QueryTasksResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryTasksResponse.newBuilder() to construct.
  private QueryTasksResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryTasksResponse() {
    tasks_ = java.util.Collections.emptyList();
    pageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryTasksResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.taskmanager.v1.TaskManagerGrpcapiPubProto.internal_static_anduril_taskmanager_v1_QueryTasksResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.taskmanager.v1.TaskManagerGrpcapiPubProto.internal_static_anduril_taskmanager_v1_QueryTasksResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.taskmanager.v1.QueryTasksResponse.class, com.anduril.taskmanager.v1.QueryTasksResponse.Builder.class);
  }

  public static final int TASKS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.anduril.taskmanager.v1.Task> tasks_;
  /**
   * <pre>
   * Tasks matching the Query Task request.
   * </pre>
   *
   * <code>repeated .anduril.taskmanager.v1.Task tasks = 1 [json_name = "tasks"];</code>
   */
  @java.lang.Override
  public java.util.List<com.anduril.taskmanager.v1.Task> getTasksList() {
    return tasks_;
  }
  /**
   * <pre>
   * Tasks matching the Query Task request.
   * </pre>
   *
   * <code>repeated .anduril.taskmanager.v1.Task tasks = 1 [json_name = "tasks"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.anduril.taskmanager.v1.TaskOrBuilder> 
      getTasksOrBuilderList() {
    return tasks_;
  }
  /**
   * <pre>
   * Tasks matching the Query Task request.
   * </pre>
   *
   * <code>repeated .anduril.taskmanager.v1.Task tasks = 1 [json_name = "tasks"];</code>
   */
  @java.lang.Override
  public int getTasksCount() {
    return tasks_.size();
  }
  /**
   * <pre>
   * Tasks matching the Query Task request.
   * </pre>
   *
   * <code>repeated .anduril.taskmanager.v1.Task tasks = 1 [json_name = "tasks"];</code>
   */
  @java.lang.Override
  public com.anduril.taskmanager.v1.Task getTasks(int index) {
    return tasks_.get(index);
  }
  /**
   * <pre>
   * Tasks matching the Query Task request.
   * </pre>
   *
   * <code>repeated .anduril.taskmanager.v1.Task tasks = 1 [json_name = "tasks"];</code>
   */
  @java.lang.Override
  public com.anduril.taskmanager.v1.TaskOrBuilder getTasksOrBuilder(
      int index) {
    return tasks_.get(index);
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object pageToken_ = "";
  /**
   * <pre>
   * Page token to the next page of Tasks.
   * </pre>
   *
   * <code>string page_token = 2 [json_name = "pageToken"];</code>
   * @return The pageToken.
   */
  @java.lang.Override
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Page token to the next page of Tasks.
   * </pre>
   *
   * <code>string page_token = 2 [json_name = "pageToken"];</code>
   * @return The bytes for pageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < tasks_.size(); i++) {
      output.writeMessage(1, tasks_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, pageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < tasks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, tasks_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, pageToken_);
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
    if (!(obj instanceof com.anduril.taskmanager.v1.QueryTasksResponse)) {
      return super.equals(obj);
    }
    com.anduril.taskmanager.v1.QueryTasksResponse other = (com.anduril.taskmanager.v1.QueryTasksResponse) obj;

    if (!getTasksList()
        .equals(other.getTasksList())) return false;
    if (!getPageToken()
        .equals(other.getPageToken())) return false;
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
    if (getTasksCount() > 0) {
      hash = (37 * hash) + TASKS_FIELD_NUMBER;
      hash = (53 * hash) + getTasksList().hashCode();
    }
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.taskmanager.v1.QueryTasksResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.taskmanager.v1.QueryTasksResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.QueryTasksResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.taskmanager.v1.QueryTasksResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.QueryTasksResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.taskmanager.v1.QueryTasksResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.QueryTasksResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.taskmanager.v1.QueryTasksResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.QueryTasksResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.taskmanager.v1.QueryTasksResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.QueryTasksResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.taskmanager.v1.QueryTasksResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.anduril.taskmanager.v1.QueryTasksResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Response to a Query Task request.
   * </pre>
   *
   * Protobuf type {@code anduril.taskmanager.v1.QueryTasksResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.taskmanager.v1.QueryTasksResponse)
      com.anduril.taskmanager.v1.QueryTasksResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.taskmanager.v1.TaskManagerGrpcapiPubProto.internal_static_anduril_taskmanager_v1_QueryTasksResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.taskmanager.v1.TaskManagerGrpcapiPubProto.internal_static_anduril_taskmanager_v1_QueryTasksResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.taskmanager.v1.QueryTasksResponse.class, com.anduril.taskmanager.v1.QueryTasksResponse.Builder.class);
    }

    // Construct using com.anduril.taskmanager.v1.QueryTasksResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (tasksBuilder_ == null) {
        tasks_ = java.util.Collections.emptyList();
      } else {
        tasks_ = null;
        tasksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      pageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.taskmanager.v1.TaskManagerGrpcapiPubProto.internal_static_anduril_taskmanager_v1_QueryTasksResponse_descriptor;
    }

    @java.lang.Override
    public com.anduril.taskmanager.v1.QueryTasksResponse getDefaultInstanceForType() {
      return com.anduril.taskmanager.v1.QueryTasksResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.taskmanager.v1.QueryTasksResponse build() {
      com.anduril.taskmanager.v1.QueryTasksResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.taskmanager.v1.QueryTasksResponse buildPartial() {
      com.anduril.taskmanager.v1.QueryTasksResponse result = new com.anduril.taskmanager.v1.QueryTasksResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.anduril.taskmanager.v1.QueryTasksResponse result) {
      if (tasksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tasks_ = java.util.Collections.unmodifiableList(tasks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tasks_ = tasks_;
      } else {
        result.tasks_ = tasksBuilder_.build();
      }
    }

    private void buildPartial0(com.anduril.taskmanager.v1.QueryTasksResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pageToken_ = pageToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.taskmanager.v1.QueryTasksResponse) {
        return mergeFrom((com.anduril.taskmanager.v1.QueryTasksResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.taskmanager.v1.QueryTasksResponse other) {
      if (other == com.anduril.taskmanager.v1.QueryTasksResponse.getDefaultInstance()) return this;
      if (tasksBuilder_ == null) {
        if (!other.tasks_.isEmpty()) {
          if (tasks_.isEmpty()) {
            tasks_ = other.tasks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTasksIsMutable();
            tasks_.addAll(other.tasks_);
          }
          onChanged();
        }
      } else {
        if (!other.tasks_.isEmpty()) {
          if (tasksBuilder_.isEmpty()) {
            tasksBuilder_.dispose();
            tasksBuilder_ = null;
            tasks_ = other.tasks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tasksBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTasksFieldBuilder() : null;
          } else {
            tasksBuilder_.addAllMessages(other.tasks_);
          }
        }
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
        bitField0_ |= 0x00000002;
        onChanged();
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
              com.anduril.taskmanager.v1.Task m =
                  input.readMessage(
                      com.anduril.taskmanager.v1.Task.parser(),
                      extensionRegistry);
              if (tasksBuilder_ == null) {
                ensureTasksIsMutable();
                tasks_.add(m);
              } else {
                tasksBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              pageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.util.List<com.anduril.taskmanager.v1.Task> tasks_ =
      java.util.Collections.emptyList();
    private void ensureTasksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tasks_ = new java.util.ArrayList<com.anduril.taskmanager.v1.Task>(tasks_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.anduril.taskmanager.v1.Task, com.anduril.taskmanager.v1.Task.Builder, com.anduril.taskmanager.v1.TaskOrBuilder> tasksBuilder_;

    /**
     * <pre>
     * Tasks matching the Query Task request.
     * </pre>
     *
     * <code>repeated .anduril.taskmanager.v1.Task tasks = 1 [json_name = "tasks"];</code>
     */
    public java.util.List<com.anduril.taskmanager.v1.Task> getTasksList() {
      if (tasksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tasks_);
      } else {
        return tasksBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Tasks matching the Query Task request.
     * </pre>
     *
     * <code>repeated .anduril.taskmanager.v1.Task tasks = 1 [json_name = "tasks"];</code>
     */
    public int getTasksCount() {
      if (tasksBuilder_ == null) {
        return tasks_.size();
      } else {
        return tasksBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Tasks matching the Query Task request.
     * </pre>
     *
     * <code>repeated .anduril.taskmanager.v1.Task tasks = 1 [json_name = "tasks"];</code>
     */
    public com.anduril.taskmanager.v1.Task getTasks(int index) {
      if (tasksBuilder_ == null) {
        return tasks_.get(index);
      } else {
        return tasksBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Tasks matching the Query Task request.
     * </pre>
     *
     * <code>repeated .anduril.taskmanager.v1.Task tasks = 1 [json_name = "tasks"];</code>
     */
    public Builder setTasks(
        int index, com.anduril.taskmanager.v1.Task value) {
      if (tasksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTasksIsMutable();
        tasks_.set(index, value);
        onChanged();
      } else {
        tasksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Tasks matching the Query Task request.
     * </pre>
     *
     * <code>repeated .anduril.taskmanager.v1.Task tasks = 1 [json_name = "tasks"];</code>
     */
    public Builder setTasks(
        int index, com.anduril.taskmanager.v1.Task.Builder builderForValue) {
      if (tasksBuilder_ == null) {
        ensureTasksIsMutable();
        tasks_.set(index, builderForValue.build());
        onChanged();
      } else {
        tasksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Tasks matching the Query Task request.
     * </pre>
     *
     * <code>repeated .anduril.taskmanager.v1.Task tasks = 1 [json_name = "tasks"];</code>
     */
    public Builder addTasks(com.anduril.taskmanager.v1.Task value) {
      if (tasksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTasksIsMutable();
        tasks_.add(value);
        onChanged();
      } else {
        tasksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Tasks matching the Query Task request.
     * </pre>
     *
     * <code>repeated .anduril.taskmanager.v1.Task tasks = 1 [json_name = "tasks"];</code>
     */
    public Builder addTasks(
        int index, com.anduril.taskmanager.v1.Task value) {
      if (tasksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTasksIsMutable();
        tasks_.add(index, value);
        onChanged();
      } else {
        tasksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Tasks matching the Query Task request.
     * </pre>
     *
     * <code>repeated .anduril.taskmanager.v1.Task tasks = 1 [json_name = "tasks"];</code>
     */
    public Builder addTasks(
        com.anduril.taskmanager.v1.Task.Builder builderForValue) {
      if (tasksBuilder_ == null) {
        ensureTasksIsMutable();
        tasks_.add(builderForValue.build());
        onChanged();
      } else {
        tasksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Tasks matching the Query Task request.
     * </pre>
     *
     * <code>repeated .anduril.taskmanager.v1.Task tasks = 1 [json_name = "tasks"];</code>
     */
    public Builder addTasks(
        int index, com.anduril.taskmanager.v1.Task.Builder builderForValue) {
      if (tasksBuilder_ == null) {
        ensureTasksIsMutable();
        tasks_.add(index, builderForValue.build());
        onChanged();
      } else {
        tasksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Tasks matching the Query Task request.
     * </pre>
     *
     * <code>repeated .anduril.taskmanager.v1.Task tasks = 1 [json_name = "tasks"];</code>
     */
    public Builder addAllTasks(
        java.lang.Iterable<? extends com.anduril.taskmanager.v1.Task> values) {
      if (tasksBuilder_ == null) {
        ensureTasksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tasks_);
        onChanged();
      } else {
        tasksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Tasks matching the Query Task request.
     * </pre>
     *
     * <code>repeated .anduril.taskmanager.v1.Task tasks = 1 [json_name = "tasks"];</code>
     */
    public Builder clearTasks() {
      if (tasksBuilder_ == null) {
        tasks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tasksBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Tasks matching the Query Task request.
     * </pre>
     *
     * <code>repeated .anduril.taskmanager.v1.Task tasks = 1 [json_name = "tasks"];</code>
     */
    public Builder removeTasks(int index) {
      if (tasksBuilder_ == null) {
        ensureTasksIsMutable();
        tasks_.remove(index);
        onChanged();
      } else {
        tasksBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Tasks matching the Query Task request.
     * </pre>
     *
     * <code>repeated .anduril.taskmanager.v1.Task tasks = 1 [json_name = "tasks"];</code>
     */
    public com.anduril.taskmanager.v1.Task.Builder getTasksBuilder(
        int index) {
      return getTasksFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Tasks matching the Query Task request.
     * </pre>
     *
     * <code>repeated .anduril.taskmanager.v1.Task tasks = 1 [json_name = "tasks"];</code>
     */
    public com.anduril.taskmanager.v1.TaskOrBuilder getTasksOrBuilder(
        int index) {
      if (tasksBuilder_ == null) {
        return tasks_.get(index);  } else {
        return tasksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Tasks matching the Query Task request.
     * </pre>
     *
     * <code>repeated .anduril.taskmanager.v1.Task tasks = 1 [json_name = "tasks"];</code>
     */
    public java.util.List<? extends com.anduril.taskmanager.v1.TaskOrBuilder> 
         getTasksOrBuilderList() {
      if (tasksBuilder_ != null) {
        return tasksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tasks_);
      }
    }
    /**
     * <pre>
     * Tasks matching the Query Task request.
     * </pre>
     *
     * <code>repeated .anduril.taskmanager.v1.Task tasks = 1 [json_name = "tasks"];</code>
     */
    public com.anduril.taskmanager.v1.Task.Builder addTasksBuilder() {
      return getTasksFieldBuilder().addBuilder(
          com.anduril.taskmanager.v1.Task.getDefaultInstance());
    }
    /**
     * <pre>
     * Tasks matching the Query Task request.
     * </pre>
     *
     * <code>repeated .anduril.taskmanager.v1.Task tasks = 1 [json_name = "tasks"];</code>
     */
    public com.anduril.taskmanager.v1.Task.Builder addTasksBuilder(
        int index) {
      return getTasksFieldBuilder().addBuilder(
          index, com.anduril.taskmanager.v1.Task.getDefaultInstance());
    }
    /**
     * <pre>
     * Tasks matching the Query Task request.
     * </pre>
     *
     * <code>repeated .anduril.taskmanager.v1.Task tasks = 1 [json_name = "tasks"];</code>
     */
    public java.util.List<com.anduril.taskmanager.v1.Task.Builder> 
         getTasksBuilderList() {
      return getTasksFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.anduril.taskmanager.v1.Task, com.anduril.taskmanager.v1.Task.Builder, com.anduril.taskmanager.v1.TaskOrBuilder> 
        getTasksFieldBuilder() {
      if (tasksBuilder_ == null) {
        tasksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.anduril.taskmanager.v1.Task, com.anduril.taskmanager.v1.Task.Builder, com.anduril.taskmanager.v1.TaskOrBuilder>(
                tasks_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        tasks_ = null;
      }
      return tasksBuilder_;
    }

    private java.lang.Object pageToken_ = "";
    /**
     * <pre>
     * Page token to the next page of Tasks.
     * </pre>
     *
     * <code>string page_token = 2 [json_name = "pageToken"];</code>
     * @return The pageToken.
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Page token to the next page of Tasks.
     * </pre>
     *
     * <code>string page_token = 2 [json_name = "pageToken"];</code>
     * @return The bytes for pageToken.
     */
    public com.google.protobuf.ByteString
        getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Page token to the next page of Tasks.
     * </pre>
     *
     * <code>string page_token = 2 [json_name = "pageToken"];</code>
     * @param value The pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      pageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Page token to the next page of Tasks.
     * </pre>
     *
     * <code>string page_token = 2 [json_name = "pageToken"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPageToken() {
      pageToken_ = getDefaultInstance().getPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Page token to the next page of Tasks.
     * </pre>
     *
     * <code>string page_token = 2 [json_name = "pageToken"];</code>
     * @param value The bytes for pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      pageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:anduril.taskmanager.v1.QueryTasksResponse)
  }

  // @@protoc_insertion_point(class_scope:anduril.taskmanager.v1.QueryTasksResponse)
  private static final com.anduril.taskmanager.v1.QueryTasksResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.taskmanager.v1.QueryTasksResponse();
  }

  public static com.anduril.taskmanager.v1.QueryTasksResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryTasksResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryTasksResponse>() {
    @java.lang.Override
    public QueryTasksResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryTasksResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryTasksResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.taskmanager.v1.QueryTasksResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

