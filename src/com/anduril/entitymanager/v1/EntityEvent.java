// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/entity_manager_api.pub.proto

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * Event representing some type of entity change.
 * </pre>
 *
 * Protobuf type {@code anduril.entitymanager.v1.EntityEvent}
 */
public final class EntityEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.EntityEvent)
    EntityEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EntityEvent.newBuilder() to construct.
  private EntityEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EntityEvent() {
    eventType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EntityEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.EntityManagerApiPubProto.internal_static_anduril_entitymanager_v1_EntityEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.EntityManagerApiPubProto.internal_static_anduril_entitymanager_v1_EntityEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.EntityEvent.class, com.anduril.entitymanager.v1.EntityEvent.Builder.class);
  }

  public static final int EVENT_TYPE_FIELD_NUMBER = 1;
  private int eventType_ = 0;
  /**
   * <code>.anduril.entitymanager.v1.EventType event_type = 1 [json_name = "eventType"];</code>
   * @return The enum numeric value on the wire for eventType.
   */
  @java.lang.Override public int getEventTypeValue() {
    return eventType_;
  }
  /**
   * <code>.anduril.entitymanager.v1.EventType event_type = 1 [json_name = "eventType"];</code>
   * @return The eventType.
   */
  @java.lang.Override public com.anduril.entitymanager.v1.EventType getEventType() {
    com.anduril.entitymanager.v1.EventType result = com.anduril.entitymanager.v1.EventType.forNumber(eventType_);
    return result == null ? com.anduril.entitymanager.v1.EventType.UNRECOGNIZED : result;
  }

  public static final int TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp time_;
  /**
   * <code>.google.protobuf.Timestamp time = 2 [json_name = "time"];</code>
   * @return Whether the time field is set.
   */
  @java.lang.Override
  public boolean hasTime() {
    return time_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp time = 2 [json_name = "time"];</code>
   * @return The time.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getTime() {
    return time_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : time_;
  }
  /**
   * <code>.google.protobuf.Timestamp time = 2 [json_name = "time"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getTimeOrBuilder() {
    return time_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : time_;
  }

  public static final int ENTITY_FIELD_NUMBER = 3;
  private com.anduril.entitymanager.v1.Entity entity_;
  /**
   * <code>.anduril.entitymanager.v1.Entity entity = 3 [json_name = "entity"];</code>
   * @return Whether the entity field is set.
   */
  @java.lang.Override
  public boolean hasEntity() {
    return entity_ != null;
  }
  /**
   * <code>.anduril.entitymanager.v1.Entity entity = 3 [json_name = "entity"];</code>
   * @return The entity.
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.Entity getEntity() {
    return entity_ == null ? com.anduril.entitymanager.v1.Entity.getDefaultInstance() : entity_;
  }
  /**
   * <code>.anduril.entitymanager.v1.Entity entity = 3 [json_name = "entity"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.EntityOrBuilder getEntityOrBuilder() {
    return entity_ == null ? com.anduril.entitymanager.v1.Entity.getDefaultInstance() : entity_;
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
    if (eventType_ != com.anduril.entitymanager.v1.EventType.EVENT_TYPE_INVALID.getNumber()) {
      output.writeEnum(1, eventType_);
    }
    if (time_ != null) {
      output.writeMessage(2, getTime());
    }
    if (entity_ != null) {
      output.writeMessage(3, getEntity());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (eventType_ != com.anduril.entitymanager.v1.EventType.EVENT_TYPE_INVALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, eventType_);
    }
    if (time_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTime());
    }
    if (entity_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getEntity());
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
    if (!(obj instanceof com.anduril.entitymanager.v1.EntityEvent)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.EntityEvent other = (com.anduril.entitymanager.v1.EntityEvent) obj;

    if (eventType_ != other.eventType_) return false;
    if (hasTime() != other.hasTime()) return false;
    if (hasTime()) {
      if (!getTime()
          .equals(other.getTime())) return false;
    }
    if (hasEntity() != other.hasEntity()) return false;
    if (hasEntity()) {
      if (!getEntity()
          .equals(other.getEntity())) return false;
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
    if (hasTime()) {
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTime().hashCode();
    }
    if (hasEntity()) {
      hash = (37 * hash) + ENTITY_FIELD_NUMBER;
      hash = (53 * hash) + getEntity().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.EntityEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.EntityEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.EntityEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.EntityEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.EntityEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.EntityEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.EntityEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.EntityEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.EntityEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.EntityEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.EntityEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.EntityEvent parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.EntityEvent prototype) {
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
   * Event representing some type of entity change.
   * </pre>
   *
   * Protobuf type {@code anduril.entitymanager.v1.EntityEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.EntityEvent)
      com.anduril.entitymanager.v1.EntityEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.EntityManagerApiPubProto.internal_static_anduril_entitymanager_v1_EntityEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.EntityManagerApiPubProto.internal_static_anduril_entitymanager_v1_EntityEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.EntityEvent.class, com.anduril.entitymanager.v1.EntityEvent.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.EntityEvent.newBuilder()
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
      eventType_ = 0;
      time_ = null;
      if (timeBuilder_ != null) {
        timeBuilder_.dispose();
        timeBuilder_ = null;
      }
      entity_ = null;
      if (entityBuilder_ != null) {
        entityBuilder_.dispose();
        entityBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.EntityManagerApiPubProto.internal_static_anduril_entitymanager_v1_EntityEvent_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.EntityEvent getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.EntityEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.EntityEvent build() {
      com.anduril.entitymanager.v1.EntityEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.EntityEvent buildPartial() {
      com.anduril.entitymanager.v1.EntityEvent result = new com.anduril.entitymanager.v1.EntityEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.entitymanager.v1.EntityEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.eventType_ = eventType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.time_ = timeBuilder_ == null
            ? time_
            : timeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.entity_ = entityBuilder_ == null
            ? entity_
            : entityBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entitymanager.v1.EntityEvent) {
        return mergeFrom((com.anduril.entitymanager.v1.EntityEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.EntityEvent other) {
      if (other == com.anduril.entitymanager.v1.EntityEvent.getDefaultInstance()) return this;
      if (other.eventType_ != 0) {
        setEventTypeValue(other.getEventTypeValue());
      }
      if (other.hasTime()) {
        mergeTime(other.getTime());
      }
      if (other.hasEntity()) {
        mergeEntity(other.getEntity());
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
                  getTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getEntityFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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
     * <code>.anduril.entitymanager.v1.EventType event_type = 1 [json_name = "eventType"];</code>
     * @return The enum numeric value on the wire for eventType.
     */
    @java.lang.Override public int getEventTypeValue() {
      return eventType_;
    }
    /**
     * <code>.anduril.entitymanager.v1.EventType event_type = 1 [json_name = "eventType"];</code>
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
     * <code>.anduril.entitymanager.v1.EventType event_type = 1 [json_name = "eventType"];</code>
     * @return The eventType.
     */
    @java.lang.Override
    public com.anduril.entitymanager.v1.EventType getEventType() {
      com.anduril.entitymanager.v1.EventType result = com.anduril.entitymanager.v1.EventType.forNumber(eventType_);
      return result == null ? com.anduril.entitymanager.v1.EventType.UNRECOGNIZED : result;
    }
    /**
     * <code>.anduril.entitymanager.v1.EventType event_type = 1 [json_name = "eventType"];</code>
     * @param value The eventType to set.
     * @return This builder for chaining.
     */
    public Builder setEventType(com.anduril.entitymanager.v1.EventType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      eventType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.EventType event_type = 1 [json_name = "eventType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEventType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      eventType_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp time_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timeBuilder_;
    /**
     * <code>.google.protobuf.Timestamp time = 2 [json_name = "time"];</code>
     * @return Whether the time field is set.
     */
    public boolean hasTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp time = 2 [json_name = "time"];</code>
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
     * <code>.google.protobuf.Timestamp time = 2 [json_name = "time"];</code>
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
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 2 [json_name = "time"];</code>
     */
    public Builder setTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timeBuilder_ == null) {
        time_ = builderForValue.build();
      } else {
        timeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 2 [json_name = "time"];</code>
     */
    public Builder mergeTime(com.google.protobuf.Timestamp value) {
      if (timeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          time_ != null &&
          time_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getTimeBuilder().mergeFrom(value);
        } else {
          time_ = value;
        }
      } else {
        timeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 2 [json_name = "time"];</code>
     */
    public Builder clearTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      time_ = null;
      if (timeBuilder_ != null) {
        timeBuilder_.dispose();
        timeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 2 [json_name = "time"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp time = 2 [json_name = "time"];</code>
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
     * <code>.google.protobuf.Timestamp time = 2 [json_name = "time"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimeFieldBuilder() {
      if (timeBuilder_ == null) {
        timeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTime(),
                getParentForChildren(),
                isClean());
        time_ = null;
      }
      return timeBuilder_;
    }

    private com.anduril.entitymanager.v1.Entity entity_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Entity, com.anduril.entitymanager.v1.Entity.Builder, com.anduril.entitymanager.v1.EntityOrBuilder> entityBuilder_;
    /**
     * <code>.anduril.entitymanager.v1.Entity entity = 3 [json_name = "entity"];</code>
     * @return Whether the entity field is set.
     */
    public boolean hasEntity() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.anduril.entitymanager.v1.Entity entity = 3 [json_name = "entity"];</code>
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
     * <code>.anduril.entitymanager.v1.Entity entity = 3 [json_name = "entity"];</code>
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
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.Entity entity = 3 [json_name = "entity"];</code>
     */
    public Builder setEntity(
        com.anduril.entitymanager.v1.Entity.Builder builderForValue) {
      if (entityBuilder_ == null) {
        entity_ = builderForValue.build();
      } else {
        entityBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.Entity entity = 3 [json_name = "entity"];</code>
     */
    public Builder mergeEntity(com.anduril.entitymanager.v1.Entity value) {
      if (entityBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          entity_ != null &&
          entity_ != com.anduril.entitymanager.v1.Entity.getDefaultInstance()) {
          getEntityBuilder().mergeFrom(value);
        } else {
          entity_ = value;
        }
      } else {
        entityBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.Entity entity = 3 [json_name = "entity"];</code>
     */
    public Builder clearEntity() {
      bitField0_ = (bitField0_ & ~0x00000004);
      entity_ = null;
      if (entityBuilder_ != null) {
        entityBuilder_.dispose();
        entityBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.Entity entity = 3 [json_name = "entity"];</code>
     */
    public com.anduril.entitymanager.v1.Entity.Builder getEntityBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getEntityFieldBuilder().getBuilder();
    }
    /**
     * <code>.anduril.entitymanager.v1.Entity entity = 3 [json_name = "entity"];</code>
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
     * <code>.anduril.entitymanager.v1.Entity entity = 3 [json_name = "entity"];</code>
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


    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.EntityEvent)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.EntityEvent)
  private static final com.anduril.entitymanager.v1.EntityEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.EntityEvent();
  }

  public static com.anduril.entitymanager.v1.EntityEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EntityEvent>
      PARSER = new com.google.protobuf.AbstractParser<EntityEvent>() {
    @java.lang.Override
    public EntityEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<EntityEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EntityEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.EntityEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

