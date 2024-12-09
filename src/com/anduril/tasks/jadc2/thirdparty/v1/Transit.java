// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/jadc2/thirdparty/v1/transit.pub.proto

package com.anduril.tasks.jadc2.thirdparty.v1;

/**
 * <pre>
 * Transit represents moving a vehicle on a path through one or more points.
 * </pre>
 *
 * Protobuf type {@code anduril.tasks.jadc2.thirdparty.v1.Transit}
 */
public final class Transit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.tasks.jadc2.thirdparty.v1.Transit)
    TransitOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Transit.newBuilder() to construct.
  private Transit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Transit() {
    path_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Transit();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.tasks.jadc2.thirdparty.v1.TransitPubProto.internal_static_anduril_tasks_jadc2_thirdparty_v1_Transit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.tasks.jadc2.thirdparty.v1.TransitPubProto.internal_static_anduril_tasks_jadc2_thirdparty_v1_Transit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.tasks.jadc2.thirdparty.v1.Transit.class, com.anduril.tasks.jadc2.thirdparty.v1.Transit.Builder.class);
  }

  public static final int PATH_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.anduril.tasks.jadc2.thirdparty.v1.PathSegment> path_;
  /**
   * <pre>
   * The path consisting of all segments to be taken for this transit task.
   * </pre>
   *
   * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
   */
  @java.lang.Override
  public java.util.List<com.anduril.tasks.jadc2.thirdparty.v1.PathSegment> getPathList() {
    return path_;
  }
  /**
   * <pre>
   * The path consisting of all segments to be taken for this transit task.
   * </pre>
   *
   * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.anduril.tasks.jadc2.thirdparty.v1.PathSegmentOrBuilder> 
      getPathOrBuilderList() {
    return path_;
  }
  /**
   * <pre>
   * The path consisting of all segments to be taken for this transit task.
   * </pre>
   *
   * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
   */
  @java.lang.Override
  public int getPathCount() {
    return path_.size();
  }
  /**
   * <pre>
   * The path consisting of all segments to be taken for this transit task.
   * </pre>
   *
   * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
   */
  @java.lang.Override
  public com.anduril.tasks.jadc2.thirdparty.v1.PathSegment getPath(int index) {
    return path_.get(index);
  }
  /**
   * <pre>
   * The path consisting of all segments to be taken for this transit task.
   * </pre>
   *
   * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
   */
  @java.lang.Override
  public com.anduril.tasks.jadc2.thirdparty.v1.PathSegmentOrBuilder getPathOrBuilder(
      int index) {
    return path_.get(index);
  }

  public static final int SURFACE_SPEED_MS_FIELD_NUMBER = 2;
  private com.google.protobuf.DoubleValue surfaceSpeedMs_;
  /**
   * <pre>
   * Speed in which the vehicle will move through each of the path segments.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue surface_speed_ms = 2 [json_name = "surfaceSpeedMs"];</code>
   * @return Whether the surfaceSpeedMs field is set.
   */
  @java.lang.Override
  public boolean hasSurfaceSpeedMs() {
    return surfaceSpeedMs_ != null;
  }
  /**
   * <pre>
   * Speed in which the vehicle will move through each of the path segments.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue surface_speed_ms = 2 [json_name = "surfaceSpeedMs"];</code>
   * @return The surfaceSpeedMs.
   */
  @java.lang.Override
  public com.google.protobuf.DoubleValue getSurfaceSpeedMs() {
    return surfaceSpeedMs_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : surfaceSpeedMs_;
  }
  /**
   * <pre>
   * Speed in which the vehicle will move through each of the path segments.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue surface_speed_ms = 2 [json_name = "surfaceSpeedMs"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.DoubleValueOrBuilder getSurfaceSpeedMsOrBuilder() {
    return surfaceSpeedMs_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : surfaceSpeedMs_;
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
    for (int i = 0; i < path_.size(); i++) {
      output.writeMessage(1, path_.get(i));
    }
    if (surfaceSpeedMs_ != null) {
      output.writeMessage(2, getSurfaceSpeedMs());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < path_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, path_.get(i));
    }
    if (surfaceSpeedMs_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSurfaceSpeedMs());
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
    if (!(obj instanceof com.anduril.tasks.jadc2.thirdparty.v1.Transit)) {
      return super.equals(obj);
    }
    com.anduril.tasks.jadc2.thirdparty.v1.Transit other = (com.anduril.tasks.jadc2.thirdparty.v1.Transit) obj;

    if (!getPathList()
        .equals(other.getPathList())) return false;
    if (hasSurfaceSpeedMs() != other.hasSurfaceSpeedMs()) return false;
    if (hasSurfaceSpeedMs()) {
      if (!getSurfaceSpeedMs()
          .equals(other.getSurfaceSpeedMs())) return false;
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
    if (getPathCount() > 0) {
      hash = (37 * hash) + PATH_FIELD_NUMBER;
      hash = (53 * hash) + getPathList().hashCode();
    }
    if (hasSurfaceSpeedMs()) {
      hash = (37 * hash) + SURFACE_SPEED_MS_FIELD_NUMBER;
      hash = (53 * hash) + getSurfaceSpeedMs().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.tasks.jadc2.thirdparty.v1.Transit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.jadc2.thirdparty.v1.Transit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.jadc2.thirdparty.v1.Transit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.jadc2.thirdparty.v1.Transit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.jadc2.thirdparty.v1.Transit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.jadc2.thirdparty.v1.Transit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.jadc2.thirdparty.v1.Transit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.jadc2.thirdparty.v1.Transit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.tasks.jadc2.thirdparty.v1.Transit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.jadc2.thirdparty.v1.Transit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.tasks.jadc2.thirdparty.v1.Transit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.jadc2.thirdparty.v1.Transit parseFrom(
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
  public static Builder newBuilder(com.anduril.tasks.jadc2.thirdparty.v1.Transit prototype) {
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
   * Transit represents moving a vehicle on a path through one or more points.
   * </pre>
   *
   * Protobuf type {@code anduril.tasks.jadc2.thirdparty.v1.Transit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.tasks.jadc2.thirdparty.v1.Transit)
      com.anduril.tasks.jadc2.thirdparty.v1.TransitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.tasks.jadc2.thirdparty.v1.TransitPubProto.internal_static_anduril_tasks_jadc2_thirdparty_v1_Transit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.tasks.jadc2.thirdparty.v1.TransitPubProto.internal_static_anduril_tasks_jadc2_thirdparty_v1_Transit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.tasks.jadc2.thirdparty.v1.Transit.class, com.anduril.tasks.jadc2.thirdparty.v1.Transit.Builder.class);
    }

    // Construct using com.anduril.tasks.jadc2.thirdparty.v1.Transit.newBuilder()
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
      if (pathBuilder_ == null) {
        path_ = java.util.Collections.emptyList();
      } else {
        path_ = null;
        pathBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      surfaceSpeedMs_ = null;
      if (surfaceSpeedMsBuilder_ != null) {
        surfaceSpeedMsBuilder_.dispose();
        surfaceSpeedMsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.tasks.jadc2.thirdparty.v1.TransitPubProto.internal_static_anduril_tasks_jadc2_thirdparty_v1_Transit_descriptor;
    }

    @java.lang.Override
    public com.anduril.tasks.jadc2.thirdparty.v1.Transit getDefaultInstanceForType() {
      return com.anduril.tasks.jadc2.thirdparty.v1.Transit.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.tasks.jadc2.thirdparty.v1.Transit build() {
      com.anduril.tasks.jadc2.thirdparty.v1.Transit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.tasks.jadc2.thirdparty.v1.Transit buildPartial() {
      com.anduril.tasks.jadc2.thirdparty.v1.Transit result = new com.anduril.tasks.jadc2.thirdparty.v1.Transit(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.anduril.tasks.jadc2.thirdparty.v1.Transit result) {
      if (pathBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          path_ = java.util.Collections.unmodifiableList(path_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.path_ = path_;
      } else {
        result.path_ = pathBuilder_.build();
      }
    }

    private void buildPartial0(com.anduril.tasks.jadc2.thirdparty.v1.Transit result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.surfaceSpeedMs_ = surfaceSpeedMsBuilder_ == null
            ? surfaceSpeedMs_
            : surfaceSpeedMsBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.tasks.jadc2.thirdparty.v1.Transit) {
        return mergeFrom((com.anduril.tasks.jadc2.thirdparty.v1.Transit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.tasks.jadc2.thirdparty.v1.Transit other) {
      if (other == com.anduril.tasks.jadc2.thirdparty.v1.Transit.getDefaultInstance()) return this;
      if (pathBuilder_ == null) {
        if (!other.path_.isEmpty()) {
          if (path_.isEmpty()) {
            path_ = other.path_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePathIsMutable();
            path_.addAll(other.path_);
          }
          onChanged();
        }
      } else {
        if (!other.path_.isEmpty()) {
          if (pathBuilder_.isEmpty()) {
            pathBuilder_.dispose();
            pathBuilder_ = null;
            path_ = other.path_;
            bitField0_ = (bitField0_ & ~0x00000001);
            pathBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPathFieldBuilder() : null;
          } else {
            pathBuilder_.addAllMessages(other.path_);
          }
        }
      }
      if (other.hasSurfaceSpeedMs()) {
        mergeSurfaceSpeedMs(other.getSurfaceSpeedMs());
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
              com.anduril.tasks.jadc2.thirdparty.v1.PathSegment m =
                  input.readMessage(
                      com.anduril.tasks.jadc2.thirdparty.v1.PathSegment.parser(),
                      extensionRegistry);
              if (pathBuilder_ == null) {
                ensurePathIsMutable();
                path_.add(m);
              } else {
                pathBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getSurfaceSpeedMsFieldBuilder().getBuilder(),
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

    private java.util.List<com.anduril.tasks.jadc2.thirdparty.v1.PathSegment> path_ =
      java.util.Collections.emptyList();
    private void ensurePathIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        path_ = new java.util.ArrayList<com.anduril.tasks.jadc2.thirdparty.v1.PathSegment>(path_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.anduril.tasks.jadc2.thirdparty.v1.PathSegment, com.anduril.tasks.jadc2.thirdparty.v1.PathSegment.Builder, com.anduril.tasks.jadc2.thirdparty.v1.PathSegmentOrBuilder> pathBuilder_;

    /**
     * <pre>
     * The path consisting of all segments to be taken for this transit task.
     * </pre>
     *
     * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
     */
    public java.util.List<com.anduril.tasks.jadc2.thirdparty.v1.PathSegment> getPathList() {
      if (pathBuilder_ == null) {
        return java.util.Collections.unmodifiableList(path_);
      } else {
        return pathBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The path consisting of all segments to be taken for this transit task.
     * </pre>
     *
     * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
     */
    public int getPathCount() {
      if (pathBuilder_ == null) {
        return path_.size();
      } else {
        return pathBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The path consisting of all segments to be taken for this transit task.
     * </pre>
     *
     * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
     */
    public com.anduril.tasks.jadc2.thirdparty.v1.PathSegment getPath(int index) {
      if (pathBuilder_ == null) {
        return path_.get(index);
      } else {
        return pathBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The path consisting of all segments to be taken for this transit task.
     * </pre>
     *
     * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
     */
    public Builder setPath(
        int index, com.anduril.tasks.jadc2.thirdparty.v1.PathSegment value) {
      if (pathBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePathIsMutable();
        path_.set(index, value);
        onChanged();
      } else {
        pathBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The path consisting of all segments to be taken for this transit task.
     * </pre>
     *
     * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
     */
    public Builder setPath(
        int index, com.anduril.tasks.jadc2.thirdparty.v1.PathSegment.Builder builderForValue) {
      if (pathBuilder_ == null) {
        ensurePathIsMutable();
        path_.set(index, builderForValue.build());
        onChanged();
      } else {
        pathBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The path consisting of all segments to be taken for this transit task.
     * </pre>
     *
     * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
     */
    public Builder addPath(com.anduril.tasks.jadc2.thirdparty.v1.PathSegment value) {
      if (pathBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePathIsMutable();
        path_.add(value);
        onChanged();
      } else {
        pathBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The path consisting of all segments to be taken for this transit task.
     * </pre>
     *
     * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
     */
    public Builder addPath(
        int index, com.anduril.tasks.jadc2.thirdparty.v1.PathSegment value) {
      if (pathBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePathIsMutable();
        path_.add(index, value);
        onChanged();
      } else {
        pathBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The path consisting of all segments to be taken for this transit task.
     * </pre>
     *
     * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
     */
    public Builder addPath(
        com.anduril.tasks.jadc2.thirdparty.v1.PathSegment.Builder builderForValue) {
      if (pathBuilder_ == null) {
        ensurePathIsMutable();
        path_.add(builderForValue.build());
        onChanged();
      } else {
        pathBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The path consisting of all segments to be taken for this transit task.
     * </pre>
     *
     * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
     */
    public Builder addPath(
        int index, com.anduril.tasks.jadc2.thirdparty.v1.PathSegment.Builder builderForValue) {
      if (pathBuilder_ == null) {
        ensurePathIsMutable();
        path_.add(index, builderForValue.build());
        onChanged();
      } else {
        pathBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The path consisting of all segments to be taken for this transit task.
     * </pre>
     *
     * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
     */
    public Builder addAllPath(
        java.lang.Iterable<? extends com.anduril.tasks.jadc2.thirdparty.v1.PathSegment> values) {
      if (pathBuilder_ == null) {
        ensurePathIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, path_);
        onChanged();
      } else {
        pathBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The path consisting of all segments to be taken for this transit task.
     * </pre>
     *
     * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
     */
    public Builder clearPath() {
      if (pathBuilder_ == null) {
        path_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        pathBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The path consisting of all segments to be taken for this transit task.
     * </pre>
     *
     * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
     */
    public Builder removePath(int index) {
      if (pathBuilder_ == null) {
        ensurePathIsMutable();
        path_.remove(index);
        onChanged();
      } else {
        pathBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The path consisting of all segments to be taken for this transit task.
     * </pre>
     *
     * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
     */
    public com.anduril.tasks.jadc2.thirdparty.v1.PathSegment.Builder getPathBuilder(
        int index) {
      return getPathFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The path consisting of all segments to be taken for this transit task.
     * </pre>
     *
     * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
     */
    public com.anduril.tasks.jadc2.thirdparty.v1.PathSegmentOrBuilder getPathOrBuilder(
        int index) {
      if (pathBuilder_ == null) {
        return path_.get(index);  } else {
        return pathBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The path consisting of all segments to be taken for this transit task.
     * </pre>
     *
     * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
     */
    public java.util.List<? extends com.anduril.tasks.jadc2.thirdparty.v1.PathSegmentOrBuilder> 
         getPathOrBuilderList() {
      if (pathBuilder_ != null) {
        return pathBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(path_);
      }
    }
    /**
     * <pre>
     * The path consisting of all segments to be taken for this transit task.
     * </pre>
     *
     * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
     */
    public com.anduril.tasks.jadc2.thirdparty.v1.PathSegment.Builder addPathBuilder() {
      return getPathFieldBuilder().addBuilder(
          com.anduril.tasks.jadc2.thirdparty.v1.PathSegment.getDefaultInstance());
    }
    /**
     * <pre>
     * The path consisting of all segments to be taken for this transit task.
     * </pre>
     *
     * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
     */
    public com.anduril.tasks.jadc2.thirdparty.v1.PathSegment.Builder addPathBuilder(
        int index) {
      return getPathFieldBuilder().addBuilder(
          index, com.anduril.tasks.jadc2.thirdparty.v1.PathSegment.getDefaultInstance());
    }
    /**
     * <pre>
     * The path consisting of all segments to be taken for this transit task.
     * </pre>
     *
     * <code>repeated .anduril.tasks.jadc2.thirdparty.v1.PathSegment path = 1 [json_name = "path"];</code>
     */
    public java.util.List<com.anduril.tasks.jadc2.thirdparty.v1.PathSegment.Builder> 
         getPathBuilderList() {
      return getPathFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.anduril.tasks.jadc2.thirdparty.v1.PathSegment, com.anduril.tasks.jadc2.thirdparty.v1.PathSegment.Builder, com.anduril.tasks.jadc2.thirdparty.v1.PathSegmentOrBuilder> 
        getPathFieldBuilder() {
      if (pathBuilder_ == null) {
        pathBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.anduril.tasks.jadc2.thirdparty.v1.PathSegment, com.anduril.tasks.jadc2.thirdparty.v1.PathSegment.Builder, com.anduril.tasks.jadc2.thirdparty.v1.PathSegmentOrBuilder>(
                path_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        path_ = null;
      }
      return pathBuilder_;
    }

    private com.google.protobuf.DoubleValue surfaceSpeedMs_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> surfaceSpeedMsBuilder_;
    /**
     * <pre>
     * Speed in which the vehicle will move through each of the path segments.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue surface_speed_ms = 2 [json_name = "surfaceSpeedMs"];</code>
     * @return Whether the surfaceSpeedMs field is set.
     */
    public boolean hasSurfaceSpeedMs() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Speed in which the vehicle will move through each of the path segments.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue surface_speed_ms = 2 [json_name = "surfaceSpeedMs"];</code>
     * @return The surfaceSpeedMs.
     */
    public com.google.protobuf.DoubleValue getSurfaceSpeedMs() {
      if (surfaceSpeedMsBuilder_ == null) {
        return surfaceSpeedMs_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : surfaceSpeedMs_;
      } else {
        return surfaceSpeedMsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Speed in which the vehicle will move through each of the path segments.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue surface_speed_ms = 2 [json_name = "surfaceSpeedMs"];</code>
     */
    public Builder setSurfaceSpeedMs(com.google.protobuf.DoubleValue value) {
      if (surfaceSpeedMsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        surfaceSpeedMs_ = value;
      } else {
        surfaceSpeedMsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Speed in which the vehicle will move through each of the path segments.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue surface_speed_ms = 2 [json_name = "surfaceSpeedMs"];</code>
     */
    public Builder setSurfaceSpeedMs(
        com.google.protobuf.DoubleValue.Builder builderForValue) {
      if (surfaceSpeedMsBuilder_ == null) {
        surfaceSpeedMs_ = builderForValue.build();
      } else {
        surfaceSpeedMsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Speed in which the vehicle will move through each of the path segments.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue surface_speed_ms = 2 [json_name = "surfaceSpeedMs"];</code>
     */
    public Builder mergeSurfaceSpeedMs(com.google.protobuf.DoubleValue value) {
      if (surfaceSpeedMsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          surfaceSpeedMs_ != null &&
          surfaceSpeedMs_ != com.google.protobuf.DoubleValue.getDefaultInstance()) {
          getSurfaceSpeedMsBuilder().mergeFrom(value);
        } else {
          surfaceSpeedMs_ = value;
        }
      } else {
        surfaceSpeedMsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Speed in which the vehicle will move through each of the path segments.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue surface_speed_ms = 2 [json_name = "surfaceSpeedMs"];</code>
     */
    public Builder clearSurfaceSpeedMs() {
      bitField0_ = (bitField0_ & ~0x00000002);
      surfaceSpeedMs_ = null;
      if (surfaceSpeedMsBuilder_ != null) {
        surfaceSpeedMsBuilder_.dispose();
        surfaceSpeedMsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Speed in which the vehicle will move through each of the path segments.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue surface_speed_ms = 2 [json_name = "surfaceSpeedMs"];</code>
     */
    public com.google.protobuf.DoubleValue.Builder getSurfaceSpeedMsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSurfaceSpeedMsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Speed in which the vehicle will move through each of the path segments.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue surface_speed_ms = 2 [json_name = "surfaceSpeedMs"];</code>
     */
    public com.google.protobuf.DoubleValueOrBuilder getSurfaceSpeedMsOrBuilder() {
      if (surfaceSpeedMsBuilder_ != null) {
        return surfaceSpeedMsBuilder_.getMessageOrBuilder();
      } else {
        return surfaceSpeedMs_ == null ?
            com.google.protobuf.DoubleValue.getDefaultInstance() : surfaceSpeedMs_;
      }
    }
    /**
     * <pre>
     * Speed in which the vehicle will move through each of the path segments.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue surface_speed_ms = 2 [json_name = "surfaceSpeedMs"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> 
        getSurfaceSpeedMsFieldBuilder() {
      if (surfaceSpeedMsBuilder_ == null) {
        surfaceSpeedMsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder>(
                getSurfaceSpeedMs(),
                getParentForChildren(),
                isClean());
        surfaceSpeedMs_ = null;
      }
      return surfaceSpeedMsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.tasks.jadc2.thirdparty.v1.Transit)
  }

  // @@protoc_insertion_point(class_scope:anduril.tasks.jadc2.thirdparty.v1.Transit)
  private static final com.anduril.tasks.jadc2.thirdparty.v1.Transit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.tasks.jadc2.thirdparty.v1.Transit();
  }

  public static com.anduril.tasks.jadc2.thirdparty.v1.Transit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Transit>
      PARSER = new com.google.protobuf.AbstractParser<Transit>() {
    @java.lang.Override
    public Transit parsePartialFrom(
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

  public static com.google.protobuf.Parser<Transit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Transit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.tasks.jadc2.thirdparty.v1.Transit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
