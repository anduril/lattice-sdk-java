// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/taskmanager/v1/task_api.pub.proto

package com.anduril.taskmanager.v1;

/**
 * <pre>
 * Request to Cancel a Task.
 * </pre>
 *
 * Protobuf type {@code anduril.taskmanager.v1.CancelRequest}
 */
public final class CancelRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.taskmanager.v1.CancelRequest)
    CancelRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CancelRequest.newBuilder() to construct.
  private CancelRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CancelRequest() {
    taskId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CancelRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.taskmanager.v1.TaskApiPubProto.internal_static_anduril_taskmanager_v1_CancelRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.taskmanager.v1.TaskApiPubProto.internal_static_anduril_taskmanager_v1_CancelRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.taskmanager.v1.CancelRequest.class, com.anduril.taskmanager.v1.CancelRequest.Builder.class);
  }

  public static final int TASK_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object taskId_ = "";
  /**
   * <pre>
   * ID of the Task to cancel.
   * </pre>
   *
   * <code>string task_id = 1 [json_name = "taskId"];</code>
   * @return The taskId.
   */
  @java.lang.Override
  public java.lang.String getTaskId() {
    java.lang.Object ref = taskId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      taskId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * ID of the Task to cancel.
   * </pre>
   *
   * <code>string task_id = 1 [json_name = "taskId"];</code>
   * @return The bytes for taskId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTaskIdBytes() {
    java.lang.Object ref = taskId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      taskId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASSIGNEE_FIELD_NUMBER = 2;
  private com.anduril.taskmanager.v1.Principal assignee_;
  /**
   * <pre>
   * The assignee of the Task. Useful for agent routing where an endpoint owns multiple agents,
   * especially onBehalfOf assignees.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Principal assignee = 2 [json_name = "assignee"];</code>
   * @return Whether the assignee field is set.
   */
  @java.lang.Override
  public boolean hasAssignee() {
    return assignee_ != null;
  }
  /**
   * <pre>
   * The assignee of the Task. Useful for agent routing where an endpoint owns multiple agents,
   * especially onBehalfOf assignees.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Principal assignee = 2 [json_name = "assignee"];</code>
   * @return The assignee.
   */
  @java.lang.Override
  public com.anduril.taskmanager.v1.Principal getAssignee() {
    return assignee_ == null ? com.anduril.taskmanager.v1.Principal.getDefaultInstance() : assignee_;
  }
  /**
   * <pre>
   * The assignee of the Task. Useful for agent routing where an endpoint owns multiple agents,
   * especially onBehalfOf assignees.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Principal assignee = 2 [json_name = "assignee"];</code>
   */
  @java.lang.Override
  public com.anduril.taskmanager.v1.PrincipalOrBuilder getAssigneeOrBuilder() {
    return assignee_ == null ? com.anduril.taskmanager.v1.Principal.getDefaultInstance() : assignee_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(taskId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, taskId_);
    }
    if (assignee_ != null) {
      output.writeMessage(2, getAssignee());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(taskId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, taskId_);
    }
    if (assignee_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAssignee());
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
    if (!(obj instanceof com.anduril.taskmanager.v1.CancelRequest)) {
      return super.equals(obj);
    }
    com.anduril.taskmanager.v1.CancelRequest other = (com.anduril.taskmanager.v1.CancelRequest) obj;

    if (!getTaskId()
        .equals(other.getTaskId())) return false;
    if (hasAssignee() != other.hasAssignee()) return false;
    if (hasAssignee()) {
      if (!getAssignee()
          .equals(other.getAssignee())) return false;
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
    hash = (37 * hash) + TASK_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTaskId().hashCode();
    if (hasAssignee()) {
      hash = (37 * hash) + ASSIGNEE_FIELD_NUMBER;
      hash = (53 * hash) + getAssignee().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.taskmanager.v1.CancelRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.taskmanager.v1.CancelRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.CancelRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.taskmanager.v1.CancelRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.CancelRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.taskmanager.v1.CancelRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.CancelRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.taskmanager.v1.CancelRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.CancelRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.taskmanager.v1.CancelRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.CancelRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.taskmanager.v1.CancelRequest parseFrom(
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
  public static Builder newBuilder(com.anduril.taskmanager.v1.CancelRequest prototype) {
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
   * Request to Cancel a Task.
   * </pre>
   *
   * Protobuf type {@code anduril.taskmanager.v1.CancelRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.taskmanager.v1.CancelRequest)
      com.anduril.taskmanager.v1.CancelRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.taskmanager.v1.TaskApiPubProto.internal_static_anduril_taskmanager_v1_CancelRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.taskmanager.v1.TaskApiPubProto.internal_static_anduril_taskmanager_v1_CancelRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.taskmanager.v1.CancelRequest.class, com.anduril.taskmanager.v1.CancelRequest.Builder.class);
    }

    // Construct using com.anduril.taskmanager.v1.CancelRequest.newBuilder()
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
      taskId_ = "";
      assignee_ = null;
      if (assigneeBuilder_ != null) {
        assigneeBuilder_.dispose();
        assigneeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.taskmanager.v1.TaskApiPubProto.internal_static_anduril_taskmanager_v1_CancelRequest_descriptor;
    }

    @java.lang.Override
    public com.anduril.taskmanager.v1.CancelRequest getDefaultInstanceForType() {
      return com.anduril.taskmanager.v1.CancelRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.taskmanager.v1.CancelRequest build() {
      com.anduril.taskmanager.v1.CancelRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.taskmanager.v1.CancelRequest buildPartial() {
      com.anduril.taskmanager.v1.CancelRequest result = new com.anduril.taskmanager.v1.CancelRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.taskmanager.v1.CancelRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.taskId_ = taskId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.assignee_ = assigneeBuilder_ == null
            ? assignee_
            : assigneeBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.taskmanager.v1.CancelRequest) {
        return mergeFrom((com.anduril.taskmanager.v1.CancelRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.taskmanager.v1.CancelRequest other) {
      if (other == com.anduril.taskmanager.v1.CancelRequest.getDefaultInstance()) return this;
      if (!other.getTaskId().isEmpty()) {
        taskId_ = other.taskId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAssignee()) {
        mergeAssignee(other.getAssignee());
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
              taskId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAssigneeFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.lang.Object taskId_ = "";
    /**
     * <pre>
     * ID of the Task to cancel.
     * </pre>
     *
     * <code>string task_id = 1 [json_name = "taskId"];</code>
     * @return The taskId.
     */
    public java.lang.String getTaskId() {
      java.lang.Object ref = taskId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        taskId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * ID of the Task to cancel.
     * </pre>
     *
     * <code>string task_id = 1 [json_name = "taskId"];</code>
     * @return The bytes for taskId.
     */
    public com.google.protobuf.ByteString
        getTaskIdBytes() {
      java.lang.Object ref = taskId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        taskId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * ID of the Task to cancel.
     * </pre>
     *
     * <code>string task_id = 1 [json_name = "taskId"];</code>
     * @param value The taskId to set.
     * @return This builder for chaining.
     */
    public Builder setTaskId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      taskId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the Task to cancel.
     * </pre>
     *
     * <code>string task_id = 1 [json_name = "taskId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTaskId() {
      taskId_ = getDefaultInstance().getTaskId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the Task to cancel.
     * </pre>
     *
     * <code>string task_id = 1 [json_name = "taskId"];</code>
     * @param value The bytes for taskId to set.
     * @return This builder for chaining.
     */
    public Builder setTaskIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      taskId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.anduril.taskmanager.v1.Principal assignee_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.taskmanager.v1.Principal, com.anduril.taskmanager.v1.Principal.Builder, com.anduril.taskmanager.v1.PrincipalOrBuilder> assigneeBuilder_;
    /**
     * <pre>
     * The assignee of the Task. Useful for agent routing where an endpoint owns multiple agents,
     * especially onBehalfOf assignees.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Principal assignee = 2 [json_name = "assignee"];</code>
     * @return Whether the assignee field is set.
     */
    public boolean hasAssignee() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The assignee of the Task. Useful for agent routing where an endpoint owns multiple agents,
     * especially onBehalfOf assignees.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Principal assignee = 2 [json_name = "assignee"];</code>
     * @return The assignee.
     */
    public com.anduril.taskmanager.v1.Principal getAssignee() {
      if (assigneeBuilder_ == null) {
        return assignee_ == null ? com.anduril.taskmanager.v1.Principal.getDefaultInstance() : assignee_;
      } else {
        return assigneeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The assignee of the Task. Useful for agent routing where an endpoint owns multiple agents,
     * especially onBehalfOf assignees.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Principal assignee = 2 [json_name = "assignee"];</code>
     */
    public Builder setAssignee(com.anduril.taskmanager.v1.Principal value) {
      if (assigneeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        assignee_ = value;
      } else {
        assigneeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The assignee of the Task. Useful for agent routing where an endpoint owns multiple agents,
     * especially onBehalfOf assignees.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Principal assignee = 2 [json_name = "assignee"];</code>
     */
    public Builder setAssignee(
        com.anduril.taskmanager.v1.Principal.Builder builderForValue) {
      if (assigneeBuilder_ == null) {
        assignee_ = builderForValue.build();
      } else {
        assigneeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The assignee of the Task. Useful for agent routing where an endpoint owns multiple agents,
     * especially onBehalfOf assignees.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Principal assignee = 2 [json_name = "assignee"];</code>
     */
    public Builder mergeAssignee(com.anduril.taskmanager.v1.Principal value) {
      if (assigneeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          assignee_ != null &&
          assignee_ != com.anduril.taskmanager.v1.Principal.getDefaultInstance()) {
          getAssigneeBuilder().mergeFrom(value);
        } else {
          assignee_ = value;
        }
      } else {
        assigneeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The assignee of the Task. Useful for agent routing where an endpoint owns multiple agents,
     * especially onBehalfOf assignees.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Principal assignee = 2 [json_name = "assignee"];</code>
     */
    public Builder clearAssignee() {
      bitField0_ = (bitField0_ & ~0x00000002);
      assignee_ = null;
      if (assigneeBuilder_ != null) {
        assigneeBuilder_.dispose();
        assigneeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The assignee of the Task. Useful for agent routing where an endpoint owns multiple agents,
     * especially onBehalfOf assignees.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Principal assignee = 2 [json_name = "assignee"];</code>
     */
    public com.anduril.taskmanager.v1.Principal.Builder getAssigneeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAssigneeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The assignee of the Task. Useful for agent routing where an endpoint owns multiple agents,
     * especially onBehalfOf assignees.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Principal assignee = 2 [json_name = "assignee"];</code>
     */
    public com.anduril.taskmanager.v1.PrincipalOrBuilder getAssigneeOrBuilder() {
      if (assigneeBuilder_ != null) {
        return assigneeBuilder_.getMessageOrBuilder();
      } else {
        return assignee_ == null ?
            com.anduril.taskmanager.v1.Principal.getDefaultInstance() : assignee_;
      }
    }
    /**
     * <pre>
     * The assignee of the Task. Useful for agent routing where an endpoint owns multiple agents,
     * especially onBehalfOf assignees.
     * </pre>
     *
     * <code>.anduril.taskmanager.v1.Principal assignee = 2 [json_name = "assignee"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.taskmanager.v1.Principal, com.anduril.taskmanager.v1.Principal.Builder, com.anduril.taskmanager.v1.PrincipalOrBuilder> 
        getAssigneeFieldBuilder() {
      if (assigneeBuilder_ == null) {
        assigneeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.taskmanager.v1.Principal, com.anduril.taskmanager.v1.Principal.Builder, com.anduril.taskmanager.v1.PrincipalOrBuilder>(
                getAssignee(),
                getParentForChildren(),
                isClean());
        assignee_ = null;
      }
      return assigneeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.taskmanager.v1.CancelRequest)
  }

  // @@protoc_insertion_point(class_scope:anduril.taskmanager.v1.CancelRequest)
  private static final com.anduril.taskmanager.v1.CancelRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.taskmanager.v1.CancelRequest();
  }

  public static com.anduril.taskmanager.v1.CancelRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CancelRequest>
      PARSER = new com.google.protobuf.AbstractParser<CancelRequest>() {
    @java.lang.Override
    public CancelRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CancelRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CancelRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.taskmanager.v1.CancelRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

