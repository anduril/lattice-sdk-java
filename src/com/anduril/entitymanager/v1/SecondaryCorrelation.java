// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/entity.pub.proto

package com.anduril.entitymanager.v1;

/**
 * Protobuf type {@code anduril.entitymanager.v1.SecondaryCorrelation}
 */
public final class SecondaryCorrelation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.SecondaryCorrelation)
    SecondaryCorrelationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SecondaryCorrelation.newBuilder() to construct.
  private SecondaryCorrelation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SecondaryCorrelation() {
    primaryEntityId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SecondaryCorrelation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.EntityPubProto.internal_static_anduril_entitymanager_v1_SecondaryCorrelation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.EntityPubProto.internal_static_anduril_entitymanager_v1_SecondaryCorrelation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.SecondaryCorrelation.class, com.anduril.entitymanager.v1.SecondaryCorrelation.Builder.class);
  }

  public static final int PRIMARY_ENTITY_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object primaryEntityId_ = "";
  /**
   * <pre>
   * The primary of this correlation.
   * </pre>
   *
   * <code>string primary_entity_id = 1 [json_name = "primaryEntityId"];</code>
   * @return The primaryEntityId.
   */
  @java.lang.Override
  public java.lang.String getPrimaryEntityId() {
    java.lang.Object ref = primaryEntityId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      primaryEntityId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The primary of this correlation.
   * </pre>
   *
   * <code>string primary_entity_id = 1 [json_name = "primaryEntityId"];</code>
   * @return The bytes for primaryEntityId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPrimaryEntityIdBytes() {
    java.lang.Object ref = primaryEntityId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      primaryEntityId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int METADATA_FIELD_NUMBER = 2;
  private com.anduril.entitymanager.v1.CorrelationMetadata metadata_;
  /**
   * <pre>
   * Metadata about the correlation.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.CorrelationMetadata metadata = 2 [json_name = "metadata"];</code>
   * @return Whether the metadata field is set.
   */
  @java.lang.Override
  public boolean hasMetadata() {
    return metadata_ != null;
  }
  /**
   * <pre>
   * Metadata about the correlation.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.CorrelationMetadata metadata = 2 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.CorrelationMetadata getMetadata() {
    return metadata_ == null ? com.anduril.entitymanager.v1.CorrelationMetadata.getDefaultInstance() : metadata_;
  }
  /**
   * <pre>
   * Metadata about the correlation.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.CorrelationMetadata metadata = 2 [json_name = "metadata"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.CorrelationMetadataOrBuilder getMetadataOrBuilder() {
    return metadata_ == null ? com.anduril.entitymanager.v1.CorrelationMetadata.getDefaultInstance() : metadata_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(primaryEntityId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, primaryEntityId_);
    }
    if (metadata_ != null) {
      output.writeMessage(2, getMetadata());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(primaryEntityId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, primaryEntityId_);
    }
    if (metadata_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMetadata());
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
    if (!(obj instanceof com.anduril.entitymanager.v1.SecondaryCorrelation)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.SecondaryCorrelation other = (com.anduril.entitymanager.v1.SecondaryCorrelation) obj;

    if (!getPrimaryEntityId()
        .equals(other.getPrimaryEntityId())) return false;
    if (hasMetadata() != other.hasMetadata()) return false;
    if (hasMetadata()) {
      if (!getMetadata()
          .equals(other.getMetadata())) return false;
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
    hash = (37 * hash) + PRIMARY_ENTITY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPrimaryEntityId().hashCode();
    if (hasMetadata()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadata().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.SecondaryCorrelation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.SecondaryCorrelation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.SecondaryCorrelation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.SecondaryCorrelation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.SecondaryCorrelation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.SecondaryCorrelation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.SecondaryCorrelation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.SecondaryCorrelation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.SecondaryCorrelation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.SecondaryCorrelation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.SecondaryCorrelation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.SecondaryCorrelation parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.SecondaryCorrelation prototype) {
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
   * Protobuf type {@code anduril.entitymanager.v1.SecondaryCorrelation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.SecondaryCorrelation)
      com.anduril.entitymanager.v1.SecondaryCorrelationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.EntityPubProto.internal_static_anduril_entitymanager_v1_SecondaryCorrelation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.EntityPubProto.internal_static_anduril_entitymanager_v1_SecondaryCorrelation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.SecondaryCorrelation.class, com.anduril.entitymanager.v1.SecondaryCorrelation.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.SecondaryCorrelation.newBuilder()
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
      primaryEntityId_ = "";
      metadata_ = null;
      if (metadataBuilder_ != null) {
        metadataBuilder_.dispose();
        metadataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.EntityPubProto.internal_static_anduril_entitymanager_v1_SecondaryCorrelation_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.SecondaryCorrelation getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.SecondaryCorrelation.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.SecondaryCorrelation build() {
      com.anduril.entitymanager.v1.SecondaryCorrelation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.SecondaryCorrelation buildPartial() {
      com.anduril.entitymanager.v1.SecondaryCorrelation result = new com.anduril.entitymanager.v1.SecondaryCorrelation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.entitymanager.v1.SecondaryCorrelation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.primaryEntityId_ = primaryEntityId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.metadata_ = metadataBuilder_ == null
            ? metadata_
            : metadataBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entitymanager.v1.SecondaryCorrelation) {
        return mergeFrom((com.anduril.entitymanager.v1.SecondaryCorrelation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.SecondaryCorrelation other) {
      if (other == com.anduril.entitymanager.v1.SecondaryCorrelation.getDefaultInstance()) return this;
      if (!other.getPrimaryEntityId().isEmpty()) {
        primaryEntityId_ = other.primaryEntityId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasMetadata()) {
        mergeMetadata(other.getMetadata());
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
              primaryEntityId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getMetadataFieldBuilder().getBuilder(),
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

    private java.lang.Object primaryEntityId_ = "";
    /**
     * <pre>
     * The primary of this correlation.
     * </pre>
     *
     * <code>string primary_entity_id = 1 [json_name = "primaryEntityId"];</code>
     * @return The primaryEntityId.
     */
    public java.lang.String getPrimaryEntityId() {
      java.lang.Object ref = primaryEntityId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        primaryEntityId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The primary of this correlation.
     * </pre>
     *
     * <code>string primary_entity_id = 1 [json_name = "primaryEntityId"];</code>
     * @return The bytes for primaryEntityId.
     */
    public com.google.protobuf.ByteString
        getPrimaryEntityIdBytes() {
      java.lang.Object ref = primaryEntityId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        primaryEntityId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The primary of this correlation.
     * </pre>
     *
     * <code>string primary_entity_id = 1 [json_name = "primaryEntityId"];</code>
     * @param value The primaryEntityId to set.
     * @return This builder for chaining.
     */
    public Builder setPrimaryEntityId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      primaryEntityId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The primary of this correlation.
     * </pre>
     *
     * <code>string primary_entity_id = 1 [json_name = "primaryEntityId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPrimaryEntityId() {
      primaryEntityId_ = getDefaultInstance().getPrimaryEntityId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The primary of this correlation.
     * </pre>
     *
     * <code>string primary_entity_id = 1 [json_name = "primaryEntityId"];</code>
     * @param value The bytes for primaryEntityId to set.
     * @return This builder for chaining.
     */
    public Builder setPrimaryEntityIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      primaryEntityId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.anduril.entitymanager.v1.CorrelationMetadata metadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.CorrelationMetadata, com.anduril.entitymanager.v1.CorrelationMetadata.Builder, com.anduril.entitymanager.v1.CorrelationMetadataOrBuilder> metadataBuilder_;
    /**
     * <pre>
     * Metadata about the correlation.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.CorrelationMetadata metadata = 2 [json_name = "metadata"];</code>
     * @return Whether the metadata field is set.
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Metadata about the correlation.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.CorrelationMetadata metadata = 2 [json_name = "metadata"];</code>
     * @return The metadata.
     */
    public com.anduril.entitymanager.v1.CorrelationMetadata getMetadata() {
      if (metadataBuilder_ == null) {
        return metadata_ == null ? com.anduril.entitymanager.v1.CorrelationMetadata.getDefaultInstance() : metadata_;
      } else {
        return metadataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Metadata about the correlation.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.CorrelationMetadata metadata = 2 [json_name = "metadata"];</code>
     */
    public Builder setMetadata(com.anduril.entitymanager.v1.CorrelationMetadata value) {
      if (metadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadata_ = value;
      } else {
        metadataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Metadata about the correlation.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.CorrelationMetadata metadata = 2 [json_name = "metadata"];</code>
     */
    public Builder setMetadata(
        com.anduril.entitymanager.v1.CorrelationMetadata.Builder builderForValue) {
      if (metadataBuilder_ == null) {
        metadata_ = builderForValue.build();
      } else {
        metadataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Metadata about the correlation.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.CorrelationMetadata metadata = 2 [json_name = "metadata"];</code>
     */
    public Builder mergeMetadata(com.anduril.entitymanager.v1.CorrelationMetadata value) {
      if (metadataBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          metadata_ != null &&
          metadata_ != com.anduril.entitymanager.v1.CorrelationMetadata.getDefaultInstance()) {
          getMetadataBuilder().mergeFrom(value);
        } else {
          metadata_ = value;
        }
      } else {
        metadataBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Metadata about the correlation.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.CorrelationMetadata metadata = 2 [json_name = "metadata"];</code>
     */
    public Builder clearMetadata() {
      bitField0_ = (bitField0_ & ~0x00000002);
      metadata_ = null;
      if (metadataBuilder_ != null) {
        metadataBuilder_.dispose();
        metadataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Metadata about the correlation.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.CorrelationMetadata metadata = 2 [json_name = "metadata"];</code>
     */
    public com.anduril.entitymanager.v1.CorrelationMetadata.Builder getMetadataBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMetadataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Metadata about the correlation.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.CorrelationMetadata metadata = 2 [json_name = "metadata"];</code>
     */
    public com.anduril.entitymanager.v1.CorrelationMetadataOrBuilder getMetadataOrBuilder() {
      if (metadataBuilder_ != null) {
        return metadataBuilder_.getMessageOrBuilder();
      } else {
        return metadata_ == null ?
            com.anduril.entitymanager.v1.CorrelationMetadata.getDefaultInstance() : metadata_;
      }
    }
    /**
     * <pre>
     * Metadata about the correlation.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.CorrelationMetadata metadata = 2 [json_name = "metadata"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.CorrelationMetadata, com.anduril.entitymanager.v1.CorrelationMetadata.Builder, com.anduril.entitymanager.v1.CorrelationMetadataOrBuilder> 
        getMetadataFieldBuilder() {
      if (metadataBuilder_ == null) {
        metadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.entitymanager.v1.CorrelationMetadata, com.anduril.entitymanager.v1.CorrelationMetadata.Builder, com.anduril.entitymanager.v1.CorrelationMetadataOrBuilder>(
                getMetadata(),
                getParentForChildren(),
                isClean());
        metadata_ = null;
      }
      return metadataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.SecondaryCorrelation)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.SecondaryCorrelation)
  private static final com.anduril.entitymanager.v1.SecondaryCorrelation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.SecondaryCorrelation();
  }

  public static com.anduril.entitymanager.v1.SecondaryCorrelation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SecondaryCorrelation>
      PARSER = new com.google.protobuf.AbstractParser<SecondaryCorrelation>() {
    @java.lang.Override
    public SecondaryCorrelation parsePartialFrom(
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

  public static com.google.protobuf.Parser<SecondaryCorrelation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SecondaryCorrelation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.SecondaryCorrelation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

