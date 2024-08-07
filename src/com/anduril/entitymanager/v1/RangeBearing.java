// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/signal.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.entitymanager.v1;

/**
 * <pre>
 * Describes range and vertical and horizontal angular measurements of an entity with respect to a target.
 * </pre>
 *
 * Protobuf type {@code anduril.entitymanager.v1.RangeBearing}
 */
public final class RangeBearing extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.RangeBearing)
    RangeBearingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RangeBearing.newBuilder() to construct.
  private RangeBearing(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RangeBearing() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RangeBearing();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.SignalPubProto.internal_static_anduril_entitymanager_v1_RangeBearing_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.SignalPubProto.internal_static_anduril_entitymanager_v1_RangeBearing_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.RangeBearing.class, com.anduril.entitymanager.v1.RangeBearing.Builder.class);
  }

  private int bitField0_;
  public static final int RANGE_M_FIELD_NUMBER = 1;
  private com.anduril.entitymanager.v1.Measurement rangeM_;
  /**
   * <pre>
   * The range to a target along the measured angle in meters with its one sigma error value.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Measurement range_m = 1 [json_name = "rangeM"];</code>
   * @return Whether the rangeM field is set.
   */
  @java.lang.Override
  public boolean hasRangeM() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The range to a target along the measured angle in meters with its one sigma error value.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Measurement range_m = 1 [json_name = "rangeM"];</code>
   * @return The rangeM.
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.Measurement getRangeM() {
    return rangeM_ == null ? com.anduril.entitymanager.v1.Measurement.getDefaultInstance() : rangeM_;
  }
  /**
   * <pre>
   * The range to a target along the measured angle in meters with its one sigma error value.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Measurement range_m = 1 [json_name = "rangeM"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.MeasurementOrBuilder getRangeMOrBuilder() {
    return rangeM_ == null ? com.anduril.entitymanager.v1.Measurement.getDefaultInstance() : rangeM_;
  }

  public static final int RANGE_ANGLE_D_FIELD_NUMBER = 2;
  private com.anduril.entitymanager.v1.Measurement rangeAngleD_;
  /**
   * <pre>
   * Horizontal angle - degrees rotated clockwise from origin_heading: 0-360.
   * Sigma is the standard deviation of the horizontal angular measurement in decimal degrees: 0-180 degrees.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Measurement range_angle_d = 2 [json_name = "rangeAngleD"];</code>
   * @return Whether the rangeAngleD field is set.
   */
  @java.lang.Override
  public boolean hasRangeAngleD() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Horizontal angle - degrees rotated clockwise from origin_heading: 0-360.
   * Sigma is the standard deviation of the horizontal angular measurement in decimal degrees: 0-180 degrees.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Measurement range_angle_d = 2 [json_name = "rangeAngleD"];</code>
   * @return The rangeAngleD.
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.Measurement getRangeAngleD() {
    return rangeAngleD_ == null ? com.anduril.entitymanager.v1.Measurement.getDefaultInstance() : rangeAngleD_;
  }
  /**
   * <pre>
   * Horizontal angle - degrees rotated clockwise from origin_heading: 0-360.
   * Sigma is the standard deviation of the horizontal angular measurement in decimal degrees: 0-180 degrees.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Measurement range_angle_d = 2 [json_name = "rangeAngleD"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.MeasurementOrBuilder getRangeAngleDOrBuilder() {
    return rangeAngleD_ == null ? com.anduril.entitymanager.v1.Measurement.getDefaultInstance() : rangeAngleD_;
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
      output.writeMessage(1, getRangeM());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getRangeAngleD());
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
        .computeMessageSize(1, getRangeM());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRangeAngleD());
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
    if (!(obj instanceof com.anduril.entitymanager.v1.RangeBearing)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.RangeBearing other = (com.anduril.entitymanager.v1.RangeBearing) obj;

    if (hasRangeM() != other.hasRangeM()) return false;
    if (hasRangeM()) {
      if (!getRangeM()
          .equals(other.getRangeM())) return false;
    }
    if (hasRangeAngleD() != other.hasRangeAngleD()) return false;
    if (hasRangeAngleD()) {
      if (!getRangeAngleD()
          .equals(other.getRangeAngleD())) return false;
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
    if (hasRangeM()) {
      hash = (37 * hash) + RANGE_M_FIELD_NUMBER;
      hash = (53 * hash) + getRangeM().hashCode();
    }
    if (hasRangeAngleD()) {
      hash = (37 * hash) + RANGE_ANGLE_D_FIELD_NUMBER;
      hash = (53 * hash) + getRangeAngleD().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.RangeBearing parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.RangeBearing parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.RangeBearing parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.RangeBearing parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.RangeBearing parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.RangeBearing parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.RangeBearing parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.RangeBearing parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.entitymanager.v1.RangeBearing parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.entitymanager.v1.RangeBearing parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.RangeBearing parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.RangeBearing parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.RangeBearing prototype) {
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
   * Describes range and vertical and horizontal angular measurements of an entity with respect to a target.
   * </pre>
   *
   * Protobuf type {@code anduril.entitymanager.v1.RangeBearing}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.RangeBearing)
      com.anduril.entitymanager.v1.RangeBearingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.SignalPubProto.internal_static_anduril_entitymanager_v1_RangeBearing_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.SignalPubProto.internal_static_anduril_entitymanager_v1_RangeBearing_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.RangeBearing.class, com.anduril.entitymanager.v1.RangeBearing.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.RangeBearing.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getRangeMFieldBuilder();
        getRangeAngleDFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      rangeM_ = null;
      if (rangeMBuilder_ != null) {
        rangeMBuilder_.dispose();
        rangeMBuilder_ = null;
      }
      rangeAngleD_ = null;
      if (rangeAngleDBuilder_ != null) {
        rangeAngleDBuilder_.dispose();
        rangeAngleDBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.SignalPubProto.internal_static_anduril_entitymanager_v1_RangeBearing_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.RangeBearing getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.RangeBearing.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.RangeBearing build() {
      com.anduril.entitymanager.v1.RangeBearing result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.RangeBearing buildPartial() {
      com.anduril.entitymanager.v1.RangeBearing result = new com.anduril.entitymanager.v1.RangeBearing(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.entitymanager.v1.RangeBearing result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rangeM_ = rangeMBuilder_ == null
            ? rangeM_
            : rangeMBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.rangeAngleD_ = rangeAngleDBuilder_ == null
            ? rangeAngleD_
            : rangeAngleDBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.anduril.entitymanager.v1.RangeBearing) {
        return mergeFrom((com.anduril.entitymanager.v1.RangeBearing)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.RangeBearing other) {
      if (other == com.anduril.entitymanager.v1.RangeBearing.getDefaultInstance()) return this;
      if (other.hasRangeM()) {
        mergeRangeM(other.getRangeM());
      }
      if (other.hasRangeAngleD()) {
        mergeRangeAngleD(other.getRangeAngleD());
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
                  getRangeMFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getRangeAngleDFieldBuilder().getBuilder(),
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

    private com.anduril.entitymanager.v1.Measurement rangeM_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Measurement, com.anduril.entitymanager.v1.Measurement.Builder, com.anduril.entitymanager.v1.MeasurementOrBuilder> rangeMBuilder_;
    /**
     * <pre>
     * The range to a target along the measured angle in meters with its one sigma error value.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement range_m = 1 [json_name = "rangeM"];</code>
     * @return Whether the rangeM field is set.
     */
    public boolean hasRangeM() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The range to a target along the measured angle in meters with its one sigma error value.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement range_m = 1 [json_name = "rangeM"];</code>
     * @return The rangeM.
     */
    public com.anduril.entitymanager.v1.Measurement getRangeM() {
      if (rangeMBuilder_ == null) {
        return rangeM_ == null ? com.anduril.entitymanager.v1.Measurement.getDefaultInstance() : rangeM_;
      } else {
        return rangeMBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The range to a target along the measured angle in meters with its one sigma error value.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement range_m = 1 [json_name = "rangeM"];</code>
     */
    public Builder setRangeM(com.anduril.entitymanager.v1.Measurement value) {
      if (rangeMBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rangeM_ = value;
      } else {
        rangeMBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The range to a target along the measured angle in meters with its one sigma error value.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement range_m = 1 [json_name = "rangeM"];</code>
     */
    public Builder setRangeM(
        com.anduril.entitymanager.v1.Measurement.Builder builderForValue) {
      if (rangeMBuilder_ == null) {
        rangeM_ = builderForValue.build();
      } else {
        rangeMBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The range to a target along the measured angle in meters with its one sigma error value.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement range_m = 1 [json_name = "rangeM"];</code>
     */
    public Builder mergeRangeM(com.anduril.entitymanager.v1.Measurement value) {
      if (rangeMBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          rangeM_ != null &&
          rangeM_ != com.anduril.entitymanager.v1.Measurement.getDefaultInstance()) {
          getRangeMBuilder().mergeFrom(value);
        } else {
          rangeM_ = value;
        }
      } else {
        rangeMBuilder_.mergeFrom(value);
      }
      if (rangeM_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The range to a target along the measured angle in meters with its one sigma error value.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement range_m = 1 [json_name = "rangeM"];</code>
     */
    public Builder clearRangeM() {
      bitField0_ = (bitField0_ & ~0x00000001);
      rangeM_ = null;
      if (rangeMBuilder_ != null) {
        rangeMBuilder_.dispose();
        rangeMBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The range to a target along the measured angle in meters with its one sigma error value.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement range_m = 1 [json_name = "rangeM"];</code>
     */
    public com.anduril.entitymanager.v1.Measurement.Builder getRangeMBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRangeMFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The range to a target along the measured angle in meters with its one sigma error value.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement range_m = 1 [json_name = "rangeM"];</code>
     */
    public com.anduril.entitymanager.v1.MeasurementOrBuilder getRangeMOrBuilder() {
      if (rangeMBuilder_ != null) {
        return rangeMBuilder_.getMessageOrBuilder();
      } else {
        return rangeM_ == null ?
            com.anduril.entitymanager.v1.Measurement.getDefaultInstance() : rangeM_;
      }
    }
    /**
     * <pre>
     * The range to a target along the measured angle in meters with its one sigma error value.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement range_m = 1 [json_name = "rangeM"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Measurement, com.anduril.entitymanager.v1.Measurement.Builder, com.anduril.entitymanager.v1.MeasurementOrBuilder> 
        getRangeMFieldBuilder() {
      if (rangeMBuilder_ == null) {
        rangeMBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.entitymanager.v1.Measurement, com.anduril.entitymanager.v1.Measurement.Builder, com.anduril.entitymanager.v1.MeasurementOrBuilder>(
                getRangeM(),
                getParentForChildren(),
                isClean());
        rangeM_ = null;
      }
      return rangeMBuilder_;
    }

    private com.anduril.entitymanager.v1.Measurement rangeAngleD_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Measurement, com.anduril.entitymanager.v1.Measurement.Builder, com.anduril.entitymanager.v1.MeasurementOrBuilder> rangeAngleDBuilder_;
    /**
     * <pre>
     * Horizontal angle - degrees rotated clockwise from origin_heading: 0-360.
     * Sigma is the standard deviation of the horizontal angular measurement in decimal degrees: 0-180 degrees.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement range_angle_d = 2 [json_name = "rangeAngleD"];</code>
     * @return Whether the rangeAngleD field is set.
     */
    public boolean hasRangeAngleD() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Horizontal angle - degrees rotated clockwise from origin_heading: 0-360.
     * Sigma is the standard deviation of the horizontal angular measurement in decimal degrees: 0-180 degrees.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement range_angle_d = 2 [json_name = "rangeAngleD"];</code>
     * @return The rangeAngleD.
     */
    public com.anduril.entitymanager.v1.Measurement getRangeAngleD() {
      if (rangeAngleDBuilder_ == null) {
        return rangeAngleD_ == null ? com.anduril.entitymanager.v1.Measurement.getDefaultInstance() : rangeAngleD_;
      } else {
        return rangeAngleDBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Horizontal angle - degrees rotated clockwise from origin_heading: 0-360.
     * Sigma is the standard deviation of the horizontal angular measurement in decimal degrees: 0-180 degrees.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement range_angle_d = 2 [json_name = "rangeAngleD"];</code>
     */
    public Builder setRangeAngleD(com.anduril.entitymanager.v1.Measurement value) {
      if (rangeAngleDBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rangeAngleD_ = value;
      } else {
        rangeAngleDBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Horizontal angle - degrees rotated clockwise from origin_heading: 0-360.
     * Sigma is the standard deviation of the horizontal angular measurement in decimal degrees: 0-180 degrees.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement range_angle_d = 2 [json_name = "rangeAngleD"];</code>
     */
    public Builder setRangeAngleD(
        com.anduril.entitymanager.v1.Measurement.Builder builderForValue) {
      if (rangeAngleDBuilder_ == null) {
        rangeAngleD_ = builderForValue.build();
      } else {
        rangeAngleDBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Horizontal angle - degrees rotated clockwise from origin_heading: 0-360.
     * Sigma is the standard deviation of the horizontal angular measurement in decimal degrees: 0-180 degrees.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement range_angle_d = 2 [json_name = "rangeAngleD"];</code>
     */
    public Builder mergeRangeAngleD(com.anduril.entitymanager.v1.Measurement value) {
      if (rangeAngleDBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          rangeAngleD_ != null &&
          rangeAngleD_ != com.anduril.entitymanager.v1.Measurement.getDefaultInstance()) {
          getRangeAngleDBuilder().mergeFrom(value);
        } else {
          rangeAngleD_ = value;
        }
      } else {
        rangeAngleDBuilder_.mergeFrom(value);
      }
      if (rangeAngleD_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Horizontal angle - degrees rotated clockwise from origin_heading: 0-360.
     * Sigma is the standard deviation of the horizontal angular measurement in decimal degrees: 0-180 degrees.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement range_angle_d = 2 [json_name = "rangeAngleD"];</code>
     */
    public Builder clearRangeAngleD() {
      bitField0_ = (bitField0_ & ~0x00000002);
      rangeAngleD_ = null;
      if (rangeAngleDBuilder_ != null) {
        rangeAngleDBuilder_.dispose();
        rangeAngleDBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Horizontal angle - degrees rotated clockwise from origin_heading: 0-360.
     * Sigma is the standard deviation of the horizontal angular measurement in decimal degrees: 0-180 degrees.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement range_angle_d = 2 [json_name = "rangeAngleD"];</code>
     */
    public com.anduril.entitymanager.v1.Measurement.Builder getRangeAngleDBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRangeAngleDFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Horizontal angle - degrees rotated clockwise from origin_heading: 0-360.
     * Sigma is the standard deviation of the horizontal angular measurement in decimal degrees: 0-180 degrees.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement range_angle_d = 2 [json_name = "rangeAngleD"];</code>
     */
    public com.anduril.entitymanager.v1.MeasurementOrBuilder getRangeAngleDOrBuilder() {
      if (rangeAngleDBuilder_ != null) {
        return rangeAngleDBuilder_.getMessageOrBuilder();
      } else {
        return rangeAngleD_ == null ?
            com.anduril.entitymanager.v1.Measurement.getDefaultInstance() : rangeAngleD_;
      }
    }
    /**
     * <pre>
     * Horizontal angle - degrees rotated clockwise from origin_heading: 0-360.
     * Sigma is the standard deviation of the horizontal angular measurement in decimal degrees: 0-180 degrees.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Measurement range_angle_d = 2 [json_name = "rangeAngleD"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Measurement, com.anduril.entitymanager.v1.Measurement.Builder, com.anduril.entitymanager.v1.MeasurementOrBuilder> 
        getRangeAngleDFieldBuilder() {
      if (rangeAngleDBuilder_ == null) {
        rangeAngleDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.entitymanager.v1.Measurement, com.anduril.entitymanager.v1.Measurement.Builder, com.anduril.entitymanager.v1.MeasurementOrBuilder>(
                getRangeAngleD(),
                getParentForChildren(),
                isClean());
        rangeAngleD_ = null;
      }
      return rangeAngleDBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.RangeBearing)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.RangeBearing)
  private static final com.anduril.entitymanager.v1.RangeBearing DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.RangeBearing();
  }

  public static com.anduril.entitymanager.v1.RangeBearing getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RangeBearing>
      PARSER = new com.google.protobuf.AbstractParser<RangeBearing>() {
    @java.lang.Override
    public RangeBearing parsePartialFrom(
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

  public static com.google.protobuf.Parser<RangeBearing> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RangeBearing> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.RangeBearing getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

