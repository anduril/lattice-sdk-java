// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/entity_manager_grpcapi.pub.proto

package com.anduril.entitymanager.v1;

/**
 * Protobuf type {@code anduril.entitymanager.v1.PublishEntitiesRequest}
 */
public final class PublishEntitiesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.PublishEntitiesRequest)
    PublishEntitiesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PublishEntitiesRequest.newBuilder() to construct.
  private PublishEntitiesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PublishEntitiesRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PublishEntitiesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.EntityManagerGrpcapiPubProto.internal_static_anduril_entitymanager_v1_PublishEntitiesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.EntityManagerGrpcapiPubProto.internal_static_anduril_entitymanager_v1_PublishEntitiesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.PublishEntitiesRequest.class, com.anduril.entitymanager.v1.PublishEntitiesRequest.Builder.class);
  }

  public static final int ENTITY_FIELD_NUMBER = 1;
  private com.anduril.entitymanager.v1.Entity entity_;
  /**
   * <pre>
   * Sends a stream of entity objects to publish.
   * Each entity requires the following fields:
   *   * expiry_time. This must be in the future, but less than 30 days from now.
   *   * provenance.data_type.
   *   * provenance.source_update_time. This can be earlier than the RPC call if the data entered is older.
   *   * aliases.name
   *   * ontology.template
   * For additional required fields that are determined by template, see com.anduril.entitymanager.v1.Template.
   * If an entity_id is provided, the entity updates. If no entity_id is provided, the entity is created.
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
   * Sends a stream of entity objects to publish.
   * Each entity requires the following fields:
   *   * expiry_time. This must be in the future, but less than 30 days from now.
   *   * provenance.data_type.
   *   * provenance.source_update_time. This can be earlier than the RPC call if the data entered is older.
   *   * aliases.name
   *   * ontology.template
   * For additional required fields that are determined by template, see com.anduril.entitymanager.v1.Template.
   * If an entity_id is provided, the entity updates. If no entity_id is provided, the entity is created.
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
   * Sends a stream of entity objects to publish.
   * Each entity requires the following fields:
   *   * expiry_time. This must be in the future, but less than 30 days from now.
   *   * provenance.data_type.
   *   * provenance.source_update_time. This can be earlier than the RPC call if the data entered is older.
   *   * aliases.name
   *   * ontology.template
   * For additional required fields that are determined by template, see com.anduril.entitymanager.v1.Template.
   * If an entity_id is provided, the entity updates. If no entity_id is provided, the entity is created.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.EntityOrBuilder getEntityOrBuilder() {
    return entity_ == null ? com.anduril.entitymanager.v1.Entity.getDefaultInstance() : entity_;
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
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.anduril.entitymanager.v1.PublishEntitiesRequest)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.PublishEntitiesRequest other = (com.anduril.entitymanager.v1.PublishEntitiesRequest) obj;

    if (hasEntity() != other.hasEntity()) return false;
    if (hasEntity()) {
      if (!getEntity()
          .equals(other.getEntity())) return false;
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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.PublishEntitiesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.PublishEntitiesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.PublishEntitiesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.PublishEntitiesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.PublishEntitiesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.PublishEntitiesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.PublishEntitiesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.PublishEntitiesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.PublishEntitiesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.PublishEntitiesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.PublishEntitiesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.PublishEntitiesRequest parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.PublishEntitiesRequest prototype) {
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
   * Protobuf type {@code anduril.entitymanager.v1.PublishEntitiesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.PublishEntitiesRequest)
      com.anduril.entitymanager.v1.PublishEntitiesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.EntityManagerGrpcapiPubProto.internal_static_anduril_entitymanager_v1_PublishEntitiesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.EntityManagerGrpcapiPubProto.internal_static_anduril_entitymanager_v1_PublishEntitiesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.PublishEntitiesRequest.class, com.anduril.entitymanager.v1.PublishEntitiesRequest.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.PublishEntitiesRequest.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.EntityManagerGrpcapiPubProto.internal_static_anduril_entitymanager_v1_PublishEntitiesRequest_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.PublishEntitiesRequest getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.PublishEntitiesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.PublishEntitiesRequest build() {
      com.anduril.entitymanager.v1.PublishEntitiesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.PublishEntitiesRequest buildPartial() {
      com.anduril.entitymanager.v1.PublishEntitiesRequest result = new com.anduril.entitymanager.v1.PublishEntitiesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.entitymanager.v1.PublishEntitiesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.entity_ = entityBuilder_ == null
            ? entity_
            : entityBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entitymanager.v1.PublishEntitiesRequest) {
        return mergeFrom((com.anduril.entitymanager.v1.PublishEntitiesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.PublishEntitiesRequest other) {
      if (other == com.anduril.entitymanager.v1.PublishEntitiesRequest.getDefaultInstance()) return this;
      if (other.hasEntity()) {
        mergeEntity(other.getEntity());
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
     * Sends a stream of entity objects to publish.
     * Each entity requires the following fields:
     *   * expiry_time. This must be in the future, but less than 30 days from now.
     *   * provenance.data_type.
     *   * provenance.source_update_time. This can be earlier than the RPC call if the data entered is older.
     *   * aliases.name
     *   * ontology.template
     * For additional required fields that are determined by template, see com.anduril.entitymanager.v1.Template.
     * If an entity_id is provided, the entity updates. If no entity_id is provided, the entity is created.
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
     * Sends a stream of entity objects to publish.
     * Each entity requires the following fields:
     *   * expiry_time. This must be in the future, but less than 30 days from now.
     *   * provenance.data_type.
     *   * provenance.source_update_time. This can be earlier than the RPC call if the data entered is older.
     *   * aliases.name
     *   * ontology.template
     * For additional required fields that are determined by template, see com.anduril.entitymanager.v1.Template.
     * If an entity_id is provided, the entity updates. If no entity_id is provided, the entity is created.
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
     * Sends a stream of entity objects to publish.
     * Each entity requires the following fields:
     *   * expiry_time. This must be in the future, but less than 30 days from now.
     *   * provenance.data_type.
     *   * provenance.source_update_time. This can be earlier than the RPC call if the data entered is older.
     *   * aliases.name
     *   * ontology.template
     * For additional required fields that are determined by template, see com.anduril.entitymanager.v1.Template.
     * If an entity_id is provided, the entity updates. If no entity_id is provided, the entity is created.
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
     * Sends a stream of entity objects to publish.
     * Each entity requires the following fields:
     *   * expiry_time. This must be in the future, but less than 30 days from now.
     *   * provenance.data_type.
     *   * provenance.source_update_time. This can be earlier than the RPC call if the data entered is older.
     *   * aliases.name
     *   * ontology.template
     * For additional required fields that are determined by template, see com.anduril.entitymanager.v1.Template.
     * If an entity_id is provided, the entity updates. If no entity_id is provided, the entity is created.
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
     * Sends a stream of entity objects to publish.
     * Each entity requires the following fields:
     *   * expiry_time. This must be in the future, but less than 30 days from now.
     *   * provenance.data_type.
     *   * provenance.source_update_time. This can be earlier than the RPC call if the data entered is older.
     *   * aliases.name
     *   * ontology.template
     * For additional required fields that are determined by template, see com.anduril.entitymanager.v1.Template.
     * If an entity_id is provided, the entity updates. If no entity_id is provided, the entity is created.
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
     * Sends a stream of entity objects to publish.
     * Each entity requires the following fields:
     *   * expiry_time. This must be in the future, but less than 30 days from now.
     *   * provenance.data_type.
     *   * provenance.source_update_time. This can be earlier than the RPC call if the data entered is older.
     *   * aliases.name
     *   * ontology.template
     * For additional required fields that are determined by template, see com.anduril.entitymanager.v1.Template.
     * If an entity_id is provided, the entity updates. If no entity_id is provided, the entity is created.
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
     * Sends a stream of entity objects to publish.
     * Each entity requires the following fields:
     *   * expiry_time. This must be in the future, but less than 30 days from now.
     *   * provenance.data_type.
     *   * provenance.source_update_time. This can be earlier than the RPC call if the data entered is older.
     *   * aliases.name
     *   * ontology.template
     * For additional required fields that are determined by template, see com.anduril.entitymanager.v1.Template.
     * If an entity_id is provided, the entity updates. If no entity_id is provided, the entity is created.
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
     * Sends a stream of entity objects to publish.
     * Each entity requires the following fields:
     *   * expiry_time. This must be in the future, but less than 30 days from now.
     *   * provenance.data_type.
     *   * provenance.source_update_time. This can be earlier than the RPC call if the data entered is older.
     *   * aliases.name
     *   * ontology.template
     * For additional required fields that are determined by template, see com.anduril.entitymanager.v1.Template.
     * If an entity_id is provided, the entity updates. If no entity_id is provided, the entity is created.
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
     * Sends a stream of entity objects to publish.
     * Each entity requires the following fields:
     *   * expiry_time. This must be in the future, but less than 30 days from now.
     *   * provenance.data_type.
     *   * provenance.source_update_time. This can be earlier than the RPC call if the data entered is older.
     *   * aliases.name
     *   * ontology.template
     * For additional required fields that are determined by template, see com.anduril.entitymanager.v1.Template.
     * If an entity_id is provided, the entity updates. If no entity_id is provided, the entity is created.
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


    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.PublishEntitiesRequest)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.PublishEntitiesRequest)
  private static final com.anduril.entitymanager.v1.PublishEntitiesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.PublishEntitiesRequest();
  }

  public static com.anduril.entitymanager.v1.PublishEntitiesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PublishEntitiesRequest>
      PARSER = new com.google.protobuf.AbstractParser<PublishEntitiesRequest>() {
    @java.lang.Override
    public PublishEntitiesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<PublishEntitiesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PublishEntitiesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.PublishEntitiesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

