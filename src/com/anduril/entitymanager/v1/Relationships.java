// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/relationship.pub.proto

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * The relationships between this entity and other entities in the common operational picture.
 * </pre>
 *
 * Protobuf type {@code anduril.entitymanager.v1.Relationships}
 */
public final class Relationships extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.Relationships)
    RelationshipsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Relationships.newBuilder() to construct.
  private Relationships(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Relationships() {
    relationships_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Relationships();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.RelationshipPubProto.internal_static_anduril_entitymanager_v1_Relationships_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.RelationshipPubProto.internal_static_anduril_entitymanager_v1_Relationships_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.Relationships.class, com.anduril.entitymanager.v1.Relationships.Builder.class);
  }

  public static final int RELATIONSHIPS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.anduril.entitymanager.v1.Relationship> relationships_;
  /**
   * <code>repeated .anduril.entitymanager.v1.Relationship relationships = 1 [json_name = "relationships"];</code>
   */
  @java.lang.Override
  public java.util.List<com.anduril.entitymanager.v1.Relationship> getRelationshipsList() {
    return relationships_;
  }
  /**
   * <code>repeated .anduril.entitymanager.v1.Relationship relationships = 1 [json_name = "relationships"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.anduril.entitymanager.v1.RelationshipOrBuilder> 
      getRelationshipsOrBuilderList() {
    return relationships_;
  }
  /**
   * <code>repeated .anduril.entitymanager.v1.Relationship relationships = 1 [json_name = "relationships"];</code>
   */
  @java.lang.Override
  public int getRelationshipsCount() {
    return relationships_.size();
  }
  /**
   * <code>repeated .anduril.entitymanager.v1.Relationship relationships = 1 [json_name = "relationships"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.Relationship getRelationships(int index) {
    return relationships_.get(index);
  }
  /**
   * <code>repeated .anduril.entitymanager.v1.Relationship relationships = 1 [json_name = "relationships"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.RelationshipOrBuilder getRelationshipsOrBuilder(
      int index) {
    return relationships_.get(index);
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
    for (int i = 0; i < relationships_.size(); i++) {
      output.writeMessage(1, relationships_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < relationships_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, relationships_.get(i));
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
    if (!(obj instanceof com.anduril.entitymanager.v1.Relationships)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.Relationships other = (com.anduril.entitymanager.v1.Relationships) obj;

    if (!getRelationshipsList()
        .equals(other.getRelationshipsList())) return false;
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
    if (getRelationshipsCount() > 0) {
      hash = (37 * hash) + RELATIONSHIPS_FIELD_NUMBER;
      hash = (53 * hash) + getRelationshipsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.Relationships parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.Relationships parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Relationships parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.Relationships parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Relationships parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.Relationships parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Relationships parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.Relationships parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Relationships parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.Relationships parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Relationships parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.Relationships parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.Relationships prototype) {
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
   * The relationships between this entity and other entities in the common operational picture.
   * </pre>
   *
   * Protobuf type {@code anduril.entitymanager.v1.Relationships}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.Relationships)
      com.anduril.entitymanager.v1.RelationshipsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.RelationshipPubProto.internal_static_anduril_entitymanager_v1_Relationships_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.RelationshipPubProto.internal_static_anduril_entitymanager_v1_Relationships_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.Relationships.class, com.anduril.entitymanager.v1.Relationships.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.Relationships.newBuilder()
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
      if (relationshipsBuilder_ == null) {
        relationships_ = java.util.Collections.emptyList();
      } else {
        relationships_ = null;
        relationshipsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.RelationshipPubProto.internal_static_anduril_entitymanager_v1_Relationships_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.Relationships getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.Relationships.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.Relationships build() {
      com.anduril.entitymanager.v1.Relationships result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.Relationships buildPartial() {
      com.anduril.entitymanager.v1.Relationships result = new com.anduril.entitymanager.v1.Relationships(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.anduril.entitymanager.v1.Relationships result) {
      if (relationshipsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          relationships_ = java.util.Collections.unmodifiableList(relationships_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.relationships_ = relationships_;
      } else {
        result.relationships_ = relationshipsBuilder_.build();
      }
    }

    private void buildPartial0(com.anduril.entitymanager.v1.Relationships result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entitymanager.v1.Relationships) {
        return mergeFrom((com.anduril.entitymanager.v1.Relationships)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.Relationships other) {
      if (other == com.anduril.entitymanager.v1.Relationships.getDefaultInstance()) return this;
      if (relationshipsBuilder_ == null) {
        if (!other.relationships_.isEmpty()) {
          if (relationships_.isEmpty()) {
            relationships_ = other.relationships_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRelationshipsIsMutable();
            relationships_.addAll(other.relationships_);
          }
          onChanged();
        }
      } else {
        if (!other.relationships_.isEmpty()) {
          if (relationshipsBuilder_.isEmpty()) {
            relationshipsBuilder_.dispose();
            relationshipsBuilder_ = null;
            relationships_ = other.relationships_;
            bitField0_ = (bitField0_ & ~0x00000001);
            relationshipsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRelationshipsFieldBuilder() : null;
          } else {
            relationshipsBuilder_.addAllMessages(other.relationships_);
          }
        }
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
              com.anduril.entitymanager.v1.Relationship m =
                  input.readMessage(
                      com.anduril.entitymanager.v1.Relationship.parser(),
                      extensionRegistry);
              if (relationshipsBuilder_ == null) {
                ensureRelationshipsIsMutable();
                relationships_.add(m);
              } else {
                relationshipsBuilder_.addMessage(m);
              }
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

    private java.util.List<com.anduril.entitymanager.v1.Relationship> relationships_ =
      java.util.Collections.emptyList();
    private void ensureRelationshipsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        relationships_ = new java.util.ArrayList<com.anduril.entitymanager.v1.Relationship>(relationships_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.anduril.entitymanager.v1.Relationship, com.anduril.entitymanager.v1.Relationship.Builder, com.anduril.entitymanager.v1.RelationshipOrBuilder> relationshipsBuilder_;

    /**
     * <code>repeated .anduril.entitymanager.v1.Relationship relationships = 1 [json_name = "relationships"];</code>
     */
    public java.util.List<com.anduril.entitymanager.v1.Relationship> getRelationshipsList() {
      if (relationshipsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(relationships_);
      } else {
        return relationshipsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Relationship relationships = 1 [json_name = "relationships"];</code>
     */
    public int getRelationshipsCount() {
      if (relationshipsBuilder_ == null) {
        return relationships_.size();
      } else {
        return relationshipsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Relationship relationships = 1 [json_name = "relationships"];</code>
     */
    public com.anduril.entitymanager.v1.Relationship getRelationships(int index) {
      if (relationshipsBuilder_ == null) {
        return relationships_.get(index);
      } else {
        return relationshipsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Relationship relationships = 1 [json_name = "relationships"];</code>
     */
    public Builder setRelationships(
        int index, com.anduril.entitymanager.v1.Relationship value) {
      if (relationshipsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRelationshipsIsMutable();
        relationships_.set(index, value);
        onChanged();
      } else {
        relationshipsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Relationship relationships = 1 [json_name = "relationships"];</code>
     */
    public Builder setRelationships(
        int index, com.anduril.entitymanager.v1.Relationship.Builder builderForValue) {
      if (relationshipsBuilder_ == null) {
        ensureRelationshipsIsMutable();
        relationships_.set(index, builderForValue.build());
        onChanged();
      } else {
        relationshipsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Relationship relationships = 1 [json_name = "relationships"];</code>
     */
    public Builder addRelationships(com.anduril.entitymanager.v1.Relationship value) {
      if (relationshipsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRelationshipsIsMutable();
        relationships_.add(value);
        onChanged();
      } else {
        relationshipsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Relationship relationships = 1 [json_name = "relationships"];</code>
     */
    public Builder addRelationships(
        int index, com.anduril.entitymanager.v1.Relationship value) {
      if (relationshipsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRelationshipsIsMutable();
        relationships_.add(index, value);
        onChanged();
      } else {
        relationshipsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Relationship relationships = 1 [json_name = "relationships"];</code>
     */
    public Builder addRelationships(
        com.anduril.entitymanager.v1.Relationship.Builder builderForValue) {
      if (relationshipsBuilder_ == null) {
        ensureRelationshipsIsMutable();
        relationships_.add(builderForValue.build());
        onChanged();
      } else {
        relationshipsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Relationship relationships = 1 [json_name = "relationships"];</code>
     */
    public Builder addRelationships(
        int index, com.anduril.entitymanager.v1.Relationship.Builder builderForValue) {
      if (relationshipsBuilder_ == null) {
        ensureRelationshipsIsMutable();
        relationships_.add(index, builderForValue.build());
        onChanged();
      } else {
        relationshipsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Relationship relationships = 1 [json_name = "relationships"];</code>
     */
    public Builder addAllRelationships(
        java.lang.Iterable<? extends com.anduril.entitymanager.v1.Relationship> values) {
      if (relationshipsBuilder_ == null) {
        ensureRelationshipsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, relationships_);
        onChanged();
      } else {
        relationshipsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Relationship relationships = 1 [json_name = "relationships"];</code>
     */
    public Builder clearRelationships() {
      if (relationshipsBuilder_ == null) {
        relationships_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        relationshipsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Relationship relationships = 1 [json_name = "relationships"];</code>
     */
    public Builder removeRelationships(int index) {
      if (relationshipsBuilder_ == null) {
        ensureRelationshipsIsMutable();
        relationships_.remove(index);
        onChanged();
      } else {
        relationshipsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Relationship relationships = 1 [json_name = "relationships"];</code>
     */
    public com.anduril.entitymanager.v1.Relationship.Builder getRelationshipsBuilder(
        int index) {
      return getRelationshipsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Relationship relationships = 1 [json_name = "relationships"];</code>
     */
    public com.anduril.entitymanager.v1.RelationshipOrBuilder getRelationshipsOrBuilder(
        int index) {
      if (relationshipsBuilder_ == null) {
        return relationships_.get(index);  } else {
        return relationshipsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Relationship relationships = 1 [json_name = "relationships"];</code>
     */
    public java.util.List<? extends com.anduril.entitymanager.v1.RelationshipOrBuilder> 
         getRelationshipsOrBuilderList() {
      if (relationshipsBuilder_ != null) {
        return relationshipsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(relationships_);
      }
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Relationship relationships = 1 [json_name = "relationships"];</code>
     */
    public com.anduril.entitymanager.v1.Relationship.Builder addRelationshipsBuilder() {
      return getRelationshipsFieldBuilder().addBuilder(
          com.anduril.entitymanager.v1.Relationship.getDefaultInstance());
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Relationship relationships = 1 [json_name = "relationships"];</code>
     */
    public com.anduril.entitymanager.v1.Relationship.Builder addRelationshipsBuilder(
        int index) {
      return getRelationshipsFieldBuilder().addBuilder(
          index, com.anduril.entitymanager.v1.Relationship.getDefaultInstance());
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Relationship relationships = 1 [json_name = "relationships"];</code>
     */
    public java.util.List<com.anduril.entitymanager.v1.Relationship.Builder> 
         getRelationshipsBuilderList() {
      return getRelationshipsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.anduril.entitymanager.v1.Relationship, com.anduril.entitymanager.v1.Relationship.Builder, com.anduril.entitymanager.v1.RelationshipOrBuilder> 
        getRelationshipsFieldBuilder() {
      if (relationshipsBuilder_ == null) {
        relationshipsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.anduril.entitymanager.v1.Relationship, com.anduril.entitymanager.v1.Relationship.Builder, com.anduril.entitymanager.v1.RelationshipOrBuilder>(
                relationships_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        relationships_ = null;
      }
      return relationshipsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.Relationships)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.Relationships)
  private static final com.anduril.entitymanager.v1.Relationships DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.Relationships();
  }

  public static com.anduril.entitymanager.v1.Relationships getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Relationships>
      PARSER = new com.google.protobuf.AbstractParser<Relationships>() {
    @java.lang.Override
    public Relationships parsePartialFrom(
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

  public static com.google.protobuf.Parser<Relationships> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Relationships> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.Relationships getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

