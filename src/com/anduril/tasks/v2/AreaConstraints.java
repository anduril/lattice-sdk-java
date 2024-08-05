// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/tasks/v2/common.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.tasks.v2;

/**
 * <pre>
 * Maps to UCI AreaConstraints.
 * </pre>
 *
 * Protobuf type {@code anduril.tasks.v2.AreaConstraints}
 */
public final class AreaConstraints extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:anduril.tasks.v2.AreaConstraints)
    AreaConstraintsOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      AreaConstraints.class.getName());
  }
  // Use AreaConstraints.newBuilder() to construct.
  private AreaConstraints(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private AreaConstraints() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.tasks.v2.CommonPubProto.internal_static_anduril_tasks_v2_AreaConstraints_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.tasks.v2.CommonPubProto.internal_static_anduril_tasks_v2_AreaConstraints_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.tasks.v2.AreaConstraints.class, com.anduril.tasks.v2.AreaConstraints.Builder.class);
  }

  private int bitField0_;
  public static final int ALTITUDE_CONSTRAINT_FIELD_NUMBER = 1;
  private com.anduril.tasks.v2.AltitudeConstraint altitudeConstraint_;
  /**
   * <code>.anduril.tasks.v2.AltitudeConstraint altitude_constraint = 1 [json_name = "altitudeConstraint"];</code>
   * @return Whether the altitudeConstraint field is set.
   */
  @java.lang.Override
  public boolean hasAltitudeConstraint() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.anduril.tasks.v2.AltitudeConstraint altitude_constraint = 1 [json_name = "altitudeConstraint"];</code>
   * @return The altitudeConstraint.
   */
  @java.lang.Override
  public com.anduril.tasks.v2.AltitudeConstraint getAltitudeConstraint() {
    return altitudeConstraint_ == null ? com.anduril.tasks.v2.AltitudeConstraint.getDefaultInstance() : altitudeConstraint_;
  }
  /**
   * <code>.anduril.tasks.v2.AltitudeConstraint altitude_constraint = 1 [json_name = "altitudeConstraint"];</code>
   */
  @java.lang.Override
  public com.anduril.tasks.v2.AltitudeConstraintOrBuilder getAltitudeConstraintOrBuilder() {
    return altitudeConstraint_ == null ? com.anduril.tasks.v2.AltitudeConstraint.getDefaultInstance() : altitudeConstraint_;
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
      output.writeMessage(1, getAltitudeConstraint());
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
        .computeMessageSize(1, getAltitudeConstraint());
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
    if (!(obj instanceof com.anduril.tasks.v2.AreaConstraints)) {
      return super.equals(obj);
    }
    com.anduril.tasks.v2.AreaConstraints other = (com.anduril.tasks.v2.AreaConstraints) obj;

    if (hasAltitudeConstraint() != other.hasAltitudeConstraint()) return false;
    if (hasAltitudeConstraint()) {
      if (!getAltitudeConstraint()
          .equals(other.getAltitudeConstraint())) return false;
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
    if (hasAltitudeConstraint()) {
      hash = (37 * hash) + ALTITUDE_CONSTRAINT_FIELD_NUMBER;
      hash = (53 * hash) + getAltitudeConstraint().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.tasks.v2.AreaConstraints parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.AreaConstraints parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.AreaConstraints parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.AreaConstraints parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.AreaConstraints parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.AreaConstraints parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.AreaConstraints parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.AreaConstraints parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.tasks.v2.AreaConstraints parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.tasks.v2.AreaConstraints parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.tasks.v2.AreaConstraints parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.AreaConstraints parseFrom(
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
  public static Builder newBuilder(com.anduril.tasks.v2.AreaConstraints prototype) {
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
   * Maps to UCI AreaConstraints.
   * </pre>
   *
   * Protobuf type {@code anduril.tasks.v2.AreaConstraints}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.tasks.v2.AreaConstraints)
      com.anduril.tasks.v2.AreaConstraintsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.tasks.v2.CommonPubProto.internal_static_anduril_tasks_v2_AreaConstraints_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.tasks.v2.CommonPubProto.internal_static_anduril_tasks_v2_AreaConstraints_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.tasks.v2.AreaConstraints.class, com.anduril.tasks.v2.AreaConstraints.Builder.class);
    }

    // Construct using com.anduril.tasks.v2.AreaConstraints.newBuilder()
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
        getAltitudeConstraintFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      altitudeConstraint_ = null;
      if (altitudeConstraintBuilder_ != null) {
        altitudeConstraintBuilder_.dispose();
        altitudeConstraintBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.tasks.v2.CommonPubProto.internal_static_anduril_tasks_v2_AreaConstraints_descriptor;
    }

    @java.lang.Override
    public com.anduril.tasks.v2.AreaConstraints getDefaultInstanceForType() {
      return com.anduril.tasks.v2.AreaConstraints.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.tasks.v2.AreaConstraints build() {
      com.anduril.tasks.v2.AreaConstraints result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.tasks.v2.AreaConstraints buildPartial() {
      com.anduril.tasks.v2.AreaConstraints result = new com.anduril.tasks.v2.AreaConstraints(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.tasks.v2.AreaConstraints result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.altitudeConstraint_ = altitudeConstraintBuilder_ == null
            ? altitudeConstraint_
            : altitudeConstraintBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.tasks.v2.AreaConstraints) {
        return mergeFrom((com.anduril.tasks.v2.AreaConstraints)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.tasks.v2.AreaConstraints other) {
      if (other == com.anduril.tasks.v2.AreaConstraints.getDefaultInstance()) return this;
      if (other.hasAltitudeConstraint()) {
        mergeAltitudeConstraint(other.getAltitudeConstraint());
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
                  getAltitudeConstraintFieldBuilder().getBuilder(),
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

    private com.anduril.tasks.v2.AltitudeConstraint altitudeConstraint_;
    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.tasks.v2.AltitudeConstraint, com.anduril.tasks.v2.AltitudeConstraint.Builder, com.anduril.tasks.v2.AltitudeConstraintOrBuilder> altitudeConstraintBuilder_;
    /**
     * <code>.anduril.tasks.v2.AltitudeConstraint altitude_constraint = 1 [json_name = "altitudeConstraint"];</code>
     * @return Whether the altitudeConstraint field is set.
     */
    public boolean hasAltitudeConstraint() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.anduril.tasks.v2.AltitudeConstraint altitude_constraint = 1 [json_name = "altitudeConstraint"];</code>
     * @return The altitudeConstraint.
     */
    public com.anduril.tasks.v2.AltitudeConstraint getAltitudeConstraint() {
      if (altitudeConstraintBuilder_ == null) {
        return altitudeConstraint_ == null ? com.anduril.tasks.v2.AltitudeConstraint.getDefaultInstance() : altitudeConstraint_;
      } else {
        return altitudeConstraintBuilder_.getMessage();
      }
    }
    /**
     * <code>.anduril.tasks.v2.AltitudeConstraint altitude_constraint = 1 [json_name = "altitudeConstraint"];</code>
     */
    public Builder setAltitudeConstraint(com.anduril.tasks.v2.AltitudeConstraint value) {
      if (altitudeConstraintBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        altitudeConstraint_ = value;
      } else {
        altitudeConstraintBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.AltitudeConstraint altitude_constraint = 1 [json_name = "altitudeConstraint"];</code>
     */
    public Builder setAltitudeConstraint(
        com.anduril.tasks.v2.AltitudeConstraint.Builder builderForValue) {
      if (altitudeConstraintBuilder_ == null) {
        altitudeConstraint_ = builderForValue.build();
      } else {
        altitudeConstraintBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.AltitudeConstraint altitude_constraint = 1 [json_name = "altitudeConstraint"];</code>
     */
    public Builder mergeAltitudeConstraint(com.anduril.tasks.v2.AltitudeConstraint value) {
      if (altitudeConstraintBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          altitudeConstraint_ != null &&
          altitudeConstraint_ != com.anduril.tasks.v2.AltitudeConstraint.getDefaultInstance()) {
          getAltitudeConstraintBuilder().mergeFrom(value);
        } else {
          altitudeConstraint_ = value;
        }
      } else {
        altitudeConstraintBuilder_.mergeFrom(value);
      }
      if (altitudeConstraint_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.AltitudeConstraint altitude_constraint = 1 [json_name = "altitudeConstraint"];</code>
     */
    public Builder clearAltitudeConstraint() {
      bitField0_ = (bitField0_ & ~0x00000001);
      altitudeConstraint_ = null;
      if (altitudeConstraintBuilder_ != null) {
        altitudeConstraintBuilder_.dispose();
        altitudeConstraintBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.AltitudeConstraint altitude_constraint = 1 [json_name = "altitudeConstraint"];</code>
     */
    public com.anduril.tasks.v2.AltitudeConstraint.Builder getAltitudeConstraintBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAltitudeConstraintFieldBuilder().getBuilder();
    }
    /**
     * <code>.anduril.tasks.v2.AltitudeConstraint altitude_constraint = 1 [json_name = "altitudeConstraint"];</code>
     */
    public com.anduril.tasks.v2.AltitudeConstraintOrBuilder getAltitudeConstraintOrBuilder() {
      if (altitudeConstraintBuilder_ != null) {
        return altitudeConstraintBuilder_.getMessageOrBuilder();
      } else {
        return altitudeConstraint_ == null ?
            com.anduril.tasks.v2.AltitudeConstraint.getDefaultInstance() : altitudeConstraint_;
      }
    }
    /**
     * <code>.anduril.tasks.v2.AltitudeConstraint altitude_constraint = 1 [json_name = "altitudeConstraint"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.tasks.v2.AltitudeConstraint, com.anduril.tasks.v2.AltitudeConstraint.Builder, com.anduril.tasks.v2.AltitudeConstraintOrBuilder> 
        getAltitudeConstraintFieldBuilder() {
      if (altitudeConstraintBuilder_ == null) {
        altitudeConstraintBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.anduril.tasks.v2.AltitudeConstraint, com.anduril.tasks.v2.AltitudeConstraint.Builder, com.anduril.tasks.v2.AltitudeConstraintOrBuilder>(
                getAltitudeConstraint(),
                getParentForChildren(),
                isClean());
        altitudeConstraint_ = null;
      }
      return altitudeConstraintBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:anduril.tasks.v2.AreaConstraints)
  }

  // @@protoc_insertion_point(class_scope:anduril.tasks.v2.AreaConstraints)
  private static final com.anduril.tasks.v2.AreaConstraints DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.tasks.v2.AreaConstraints();
  }

  public static com.anduril.tasks.v2.AreaConstraints getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AreaConstraints>
      PARSER = new com.google.protobuf.AbstractParser<AreaConstraints>() {
    @java.lang.Override
    public AreaConstraints parsePartialFrom(
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

  public static com.google.protobuf.Parser<AreaConstraints> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AreaConstraints> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.tasks.v2.AreaConstraints getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

