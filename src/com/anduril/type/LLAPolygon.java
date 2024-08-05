// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/type/coords.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.type;

/**
 * Protobuf type {@code anduril.type.LLAPolygon}
 */
public final class LLAPolygon extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:anduril.type.LLAPolygon)
    LLAPolygonOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      LLAPolygon.class.getName());
  }
  // Use LLAPolygon.newBuilder() to construct.
  private LLAPolygon(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private LLAPolygon() {
    points_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.type.CoordsPubProto.internal_static_anduril_type_LLAPolygon_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.type.CoordsPubProto.internal_static_anduril_type_LLAPolygon_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.type.LLAPolygon.class, com.anduril.type.LLAPolygon.Builder.class);
  }

  public static final int POINTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.anduril.type.LLA> points_;
  /**
   * <pre>
   * standard is that points are defined in a counter-clockwise order. this
   * is only the exterior ring of a polygon, no holes are supported.
   * </pre>
   *
   * <code>repeated .anduril.type.LLA points = 1 [json_name = "points"];</code>
   */
  @java.lang.Override
  public java.util.List<com.anduril.type.LLA> getPointsList() {
    return points_;
  }
  /**
   * <pre>
   * standard is that points are defined in a counter-clockwise order. this
   * is only the exterior ring of a polygon, no holes are supported.
   * </pre>
   *
   * <code>repeated .anduril.type.LLA points = 1 [json_name = "points"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.anduril.type.LLAOrBuilder> 
      getPointsOrBuilderList() {
    return points_;
  }
  /**
   * <pre>
   * standard is that points are defined in a counter-clockwise order. this
   * is only the exterior ring of a polygon, no holes are supported.
   * </pre>
   *
   * <code>repeated .anduril.type.LLA points = 1 [json_name = "points"];</code>
   */
  @java.lang.Override
  public int getPointsCount() {
    return points_.size();
  }
  /**
   * <pre>
   * standard is that points are defined in a counter-clockwise order. this
   * is only the exterior ring of a polygon, no holes are supported.
   * </pre>
   *
   * <code>repeated .anduril.type.LLA points = 1 [json_name = "points"];</code>
   */
  @java.lang.Override
  public com.anduril.type.LLA getPoints(int index) {
    return points_.get(index);
  }
  /**
   * <pre>
   * standard is that points are defined in a counter-clockwise order. this
   * is only the exterior ring of a polygon, no holes are supported.
   * </pre>
   *
   * <code>repeated .anduril.type.LLA points = 1 [json_name = "points"];</code>
   */
  @java.lang.Override
  public com.anduril.type.LLAOrBuilder getPointsOrBuilder(
      int index) {
    return points_.get(index);
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
    for (int i = 0; i < points_.size(); i++) {
      output.writeMessage(1, points_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < points_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, points_.get(i));
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
    if (!(obj instanceof com.anduril.type.LLAPolygon)) {
      return super.equals(obj);
    }
    com.anduril.type.LLAPolygon other = (com.anduril.type.LLAPolygon) obj;

    if (!getPointsList()
        .equals(other.getPointsList())) return false;
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
    if (getPointsCount() > 0) {
      hash = (37 * hash) + POINTS_FIELD_NUMBER;
      hash = (53 * hash) + getPointsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.type.LLAPolygon parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.type.LLAPolygon parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.type.LLAPolygon parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.type.LLAPolygon parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.type.LLAPolygon parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.type.LLAPolygon parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.type.LLAPolygon parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.type.LLAPolygon parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.type.LLAPolygon parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.type.LLAPolygon parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.type.LLAPolygon parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.type.LLAPolygon parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.anduril.type.LLAPolygon prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code anduril.type.LLAPolygon}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.type.LLAPolygon)
      com.anduril.type.LLAPolygonOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.type.CoordsPubProto.internal_static_anduril_type_LLAPolygon_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.type.CoordsPubProto.internal_static_anduril_type_LLAPolygon_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.type.LLAPolygon.class, com.anduril.type.LLAPolygon.Builder.class);
    }

    // Construct using com.anduril.type.LLAPolygon.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (pointsBuilder_ == null) {
        points_ = java.util.Collections.emptyList();
      } else {
        points_ = null;
        pointsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.type.CoordsPubProto.internal_static_anduril_type_LLAPolygon_descriptor;
    }

    @java.lang.Override
    public com.anduril.type.LLAPolygon getDefaultInstanceForType() {
      return com.anduril.type.LLAPolygon.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.type.LLAPolygon build() {
      com.anduril.type.LLAPolygon result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.type.LLAPolygon buildPartial() {
      com.anduril.type.LLAPolygon result = new com.anduril.type.LLAPolygon(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.anduril.type.LLAPolygon result) {
      if (pointsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          points_ = java.util.Collections.unmodifiableList(points_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.points_ = points_;
      } else {
        result.points_ = pointsBuilder_.build();
      }
    }

    private void buildPartial0(com.anduril.type.LLAPolygon result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.type.LLAPolygon) {
        return mergeFrom((com.anduril.type.LLAPolygon)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.type.LLAPolygon other) {
      if (other == com.anduril.type.LLAPolygon.getDefaultInstance()) return this;
      if (pointsBuilder_ == null) {
        if (!other.points_.isEmpty()) {
          if (points_.isEmpty()) {
            points_ = other.points_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePointsIsMutable();
            points_.addAll(other.points_);
          }
          onChanged();
        }
      } else {
        if (!other.points_.isEmpty()) {
          if (pointsBuilder_.isEmpty()) {
            pointsBuilder_.dispose();
            pointsBuilder_ = null;
            points_ = other.points_;
            bitField0_ = (bitField0_ & ~0x00000001);
            pointsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getPointsFieldBuilder() : null;
          } else {
            pointsBuilder_.addAllMessages(other.points_);
          }
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
              com.anduril.type.LLA m =
                  input.readMessage(
                      com.anduril.type.LLA.parser(),
                      extensionRegistry);
              if (pointsBuilder_ == null) {
                ensurePointsIsMutable();
                points_.add(m);
              } else {
                pointsBuilder_.addMessage(m);
              }
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

    private java.util.List<com.anduril.type.LLA> points_ =
      java.util.Collections.emptyList();
    private void ensurePointsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        points_ = new java.util.ArrayList<com.anduril.type.LLA>(points_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.anduril.type.LLA, com.anduril.type.LLA.Builder, com.anduril.type.LLAOrBuilder> pointsBuilder_;

    /**
     * <pre>
     * standard is that points are defined in a counter-clockwise order. this
     * is only the exterior ring of a polygon, no holes are supported.
     * </pre>
     *
     * <code>repeated .anduril.type.LLA points = 1 [json_name = "points"];</code>
     */
    public java.util.List<com.anduril.type.LLA> getPointsList() {
      if (pointsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(points_);
      } else {
        return pointsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * standard is that points are defined in a counter-clockwise order. this
     * is only the exterior ring of a polygon, no holes are supported.
     * </pre>
     *
     * <code>repeated .anduril.type.LLA points = 1 [json_name = "points"];</code>
     */
    public int getPointsCount() {
      if (pointsBuilder_ == null) {
        return points_.size();
      } else {
        return pointsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * standard is that points are defined in a counter-clockwise order. this
     * is only the exterior ring of a polygon, no holes are supported.
     * </pre>
     *
     * <code>repeated .anduril.type.LLA points = 1 [json_name = "points"];</code>
     */
    public com.anduril.type.LLA getPoints(int index) {
      if (pointsBuilder_ == null) {
        return points_.get(index);
      } else {
        return pointsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * standard is that points are defined in a counter-clockwise order. this
     * is only the exterior ring of a polygon, no holes are supported.
     * </pre>
     *
     * <code>repeated .anduril.type.LLA points = 1 [json_name = "points"];</code>
     */
    public Builder setPoints(
        int index, com.anduril.type.LLA value) {
      if (pointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePointsIsMutable();
        points_.set(index, value);
        onChanged();
      } else {
        pointsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * standard is that points are defined in a counter-clockwise order. this
     * is only the exterior ring of a polygon, no holes are supported.
     * </pre>
     *
     * <code>repeated .anduril.type.LLA points = 1 [json_name = "points"];</code>
     */
    public Builder setPoints(
        int index, com.anduril.type.LLA.Builder builderForValue) {
      if (pointsBuilder_ == null) {
        ensurePointsIsMutable();
        points_.set(index, builderForValue.build());
        onChanged();
      } else {
        pointsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * standard is that points are defined in a counter-clockwise order. this
     * is only the exterior ring of a polygon, no holes are supported.
     * </pre>
     *
     * <code>repeated .anduril.type.LLA points = 1 [json_name = "points"];</code>
     */
    public Builder addPoints(com.anduril.type.LLA value) {
      if (pointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePointsIsMutable();
        points_.add(value);
        onChanged();
      } else {
        pointsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * standard is that points are defined in a counter-clockwise order. this
     * is only the exterior ring of a polygon, no holes are supported.
     * </pre>
     *
     * <code>repeated .anduril.type.LLA points = 1 [json_name = "points"];</code>
     */
    public Builder addPoints(
        int index, com.anduril.type.LLA value) {
      if (pointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePointsIsMutable();
        points_.add(index, value);
        onChanged();
      } else {
        pointsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * standard is that points are defined in a counter-clockwise order. this
     * is only the exterior ring of a polygon, no holes are supported.
     * </pre>
     *
     * <code>repeated .anduril.type.LLA points = 1 [json_name = "points"];</code>
     */
    public Builder addPoints(
        com.anduril.type.LLA.Builder builderForValue) {
      if (pointsBuilder_ == null) {
        ensurePointsIsMutable();
        points_.add(builderForValue.build());
        onChanged();
      } else {
        pointsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * standard is that points are defined in a counter-clockwise order. this
     * is only the exterior ring of a polygon, no holes are supported.
     * </pre>
     *
     * <code>repeated .anduril.type.LLA points = 1 [json_name = "points"];</code>
     */
    public Builder addPoints(
        int index, com.anduril.type.LLA.Builder builderForValue) {
      if (pointsBuilder_ == null) {
        ensurePointsIsMutable();
        points_.add(index, builderForValue.build());
        onChanged();
      } else {
        pointsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * standard is that points are defined in a counter-clockwise order. this
     * is only the exterior ring of a polygon, no holes are supported.
     * </pre>
     *
     * <code>repeated .anduril.type.LLA points = 1 [json_name = "points"];</code>
     */
    public Builder addAllPoints(
        java.lang.Iterable<? extends com.anduril.type.LLA> values) {
      if (pointsBuilder_ == null) {
        ensurePointsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, points_);
        onChanged();
      } else {
        pointsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * standard is that points are defined in a counter-clockwise order. this
     * is only the exterior ring of a polygon, no holes are supported.
     * </pre>
     *
     * <code>repeated .anduril.type.LLA points = 1 [json_name = "points"];</code>
     */
    public Builder clearPoints() {
      if (pointsBuilder_ == null) {
        points_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        pointsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * standard is that points are defined in a counter-clockwise order. this
     * is only the exterior ring of a polygon, no holes are supported.
     * </pre>
     *
     * <code>repeated .anduril.type.LLA points = 1 [json_name = "points"];</code>
     */
    public Builder removePoints(int index) {
      if (pointsBuilder_ == null) {
        ensurePointsIsMutable();
        points_.remove(index);
        onChanged();
      } else {
        pointsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * standard is that points are defined in a counter-clockwise order. this
     * is only the exterior ring of a polygon, no holes are supported.
     * </pre>
     *
     * <code>repeated .anduril.type.LLA points = 1 [json_name = "points"];</code>
     */
    public com.anduril.type.LLA.Builder getPointsBuilder(
        int index) {
      return getPointsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * standard is that points are defined in a counter-clockwise order. this
     * is only the exterior ring of a polygon, no holes are supported.
     * </pre>
     *
     * <code>repeated .anduril.type.LLA points = 1 [json_name = "points"];</code>
     */
    public com.anduril.type.LLAOrBuilder getPointsOrBuilder(
        int index) {
      if (pointsBuilder_ == null) {
        return points_.get(index);  } else {
        return pointsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * standard is that points are defined in a counter-clockwise order. this
     * is only the exterior ring of a polygon, no holes are supported.
     * </pre>
     *
     * <code>repeated .anduril.type.LLA points = 1 [json_name = "points"];</code>
     */
    public java.util.List<? extends com.anduril.type.LLAOrBuilder> 
         getPointsOrBuilderList() {
      if (pointsBuilder_ != null) {
        return pointsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(points_);
      }
    }
    /**
     * <pre>
     * standard is that points are defined in a counter-clockwise order. this
     * is only the exterior ring of a polygon, no holes are supported.
     * </pre>
     *
     * <code>repeated .anduril.type.LLA points = 1 [json_name = "points"];</code>
     */
    public com.anduril.type.LLA.Builder addPointsBuilder() {
      return getPointsFieldBuilder().addBuilder(
          com.anduril.type.LLA.getDefaultInstance());
    }
    /**
     * <pre>
     * standard is that points are defined in a counter-clockwise order. this
     * is only the exterior ring of a polygon, no holes are supported.
     * </pre>
     *
     * <code>repeated .anduril.type.LLA points = 1 [json_name = "points"];</code>
     */
    public com.anduril.type.LLA.Builder addPointsBuilder(
        int index) {
      return getPointsFieldBuilder().addBuilder(
          index, com.anduril.type.LLA.getDefaultInstance());
    }
    /**
     * <pre>
     * standard is that points are defined in a counter-clockwise order. this
     * is only the exterior ring of a polygon, no holes are supported.
     * </pre>
     *
     * <code>repeated .anduril.type.LLA points = 1 [json_name = "points"];</code>
     */
    public java.util.List<com.anduril.type.LLA.Builder> 
         getPointsBuilderList() {
      return getPointsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.anduril.type.LLA, com.anduril.type.LLA.Builder, com.anduril.type.LLAOrBuilder> 
        getPointsFieldBuilder() {
      if (pointsBuilder_ == null) {
        pointsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.anduril.type.LLA, com.anduril.type.LLA.Builder, com.anduril.type.LLAOrBuilder>(
                points_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        points_ = null;
      }
      return pointsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:anduril.type.LLAPolygon)
  }

  // @@protoc_insertion_point(class_scope:anduril.type.LLAPolygon)
  private static final com.anduril.type.LLAPolygon DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.type.LLAPolygon();
  }

  public static com.anduril.type.LLAPolygon getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LLAPolygon>
      PARSER = new com.google.protobuf.AbstractParser<LLAPolygon>() {
    @java.lang.Override
    public LLAPolygon parsePartialFrom(
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

  public static com.google.protobuf.Parser<LLAPolygon> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LLAPolygon> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.type.LLAPolygon getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

