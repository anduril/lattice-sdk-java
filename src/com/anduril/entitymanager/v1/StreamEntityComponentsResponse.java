// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/entity_manager_grpcapi.pub.proto

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * response stream will be fed all matching pre-existing live entities as CREATED, plus any new events ongoing.
 * </pre>
 *
 * Protobuf type {@code anduril.entitymanager.v1.StreamEntityComponentsResponse}
 */
public final class StreamEntityComponentsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.StreamEntityComponentsResponse)
    StreamEntityComponentsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StreamEntityComponentsResponse.newBuilder() to construct.
  private StreamEntityComponentsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StreamEntityComponentsResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StreamEntityComponentsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.EntityManagerGrpcapiPubProto.internal_static_anduril_entitymanager_v1_StreamEntityComponentsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.EntityManagerGrpcapiPubProto.internal_static_anduril_entitymanager_v1_StreamEntityComponentsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.StreamEntityComponentsResponse.class, com.anduril.entitymanager.v1.StreamEntityComponentsResponse.Builder.class);
  }

  public static final int ENTITY_EVENT_FIELD_NUMBER = 1;
  private com.anduril.entitymanager.v1.EntityEvent entityEvent_;
  /**
   * <code>.anduril.entitymanager.v1.EntityEvent entity_event = 1 [json_name = "entityEvent"];</code>
   * @return Whether the entityEvent field is set.
   */
  @java.lang.Override
  public boolean hasEntityEvent() {
    return entityEvent_ != null;
  }
  /**
   * <code>.anduril.entitymanager.v1.EntityEvent entity_event = 1 [json_name = "entityEvent"];</code>
   * @return The entityEvent.
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.EntityEvent getEntityEvent() {
    return entityEvent_ == null ? com.anduril.entitymanager.v1.EntityEvent.getDefaultInstance() : entityEvent_;
  }
  /**
   * <code>.anduril.entitymanager.v1.EntityEvent entity_event = 1 [json_name = "entityEvent"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.EntityEventOrBuilder getEntityEventOrBuilder() {
    return entityEvent_ == null ? com.anduril.entitymanager.v1.EntityEvent.getDefaultInstance() : entityEvent_;
  }

  public static final int HEARTBEAT_FIELD_NUMBER = 2;
  private com.anduril.entitymanager.v1.Heartbeat heartbeat_;
  /**
   * <code>.anduril.entitymanager.v1.Heartbeat heartbeat = 2 [json_name = "heartbeat"];</code>
   * @return Whether the heartbeat field is set.
   */
  @java.lang.Override
  public boolean hasHeartbeat() {
    return heartbeat_ != null;
  }
  /**
   * <code>.anduril.entitymanager.v1.Heartbeat heartbeat = 2 [json_name = "heartbeat"];</code>
   * @return The heartbeat.
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.Heartbeat getHeartbeat() {
    return heartbeat_ == null ? com.anduril.entitymanager.v1.Heartbeat.getDefaultInstance() : heartbeat_;
  }
  /**
   * <code>.anduril.entitymanager.v1.Heartbeat heartbeat = 2 [json_name = "heartbeat"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.HeartbeatOrBuilder getHeartbeatOrBuilder() {
    return heartbeat_ == null ? com.anduril.entitymanager.v1.Heartbeat.getDefaultInstance() : heartbeat_;
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
    if (entityEvent_ != null) {
      output.writeMessage(1, getEntityEvent());
    }
    if (heartbeat_ != null) {
      output.writeMessage(2, getHeartbeat());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (entityEvent_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEntityEvent());
    }
    if (heartbeat_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getHeartbeat());
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
    if (!(obj instanceof com.anduril.entitymanager.v1.StreamEntityComponentsResponse)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.StreamEntityComponentsResponse other = (com.anduril.entitymanager.v1.StreamEntityComponentsResponse) obj;

    if (hasEntityEvent() != other.hasEntityEvent()) return false;
    if (hasEntityEvent()) {
      if (!getEntityEvent()
          .equals(other.getEntityEvent())) return false;
    }
    if (hasHeartbeat() != other.hasHeartbeat()) return false;
    if (hasHeartbeat()) {
      if (!getHeartbeat()
          .equals(other.getHeartbeat())) return false;
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
    if (hasEntityEvent()) {
      hash = (37 * hash) + ENTITY_EVENT_FIELD_NUMBER;
      hash = (53 * hash) + getEntityEvent().hashCode();
    }
    if (hasHeartbeat()) {
      hash = (37 * hash) + HEARTBEAT_FIELD_NUMBER;
      hash = (53 * hash) + getHeartbeat().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.StreamEntityComponentsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.StreamEntityComponentsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.StreamEntityComponentsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.StreamEntityComponentsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.StreamEntityComponentsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.StreamEntityComponentsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.StreamEntityComponentsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.StreamEntityComponentsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.StreamEntityComponentsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.StreamEntityComponentsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.StreamEntityComponentsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.StreamEntityComponentsResponse parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.StreamEntityComponentsResponse prototype) {
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
   * response stream will be fed all matching pre-existing live entities as CREATED, plus any new events ongoing.
   * </pre>
   *
   * Protobuf type {@code anduril.entitymanager.v1.StreamEntityComponentsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.StreamEntityComponentsResponse)
      com.anduril.entitymanager.v1.StreamEntityComponentsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.EntityManagerGrpcapiPubProto.internal_static_anduril_entitymanager_v1_StreamEntityComponentsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.EntityManagerGrpcapiPubProto.internal_static_anduril_entitymanager_v1_StreamEntityComponentsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.StreamEntityComponentsResponse.class, com.anduril.entitymanager.v1.StreamEntityComponentsResponse.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.StreamEntityComponentsResponse.newBuilder()
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
      entityEvent_ = null;
      if (entityEventBuilder_ != null) {
        entityEventBuilder_.dispose();
        entityEventBuilder_ = null;
      }
      heartbeat_ = null;
      if (heartbeatBuilder_ != null) {
        heartbeatBuilder_.dispose();
        heartbeatBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.EntityManagerGrpcapiPubProto.internal_static_anduril_entitymanager_v1_StreamEntityComponentsResponse_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.StreamEntityComponentsResponse getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.StreamEntityComponentsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.StreamEntityComponentsResponse build() {
      com.anduril.entitymanager.v1.StreamEntityComponentsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.StreamEntityComponentsResponse buildPartial() {
      com.anduril.entitymanager.v1.StreamEntityComponentsResponse result = new com.anduril.entitymanager.v1.StreamEntityComponentsResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.entitymanager.v1.StreamEntityComponentsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.entityEvent_ = entityEventBuilder_ == null
            ? entityEvent_
            : entityEventBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.heartbeat_ = heartbeatBuilder_ == null
            ? heartbeat_
            : heartbeatBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entitymanager.v1.StreamEntityComponentsResponse) {
        return mergeFrom((com.anduril.entitymanager.v1.StreamEntityComponentsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.StreamEntityComponentsResponse other) {
      if (other == com.anduril.entitymanager.v1.StreamEntityComponentsResponse.getDefaultInstance()) return this;
      if (other.hasEntityEvent()) {
        mergeEntityEvent(other.getEntityEvent());
      }
      if (other.hasHeartbeat()) {
        mergeHeartbeat(other.getHeartbeat());
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
                  getEntityEventFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getHeartbeatFieldBuilder().getBuilder(),
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

    private com.anduril.entitymanager.v1.EntityEvent entityEvent_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.EntityEvent, com.anduril.entitymanager.v1.EntityEvent.Builder, com.anduril.entitymanager.v1.EntityEventOrBuilder> entityEventBuilder_;
    /**
     * <code>.anduril.entitymanager.v1.EntityEvent entity_event = 1 [json_name = "entityEvent"];</code>
     * @return Whether the entityEvent field is set.
     */
    public boolean hasEntityEvent() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.anduril.entitymanager.v1.EntityEvent entity_event = 1 [json_name = "entityEvent"];</code>
     * @return The entityEvent.
     */
    public com.anduril.entitymanager.v1.EntityEvent getEntityEvent() {
      if (entityEventBuilder_ == null) {
        return entityEvent_ == null ? com.anduril.entitymanager.v1.EntityEvent.getDefaultInstance() : entityEvent_;
      } else {
        return entityEventBuilder_.getMessage();
      }
    }
    /**
     * <code>.anduril.entitymanager.v1.EntityEvent entity_event = 1 [json_name = "entityEvent"];</code>
     */
    public Builder setEntityEvent(com.anduril.entitymanager.v1.EntityEvent value) {
      if (entityEventBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entityEvent_ = value;
      } else {
        entityEventBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.EntityEvent entity_event = 1 [json_name = "entityEvent"];</code>
     */
    public Builder setEntityEvent(
        com.anduril.entitymanager.v1.EntityEvent.Builder builderForValue) {
      if (entityEventBuilder_ == null) {
        entityEvent_ = builderForValue.build();
      } else {
        entityEventBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.EntityEvent entity_event = 1 [json_name = "entityEvent"];</code>
     */
    public Builder mergeEntityEvent(com.anduril.entitymanager.v1.EntityEvent value) {
      if (entityEventBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          entityEvent_ != null &&
          entityEvent_ != com.anduril.entitymanager.v1.EntityEvent.getDefaultInstance()) {
          getEntityEventBuilder().mergeFrom(value);
        } else {
          entityEvent_ = value;
        }
      } else {
        entityEventBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.EntityEvent entity_event = 1 [json_name = "entityEvent"];</code>
     */
    public Builder clearEntityEvent() {
      bitField0_ = (bitField0_ & ~0x00000001);
      entityEvent_ = null;
      if (entityEventBuilder_ != null) {
        entityEventBuilder_.dispose();
        entityEventBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.EntityEvent entity_event = 1 [json_name = "entityEvent"];</code>
     */
    public com.anduril.entitymanager.v1.EntityEvent.Builder getEntityEventBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEntityEventFieldBuilder().getBuilder();
    }
    /**
     * <code>.anduril.entitymanager.v1.EntityEvent entity_event = 1 [json_name = "entityEvent"];</code>
     */
    public com.anduril.entitymanager.v1.EntityEventOrBuilder getEntityEventOrBuilder() {
      if (entityEventBuilder_ != null) {
        return entityEventBuilder_.getMessageOrBuilder();
      } else {
        return entityEvent_ == null ?
            com.anduril.entitymanager.v1.EntityEvent.getDefaultInstance() : entityEvent_;
      }
    }
    /**
     * <code>.anduril.entitymanager.v1.EntityEvent entity_event = 1 [json_name = "entityEvent"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.EntityEvent, com.anduril.entitymanager.v1.EntityEvent.Builder, com.anduril.entitymanager.v1.EntityEventOrBuilder> 
        getEntityEventFieldBuilder() {
      if (entityEventBuilder_ == null) {
        entityEventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.entitymanager.v1.EntityEvent, com.anduril.entitymanager.v1.EntityEvent.Builder, com.anduril.entitymanager.v1.EntityEventOrBuilder>(
                getEntityEvent(),
                getParentForChildren(),
                isClean());
        entityEvent_ = null;
      }
      return entityEventBuilder_;
    }

    private com.anduril.entitymanager.v1.Heartbeat heartbeat_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Heartbeat, com.anduril.entitymanager.v1.Heartbeat.Builder, com.anduril.entitymanager.v1.HeartbeatOrBuilder> heartbeatBuilder_;
    /**
     * <code>.anduril.entitymanager.v1.Heartbeat heartbeat = 2 [json_name = "heartbeat"];</code>
     * @return Whether the heartbeat field is set.
     */
    public boolean hasHeartbeat() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.anduril.entitymanager.v1.Heartbeat heartbeat = 2 [json_name = "heartbeat"];</code>
     * @return The heartbeat.
     */
    public com.anduril.entitymanager.v1.Heartbeat getHeartbeat() {
      if (heartbeatBuilder_ == null) {
        return heartbeat_ == null ? com.anduril.entitymanager.v1.Heartbeat.getDefaultInstance() : heartbeat_;
      } else {
        return heartbeatBuilder_.getMessage();
      }
    }
    /**
     * <code>.anduril.entitymanager.v1.Heartbeat heartbeat = 2 [json_name = "heartbeat"];</code>
     */
    public Builder setHeartbeat(com.anduril.entitymanager.v1.Heartbeat value) {
      if (heartbeatBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        heartbeat_ = value;
      } else {
        heartbeatBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.Heartbeat heartbeat = 2 [json_name = "heartbeat"];</code>
     */
    public Builder setHeartbeat(
        com.anduril.entitymanager.v1.Heartbeat.Builder builderForValue) {
      if (heartbeatBuilder_ == null) {
        heartbeat_ = builderForValue.build();
      } else {
        heartbeatBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.Heartbeat heartbeat = 2 [json_name = "heartbeat"];</code>
     */
    public Builder mergeHeartbeat(com.anduril.entitymanager.v1.Heartbeat value) {
      if (heartbeatBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          heartbeat_ != null &&
          heartbeat_ != com.anduril.entitymanager.v1.Heartbeat.getDefaultInstance()) {
          getHeartbeatBuilder().mergeFrom(value);
        } else {
          heartbeat_ = value;
        }
      } else {
        heartbeatBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.Heartbeat heartbeat = 2 [json_name = "heartbeat"];</code>
     */
    public Builder clearHeartbeat() {
      bitField0_ = (bitField0_ & ~0x00000002);
      heartbeat_ = null;
      if (heartbeatBuilder_ != null) {
        heartbeatBuilder_.dispose();
        heartbeatBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.Heartbeat heartbeat = 2 [json_name = "heartbeat"];</code>
     */
    public com.anduril.entitymanager.v1.Heartbeat.Builder getHeartbeatBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getHeartbeatFieldBuilder().getBuilder();
    }
    /**
     * <code>.anduril.entitymanager.v1.Heartbeat heartbeat = 2 [json_name = "heartbeat"];</code>
     */
    public com.anduril.entitymanager.v1.HeartbeatOrBuilder getHeartbeatOrBuilder() {
      if (heartbeatBuilder_ != null) {
        return heartbeatBuilder_.getMessageOrBuilder();
      } else {
        return heartbeat_ == null ?
            com.anduril.entitymanager.v1.Heartbeat.getDefaultInstance() : heartbeat_;
      }
    }
    /**
     * <code>.anduril.entitymanager.v1.Heartbeat heartbeat = 2 [json_name = "heartbeat"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Heartbeat, com.anduril.entitymanager.v1.Heartbeat.Builder, com.anduril.entitymanager.v1.HeartbeatOrBuilder> 
        getHeartbeatFieldBuilder() {
      if (heartbeatBuilder_ == null) {
        heartbeatBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.entitymanager.v1.Heartbeat, com.anduril.entitymanager.v1.Heartbeat.Builder, com.anduril.entitymanager.v1.HeartbeatOrBuilder>(
                getHeartbeat(),
                getParentForChildren(),
                isClean());
        heartbeat_ = null;
      }
      return heartbeatBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.StreamEntityComponentsResponse)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.StreamEntityComponentsResponse)
  private static final com.anduril.entitymanager.v1.StreamEntityComponentsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.StreamEntityComponentsResponse();
  }

  public static com.anduril.entitymanager.v1.StreamEntityComponentsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamEntityComponentsResponse>
      PARSER = new com.google.protobuf.AbstractParser<StreamEntityComponentsResponse>() {
    @java.lang.Override
    public StreamEntityComponentsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<StreamEntityComponentsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamEntityComponentsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.StreamEntityComponentsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
