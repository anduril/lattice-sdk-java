// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/entity.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.entitymanager.v1;

/**
 * <pre>
 * Available for any Entities with alternate ids in other systems.
 * </pre>
 *
 * Protobuf type {@code anduril.entitymanager.v1.Aliases}
 */
public final class Aliases extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.Aliases)
    AliasesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Aliases.newBuilder() to construct.
  private Aliases(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Aliases() {
    alternateIds_ = java.util.Collections.emptyList();
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Aliases();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.EntityPubProto.internal_static_anduril_entitymanager_v1_Aliases_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.EntityPubProto.internal_static_anduril_entitymanager_v1_Aliases_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.Aliases.class, com.anduril.entitymanager.v1.Aliases.Builder.class);
  }

  public static final int ALTERNATE_IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.anduril.entitymanager.v1.AlternateId> alternateIds_;
  /**
   * <code>repeated .anduril.entitymanager.v1.AlternateId alternate_ids = 1 [json_name = "alternateIds", (.anduril.entitymanager.v1.overridable) = true];</code>
   */
  @java.lang.Override
  public java.util.List<com.anduril.entitymanager.v1.AlternateId> getAlternateIdsList() {
    return alternateIds_;
  }
  /**
   * <code>repeated .anduril.entitymanager.v1.AlternateId alternate_ids = 1 [json_name = "alternateIds", (.anduril.entitymanager.v1.overridable) = true];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.anduril.entitymanager.v1.AlternateIdOrBuilder> 
      getAlternateIdsOrBuilderList() {
    return alternateIds_;
  }
  /**
   * <code>repeated .anduril.entitymanager.v1.AlternateId alternate_ids = 1 [json_name = "alternateIds", (.anduril.entitymanager.v1.overridable) = true];</code>
   */
  @java.lang.Override
  public int getAlternateIdsCount() {
    return alternateIds_.size();
  }
  /**
   * <code>repeated .anduril.entitymanager.v1.AlternateId alternate_ids = 1 [json_name = "alternateIds", (.anduril.entitymanager.v1.overridable) = true];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.AlternateId getAlternateIds(int index) {
    return alternateIds_.get(index);
  }
  /**
   * <code>repeated .anduril.entitymanager.v1.AlternateId alternate_ids = 1 [json_name = "alternateIds", (.anduril.entitymanager.v1.overridable) = true];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.AlternateIdOrBuilder getAlternateIdsOrBuilder(
      int index) {
    return alternateIds_.get(index);
  }

  public static final int NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * The best available version of the entity's display name.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name", (.anduril.entitymanager.v1.overridable) = true];</code>
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
   * The best available version of the entity's display name.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name", (.anduril.entitymanager.v1.overridable) = true];</code>
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
    for (int i = 0; i < alternateIds_.size(); i++) {
      output.writeMessage(1, alternateIds_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < alternateIds_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, alternateIds_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
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
    if (!(obj instanceof com.anduril.entitymanager.v1.Aliases)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.Aliases other = (com.anduril.entitymanager.v1.Aliases) obj;

    if (!getAlternateIdsList()
        .equals(other.getAlternateIdsList())) return false;
    if (!getName()
        .equals(other.getName())) return false;
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
    if (getAlternateIdsCount() > 0) {
      hash = (37 * hash) + ALTERNATE_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getAlternateIdsList().hashCode();
    }
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.Aliases parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.Aliases parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Aliases parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.Aliases parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Aliases parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.Aliases parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Aliases parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.Aliases parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.entitymanager.v1.Aliases parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.entitymanager.v1.Aliases parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Aliases parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.Aliases parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.Aliases prototype) {
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
   * Available for any Entities with alternate ids in other systems.
   * </pre>
   *
   * Protobuf type {@code anduril.entitymanager.v1.Aliases}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.Aliases)
      com.anduril.entitymanager.v1.AliasesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.EntityPubProto.internal_static_anduril_entitymanager_v1_Aliases_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.EntityPubProto.internal_static_anduril_entitymanager_v1_Aliases_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.Aliases.class, com.anduril.entitymanager.v1.Aliases.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.Aliases.newBuilder()
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
      if (alternateIdsBuilder_ == null) {
        alternateIds_ = java.util.Collections.emptyList();
      } else {
        alternateIds_ = null;
        alternateIdsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      name_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.EntityPubProto.internal_static_anduril_entitymanager_v1_Aliases_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.Aliases getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.Aliases.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.Aliases build() {
      com.anduril.entitymanager.v1.Aliases result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.Aliases buildPartial() {
      com.anduril.entitymanager.v1.Aliases result = new com.anduril.entitymanager.v1.Aliases(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.anduril.entitymanager.v1.Aliases result) {
      if (alternateIdsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          alternateIds_ = java.util.Collections.unmodifiableList(alternateIds_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.alternateIds_ = alternateIds_;
      } else {
        result.alternateIds_ = alternateIdsBuilder_.build();
      }
    }

    private void buildPartial0(com.anduril.entitymanager.v1.Aliases result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
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
      if (other instanceof com.anduril.entitymanager.v1.Aliases) {
        return mergeFrom((com.anduril.entitymanager.v1.Aliases)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.Aliases other) {
      if (other == com.anduril.entitymanager.v1.Aliases.getDefaultInstance()) return this;
      if (alternateIdsBuilder_ == null) {
        if (!other.alternateIds_.isEmpty()) {
          if (alternateIds_.isEmpty()) {
            alternateIds_ = other.alternateIds_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAlternateIdsIsMutable();
            alternateIds_.addAll(other.alternateIds_);
          }
          onChanged();
        }
      } else {
        if (!other.alternateIds_.isEmpty()) {
          if (alternateIdsBuilder_.isEmpty()) {
            alternateIdsBuilder_.dispose();
            alternateIdsBuilder_ = null;
            alternateIds_ = other.alternateIds_;
            bitField0_ = (bitField0_ & ~0x00000001);
            alternateIdsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAlternateIdsFieldBuilder() : null;
          } else {
            alternateIdsBuilder_.addAllMessages(other.alternateIds_);
          }
        }
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
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
              com.anduril.entitymanager.v1.AlternateId m =
                  input.readMessage(
                      com.anduril.entitymanager.v1.AlternateId.parser(),
                      extensionRegistry);
              if (alternateIdsBuilder_ == null) {
                ensureAlternateIdsIsMutable();
                alternateIds_.add(m);
              } else {
                alternateIdsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              name_ = input.readStringRequireUtf8();
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

    private java.util.List<com.anduril.entitymanager.v1.AlternateId> alternateIds_ =
      java.util.Collections.emptyList();
    private void ensureAlternateIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        alternateIds_ = new java.util.ArrayList<com.anduril.entitymanager.v1.AlternateId>(alternateIds_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.anduril.entitymanager.v1.AlternateId, com.anduril.entitymanager.v1.AlternateId.Builder, com.anduril.entitymanager.v1.AlternateIdOrBuilder> alternateIdsBuilder_;

    /**
     * <code>repeated .anduril.entitymanager.v1.AlternateId alternate_ids = 1 [json_name = "alternateIds", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public java.util.List<com.anduril.entitymanager.v1.AlternateId> getAlternateIdsList() {
      if (alternateIdsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(alternateIds_);
      } else {
        return alternateIdsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.AlternateId alternate_ids = 1 [json_name = "alternateIds", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public int getAlternateIdsCount() {
      if (alternateIdsBuilder_ == null) {
        return alternateIds_.size();
      } else {
        return alternateIdsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.AlternateId alternate_ids = 1 [json_name = "alternateIds", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public com.anduril.entitymanager.v1.AlternateId getAlternateIds(int index) {
      if (alternateIdsBuilder_ == null) {
        return alternateIds_.get(index);
      } else {
        return alternateIdsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.AlternateId alternate_ids = 1 [json_name = "alternateIds", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public Builder setAlternateIds(
        int index, com.anduril.entitymanager.v1.AlternateId value) {
      if (alternateIdsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlternateIdsIsMutable();
        alternateIds_.set(index, value);
        onChanged();
      } else {
        alternateIdsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.AlternateId alternate_ids = 1 [json_name = "alternateIds", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public Builder setAlternateIds(
        int index, com.anduril.entitymanager.v1.AlternateId.Builder builderForValue) {
      if (alternateIdsBuilder_ == null) {
        ensureAlternateIdsIsMutable();
        alternateIds_.set(index, builderForValue.build());
        onChanged();
      } else {
        alternateIdsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.AlternateId alternate_ids = 1 [json_name = "alternateIds", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public Builder addAlternateIds(com.anduril.entitymanager.v1.AlternateId value) {
      if (alternateIdsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlternateIdsIsMutable();
        alternateIds_.add(value);
        onChanged();
      } else {
        alternateIdsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.AlternateId alternate_ids = 1 [json_name = "alternateIds", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public Builder addAlternateIds(
        int index, com.anduril.entitymanager.v1.AlternateId value) {
      if (alternateIdsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlternateIdsIsMutable();
        alternateIds_.add(index, value);
        onChanged();
      } else {
        alternateIdsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.AlternateId alternate_ids = 1 [json_name = "alternateIds", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public Builder addAlternateIds(
        com.anduril.entitymanager.v1.AlternateId.Builder builderForValue) {
      if (alternateIdsBuilder_ == null) {
        ensureAlternateIdsIsMutable();
        alternateIds_.add(builderForValue.build());
        onChanged();
      } else {
        alternateIdsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.AlternateId alternate_ids = 1 [json_name = "alternateIds", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public Builder addAlternateIds(
        int index, com.anduril.entitymanager.v1.AlternateId.Builder builderForValue) {
      if (alternateIdsBuilder_ == null) {
        ensureAlternateIdsIsMutable();
        alternateIds_.add(index, builderForValue.build());
        onChanged();
      } else {
        alternateIdsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.AlternateId alternate_ids = 1 [json_name = "alternateIds", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public Builder addAllAlternateIds(
        java.lang.Iterable<? extends com.anduril.entitymanager.v1.AlternateId> values) {
      if (alternateIdsBuilder_ == null) {
        ensureAlternateIdsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, alternateIds_);
        onChanged();
      } else {
        alternateIdsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.AlternateId alternate_ids = 1 [json_name = "alternateIds", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public Builder clearAlternateIds() {
      if (alternateIdsBuilder_ == null) {
        alternateIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        alternateIdsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.AlternateId alternate_ids = 1 [json_name = "alternateIds", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public Builder removeAlternateIds(int index) {
      if (alternateIdsBuilder_ == null) {
        ensureAlternateIdsIsMutable();
        alternateIds_.remove(index);
        onChanged();
      } else {
        alternateIdsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.AlternateId alternate_ids = 1 [json_name = "alternateIds", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public com.anduril.entitymanager.v1.AlternateId.Builder getAlternateIdsBuilder(
        int index) {
      return getAlternateIdsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.AlternateId alternate_ids = 1 [json_name = "alternateIds", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public com.anduril.entitymanager.v1.AlternateIdOrBuilder getAlternateIdsOrBuilder(
        int index) {
      if (alternateIdsBuilder_ == null) {
        return alternateIds_.get(index);  } else {
        return alternateIdsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.AlternateId alternate_ids = 1 [json_name = "alternateIds", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public java.util.List<? extends com.anduril.entitymanager.v1.AlternateIdOrBuilder> 
         getAlternateIdsOrBuilderList() {
      if (alternateIdsBuilder_ != null) {
        return alternateIdsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(alternateIds_);
      }
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.AlternateId alternate_ids = 1 [json_name = "alternateIds", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public com.anduril.entitymanager.v1.AlternateId.Builder addAlternateIdsBuilder() {
      return getAlternateIdsFieldBuilder().addBuilder(
          com.anduril.entitymanager.v1.AlternateId.getDefaultInstance());
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.AlternateId alternate_ids = 1 [json_name = "alternateIds", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public com.anduril.entitymanager.v1.AlternateId.Builder addAlternateIdsBuilder(
        int index) {
      return getAlternateIdsFieldBuilder().addBuilder(
          index, com.anduril.entitymanager.v1.AlternateId.getDefaultInstance());
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.AlternateId alternate_ids = 1 [json_name = "alternateIds", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public java.util.List<com.anduril.entitymanager.v1.AlternateId.Builder> 
         getAlternateIdsBuilderList() {
      return getAlternateIdsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.anduril.entitymanager.v1.AlternateId, com.anduril.entitymanager.v1.AlternateId.Builder, com.anduril.entitymanager.v1.AlternateIdOrBuilder> 
        getAlternateIdsFieldBuilder() {
      if (alternateIdsBuilder_ == null) {
        alternateIdsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.anduril.entitymanager.v1.AlternateId, com.anduril.entitymanager.v1.AlternateId.Builder, com.anduril.entitymanager.v1.AlternateIdOrBuilder>(
                alternateIds_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        alternateIds_ = null;
      }
      return alternateIdsBuilder_;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The best available version of the entity's display name.
     * </pre>
     *
     * <code>string name = 2 [json_name = "name", (.anduril.entitymanager.v1.overridable) = true];</code>
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
     * The best available version of the entity's display name.
     * </pre>
     *
     * <code>string name = 2 [json_name = "name", (.anduril.entitymanager.v1.overridable) = true];</code>
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
     * The best available version of the entity's display name.
     * </pre>
     *
     * <code>string name = 2 [json_name = "name", (.anduril.entitymanager.v1.overridable) = true];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The best available version of the entity's display name.
     * </pre>
     *
     * <code>string name = 2 [json_name = "name", (.anduril.entitymanager.v1.overridable) = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The best available version of the entity's display name.
     * </pre>
     *
     * <code>string name = 2 [json_name = "name", (.anduril.entitymanager.v1.overridable) = true];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
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


    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.Aliases)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.Aliases)
  private static final com.anduril.entitymanager.v1.Aliases DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.Aliases();
  }

  public static com.anduril.entitymanager.v1.Aliases getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Aliases>
      PARSER = new com.google.protobuf.AbstractParser<Aliases>() {
    @java.lang.Override
    public Aliases parsePartialFrom(
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

  public static com.google.protobuf.Parser<Aliases> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Aliases> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.Aliases getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

