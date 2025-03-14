// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/type/coords.pub.proto

package com.anduril.type;

/**
 * <pre>
 * Rx + t, Technically this is a duplicate of AffineTransform
 * but Affine Transform isn't really an affine transform (since it doesn't allow
 * skewing and stretching).
 * </pre>
 *
 * Protobuf type {@code anduril.type.RigidTransform}
 */
public final class RigidTransform extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.type.RigidTransform)
    RigidTransformOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RigidTransform.newBuilder() to construct.
  private RigidTransform(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RigidTransform() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RigidTransform();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.type.CoordsPubProto.internal_static_anduril_type_RigidTransform_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.type.CoordsPubProto.internal_static_anduril_type_RigidTransform_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.type.RigidTransform.class, com.anduril.type.RigidTransform.Builder.class);
  }

  public static final int ROTATION_FIELD_NUMBER = 3;
  private com.anduril.type.Quaternion rotation_;
  /**
   * <code>.anduril.type.Quaternion rotation = 3 [json_name = "rotation"];</code>
   * @return Whether the rotation field is set.
   */
  @java.lang.Override
  public boolean hasRotation() {
    return rotation_ != null;
  }
  /**
   * <code>.anduril.type.Quaternion rotation = 3 [json_name = "rotation"];</code>
   * @return The rotation.
   */
  @java.lang.Override
  public com.anduril.type.Quaternion getRotation() {
    return rotation_ == null ? com.anduril.type.Quaternion.getDefaultInstance() : rotation_;
  }
  /**
   * <code>.anduril.type.Quaternion rotation = 3 [json_name = "rotation"];</code>
   */
  @java.lang.Override
  public com.anduril.type.QuaternionOrBuilder getRotationOrBuilder() {
    return rotation_ == null ? com.anduril.type.Quaternion.getDefaultInstance() : rotation_;
  }

  public static final int TRANSLATION_FIELD_NUMBER = 4;
  private com.anduril.type.Vec3 translation_;
  /**
   * <code>.anduril.type.Vec3 translation = 4 [json_name = "translation"];</code>
   * @return Whether the translation field is set.
   */
  @java.lang.Override
  public boolean hasTranslation() {
    return translation_ != null;
  }
  /**
   * <code>.anduril.type.Vec3 translation = 4 [json_name = "translation"];</code>
   * @return The translation.
   */
  @java.lang.Override
  public com.anduril.type.Vec3 getTranslation() {
    return translation_ == null ? com.anduril.type.Vec3.getDefaultInstance() : translation_;
  }
  /**
   * <code>.anduril.type.Vec3 translation = 4 [json_name = "translation"];</code>
   */
  @java.lang.Override
  public com.anduril.type.Vec3OrBuilder getTranslationOrBuilder() {
    return translation_ == null ? com.anduril.type.Vec3.getDefaultInstance() : translation_;
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
    if (rotation_ != null) {
      output.writeMessage(3, getRotation());
    }
    if (translation_ != null) {
      output.writeMessage(4, getTranslation());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rotation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getRotation());
    }
    if (translation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getTranslation());
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
    if (!(obj instanceof com.anduril.type.RigidTransform)) {
      return super.equals(obj);
    }
    com.anduril.type.RigidTransform other = (com.anduril.type.RigidTransform) obj;

    if (hasRotation() != other.hasRotation()) return false;
    if (hasRotation()) {
      if (!getRotation()
          .equals(other.getRotation())) return false;
    }
    if (hasTranslation() != other.hasTranslation()) return false;
    if (hasTranslation()) {
      if (!getTranslation()
          .equals(other.getTranslation())) return false;
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
    if (hasRotation()) {
      hash = (37 * hash) + ROTATION_FIELD_NUMBER;
      hash = (53 * hash) + getRotation().hashCode();
    }
    if (hasTranslation()) {
      hash = (37 * hash) + TRANSLATION_FIELD_NUMBER;
      hash = (53 * hash) + getTranslation().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.type.RigidTransform parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.type.RigidTransform parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.type.RigidTransform parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.type.RigidTransform parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.type.RigidTransform parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.type.RigidTransform parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.type.RigidTransform parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.type.RigidTransform parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.type.RigidTransform parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.type.RigidTransform parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.type.RigidTransform parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.type.RigidTransform parseFrom(
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
  public static Builder newBuilder(com.anduril.type.RigidTransform prototype) {
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
   * Rx + t, Technically this is a duplicate of AffineTransform
   * but Affine Transform isn't really an affine transform (since it doesn't allow
   * skewing and stretching).
   * </pre>
   *
   * Protobuf type {@code anduril.type.RigidTransform}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.type.RigidTransform)
      com.anduril.type.RigidTransformOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.type.CoordsPubProto.internal_static_anduril_type_RigidTransform_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.type.CoordsPubProto.internal_static_anduril_type_RigidTransform_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.type.RigidTransform.class, com.anduril.type.RigidTransform.Builder.class);
    }

    // Construct using com.anduril.type.RigidTransform.newBuilder()
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
      rotation_ = null;
      if (rotationBuilder_ != null) {
        rotationBuilder_.dispose();
        rotationBuilder_ = null;
      }
      translation_ = null;
      if (translationBuilder_ != null) {
        translationBuilder_.dispose();
        translationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.type.CoordsPubProto.internal_static_anduril_type_RigidTransform_descriptor;
    }

    @java.lang.Override
    public com.anduril.type.RigidTransform getDefaultInstanceForType() {
      return com.anduril.type.RigidTransform.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.type.RigidTransform build() {
      com.anduril.type.RigidTransform result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.type.RigidTransform buildPartial() {
      com.anduril.type.RigidTransform result = new com.anduril.type.RigidTransform(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.type.RigidTransform result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rotation_ = rotationBuilder_ == null
            ? rotation_
            : rotationBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.translation_ = translationBuilder_ == null
            ? translation_
            : translationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.type.RigidTransform) {
        return mergeFrom((com.anduril.type.RigidTransform)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.type.RigidTransform other) {
      if (other == com.anduril.type.RigidTransform.getDefaultInstance()) return this;
      if (other.hasRotation()) {
        mergeRotation(other.getRotation());
      }
      if (other.hasTranslation()) {
        mergeTranslation(other.getTranslation());
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
            case 26: {
              input.readMessage(
                  getRotationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getTranslationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 34
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

    private com.anduril.type.Quaternion rotation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.type.Quaternion, com.anduril.type.Quaternion.Builder, com.anduril.type.QuaternionOrBuilder> rotationBuilder_;
    /**
     * <code>.anduril.type.Quaternion rotation = 3 [json_name = "rotation"];</code>
     * @return Whether the rotation field is set.
     */
    public boolean hasRotation() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.anduril.type.Quaternion rotation = 3 [json_name = "rotation"];</code>
     * @return The rotation.
     */
    public com.anduril.type.Quaternion getRotation() {
      if (rotationBuilder_ == null) {
        return rotation_ == null ? com.anduril.type.Quaternion.getDefaultInstance() : rotation_;
      } else {
        return rotationBuilder_.getMessage();
      }
    }
    /**
     * <code>.anduril.type.Quaternion rotation = 3 [json_name = "rotation"];</code>
     */
    public Builder setRotation(com.anduril.type.Quaternion value) {
      if (rotationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rotation_ = value;
      } else {
        rotationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.type.Quaternion rotation = 3 [json_name = "rotation"];</code>
     */
    public Builder setRotation(
        com.anduril.type.Quaternion.Builder builderForValue) {
      if (rotationBuilder_ == null) {
        rotation_ = builderForValue.build();
      } else {
        rotationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.type.Quaternion rotation = 3 [json_name = "rotation"];</code>
     */
    public Builder mergeRotation(com.anduril.type.Quaternion value) {
      if (rotationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          rotation_ != null &&
          rotation_ != com.anduril.type.Quaternion.getDefaultInstance()) {
          getRotationBuilder().mergeFrom(value);
        } else {
          rotation_ = value;
        }
      } else {
        rotationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.type.Quaternion rotation = 3 [json_name = "rotation"];</code>
     */
    public Builder clearRotation() {
      bitField0_ = (bitField0_ & ~0x00000001);
      rotation_ = null;
      if (rotationBuilder_ != null) {
        rotationBuilder_.dispose();
        rotationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.type.Quaternion rotation = 3 [json_name = "rotation"];</code>
     */
    public com.anduril.type.Quaternion.Builder getRotationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRotationFieldBuilder().getBuilder();
    }
    /**
     * <code>.anduril.type.Quaternion rotation = 3 [json_name = "rotation"];</code>
     */
    public com.anduril.type.QuaternionOrBuilder getRotationOrBuilder() {
      if (rotationBuilder_ != null) {
        return rotationBuilder_.getMessageOrBuilder();
      } else {
        return rotation_ == null ?
            com.anduril.type.Quaternion.getDefaultInstance() : rotation_;
      }
    }
    /**
     * <code>.anduril.type.Quaternion rotation = 3 [json_name = "rotation"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.type.Quaternion, com.anduril.type.Quaternion.Builder, com.anduril.type.QuaternionOrBuilder> 
        getRotationFieldBuilder() {
      if (rotationBuilder_ == null) {
        rotationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.type.Quaternion, com.anduril.type.Quaternion.Builder, com.anduril.type.QuaternionOrBuilder>(
                getRotation(),
                getParentForChildren(),
                isClean());
        rotation_ = null;
      }
      return rotationBuilder_;
    }

    private com.anduril.type.Vec3 translation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.type.Vec3, com.anduril.type.Vec3.Builder, com.anduril.type.Vec3OrBuilder> translationBuilder_;
    /**
     * <code>.anduril.type.Vec3 translation = 4 [json_name = "translation"];</code>
     * @return Whether the translation field is set.
     */
    public boolean hasTranslation() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.anduril.type.Vec3 translation = 4 [json_name = "translation"];</code>
     * @return The translation.
     */
    public com.anduril.type.Vec3 getTranslation() {
      if (translationBuilder_ == null) {
        return translation_ == null ? com.anduril.type.Vec3.getDefaultInstance() : translation_;
      } else {
        return translationBuilder_.getMessage();
      }
    }
    /**
     * <code>.anduril.type.Vec3 translation = 4 [json_name = "translation"];</code>
     */
    public Builder setTranslation(com.anduril.type.Vec3 value) {
      if (translationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        translation_ = value;
      } else {
        translationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.type.Vec3 translation = 4 [json_name = "translation"];</code>
     */
    public Builder setTranslation(
        com.anduril.type.Vec3.Builder builderForValue) {
      if (translationBuilder_ == null) {
        translation_ = builderForValue.build();
      } else {
        translationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.type.Vec3 translation = 4 [json_name = "translation"];</code>
     */
    public Builder mergeTranslation(com.anduril.type.Vec3 value) {
      if (translationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          translation_ != null &&
          translation_ != com.anduril.type.Vec3.getDefaultInstance()) {
          getTranslationBuilder().mergeFrom(value);
        } else {
          translation_ = value;
        }
      } else {
        translationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.type.Vec3 translation = 4 [json_name = "translation"];</code>
     */
    public Builder clearTranslation() {
      bitField0_ = (bitField0_ & ~0x00000002);
      translation_ = null;
      if (translationBuilder_ != null) {
        translationBuilder_.dispose();
        translationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.type.Vec3 translation = 4 [json_name = "translation"];</code>
     */
    public com.anduril.type.Vec3.Builder getTranslationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTranslationFieldBuilder().getBuilder();
    }
    /**
     * <code>.anduril.type.Vec3 translation = 4 [json_name = "translation"];</code>
     */
    public com.anduril.type.Vec3OrBuilder getTranslationOrBuilder() {
      if (translationBuilder_ != null) {
        return translationBuilder_.getMessageOrBuilder();
      } else {
        return translation_ == null ?
            com.anduril.type.Vec3.getDefaultInstance() : translation_;
      }
    }
    /**
     * <code>.anduril.type.Vec3 translation = 4 [json_name = "translation"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.type.Vec3, com.anduril.type.Vec3.Builder, com.anduril.type.Vec3OrBuilder> 
        getTranslationFieldBuilder() {
      if (translationBuilder_ == null) {
        translationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.type.Vec3, com.anduril.type.Vec3.Builder, com.anduril.type.Vec3OrBuilder>(
                getTranslation(),
                getParentForChildren(),
                isClean());
        translation_ = null;
      }
      return translationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.type.RigidTransform)
  }

  // @@protoc_insertion_point(class_scope:anduril.type.RigidTransform)
  private static final com.anduril.type.RigidTransform DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.type.RigidTransform();
  }

  public static com.anduril.type.RigidTransform getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RigidTransform>
      PARSER = new com.google.protobuf.AbstractParser<RigidTransform>() {
    @java.lang.Override
    public RigidTransform parsePartialFrom(
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

  public static com.google.protobuf.Parser<RigidTransform> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RigidTransform> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.type.RigidTransform getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

