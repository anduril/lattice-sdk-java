// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/entity.pub.proto

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * An alternate id for an Entity.
 * </pre>
 *
 * Protobuf type {@code anduril.entitymanager.v1.AlternateId}
 */
public final class AlternateId extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.AlternateId)
    AlternateIdOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlternateId.newBuilder() to construct.
  private AlternateId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlternateId() {
    source_ = "";
    id_ = "";
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AlternateId();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.EntityPubProto.internal_static_anduril_entitymanager_v1_AlternateId_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.EntityPubProto.internal_static_anduril_entitymanager_v1_AlternateId_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.AlternateId.class, com.anduril.entitymanager.v1.AlternateId.Builder.class);
  }

  public static final int SOURCE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object source_ = "";
  /**
   * <pre>
   * deprecated in favor of type
   * </pre>
   *
   * <code>string source = 1 [json_name = "source", deprecated = true];</code>
   * @deprecated anduril.entitymanager.v1.AlternateId.source is deprecated.
   *     See anduril/entitymanager/v1/entity.pub.proto;l=304
   * @return The source.
   */
  @java.lang.Override
  @java.lang.Deprecated public java.lang.String getSource() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      source_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * deprecated in favor of type
   * </pre>
   *
   * <code>string source = 1 [json_name = "source", deprecated = true];</code>
   * @deprecated anduril.entitymanager.v1.AlternateId.source is deprecated.
   *     See anduril/entitymanager/v1/entity.pub.proto;l=304
   * @return The bytes for source.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.protobuf.ByteString
      getSourceBytes() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      source_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";
  /**
   * <code>string id = 2 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 2 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private int type_ = 0;
  /**
   * <code>.anduril.entitymanager.v1.AltIdType type = 3 [json_name = "type", (.anduril.entitymanager.v1.componentIdentifier) = true];</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.anduril.entitymanager.v1.AltIdType type = 3 [json_name = "type", (.anduril.entitymanager.v1.componentIdentifier) = true];</code>
   * @return The type.
   */
  @java.lang.Override public com.anduril.entitymanager.v1.AltIdType getType() {
    com.anduril.entitymanager.v1.AltIdType result = com.anduril.entitymanager.v1.AltIdType.forNumber(type_);
    return result == null ? com.anduril.entitymanager.v1.AltIdType.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(source_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, source_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, id_);
    }
    if (type_ != com.anduril.entitymanager.v1.AltIdType.ALT_ID_TYPE_INVALID.getNumber()) {
      output.writeEnum(3, type_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(source_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, source_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, id_);
    }
    if (type_ != com.anduril.entitymanager.v1.AltIdType.ALT_ID_TYPE_INVALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, type_);
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
    if (!(obj instanceof com.anduril.entitymanager.v1.AlternateId)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.AlternateId other = (com.anduril.entitymanager.v1.AlternateId) obj;

    if (!getSource()
        .equals(other.getSource())) return false;
    if (!getId()
        .equals(other.getId())) return false;
    if (type_ != other.type_) return false;
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
    hash = (37 * hash) + SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getSource().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.AlternateId parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.AlternateId parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.AlternateId parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.AlternateId parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.AlternateId parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.AlternateId parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.AlternateId parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.AlternateId parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.AlternateId parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.AlternateId parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.AlternateId parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.AlternateId parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.AlternateId prototype) {
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
   * An alternate id for an Entity.
   * </pre>
   *
   * Protobuf type {@code anduril.entitymanager.v1.AlternateId}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.AlternateId)
      com.anduril.entitymanager.v1.AlternateIdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.EntityPubProto.internal_static_anduril_entitymanager_v1_AlternateId_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.EntityPubProto.internal_static_anduril_entitymanager_v1_AlternateId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.AlternateId.class, com.anduril.entitymanager.v1.AlternateId.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.AlternateId.newBuilder()
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
      source_ = "";
      id_ = "";
      type_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.EntityPubProto.internal_static_anduril_entitymanager_v1_AlternateId_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.AlternateId getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.AlternateId.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.AlternateId build() {
      com.anduril.entitymanager.v1.AlternateId result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.AlternateId buildPartial() {
      com.anduril.entitymanager.v1.AlternateId result = new com.anduril.entitymanager.v1.AlternateId(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.entitymanager.v1.AlternateId result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.source_ = source_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.type_ = type_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entitymanager.v1.AlternateId) {
        return mergeFrom((com.anduril.entitymanager.v1.AlternateId)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.AlternateId other) {
      if (other == com.anduril.entitymanager.v1.AlternateId.getDefaultInstance()) return this;
      if (!other.getSource().isEmpty()) {
        source_ = other.source_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
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
              source_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              id_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              type_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private java.lang.Object source_ = "";
    /**
     * <pre>
     * deprecated in favor of type
     * </pre>
     *
     * <code>string source = 1 [json_name = "source", deprecated = true];</code>
     * @deprecated anduril.entitymanager.v1.AlternateId.source is deprecated.
     *     See anduril/entitymanager/v1/entity.pub.proto;l=304
     * @return The source.
     */
    @java.lang.Deprecated public java.lang.String getSource() {
      java.lang.Object ref = source_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        source_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * deprecated in favor of type
     * </pre>
     *
     * <code>string source = 1 [json_name = "source", deprecated = true];</code>
     * @deprecated anduril.entitymanager.v1.AlternateId.source is deprecated.
     *     See anduril/entitymanager/v1/entity.pub.proto;l=304
     * @return The bytes for source.
     */
    @java.lang.Deprecated public com.google.protobuf.ByteString
        getSourceBytes() {
      java.lang.Object ref = source_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        source_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * deprecated in favor of type
     * </pre>
     *
     * <code>string source = 1 [json_name = "source", deprecated = true];</code>
     * @deprecated anduril.entitymanager.v1.AlternateId.source is deprecated.
     *     See anduril/entitymanager/v1/entity.pub.proto;l=304
     * @param value The source to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setSource(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      source_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * deprecated in favor of type
     * </pre>
     *
     * <code>string source = 1 [json_name = "source", deprecated = true];</code>
     * @deprecated anduril.entitymanager.v1.AlternateId.source is deprecated.
     *     See anduril/entitymanager/v1/entity.pub.proto;l=304
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearSource() {
      source_ = getDefaultInstance().getSource();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * deprecated in favor of type
     * </pre>
     *
     * <code>string source = 1 [json_name = "source", deprecated = true];</code>
     * @deprecated anduril.entitymanager.v1.AlternateId.source is deprecated.
     *     See anduril/entitymanager/v1/entity.pub.proto;l=304
     * @param value The bytes for source to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setSourceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      source_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 2 [json_name = "id"];</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 2 [json_name = "id"];</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 2 [json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      id_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 2 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string id = 2 [json_name = "id"];</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      id_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.anduril.entitymanager.v1.AltIdType type = 3 [json_name = "type", (.anduril.entitymanager.v1.componentIdentifier) = true];</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.anduril.entitymanager.v1.AltIdType type = 3 [json_name = "type", (.anduril.entitymanager.v1.componentIdentifier) = true];</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.AltIdType type = 3 [json_name = "type", (.anduril.entitymanager.v1.componentIdentifier) = true];</code>
     * @return The type.
     */
    @java.lang.Override
    public com.anduril.entitymanager.v1.AltIdType getType() {
      com.anduril.entitymanager.v1.AltIdType result = com.anduril.entitymanager.v1.AltIdType.forNumber(type_);
      return result == null ? com.anduril.entitymanager.v1.AltIdType.UNRECOGNIZED : result;
    }
    /**
     * <code>.anduril.entitymanager.v1.AltIdType type = 3 [json_name = "type", (.anduril.entitymanager.v1.componentIdentifier) = true];</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.anduril.entitymanager.v1.AltIdType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.AltIdType type = 3 [json_name = "type", (.anduril.entitymanager.v1.componentIdentifier) = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      type_ = 0;
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


    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.AlternateId)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.AlternateId)
  private static final com.anduril.entitymanager.v1.AlternateId DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.AlternateId();
  }

  public static com.anduril.entitymanager.v1.AlternateId getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlternateId>
      PARSER = new com.google.protobuf.AbstractParser<AlternateId>() {
    @java.lang.Override
    public AlternateId parsePartialFrom(
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

  public static com.google.protobuf.Parser<AlternateId> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlternateId> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.AlternateId getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

