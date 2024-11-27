// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/type/coords.pub.proto

package com.anduril.type;

/**
 * <pre>
 * Yaw-Pitch in radians
 * </pre>
 *
 * Protobuf type {@code anduril.type.YawPitch}
 */
public final class YawPitch extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.type.YawPitch)
    YawPitchOrBuilder {
private static final long serialVersionUID = 0L;
  // Use YawPitch.newBuilder() to construct.
  private YawPitch(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private YawPitch() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new YawPitch();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.type.CoordsPubProto.internal_static_anduril_type_YawPitch_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.type.CoordsPubProto.internal_static_anduril_type_YawPitch_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.type.YawPitch.class, com.anduril.type.YawPitch.Builder.class);
  }

  public static final int YAW_FIELD_NUMBER = 1;
  private double yaw_ = 0D;
  /**
   * <code>double yaw = 1 [json_name = "yaw"];</code>
   * @return The yaw.
   */
  @java.lang.Override
  public double getYaw() {
    return yaw_;
  }

  public static final int PITCH_FIELD_NUMBER = 2;
  private double pitch_ = 0D;
  /**
   * <code>double pitch = 2 [json_name = "pitch"];</code>
   * @return The pitch.
   */
  @java.lang.Override
  public double getPitch() {
    return pitch_;
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
    if (java.lang.Double.doubleToRawLongBits(yaw_) != 0) {
      output.writeDouble(1, yaw_);
    }
    if (java.lang.Double.doubleToRawLongBits(pitch_) != 0) {
      output.writeDouble(2, pitch_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(yaw_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, yaw_);
    }
    if (java.lang.Double.doubleToRawLongBits(pitch_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, pitch_);
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
    if (!(obj instanceof com.anduril.type.YawPitch)) {
      return super.equals(obj);
    }
    com.anduril.type.YawPitch other = (com.anduril.type.YawPitch) obj;

    if (java.lang.Double.doubleToLongBits(getYaw())
        != java.lang.Double.doubleToLongBits(
            other.getYaw())) return false;
    if (java.lang.Double.doubleToLongBits(getPitch())
        != java.lang.Double.doubleToLongBits(
            other.getPitch())) return false;
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
    hash = (37 * hash) + YAW_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getYaw()));
    hash = (37 * hash) + PITCH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPitch()));
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.type.YawPitch parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.type.YawPitch parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.type.YawPitch parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.type.YawPitch parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.type.YawPitch parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.type.YawPitch parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.type.YawPitch parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.type.YawPitch parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.type.YawPitch parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.type.YawPitch parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.type.YawPitch parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.type.YawPitch parseFrom(
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
  public static Builder newBuilder(com.anduril.type.YawPitch prototype) {
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
   * Yaw-Pitch in radians
   * </pre>
   *
   * Protobuf type {@code anduril.type.YawPitch}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.type.YawPitch)
      com.anduril.type.YawPitchOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.type.CoordsPubProto.internal_static_anduril_type_YawPitch_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.type.CoordsPubProto.internal_static_anduril_type_YawPitch_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.type.YawPitch.class, com.anduril.type.YawPitch.Builder.class);
    }

    // Construct using com.anduril.type.YawPitch.newBuilder()
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
      yaw_ = 0D;
      pitch_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.type.CoordsPubProto.internal_static_anduril_type_YawPitch_descriptor;
    }

    @java.lang.Override
    public com.anduril.type.YawPitch getDefaultInstanceForType() {
      return com.anduril.type.YawPitch.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.type.YawPitch build() {
      com.anduril.type.YawPitch result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.type.YawPitch buildPartial() {
      com.anduril.type.YawPitch result = new com.anduril.type.YawPitch(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.type.YawPitch result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.yaw_ = yaw_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pitch_ = pitch_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.type.YawPitch) {
        return mergeFrom((com.anduril.type.YawPitch)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.type.YawPitch other) {
      if (other == com.anduril.type.YawPitch.getDefaultInstance()) return this;
      if (other.getYaw() != 0D) {
        setYaw(other.getYaw());
      }
      if (other.getPitch() != 0D) {
        setPitch(other.getPitch());
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
            case 9: {
              yaw_ = input.readDouble();
              bitField0_ |= 0x00000001;
              break;
            } // case 9
            case 17: {
              pitch_ = input.readDouble();
              bitField0_ |= 0x00000002;
              break;
            } // case 17
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

    private double yaw_ ;
    /**
     * <code>double yaw = 1 [json_name = "yaw"];</code>
     * @return The yaw.
     */
    @java.lang.Override
    public double getYaw() {
      return yaw_;
    }
    /**
     * <code>double yaw = 1 [json_name = "yaw"];</code>
     * @param value The yaw to set.
     * @return This builder for chaining.
     */
    public Builder setYaw(double value) {

      yaw_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>double yaw = 1 [json_name = "yaw"];</code>
     * @return This builder for chaining.
     */
    public Builder clearYaw() {
      bitField0_ = (bitField0_ & ~0x00000001);
      yaw_ = 0D;
      onChanged();
      return this;
    }

    private double pitch_ ;
    /**
     * <code>double pitch = 2 [json_name = "pitch"];</code>
     * @return The pitch.
     */
    @java.lang.Override
    public double getPitch() {
      return pitch_;
    }
    /**
     * <code>double pitch = 2 [json_name = "pitch"];</code>
     * @param value The pitch to set.
     * @return This builder for chaining.
     */
    public Builder setPitch(double value) {

      pitch_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>double pitch = 2 [json_name = "pitch"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPitch() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pitch_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:anduril.type.YawPitch)
  }

  // @@protoc_insertion_point(class_scope:anduril.type.YawPitch)
  private static final com.anduril.type.YawPitch DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.type.YawPitch();
  }

  public static com.anduril.type.YawPitch getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<YawPitch>
      PARSER = new com.google.protobuf.AbstractParser<YawPitch>() {
    @java.lang.Override
    public YawPitch parsePartialFrom(
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

  public static com.google.protobuf.Parser<YawPitch> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<YawPitch> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.type.YawPitch getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
