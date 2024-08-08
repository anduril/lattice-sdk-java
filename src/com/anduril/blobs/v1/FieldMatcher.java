// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/blobs/v1/filter.pub.proto

package com.anduril.blobs.v1;

/**
 * <pre>
 * All populated fields must be an exact match (logical AND).
 * </pre>
 *
 * Protobuf type {@code anduril.blobs.v1.FieldMatcher}
 */
public final class FieldMatcher extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.blobs.v1.FieldMatcher)
    FieldMatcherOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FieldMatcher.newBuilder() to construct.
  private FieldMatcher(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FieldMatcher() {
    integrationName_ = "";
    mimeType_ = "";
    dataType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FieldMatcher();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.blobs.v1.FilterPubProto.internal_static_anduril_blobs_v1_FieldMatcher_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.blobs.v1.FilterPubProto.internal_static_anduril_blobs_v1_FieldMatcher_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.blobs.v1.FieldMatcher.class, com.anduril.blobs.v1.FieldMatcher.Builder.class);
  }

  public static final int INTEGRATION_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object integrationName_ = "";
  /**
   * <code>string integration_name = 1 [json_name = "integrationName"];</code>
   * @return The integrationName.
   */
  @java.lang.Override
  public java.lang.String getIntegrationName() {
    java.lang.Object ref = integrationName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      integrationName_ = s;
      return s;
    }
  }
  /**
   * <code>string integration_name = 1 [json_name = "integrationName"];</code>
   * @return The bytes for integrationName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIntegrationNameBytes() {
    java.lang.Object ref = integrationName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      integrationName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MIME_TYPE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object mimeType_ = "";
  /**
   * <code>string mime_type = 2 [json_name = "mimeType"];</code>
   * @return The mimeType.
   */
  @java.lang.Override
  public java.lang.String getMimeType() {
    java.lang.Object ref = mimeType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mimeType_ = s;
      return s;
    }
  }
  /**
   * <code>string mime_type = 2 [json_name = "mimeType"];</code>
   * @return The bytes for mimeType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMimeTypeBytes() {
    java.lang.Object ref = mimeType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mimeType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_TYPE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object dataType_ = "";
  /**
   * <code>string data_type = 3 [json_name = "dataType"];</code>
   * @return The dataType.
   */
  @java.lang.Override
  public java.lang.String getDataType() {
    java.lang.Object ref = dataType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dataType_ = s;
      return s;
    }
  }
  /**
   * <code>string data_type = 3 [json_name = "dataType"];</code>
   * @return The bytes for dataType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDataTypeBytes() {
    java.lang.Object ref = dataType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dataType_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(integrationName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, integrationName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mimeType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, mimeType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, dataType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(integrationName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, integrationName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mimeType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, mimeType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, dataType_);
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
    if (!(obj instanceof com.anduril.blobs.v1.FieldMatcher)) {
      return super.equals(obj);
    }
    com.anduril.blobs.v1.FieldMatcher other = (com.anduril.blobs.v1.FieldMatcher) obj;

    if (!getIntegrationName()
        .equals(other.getIntegrationName())) return false;
    if (!getMimeType()
        .equals(other.getMimeType())) return false;
    if (!getDataType()
        .equals(other.getDataType())) return false;
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
    hash = (37 * hash) + INTEGRATION_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getIntegrationName().hashCode();
    hash = (37 * hash) + MIME_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getMimeType().hashCode();
    hash = (37 * hash) + DATA_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getDataType().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.blobs.v1.FieldMatcher parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.blobs.v1.FieldMatcher parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.blobs.v1.FieldMatcher parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.blobs.v1.FieldMatcher parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.blobs.v1.FieldMatcher parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.blobs.v1.FieldMatcher parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.blobs.v1.FieldMatcher parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.blobs.v1.FieldMatcher parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.blobs.v1.FieldMatcher parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.blobs.v1.FieldMatcher parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.blobs.v1.FieldMatcher parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.blobs.v1.FieldMatcher parseFrom(
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
  public static Builder newBuilder(com.anduril.blobs.v1.FieldMatcher prototype) {
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
   * All populated fields must be an exact match (logical AND).
   * </pre>
   *
   * Protobuf type {@code anduril.blobs.v1.FieldMatcher}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.blobs.v1.FieldMatcher)
      com.anduril.blobs.v1.FieldMatcherOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.blobs.v1.FilterPubProto.internal_static_anduril_blobs_v1_FieldMatcher_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.blobs.v1.FilterPubProto.internal_static_anduril_blobs_v1_FieldMatcher_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.blobs.v1.FieldMatcher.class, com.anduril.blobs.v1.FieldMatcher.Builder.class);
    }

    // Construct using com.anduril.blobs.v1.FieldMatcher.newBuilder()
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
      integrationName_ = "";
      mimeType_ = "";
      dataType_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.blobs.v1.FilterPubProto.internal_static_anduril_blobs_v1_FieldMatcher_descriptor;
    }

    @java.lang.Override
    public com.anduril.blobs.v1.FieldMatcher getDefaultInstanceForType() {
      return com.anduril.blobs.v1.FieldMatcher.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.blobs.v1.FieldMatcher build() {
      com.anduril.blobs.v1.FieldMatcher result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.blobs.v1.FieldMatcher buildPartial() {
      com.anduril.blobs.v1.FieldMatcher result = new com.anduril.blobs.v1.FieldMatcher(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.blobs.v1.FieldMatcher result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.integrationName_ = integrationName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.mimeType_ = mimeType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.dataType_ = dataType_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.blobs.v1.FieldMatcher) {
        return mergeFrom((com.anduril.blobs.v1.FieldMatcher)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.blobs.v1.FieldMatcher other) {
      if (other == com.anduril.blobs.v1.FieldMatcher.getDefaultInstance()) return this;
      if (!other.getIntegrationName().isEmpty()) {
        integrationName_ = other.integrationName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getMimeType().isEmpty()) {
        mimeType_ = other.mimeType_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getDataType().isEmpty()) {
        dataType_ = other.dataType_;
        bitField0_ |= 0x00000004;
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
              integrationName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              mimeType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              dataType_ = input.readStringRequireUtf8();
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

    private java.lang.Object integrationName_ = "";
    /**
     * <code>string integration_name = 1 [json_name = "integrationName"];</code>
     * @return The integrationName.
     */
    public java.lang.String getIntegrationName() {
      java.lang.Object ref = integrationName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        integrationName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string integration_name = 1 [json_name = "integrationName"];</code>
     * @return The bytes for integrationName.
     */
    public com.google.protobuf.ByteString
        getIntegrationNameBytes() {
      java.lang.Object ref = integrationName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        integrationName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string integration_name = 1 [json_name = "integrationName"];</code>
     * @param value The integrationName to set.
     * @return This builder for chaining.
     */
    public Builder setIntegrationName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      integrationName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string integration_name = 1 [json_name = "integrationName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIntegrationName() {
      integrationName_ = getDefaultInstance().getIntegrationName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string integration_name = 1 [json_name = "integrationName"];</code>
     * @param value The bytes for integrationName to set.
     * @return This builder for chaining.
     */
    public Builder setIntegrationNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      integrationName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object mimeType_ = "";
    /**
     * <code>string mime_type = 2 [json_name = "mimeType"];</code>
     * @return The mimeType.
     */
    public java.lang.String getMimeType() {
      java.lang.Object ref = mimeType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mimeType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string mime_type = 2 [json_name = "mimeType"];</code>
     * @return The bytes for mimeType.
     */
    public com.google.protobuf.ByteString
        getMimeTypeBytes() {
      java.lang.Object ref = mimeType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mimeType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string mime_type = 2 [json_name = "mimeType"];</code>
     * @param value The mimeType to set.
     * @return This builder for chaining.
     */
    public Builder setMimeType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      mimeType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string mime_type = 2 [json_name = "mimeType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMimeType() {
      mimeType_ = getDefaultInstance().getMimeType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string mime_type = 2 [json_name = "mimeType"];</code>
     * @param value The bytes for mimeType to set.
     * @return This builder for chaining.
     */
    public Builder setMimeTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      mimeType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object dataType_ = "";
    /**
     * <code>string data_type = 3 [json_name = "dataType"];</code>
     * @return The dataType.
     */
    public java.lang.String getDataType() {
      java.lang.Object ref = dataType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dataType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string data_type = 3 [json_name = "dataType"];</code>
     * @return The bytes for dataType.
     */
    public com.google.protobuf.ByteString
        getDataTypeBytes() {
      java.lang.Object ref = dataType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dataType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string data_type = 3 [json_name = "dataType"];</code>
     * @param value The dataType to set.
     * @return This builder for chaining.
     */
    public Builder setDataType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dataType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string data_type = 3 [json_name = "dataType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDataType() {
      dataType_ = getDefaultInstance().getDataType();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string data_type = 3 [json_name = "dataType"];</code>
     * @param value The bytes for dataType to set.
     * @return This builder for chaining.
     */
    public Builder setDataTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dataType_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:anduril.blobs.v1.FieldMatcher)
  }

  // @@protoc_insertion_point(class_scope:anduril.blobs.v1.FieldMatcher)
  private static final com.anduril.blobs.v1.FieldMatcher DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.blobs.v1.FieldMatcher();
  }

  public static com.anduril.blobs.v1.FieldMatcher getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FieldMatcher>
      PARSER = new com.google.protobuf.AbstractParser<FieldMatcher>() {
    @java.lang.Override
    public FieldMatcher parsePartialFrom(
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

  public static com.google.protobuf.Parser<FieldMatcher> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FieldMatcher> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.blobs.v1.FieldMatcher getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

