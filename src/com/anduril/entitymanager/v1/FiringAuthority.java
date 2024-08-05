// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/entitymanager/v1/geoentity.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * Lists the entities that have authority to execute fires into, or through, this FSCM
 * </pre>
 *
 * Protobuf type {@code anduril.entitymanager.v1.FiringAuthority}
 */
public final class FiringAuthority extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.FiringAuthority)
    FiringAuthorityOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      FiringAuthority.class.getName());
  }
  // Use FiringAuthority.newBuilder() to construct.
  private FiringAuthority(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private FiringAuthority() {
    entityIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.GeoentityPubProto.internal_static_anduril_entitymanager_v1_FiringAuthority_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.GeoentityPubProto.internal_static_anduril_entitymanager_v1_FiringAuthority_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.FiringAuthority.class, com.anduril.entitymanager.v1.FiringAuthority.Builder.class);
  }

  public static final int ENTITY_IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList entityIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string entity_ids = 1 [json_name = "entityIds"];</code>
   * @return A list containing the entityIds.
   */
  public com.google.protobuf.ProtocolStringList
      getEntityIdsList() {
    return entityIds_;
  }
  /**
   * <code>repeated string entity_ids = 1 [json_name = "entityIds"];</code>
   * @return The count of entityIds.
   */
  public int getEntityIdsCount() {
    return entityIds_.size();
  }
  /**
   * <code>repeated string entity_ids = 1 [json_name = "entityIds"];</code>
   * @param index The index of the element to return.
   * @return The entityIds at the given index.
   */
  public java.lang.String getEntityIds(int index) {
    return entityIds_.get(index);
  }
  /**
   * <code>repeated string entity_ids = 1 [json_name = "entityIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the entityIds at the given index.
   */
  public com.google.protobuf.ByteString
      getEntityIdsBytes(int index) {
    return entityIds_.getByteString(index);
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
    for (int i = 0; i < entityIds_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, entityIds_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < entityIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(entityIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getEntityIdsList().size();
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
    if (!(obj instanceof com.anduril.entitymanager.v1.FiringAuthority)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.FiringAuthority other = (com.anduril.entitymanager.v1.FiringAuthority) obj;

    if (!getEntityIdsList()
        .equals(other.getEntityIdsList())) return false;
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
    if (getEntityIdsCount() > 0) {
      hash = (37 * hash) + ENTITY_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getEntityIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.FiringAuthority parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.FiringAuthority parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.FiringAuthority parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.FiringAuthority parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.FiringAuthority parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.FiringAuthority parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.FiringAuthority parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.FiringAuthority parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.entitymanager.v1.FiringAuthority parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.entitymanager.v1.FiringAuthority parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.FiringAuthority parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.FiringAuthority parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.anduril.entitymanager.v1.FiringAuthority prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Lists the entities that have authority to execute fires into, or through, this FSCM
   * </pre>
   *
   * Protobuf type {@code anduril.entitymanager.v1.FiringAuthority}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.FiringAuthority)
      com.anduril.entitymanager.v1.FiringAuthorityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.GeoentityPubProto.internal_static_anduril_entitymanager_v1_FiringAuthority_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.GeoentityPubProto.internal_static_anduril_entitymanager_v1_FiringAuthority_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.FiringAuthority.class, com.anduril.entitymanager.v1.FiringAuthority.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.FiringAuthority.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      entityIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.GeoentityPubProto.internal_static_anduril_entitymanager_v1_FiringAuthority_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.FiringAuthority getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.FiringAuthority.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.FiringAuthority build() {
      com.anduril.entitymanager.v1.FiringAuthority result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.FiringAuthority buildPartial() {
      com.anduril.entitymanager.v1.FiringAuthority result = new com.anduril.entitymanager.v1.FiringAuthority(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.entitymanager.v1.FiringAuthority result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        entityIds_.makeImmutable();
        result.entityIds_ = entityIds_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entitymanager.v1.FiringAuthority) {
        return mergeFrom((com.anduril.entitymanager.v1.FiringAuthority)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.FiringAuthority other) {
      if (other == com.anduril.entitymanager.v1.FiringAuthority.getDefaultInstance()) return this;
      if (!other.entityIds_.isEmpty()) {
        if (entityIds_.isEmpty()) {
          entityIds_ = other.entityIds_;
          bitField0_ |= 0x00000001;
        } else {
          ensureEntityIdsIsMutable();
          entityIds_.addAll(other.entityIds_);
        }
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureEntityIdsIsMutable();
              entityIds_.add(s);
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

    private com.google.protobuf.LazyStringArrayList entityIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureEntityIdsIsMutable() {
      if (!entityIds_.isModifiable()) {
        entityIds_ = new com.google.protobuf.LazyStringArrayList(entityIds_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string entity_ids = 1 [json_name = "entityIds"];</code>
     * @return A list containing the entityIds.
     */
    public com.google.protobuf.ProtocolStringList
        getEntityIdsList() {
      entityIds_.makeImmutable();
      return entityIds_;
    }
    /**
     * <code>repeated string entity_ids = 1 [json_name = "entityIds"];</code>
     * @return The count of entityIds.
     */
    public int getEntityIdsCount() {
      return entityIds_.size();
    }
    /**
     * <code>repeated string entity_ids = 1 [json_name = "entityIds"];</code>
     * @param index The index of the element to return.
     * @return The entityIds at the given index.
     */
    public java.lang.String getEntityIds(int index) {
      return entityIds_.get(index);
    }
    /**
     * <code>repeated string entity_ids = 1 [json_name = "entityIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the entityIds at the given index.
     */
    public com.google.protobuf.ByteString
        getEntityIdsBytes(int index) {
      return entityIds_.getByteString(index);
    }
    /**
     * <code>repeated string entity_ids = 1 [json_name = "entityIds"];</code>
     * @param index The index to set the value at.
     * @param value The entityIds to set.
     * @return This builder for chaining.
     */
    public Builder setEntityIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureEntityIdsIsMutable();
      entityIds_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string entity_ids = 1 [json_name = "entityIds"];</code>
     * @param value The entityIds to add.
     * @return This builder for chaining.
     */
    public Builder addEntityIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureEntityIdsIsMutable();
      entityIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string entity_ids = 1 [json_name = "entityIds"];</code>
     * @param values The entityIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllEntityIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureEntityIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, entityIds_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string entity_ids = 1 [json_name = "entityIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEntityIds() {
      entityIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string entity_ids = 1 [json_name = "entityIds"];</code>
     * @param value The bytes of the entityIds to add.
     * @return This builder for chaining.
     */
    public Builder addEntityIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureEntityIdsIsMutable();
      entityIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.FiringAuthority)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.FiringAuthority)
  private static final com.anduril.entitymanager.v1.FiringAuthority DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.FiringAuthority();
  }

  public static com.anduril.entitymanager.v1.FiringAuthority getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FiringAuthority>
      PARSER = new com.google.protobuf.AbstractParser<FiringAuthority>() {
    @java.lang.Override
    public FiringAuthority parsePartialFrom(
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

  public static com.google.protobuf.Parser<FiringAuthority> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FiringAuthority> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.FiringAuthority getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

