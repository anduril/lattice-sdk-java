// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/taskmanager/v1/task.pub.proto

package com.anduril.taskmanager.v1;

/**
 * <pre>
 * Wrapper of an entity passed in Tasking, used to hold an additional information, and as a future extension point.
 * </pre>
 *
 * Protobuf type {@code anduril.taskmanager.v1.TaskEntity}
 */
public final class TaskEntity extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.taskmanager.v1.TaskEntity)
    TaskEntityOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TaskEntity.newBuilder() to construct.
  private TaskEntity(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TaskEntity() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TaskEntity();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.taskmanager.v1.TaskPubProto.internal_static_anduril_taskmanager_v1_TaskEntity_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.taskmanager.v1.TaskPubProto.internal_static_anduril_taskmanager_v1_TaskEntity_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.taskmanager.v1.TaskEntity.class, com.anduril.taskmanager.v1.TaskEntity.Builder.class);
  }

  public static final int ENTITY_FIELD_NUMBER = 1;
  private com.anduril.entitymanager.v1.Entity entity_;
  /**
   * <pre>
   * The wrapped entity-manager entity.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
   * @return Whether the entity field is set.
   */
  @java.lang.Override
  public boolean hasEntity() {
    return entity_ != null;
  }
  /**
   * <pre>
   * The wrapped entity-manager entity.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
   * @return The entity.
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.Entity getEntity() {
    return entity_ == null ? com.anduril.entitymanager.v1.Entity.getDefaultInstance() : entity_;
  }
  /**
   * <pre>
   * The wrapped entity-manager entity.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.EntityOrBuilder getEntityOrBuilder() {
    return entity_ == null ? com.anduril.entitymanager.v1.Entity.getDefaultInstance() : entity_;
  }

  public static final int SNAPSHOT_FIELD_NUMBER = 2;
  private boolean snapshot_ = false;
  /**
   * <pre>
   * Indicates that this entity was generated from a snapshot of a live entity.
   * </pre>
   *
   * <code>bool snapshot = 2 [json_name = "snapshot"];</code>
   * @return The snapshot.
   */
  @java.lang.Override
  public boolean getSnapshot() {
    return snapshot_;
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
    if (entity_ != null) {
      output.writeMessage(1, getEntity());
    }
    if (snapshot_ != false) {
      output.writeBool(2, snapshot_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (entity_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEntity());
    }
    if (snapshot_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, snapshot_);
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
    if (!(obj instanceof com.anduril.taskmanager.v1.TaskEntity)) {
      return super.equals(obj);
    }
    com.anduril.taskmanager.v1.TaskEntity other = (com.anduril.taskmanager.v1.TaskEntity) obj;

    if (hasEntity() != other.hasEntity()) return false;
    if (hasEntity()) {
      if (!getEntity()
          .equals(other.getEntity())) return false;
    }
    if (getSnapshot()
        != other.getSnapshot()) return false;
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
    if (hasEntity()) {
      hash = (37 * hash) + ENTITY_FIELD_NUMBER;
      hash = (53 * hash) + getEntity().hashCode();
    }
    hash = (37 * hash) + SNAPSHOT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSnapshot());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.taskmanager.v1.TaskEntity parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.taskmanager.v1.TaskEntity parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.TaskEntity parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.taskmanager.v1.TaskEntity parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.TaskEntity parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.taskmanager.v1.TaskEntity parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.TaskEntity parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.taskmanager.v1.TaskEntity parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.TaskEntity parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.taskmanager.v1.TaskEntity parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.TaskEntity parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.taskmanager.v1.TaskEntity parseFrom(
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
  public static Builder newBuilder(com.anduril.taskmanager.v1.TaskEntity prototype) {
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
   * Wrapper of an entity passed in Tasking, used to hold an additional information, and as a future extension point.
   * </pre>
   *
   * Protobuf type {@code anduril.taskmanager.v1.TaskEntity}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.taskmanager.v1.TaskEntity)
      com.anduril.taskmanager.v1.TaskEntityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.taskmanager.v1.TaskPubProto.internal_static_anduril_taskmanager_v1_TaskEntity_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.taskmanager.v1.TaskPubProto.internal_static_anduril_taskmanager_v1_TaskEntity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.taskmanager.v1.TaskEntity.class, com.anduril.taskmanager.v1.TaskEntity.Builder.class);
    }

    // Construct using com.anduril.taskmanager.v1.TaskEntity.newBuilder()
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
      entity_ = null;
      if (entityBuilder_ != null) {
        entityBuilder_.dispose();
        entityBuilder_ = null;
      }
      snapshot_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.taskmanager.v1.TaskPubProto.internal_static_anduril_taskmanager_v1_TaskEntity_descriptor;
    }

    @java.lang.Override
    public com.anduril.taskmanager.v1.TaskEntity getDefaultInstanceForType() {
      return com.anduril.taskmanager.v1.TaskEntity.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.taskmanager.v1.TaskEntity build() {
      com.anduril.taskmanager.v1.TaskEntity result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.taskmanager.v1.TaskEntity buildPartial() {
      com.anduril.taskmanager.v1.TaskEntity result = new com.anduril.taskmanager.v1.TaskEntity(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.taskmanager.v1.TaskEntity result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.entity_ = entityBuilder_ == null
            ? entity_
            : entityBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.snapshot_ = snapshot_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.taskmanager.v1.TaskEntity) {
        return mergeFrom((com.anduril.taskmanager.v1.TaskEntity)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.taskmanager.v1.TaskEntity other) {
      if (other == com.anduril.taskmanager.v1.TaskEntity.getDefaultInstance()) return this;
      if (other.hasEntity()) {
        mergeEntity(other.getEntity());
      }
      if (other.getSnapshot() != false) {
        setSnapshot(other.getSnapshot());
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
                  getEntityFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              snapshot_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private com.anduril.entitymanager.v1.Entity entity_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Entity, com.anduril.entitymanager.v1.Entity.Builder, com.anduril.entitymanager.v1.EntityOrBuilder> entityBuilder_;
    /**
     * <pre>
     * The wrapped entity-manager entity.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
     * @return Whether the entity field is set.
     */
    public boolean hasEntity() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The wrapped entity-manager entity.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
     * @return The entity.
     */
    public com.anduril.entitymanager.v1.Entity getEntity() {
      if (entityBuilder_ == null) {
        return entity_ == null ? com.anduril.entitymanager.v1.Entity.getDefaultInstance() : entity_;
      } else {
        return entityBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The wrapped entity-manager entity.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
     */
    public Builder setEntity(com.anduril.entitymanager.v1.Entity value) {
      if (entityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entity_ = value;
      } else {
        entityBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The wrapped entity-manager entity.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
     */
    public Builder setEntity(
        com.anduril.entitymanager.v1.Entity.Builder builderForValue) {
      if (entityBuilder_ == null) {
        entity_ = builderForValue.build();
      } else {
        entityBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The wrapped entity-manager entity.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
     */
    public Builder mergeEntity(com.anduril.entitymanager.v1.Entity value) {
      if (entityBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          entity_ != null &&
          entity_ != com.anduril.entitymanager.v1.Entity.getDefaultInstance()) {
          getEntityBuilder().mergeFrom(value);
        } else {
          entity_ = value;
        }
      } else {
        entityBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The wrapped entity-manager entity.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
     */
    public Builder clearEntity() {
      bitField0_ = (bitField0_ & ~0x00000001);
      entity_ = null;
      if (entityBuilder_ != null) {
        entityBuilder_.dispose();
        entityBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The wrapped entity-manager entity.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
     */
    public com.anduril.entitymanager.v1.Entity.Builder getEntityBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEntityFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The wrapped entity-manager entity.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
     */
    public com.anduril.entitymanager.v1.EntityOrBuilder getEntityOrBuilder() {
      if (entityBuilder_ != null) {
        return entityBuilder_.getMessageOrBuilder();
      } else {
        return entity_ == null ?
            com.anduril.entitymanager.v1.Entity.getDefaultInstance() : entity_;
      }
    }
    /**
     * <pre>
     * The wrapped entity-manager entity.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Entity, com.anduril.entitymanager.v1.Entity.Builder, com.anduril.entitymanager.v1.EntityOrBuilder> 
        getEntityFieldBuilder() {
      if (entityBuilder_ == null) {
        entityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.entitymanager.v1.Entity, com.anduril.entitymanager.v1.Entity.Builder, com.anduril.entitymanager.v1.EntityOrBuilder>(
                getEntity(),
                getParentForChildren(),
                isClean());
        entity_ = null;
      }
      return entityBuilder_;
    }

    private boolean snapshot_ ;
    /**
     * <pre>
     * Indicates that this entity was generated from a snapshot of a live entity.
     * </pre>
     *
     * <code>bool snapshot = 2 [json_name = "snapshot"];</code>
     * @return The snapshot.
     */
    @java.lang.Override
    public boolean getSnapshot() {
      return snapshot_;
    }
    /**
     * <pre>
     * Indicates that this entity was generated from a snapshot of a live entity.
     * </pre>
     *
     * <code>bool snapshot = 2 [json_name = "snapshot"];</code>
     * @param value The snapshot to set.
     * @return This builder for chaining.
     */
    public Builder setSnapshot(boolean value) {

      snapshot_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates that this entity was generated from a snapshot of a live entity.
     * </pre>
     *
     * <code>bool snapshot = 2 [json_name = "snapshot"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSnapshot() {
      bitField0_ = (bitField0_ & ~0x00000002);
      snapshot_ = false;
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


    // @@protoc_insertion_point(builder_scope:anduril.taskmanager.v1.TaskEntity)
  }

  // @@protoc_insertion_point(class_scope:anduril.taskmanager.v1.TaskEntity)
  private static final com.anduril.taskmanager.v1.TaskEntity DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.taskmanager.v1.TaskEntity();
  }

  public static com.anduril.taskmanager.v1.TaskEntity getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskEntity>
      PARSER = new com.google.protobuf.AbstractParser<TaskEntity>() {
    @java.lang.Override
    public TaskEntity parsePartialFrom(
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

  public static com.google.protobuf.Parser<TaskEntity> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskEntity> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.taskmanager.v1.TaskEntity getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

