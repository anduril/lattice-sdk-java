// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/entity.pub.proto

package com.anduril.entitymanager.v1;

/**
 * Protobuf type {@code anduril.entitymanager.v1.PrimaryCorrelation}
 */
public final class PrimaryCorrelation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.PrimaryCorrelation)
    PrimaryCorrelationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PrimaryCorrelation.newBuilder() to construct.
  private PrimaryCorrelation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PrimaryCorrelation() {
    secondaryEntityIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PrimaryCorrelation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.EntityPubProto.internal_static_anduril_entitymanager_v1_PrimaryCorrelation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.EntityPubProto.internal_static_anduril_entitymanager_v1_PrimaryCorrelation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.PrimaryCorrelation.class, com.anduril.entitymanager.v1.PrimaryCorrelation.Builder.class);
  }

  public static final int SECONDARY_ENTITY_IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList secondaryEntityIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * The secondary entity IDs part of this correlation.
   * </pre>
   *
   * <code>repeated string secondary_entity_ids = 1 [json_name = "secondaryEntityIds"];</code>
   * @return A list containing the secondaryEntityIds.
   */
  public com.google.protobuf.ProtocolStringList
      getSecondaryEntityIdsList() {
    return secondaryEntityIds_;
  }
  /**
   * <pre>
   * The secondary entity IDs part of this correlation.
   * </pre>
   *
   * <code>repeated string secondary_entity_ids = 1 [json_name = "secondaryEntityIds"];</code>
   * @return The count of secondaryEntityIds.
   */
  public int getSecondaryEntityIdsCount() {
    return secondaryEntityIds_.size();
  }
  /**
   * <pre>
   * The secondary entity IDs part of this correlation.
   * </pre>
   *
   * <code>repeated string secondary_entity_ids = 1 [json_name = "secondaryEntityIds"];</code>
   * @param index The index of the element to return.
   * @return The secondaryEntityIds at the given index.
   */
  public java.lang.String getSecondaryEntityIds(int index) {
    return secondaryEntityIds_.get(index);
  }
  /**
   * <pre>
   * The secondary entity IDs part of this correlation.
   * </pre>
   *
   * <code>repeated string secondary_entity_ids = 1 [json_name = "secondaryEntityIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the secondaryEntityIds at the given index.
   */
  public com.google.protobuf.ByteString
      getSecondaryEntityIdsBytes(int index) {
    return secondaryEntityIds_.getByteString(index);
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
    for (int i = 0; i < secondaryEntityIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, secondaryEntityIds_.getRaw(i));
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
      for (int i = 0; i < secondaryEntityIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(secondaryEntityIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getSecondaryEntityIdsList().size();
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
    if (!(obj instanceof com.anduril.entitymanager.v1.PrimaryCorrelation)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.PrimaryCorrelation other = (com.anduril.entitymanager.v1.PrimaryCorrelation) obj;

    if (!getSecondaryEntityIdsList()
        .equals(other.getSecondaryEntityIdsList())) return false;
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
    if (getSecondaryEntityIdsCount() > 0) {
      hash = (37 * hash) + SECONDARY_ENTITY_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getSecondaryEntityIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.PrimaryCorrelation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.PrimaryCorrelation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.PrimaryCorrelation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.PrimaryCorrelation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.PrimaryCorrelation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.PrimaryCorrelation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.PrimaryCorrelation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.PrimaryCorrelation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.PrimaryCorrelation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.PrimaryCorrelation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.PrimaryCorrelation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.PrimaryCorrelation parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.PrimaryCorrelation prototype) {
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
   * Protobuf type {@code anduril.entitymanager.v1.PrimaryCorrelation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.PrimaryCorrelation)
      com.anduril.entitymanager.v1.PrimaryCorrelationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.EntityPubProto.internal_static_anduril_entitymanager_v1_PrimaryCorrelation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.EntityPubProto.internal_static_anduril_entitymanager_v1_PrimaryCorrelation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.PrimaryCorrelation.class, com.anduril.entitymanager.v1.PrimaryCorrelation.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.PrimaryCorrelation.newBuilder()
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
      secondaryEntityIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.EntityPubProto.internal_static_anduril_entitymanager_v1_PrimaryCorrelation_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.PrimaryCorrelation getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.PrimaryCorrelation.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.PrimaryCorrelation build() {
      com.anduril.entitymanager.v1.PrimaryCorrelation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.PrimaryCorrelation buildPartial() {
      com.anduril.entitymanager.v1.PrimaryCorrelation result = new com.anduril.entitymanager.v1.PrimaryCorrelation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.entitymanager.v1.PrimaryCorrelation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        secondaryEntityIds_.makeImmutable();
        result.secondaryEntityIds_ = secondaryEntityIds_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entitymanager.v1.PrimaryCorrelation) {
        return mergeFrom((com.anduril.entitymanager.v1.PrimaryCorrelation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.PrimaryCorrelation other) {
      if (other == com.anduril.entitymanager.v1.PrimaryCorrelation.getDefaultInstance()) return this;
      if (!other.secondaryEntityIds_.isEmpty()) {
        if (secondaryEntityIds_.isEmpty()) {
          secondaryEntityIds_ = other.secondaryEntityIds_;
          bitField0_ |= 0x00000001;
        } else {
          ensureSecondaryEntityIdsIsMutable();
          secondaryEntityIds_.addAll(other.secondaryEntityIds_);
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
              ensureSecondaryEntityIdsIsMutable();
              secondaryEntityIds_.add(s);
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

    private com.google.protobuf.LazyStringArrayList secondaryEntityIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureSecondaryEntityIdsIsMutable() {
      if (!secondaryEntityIds_.isModifiable()) {
        secondaryEntityIds_ = new com.google.protobuf.LazyStringArrayList(secondaryEntityIds_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * The secondary entity IDs part of this correlation.
     * </pre>
     *
     * <code>repeated string secondary_entity_ids = 1 [json_name = "secondaryEntityIds"];</code>
     * @return A list containing the secondaryEntityIds.
     */
    public com.google.protobuf.ProtocolStringList
        getSecondaryEntityIdsList() {
      secondaryEntityIds_.makeImmutable();
      return secondaryEntityIds_;
    }
    /**
     * <pre>
     * The secondary entity IDs part of this correlation.
     * </pre>
     *
     * <code>repeated string secondary_entity_ids = 1 [json_name = "secondaryEntityIds"];</code>
     * @return The count of secondaryEntityIds.
     */
    public int getSecondaryEntityIdsCount() {
      return secondaryEntityIds_.size();
    }
    /**
     * <pre>
     * The secondary entity IDs part of this correlation.
     * </pre>
     *
     * <code>repeated string secondary_entity_ids = 1 [json_name = "secondaryEntityIds"];</code>
     * @param index The index of the element to return.
     * @return The secondaryEntityIds at the given index.
     */
    public java.lang.String getSecondaryEntityIds(int index) {
      return secondaryEntityIds_.get(index);
    }
    /**
     * <pre>
     * The secondary entity IDs part of this correlation.
     * </pre>
     *
     * <code>repeated string secondary_entity_ids = 1 [json_name = "secondaryEntityIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the secondaryEntityIds at the given index.
     */
    public com.google.protobuf.ByteString
        getSecondaryEntityIdsBytes(int index) {
      return secondaryEntityIds_.getByteString(index);
    }
    /**
     * <pre>
     * The secondary entity IDs part of this correlation.
     * </pre>
     *
     * <code>repeated string secondary_entity_ids = 1 [json_name = "secondaryEntityIds"];</code>
     * @param index The index to set the value at.
     * @param value The secondaryEntityIds to set.
     * @return This builder for chaining.
     */
    public Builder setSecondaryEntityIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureSecondaryEntityIdsIsMutable();
      secondaryEntityIds_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The secondary entity IDs part of this correlation.
     * </pre>
     *
     * <code>repeated string secondary_entity_ids = 1 [json_name = "secondaryEntityIds"];</code>
     * @param value The secondaryEntityIds to add.
     * @return This builder for chaining.
     */
    public Builder addSecondaryEntityIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureSecondaryEntityIdsIsMutable();
      secondaryEntityIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The secondary entity IDs part of this correlation.
     * </pre>
     *
     * <code>repeated string secondary_entity_ids = 1 [json_name = "secondaryEntityIds"];</code>
     * @param values The secondaryEntityIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllSecondaryEntityIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureSecondaryEntityIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, secondaryEntityIds_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The secondary entity IDs part of this correlation.
     * </pre>
     *
     * <code>repeated string secondary_entity_ids = 1 [json_name = "secondaryEntityIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSecondaryEntityIds() {
      secondaryEntityIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The secondary entity IDs part of this correlation.
     * </pre>
     *
     * <code>repeated string secondary_entity_ids = 1 [json_name = "secondaryEntityIds"];</code>
     * @param value The bytes of the secondaryEntityIds to add.
     * @return This builder for chaining.
     */
    public Builder addSecondaryEntityIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureSecondaryEntityIdsIsMutable();
      secondaryEntityIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.PrimaryCorrelation)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.PrimaryCorrelation)
  private static final com.anduril.entitymanager.v1.PrimaryCorrelation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.PrimaryCorrelation();
  }

  public static com.anduril.entitymanager.v1.PrimaryCorrelation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PrimaryCorrelation>
      PARSER = new com.google.protobuf.AbstractParser<PrimaryCorrelation>() {
    @java.lang.Override
    public PrimaryCorrelation parsePartialFrom(
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

  public static com.google.protobuf.Parser<PrimaryCorrelation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PrimaryCorrelation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.PrimaryCorrelation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

