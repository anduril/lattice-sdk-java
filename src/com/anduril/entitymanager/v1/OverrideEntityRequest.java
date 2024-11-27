// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/entity_manager_grpcapi.pub.proto

package com.anduril.entitymanager.v1;

/**
 * Protobuf type {@code anduril.entitymanager.v1.OverrideEntityRequest}
 */
public final class OverrideEntityRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.OverrideEntityRequest)
    OverrideEntityRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OverrideEntityRequest.newBuilder() to construct.
  private OverrideEntityRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OverrideEntityRequest() {
    fieldPath_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OverrideEntityRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.EntityManagerGrpcapiPubProto.internal_static_anduril_entitymanager_v1_OverrideEntityRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.EntityManagerGrpcapiPubProto.internal_static_anduril_entitymanager_v1_OverrideEntityRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.OverrideEntityRequest.class, com.anduril.entitymanager.v1.OverrideEntityRequest.Builder.class);
  }

  public static final int ENTITY_FIELD_NUMBER = 1;
  private com.anduril.entitymanager.v1.Entity entity_;
  /**
   * <pre>
   * The entity containing the overwritten fields. The service will extract the overridable fields from the entity
   * object and ignore any other fields.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
   * @return Whether the entity field is set.
   */
  @java.lang.Override
  public boolean hasEntity() {
    return entity_ != null;
  }
  /**
   * <pre>
   * The entity containing the overwritten fields. The service will extract the overridable fields from the entity
   * object and ignore any other fields.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
   * @return The entity.
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.Entity getEntity() {
    return entity_ == null ? com.anduril.entitymanager.v1.Entity.getDefaultInstance() : entity_;
  }
  /**
   * <pre>
   * The entity containing the overwritten fields. The service will extract the overridable fields from the entity
   * object and ignore any other fields.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.EntityOrBuilder getEntityOrBuilder() {
    return entity_ == null ? com.anduril.entitymanager.v1.Entity.getDefaultInstance() : entity_;
  }

  public static final int FIELD_PATH_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList fieldPath_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * The field paths that will be extracted from the Entity and saved as an override. Only fields marked overridable can
   * be overridden.
   * </pre>
   *
   * <code>repeated string field_path = 2 [json_name = "fieldPath"];</code>
   * @return A list containing the fieldPath.
   */
  public com.google.protobuf.ProtocolStringList
      getFieldPathList() {
    return fieldPath_;
  }
  /**
   * <pre>
   * The field paths that will be extracted from the Entity and saved as an override. Only fields marked overridable can
   * be overridden.
   * </pre>
   *
   * <code>repeated string field_path = 2 [json_name = "fieldPath"];</code>
   * @return The count of fieldPath.
   */
  public int getFieldPathCount() {
    return fieldPath_.size();
  }
  /**
   * <pre>
   * The field paths that will be extracted from the Entity and saved as an override. Only fields marked overridable can
   * be overridden.
   * </pre>
   *
   * <code>repeated string field_path = 2 [json_name = "fieldPath"];</code>
   * @param index The index of the element to return.
   * @return The fieldPath at the given index.
   */
  public java.lang.String getFieldPath(int index) {
    return fieldPath_.get(index);
  }
  /**
   * <pre>
   * The field paths that will be extracted from the Entity and saved as an override. Only fields marked overridable can
   * be overridden.
   * </pre>
   *
   * <code>repeated string field_path = 2 [json_name = "fieldPath"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the fieldPath at the given index.
   */
  public com.google.protobuf.ByteString
      getFieldPathBytes(int index) {
    return fieldPath_.getByteString(index);
  }

  public static final int PROVENANCE_FIELD_NUMBER = 3;
  private com.anduril.entitymanager.v1.Provenance provenance_;
  /**
   * <pre>
   * Additional information about the source of the override
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Provenance provenance = 3 [json_name = "provenance"];</code>
   * @return Whether the provenance field is set.
   */
  @java.lang.Override
  public boolean hasProvenance() {
    return provenance_ != null;
  }
  /**
   * <pre>
   * Additional information about the source of the override
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Provenance provenance = 3 [json_name = "provenance"];</code>
   * @return The provenance.
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.Provenance getProvenance() {
    return provenance_ == null ? com.anduril.entitymanager.v1.Provenance.getDefaultInstance() : provenance_;
  }
  /**
   * <pre>
   * Additional information about the source of the override
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Provenance provenance = 3 [json_name = "provenance"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.ProvenanceOrBuilder getProvenanceOrBuilder() {
    return provenance_ == null ? com.anduril.entitymanager.v1.Provenance.getDefaultInstance() : provenance_;
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
    if (entity_ != null) {
      output.writeMessage(1, getEntity());
    }
    for (int i = 0; i < fieldPath_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fieldPath_.getRaw(i));
    }
    if (provenance_ != null) {
      output.writeMessage(3, getProvenance());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (entity_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEntity());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < fieldPath_.size(); i++) {
        dataSize += computeStringSizeNoTag(fieldPath_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getFieldPathList().size();
    }
    if (provenance_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getProvenance());
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
    if (!(obj instanceof com.anduril.entitymanager.v1.OverrideEntityRequest)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.OverrideEntityRequest other = (com.anduril.entitymanager.v1.OverrideEntityRequest) obj;

    if (hasEntity() != other.hasEntity()) return false;
    if (hasEntity()) {
      if (!getEntity()
          .equals(other.getEntity())) return false;
    }
    if (!getFieldPathList()
        .equals(other.getFieldPathList())) return false;
    if (hasProvenance() != other.hasProvenance()) return false;
    if (hasProvenance()) {
      if (!getProvenance()
          .equals(other.getProvenance())) return false;
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
    if (hasEntity()) {
      hash = (37 * hash) + ENTITY_FIELD_NUMBER;
      hash = (53 * hash) + getEntity().hashCode();
    }
    if (getFieldPathCount() > 0) {
      hash = (37 * hash) + FIELD_PATH_FIELD_NUMBER;
      hash = (53 * hash) + getFieldPathList().hashCode();
    }
    if (hasProvenance()) {
      hash = (37 * hash) + PROVENANCE_FIELD_NUMBER;
      hash = (53 * hash) + getProvenance().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.OverrideEntityRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.OverrideEntityRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.OverrideEntityRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.OverrideEntityRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.OverrideEntityRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.OverrideEntityRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.OverrideEntityRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.OverrideEntityRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.OverrideEntityRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.OverrideEntityRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.OverrideEntityRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.OverrideEntityRequest parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.OverrideEntityRequest prototype) {
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
   * Protobuf type {@code anduril.entitymanager.v1.OverrideEntityRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.OverrideEntityRequest)
      com.anduril.entitymanager.v1.OverrideEntityRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.EntityManagerGrpcapiPubProto.internal_static_anduril_entitymanager_v1_OverrideEntityRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.EntityManagerGrpcapiPubProto.internal_static_anduril_entitymanager_v1_OverrideEntityRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.OverrideEntityRequest.class, com.anduril.entitymanager.v1.OverrideEntityRequest.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.OverrideEntityRequest.newBuilder()
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
      entity_ = null;
      if (entityBuilder_ != null) {
        entityBuilder_.dispose();
        entityBuilder_ = null;
      }
      fieldPath_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      provenance_ = null;
      if (provenanceBuilder_ != null) {
        provenanceBuilder_.dispose();
        provenanceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.EntityManagerGrpcapiPubProto.internal_static_anduril_entitymanager_v1_OverrideEntityRequest_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.OverrideEntityRequest getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.OverrideEntityRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.OverrideEntityRequest build() {
      com.anduril.entitymanager.v1.OverrideEntityRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.OverrideEntityRequest buildPartial() {
      com.anduril.entitymanager.v1.OverrideEntityRequest result = new com.anduril.entitymanager.v1.OverrideEntityRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.entitymanager.v1.OverrideEntityRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.entity_ = entityBuilder_ == null
            ? entity_
            : entityBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        fieldPath_.makeImmutable();
        result.fieldPath_ = fieldPath_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.provenance_ = provenanceBuilder_ == null
            ? provenance_
            : provenanceBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entitymanager.v1.OverrideEntityRequest) {
        return mergeFrom((com.anduril.entitymanager.v1.OverrideEntityRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.OverrideEntityRequest other) {
      if (other == com.anduril.entitymanager.v1.OverrideEntityRequest.getDefaultInstance()) return this;
      if (other.hasEntity()) {
        mergeEntity(other.getEntity());
      }
      if (!other.fieldPath_.isEmpty()) {
        if (fieldPath_.isEmpty()) {
          fieldPath_ = other.fieldPath_;
          bitField0_ |= 0x00000002;
        } else {
          ensureFieldPathIsMutable();
          fieldPath_.addAll(other.fieldPath_);
        }
        onChanged();
      }
      if (other.hasProvenance()) {
        mergeProvenance(other.getProvenance());
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
              input.readMessage(
                  getEntityFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureFieldPathIsMutable();
              fieldPath_.add(s);
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getProvenanceFieldBuilder().getBuilder(),
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

    private com.anduril.entitymanager.v1.Entity entity_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Entity, com.anduril.entitymanager.v1.Entity.Builder, com.anduril.entitymanager.v1.EntityOrBuilder> entityBuilder_;
    /**
     * <pre>
     * The entity containing the overwritten fields. The service will extract the overridable fields from the entity
     * object and ignore any other fields.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
     * @return Whether the entity field is set.
     */
    public boolean hasEntity() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The entity containing the overwritten fields. The service will extract the overridable fields from the entity
     * object and ignore any other fields.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
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
     * <pre>
     * The entity containing the overwritten fields. The service will extract the overridable fields from the entity
     * object and ignore any other fields.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The entity containing the overwritten fields. The service will extract the overridable fields from the entity
     * object and ignore any other fields.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
     */
    public Builder setEntity(
        com.anduril.entitymanager.v1.Entity.Builder builderForValue) {
      if (entityBuilder_ == null) {
        entity_ = builderForValue.build();
      } else {
        entityBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The entity containing the overwritten fields. The service will extract the overridable fields from the entity
     * object and ignore any other fields.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
     */
    public Builder mergeEntity(com.anduril.entitymanager.v1.Entity value) {
      if (entityBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          entity_ != null &&
          entity_ != com.anduril.entitymanager.v1.Entity.getDefaultInstance()) {
          getEntityBuilder().mergeFrom(value);
        } else {
          entity_ = value;
        }
      } else {
        entityBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The entity containing the overwritten fields. The service will extract the overridable fields from the entity
     * object and ignore any other fields.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
     */
    public Builder clearEntity() {
      bitField0_ = (bitField0_ & ~0x00000001);
      entity_ = null;
      if (entityBuilder_ != null) {
        entityBuilder_.dispose();
        entityBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The entity containing the overwritten fields. The service will extract the overridable fields from the entity
     * object and ignore any other fields.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
     */
    public com.anduril.entitymanager.v1.Entity.Builder getEntityBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEntityFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The entity containing the overwritten fields. The service will extract the overridable fields from the entity
     * object and ignore any other fields.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
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
     * <pre>
     * The entity containing the overwritten fields. The service will extract the overridable fields from the entity
     * object and ignore any other fields.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
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

    private com.google.protobuf.LazyStringArrayList fieldPath_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureFieldPathIsMutable() {
      if (!fieldPath_.isModifiable()) {
        fieldPath_ = new com.google.protobuf.LazyStringArrayList(fieldPath_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * The field paths that will be extracted from the Entity and saved as an override. Only fields marked overridable can
     * be overridden.
     * </pre>
     *
     * <code>repeated string field_path = 2 [json_name = "fieldPath"];</code>
     * @return A list containing the fieldPath.
     */
    public com.google.protobuf.ProtocolStringList
        getFieldPathList() {
      fieldPath_.makeImmutable();
      return fieldPath_;
    }
    /**
     * <pre>
     * The field paths that will be extracted from the Entity and saved as an override. Only fields marked overridable can
     * be overridden.
     * </pre>
     *
     * <code>repeated string field_path = 2 [json_name = "fieldPath"];</code>
     * @return The count of fieldPath.
     */
    public int getFieldPathCount() {
      return fieldPath_.size();
    }
    /**
     * <pre>
     * The field paths that will be extracted from the Entity and saved as an override. Only fields marked overridable can
     * be overridden.
     * </pre>
     *
     * <code>repeated string field_path = 2 [json_name = "fieldPath"];</code>
     * @param index The index of the element to return.
     * @return The fieldPath at the given index.
     */
    public java.lang.String getFieldPath(int index) {
      return fieldPath_.get(index);
    }
    /**
     * <pre>
     * The field paths that will be extracted from the Entity and saved as an override. Only fields marked overridable can
     * be overridden.
     * </pre>
     *
     * <code>repeated string field_path = 2 [json_name = "fieldPath"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the fieldPath at the given index.
     */
    public com.google.protobuf.ByteString
        getFieldPathBytes(int index) {
      return fieldPath_.getByteString(index);
    }
    /**
     * <pre>
     * The field paths that will be extracted from the Entity and saved as an override. Only fields marked overridable can
     * be overridden.
     * </pre>
     *
     * <code>repeated string field_path = 2 [json_name = "fieldPath"];</code>
     * @param index The index to set the value at.
     * @param value The fieldPath to set.
     * @return This builder for chaining.
     */
    public Builder setFieldPath(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureFieldPathIsMutable();
      fieldPath_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The field paths that will be extracted from the Entity and saved as an override. Only fields marked overridable can
     * be overridden.
     * </pre>
     *
     * <code>repeated string field_path = 2 [json_name = "fieldPath"];</code>
     * @param value The fieldPath to add.
     * @return This builder for chaining.
     */
    public Builder addFieldPath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureFieldPathIsMutable();
      fieldPath_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The field paths that will be extracted from the Entity and saved as an override. Only fields marked overridable can
     * be overridden.
     * </pre>
     *
     * <code>repeated string field_path = 2 [json_name = "fieldPath"];</code>
     * @param values The fieldPath to add.
     * @return This builder for chaining.
     */
    public Builder addAllFieldPath(
        java.lang.Iterable<java.lang.String> values) {
      ensureFieldPathIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, fieldPath_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The field paths that will be extracted from the Entity and saved as an override. Only fields marked overridable can
     * be overridden.
     * </pre>
     *
     * <code>repeated string field_path = 2 [json_name = "fieldPath"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFieldPath() {
      fieldPath_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The field paths that will be extracted from the Entity and saved as an override. Only fields marked overridable can
     * be overridden.
     * </pre>
     *
     * <code>repeated string field_path = 2 [json_name = "fieldPath"];</code>
     * @param value The bytes of the fieldPath to add.
     * @return This builder for chaining.
     */
    public Builder addFieldPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureFieldPathIsMutable();
      fieldPath_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.anduril.entitymanager.v1.Provenance provenance_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Provenance, com.anduril.entitymanager.v1.Provenance.Builder, com.anduril.entitymanager.v1.ProvenanceOrBuilder> provenanceBuilder_;
    /**
     * <pre>
     * Additional information about the source of the override
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Provenance provenance = 3 [json_name = "provenance"];</code>
     * @return Whether the provenance field is set.
     */
    public boolean hasProvenance() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Additional information about the source of the override
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Provenance provenance = 3 [json_name = "provenance"];</code>
     * @return The provenance.
     */
    public com.anduril.entitymanager.v1.Provenance getProvenance() {
      if (provenanceBuilder_ == null) {
        return provenance_ == null ? com.anduril.entitymanager.v1.Provenance.getDefaultInstance() : provenance_;
      } else {
        return provenanceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Additional information about the source of the override
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Provenance provenance = 3 [json_name = "provenance"];</code>
     */
    public Builder setProvenance(com.anduril.entitymanager.v1.Provenance value) {
      if (provenanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        provenance_ = value;
      } else {
        provenanceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Additional information about the source of the override
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Provenance provenance = 3 [json_name = "provenance"];</code>
     */
    public Builder setProvenance(
        com.anduril.entitymanager.v1.Provenance.Builder builderForValue) {
      if (provenanceBuilder_ == null) {
        provenance_ = builderForValue.build();
      } else {
        provenanceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Additional information about the source of the override
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Provenance provenance = 3 [json_name = "provenance"];</code>
     */
    public Builder mergeProvenance(com.anduril.entitymanager.v1.Provenance value) {
      if (provenanceBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          provenance_ != null &&
          provenance_ != com.anduril.entitymanager.v1.Provenance.getDefaultInstance()) {
          getProvenanceBuilder().mergeFrom(value);
        } else {
          provenance_ = value;
        }
      } else {
        provenanceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Additional information about the source of the override
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Provenance provenance = 3 [json_name = "provenance"];</code>
     */
    public Builder clearProvenance() {
      bitField0_ = (bitField0_ & ~0x00000004);
      provenance_ = null;
      if (provenanceBuilder_ != null) {
        provenanceBuilder_.dispose();
        provenanceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Additional information about the source of the override
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Provenance provenance = 3 [json_name = "provenance"];</code>
     */
    public com.anduril.entitymanager.v1.Provenance.Builder getProvenanceBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getProvenanceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Additional information about the source of the override
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Provenance provenance = 3 [json_name = "provenance"];</code>
     */
    public com.anduril.entitymanager.v1.ProvenanceOrBuilder getProvenanceOrBuilder() {
      if (provenanceBuilder_ != null) {
        return provenanceBuilder_.getMessageOrBuilder();
      } else {
        return provenance_ == null ?
            com.anduril.entitymanager.v1.Provenance.getDefaultInstance() : provenance_;
      }
    }
    /**
     * <pre>
     * Additional information about the source of the override
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Provenance provenance = 3 [json_name = "provenance"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Provenance, com.anduril.entitymanager.v1.Provenance.Builder, com.anduril.entitymanager.v1.ProvenanceOrBuilder> 
        getProvenanceFieldBuilder() {
      if (provenanceBuilder_ == null) {
        provenanceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.entitymanager.v1.Provenance, com.anduril.entitymanager.v1.Provenance.Builder, com.anduril.entitymanager.v1.ProvenanceOrBuilder>(
                getProvenance(),
                getParentForChildren(),
                isClean());
        provenance_ = null;
      }
      return provenanceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.OverrideEntityRequest)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.OverrideEntityRequest)
  private static final com.anduril.entitymanager.v1.OverrideEntityRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.OverrideEntityRequest();
  }

  public static com.anduril.entitymanager.v1.OverrideEntityRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OverrideEntityRequest>
      PARSER = new com.google.protobuf.AbstractParser<OverrideEntityRequest>() {
    @java.lang.Override
    public OverrideEntityRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<OverrideEntityRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OverrideEntityRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.OverrideEntityRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

