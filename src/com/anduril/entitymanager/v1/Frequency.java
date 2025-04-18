// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/signal.pub.proto

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * A component for describing frequency.
 * </pre>
 *
 * Protobuf type {@code anduril.entitymanager.v1.Frequency}
 */
public final class Frequency extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.Frequency)
    FrequencyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Frequency.newBuilder() to construct.
  private Frequency(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Frequency() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Frequency();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.SignalPubProto.internal_static_anduril_entitymanager_v1_Frequency_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.SignalPubProto.internal_static_anduril_entitymanager_v1_Frequency_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.Frequency.class, com.anduril.entitymanager.v1.Frequency.Builder.class);
  }

  public static final int FREQUENCY_HZ_FIELD_NUMBER = 1;
  private com.anduril.entitymanager.v1.Measurement frequencyHz_;
  /**
   * <pre>
   * Indicates a frequency of a signal (Hz) with its standard deviation.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Measurement frequency_hz = 1 [json_name = "frequencyHz"];</code>
   * @return Whether the frequencyHz field is set.
   */
  @java.lang.Override
  public boolean hasFrequencyHz() {
    return frequencyHz_ != null;
  }
  /**
   * <pre>
   * Indicates a frequency of a signal (Hz) with its standard deviation.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Measurement frequency_hz = 1 [json_name = "frequencyHz"];</code>
   * @return The frequencyHz.
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.Measurement getFrequencyHz() {
    return frequencyHz_ == null ? com.anduril.entitymanager.v1.Measurement.getDefaultInstance() : frequencyHz_;
  }
  /**
   * <pre>
   * Indicates a frequency of a signal (Hz) with its standard deviation.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Measurement frequency_hz = 1 [json_name = "frequencyHz"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.MeasurementOrBuilder getFrequencyHzOrBuilder() {
    return frequencyHz_ == null ? com.anduril.entitymanager.v1.Measurement.getDefaultInstance() : frequencyHz_;
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
    if (frequencyHz_ != null) {
      output.writeMessage(1, getFrequencyHz());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (frequencyHz_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFrequencyHz());
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
    if (!(obj instanceof com.anduril.entitymanager.v1.Frequency)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.Frequency other = (com.anduril.entitymanager.v1.Frequency) obj;

    if (hasFrequencyHz() != other.hasFrequencyHz()) return false;
    if (hasFrequencyHz()) {
      if (!getFrequencyHz()
          .equals(other.getFrequencyHz())) return false;
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
    if (hasFrequencyHz()) {
      hash = (37 * hash) + FREQUENCY_HZ_FIELD_NUMBER;
      hash = (53 * hash) + getFrequencyHz().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.Frequency parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.Frequency parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Frequency parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.Frequency parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Frequency parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.Frequency parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Frequency parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.Frequency parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Frequency parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.Frequency parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Frequency parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.Frequency parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.Frequency prototype) {
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
   * A component for describing frequency.
   * </pre>
   *
   * Protobuf type {@code anduril.entitymanager.v1.Frequency}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.Frequency)
      com.anduril.entitymanager.v1.FrequencyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.SignalPubProto.internal_static_anduril_entitymanager_v1_Frequency_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.SignalPubProto.internal_static_anduril_entitymanager_v1_Frequency_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.Frequency.class, com.anduril.entitymanager.v1.Frequency.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.Frequency.newBuilder()
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
      frequencyHz_ = null;
      if (frequencyHzBuilder_ != null) {
        frequencyHzBuilder_.dispose();
        frequencyHzBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.SignalPubProto.internal_static_anduril_entitymanager_v1_Frequency_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.Frequency getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.Frequency.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.Frequency build() {
      com.anduril.entitymanager.v1.Frequency result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.Frequency buildPartial() {
      com.anduril.entitymanager.v1.Frequency result = new com.anduril.entitymanager.v1.Frequency(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.entitymanager.v1.Frequency result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.frequencyHz_ = frequencyHzBuilder_ == null
            ? frequencyHz_
            : frequencyHzBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entitymanager.v1.Frequency) {
        return mergeFrom((com.anduril.entitymanager.v1.Frequency)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.Frequency other) {
      if (other == com.anduril.entitymanager.v1.Frequency.getDefaultInstance()) return this;
      if (other.hasFrequencyHz()) {
        mergeFrequencyHz(other.getFrequencyHz());
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
                  getFrequencyHzFieldBuilder().getBuilder(),
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

    private com.anduril.entitymanager.v1.Measurement frequencyHz_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Measurement, com.anduril.entitymanager.v1.Measurement.Builder, com.anduril.entitymanager.v1.MeasurementOrBuilder> frequencyHzBuilder_;
    /**
     * <pre>
     * Indicates a frequency of a signal (Hz) with its standard deviation.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement frequency_hz = 1 [json_name = "frequencyHz"];</code>
     * @return Whether the frequencyHz field is set.
     */
    public boolean hasFrequencyHz() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Indicates a frequency of a signal (Hz) with its standard deviation.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement frequency_hz = 1 [json_name = "frequencyHz"];</code>
     * @return The frequencyHz.
     */
    public com.anduril.entitymanager.v1.Measurement getFrequencyHz() {
      if (frequencyHzBuilder_ == null) {
        return frequencyHz_ == null ? com.anduril.entitymanager.v1.Measurement.getDefaultInstance() : frequencyHz_;
      } else {
        return frequencyHzBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Indicates a frequency of a signal (Hz) with its standard deviation.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement frequency_hz = 1 [json_name = "frequencyHz"];</code>
     */
    public Builder setFrequencyHz(com.anduril.entitymanager.v1.Measurement value) {
      if (frequencyHzBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        frequencyHz_ = value;
      } else {
        frequencyHzBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates a frequency of a signal (Hz) with its standard deviation.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement frequency_hz = 1 [json_name = "frequencyHz"];</code>
     */
    public Builder setFrequencyHz(
        com.anduril.entitymanager.v1.Measurement.Builder builderForValue) {
      if (frequencyHzBuilder_ == null) {
        frequencyHz_ = builderForValue.build();
      } else {
        frequencyHzBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates a frequency of a signal (Hz) with its standard deviation.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement frequency_hz = 1 [json_name = "frequencyHz"];</code>
     */
    public Builder mergeFrequencyHz(com.anduril.entitymanager.v1.Measurement value) {
      if (frequencyHzBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          frequencyHz_ != null &&
          frequencyHz_ != com.anduril.entitymanager.v1.Measurement.getDefaultInstance()) {
          getFrequencyHzBuilder().mergeFrom(value);
        } else {
          frequencyHz_ = value;
        }
      } else {
        frequencyHzBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates a frequency of a signal (Hz) with its standard deviation.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement frequency_hz = 1 [json_name = "frequencyHz"];</code>
     */
    public Builder clearFrequencyHz() {
      bitField0_ = (bitField0_ & ~0x00000001);
      frequencyHz_ = null;
      if (frequencyHzBuilder_ != null) {
        frequencyHzBuilder_.dispose();
        frequencyHzBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates a frequency of a signal (Hz) with its standard deviation.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement frequency_hz = 1 [json_name = "frequencyHz"];</code>
     */
    public com.anduril.entitymanager.v1.Measurement.Builder getFrequencyHzBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getFrequencyHzFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Indicates a frequency of a signal (Hz) with its standard deviation.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement frequency_hz = 1 [json_name = "frequencyHz"];</code>
     */
    public com.anduril.entitymanager.v1.MeasurementOrBuilder getFrequencyHzOrBuilder() {
      if (frequencyHzBuilder_ != null) {
        return frequencyHzBuilder_.getMessageOrBuilder();
      } else {
        return frequencyHz_ == null ?
            com.anduril.entitymanager.v1.Measurement.getDefaultInstance() : frequencyHz_;
      }
    }
    /**
     * <pre>
     * Indicates a frequency of a signal (Hz) with its standard deviation.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement frequency_hz = 1 [json_name = "frequencyHz"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Measurement, com.anduril.entitymanager.v1.Measurement.Builder, com.anduril.entitymanager.v1.MeasurementOrBuilder> 
        getFrequencyHzFieldBuilder() {
      if (frequencyHzBuilder_ == null) {
        frequencyHzBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.entitymanager.v1.Measurement, com.anduril.entitymanager.v1.Measurement.Builder, com.anduril.entitymanager.v1.MeasurementOrBuilder>(
                getFrequencyHz(),
                getParentForChildren(),
                isClean());
        frequencyHz_ = null;
      }
      return frequencyHzBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.Frequency)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.Frequency)
  private static final com.anduril.entitymanager.v1.Frequency DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.Frequency();
  }

  public static com.anduril.entitymanager.v1.Frequency getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Frequency>
      PARSER = new com.google.protobuf.AbstractParser<Frequency>() {
    @java.lang.Override
    public Frequency parsePartialFrom(
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

  public static com.google.protobuf.Parser<Frequency> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Frequency> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.Frequency getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

