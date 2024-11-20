// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/taskmanager/v1/task_manager_grpcapi.pub.proto

package com.anduril.taskmanager.v1;

/**
 * <pre>
 * Rate limiting / down-sampling parameters.
 * </pre>
 *
 * Protobuf type {@code anduril.taskmanager.v1.RateLimit}
 */
public final class RateLimit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.taskmanager.v1.RateLimit)
    RateLimitOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RateLimit.newBuilder() to construct.
  private RateLimit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RateLimit() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RateLimit();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.taskmanager.v1.TaskManagerGrpcapiPubProto.internal_static_anduril_taskmanager_v1_RateLimit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.taskmanager.v1.TaskManagerGrpcapiPubProto.internal_static_anduril_taskmanager_v1_RateLimit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.taskmanager.v1.RateLimit.class, com.anduril.taskmanager.v1.RateLimit.Builder.class);
  }

  public static final int UPDATE_PER_TASK_LIMIT_MS_FIELD_NUMBER = 1;
  private int updatePerTaskLimitMs_ = 0;
  /**
   * <pre>
   * Specifies a minimum duration in milliseconds after an update for a given task before another one
   * will be sent for the same task.
   * A value of 0 is treated as unset. If set, value must be &gt;= 250.
   * Example: if set to 1000, and 4 events occur (ms since start) at T0, T500, T900, T2100, then
   * event from T0 will be sent at T0, T500 will be dropped, T900 will be sent at minimum of T1000,
   * and T2100 will be sent on time (2100)
   * This will only limit updates, other events will be sent immediately, with a delete clearing anything held
   * </pre>
   *
   * <code>uint32 update_per_task_limit_ms = 1 [json_name = "updatePerTaskLimitMs"];</code>
   * @return The updatePerTaskLimitMs.
   */
  @java.lang.Override
  public int getUpdatePerTaskLimitMs() {
    return updatePerTaskLimitMs_;
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
    if (updatePerTaskLimitMs_ != 0) {
      output.writeUInt32(1, updatePerTaskLimitMs_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (updatePerTaskLimitMs_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, updatePerTaskLimitMs_);
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
    if (!(obj instanceof com.anduril.taskmanager.v1.RateLimit)) {
      return super.equals(obj);
    }
    com.anduril.taskmanager.v1.RateLimit other = (com.anduril.taskmanager.v1.RateLimit) obj;

    if (getUpdatePerTaskLimitMs()
        != other.getUpdatePerTaskLimitMs()) return false;
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
    hash = (37 * hash) + UPDATE_PER_TASK_LIMIT_MS_FIELD_NUMBER;
    hash = (53 * hash) + getUpdatePerTaskLimitMs();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.taskmanager.v1.RateLimit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.taskmanager.v1.RateLimit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.RateLimit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.taskmanager.v1.RateLimit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.RateLimit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.taskmanager.v1.RateLimit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.RateLimit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.taskmanager.v1.RateLimit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.RateLimit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.taskmanager.v1.RateLimit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.RateLimit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.taskmanager.v1.RateLimit parseFrom(
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
  public static Builder newBuilder(com.anduril.taskmanager.v1.RateLimit prototype) {
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
   * Rate limiting / down-sampling parameters.
   * </pre>
   *
   * Protobuf type {@code anduril.taskmanager.v1.RateLimit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.taskmanager.v1.RateLimit)
      com.anduril.taskmanager.v1.RateLimitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.taskmanager.v1.TaskManagerGrpcapiPubProto.internal_static_anduril_taskmanager_v1_RateLimit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.taskmanager.v1.TaskManagerGrpcapiPubProto.internal_static_anduril_taskmanager_v1_RateLimit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.taskmanager.v1.RateLimit.class, com.anduril.taskmanager.v1.RateLimit.Builder.class);
    }

    // Construct using com.anduril.taskmanager.v1.RateLimit.newBuilder()
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
      updatePerTaskLimitMs_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.taskmanager.v1.TaskManagerGrpcapiPubProto.internal_static_anduril_taskmanager_v1_RateLimit_descriptor;
    }

    @java.lang.Override
    public com.anduril.taskmanager.v1.RateLimit getDefaultInstanceForType() {
      return com.anduril.taskmanager.v1.RateLimit.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.taskmanager.v1.RateLimit build() {
      com.anduril.taskmanager.v1.RateLimit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.taskmanager.v1.RateLimit buildPartial() {
      com.anduril.taskmanager.v1.RateLimit result = new com.anduril.taskmanager.v1.RateLimit(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.taskmanager.v1.RateLimit result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.updatePerTaskLimitMs_ = updatePerTaskLimitMs_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.taskmanager.v1.RateLimit) {
        return mergeFrom((com.anduril.taskmanager.v1.RateLimit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.taskmanager.v1.RateLimit other) {
      if (other == com.anduril.taskmanager.v1.RateLimit.getDefaultInstance()) return this;
      if (other.getUpdatePerTaskLimitMs() != 0) {
        setUpdatePerTaskLimitMs(other.getUpdatePerTaskLimitMs());
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
              updatePerTaskLimitMs_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private int updatePerTaskLimitMs_ ;
    /**
     * <pre>
     * Specifies a minimum duration in milliseconds after an update for a given task before another one
     * will be sent for the same task.
     * A value of 0 is treated as unset. If set, value must be &gt;= 250.
     * Example: if set to 1000, and 4 events occur (ms since start) at T0, T500, T900, T2100, then
     * event from T0 will be sent at T0, T500 will be dropped, T900 will be sent at minimum of T1000,
     * and T2100 will be sent on time (2100)
     * This will only limit updates, other events will be sent immediately, with a delete clearing anything held
     * </pre>
     *
     * <code>uint32 update_per_task_limit_ms = 1 [json_name = "updatePerTaskLimitMs"];</code>
     * @return The updatePerTaskLimitMs.
     */
    @java.lang.Override
    public int getUpdatePerTaskLimitMs() {
      return updatePerTaskLimitMs_;
    }
    /**
     * <pre>
     * Specifies a minimum duration in milliseconds after an update for a given task before another one
     * will be sent for the same task.
     * A value of 0 is treated as unset. If set, value must be &gt;= 250.
     * Example: if set to 1000, and 4 events occur (ms since start) at T0, T500, T900, T2100, then
     * event from T0 will be sent at T0, T500 will be dropped, T900 will be sent at minimum of T1000,
     * and T2100 will be sent on time (2100)
     * This will only limit updates, other events will be sent immediately, with a delete clearing anything held
     * </pre>
     *
     * <code>uint32 update_per_task_limit_ms = 1 [json_name = "updatePerTaskLimitMs"];</code>
     * @param value The updatePerTaskLimitMs to set.
     * @return This builder for chaining.
     */
    public Builder setUpdatePerTaskLimitMs(int value) {

      updatePerTaskLimitMs_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies a minimum duration in milliseconds after an update for a given task before another one
     * will be sent for the same task.
     * A value of 0 is treated as unset. If set, value must be &gt;= 250.
     * Example: if set to 1000, and 4 events occur (ms since start) at T0, T500, T900, T2100, then
     * event from T0 will be sent at T0, T500 will be dropped, T900 will be sent at minimum of T1000,
     * and T2100 will be sent on time (2100)
     * This will only limit updates, other events will be sent immediately, with a delete clearing anything held
     * </pre>
     *
     * <code>uint32 update_per_task_limit_ms = 1 [json_name = "updatePerTaskLimitMs"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUpdatePerTaskLimitMs() {
      bitField0_ = (bitField0_ & ~0x00000001);
      updatePerTaskLimitMs_ = 0;
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


    // @@protoc_insertion_point(builder_scope:anduril.taskmanager.v1.RateLimit)
  }

  // @@protoc_insertion_point(class_scope:anduril.taskmanager.v1.RateLimit)
  private static final com.anduril.taskmanager.v1.RateLimit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.taskmanager.v1.RateLimit();
  }

  public static com.anduril.taskmanager.v1.RateLimit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RateLimit>
      PARSER = new com.google.protobuf.AbstractParser<RateLimit>() {
    @java.lang.Override
    public RateLimit parsePartialFrom(
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

  public static com.google.protobuf.Parser<RateLimit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RateLimit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.taskmanager.v1.RateLimit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

