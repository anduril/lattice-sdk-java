// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/type/color.pub.proto

package com.anduril.type;

/**
 * Protobuf type {@code anduril.type.Color}
 */
public final class Color extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.type.Color)
    ColorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Color.newBuilder() to construct.
  private Color(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Color() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Color();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.type.ColorPubProto.internal_static_anduril_type_Color_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.type.ColorPubProto.internal_static_anduril_type_Color_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.type.Color.class, com.anduril.type.Color.Builder.class);
  }

  public static final int RED_FIELD_NUMBER = 1;
  private float red_ = 0F;
  /**
   * <pre>
   * The amount of red in the color as a value in the interval [0, 1].
   * </pre>
   *
   * <code>float red = 1 [json_name = "red"];</code>
   * @return The red.
   */
  @java.lang.Override
  public float getRed() {
    return red_;
  }

  public static final int GREEN_FIELD_NUMBER = 2;
  private float green_ = 0F;
  /**
   * <pre>
   * The amount of green in the color as a value in the interval [0, 1].
   * </pre>
   *
   * <code>float green = 2 [json_name = "green"];</code>
   * @return The green.
   */
  @java.lang.Override
  public float getGreen() {
    return green_;
  }

  public static final int BLUE_FIELD_NUMBER = 3;
  private float blue_ = 0F;
  /**
   * <pre>
   * The amount of blue in the color as a value in the interval [0, 1].
   * </pre>
   *
   * <code>float blue = 3 [json_name = "blue"];</code>
   * @return The blue.
   */
  @java.lang.Override
  public float getBlue() {
    return blue_;
  }

  public static final int ALPHA_FIELD_NUMBER = 4;
  private com.google.protobuf.FloatValue alpha_;
  /**
   * <pre>
   * The fraction of this color that should be applied to the pixel. That is,
   * the final pixel color is defined by the equation:
   *
   * `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
   *
   * This means that a value of 1.0 corresponds to a solid color, whereas
   * a value of 0.0 corresponds to a completely transparent color. This
   * uses a wrapper message rather than a simple float scalar so that it is
   * possible to distinguish between a default value and the value being unset.
   * If omitted, this color object is rendered as a solid color
   * (as if the alpha value had been explicitly given a value of 1.0).
   * </pre>
   *
   * <code>.google.protobuf.FloatValue alpha = 4 [json_name = "alpha"];</code>
   * @return Whether the alpha field is set.
   */
  @java.lang.Override
  public boolean hasAlpha() {
    return alpha_ != null;
  }
  /**
   * <pre>
   * The fraction of this color that should be applied to the pixel. That is,
   * the final pixel color is defined by the equation:
   *
   * `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
   *
   * This means that a value of 1.0 corresponds to a solid color, whereas
   * a value of 0.0 corresponds to a completely transparent color. This
   * uses a wrapper message rather than a simple float scalar so that it is
   * possible to distinguish between a default value and the value being unset.
   * If omitted, this color object is rendered as a solid color
   * (as if the alpha value had been explicitly given a value of 1.0).
   * </pre>
   *
   * <code>.google.protobuf.FloatValue alpha = 4 [json_name = "alpha"];</code>
   * @return The alpha.
   */
  @java.lang.Override
  public com.google.protobuf.FloatValue getAlpha() {
    return alpha_ == null ? com.google.protobuf.FloatValue.getDefaultInstance() : alpha_;
  }
  /**
   * <pre>
   * The fraction of this color that should be applied to the pixel. That is,
   * the final pixel color is defined by the equation:
   *
   * `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
   *
   * This means that a value of 1.0 corresponds to a solid color, whereas
   * a value of 0.0 corresponds to a completely transparent color. This
   * uses a wrapper message rather than a simple float scalar so that it is
   * possible to distinguish between a default value and the value being unset.
   * If omitted, this color object is rendered as a solid color
   * (as if the alpha value had been explicitly given a value of 1.0).
   * </pre>
   *
   * <code>.google.protobuf.FloatValue alpha = 4 [json_name = "alpha"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FloatValueOrBuilder getAlphaOrBuilder() {
    return alpha_ == null ? com.google.protobuf.FloatValue.getDefaultInstance() : alpha_;
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
    if (java.lang.Float.floatToRawIntBits(red_) != 0) {
      output.writeFloat(1, red_);
    }
    if (java.lang.Float.floatToRawIntBits(green_) != 0) {
      output.writeFloat(2, green_);
    }
    if (java.lang.Float.floatToRawIntBits(blue_) != 0) {
      output.writeFloat(3, blue_);
    }
    if (alpha_ != null) {
      output.writeMessage(4, getAlpha());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(red_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, red_);
    }
    if (java.lang.Float.floatToRawIntBits(green_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, green_);
    }
    if (java.lang.Float.floatToRawIntBits(blue_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, blue_);
    }
    if (alpha_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getAlpha());
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
    if (!(obj instanceof com.anduril.type.Color)) {
      return super.equals(obj);
    }
    com.anduril.type.Color other = (com.anduril.type.Color) obj;

    if (java.lang.Float.floatToIntBits(getRed())
        != java.lang.Float.floatToIntBits(
            other.getRed())) return false;
    if (java.lang.Float.floatToIntBits(getGreen())
        != java.lang.Float.floatToIntBits(
            other.getGreen())) return false;
    if (java.lang.Float.floatToIntBits(getBlue())
        != java.lang.Float.floatToIntBits(
            other.getBlue())) return false;
    if (hasAlpha() != other.hasAlpha()) return false;
    if (hasAlpha()) {
      if (!getAlpha()
          .equals(other.getAlpha())) return false;
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
    hash = (37 * hash) + RED_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getRed());
    hash = (37 * hash) + GREEN_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getGreen());
    hash = (37 * hash) + BLUE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getBlue());
    if (hasAlpha()) {
      hash = (37 * hash) + ALPHA_FIELD_NUMBER;
      hash = (53 * hash) + getAlpha().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.type.Color parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.type.Color parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.type.Color parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.type.Color parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.type.Color parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.type.Color parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.type.Color parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.type.Color parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.type.Color parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.type.Color parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.type.Color parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.type.Color parseFrom(
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
  public static Builder newBuilder(com.anduril.type.Color prototype) {
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
   * Protobuf type {@code anduril.type.Color}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.type.Color)
      com.anduril.type.ColorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.type.ColorPubProto.internal_static_anduril_type_Color_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.type.ColorPubProto.internal_static_anduril_type_Color_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.type.Color.class, com.anduril.type.Color.Builder.class);
    }

    // Construct using com.anduril.type.Color.newBuilder()
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
      red_ = 0F;
      green_ = 0F;
      blue_ = 0F;
      alpha_ = null;
      if (alphaBuilder_ != null) {
        alphaBuilder_.dispose();
        alphaBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.type.ColorPubProto.internal_static_anduril_type_Color_descriptor;
    }

    @java.lang.Override
    public com.anduril.type.Color getDefaultInstanceForType() {
      return com.anduril.type.Color.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.type.Color build() {
      com.anduril.type.Color result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.type.Color buildPartial() {
      com.anduril.type.Color result = new com.anduril.type.Color(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.type.Color result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.red_ = red_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.green_ = green_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.blue_ = blue_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.alpha_ = alphaBuilder_ == null
            ? alpha_
            : alphaBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.type.Color) {
        return mergeFrom((com.anduril.type.Color)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.type.Color other) {
      if (other == com.anduril.type.Color.getDefaultInstance()) return this;
      if (other.getRed() != 0F) {
        setRed(other.getRed());
      }
      if (other.getGreen() != 0F) {
        setGreen(other.getGreen());
      }
      if (other.getBlue() != 0F) {
        setBlue(other.getBlue());
      }
      if (other.hasAlpha()) {
        mergeAlpha(other.getAlpha());
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
              red_ = input.readFloat();
              bitField0_ |= 0x00000001;
              break;
            } // case 13
            case 21: {
              green_ = input.readFloat();
              bitField0_ |= 0x00000002;
              break;
            } // case 21
            case 29: {
              blue_ = input.readFloat();
              bitField0_ |= 0x00000004;
              break;
            } // case 29
            case 34: {
              input.readMessage(
                  getAlphaFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
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

    private float red_ ;
    /**
     * <pre>
     * The amount of red in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float red = 1 [json_name = "red"];</code>
     * @return The red.
     */
    @java.lang.Override
    public float getRed() {
      return red_;
    }
    /**
     * <pre>
     * The amount of red in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float red = 1 [json_name = "red"];</code>
     * @param value The red to set.
     * @return This builder for chaining.
     */
    public Builder setRed(float value) {

      red_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The amount of red in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float red = 1 [json_name = "red"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRed() {
      bitField0_ = (bitField0_ & ~0x00000001);
      red_ = 0F;
      onChanged();
      return this;
    }

    private float green_ ;
    /**
     * <pre>
     * The amount of green in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float green = 2 [json_name = "green"];</code>
     * @return The green.
     */
    @java.lang.Override
    public float getGreen() {
      return green_;
    }
    /**
     * <pre>
     * The amount of green in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float green = 2 [json_name = "green"];</code>
     * @param value The green to set.
     * @return This builder for chaining.
     */
    public Builder setGreen(float value) {

      green_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The amount of green in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float green = 2 [json_name = "green"];</code>
     * @return This builder for chaining.
     */
    public Builder clearGreen() {
      bitField0_ = (bitField0_ & ~0x00000002);
      green_ = 0F;
      onChanged();
      return this;
    }

    private float blue_ ;
    /**
     * <pre>
     * The amount of blue in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float blue = 3 [json_name = "blue"];</code>
     * @return The blue.
     */
    @java.lang.Override
    public float getBlue() {
      return blue_;
    }
    /**
     * <pre>
     * The amount of blue in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float blue = 3 [json_name = "blue"];</code>
     * @param value The blue to set.
     * @return This builder for chaining.
     */
    public Builder setBlue(float value) {

      blue_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The amount of blue in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float blue = 3 [json_name = "blue"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBlue() {
      bitField0_ = (bitField0_ & ~0x00000004);
      blue_ = 0F;
      onChanged();
      return this;
    }

    private com.google.protobuf.FloatValue alpha_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FloatValue, com.google.protobuf.FloatValue.Builder, com.google.protobuf.FloatValueOrBuilder> alphaBuilder_;
    /**
     * <pre>
     * The fraction of this color that should be applied to the pixel. That is,
     * the final pixel color is defined by the equation:
     *
     * `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
     *
     * This means that a value of 1.0 corresponds to a solid color, whereas
     * a value of 0.0 corresponds to a completely transparent color. This
     * uses a wrapper message rather than a simple float scalar so that it is
     * possible to distinguish between a default value and the value being unset.
     * If omitted, this color object is rendered as a solid color
     * (as if the alpha value had been explicitly given a value of 1.0).
     * </pre>
     *
     * <code>.google.protobuf.FloatValue alpha = 4 [json_name = "alpha"];</code>
     * @return Whether the alpha field is set.
     */
    public boolean hasAlpha() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * The fraction of this color that should be applied to the pixel. That is,
     * the final pixel color is defined by the equation:
     *
     * `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
     *
     * This means that a value of 1.0 corresponds to a solid color, whereas
     * a value of 0.0 corresponds to a completely transparent color. This
     * uses a wrapper message rather than a simple float scalar so that it is
     * possible to distinguish between a default value and the value being unset.
     * If omitted, this color object is rendered as a solid color
     * (as if the alpha value had been explicitly given a value of 1.0).
     * </pre>
     *
     * <code>.google.protobuf.FloatValue alpha = 4 [json_name = "alpha"];</code>
     * @return The alpha.
     */
    public com.google.protobuf.FloatValue getAlpha() {
      if (alphaBuilder_ == null) {
        return alpha_ == null ? com.google.protobuf.FloatValue.getDefaultInstance() : alpha_;
      } else {
        return alphaBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The fraction of this color that should be applied to the pixel. That is,
     * the final pixel color is defined by the equation:
     *
     * `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
     *
     * This means that a value of 1.0 corresponds to a solid color, whereas
     * a value of 0.0 corresponds to a completely transparent color. This
     * uses a wrapper message rather than a simple float scalar so that it is
     * possible to distinguish between a default value and the value being unset.
     * If omitted, this color object is rendered as a solid color
     * (as if the alpha value had been explicitly given a value of 1.0).
     * </pre>
     *
     * <code>.google.protobuf.FloatValue alpha = 4 [json_name = "alpha"];</code>
     */
    public Builder setAlpha(com.google.protobuf.FloatValue value) {
      if (alphaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        alpha_ = value;
      } else {
        alphaBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fraction of this color that should be applied to the pixel. That is,
     * the final pixel color is defined by the equation:
     *
     * `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
     *
     * This means that a value of 1.0 corresponds to a solid color, whereas
     * a value of 0.0 corresponds to a completely transparent color. This
     * uses a wrapper message rather than a simple float scalar so that it is
     * possible to distinguish between a default value and the value being unset.
     * If omitted, this color object is rendered as a solid color
     * (as if the alpha value had been explicitly given a value of 1.0).
     * </pre>
     *
     * <code>.google.protobuf.FloatValue alpha = 4 [json_name = "alpha"];</code>
     */
    public Builder setAlpha(
        com.google.protobuf.FloatValue.Builder builderForValue) {
      if (alphaBuilder_ == null) {
        alpha_ = builderForValue.build();
      } else {
        alphaBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fraction of this color that should be applied to the pixel. That is,
     * the final pixel color is defined by the equation:
     *
     * `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
     *
     * This means that a value of 1.0 corresponds to a solid color, whereas
     * a value of 0.0 corresponds to a completely transparent color. This
     * uses a wrapper message rather than a simple float scalar so that it is
     * possible to distinguish between a default value and the value being unset.
     * If omitted, this color object is rendered as a solid color
     * (as if the alpha value had been explicitly given a value of 1.0).
     * </pre>
     *
     * <code>.google.protobuf.FloatValue alpha = 4 [json_name = "alpha"];</code>
     */
    public Builder mergeAlpha(com.google.protobuf.FloatValue value) {
      if (alphaBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          alpha_ != null &&
          alpha_ != com.google.protobuf.FloatValue.getDefaultInstance()) {
          getAlphaBuilder().mergeFrom(value);
        } else {
          alpha_ = value;
        }
      } else {
        alphaBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fraction of this color that should be applied to the pixel. That is,
     * the final pixel color is defined by the equation:
     *
     * `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
     *
     * This means that a value of 1.0 corresponds to a solid color, whereas
     * a value of 0.0 corresponds to a completely transparent color. This
     * uses a wrapper message rather than a simple float scalar so that it is
     * possible to distinguish between a default value and the value being unset.
     * If omitted, this color object is rendered as a solid color
     * (as if the alpha value had been explicitly given a value of 1.0).
     * </pre>
     *
     * <code>.google.protobuf.FloatValue alpha = 4 [json_name = "alpha"];</code>
     */
    public Builder clearAlpha() {
      bitField0_ = (bitField0_ & ~0x00000008);
      alpha_ = null;
      if (alphaBuilder_ != null) {
        alphaBuilder_.dispose();
        alphaBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fraction of this color that should be applied to the pixel. That is,
     * the final pixel color is defined by the equation:
     *
     * `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
     *
     * This means that a value of 1.0 corresponds to a solid color, whereas
     * a value of 0.0 corresponds to a completely transparent color. This
     * uses a wrapper message rather than a simple float scalar so that it is
     * possible to distinguish between a default value and the value being unset.
     * If omitted, this color object is rendered as a solid color
     * (as if the alpha value had been explicitly given a value of 1.0).
     * </pre>
     *
     * <code>.google.protobuf.FloatValue alpha = 4 [json_name = "alpha"];</code>
     */
    public com.google.protobuf.FloatValue.Builder getAlphaBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getAlphaFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The fraction of this color that should be applied to the pixel. That is,
     * the final pixel color is defined by the equation:
     *
     * `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
     *
     * This means that a value of 1.0 corresponds to a solid color, whereas
     * a value of 0.0 corresponds to a completely transparent color. This
     * uses a wrapper message rather than a simple float scalar so that it is
     * possible to distinguish between a default value and the value being unset.
     * If omitted, this color object is rendered as a solid color
     * (as if the alpha value had been explicitly given a value of 1.0).
     * </pre>
     *
     * <code>.google.protobuf.FloatValue alpha = 4 [json_name = "alpha"];</code>
     */
    public com.google.protobuf.FloatValueOrBuilder getAlphaOrBuilder() {
      if (alphaBuilder_ != null) {
        return alphaBuilder_.getMessageOrBuilder();
      } else {
        return alpha_ == null ?
            com.google.protobuf.FloatValue.getDefaultInstance() : alpha_;
      }
    }
    /**
     * <pre>
     * The fraction of this color that should be applied to the pixel. That is,
     * the final pixel color is defined by the equation:
     *
     * `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
     *
     * This means that a value of 1.0 corresponds to a solid color, whereas
     * a value of 0.0 corresponds to a completely transparent color. This
     * uses a wrapper message rather than a simple float scalar so that it is
     * possible to distinguish between a default value and the value being unset.
     * If omitted, this color object is rendered as a solid color
     * (as if the alpha value had been explicitly given a value of 1.0).
     * </pre>
     *
     * <code>.google.protobuf.FloatValue alpha = 4 [json_name = "alpha"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FloatValue, com.google.protobuf.FloatValue.Builder, com.google.protobuf.FloatValueOrBuilder> 
        getAlphaFieldBuilder() {
      if (alphaBuilder_ == null) {
        alphaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FloatValue, com.google.protobuf.FloatValue.Builder, com.google.protobuf.FloatValueOrBuilder>(
                getAlpha(),
                getParentForChildren(),
                isClean());
        alpha_ = null;
      }
      return alphaBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.type.Color)
  }

  // @@protoc_insertion_point(class_scope:anduril.type.Color)
  private static final com.anduril.type.Color DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.type.Color();
  }

  public static com.anduril.type.Color getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Color>
      PARSER = new com.google.protobuf.AbstractParser<Color>() {
    @java.lang.Override
    public Color parsePartialFrom(
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

  public static com.google.protobuf.Parser<Color> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Color> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.type.Color getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

