// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/shared/isr.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.tasks.v2;

/**
 * <pre>
 * Point clicked in the frame of the video feed.
 * </pre>
 *
 * Protobuf type {@code anduril.tasks.v2.FramePoint}
 */
public final class FramePoint extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.tasks.v2.FramePoint)
    FramePointOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FramePoint.newBuilder() to construct.
  private FramePoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FramePoint() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FramePoint();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_FramePoint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_FramePoint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.tasks.v2.FramePoint.class, com.anduril.tasks.v2.FramePoint.Builder.class);
  }

  private int bitField0_;
  public static final int X_FIELD_NUMBER = 1;
  private float x_ = 0F;
  /**
   * <pre>
   * Frame-normalized location in frame on the x-axis, range (0, 1).
   * For example, x = 0.3 implies a pixel location of 0.3 * image_width.
   * </pre>
   *
   * <code>float x = 1 [json_name = "x"];</code>
   * @return The x.
   */
  @java.lang.Override
  public float getX() {
    return x_;
  }

  public static final int Y_FIELD_NUMBER = 2;
  private float y_ = 0F;
  /**
   * <pre>
   * Frame-normalized location in frame on the y-axis, range (0, 1).
   * For example, y = 0.3 implies a pixel location of 0.3 * image_height.
   * </pre>
   *
   * <code>float y = 2 [json_name = "y"];</code>
   * @return The y.
   */
  @java.lang.Override
  public float getY() {
    return y_;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp timestamp_;
  /**
   * <pre>
   * Timestamp of frame
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 3 [json_name = "timestamp"];</code>
   * @return Whether the timestamp field is set.
   */
  @java.lang.Override
  public boolean hasTimestamp() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Timestamp of frame
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 3 [json_name = "timestamp"];</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getTimestamp() {
    return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
  }
  /**
   * <pre>
   * Timestamp of frame
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 3 [json_name = "timestamp"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder() {
    return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
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
    if (java.lang.Float.floatToRawIntBits(x_) != 0) {
      output.writeFloat(1, x_);
    }
    if (java.lang.Float.floatToRawIntBits(y_) != 0) {
      output.writeFloat(2, y_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getTimestamp());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(x_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, x_);
    }
    if (java.lang.Float.floatToRawIntBits(y_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, y_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getTimestamp());
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
    if (!(obj instanceof com.anduril.tasks.v2.FramePoint)) {
      return super.equals(obj);
    }
    com.anduril.tasks.v2.FramePoint other = (com.anduril.tasks.v2.FramePoint) obj;

    if (java.lang.Float.floatToIntBits(getX())
        != java.lang.Float.floatToIntBits(
            other.getX())) return false;
    if (java.lang.Float.floatToIntBits(getY())
        != java.lang.Float.floatToIntBits(
            other.getY())) return false;
    if (hasTimestamp() != other.hasTimestamp()) return false;
    if (hasTimestamp()) {
      if (!getTimestamp()
          .equals(other.getTimestamp())) return false;
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
    hash = (37 * hash) + X_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getX());
    hash = (37 * hash) + Y_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getY());
    if (hasTimestamp()) {
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTimestamp().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.tasks.v2.FramePoint parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.FramePoint parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.FramePoint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.FramePoint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.FramePoint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.FramePoint parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.FramePoint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.FramePoint parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.tasks.v2.FramePoint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.tasks.v2.FramePoint parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.tasks.v2.FramePoint parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.FramePoint parseFrom(
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
  public static Builder newBuilder(com.anduril.tasks.v2.FramePoint prototype) {
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
   * Point clicked in the frame of the video feed.
   * </pre>
   *
   * Protobuf type {@code anduril.tasks.v2.FramePoint}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.tasks.v2.FramePoint)
      com.anduril.tasks.v2.FramePointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_FramePoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_FramePoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.tasks.v2.FramePoint.class, com.anduril.tasks.v2.FramePoint.Builder.class);
    }

    // Construct using com.anduril.tasks.v2.FramePoint.newBuilder()
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
        getTimestampFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      x_ = 0F;
      y_ = 0F;
      timestamp_ = null;
      if (timestampBuilder_ != null) {
        timestampBuilder_.dispose();
        timestampBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_FramePoint_descriptor;
    }

    @java.lang.Override
    public com.anduril.tasks.v2.FramePoint getDefaultInstanceForType() {
      return com.anduril.tasks.v2.FramePoint.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.tasks.v2.FramePoint build() {
      com.anduril.tasks.v2.FramePoint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.tasks.v2.FramePoint buildPartial() {
      com.anduril.tasks.v2.FramePoint result = new com.anduril.tasks.v2.FramePoint(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.tasks.v2.FramePoint result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.x_ = x_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.y_ = y_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.timestamp_ = timestampBuilder_ == null
            ? timestamp_
            : timestampBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.anduril.tasks.v2.FramePoint) {
        return mergeFrom((com.anduril.tasks.v2.FramePoint)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.tasks.v2.FramePoint other) {
      if (other == com.anduril.tasks.v2.FramePoint.getDefaultInstance()) return this;
      if (other.getX() != 0F) {
        setX(other.getX());
      }
      if (other.getY() != 0F) {
        setY(other.getY());
      }
      if (other.hasTimestamp()) {
        mergeTimestamp(other.getTimestamp());
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
            case 13: {
              x_ = input.readFloat();
              bitField0_ |= 0x00000001;
              break;
            } // case 13
            case 21: {
              y_ = input.readFloat();
              bitField0_ |= 0x00000002;
              break;
            } // case 21
            case 26: {
              input.readMessage(
                  getTimestampFieldBuilder().getBuilder(),
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

    private float x_ ;
    /**
     * <pre>
     * Frame-normalized location in frame on the x-axis, range (0, 1).
     * For example, x = 0.3 implies a pixel location of 0.3 * image_width.
     * </pre>
     *
     * <code>float x = 1 [json_name = "x"];</code>
     * @return The x.
     */
    @java.lang.Override
    public float getX() {
      return x_;
    }
    /**
     * <pre>
     * Frame-normalized location in frame on the x-axis, range (0, 1).
     * For example, x = 0.3 implies a pixel location of 0.3 * image_width.
     * </pre>
     *
     * <code>float x = 1 [json_name = "x"];</code>
     * @param value The x to set.
     * @return This builder for chaining.
     */
    public Builder setX(float value) {

      x_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Frame-normalized location in frame on the x-axis, range (0, 1).
     * For example, x = 0.3 implies a pixel location of 0.3 * image_width.
     * </pre>
     *
     * <code>float x = 1 [json_name = "x"];</code>
     * @return This builder for chaining.
     */
    public Builder clearX() {
      bitField0_ = (bitField0_ & ~0x00000001);
      x_ = 0F;
      onChanged();
      return this;
    }

    private float y_ ;
    /**
     * <pre>
     * Frame-normalized location in frame on the y-axis, range (0, 1).
     * For example, y = 0.3 implies a pixel location of 0.3 * image_height.
     * </pre>
     *
     * <code>float y = 2 [json_name = "y"];</code>
     * @return The y.
     */
    @java.lang.Override
    public float getY() {
      return y_;
    }
    /**
     * <pre>
     * Frame-normalized location in frame on the y-axis, range (0, 1).
     * For example, y = 0.3 implies a pixel location of 0.3 * image_height.
     * </pre>
     *
     * <code>float y = 2 [json_name = "y"];</code>
     * @param value The y to set.
     * @return This builder for chaining.
     */
    public Builder setY(float value) {

      y_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Frame-normalized location in frame on the y-axis, range (0, 1).
     * For example, y = 0.3 implies a pixel location of 0.3 * image_height.
     * </pre>
     *
     * <code>float y = 2 [json_name = "y"];</code>
     * @return This builder for chaining.
     */
    public Builder clearY() {
      bitField0_ = (bitField0_ & ~0x00000002);
      y_ = 0F;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp timestamp_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timestampBuilder_;
    /**
     * <pre>
     * Timestamp of frame
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 3 [json_name = "timestamp"];</code>
     * @return Whether the timestamp field is set.
     */
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Timestamp of frame
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 3 [json_name = "timestamp"];</code>
     * @return The timestamp.
     */
    public com.google.protobuf.Timestamp getTimestamp() {
      if (timestampBuilder_ == null) {
        return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
      } else {
        return timestampBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Timestamp of frame
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 3 [json_name = "timestamp"];</code>
     */
    public Builder setTimestamp(com.google.protobuf.Timestamp value) {
      if (timestampBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timestamp_ = value;
      } else {
        timestampBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Timestamp of frame
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 3 [json_name = "timestamp"];</code>
     */
    public Builder setTimestamp(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timestampBuilder_ == null) {
        timestamp_ = builderForValue.build();
      } else {
        timestampBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Timestamp of frame
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 3 [json_name = "timestamp"];</code>
     */
    public Builder mergeTimestamp(com.google.protobuf.Timestamp value) {
      if (timestampBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          timestamp_ != null &&
          timestamp_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getTimestampBuilder().mergeFrom(value);
        } else {
          timestamp_ = value;
        }
      } else {
        timestampBuilder_.mergeFrom(value);
      }
      if (timestamp_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Timestamp of frame
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 3 [json_name = "timestamp"];</code>
     */
    public Builder clearTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000004);
      timestamp_ = null;
      if (timestampBuilder_ != null) {
        timestampBuilder_.dispose();
        timestampBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Timestamp of frame
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 3 [json_name = "timestamp"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimestampBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getTimestampFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Timestamp of frame
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 3 [json_name = "timestamp"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder() {
      if (timestampBuilder_ != null) {
        return timestampBuilder_.getMessageOrBuilder();
      } else {
        return timestamp_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
      }
    }
    /**
     * <pre>
     * Timestamp of frame
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 3 [json_name = "timestamp"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimestampFieldBuilder() {
      if (timestampBuilder_ == null) {
        timestampBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTimestamp(),
                getParentForChildren(),
                isClean());
        timestamp_ = null;
      }
      return timestampBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.tasks.v2.FramePoint)
  }

  // @@protoc_insertion_point(class_scope:anduril.tasks.v2.FramePoint)
  private static final com.anduril.tasks.v2.FramePoint DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.tasks.v2.FramePoint();
  }

  public static com.anduril.tasks.v2.FramePoint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FramePoint>
      PARSER = new com.google.protobuf.AbstractParser<FramePoint>() {
    @java.lang.Override
    public FramePoint parsePartialFrom(
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

  public static com.google.protobuf.Parser<FramePoint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FramePoint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.tasks.v2.FramePoint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

