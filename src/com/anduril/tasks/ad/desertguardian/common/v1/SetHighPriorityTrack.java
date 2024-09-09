// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/ad/desertguardian/common/v1/common_tasks.pub.proto

package com.anduril.tasks.ad.desertguardian.common.v1;

/**
 * <pre>
 * Set this entity as a "High Priority Track".
 * The tasked Platform is responsible for maintaining a list of current High-Priority tracks.
 * </pre>
 *
 * Protobuf type {@code anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack}
 */
public final class SetHighPriorityTrack extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack)
    SetHighPriorityTrackOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetHighPriorityTrack.newBuilder() to construct.
  private SetHighPriorityTrack(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetHighPriorityTrack() {
    entityId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetHighPriorityTrack();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.tasks.ad.desertguardian.common.v1.CommonTasksPubProto.internal_static_anduril_tasks_ad_desertguardian_common_v1_SetHighPriorityTrack_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.tasks.ad.desertguardian.common.v1.CommonTasksPubProto.internal_static_anduril_tasks_ad_desertguardian_common_v1_SetHighPriorityTrack_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack.class, com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack.Builder.class);
  }

  public static final int ENTITY_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object entityId_ = "";
  /**
   * <code>string entity_id = 1 [json_name = "entityId"];</code>
   * @return The entityId.
   */
  @java.lang.Override
  public java.lang.String getEntityId() {
    java.lang.Object ref = entityId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      entityId_ = s;
      return s;
    }
  }
  /**
   * <code>string entity_id = 1 [json_name = "entityId"];</code>
   * @return The bytes for entityId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEntityIdBytes() {
    java.lang.Object ref = entityId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      entityId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, entityId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, entityId_);
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
    if (!(obj instanceof com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack)) {
      return super.equals(obj);
    }
    com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack other = (com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack) obj;

    if (!getEntityId()
        .equals(other.getEntityId())) return false;
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
    hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEntityId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack parseFrom(
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
  public static Builder newBuilder(com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack prototype) {
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
   * Set this entity as a "High Priority Track".
   * The tasked Platform is responsible for maintaining a list of current High-Priority tracks.
   * </pre>
   *
   * Protobuf type {@code anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack)
      com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrackOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.tasks.ad.desertguardian.common.v1.CommonTasksPubProto.internal_static_anduril_tasks_ad_desertguardian_common_v1_SetHighPriorityTrack_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.tasks.ad.desertguardian.common.v1.CommonTasksPubProto.internal_static_anduril_tasks_ad_desertguardian_common_v1_SetHighPriorityTrack_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack.class, com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack.Builder.class);
    }

    // Construct using com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack.newBuilder()
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
      entityId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.tasks.ad.desertguardian.common.v1.CommonTasksPubProto.internal_static_anduril_tasks_ad_desertguardian_common_v1_SetHighPriorityTrack_descriptor;
    }

    @java.lang.Override
    public com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack getDefaultInstanceForType() {
      return com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack build() {
      com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack buildPartial() {
      com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack result = new com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.entityId_ = entityId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack) {
        return mergeFrom((com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack other) {
      if (other == com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack.getDefaultInstance()) return this;
      if (!other.getEntityId().isEmpty()) {
        entityId_ = other.entityId_;
        bitField0_ |= 0x00000001;
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
              entityId_ = input.readStringRequireUtf8();
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

    private java.lang.Object entityId_ = "";
    /**
     * <code>string entity_id = 1 [json_name = "entityId"];</code>
     * @return The entityId.
     */
    public java.lang.String getEntityId() {
      java.lang.Object ref = entityId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        entityId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string entity_id = 1 [json_name = "entityId"];</code>
     * @return The bytes for entityId.
     */
    public com.google.protobuf.ByteString
        getEntityIdBytes() {
      java.lang.Object ref = entityId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        entityId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string entity_id = 1 [json_name = "entityId"];</code>
     * @param value The entityId to set.
     * @return This builder for chaining.
     */
    public Builder setEntityId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      entityId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string entity_id = 1 [json_name = "entityId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEntityId() {
      entityId_ = getDefaultInstance().getEntityId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string entity_id = 1 [json_name = "entityId"];</code>
     * @param value The bytes for entityId to set.
     * @return This builder for chaining.
     */
    public Builder setEntityIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      entityId_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack)
  }

  // @@protoc_insertion_point(class_scope:anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack)
  private static final com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack();
  }

  public static com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetHighPriorityTrack>
      PARSER = new com.google.protobuf.AbstractParser<SetHighPriorityTrack>() {
    @java.lang.Override
    public SetHighPriorityTrack parsePartialFrom(
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

  public static com.google.protobuf.Parser<SetHighPriorityTrack> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetHighPriorityTrack> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.tasks.ad.desertguardian.common.v1.SetHighPriorityTrack getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

