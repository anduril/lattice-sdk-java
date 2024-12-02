// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/signal.pub.proto

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * A component to represent a frequency range.
 * </pre>
 *
 * Protobuf type {@code anduril.entitymanager.v1.FrequencyRange}
 */
public final class FrequencyRange extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.FrequencyRange)
    FrequencyRangeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FrequencyRange.newBuilder() to construct.
  private FrequencyRange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FrequencyRange() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FrequencyRange();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.SignalPubProto.internal_static_anduril_entitymanager_v1_FrequencyRange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.SignalPubProto.internal_static_anduril_entitymanager_v1_FrequencyRange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.FrequencyRange.class, com.anduril.entitymanager.v1.FrequencyRange.Builder.class);
  }

  public static final int MINIMUM_FREQUENCY_HZ_FIELD_NUMBER = 1;
  private com.anduril.entitymanager.v1.Frequency minimumFrequencyHz_;
  /**
   * <pre>
   * Indicates the lowest measured frequency of a signal (Hz).
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Frequency minimum_frequency_hz = 1 [json_name = "minimumFrequencyHz"];</code>
   * @return Whether the minimumFrequencyHz field is set.
   */
  @java.lang.Override
  public boolean hasMinimumFrequencyHz() {
    return minimumFrequencyHz_ != null;
  }
  /**
   * <pre>
   * Indicates the lowest measured frequency of a signal (Hz).
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Frequency minimum_frequency_hz = 1 [json_name = "minimumFrequencyHz"];</code>
   * @return The minimumFrequencyHz.
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.Frequency getMinimumFrequencyHz() {
    return minimumFrequencyHz_ == null ? com.anduril.entitymanager.v1.Frequency.getDefaultInstance() : minimumFrequencyHz_;
  }
  /**
   * <pre>
   * Indicates the lowest measured frequency of a signal (Hz).
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Frequency minimum_frequency_hz = 1 [json_name = "minimumFrequencyHz"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.FrequencyOrBuilder getMinimumFrequencyHzOrBuilder() {
    return minimumFrequencyHz_ == null ? com.anduril.entitymanager.v1.Frequency.getDefaultInstance() : minimumFrequencyHz_;
  }

  public static final int MAXIMUM_FREQUENCY_HZ_FIELD_NUMBER = 2;
  private com.anduril.entitymanager.v1.Frequency maximumFrequencyHz_;
  /**
   * <pre>
   * Indicates the maximum measured frequency of a signal (Hz).
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Frequency maximum_frequency_hz = 2 [json_name = "maximumFrequencyHz"];</code>
   * @return Whether the maximumFrequencyHz field is set.
   */
  @java.lang.Override
  public boolean hasMaximumFrequencyHz() {
    return maximumFrequencyHz_ != null;
  }
  /**
   * <pre>
   * Indicates the maximum measured frequency of a signal (Hz).
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Frequency maximum_frequency_hz = 2 [json_name = "maximumFrequencyHz"];</code>
   * @return The maximumFrequencyHz.
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.Frequency getMaximumFrequencyHz() {
    return maximumFrequencyHz_ == null ? com.anduril.entitymanager.v1.Frequency.getDefaultInstance() : maximumFrequencyHz_;
  }
  /**
   * <pre>
   * Indicates the maximum measured frequency of a signal (Hz).
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Frequency maximum_frequency_hz = 2 [json_name = "maximumFrequencyHz"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.FrequencyOrBuilder getMaximumFrequencyHzOrBuilder() {
    return maximumFrequencyHz_ == null ? com.anduril.entitymanager.v1.Frequency.getDefaultInstance() : maximumFrequencyHz_;
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
    if (minimumFrequencyHz_ != null) {
      output.writeMessage(1, getMinimumFrequencyHz());
    }
    if (maximumFrequencyHz_ != null) {
      output.writeMessage(2, getMaximumFrequencyHz());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (minimumFrequencyHz_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMinimumFrequencyHz());
    }
    if (maximumFrequencyHz_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMaximumFrequencyHz());
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
    if (!(obj instanceof com.anduril.entitymanager.v1.FrequencyRange)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.FrequencyRange other = (com.anduril.entitymanager.v1.FrequencyRange) obj;

    if (hasMinimumFrequencyHz() != other.hasMinimumFrequencyHz()) return false;
    if (hasMinimumFrequencyHz()) {
      if (!getMinimumFrequencyHz()
          .equals(other.getMinimumFrequencyHz())) return false;
    }
    if (hasMaximumFrequencyHz() != other.hasMaximumFrequencyHz()) return false;
    if (hasMaximumFrequencyHz()) {
      if (!getMaximumFrequencyHz()
          .equals(other.getMaximumFrequencyHz())) return false;
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
    if (hasMinimumFrequencyHz()) {
      hash = (37 * hash) + MINIMUM_FREQUENCY_HZ_FIELD_NUMBER;
      hash = (53 * hash) + getMinimumFrequencyHz().hashCode();
    }
    if (hasMaximumFrequencyHz()) {
      hash = (37 * hash) + MAXIMUM_FREQUENCY_HZ_FIELD_NUMBER;
      hash = (53 * hash) + getMaximumFrequencyHz().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.FrequencyRange parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.FrequencyRange parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.FrequencyRange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.FrequencyRange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.FrequencyRange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.FrequencyRange parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.FrequencyRange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.FrequencyRange parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.FrequencyRange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.FrequencyRange parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.FrequencyRange parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.FrequencyRange parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.FrequencyRange prototype) {
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
   * A component to represent a frequency range.
   * </pre>
   *
   * Protobuf type {@code anduril.entitymanager.v1.FrequencyRange}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.FrequencyRange)
      com.anduril.entitymanager.v1.FrequencyRangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.SignalPubProto.internal_static_anduril_entitymanager_v1_FrequencyRange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.SignalPubProto.internal_static_anduril_entitymanager_v1_FrequencyRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.FrequencyRange.class, com.anduril.entitymanager.v1.FrequencyRange.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.FrequencyRange.newBuilder()
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
      minimumFrequencyHz_ = null;
      if (minimumFrequencyHzBuilder_ != null) {
        minimumFrequencyHzBuilder_.dispose();
        minimumFrequencyHzBuilder_ = null;
      }
      maximumFrequencyHz_ = null;
      if (maximumFrequencyHzBuilder_ != null) {
        maximumFrequencyHzBuilder_.dispose();
        maximumFrequencyHzBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.SignalPubProto.internal_static_anduril_entitymanager_v1_FrequencyRange_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.FrequencyRange getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.FrequencyRange.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.FrequencyRange build() {
      com.anduril.entitymanager.v1.FrequencyRange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.FrequencyRange buildPartial() {
      com.anduril.entitymanager.v1.FrequencyRange result = new com.anduril.entitymanager.v1.FrequencyRange(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.entitymanager.v1.FrequencyRange result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.minimumFrequencyHz_ = minimumFrequencyHzBuilder_ == null
            ? minimumFrequencyHz_
            : minimumFrequencyHzBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maximumFrequencyHz_ = maximumFrequencyHzBuilder_ == null
            ? maximumFrequencyHz_
            : maximumFrequencyHzBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entitymanager.v1.FrequencyRange) {
        return mergeFrom((com.anduril.entitymanager.v1.FrequencyRange)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.FrequencyRange other) {
      if (other == com.anduril.entitymanager.v1.FrequencyRange.getDefaultInstance()) return this;
      if (other.hasMinimumFrequencyHz()) {
        mergeMinimumFrequencyHz(other.getMinimumFrequencyHz());
      }
      if (other.hasMaximumFrequencyHz()) {
        mergeMaximumFrequencyHz(other.getMaximumFrequencyHz());
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
                  getMinimumFrequencyHzFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getMaximumFrequencyHzFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.anduril.entitymanager.v1.Frequency minimumFrequencyHz_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Frequency, com.anduril.entitymanager.v1.Frequency.Builder, com.anduril.entitymanager.v1.FrequencyOrBuilder> minimumFrequencyHzBuilder_;
    /**
     * <pre>
     * Indicates the lowest measured frequency of a signal (Hz).
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Frequency minimum_frequency_hz = 1 [json_name = "minimumFrequencyHz"];</code>
     * @return Whether the minimumFrequencyHz field is set.
     */
    public boolean hasMinimumFrequencyHz() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Indicates the lowest measured frequency of a signal (Hz).
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Frequency minimum_frequency_hz = 1 [json_name = "minimumFrequencyHz"];</code>
     * @return The minimumFrequencyHz.
     */
    public com.anduril.entitymanager.v1.Frequency getMinimumFrequencyHz() {
      if (minimumFrequencyHzBuilder_ == null) {
        return minimumFrequencyHz_ == null ? com.anduril.entitymanager.v1.Frequency.getDefaultInstance() : minimumFrequencyHz_;
      } else {
        return minimumFrequencyHzBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Indicates the lowest measured frequency of a signal (Hz).
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Frequency minimum_frequency_hz = 1 [json_name = "minimumFrequencyHz"];</code>
     */
    public Builder setMinimumFrequencyHz(com.anduril.entitymanager.v1.Frequency value) {
      if (minimumFrequencyHzBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        minimumFrequencyHz_ = value;
      } else {
        minimumFrequencyHzBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates the lowest measured frequency of a signal (Hz).
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Frequency minimum_frequency_hz = 1 [json_name = "minimumFrequencyHz"];</code>
     */
    public Builder setMinimumFrequencyHz(
        com.anduril.entitymanager.v1.Frequency.Builder builderForValue) {
      if (minimumFrequencyHzBuilder_ == null) {
        minimumFrequencyHz_ = builderForValue.build();
      } else {
        minimumFrequencyHzBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates the lowest measured frequency of a signal (Hz).
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Frequency minimum_frequency_hz = 1 [json_name = "minimumFrequencyHz"];</code>
     */
    public Builder mergeMinimumFrequencyHz(com.anduril.entitymanager.v1.Frequency value) {
      if (minimumFrequencyHzBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          minimumFrequencyHz_ != null &&
          minimumFrequencyHz_ != com.anduril.entitymanager.v1.Frequency.getDefaultInstance()) {
          getMinimumFrequencyHzBuilder().mergeFrom(value);
        } else {
          minimumFrequencyHz_ = value;
        }
      } else {
        minimumFrequencyHzBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates the lowest measured frequency of a signal (Hz).
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Frequency minimum_frequency_hz = 1 [json_name = "minimumFrequencyHz"];</code>
     */
    public Builder clearMinimumFrequencyHz() {
      bitField0_ = (bitField0_ & ~0x00000001);
      minimumFrequencyHz_ = null;
      if (minimumFrequencyHzBuilder_ != null) {
        minimumFrequencyHzBuilder_.dispose();
        minimumFrequencyHzBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates the lowest measured frequency of a signal (Hz).
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Frequency minimum_frequency_hz = 1 [json_name = "minimumFrequencyHz"];</code>
     */
    public com.anduril.entitymanager.v1.Frequency.Builder getMinimumFrequencyHzBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMinimumFrequencyHzFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Indicates the lowest measured frequency of a signal (Hz).
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Frequency minimum_frequency_hz = 1 [json_name = "minimumFrequencyHz"];</code>
     */
    public com.anduril.entitymanager.v1.FrequencyOrBuilder getMinimumFrequencyHzOrBuilder() {
      if (minimumFrequencyHzBuilder_ != null) {
        return minimumFrequencyHzBuilder_.getMessageOrBuilder();
      } else {
        return minimumFrequencyHz_ == null ?
            com.anduril.entitymanager.v1.Frequency.getDefaultInstance() : minimumFrequencyHz_;
      }
    }
    /**
     * <pre>
     * Indicates the lowest measured frequency of a signal (Hz).
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Frequency minimum_frequency_hz = 1 [json_name = "minimumFrequencyHz"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Frequency, com.anduril.entitymanager.v1.Frequency.Builder, com.anduril.entitymanager.v1.FrequencyOrBuilder> 
        getMinimumFrequencyHzFieldBuilder() {
      if (minimumFrequencyHzBuilder_ == null) {
        minimumFrequencyHzBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.entitymanager.v1.Frequency, com.anduril.entitymanager.v1.Frequency.Builder, com.anduril.entitymanager.v1.FrequencyOrBuilder>(
                getMinimumFrequencyHz(),
                getParentForChildren(),
                isClean());
        minimumFrequencyHz_ = null;
      }
      return minimumFrequencyHzBuilder_;
    }

    private com.anduril.entitymanager.v1.Frequency maximumFrequencyHz_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Frequency, com.anduril.entitymanager.v1.Frequency.Builder, com.anduril.entitymanager.v1.FrequencyOrBuilder> maximumFrequencyHzBuilder_;
    /**
     * <pre>
     * Indicates the maximum measured frequency of a signal (Hz).
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Frequency maximum_frequency_hz = 2 [json_name = "maximumFrequencyHz"];</code>
     * @return Whether the maximumFrequencyHz field is set.
     */
    public boolean hasMaximumFrequencyHz() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Indicates the maximum measured frequency of a signal (Hz).
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Frequency maximum_frequency_hz = 2 [json_name = "maximumFrequencyHz"];</code>
     * @return The maximumFrequencyHz.
     */
    public com.anduril.entitymanager.v1.Frequency getMaximumFrequencyHz() {
      if (maximumFrequencyHzBuilder_ == null) {
        return maximumFrequencyHz_ == null ? com.anduril.entitymanager.v1.Frequency.getDefaultInstance() : maximumFrequencyHz_;
      } else {
        return maximumFrequencyHzBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Indicates the maximum measured frequency of a signal (Hz).
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Frequency maximum_frequency_hz = 2 [json_name = "maximumFrequencyHz"];</code>
     */
    public Builder setMaximumFrequencyHz(com.anduril.entitymanager.v1.Frequency value) {
      if (maximumFrequencyHzBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        maximumFrequencyHz_ = value;
      } else {
        maximumFrequencyHzBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates the maximum measured frequency of a signal (Hz).
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Frequency maximum_frequency_hz = 2 [json_name = "maximumFrequencyHz"];</code>
     */
    public Builder setMaximumFrequencyHz(
        com.anduril.entitymanager.v1.Frequency.Builder builderForValue) {
      if (maximumFrequencyHzBuilder_ == null) {
        maximumFrequencyHz_ = builderForValue.build();
      } else {
        maximumFrequencyHzBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates the maximum measured frequency of a signal (Hz).
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Frequency maximum_frequency_hz = 2 [json_name = "maximumFrequencyHz"];</code>
     */
    public Builder mergeMaximumFrequencyHz(com.anduril.entitymanager.v1.Frequency value) {
      if (maximumFrequencyHzBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          maximumFrequencyHz_ != null &&
          maximumFrequencyHz_ != com.anduril.entitymanager.v1.Frequency.getDefaultInstance()) {
          getMaximumFrequencyHzBuilder().mergeFrom(value);
        } else {
          maximumFrequencyHz_ = value;
        }
      } else {
        maximumFrequencyHzBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates the maximum measured frequency of a signal (Hz).
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Frequency maximum_frequency_hz = 2 [json_name = "maximumFrequencyHz"];</code>
     */
    public Builder clearMaximumFrequencyHz() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maximumFrequencyHz_ = null;
      if (maximumFrequencyHzBuilder_ != null) {
        maximumFrequencyHzBuilder_.dispose();
        maximumFrequencyHzBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates the maximum measured frequency of a signal (Hz).
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Frequency maximum_frequency_hz = 2 [json_name = "maximumFrequencyHz"];</code>
     */
    public com.anduril.entitymanager.v1.Frequency.Builder getMaximumFrequencyHzBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMaximumFrequencyHzFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Indicates the maximum measured frequency of a signal (Hz).
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Frequency maximum_frequency_hz = 2 [json_name = "maximumFrequencyHz"];</code>
     */
    public com.anduril.entitymanager.v1.FrequencyOrBuilder getMaximumFrequencyHzOrBuilder() {
      if (maximumFrequencyHzBuilder_ != null) {
        return maximumFrequencyHzBuilder_.getMessageOrBuilder();
      } else {
        return maximumFrequencyHz_ == null ?
            com.anduril.entitymanager.v1.Frequency.getDefaultInstance() : maximumFrequencyHz_;
      }
    }
    /**
     * <pre>
     * Indicates the maximum measured frequency of a signal (Hz).
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Frequency maximum_frequency_hz = 2 [json_name = "maximumFrequencyHz"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Frequency, com.anduril.entitymanager.v1.Frequency.Builder, com.anduril.entitymanager.v1.FrequencyOrBuilder> 
        getMaximumFrequencyHzFieldBuilder() {
      if (maximumFrequencyHzBuilder_ == null) {
        maximumFrequencyHzBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.entitymanager.v1.Frequency, com.anduril.entitymanager.v1.Frequency.Builder, com.anduril.entitymanager.v1.FrequencyOrBuilder>(
                getMaximumFrequencyHz(),
                getParentForChildren(),
                isClean());
        maximumFrequencyHz_ = null;
      }
      return maximumFrequencyHzBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.FrequencyRange)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.FrequencyRange)
  private static final com.anduril.entitymanager.v1.FrequencyRange DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.FrequencyRange();
  }

  public static com.anduril.entitymanager.v1.FrequencyRange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FrequencyRange>
      PARSER = new com.google.protobuf.AbstractParser<FrequencyRange>() {
    @java.lang.Override
    public FrequencyRange parsePartialFrom(
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

  public static com.google.protobuf.Parser<FrequencyRange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FrequencyRange> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.FrequencyRange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
