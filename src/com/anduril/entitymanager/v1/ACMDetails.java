// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/geoentity.pub.proto

package com.anduril.entitymanager.v1;

/**
 * Protobuf type {@code anduril.entitymanager.v1.ACMDetails}
 */
public final class ACMDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.ACMDetails)
    ACMDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ACMDetails.newBuilder() to construct.
  private ACMDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ACMDetails() {
    acmType_ = 0;
    acmDescription_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ACMDetails();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.GeoentityPubProto.internal_static_anduril_entitymanager_v1_ACMDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.GeoentityPubProto.internal_static_anduril_entitymanager_v1_ACMDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.ACMDetails.class, com.anduril.entitymanager.v1.ACMDetails.Builder.class);
  }

  public static final int ACM_TYPE_FIELD_NUMBER = 1;
  private int acmType_ = 0;
  /**
   * <code>.anduril.entitymanager.v1.ACMDetailType acm_type = 1 [json_name = "acmType"];</code>
   * @return The enum numeric value on the wire for acmType.
   */
  @java.lang.Override public int getAcmTypeValue() {
    return acmType_;
  }
  /**
   * <code>.anduril.entitymanager.v1.ACMDetailType acm_type = 1 [json_name = "acmType"];</code>
   * @return The acmType.
   */
  @java.lang.Override public com.anduril.entitymanager.v1.ACMDetailType getAcmType() {
    com.anduril.entitymanager.v1.ACMDetailType result = com.anduril.entitymanager.v1.ACMDetailType.forNumber(acmType_);
    return result == null ? com.anduril.entitymanager.v1.ACMDetailType.UNRECOGNIZED : result;
  }

  public static final int ACM_DESCRIPTION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object acmDescription_ = "";
  /**
   * <pre>
   * Used for loosely typed associations, such as assignment to a specific fires unit.
   * Limit to 150 characters.
   * </pre>
   *
   * <code>string acm_description = 2 [json_name = "acmDescription"];</code>
   * @return The acmDescription.
   */
  @java.lang.Override
  public java.lang.String getAcmDescription() {
    java.lang.Object ref = acmDescription_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      acmDescription_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Used for loosely typed associations, such as assignment to a specific fires unit.
   * Limit to 150 characters.
   * </pre>
   *
   * <code>string acm_description = 2 [json_name = "acmDescription"];</code>
   * @return The bytes for acmDescription.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAcmDescriptionBytes() {
    java.lang.Object ref = acmDescription_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      acmDescription_ = b;
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
    if (acmType_ != com.anduril.entitymanager.v1.ACMDetailType.ACM_DETAIL_TYPE_INVALID.getNumber()) {
      output.writeEnum(1, acmType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(acmDescription_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, acmDescription_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (acmType_ != com.anduril.entitymanager.v1.ACMDetailType.ACM_DETAIL_TYPE_INVALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, acmType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(acmDescription_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, acmDescription_);
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
    if (!(obj instanceof com.anduril.entitymanager.v1.ACMDetails)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.ACMDetails other = (com.anduril.entitymanager.v1.ACMDetails) obj;

    if (acmType_ != other.acmType_) return false;
    if (!getAcmDescription()
        .equals(other.getAcmDescription())) return false;
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
    hash = (37 * hash) + ACM_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + acmType_;
    hash = (37 * hash) + ACM_DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getAcmDescription().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.ACMDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.ACMDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.ACMDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.ACMDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.ACMDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.ACMDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.ACMDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.ACMDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.ACMDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.ACMDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.ACMDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.ACMDetails parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.ACMDetails prototype) {
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
   * Protobuf type {@code anduril.entitymanager.v1.ACMDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.ACMDetails)
      com.anduril.entitymanager.v1.ACMDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.GeoentityPubProto.internal_static_anduril_entitymanager_v1_ACMDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.GeoentityPubProto.internal_static_anduril_entitymanager_v1_ACMDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.ACMDetails.class, com.anduril.entitymanager.v1.ACMDetails.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.ACMDetails.newBuilder()
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
      acmType_ = 0;
      acmDescription_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.GeoentityPubProto.internal_static_anduril_entitymanager_v1_ACMDetails_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.ACMDetails getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.ACMDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.ACMDetails build() {
      com.anduril.entitymanager.v1.ACMDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.ACMDetails buildPartial() {
      com.anduril.entitymanager.v1.ACMDetails result = new com.anduril.entitymanager.v1.ACMDetails(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.entitymanager.v1.ACMDetails result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.acmType_ = acmType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.acmDescription_ = acmDescription_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entitymanager.v1.ACMDetails) {
        return mergeFrom((com.anduril.entitymanager.v1.ACMDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.ACMDetails other) {
      if (other == com.anduril.entitymanager.v1.ACMDetails.getDefaultInstance()) return this;
      if (other.acmType_ != 0) {
        setAcmTypeValue(other.getAcmTypeValue());
      }
      if (!other.getAcmDescription().isEmpty()) {
        acmDescription_ = other.acmDescription_;
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
            case 8: {
              acmType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              acmDescription_ = input.readStringRequireUtf8();
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

    private int acmType_ = 0;
    /**
     * <code>.anduril.entitymanager.v1.ACMDetailType acm_type = 1 [json_name = "acmType"];</code>
     * @return The enum numeric value on the wire for acmType.
     */
    @java.lang.Override public int getAcmTypeValue() {
      return acmType_;
    }
    /**
     * <code>.anduril.entitymanager.v1.ACMDetailType acm_type = 1 [json_name = "acmType"];</code>
     * @param value The enum numeric value on the wire for acmType to set.
     * @return This builder for chaining.
     */
    public Builder setAcmTypeValue(int value) {
      acmType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.ACMDetailType acm_type = 1 [json_name = "acmType"];</code>
     * @return The acmType.
     */
    @java.lang.Override
    public com.anduril.entitymanager.v1.ACMDetailType getAcmType() {
      com.anduril.entitymanager.v1.ACMDetailType result = com.anduril.entitymanager.v1.ACMDetailType.forNumber(acmType_);
      return result == null ? com.anduril.entitymanager.v1.ACMDetailType.UNRECOGNIZED : result;
    }
    /**
     * <code>.anduril.entitymanager.v1.ACMDetailType acm_type = 1 [json_name = "acmType"];</code>
     * @param value The acmType to set.
     * @return This builder for chaining.
     */
    public Builder setAcmType(com.anduril.entitymanager.v1.ACMDetailType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      acmType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.ACMDetailType acm_type = 1 [json_name = "acmType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAcmType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      acmType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object acmDescription_ = "";
    /**
     * <pre>
     * Used for loosely typed associations, such as assignment to a specific fires unit.
     * Limit to 150 characters.
     * </pre>
     *
     * <code>string acm_description = 2 [json_name = "acmDescription"];</code>
     * @return The acmDescription.
     */
    public java.lang.String getAcmDescription() {
      java.lang.Object ref = acmDescription_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        acmDescription_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Used for loosely typed associations, such as assignment to a specific fires unit.
     * Limit to 150 characters.
     * </pre>
     *
     * <code>string acm_description = 2 [json_name = "acmDescription"];</code>
     * @return The bytes for acmDescription.
     */
    public com.google.protobuf.ByteString
        getAcmDescriptionBytes() {
      java.lang.Object ref = acmDescription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        acmDescription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Used for loosely typed associations, such as assignment to a specific fires unit.
     * Limit to 150 characters.
     * </pre>
     *
     * <code>string acm_description = 2 [json_name = "acmDescription"];</code>
     * @param value The acmDescription to set.
     * @return This builder for chaining.
     */
    public Builder setAcmDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      acmDescription_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Used for loosely typed associations, such as assignment to a specific fires unit.
     * Limit to 150 characters.
     * </pre>
     *
     * <code>string acm_description = 2 [json_name = "acmDescription"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAcmDescription() {
      acmDescription_ = getDefaultInstance().getAcmDescription();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Used for loosely typed associations, such as assignment to a specific fires unit.
     * Limit to 150 characters.
     * </pre>
     *
     * <code>string acm_description = 2 [json_name = "acmDescription"];</code>
     * @param value The bytes for acmDescription to set.
     * @return This builder for chaining.
     */
    public Builder setAcmDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      acmDescription_ = value;
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


    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.ACMDetails)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.ACMDetails)
  private static final com.anduril.entitymanager.v1.ACMDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.ACMDetails();
  }

  public static com.anduril.entitymanager.v1.ACMDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ACMDetails>
      PARSER = new com.google.protobuf.AbstractParser<ACMDetails>() {
    @java.lang.Override
    public ACMDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<ACMDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ACMDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.ACMDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

