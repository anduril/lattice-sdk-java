// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/shared/strike.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.tasks.v2;

/**
 * <pre>
 * Maps to UCI StrikeTaskReleaseConstraintsType.
 * </pre>
 *
 * Protobuf type {@code anduril.tasks.v2.StrikeReleaseConstraint}
 */
public final class StrikeReleaseConstraint extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.tasks.v2.StrikeReleaseConstraint)
    StrikeReleaseConstraintOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StrikeReleaseConstraint.newBuilder() to construct.
  private StrikeReleaseConstraint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StrikeReleaseConstraint() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StrikeReleaseConstraint();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.tasks.v2.StrikePubProto.internal_static_anduril_tasks_v2_StrikeReleaseConstraint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.tasks.v2.StrikePubProto.internal_static_anduril_tasks_v2_StrikeReleaseConstraint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.tasks.v2.StrikeReleaseConstraint.class, com.anduril.tasks.v2.StrikeReleaseConstraint.Builder.class);
  }

  private int strikeReleaseConstraintCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object strikeReleaseConstraint_;
  public enum StrikeReleaseConstraintCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    RELEASE_AREA(1),
    STRIKERELEASECONSTRAINT_NOT_SET(0);
    private final int value;
    private StrikeReleaseConstraintCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static StrikeReleaseConstraintCase valueOf(int value) {
      return forNumber(value);
    }

    public static StrikeReleaseConstraintCase forNumber(int value) {
      switch (value) {
        case 1: return RELEASE_AREA;
        case 0: return STRIKERELEASECONSTRAINT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public StrikeReleaseConstraintCase
  getStrikeReleaseConstraintCase() {
    return StrikeReleaseConstraintCase.forNumber(
        strikeReleaseConstraintCase_);
  }

  public static final int RELEASE_AREA_FIELD_NUMBER = 1;
  /**
   * <code>.anduril.tasks.v2.AreaConstraints release_area = 1 [json_name = "releaseArea"];</code>
   * @return Whether the releaseArea field is set.
   */
  @java.lang.Override
  public boolean hasReleaseArea() {
    return strikeReleaseConstraintCase_ == 1;
  }
  /**
   * <code>.anduril.tasks.v2.AreaConstraints release_area = 1 [json_name = "releaseArea"];</code>
   * @return The releaseArea.
   */
  @java.lang.Override
  public com.anduril.tasks.v2.AreaConstraints getReleaseArea() {
    if (strikeReleaseConstraintCase_ == 1) {
       return (com.anduril.tasks.v2.AreaConstraints) strikeReleaseConstraint_;
    }
    return com.anduril.tasks.v2.AreaConstraints.getDefaultInstance();
  }
  /**
   * <code>.anduril.tasks.v2.AreaConstraints release_area = 1 [json_name = "releaseArea"];</code>
   */
  @java.lang.Override
  public com.anduril.tasks.v2.AreaConstraintsOrBuilder getReleaseAreaOrBuilder() {
    if (strikeReleaseConstraintCase_ == 1) {
       return (com.anduril.tasks.v2.AreaConstraints) strikeReleaseConstraint_;
    }
    return com.anduril.tasks.v2.AreaConstraints.getDefaultInstance();
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
    if (strikeReleaseConstraintCase_ == 1) {
      output.writeMessage(1, (com.anduril.tasks.v2.AreaConstraints) strikeReleaseConstraint_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (strikeReleaseConstraintCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.anduril.tasks.v2.AreaConstraints) strikeReleaseConstraint_);
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
    if (!(obj instanceof com.anduril.tasks.v2.StrikeReleaseConstraint)) {
      return super.equals(obj);
    }
    com.anduril.tasks.v2.StrikeReleaseConstraint other = (com.anduril.tasks.v2.StrikeReleaseConstraint) obj;

    if (!getStrikeReleaseConstraintCase().equals(other.getStrikeReleaseConstraintCase())) return false;
    switch (strikeReleaseConstraintCase_) {
      case 1:
        if (!getReleaseArea()
            .equals(other.getReleaseArea())) return false;
        break;
      case 0:
      default:
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
    switch (strikeReleaseConstraintCase_) {
      case 1:
        hash = (37 * hash) + RELEASE_AREA_FIELD_NUMBER;
        hash = (53 * hash) + getReleaseArea().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.tasks.v2.StrikeReleaseConstraint parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.StrikeReleaseConstraint parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.StrikeReleaseConstraint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.StrikeReleaseConstraint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.StrikeReleaseConstraint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.StrikeReleaseConstraint parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.StrikeReleaseConstraint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.StrikeReleaseConstraint parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.tasks.v2.StrikeReleaseConstraint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.tasks.v2.StrikeReleaseConstraint parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.tasks.v2.StrikeReleaseConstraint parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.StrikeReleaseConstraint parseFrom(
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
  public static Builder newBuilder(com.anduril.tasks.v2.StrikeReleaseConstraint prototype) {
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
   * Maps to UCI StrikeTaskReleaseConstraintsType.
   * </pre>
   *
   * Protobuf type {@code anduril.tasks.v2.StrikeReleaseConstraint}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.tasks.v2.StrikeReleaseConstraint)
      com.anduril.tasks.v2.StrikeReleaseConstraintOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.tasks.v2.StrikePubProto.internal_static_anduril_tasks_v2_StrikeReleaseConstraint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.tasks.v2.StrikePubProto.internal_static_anduril_tasks_v2_StrikeReleaseConstraint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.tasks.v2.StrikeReleaseConstraint.class, com.anduril.tasks.v2.StrikeReleaseConstraint.Builder.class);
    }

    // Construct using com.anduril.tasks.v2.StrikeReleaseConstraint.newBuilder()
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
      if (releaseAreaBuilder_ != null) {
        releaseAreaBuilder_.clear();
      }
      strikeReleaseConstraintCase_ = 0;
      strikeReleaseConstraint_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.tasks.v2.StrikePubProto.internal_static_anduril_tasks_v2_StrikeReleaseConstraint_descriptor;
    }

    @java.lang.Override
    public com.anduril.tasks.v2.StrikeReleaseConstraint getDefaultInstanceForType() {
      return com.anduril.tasks.v2.StrikeReleaseConstraint.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.tasks.v2.StrikeReleaseConstraint build() {
      com.anduril.tasks.v2.StrikeReleaseConstraint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.tasks.v2.StrikeReleaseConstraint buildPartial() {
      com.anduril.tasks.v2.StrikeReleaseConstraint result = new com.anduril.tasks.v2.StrikeReleaseConstraint(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.tasks.v2.StrikeReleaseConstraint result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.anduril.tasks.v2.StrikeReleaseConstraint result) {
      result.strikeReleaseConstraintCase_ = strikeReleaseConstraintCase_;
      result.strikeReleaseConstraint_ = this.strikeReleaseConstraint_;
      if (strikeReleaseConstraintCase_ == 1 &&
          releaseAreaBuilder_ != null) {
        result.strikeReleaseConstraint_ = releaseAreaBuilder_.build();
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
      if (other instanceof com.anduril.tasks.v2.StrikeReleaseConstraint) {
        return mergeFrom((com.anduril.tasks.v2.StrikeReleaseConstraint)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.tasks.v2.StrikeReleaseConstraint other) {
      if (other == com.anduril.tasks.v2.StrikeReleaseConstraint.getDefaultInstance()) return this;
      switch (other.getStrikeReleaseConstraintCase()) {
        case RELEASE_AREA: {
          mergeReleaseArea(other.getReleaseArea());
          break;
        }
        case STRIKERELEASECONSTRAINT_NOT_SET: {
          break;
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
              input.readMessage(
                  getReleaseAreaFieldBuilder().getBuilder(),
                  extensionRegistry);
              strikeReleaseConstraintCase_ = 1;
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
    private int strikeReleaseConstraintCase_ = 0;
    private java.lang.Object strikeReleaseConstraint_;
    public StrikeReleaseConstraintCase
        getStrikeReleaseConstraintCase() {
      return StrikeReleaseConstraintCase.forNumber(
          strikeReleaseConstraintCase_);
    }

    public Builder clearStrikeReleaseConstraint() {
      strikeReleaseConstraintCase_ = 0;
      strikeReleaseConstraint_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.tasks.v2.AreaConstraints, com.anduril.tasks.v2.AreaConstraints.Builder, com.anduril.tasks.v2.AreaConstraintsOrBuilder> releaseAreaBuilder_;
    /**
     * <code>.anduril.tasks.v2.AreaConstraints release_area = 1 [json_name = "releaseArea"];</code>
     * @return Whether the releaseArea field is set.
     */
    @java.lang.Override
    public boolean hasReleaseArea() {
      return strikeReleaseConstraintCase_ == 1;
    }
    /**
     * <code>.anduril.tasks.v2.AreaConstraints release_area = 1 [json_name = "releaseArea"];</code>
     * @return The releaseArea.
     */
    @java.lang.Override
    public com.anduril.tasks.v2.AreaConstraints getReleaseArea() {
      if (releaseAreaBuilder_ == null) {
        if (strikeReleaseConstraintCase_ == 1) {
          return (com.anduril.tasks.v2.AreaConstraints) strikeReleaseConstraint_;
        }
        return com.anduril.tasks.v2.AreaConstraints.getDefaultInstance();
      } else {
        if (strikeReleaseConstraintCase_ == 1) {
          return releaseAreaBuilder_.getMessage();
        }
        return com.anduril.tasks.v2.AreaConstraints.getDefaultInstance();
      }
    }
    /**
     * <code>.anduril.tasks.v2.AreaConstraints release_area = 1 [json_name = "releaseArea"];</code>
     */
    public Builder setReleaseArea(com.anduril.tasks.v2.AreaConstraints value) {
      if (releaseAreaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        strikeReleaseConstraint_ = value;
        onChanged();
      } else {
        releaseAreaBuilder_.setMessage(value);
      }
      strikeReleaseConstraintCase_ = 1;
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.AreaConstraints release_area = 1 [json_name = "releaseArea"];</code>
     */
    public Builder setReleaseArea(
        com.anduril.tasks.v2.AreaConstraints.Builder builderForValue) {
      if (releaseAreaBuilder_ == null) {
        strikeReleaseConstraint_ = builderForValue.build();
        onChanged();
      } else {
        releaseAreaBuilder_.setMessage(builderForValue.build());
      }
      strikeReleaseConstraintCase_ = 1;
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.AreaConstraints release_area = 1 [json_name = "releaseArea"];</code>
     */
    public Builder mergeReleaseArea(com.anduril.tasks.v2.AreaConstraints value) {
      if (releaseAreaBuilder_ == null) {
        if (strikeReleaseConstraintCase_ == 1 &&
            strikeReleaseConstraint_ != com.anduril.tasks.v2.AreaConstraints.getDefaultInstance()) {
          strikeReleaseConstraint_ = com.anduril.tasks.v2.AreaConstraints.newBuilder((com.anduril.tasks.v2.AreaConstraints) strikeReleaseConstraint_)
              .mergeFrom(value).buildPartial();
        } else {
          strikeReleaseConstraint_ = value;
        }
        onChanged();
      } else {
        if (strikeReleaseConstraintCase_ == 1) {
          releaseAreaBuilder_.mergeFrom(value);
        } else {
          releaseAreaBuilder_.setMessage(value);
        }
      }
      strikeReleaseConstraintCase_ = 1;
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.AreaConstraints release_area = 1 [json_name = "releaseArea"];</code>
     */
    public Builder clearReleaseArea() {
      if (releaseAreaBuilder_ == null) {
        if (strikeReleaseConstraintCase_ == 1) {
          strikeReleaseConstraintCase_ = 0;
          strikeReleaseConstraint_ = null;
          onChanged();
        }
      } else {
        if (strikeReleaseConstraintCase_ == 1) {
          strikeReleaseConstraintCase_ = 0;
          strikeReleaseConstraint_ = null;
        }
        releaseAreaBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.AreaConstraints release_area = 1 [json_name = "releaseArea"];</code>
     */
    public com.anduril.tasks.v2.AreaConstraints.Builder getReleaseAreaBuilder() {
      return getReleaseAreaFieldBuilder().getBuilder();
    }
    /**
     * <code>.anduril.tasks.v2.AreaConstraints release_area = 1 [json_name = "releaseArea"];</code>
     */
    @java.lang.Override
    public com.anduril.tasks.v2.AreaConstraintsOrBuilder getReleaseAreaOrBuilder() {
      if ((strikeReleaseConstraintCase_ == 1) && (releaseAreaBuilder_ != null)) {
        return releaseAreaBuilder_.getMessageOrBuilder();
      } else {
        if (strikeReleaseConstraintCase_ == 1) {
          return (com.anduril.tasks.v2.AreaConstraints) strikeReleaseConstraint_;
        }
        return com.anduril.tasks.v2.AreaConstraints.getDefaultInstance();
      }
    }
    /**
     * <code>.anduril.tasks.v2.AreaConstraints release_area = 1 [json_name = "releaseArea"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.tasks.v2.AreaConstraints, com.anduril.tasks.v2.AreaConstraints.Builder, com.anduril.tasks.v2.AreaConstraintsOrBuilder> 
        getReleaseAreaFieldBuilder() {
      if (releaseAreaBuilder_ == null) {
        if (!(strikeReleaseConstraintCase_ == 1)) {
          strikeReleaseConstraint_ = com.anduril.tasks.v2.AreaConstraints.getDefaultInstance();
        }
        releaseAreaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.tasks.v2.AreaConstraints, com.anduril.tasks.v2.AreaConstraints.Builder, com.anduril.tasks.v2.AreaConstraintsOrBuilder>(
                (com.anduril.tasks.v2.AreaConstraints) strikeReleaseConstraint_,
                getParentForChildren(),
                isClean());
        strikeReleaseConstraint_ = null;
      }
      strikeReleaseConstraintCase_ = 1;
      onChanged();
      return releaseAreaBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.tasks.v2.StrikeReleaseConstraint)
  }

  // @@protoc_insertion_point(class_scope:anduril.tasks.v2.StrikeReleaseConstraint)
  private static final com.anduril.tasks.v2.StrikeReleaseConstraint DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.tasks.v2.StrikeReleaseConstraint();
  }

  public static com.anduril.tasks.v2.StrikeReleaseConstraint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StrikeReleaseConstraint>
      PARSER = new com.google.protobuf.AbstractParser<StrikeReleaseConstraint>() {
    @java.lang.Override
    public StrikeReleaseConstraint parsePartialFrom(
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

  public static com.google.protobuf.Parser<StrikeReleaseConstraint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StrikeReleaseConstraint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.tasks.v2.StrikeReleaseConstraint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

