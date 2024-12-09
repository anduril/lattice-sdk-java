// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/shared/isr.pub.proto

package com.anduril.tasks.v2;

/**
 * Protobuf type {@code anduril.tasks.v2.OrbitDuration}
 */
public final class OrbitDuration extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.tasks.v2.OrbitDuration)
    OrbitDurationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrbitDuration.newBuilder() to construct.
  private OrbitDuration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrbitDuration() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OrbitDuration();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_OrbitDuration_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_OrbitDuration_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.tasks.v2.OrbitDuration.class, com.anduril.tasks.v2.OrbitDuration.Builder.class);
  }

  private int durationCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object duration_;
  public enum DurationCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    DURATION_RANGE(1),
    NUM_OF_ORBITS(2),
    DURATION_NOT_SET(0);
    private final int value;
    private DurationCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DurationCase valueOf(int value) {
      return forNumber(value);
    }

    public static DurationCase forNumber(int value) {
      switch (value) {
        case 1: return DURATION_RANGE;
        case 2: return NUM_OF_ORBITS;
        case 0: return DURATION_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public DurationCase
  getDurationCase() {
    return DurationCase.forNumber(
        durationCase_);
  }

  public static final int DURATION_RANGE_FIELD_NUMBER = 1;
  /**
   * <code>.anduril.tasks.v2.DurationRange duration_range = 1 [json_name = "durationRange"];</code>
   * @return Whether the durationRange field is set.
   */
  @java.lang.Override
  public boolean hasDurationRange() {
    return durationCase_ == 1;
  }
  /**
   * <code>.anduril.tasks.v2.DurationRange duration_range = 1 [json_name = "durationRange"];</code>
   * @return The durationRange.
   */
  @java.lang.Override
  public com.anduril.tasks.v2.DurationRange getDurationRange() {
    if (durationCase_ == 1) {
       return (com.anduril.tasks.v2.DurationRange) duration_;
    }
    return com.anduril.tasks.v2.DurationRange.getDefaultInstance();
  }
  /**
   * <code>.anduril.tasks.v2.DurationRange duration_range = 1 [json_name = "durationRange"];</code>
   */
  @java.lang.Override
  public com.anduril.tasks.v2.DurationRangeOrBuilder getDurationRangeOrBuilder() {
    if (durationCase_ == 1) {
       return (com.anduril.tasks.v2.DurationRange) duration_;
    }
    return com.anduril.tasks.v2.DurationRange.getDefaultInstance();
  }

  public static final int NUM_OF_ORBITS_FIELD_NUMBER = 2;
  /**
   * <code>uint64 num_of_orbits = 2 [json_name = "numOfOrbits"];</code>
   * @return Whether the numOfOrbits field is set.
   */
  @java.lang.Override
  public boolean hasNumOfOrbits() {
    return durationCase_ == 2;
  }
  /**
   * <code>uint64 num_of_orbits = 2 [json_name = "numOfOrbits"];</code>
   * @return The numOfOrbits.
   */
  @java.lang.Override
  public long getNumOfOrbits() {
    if (durationCase_ == 2) {
      return (java.lang.Long) duration_;
    }
    return 0L;
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
    if (durationCase_ == 1) {
      output.writeMessage(1, (com.anduril.tasks.v2.DurationRange) duration_);
    }
    if (durationCase_ == 2) {
      output.writeUInt64(
          2, (long)((java.lang.Long) duration_));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (durationCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.anduril.tasks.v2.DurationRange) duration_);
    }
    if (durationCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(
            2, (long)((java.lang.Long) duration_));
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
    if (!(obj instanceof com.anduril.tasks.v2.OrbitDuration)) {
      return super.equals(obj);
    }
    com.anduril.tasks.v2.OrbitDuration other = (com.anduril.tasks.v2.OrbitDuration) obj;

    if (!getDurationCase().equals(other.getDurationCase())) return false;
    switch (durationCase_) {
      case 1:
        if (!getDurationRange()
            .equals(other.getDurationRange())) return false;
        break;
      case 2:
        if (getNumOfOrbits()
            != other.getNumOfOrbits()) return false;
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
    switch (durationCase_) {
      case 1:
        hash = (37 * hash) + DURATION_RANGE_FIELD_NUMBER;
        hash = (53 * hash) + getDurationRange().hashCode();
        break;
      case 2:
        hash = (37 * hash) + NUM_OF_ORBITS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getNumOfOrbits());
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.tasks.v2.OrbitDuration parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.OrbitDuration parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.OrbitDuration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.OrbitDuration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.OrbitDuration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.OrbitDuration parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.OrbitDuration parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.OrbitDuration parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.tasks.v2.OrbitDuration parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.OrbitDuration parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.tasks.v2.OrbitDuration parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.OrbitDuration parseFrom(
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
  public static Builder newBuilder(com.anduril.tasks.v2.OrbitDuration prototype) {
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
   * Protobuf type {@code anduril.tasks.v2.OrbitDuration}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.tasks.v2.OrbitDuration)
      com.anduril.tasks.v2.OrbitDurationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_OrbitDuration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_OrbitDuration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.tasks.v2.OrbitDuration.class, com.anduril.tasks.v2.OrbitDuration.Builder.class);
    }

    // Construct using com.anduril.tasks.v2.OrbitDuration.newBuilder()
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
      if (durationRangeBuilder_ != null) {
        durationRangeBuilder_.clear();
      }
      durationCase_ = 0;
      duration_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_OrbitDuration_descriptor;
    }

    @java.lang.Override
    public com.anduril.tasks.v2.OrbitDuration getDefaultInstanceForType() {
      return com.anduril.tasks.v2.OrbitDuration.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.tasks.v2.OrbitDuration build() {
      com.anduril.tasks.v2.OrbitDuration result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.tasks.v2.OrbitDuration buildPartial() {
      com.anduril.tasks.v2.OrbitDuration result = new com.anduril.tasks.v2.OrbitDuration(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.tasks.v2.OrbitDuration result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.anduril.tasks.v2.OrbitDuration result) {
      result.durationCase_ = durationCase_;
      result.duration_ = this.duration_;
      if (durationCase_ == 1 &&
          durationRangeBuilder_ != null) {
        result.duration_ = durationRangeBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.tasks.v2.OrbitDuration) {
        return mergeFrom((com.anduril.tasks.v2.OrbitDuration)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.tasks.v2.OrbitDuration other) {
      if (other == com.anduril.tasks.v2.OrbitDuration.getDefaultInstance()) return this;
      switch (other.getDurationCase()) {
        case DURATION_RANGE: {
          mergeDurationRange(other.getDurationRange());
          break;
        }
        case NUM_OF_ORBITS: {
          setNumOfOrbits(other.getNumOfOrbits());
          break;
        }
        case DURATION_NOT_SET: {
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
                  getDurationRangeFieldBuilder().getBuilder(),
                  extensionRegistry);
              durationCase_ = 1;
              break;
            } // case 10
            case 16: {
              duration_ = input.readUInt64();
              durationCase_ = 2;
              break;
            } // case 16
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
    private int durationCase_ = 0;
    private java.lang.Object duration_;
    public DurationCase
        getDurationCase() {
      return DurationCase.forNumber(
          durationCase_);
    }

    public Builder clearDuration() {
      durationCase_ = 0;
      duration_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.tasks.v2.DurationRange, com.anduril.tasks.v2.DurationRange.Builder, com.anduril.tasks.v2.DurationRangeOrBuilder> durationRangeBuilder_;
    /**
     * <code>.anduril.tasks.v2.DurationRange duration_range = 1 [json_name = "durationRange"];</code>
     * @return Whether the durationRange field is set.
     */
    @java.lang.Override
    public boolean hasDurationRange() {
      return durationCase_ == 1;
    }
    /**
     * <code>.anduril.tasks.v2.DurationRange duration_range = 1 [json_name = "durationRange"];</code>
     * @return The durationRange.
     */
    @java.lang.Override
    public com.anduril.tasks.v2.DurationRange getDurationRange() {
      if (durationRangeBuilder_ == null) {
        if (durationCase_ == 1) {
          return (com.anduril.tasks.v2.DurationRange) duration_;
        }
        return com.anduril.tasks.v2.DurationRange.getDefaultInstance();
      } else {
        if (durationCase_ == 1) {
          return durationRangeBuilder_.getMessage();
        }
        return com.anduril.tasks.v2.DurationRange.getDefaultInstance();
      }
    }
    /**
     * <code>.anduril.tasks.v2.DurationRange duration_range = 1 [json_name = "durationRange"];</code>
     */
    public Builder setDurationRange(com.anduril.tasks.v2.DurationRange value) {
      if (durationRangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        duration_ = value;
        onChanged();
      } else {
        durationRangeBuilder_.setMessage(value);
      }
      durationCase_ = 1;
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.DurationRange duration_range = 1 [json_name = "durationRange"];</code>
     */
    public Builder setDurationRange(
        com.anduril.tasks.v2.DurationRange.Builder builderForValue) {
      if (durationRangeBuilder_ == null) {
        duration_ = builderForValue.build();
        onChanged();
      } else {
        durationRangeBuilder_.setMessage(builderForValue.build());
      }
      durationCase_ = 1;
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.DurationRange duration_range = 1 [json_name = "durationRange"];</code>
     */
    public Builder mergeDurationRange(com.anduril.tasks.v2.DurationRange value) {
      if (durationRangeBuilder_ == null) {
        if (durationCase_ == 1 &&
            duration_ != com.anduril.tasks.v2.DurationRange.getDefaultInstance()) {
          duration_ = com.anduril.tasks.v2.DurationRange.newBuilder((com.anduril.tasks.v2.DurationRange) duration_)
              .mergeFrom(value).buildPartial();
        } else {
          duration_ = value;
        }
        onChanged();
      } else {
        if (durationCase_ == 1) {
          durationRangeBuilder_.mergeFrom(value);
        } else {
          durationRangeBuilder_.setMessage(value);
        }
      }
      durationCase_ = 1;
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.DurationRange duration_range = 1 [json_name = "durationRange"];</code>
     */
    public Builder clearDurationRange() {
      if (durationRangeBuilder_ == null) {
        if (durationCase_ == 1) {
          durationCase_ = 0;
          duration_ = null;
          onChanged();
        }
      } else {
        if (durationCase_ == 1) {
          durationCase_ = 0;
          duration_ = null;
        }
        durationRangeBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.DurationRange duration_range = 1 [json_name = "durationRange"];</code>
     */
    public com.anduril.tasks.v2.DurationRange.Builder getDurationRangeBuilder() {
      return getDurationRangeFieldBuilder().getBuilder();
    }
    /**
     * <code>.anduril.tasks.v2.DurationRange duration_range = 1 [json_name = "durationRange"];</code>
     */
    @java.lang.Override
    public com.anduril.tasks.v2.DurationRangeOrBuilder getDurationRangeOrBuilder() {
      if ((durationCase_ == 1) && (durationRangeBuilder_ != null)) {
        return durationRangeBuilder_.getMessageOrBuilder();
      } else {
        if (durationCase_ == 1) {
          return (com.anduril.tasks.v2.DurationRange) duration_;
        }
        return com.anduril.tasks.v2.DurationRange.getDefaultInstance();
      }
    }
    /**
     * <code>.anduril.tasks.v2.DurationRange duration_range = 1 [json_name = "durationRange"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.tasks.v2.DurationRange, com.anduril.tasks.v2.DurationRange.Builder, com.anduril.tasks.v2.DurationRangeOrBuilder> 
        getDurationRangeFieldBuilder() {
      if (durationRangeBuilder_ == null) {
        if (!(durationCase_ == 1)) {
          duration_ = com.anduril.tasks.v2.DurationRange.getDefaultInstance();
        }
        durationRangeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.tasks.v2.DurationRange, com.anduril.tasks.v2.DurationRange.Builder, com.anduril.tasks.v2.DurationRangeOrBuilder>(
                (com.anduril.tasks.v2.DurationRange) duration_,
                getParentForChildren(),
                isClean());
        duration_ = null;
      }
      durationCase_ = 1;
      onChanged();
      return durationRangeBuilder_;
    }

    /**
     * <code>uint64 num_of_orbits = 2 [json_name = "numOfOrbits"];</code>
     * @return Whether the numOfOrbits field is set.
     */
    public boolean hasNumOfOrbits() {
      return durationCase_ == 2;
    }
    /**
     * <code>uint64 num_of_orbits = 2 [json_name = "numOfOrbits"];</code>
     * @return The numOfOrbits.
     */
    public long getNumOfOrbits() {
      if (durationCase_ == 2) {
        return (java.lang.Long) duration_;
      }
      return 0L;
    }
    /**
     * <code>uint64 num_of_orbits = 2 [json_name = "numOfOrbits"];</code>
     * @param value The numOfOrbits to set.
     * @return This builder for chaining.
     */
    public Builder setNumOfOrbits(long value) {

      durationCase_ = 2;
      duration_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 num_of_orbits = 2 [json_name = "numOfOrbits"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNumOfOrbits() {
      if (durationCase_ == 2) {
        durationCase_ = 0;
        duration_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:anduril.tasks.v2.OrbitDuration)
  }

  // @@protoc_insertion_point(class_scope:anduril.tasks.v2.OrbitDuration)
  private static final com.anduril.tasks.v2.OrbitDuration DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.tasks.v2.OrbitDuration();
  }

  public static com.anduril.tasks.v2.OrbitDuration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrbitDuration>
      PARSER = new com.google.protobuf.AbstractParser<OrbitDuration>() {
    @java.lang.Override
    public OrbitDuration parsePartialFrom(
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

  public static com.google.protobuf.Parser<OrbitDuration> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrbitDuration> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.tasks.v2.OrbitDuration getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
