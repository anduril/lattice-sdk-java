// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/shared/isr.pub.proto

package com.anduril.tasks.v2;

/**
 * <pre>
 * Command for setting gimbal zoom levels.
 * </pre>
 *
 * Protobuf type {@code anduril.tasks.v2.GimbalZoom}
 */
public final class GimbalZoom extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.tasks.v2.GimbalZoom)
    GimbalZoomOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GimbalZoom.newBuilder() to construct.
  private GimbalZoom(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GimbalZoom() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GimbalZoom();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_GimbalZoom_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_GimbalZoom_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.tasks.v2.GimbalZoom.class, com.anduril.tasks.v2.GimbalZoom.Builder.class);
  }

  private int modeCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object mode_;
  public enum ModeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    SET_HORIZONTAL_FOV(1),
    SET_MAGNIFICATION(2),
    MODE_NOT_SET(0);
    private final int value;
    private ModeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ModeCase valueOf(int value) {
      return forNumber(value);
    }

    public static ModeCase forNumber(int value) {
      switch (value) {
        case 1: return SET_HORIZONTAL_FOV;
        case 2: return SET_MAGNIFICATION;
        case 0: return MODE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ModeCase
  getModeCase() {
    return ModeCase.forNumber(
        modeCase_);
  }

  public static final int SET_HORIZONTAL_FOV_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Set the zoom level to the provided horizontal field of view in degrees.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue set_horizontal_fov = 1 [json_name = "setHorizontalFov"];</code>
   * @return Whether the setHorizontalFov field is set.
   */
  @java.lang.Override
  public boolean hasSetHorizontalFov() {
    return modeCase_ == 1;
  }
  /**
   * <pre>
   * Set the zoom level to the provided horizontal field of view in degrees.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue set_horizontal_fov = 1 [json_name = "setHorizontalFov"];</code>
   * @return The setHorizontalFov.
   */
  @java.lang.Override
  public com.google.protobuf.DoubleValue getSetHorizontalFov() {
    if (modeCase_ == 1) {
       return (com.google.protobuf.DoubleValue) mode_;
    }
    return com.google.protobuf.DoubleValue.getDefaultInstance();
  }
  /**
   * <pre>
   * Set the zoom level to the provided horizontal field of view in degrees.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue set_horizontal_fov = 1 [json_name = "setHorizontalFov"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.DoubleValueOrBuilder getSetHorizontalFovOrBuilder() {
    if (modeCase_ == 1) {
       return (com.google.protobuf.DoubleValue) mode_;
    }
    return com.google.protobuf.DoubleValue.getDefaultInstance();
  }

  public static final int SET_MAGNIFICATION_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Set the zoom level to the provided zoom level.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue set_magnification = 2 [json_name = "setMagnification"];</code>
   * @return Whether the setMagnification field is set.
   */
  @java.lang.Override
  public boolean hasSetMagnification() {
    return modeCase_ == 2;
  }
  /**
   * <pre>
   * Set the zoom level to the provided zoom level.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue set_magnification = 2 [json_name = "setMagnification"];</code>
   * @return The setMagnification.
   */
  @java.lang.Override
  public com.google.protobuf.FloatValue getSetMagnification() {
    if (modeCase_ == 2) {
       return (com.google.protobuf.FloatValue) mode_;
    }
    return com.google.protobuf.FloatValue.getDefaultInstance();
  }
  /**
   * <pre>
   * Set the zoom level to the provided zoom level.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue set_magnification = 2 [json_name = "setMagnification"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FloatValueOrBuilder getSetMagnificationOrBuilder() {
    if (modeCase_ == 2) {
       return (com.google.protobuf.FloatValue) mode_;
    }
    return com.google.protobuf.FloatValue.getDefaultInstance();
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
    if (modeCase_ == 1) {
      output.writeMessage(1, (com.google.protobuf.DoubleValue) mode_);
    }
    if (modeCase_ == 2) {
      output.writeMessage(2, (com.google.protobuf.FloatValue) mode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (modeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.protobuf.DoubleValue) mode_);
    }
    if (modeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.protobuf.FloatValue) mode_);
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
    if (!(obj instanceof com.anduril.tasks.v2.GimbalZoom)) {
      return super.equals(obj);
    }
    com.anduril.tasks.v2.GimbalZoom other = (com.anduril.tasks.v2.GimbalZoom) obj;

    if (!getModeCase().equals(other.getModeCase())) return false;
    switch (modeCase_) {
      case 1:
        if (!getSetHorizontalFov()
            .equals(other.getSetHorizontalFov())) return false;
        break;
      case 2:
        if (!getSetMagnification()
            .equals(other.getSetMagnification())) return false;
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
    switch (modeCase_) {
      case 1:
        hash = (37 * hash) + SET_HORIZONTAL_FOV_FIELD_NUMBER;
        hash = (53 * hash) + getSetHorizontalFov().hashCode();
        break;
      case 2:
        hash = (37 * hash) + SET_MAGNIFICATION_FIELD_NUMBER;
        hash = (53 * hash) + getSetMagnification().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.tasks.v2.GimbalZoom parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.GimbalZoom parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.GimbalZoom parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.GimbalZoom parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.GimbalZoom parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.GimbalZoom parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.GimbalZoom parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.GimbalZoom parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.tasks.v2.GimbalZoom parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.GimbalZoom parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.tasks.v2.GimbalZoom parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.GimbalZoom parseFrom(
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
  public static Builder newBuilder(com.anduril.tasks.v2.GimbalZoom prototype) {
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
   * Command for setting gimbal zoom levels.
   * </pre>
   *
   * Protobuf type {@code anduril.tasks.v2.GimbalZoom}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.tasks.v2.GimbalZoom)
      com.anduril.tasks.v2.GimbalZoomOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_GimbalZoom_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_GimbalZoom_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.tasks.v2.GimbalZoom.class, com.anduril.tasks.v2.GimbalZoom.Builder.class);
    }

    // Construct using com.anduril.tasks.v2.GimbalZoom.newBuilder()
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
      if (setHorizontalFovBuilder_ != null) {
        setHorizontalFovBuilder_.clear();
      }
      if (setMagnificationBuilder_ != null) {
        setMagnificationBuilder_.clear();
      }
      modeCase_ = 0;
      mode_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_GimbalZoom_descriptor;
    }

    @java.lang.Override
    public com.anduril.tasks.v2.GimbalZoom getDefaultInstanceForType() {
      return com.anduril.tasks.v2.GimbalZoom.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.tasks.v2.GimbalZoom build() {
      com.anduril.tasks.v2.GimbalZoom result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.tasks.v2.GimbalZoom buildPartial() {
      com.anduril.tasks.v2.GimbalZoom result = new com.anduril.tasks.v2.GimbalZoom(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.tasks.v2.GimbalZoom result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.anduril.tasks.v2.GimbalZoom result) {
      result.modeCase_ = modeCase_;
      result.mode_ = this.mode_;
      if (modeCase_ == 1 &&
          setHorizontalFovBuilder_ != null) {
        result.mode_ = setHorizontalFovBuilder_.build();
      }
      if (modeCase_ == 2 &&
          setMagnificationBuilder_ != null) {
        result.mode_ = setMagnificationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.tasks.v2.GimbalZoom) {
        return mergeFrom((com.anduril.tasks.v2.GimbalZoom)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.tasks.v2.GimbalZoom other) {
      if (other == com.anduril.tasks.v2.GimbalZoom.getDefaultInstance()) return this;
      switch (other.getModeCase()) {
        case SET_HORIZONTAL_FOV: {
          mergeSetHorizontalFov(other.getSetHorizontalFov());
          break;
        }
        case SET_MAGNIFICATION: {
          mergeSetMagnification(other.getSetMagnification());
          break;
        }
        case MODE_NOT_SET: {
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
                  getSetHorizontalFovFieldBuilder().getBuilder(),
                  extensionRegistry);
              modeCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getSetMagnificationFieldBuilder().getBuilder(),
                  extensionRegistry);
              modeCase_ = 2;
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
    private int modeCase_ = 0;
    private java.lang.Object mode_;
    public ModeCase
        getModeCase() {
      return ModeCase.forNumber(
          modeCase_);
    }

    public Builder clearMode() {
      modeCase_ = 0;
      mode_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> setHorizontalFovBuilder_;
    /**
     * <pre>
     * Set the zoom level to the provided horizontal field of view in degrees.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue set_horizontal_fov = 1 [json_name = "setHorizontalFov"];</code>
     * @return Whether the setHorizontalFov field is set.
     */
    @java.lang.Override
    public boolean hasSetHorizontalFov() {
      return modeCase_ == 1;
    }
    /**
     * <pre>
     * Set the zoom level to the provided horizontal field of view in degrees.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue set_horizontal_fov = 1 [json_name = "setHorizontalFov"];</code>
     * @return The setHorizontalFov.
     */
    @java.lang.Override
    public com.google.protobuf.DoubleValue getSetHorizontalFov() {
      if (setHorizontalFovBuilder_ == null) {
        if (modeCase_ == 1) {
          return (com.google.protobuf.DoubleValue) mode_;
        }
        return com.google.protobuf.DoubleValue.getDefaultInstance();
      } else {
        if (modeCase_ == 1) {
          return setHorizontalFovBuilder_.getMessage();
        }
        return com.google.protobuf.DoubleValue.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Set the zoom level to the provided horizontal field of view in degrees.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue set_horizontal_fov = 1 [json_name = "setHorizontalFov"];</code>
     */
    public Builder setSetHorizontalFov(com.google.protobuf.DoubleValue value) {
      if (setHorizontalFovBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mode_ = value;
        onChanged();
      } else {
        setHorizontalFovBuilder_.setMessage(value);
      }
      modeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Set the zoom level to the provided horizontal field of view in degrees.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue set_horizontal_fov = 1 [json_name = "setHorizontalFov"];</code>
     */
    public Builder setSetHorizontalFov(
        com.google.protobuf.DoubleValue.Builder builderForValue) {
      if (setHorizontalFovBuilder_ == null) {
        mode_ = builderForValue.build();
        onChanged();
      } else {
        setHorizontalFovBuilder_.setMessage(builderForValue.build());
      }
      modeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Set the zoom level to the provided horizontal field of view in degrees.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue set_horizontal_fov = 1 [json_name = "setHorizontalFov"];</code>
     */
    public Builder mergeSetHorizontalFov(com.google.protobuf.DoubleValue value) {
      if (setHorizontalFovBuilder_ == null) {
        if (modeCase_ == 1 &&
            mode_ != com.google.protobuf.DoubleValue.getDefaultInstance()) {
          mode_ = com.google.protobuf.DoubleValue.newBuilder((com.google.protobuf.DoubleValue) mode_)
              .mergeFrom(value).buildPartial();
        } else {
          mode_ = value;
        }
        onChanged();
      } else {
        if (modeCase_ == 1) {
          setHorizontalFovBuilder_.mergeFrom(value);
        } else {
          setHorizontalFovBuilder_.setMessage(value);
        }
      }
      modeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Set the zoom level to the provided horizontal field of view in degrees.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue set_horizontal_fov = 1 [json_name = "setHorizontalFov"];</code>
     */
    public Builder clearSetHorizontalFov() {
      if (setHorizontalFovBuilder_ == null) {
        if (modeCase_ == 1) {
          modeCase_ = 0;
          mode_ = null;
          onChanged();
        }
      } else {
        if (modeCase_ == 1) {
          modeCase_ = 0;
          mode_ = null;
        }
        setHorizontalFovBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Set the zoom level to the provided horizontal field of view in degrees.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue set_horizontal_fov = 1 [json_name = "setHorizontalFov"];</code>
     */
    public com.google.protobuf.DoubleValue.Builder getSetHorizontalFovBuilder() {
      return getSetHorizontalFovFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Set the zoom level to the provided horizontal field of view in degrees.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue set_horizontal_fov = 1 [json_name = "setHorizontalFov"];</code>
     */
    @java.lang.Override
    public com.google.protobuf.DoubleValueOrBuilder getSetHorizontalFovOrBuilder() {
      if ((modeCase_ == 1) && (setHorizontalFovBuilder_ != null)) {
        return setHorizontalFovBuilder_.getMessageOrBuilder();
      } else {
        if (modeCase_ == 1) {
          return (com.google.protobuf.DoubleValue) mode_;
        }
        return com.google.protobuf.DoubleValue.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Set the zoom level to the provided horizontal field of view in degrees.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue set_horizontal_fov = 1 [json_name = "setHorizontalFov"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> 
        getSetHorizontalFovFieldBuilder() {
      if (setHorizontalFovBuilder_ == null) {
        if (!(modeCase_ == 1)) {
          mode_ = com.google.protobuf.DoubleValue.getDefaultInstance();
        }
        setHorizontalFovBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder>(
                (com.google.protobuf.DoubleValue) mode_,
                getParentForChildren(),
                isClean());
        mode_ = null;
      }
      modeCase_ = 1;
      onChanged();
      return setHorizontalFovBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FloatValue, com.google.protobuf.FloatValue.Builder, com.google.protobuf.FloatValueOrBuilder> setMagnificationBuilder_;
    /**
     * <pre>
     * Set the zoom level to the provided zoom level.
     * </pre>
     *
     * <code>.google.protobuf.FloatValue set_magnification = 2 [json_name = "setMagnification"];</code>
     * @return Whether the setMagnification field is set.
     */
    @java.lang.Override
    public boolean hasSetMagnification() {
      return modeCase_ == 2;
    }
    /**
     * <pre>
     * Set the zoom level to the provided zoom level.
     * </pre>
     *
     * <code>.google.protobuf.FloatValue set_magnification = 2 [json_name = "setMagnification"];</code>
     * @return The setMagnification.
     */
    @java.lang.Override
    public com.google.protobuf.FloatValue getSetMagnification() {
      if (setMagnificationBuilder_ == null) {
        if (modeCase_ == 2) {
          return (com.google.protobuf.FloatValue) mode_;
        }
        return com.google.protobuf.FloatValue.getDefaultInstance();
      } else {
        if (modeCase_ == 2) {
          return setMagnificationBuilder_.getMessage();
        }
        return com.google.protobuf.FloatValue.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Set the zoom level to the provided zoom level.
     * </pre>
     *
     * <code>.google.protobuf.FloatValue set_magnification = 2 [json_name = "setMagnification"];</code>
     */
    public Builder setSetMagnification(com.google.protobuf.FloatValue value) {
      if (setMagnificationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mode_ = value;
        onChanged();
      } else {
        setMagnificationBuilder_.setMessage(value);
      }
      modeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Set the zoom level to the provided zoom level.
     * </pre>
     *
     * <code>.google.protobuf.FloatValue set_magnification = 2 [json_name = "setMagnification"];</code>
     */
    public Builder setSetMagnification(
        com.google.protobuf.FloatValue.Builder builderForValue) {
      if (setMagnificationBuilder_ == null) {
        mode_ = builderForValue.build();
        onChanged();
      } else {
        setMagnificationBuilder_.setMessage(builderForValue.build());
      }
      modeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Set the zoom level to the provided zoom level.
     * </pre>
     *
     * <code>.google.protobuf.FloatValue set_magnification = 2 [json_name = "setMagnification"];</code>
     */
    public Builder mergeSetMagnification(com.google.protobuf.FloatValue value) {
      if (setMagnificationBuilder_ == null) {
        if (modeCase_ == 2 &&
            mode_ != com.google.protobuf.FloatValue.getDefaultInstance()) {
          mode_ = com.google.protobuf.FloatValue.newBuilder((com.google.protobuf.FloatValue) mode_)
              .mergeFrom(value).buildPartial();
        } else {
          mode_ = value;
        }
        onChanged();
      } else {
        if (modeCase_ == 2) {
          setMagnificationBuilder_.mergeFrom(value);
        } else {
          setMagnificationBuilder_.setMessage(value);
        }
      }
      modeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Set the zoom level to the provided zoom level.
     * </pre>
     *
     * <code>.google.protobuf.FloatValue set_magnification = 2 [json_name = "setMagnification"];</code>
     */
    public Builder clearSetMagnification() {
      if (setMagnificationBuilder_ == null) {
        if (modeCase_ == 2) {
          modeCase_ = 0;
          mode_ = null;
          onChanged();
        }
      } else {
        if (modeCase_ == 2) {
          modeCase_ = 0;
          mode_ = null;
        }
        setMagnificationBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Set the zoom level to the provided zoom level.
     * </pre>
     *
     * <code>.google.protobuf.FloatValue set_magnification = 2 [json_name = "setMagnification"];</code>
     */
    public com.google.protobuf.FloatValue.Builder getSetMagnificationBuilder() {
      return getSetMagnificationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Set the zoom level to the provided zoom level.
     * </pre>
     *
     * <code>.google.protobuf.FloatValue set_magnification = 2 [json_name = "setMagnification"];</code>
     */
    @java.lang.Override
    public com.google.protobuf.FloatValueOrBuilder getSetMagnificationOrBuilder() {
      if ((modeCase_ == 2) && (setMagnificationBuilder_ != null)) {
        return setMagnificationBuilder_.getMessageOrBuilder();
      } else {
        if (modeCase_ == 2) {
          return (com.google.protobuf.FloatValue) mode_;
        }
        return com.google.protobuf.FloatValue.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Set the zoom level to the provided zoom level.
     * </pre>
     *
     * <code>.google.protobuf.FloatValue set_magnification = 2 [json_name = "setMagnification"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FloatValue, com.google.protobuf.FloatValue.Builder, com.google.protobuf.FloatValueOrBuilder> 
        getSetMagnificationFieldBuilder() {
      if (setMagnificationBuilder_ == null) {
        if (!(modeCase_ == 2)) {
          mode_ = com.google.protobuf.FloatValue.getDefaultInstance();
        }
        setMagnificationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FloatValue, com.google.protobuf.FloatValue.Builder, com.google.protobuf.FloatValueOrBuilder>(
                (com.google.protobuf.FloatValue) mode_,
                getParentForChildren(),
                isClean());
        mode_ = null;
      }
      modeCase_ = 2;
      onChanged();
      return setMagnificationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.tasks.v2.GimbalZoom)
  }

  // @@protoc_insertion_point(class_scope:anduril.tasks.v2.GimbalZoom)
  private static final com.anduril.tasks.v2.GimbalZoom DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.tasks.v2.GimbalZoom();
  }

  public static com.anduril.tasks.v2.GimbalZoom getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GimbalZoom>
      PARSER = new com.google.protobuf.AbstractParser<GimbalZoom>() {
    @java.lang.Override
    public GimbalZoom parsePartialFrom(
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

  public static com.google.protobuf.Parser<GimbalZoom> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GimbalZoom> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.tasks.v2.GimbalZoom getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
