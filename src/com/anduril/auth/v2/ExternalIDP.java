// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/auth/v2/idp.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.auth.v2;

/**
 * <pre>
 * A message indicating that a user may login with an external IDP.
 * </pre>
 *
 * Protobuf type {@code anduril.auth.v2.ExternalIDP}
 */
public final class ExternalIDP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.auth.v2.ExternalIDP)
    ExternalIDPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExternalIDP.newBuilder() to construct.
  private ExternalIDP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExternalIDP() {
    name_ = "";
    ssoUrl_ = "";
    uniqueId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExternalIDP();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.auth.v2.IdpPubProto.internal_static_anduril_auth_v2_ExternalIDP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.auth.v2.IdpPubProto.internal_static_anduril_auth_v2_ExternalIDP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.auth.v2.ExternalIDP.class, com.anduril.auth.v2.ExternalIDP.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * A human-readable name for the IDP.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A human-readable name for the IDP.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SSO_URL_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object ssoUrl_ = "";
  /**
   * <pre>
   * The single sign on URL that the user may be redirected to to authenticate.
   * </pre>
   *
   * <code>string sso_url = 2 [json_name = "ssoUrl"];</code>
   * @return The ssoUrl.
   */
  @java.lang.Override
  public java.lang.String getSsoUrl() {
    java.lang.Object ref = ssoUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ssoUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The single sign on URL that the user may be redirected to to authenticate.
   * </pre>
   *
   * <code>string sso_url = 2 [json_name = "ssoUrl"];</code>
   * @return The bytes for ssoUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSsoUrlBytes() {
    java.lang.Object ref = ssoUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ssoUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UNIQUE_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object uniqueId_ = "";
  /**
   * <pre>
   * String that uniquely identified the same IDP across different instances
   * </pre>
   *
   * <code>string unique_id = 3 [json_name = "uniqueId"];</code>
   * @return The uniqueId.
   */
  @java.lang.Override
  public java.lang.String getUniqueId() {
    java.lang.Object ref = uniqueId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uniqueId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * String that uniquely identified the same IDP across different instances
   * </pre>
   *
   * <code>string unique_id = 3 [json_name = "uniqueId"];</code>
   * @return The bytes for uniqueId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUniqueIdBytes() {
    java.lang.Object ref = uniqueId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uniqueId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ssoUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ssoUrl_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uniqueId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, uniqueId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ssoUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ssoUrl_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uniqueId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, uniqueId_);
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
    if (!(obj instanceof com.anduril.auth.v2.ExternalIDP)) {
      return super.equals(obj);
    }
    com.anduril.auth.v2.ExternalIDP other = (com.anduril.auth.v2.ExternalIDP) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getSsoUrl()
        .equals(other.getSsoUrl())) return false;
    if (!getUniqueId()
        .equals(other.getUniqueId())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + SSO_URL_FIELD_NUMBER;
    hash = (53 * hash) + getSsoUrl().hashCode();
    hash = (37 * hash) + UNIQUE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUniqueId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.auth.v2.ExternalIDP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.auth.v2.ExternalIDP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.auth.v2.ExternalIDP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.auth.v2.ExternalIDP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.auth.v2.ExternalIDP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.auth.v2.ExternalIDP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.auth.v2.ExternalIDP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.auth.v2.ExternalIDP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.auth.v2.ExternalIDP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.auth.v2.ExternalIDP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.auth.v2.ExternalIDP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.auth.v2.ExternalIDP parseFrom(
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
  public static Builder newBuilder(com.anduril.auth.v2.ExternalIDP prototype) {
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
   * A message indicating that a user may login with an external IDP.
   * </pre>
   *
   * Protobuf type {@code anduril.auth.v2.ExternalIDP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.auth.v2.ExternalIDP)
      com.anduril.auth.v2.ExternalIDPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.auth.v2.IdpPubProto.internal_static_anduril_auth_v2_ExternalIDP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.auth.v2.IdpPubProto.internal_static_anduril_auth_v2_ExternalIDP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.auth.v2.ExternalIDP.class, com.anduril.auth.v2.ExternalIDP.Builder.class);
    }

    // Construct using com.anduril.auth.v2.ExternalIDP.newBuilder()
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
      name_ = "";
      ssoUrl_ = "";
      uniqueId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.auth.v2.IdpPubProto.internal_static_anduril_auth_v2_ExternalIDP_descriptor;
    }

    @java.lang.Override
    public com.anduril.auth.v2.ExternalIDP getDefaultInstanceForType() {
      return com.anduril.auth.v2.ExternalIDP.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.auth.v2.ExternalIDP build() {
      com.anduril.auth.v2.ExternalIDP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.auth.v2.ExternalIDP buildPartial() {
      com.anduril.auth.v2.ExternalIDP result = new com.anduril.auth.v2.ExternalIDP(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.auth.v2.ExternalIDP result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ssoUrl_ = ssoUrl_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.uniqueId_ = uniqueId_;
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
      if (other instanceof com.anduril.auth.v2.ExternalIDP) {
        return mergeFrom((com.anduril.auth.v2.ExternalIDP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.auth.v2.ExternalIDP other) {
      if (other == com.anduril.auth.v2.ExternalIDP.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSsoUrl().isEmpty()) {
        ssoUrl_ = other.ssoUrl_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getUniqueId().isEmpty()) {
        uniqueId_ = other.uniqueId_;
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              ssoUrl_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              uniqueId_ = input.readStringRequireUtf8();
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * A human-readable name for the IDP.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A human-readable name for the IDP.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A human-readable name for the IDP.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A human-readable name for the IDP.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A human-readable name for the IDP.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object ssoUrl_ = "";
    /**
     * <pre>
     * The single sign on URL that the user may be redirected to to authenticate.
     * </pre>
     *
     * <code>string sso_url = 2 [json_name = "ssoUrl"];</code>
     * @return The ssoUrl.
     */
    public java.lang.String getSsoUrl() {
      java.lang.Object ref = ssoUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ssoUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The single sign on URL that the user may be redirected to to authenticate.
     * </pre>
     *
     * <code>string sso_url = 2 [json_name = "ssoUrl"];</code>
     * @return The bytes for ssoUrl.
     */
    public com.google.protobuf.ByteString
        getSsoUrlBytes() {
      java.lang.Object ref = ssoUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ssoUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The single sign on URL that the user may be redirected to to authenticate.
     * </pre>
     *
     * <code>string sso_url = 2 [json_name = "ssoUrl"];</code>
     * @param value The ssoUrl to set.
     * @return This builder for chaining.
     */
    public Builder setSsoUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ssoUrl_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The single sign on URL that the user may be redirected to to authenticate.
     * </pre>
     *
     * <code>string sso_url = 2 [json_name = "ssoUrl"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSsoUrl() {
      ssoUrl_ = getDefaultInstance().getSsoUrl();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The single sign on URL that the user may be redirected to to authenticate.
     * </pre>
     *
     * <code>string sso_url = 2 [json_name = "ssoUrl"];</code>
     * @param value The bytes for ssoUrl to set.
     * @return This builder for chaining.
     */
    public Builder setSsoUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ssoUrl_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object uniqueId_ = "";
    /**
     * <pre>
     * String that uniquely identified the same IDP across different instances
     * </pre>
     *
     * <code>string unique_id = 3 [json_name = "uniqueId"];</code>
     * @return The uniqueId.
     */
    public java.lang.String getUniqueId() {
      java.lang.Object ref = uniqueId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uniqueId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * String that uniquely identified the same IDP across different instances
     * </pre>
     *
     * <code>string unique_id = 3 [json_name = "uniqueId"];</code>
     * @return The bytes for uniqueId.
     */
    public com.google.protobuf.ByteString
        getUniqueIdBytes() {
      java.lang.Object ref = uniqueId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uniqueId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * String that uniquely identified the same IDP across different instances
     * </pre>
     *
     * <code>string unique_id = 3 [json_name = "uniqueId"];</code>
     * @param value The uniqueId to set.
     * @return This builder for chaining.
     */
    public Builder setUniqueId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      uniqueId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * String that uniquely identified the same IDP across different instances
     * </pre>
     *
     * <code>string unique_id = 3 [json_name = "uniqueId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUniqueId() {
      uniqueId_ = getDefaultInstance().getUniqueId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * String that uniquely identified the same IDP across different instances
     * </pre>
     *
     * <code>string unique_id = 3 [json_name = "uniqueId"];</code>
     * @param value The bytes for uniqueId to set.
     * @return This builder for chaining.
     */
    public Builder setUniqueIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      uniqueId_ = value;
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


    // @@protoc_insertion_point(builder_scope:anduril.auth.v2.ExternalIDP)
  }

  // @@protoc_insertion_point(class_scope:anduril.auth.v2.ExternalIDP)
  private static final com.anduril.auth.v2.ExternalIDP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.auth.v2.ExternalIDP();
  }

  public static com.anduril.auth.v2.ExternalIDP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExternalIDP>
      PARSER = new com.google.protobuf.AbstractParser<ExternalIDP>() {
    @java.lang.Override
    public ExternalIDP parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExternalIDP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExternalIDP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.auth.v2.ExternalIDP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

