// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/entity_manager_api.pub.proto

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * A request for a relationship on an entity. Forms a partial of the entitymanager.v1.Relationship message.
 * </pre>
 *
 * Protobuf type {@code anduril.entitymanager.v1.RelationshipRequest}
 */
public final class RelationshipRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.RelationshipRequest)
    RelationshipRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RelationshipRequest.newBuilder() to construct.
  private RelationshipRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RelationshipRequest() {
    relatedEntityId_ = "";
    relationshipId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RelationshipRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.EntityManagerApiPubProto.internal_static_anduril_entitymanager_v1_RelationshipRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.EntityManagerApiPubProto.internal_static_anduril_entitymanager_v1_RelationshipRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.RelationshipRequest.class, com.anduril.entitymanager.v1.RelationshipRequest.Builder.class);
  }

  public static final int RELATED_ENTITY_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object relatedEntityId_ = "";
  /**
   * <pre>
   * The entity ID to which this entity is related.
   * </pre>
   *
   * <code>string related_entity_id = 1 [json_name = "relatedEntityId"];</code>
   * @return The relatedEntityId.
   */
  @java.lang.Override
  public java.lang.String getRelatedEntityId() {
    java.lang.Object ref = relatedEntityId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      relatedEntityId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The entity ID to which this entity is related.
   * </pre>
   *
   * <code>string related_entity_id = 1 [json_name = "relatedEntityId"];</code>
   * @return The bytes for relatedEntityId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRelatedEntityIdBytes() {
    java.lang.Object ref = relatedEntityId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      relatedEntityId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RELATIONSHIP_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object relationshipId_ = "";
  /**
   * <pre>
   * If RelationshipID is empty, a new relationship is created. Otherwise, the service will attempt
   * to update an already existing relationship on the entity.
   * </pre>
   *
   * <code>string relationship_id = 2 [json_name = "relationshipId"];</code>
   * @return The relationshipId.
   */
  @java.lang.Override
  public java.lang.String getRelationshipId() {
    java.lang.Object ref = relationshipId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      relationshipId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * If RelationshipID is empty, a new relationship is created. Otherwise, the service will attempt
   * to update an already existing relationship on the entity.
   * </pre>
   *
   * <code>string relationship_id = 2 [json_name = "relationshipId"];</code>
   * @return The bytes for relationshipId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRelationshipIdBytes() {
    java.lang.Object ref = relationshipId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      relationshipId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RELATIONSHIP_TYPE_FIELD_NUMBER = 3;
  private com.anduril.entitymanager.v1.RelationshipType relationshipType_;
  /**
   * <pre>
   * The relationship type
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.RelationshipType relationship_type = 3 [json_name = "relationshipType"];</code>
   * @return Whether the relationshipType field is set.
   */
  @java.lang.Override
  public boolean hasRelationshipType() {
    return relationshipType_ != null;
  }
  /**
   * <pre>
   * The relationship type
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.RelationshipType relationship_type = 3 [json_name = "relationshipType"];</code>
   * @return The relationshipType.
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.RelationshipType getRelationshipType() {
    return relationshipType_ == null ? com.anduril.entitymanager.v1.RelationshipType.getDefaultInstance() : relationshipType_;
  }
  /**
   * <pre>
   * The relationship type
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.RelationshipType relationship_type = 3 [json_name = "relationshipType"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.RelationshipTypeOrBuilder getRelationshipTypeOrBuilder() {
    return relationshipType_ == null ? com.anduril.entitymanager.v1.RelationshipType.getDefaultInstance() : relationshipType_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(relatedEntityId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, relatedEntityId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(relationshipId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, relationshipId_);
    }
    if (relationshipType_ != null) {
      output.writeMessage(3, getRelationshipType());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(relatedEntityId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, relatedEntityId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(relationshipId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, relationshipId_);
    }
    if (relationshipType_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getRelationshipType());
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
    if (!(obj instanceof com.anduril.entitymanager.v1.RelationshipRequest)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.RelationshipRequest other = (com.anduril.entitymanager.v1.RelationshipRequest) obj;

    if (!getRelatedEntityId()
        .equals(other.getRelatedEntityId())) return false;
    if (!getRelationshipId()
        .equals(other.getRelationshipId())) return false;
    if (hasRelationshipType() != other.hasRelationshipType()) return false;
    if (hasRelationshipType()) {
      if (!getRelationshipType()
          .equals(other.getRelationshipType())) return false;
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
    hash = (37 * hash) + RELATED_ENTITY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRelatedEntityId().hashCode();
    hash = (37 * hash) + RELATIONSHIP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRelationshipId().hashCode();
    if (hasRelationshipType()) {
      hash = (37 * hash) + RELATIONSHIP_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getRelationshipType().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.RelationshipRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.RelationshipRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.RelationshipRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.RelationshipRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.RelationshipRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.RelationshipRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.RelationshipRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.RelationshipRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.RelationshipRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.RelationshipRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.RelationshipRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.RelationshipRequest parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.RelationshipRequest prototype) {
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
   * A request for a relationship on an entity. Forms a partial of the entitymanager.v1.Relationship message.
   * </pre>
   *
   * Protobuf type {@code anduril.entitymanager.v1.RelationshipRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.RelationshipRequest)
      com.anduril.entitymanager.v1.RelationshipRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.EntityManagerApiPubProto.internal_static_anduril_entitymanager_v1_RelationshipRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.EntityManagerApiPubProto.internal_static_anduril_entitymanager_v1_RelationshipRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.RelationshipRequest.class, com.anduril.entitymanager.v1.RelationshipRequest.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.RelationshipRequest.newBuilder()
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
      relatedEntityId_ = "";
      relationshipId_ = "";
      relationshipType_ = null;
      if (relationshipTypeBuilder_ != null) {
        relationshipTypeBuilder_.dispose();
        relationshipTypeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.EntityManagerApiPubProto.internal_static_anduril_entitymanager_v1_RelationshipRequest_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.RelationshipRequest getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.RelationshipRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.RelationshipRequest build() {
      com.anduril.entitymanager.v1.RelationshipRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.RelationshipRequest buildPartial() {
      com.anduril.entitymanager.v1.RelationshipRequest result = new com.anduril.entitymanager.v1.RelationshipRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.entitymanager.v1.RelationshipRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.relatedEntityId_ = relatedEntityId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.relationshipId_ = relationshipId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.relationshipType_ = relationshipTypeBuilder_ == null
            ? relationshipType_
            : relationshipTypeBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entitymanager.v1.RelationshipRequest) {
        return mergeFrom((com.anduril.entitymanager.v1.RelationshipRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.RelationshipRequest other) {
      if (other == com.anduril.entitymanager.v1.RelationshipRequest.getDefaultInstance()) return this;
      if (!other.getRelatedEntityId().isEmpty()) {
        relatedEntityId_ = other.relatedEntityId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRelationshipId().isEmpty()) {
        relationshipId_ = other.relationshipId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasRelationshipType()) {
        mergeRelationshipType(other.getRelationshipType());
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
              relatedEntityId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              relationshipId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getRelationshipTypeFieldBuilder().getBuilder(),
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

    private java.lang.Object relatedEntityId_ = "";
    /**
     * <pre>
     * The entity ID to which this entity is related.
     * </pre>
     *
     * <code>string related_entity_id = 1 [json_name = "relatedEntityId"];</code>
     * @return The relatedEntityId.
     */
    public java.lang.String getRelatedEntityId() {
      java.lang.Object ref = relatedEntityId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        relatedEntityId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The entity ID to which this entity is related.
     * </pre>
     *
     * <code>string related_entity_id = 1 [json_name = "relatedEntityId"];</code>
     * @return The bytes for relatedEntityId.
     */
    public com.google.protobuf.ByteString
        getRelatedEntityIdBytes() {
      java.lang.Object ref = relatedEntityId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        relatedEntityId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The entity ID to which this entity is related.
     * </pre>
     *
     * <code>string related_entity_id = 1 [json_name = "relatedEntityId"];</code>
     * @param value The relatedEntityId to set.
     * @return This builder for chaining.
     */
    public Builder setRelatedEntityId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      relatedEntityId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The entity ID to which this entity is related.
     * </pre>
     *
     * <code>string related_entity_id = 1 [json_name = "relatedEntityId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRelatedEntityId() {
      relatedEntityId_ = getDefaultInstance().getRelatedEntityId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The entity ID to which this entity is related.
     * </pre>
     *
     * <code>string related_entity_id = 1 [json_name = "relatedEntityId"];</code>
     * @param value The bytes for relatedEntityId to set.
     * @return This builder for chaining.
     */
    public Builder setRelatedEntityIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      relatedEntityId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object relationshipId_ = "";
    /**
     * <pre>
     * If RelationshipID is empty, a new relationship is created. Otherwise, the service will attempt
     * to update an already existing relationship on the entity.
     * </pre>
     *
     * <code>string relationship_id = 2 [json_name = "relationshipId"];</code>
     * @return The relationshipId.
     */
    public java.lang.String getRelationshipId() {
      java.lang.Object ref = relationshipId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        relationshipId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * If RelationshipID is empty, a new relationship is created. Otherwise, the service will attempt
     * to update an already existing relationship on the entity.
     * </pre>
     *
     * <code>string relationship_id = 2 [json_name = "relationshipId"];</code>
     * @return The bytes for relationshipId.
     */
    public com.google.protobuf.ByteString
        getRelationshipIdBytes() {
      java.lang.Object ref = relationshipId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        relationshipId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * If RelationshipID is empty, a new relationship is created. Otherwise, the service will attempt
     * to update an already existing relationship on the entity.
     * </pre>
     *
     * <code>string relationship_id = 2 [json_name = "relationshipId"];</code>
     * @param value The relationshipId to set.
     * @return This builder for chaining.
     */
    public Builder setRelationshipId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      relationshipId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If RelationshipID is empty, a new relationship is created. Otherwise, the service will attempt
     * to update an already existing relationship on the entity.
     * </pre>
     *
     * <code>string relationship_id = 2 [json_name = "relationshipId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRelationshipId() {
      relationshipId_ = getDefaultInstance().getRelationshipId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If RelationshipID is empty, a new relationship is created. Otherwise, the service will attempt
     * to update an already existing relationship on the entity.
     * </pre>
     *
     * <code>string relationship_id = 2 [json_name = "relationshipId"];</code>
     * @param value The bytes for relationshipId to set.
     * @return This builder for chaining.
     */
    public Builder setRelationshipIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      relationshipId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.anduril.entitymanager.v1.RelationshipType relationshipType_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.RelationshipType, com.anduril.entitymanager.v1.RelationshipType.Builder, com.anduril.entitymanager.v1.RelationshipTypeOrBuilder> relationshipTypeBuilder_;
    /**
     * <pre>
     * The relationship type
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.RelationshipType relationship_type = 3 [json_name = "relationshipType"];</code>
     * @return Whether the relationshipType field is set.
     */
    public boolean hasRelationshipType() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The relationship type
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.RelationshipType relationship_type = 3 [json_name = "relationshipType"];</code>
     * @return The relationshipType.
     */
    public com.anduril.entitymanager.v1.RelationshipType getRelationshipType() {
      if (relationshipTypeBuilder_ == null) {
        return relationshipType_ == null ? com.anduril.entitymanager.v1.RelationshipType.getDefaultInstance() : relationshipType_;
      } else {
        return relationshipTypeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The relationship type
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.RelationshipType relationship_type = 3 [json_name = "relationshipType"];</code>
     */
    public Builder setRelationshipType(com.anduril.entitymanager.v1.RelationshipType value) {
      if (relationshipTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        relationshipType_ = value;
      } else {
        relationshipTypeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The relationship type
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.RelationshipType relationship_type = 3 [json_name = "relationshipType"];</code>
     */
    public Builder setRelationshipType(
        com.anduril.entitymanager.v1.RelationshipType.Builder builderForValue) {
      if (relationshipTypeBuilder_ == null) {
        relationshipType_ = builderForValue.build();
      } else {
        relationshipTypeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The relationship type
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.RelationshipType relationship_type = 3 [json_name = "relationshipType"];</code>
     */
    public Builder mergeRelationshipType(com.anduril.entitymanager.v1.RelationshipType value) {
      if (relationshipTypeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          relationshipType_ != null &&
          relationshipType_ != com.anduril.entitymanager.v1.RelationshipType.getDefaultInstance()) {
          getRelationshipTypeBuilder().mergeFrom(value);
        } else {
          relationshipType_ = value;
        }
      } else {
        relationshipTypeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The relationship type
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.RelationshipType relationship_type = 3 [json_name = "relationshipType"];</code>
     */
    public Builder clearRelationshipType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      relationshipType_ = null;
      if (relationshipTypeBuilder_ != null) {
        relationshipTypeBuilder_.dispose();
        relationshipTypeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The relationship type
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.RelationshipType relationship_type = 3 [json_name = "relationshipType"];</code>
     */
    public com.anduril.entitymanager.v1.RelationshipType.Builder getRelationshipTypeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getRelationshipTypeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The relationship type
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.RelationshipType relationship_type = 3 [json_name = "relationshipType"];</code>
     */
    public com.anduril.entitymanager.v1.RelationshipTypeOrBuilder getRelationshipTypeOrBuilder() {
      if (relationshipTypeBuilder_ != null) {
        return relationshipTypeBuilder_.getMessageOrBuilder();
      } else {
        return relationshipType_ == null ?
            com.anduril.entitymanager.v1.RelationshipType.getDefaultInstance() : relationshipType_;
      }
    }
    /**
     * <pre>
     * The relationship type
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.RelationshipType relationship_type = 3 [json_name = "relationshipType"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.RelationshipType, com.anduril.entitymanager.v1.RelationshipType.Builder, com.anduril.entitymanager.v1.RelationshipTypeOrBuilder> 
        getRelationshipTypeFieldBuilder() {
      if (relationshipTypeBuilder_ == null) {
        relationshipTypeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.entitymanager.v1.RelationshipType, com.anduril.entitymanager.v1.RelationshipType.Builder, com.anduril.entitymanager.v1.RelationshipTypeOrBuilder>(
                getRelationshipType(),
                getParentForChildren(),
                isClean());
        relationshipType_ = null;
      }
      return relationshipTypeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.RelationshipRequest)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.RelationshipRequest)
  private static final com.anduril.entitymanager.v1.RelationshipRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.RelationshipRequest();
  }

  public static com.anduril.entitymanager.v1.RelationshipRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RelationshipRequest>
      PARSER = new com.google.protobuf.AbstractParser<RelationshipRequest>() {
    @java.lang.Override
    public RelationshipRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RelationshipRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RelationshipRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.RelationshipRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

