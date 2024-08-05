// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/entitymanager/v1/entity_manager_api.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.entitymanager.v1;

/**
 * Protobuf type {@code anduril.entitymanager.v1.GetEntityResponse}
 */
public final class GetEntityResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.GetEntityResponse)
    GetEntityResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      GetEntityResponse.class.getName());
  }
  // Use GetEntityResponse.newBuilder() to construct.
  private GetEntityResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetEntityResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.EntityManagerApiPubProto.internal_static_anduril_entitymanager_v1_GetEntityResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.EntityManagerApiPubProto.internal_static_anduril_entitymanager_v1_GetEntityResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.GetEntityResponse.class, com.anduril.entitymanager.v1.GetEntityResponse.Builder.class);
  }

  private int bitField0_;
  public static final int ENTITY_FIELD_NUMBER = 1;
  private com.anduril.entitymanager.v1.Entity entity_;
  /**
   * <pre>
   * an Entity object that corresponds with the requested entityId
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
   * @return Whether the entity field is set.
   */
  @java.lang.Override
  public boolean hasEntity() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * an Entity object that corresponds with the requested entityId
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
   * an Entity object that corresponds with the requested entityId
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getEntity());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
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
    if (!(obj instanceof com.anduril.entitymanager.v1.GetEntityResponse)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.GetEntityResponse other = (com.anduril.entitymanager.v1.GetEntityResponse) obj;

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

  public static com.anduril.entitymanager.v1.GetEntityResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.GetEntityResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.GetEntityResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.GetEntityResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.GetEntityResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.GetEntityResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.GetEntityResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.GetEntityResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.entitymanager.v1.GetEntityResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.entitymanager.v1.GetEntityResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.GetEntityResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.GetEntityResponse parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.GetEntityResponse prototype) {
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
   * Protobuf type {@code anduril.entitymanager.v1.GetEntityResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.GetEntityResponse)
      com.anduril.entitymanager.v1.GetEntityResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.EntityManagerApiPubProto.internal_static_anduril_entitymanager_v1_GetEntityResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.EntityManagerApiPubProto.internal_static_anduril_entitymanager_v1_GetEntityResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.GetEntityResponse.class, com.anduril.entitymanager.v1.GetEntityResponse.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.GetEntityResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getEntityFieldBuilder();
      }
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
      return com.anduril.entitymanager.v1.EntityManagerApiPubProto.internal_static_anduril_entitymanager_v1_GetEntityResponse_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.GetEntityResponse getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.GetEntityResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.GetEntityResponse build() {
      com.anduril.entitymanager.v1.GetEntityResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.GetEntityResponse buildPartial() {
      com.anduril.entitymanager.v1.GetEntityResponse result = new com.anduril.entitymanager.v1.GetEntityResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.entitymanager.v1.GetEntityResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.entity_ = entityBuilder_ == null
            ? entity_
            : entityBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entitymanager.v1.GetEntityResponse) {
        return mergeFrom((com.anduril.entitymanager.v1.GetEntityResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.GetEntityResponse other) {
      if (other == com.anduril.entitymanager.v1.GetEntityResponse.getDefaultInstance()) return this;
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
    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.entitymanager.v1.Entity, com.anduril.entitymanager.v1.Entity.Builder, com.anduril.entitymanager.v1.EntityOrBuilder> entityBuilder_;
    /**
     * <pre>
     * an Entity object that corresponds with the requested entityId
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
     * an Entity object that corresponds with the requested entityId
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
     * an Entity object that corresponds with the requested entityId
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
     * an Entity object that corresponds with the requested entityId
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
     * an Entity object that corresponds with the requested entityId
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
      if (entity_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * an Entity object that corresponds with the requested entityId
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
     * an Entity object that corresponds with the requested entityId
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
     * an Entity object that corresponds with the requested entityId
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
     * an Entity object that corresponds with the requested entityId
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Entity entity = 1 [json_name = "entity"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.entitymanager.v1.Entity, com.anduril.entitymanager.v1.Entity.Builder, com.anduril.entitymanager.v1.EntityOrBuilder> 
        getEntityFieldBuilder() {
      if (entityBuilder_ == null) {
        entityBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.anduril.entitymanager.v1.Entity, com.anduril.entitymanager.v1.Entity.Builder, com.anduril.entitymanager.v1.EntityOrBuilder>(
                getEntity(),
                getParentForChildren(),
                isClean());
        entity_ = null;
      }
      return entityBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.GetEntityResponse)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.GetEntityResponse)
  private static final com.anduril.entitymanager.v1.GetEntityResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.GetEntityResponse();
  }

  public static com.anduril.entitymanager.v1.GetEntityResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetEntityResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetEntityResponse>() {
    @java.lang.Override
    public GetEntityResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetEntityResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetEntityResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.GetEntityResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

