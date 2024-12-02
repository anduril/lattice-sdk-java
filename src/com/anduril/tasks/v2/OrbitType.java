// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/shared/isr.pub.proto

package com.anduril.tasks.v2;

/**
 * Protobuf type {@code anduril.tasks.v2.OrbitType}
 */
public final class OrbitType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.tasks.v2.OrbitType)
    OrbitTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrbitType.newBuilder() to construct.
  private OrbitType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrbitType() {
    direction_ = 0;
    pattern_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OrbitType();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_OrbitType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_OrbitType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.tasks.v2.OrbitType.class, com.anduril.tasks.v2.OrbitType.Builder.class);
  }

  public static final int DIRECTION_FIELD_NUMBER = 1;
  private int direction_ = 0;
  /**
   * <pre>
   * Indicates the direction in which to perform the loiter.
   * </pre>
   *
   * <code>.anduril.tasks.v2.OrbitDirection direction = 1 [json_name = "direction"];</code>
   * @return The enum numeric value on the wire for direction.
   */
  @java.lang.Override public int getDirectionValue() {
    return direction_;
  }
  /**
   * <pre>
   * Indicates the direction in which to perform the loiter.
   * </pre>
   *
   * <code>.anduril.tasks.v2.OrbitDirection direction = 1 [json_name = "direction"];</code>
   * @return The direction.
   */
  @java.lang.Override public com.anduril.tasks.v2.OrbitDirection getDirection() {
    com.anduril.tasks.v2.OrbitDirection result = com.anduril.tasks.v2.OrbitDirection.forNumber(direction_);
    return result == null ? com.anduril.tasks.v2.OrbitDirection.UNRECOGNIZED : result;
  }

  public static final int PATTERN_FIELD_NUMBER = 2;
  private int pattern_ = 0;
  /**
   * <pre>
   * Indicates the loiter pattern to perform.
   * </pre>
   *
   * <code>.anduril.tasks.v2.OrbitPattern pattern = 2 [json_name = "pattern"];</code>
   * @return The enum numeric value on the wire for pattern.
   */
  @java.lang.Override public int getPatternValue() {
    return pattern_;
  }
  /**
   * <pre>
   * Indicates the loiter pattern to perform.
   * </pre>
   *
   * <code>.anduril.tasks.v2.OrbitPattern pattern = 2 [json_name = "pattern"];</code>
   * @return The pattern.
   */
  @java.lang.Override public com.anduril.tasks.v2.OrbitPattern getPattern() {
    com.anduril.tasks.v2.OrbitPattern result = com.anduril.tasks.v2.OrbitPattern.forNumber(pattern_);
    return result == null ? com.anduril.tasks.v2.OrbitPattern.UNRECOGNIZED : result;
  }

  public static final int DURATION_FIELD_NUMBER = 3;
  private com.anduril.tasks.v2.OrbitDuration duration_;
  /**
   * <pre>
   * Indicates the amount of time to be spent in loiter.
   * </pre>
   *
   * <code>.anduril.tasks.v2.OrbitDuration duration = 3 [json_name = "duration"];</code>
   * @return Whether the duration field is set.
   */
  @java.lang.Override
  public boolean hasDuration() {
    return duration_ != null;
  }
  /**
   * <pre>
   * Indicates the amount of time to be spent in loiter.
   * </pre>
   *
   * <code>.anduril.tasks.v2.OrbitDuration duration = 3 [json_name = "duration"];</code>
   * @return The duration.
   */
  @java.lang.Override
  public com.anduril.tasks.v2.OrbitDuration getDuration() {
    return duration_ == null ? com.anduril.tasks.v2.OrbitDuration.getDefaultInstance() : duration_;
  }
  /**
   * <pre>
   * Indicates the amount of time to be spent in loiter.
   * </pre>
   *
   * <code>.anduril.tasks.v2.OrbitDuration duration = 3 [json_name = "duration"];</code>
   */
  @java.lang.Override
  public com.anduril.tasks.v2.OrbitDurationOrBuilder getDurationOrBuilder() {
    return duration_ == null ? com.anduril.tasks.v2.OrbitDuration.getDefaultInstance() : duration_;
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
    if (direction_ != com.anduril.tasks.v2.OrbitDirection.ORBIT_DIRECTION_DIRECTION_INVALID.getNumber()) {
      output.writeEnum(1, direction_);
    }
    if (pattern_ != com.anduril.tasks.v2.OrbitPattern.ORBIT_PATTERN_INVALID.getNumber()) {
      output.writeEnum(2, pattern_);
    }
    if (duration_ != null) {
      output.writeMessage(3, getDuration());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (direction_ != com.anduril.tasks.v2.OrbitDirection.ORBIT_DIRECTION_DIRECTION_INVALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, direction_);
    }
    if (pattern_ != com.anduril.tasks.v2.OrbitPattern.ORBIT_PATTERN_INVALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, pattern_);
    }
    if (duration_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDuration());
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
    if (!(obj instanceof com.anduril.tasks.v2.OrbitType)) {
      return super.equals(obj);
    }
    com.anduril.tasks.v2.OrbitType other = (com.anduril.tasks.v2.OrbitType) obj;

    if (direction_ != other.direction_) return false;
    if (pattern_ != other.pattern_) return false;
    if (hasDuration() != other.hasDuration()) return false;
    if (hasDuration()) {
      if (!getDuration()
          .equals(other.getDuration())) return false;
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
    hash = (37 * hash) + DIRECTION_FIELD_NUMBER;
    hash = (53 * hash) + direction_;
    hash = (37 * hash) + PATTERN_FIELD_NUMBER;
    hash = (53 * hash) + pattern_;
    if (hasDuration()) {
      hash = (37 * hash) + DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getDuration().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.tasks.v2.OrbitType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.OrbitType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.OrbitType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.OrbitType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.OrbitType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.OrbitType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.OrbitType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.OrbitType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.tasks.v2.OrbitType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.OrbitType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.tasks.v2.OrbitType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.OrbitType parseFrom(
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
  public static Builder newBuilder(com.anduril.tasks.v2.OrbitType prototype) {
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
   * Protobuf type {@code anduril.tasks.v2.OrbitType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.tasks.v2.OrbitType)
      com.anduril.tasks.v2.OrbitTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_OrbitType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_OrbitType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.tasks.v2.OrbitType.class, com.anduril.tasks.v2.OrbitType.Builder.class);
    }

    // Construct using com.anduril.tasks.v2.OrbitType.newBuilder()
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
      direction_ = 0;
      pattern_ = 0;
      duration_ = null;
      if (durationBuilder_ != null) {
        durationBuilder_.dispose();
        durationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_OrbitType_descriptor;
    }

    @java.lang.Override
    public com.anduril.tasks.v2.OrbitType getDefaultInstanceForType() {
      return com.anduril.tasks.v2.OrbitType.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.tasks.v2.OrbitType build() {
      com.anduril.tasks.v2.OrbitType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.tasks.v2.OrbitType buildPartial() {
      com.anduril.tasks.v2.OrbitType result = new com.anduril.tasks.v2.OrbitType(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.tasks.v2.OrbitType result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.direction_ = direction_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pattern_ = pattern_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.duration_ = durationBuilder_ == null
            ? duration_
            : durationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.tasks.v2.OrbitType) {
        return mergeFrom((com.anduril.tasks.v2.OrbitType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.tasks.v2.OrbitType other) {
      if (other == com.anduril.tasks.v2.OrbitType.getDefaultInstance()) return this;
      if (other.direction_ != 0) {
        setDirectionValue(other.getDirectionValue());
      }
      if (other.pattern_ != 0) {
        setPatternValue(other.getPatternValue());
      }
      if (other.hasDuration()) {
        mergeDuration(other.getDuration());
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
            case 8: {
              direction_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              pattern_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getDurationFieldBuilder().getBuilder(),
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

    private int direction_ = 0;
    /**
     * <pre>
     * Indicates the direction in which to perform the loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.OrbitDirection direction = 1 [json_name = "direction"];</code>
     * @return The enum numeric value on the wire for direction.
     */
    @java.lang.Override public int getDirectionValue() {
      return direction_;
    }
    /**
     * <pre>
     * Indicates the direction in which to perform the loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.OrbitDirection direction = 1 [json_name = "direction"];</code>
     * @param value The enum numeric value on the wire for direction to set.
     * @return This builder for chaining.
     */
    public Builder setDirectionValue(int value) {
      direction_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates the direction in which to perform the loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.OrbitDirection direction = 1 [json_name = "direction"];</code>
     * @return The direction.
     */
    @java.lang.Override
    public com.anduril.tasks.v2.OrbitDirection getDirection() {
      com.anduril.tasks.v2.OrbitDirection result = com.anduril.tasks.v2.OrbitDirection.forNumber(direction_);
      return result == null ? com.anduril.tasks.v2.OrbitDirection.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Indicates the direction in which to perform the loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.OrbitDirection direction = 1 [json_name = "direction"];</code>
     * @param value The direction to set.
     * @return This builder for chaining.
     */
    public Builder setDirection(com.anduril.tasks.v2.OrbitDirection value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      direction_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates the direction in which to perform the loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.OrbitDirection direction = 1 [json_name = "direction"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDirection() {
      bitField0_ = (bitField0_ & ~0x00000001);
      direction_ = 0;
      onChanged();
      return this;
    }

    private int pattern_ = 0;
    /**
     * <pre>
     * Indicates the loiter pattern to perform.
     * </pre>
     *
     * <code>.anduril.tasks.v2.OrbitPattern pattern = 2 [json_name = "pattern"];</code>
     * @return The enum numeric value on the wire for pattern.
     */
    @java.lang.Override public int getPatternValue() {
      return pattern_;
    }
    /**
     * <pre>
     * Indicates the loiter pattern to perform.
     * </pre>
     *
     * <code>.anduril.tasks.v2.OrbitPattern pattern = 2 [json_name = "pattern"];</code>
     * @param value The enum numeric value on the wire for pattern to set.
     * @return This builder for chaining.
     */
    public Builder setPatternValue(int value) {
      pattern_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates the loiter pattern to perform.
     * </pre>
     *
     * <code>.anduril.tasks.v2.OrbitPattern pattern = 2 [json_name = "pattern"];</code>
     * @return The pattern.
     */
    @java.lang.Override
    public com.anduril.tasks.v2.OrbitPattern getPattern() {
      com.anduril.tasks.v2.OrbitPattern result = com.anduril.tasks.v2.OrbitPattern.forNumber(pattern_);
      return result == null ? com.anduril.tasks.v2.OrbitPattern.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Indicates the loiter pattern to perform.
     * </pre>
     *
     * <code>.anduril.tasks.v2.OrbitPattern pattern = 2 [json_name = "pattern"];</code>
     * @param value The pattern to set.
     * @return This builder for chaining.
     */
    public Builder setPattern(com.anduril.tasks.v2.OrbitPattern value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      pattern_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates the loiter pattern to perform.
     * </pre>
     *
     * <code>.anduril.tasks.v2.OrbitPattern pattern = 2 [json_name = "pattern"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPattern() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pattern_ = 0;
      onChanged();
      return this;
    }

    private com.anduril.tasks.v2.OrbitDuration duration_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.tasks.v2.OrbitDuration, com.anduril.tasks.v2.OrbitDuration.Builder, com.anduril.tasks.v2.OrbitDurationOrBuilder> durationBuilder_;
    /**
     * <pre>
     * Indicates the amount of time to be spent in loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.OrbitDuration duration = 3 [json_name = "duration"];</code>
     * @return Whether the duration field is set.
     */
    public boolean hasDuration() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Indicates the amount of time to be spent in loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.OrbitDuration duration = 3 [json_name = "duration"];</code>
     * @return The duration.
     */
    public com.anduril.tasks.v2.OrbitDuration getDuration() {
      if (durationBuilder_ == null) {
        return duration_ == null ? com.anduril.tasks.v2.OrbitDuration.getDefaultInstance() : duration_;
      } else {
        return durationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Indicates the amount of time to be spent in loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.OrbitDuration duration = 3 [json_name = "duration"];</code>
     */
    public Builder setDuration(com.anduril.tasks.v2.OrbitDuration value) {
      if (durationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        duration_ = value;
      } else {
        durationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates the amount of time to be spent in loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.OrbitDuration duration = 3 [json_name = "duration"];</code>
     */
    public Builder setDuration(
        com.anduril.tasks.v2.OrbitDuration.Builder builderForValue) {
      if (durationBuilder_ == null) {
        duration_ = builderForValue.build();
      } else {
        durationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates the amount of time to be spent in loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.OrbitDuration duration = 3 [json_name = "duration"];</code>
     */
    public Builder mergeDuration(com.anduril.tasks.v2.OrbitDuration value) {
      if (durationBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          duration_ != null &&
          duration_ != com.anduril.tasks.v2.OrbitDuration.getDefaultInstance()) {
          getDurationBuilder().mergeFrom(value);
        } else {
          duration_ = value;
        }
      } else {
        durationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates the amount of time to be spent in loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.OrbitDuration duration = 3 [json_name = "duration"];</code>
     */
    public Builder clearDuration() {
      bitField0_ = (bitField0_ & ~0x00000004);
      duration_ = null;
      if (durationBuilder_ != null) {
        durationBuilder_.dispose();
        durationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates the amount of time to be spent in loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.OrbitDuration duration = 3 [json_name = "duration"];</code>
     */
    public com.anduril.tasks.v2.OrbitDuration.Builder getDurationBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getDurationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Indicates the amount of time to be spent in loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.OrbitDuration duration = 3 [json_name = "duration"];</code>
     */
    public com.anduril.tasks.v2.OrbitDurationOrBuilder getDurationOrBuilder() {
      if (durationBuilder_ != null) {
        return durationBuilder_.getMessageOrBuilder();
      } else {
        return duration_ == null ?
            com.anduril.tasks.v2.OrbitDuration.getDefaultInstance() : duration_;
      }
    }
    /**
     * <pre>
     * Indicates the amount of time to be spent in loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.OrbitDuration duration = 3 [json_name = "duration"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.tasks.v2.OrbitDuration, com.anduril.tasks.v2.OrbitDuration.Builder, com.anduril.tasks.v2.OrbitDurationOrBuilder> 
        getDurationFieldBuilder() {
      if (durationBuilder_ == null) {
        durationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.tasks.v2.OrbitDuration, com.anduril.tasks.v2.OrbitDuration.Builder, com.anduril.tasks.v2.OrbitDurationOrBuilder>(
                getDuration(),
                getParentForChildren(),
                isClean());
        duration_ = null;
      }
      return durationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.tasks.v2.OrbitType)
  }

  // @@protoc_insertion_point(class_scope:anduril.tasks.v2.OrbitType)
  private static final com.anduril.tasks.v2.OrbitType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.tasks.v2.OrbitType();
  }

  public static com.anduril.tasks.v2.OrbitType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrbitType>
      PARSER = new com.google.protobuf.AbstractParser<OrbitType>() {
    @java.lang.Override
    public OrbitType parsePartialFrom(
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

  public static com.google.protobuf.Parser<OrbitType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrbitType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.tasks.v2.OrbitType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
