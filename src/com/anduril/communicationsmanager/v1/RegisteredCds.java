// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/communicationsmanager/v1/cross_domain.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.communicationsmanager.v1;

/**
 * Protobuf type {@code anduril.communicationsmanager.v1.RegisteredCds}
 */
public final class RegisteredCds extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.communicationsmanager.v1.RegisteredCds)
    RegisteredCdsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RegisteredCds.newBuilder() to construct.
  private RegisteredCds(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegisteredCds() {
    hostId_ = "";
    cdsName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RegisteredCds();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.communicationsmanager.v1.CrossDomainPubProto.internal_static_anduril_communicationsmanager_v1_RegisteredCds_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.communicationsmanager.v1.CrossDomainPubProto.internal_static_anduril_communicationsmanager_v1_RegisteredCds_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.communicationsmanager.v1.RegisteredCds.class, com.anduril.communicationsmanager.v1.RegisteredCds.Builder.class);
  }

  public static final int HOST_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object hostId_ = "";
  /**
   * <pre>
   * Flux hexadecimal host id, i.e. '5a'.
   * </pre>
   *
   * <code>string host_id = 1 [json_name = "hostId"];</code>
   * @return The hostId.
   */
  @java.lang.Override
  public java.lang.String getHostId() {
    java.lang.Object ref = hostId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hostId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Flux hexadecimal host id, i.e. '5a'.
   * </pre>
   *
   * <code>string host_id = 1 [json_name = "hostId"];</code>
   * @return The bytes for hostId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHostIdBytes() {
    java.lang.Object ref = hostId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hostId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CDS_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cdsName_ = "";
  /**
   * <pre>
   * identifier of the CDS to apply the rule to. A single Flux host may have multiple CDS services.
   * </pre>
   *
   * <code>string cds_name = 2 [json_name = "cdsName"];</code>
   * @return The cdsName.
   */
  @java.lang.Override
  public java.lang.String getCdsName() {
    java.lang.Object ref = cdsName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cdsName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * identifier of the CDS to apply the rule to. A single Flux host may have multiple CDS services.
   * </pre>
   *
   * <code>string cds_name = 2 [json_name = "cdsName"];</code>
   * @return The bytes for cdsName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCdsNameBytes() {
    java.lang.Object ref = cdsName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cdsName_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hostId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, hostId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cdsName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cdsName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hostId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, hostId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cdsName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, cdsName_);
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
    if (!(obj instanceof com.anduril.communicationsmanager.v1.RegisteredCds)) {
      return super.equals(obj);
    }
    com.anduril.communicationsmanager.v1.RegisteredCds other = (com.anduril.communicationsmanager.v1.RegisteredCds) obj;

    if (!getHostId()
        .equals(other.getHostId())) return false;
    if (!getCdsName()
        .equals(other.getCdsName())) return false;
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
    hash = (37 * hash) + HOST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getHostId().hashCode();
    hash = (37 * hash) + CDS_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getCdsName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.communicationsmanager.v1.RegisteredCds parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.communicationsmanager.v1.RegisteredCds parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.communicationsmanager.v1.RegisteredCds parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.communicationsmanager.v1.RegisteredCds parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.communicationsmanager.v1.RegisteredCds parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.communicationsmanager.v1.RegisteredCds parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.communicationsmanager.v1.RegisteredCds parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.communicationsmanager.v1.RegisteredCds parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.communicationsmanager.v1.RegisteredCds parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.communicationsmanager.v1.RegisteredCds parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.communicationsmanager.v1.RegisteredCds parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.communicationsmanager.v1.RegisteredCds parseFrom(
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
  public static Builder newBuilder(com.anduril.communicationsmanager.v1.RegisteredCds prototype) {
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
   * Protobuf type {@code anduril.communicationsmanager.v1.RegisteredCds}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.communicationsmanager.v1.RegisteredCds)
      com.anduril.communicationsmanager.v1.RegisteredCdsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.communicationsmanager.v1.CrossDomainPubProto.internal_static_anduril_communicationsmanager_v1_RegisteredCds_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.communicationsmanager.v1.CrossDomainPubProto.internal_static_anduril_communicationsmanager_v1_RegisteredCds_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.communicationsmanager.v1.RegisteredCds.class, com.anduril.communicationsmanager.v1.RegisteredCds.Builder.class);
    }

    // Construct using com.anduril.communicationsmanager.v1.RegisteredCds.newBuilder()
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
      hostId_ = "";
      cdsName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.communicationsmanager.v1.CrossDomainPubProto.internal_static_anduril_communicationsmanager_v1_RegisteredCds_descriptor;
    }

    @java.lang.Override
    public com.anduril.communicationsmanager.v1.RegisteredCds getDefaultInstanceForType() {
      return com.anduril.communicationsmanager.v1.RegisteredCds.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.communicationsmanager.v1.RegisteredCds build() {
      com.anduril.communicationsmanager.v1.RegisteredCds result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.communicationsmanager.v1.RegisteredCds buildPartial() {
      com.anduril.communicationsmanager.v1.RegisteredCds result = new com.anduril.communicationsmanager.v1.RegisteredCds(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.communicationsmanager.v1.RegisteredCds result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hostId_ = hostId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.cdsName_ = cdsName_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.communicationsmanager.v1.RegisteredCds) {
        return mergeFrom((com.anduril.communicationsmanager.v1.RegisteredCds)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.communicationsmanager.v1.RegisteredCds other) {
      if (other == com.anduril.communicationsmanager.v1.RegisteredCds.getDefaultInstance()) return this;
      if (!other.getHostId().isEmpty()) {
        hostId_ = other.hostId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getCdsName().isEmpty()) {
        cdsName_ = other.cdsName_;
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
              hostId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              cdsName_ = input.readStringRequireUtf8();
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

    private java.lang.Object hostId_ = "";
    /**
     * <pre>
     * Flux hexadecimal host id, i.e. '5a'.
     * </pre>
     *
     * <code>string host_id = 1 [json_name = "hostId"];</code>
     * @return The hostId.
     */
    public java.lang.String getHostId() {
      java.lang.Object ref = hostId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hostId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Flux hexadecimal host id, i.e. '5a'.
     * </pre>
     *
     * <code>string host_id = 1 [json_name = "hostId"];</code>
     * @return The bytes for hostId.
     */
    public com.google.protobuf.ByteString
        getHostIdBytes() {
      java.lang.Object ref = hostId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hostId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Flux hexadecimal host id, i.e. '5a'.
     * </pre>
     *
     * <code>string host_id = 1 [json_name = "hostId"];</code>
     * @param value The hostId to set.
     * @return This builder for chaining.
     */
    public Builder setHostId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      hostId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Flux hexadecimal host id, i.e. '5a'.
     * </pre>
     *
     * <code>string host_id = 1 [json_name = "hostId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHostId() {
      hostId_ = getDefaultInstance().getHostId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Flux hexadecimal host id, i.e. '5a'.
     * </pre>
     *
     * <code>string host_id = 1 [json_name = "hostId"];</code>
     * @param value The bytes for hostId to set.
     * @return This builder for chaining.
     */
    public Builder setHostIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      hostId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object cdsName_ = "";
    /**
     * <pre>
     * identifier of the CDS to apply the rule to. A single Flux host may have multiple CDS services.
     * </pre>
     *
     * <code>string cds_name = 2 [json_name = "cdsName"];</code>
     * @return The cdsName.
     */
    public java.lang.String getCdsName() {
      java.lang.Object ref = cdsName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cdsName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * identifier of the CDS to apply the rule to. A single Flux host may have multiple CDS services.
     * </pre>
     *
     * <code>string cds_name = 2 [json_name = "cdsName"];</code>
     * @return The bytes for cdsName.
     */
    public com.google.protobuf.ByteString
        getCdsNameBytes() {
      java.lang.Object ref = cdsName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cdsName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * identifier of the CDS to apply the rule to. A single Flux host may have multiple CDS services.
     * </pre>
     *
     * <code>string cds_name = 2 [json_name = "cdsName"];</code>
     * @param value The cdsName to set.
     * @return This builder for chaining.
     */
    public Builder setCdsName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cdsName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * identifier of the CDS to apply the rule to. A single Flux host may have multiple CDS services.
     * </pre>
     *
     * <code>string cds_name = 2 [json_name = "cdsName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCdsName() {
      cdsName_ = getDefaultInstance().getCdsName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * identifier of the CDS to apply the rule to. A single Flux host may have multiple CDS services.
     * </pre>
     *
     * <code>string cds_name = 2 [json_name = "cdsName"];</code>
     * @param value The bytes for cdsName to set.
     * @return This builder for chaining.
     */
    public Builder setCdsNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cdsName_ = value;
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


    // @@protoc_insertion_point(builder_scope:anduril.communicationsmanager.v1.RegisteredCds)
  }

  // @@protoc_insertion_point(class_scope:anduril.communicationsmanager.v1.RegisteredCds)
  private static final com.anduril.communicationsmanager.v1.RegisteredCds DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.communicationsmanager.v1.RegisteredCds();
  }

  public static com.anduril.communicationsmanager.v1.RegisteredCds getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegisteredCds>
      PARSER = new com.google.protobuf.AbstractParser<RegisteredCds>() {
    @java.lang.Override
    public RegisteredCds parsePartialFrom(
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

  public static com.google.protobuf.Parser<RegisteredCds> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegisteredCds> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.communicationsmanager.v1.RegisteredCds getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

