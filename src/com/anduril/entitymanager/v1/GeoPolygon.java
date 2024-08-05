// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/entitymanager/v1/geoentity.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * A polygon shaped geo-entity.
 * See https://datatracker.ietf.org/doc/html/rfc7946#section-3.1.6, only canonical representations accepted
 * </pre>
 *
 * Protobuf type {@code anduril.entitymanager.v1.GeoPolygon}
 */
public final class GeoPolygon extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.GeoPolygon)
    GeoPolygonOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      GeoPolygon.class.getName());
  }
  // Use GeoPolygon.newBuilder() to construct.
  private GeoPolygon(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GeoPolygon() {
    rings_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.GeoentityPubProto.internal_static_anduril_entitymanager_v1_GeoPolygon_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.GeoentityPubProto.internal_static_anduril_entitymanager_v1_GeoPolygon_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.GeoPolygon.class, com.anduril.entitymanager.v1.GeoPolygon.Builder.class);
  }

  public static final int RINGS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.anduril.entitymanager.v1.LinearRing> rings_;
  /**
   * <pre>
   * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
   * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
   */
  @java.lang.Override
  public java.util.List<com.anduril.entitymanager.v1.LinearRing> getRingsList() {
    return rings_;
  }
  /**
   * <pre>
   * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
   * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.anduril.entitymanager.v1.LinearRingOrBuilder> 
      getRingsOrBuilderList() {
    return rings_;
  }
  /**
   * <pre>
   * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
   * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
   */
  @java.lang.Override
  public int getRingsCount() {
    return rings_.size();
  }
  /**
   * <pre>
   * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
   * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.LinearRing getRings(int index) {
    return rings_.get(index);
  }
  /**
   * <pre>
   * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
   * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.LinearRingOrBuilder getRingsOrBuilder(
      int index) {
    return rings_.get(index);
  }

  public static final int IS_RECTANGLE_FIELD_NUMBER = 2;
  private boolean isRectangle_ = false;
  /**
   * <pre>
   * An extension hint that this polygon is a rectangle. When true this implies several things:
   * * exactly 1 linear ring with 5 points (starting corner, 3 other corners and start again)
   * * each point has the same altitude corresponding with the plane of the rectangle
   * * each point has the same height (either all present and equal, or all not present)
   * </pre>
   *
   * <code>bool is_rectangle = 2 [json_name = "isRectangle"];</code>
   * @return The isRectangle.
   */
  @java.lang.Override
  public boolean getIsRectangle() {
    return isRectangle_;
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
    for (int i = 0; i < rings_.size(); i++) {
      output.writeMessage(1, rings_.get(i));
    }
    if (isRectangle_ != false) {
      output.writeBool(2, isRectangle_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < rings_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, rings_.get(i));
    }
    if (isRectangle_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isRectangle_);
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
    if (!(obj instanceof com.anduril.entitymanager.v1.GeoPolygon)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.GeoPolygon other = (com.anduril.entitymanager.v1.GeoPolygon) obj;

    if (!getRingsList()
        .equals(other.getRingsList())) return false;
    if (getIsRectangle()
        != other.getIsRectangle()) return false;
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
    if (getRingsCount() > 0) {
      hash = (37 * hash) + RINGS_FIELD_NUMBER;
      hash = (53 * hash) + getRingsList().hashCode();
    }
    hash = (37 * hash) + IS_RECTANGLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsRectangle());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.GeoPolygon parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.GeoPolygon parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.GeoPolygon parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.GeoPolygon parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.GeoPolygon parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.GeoPolygon parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.GeoPolygon parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.GeoPolygon parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.entitymanager.v1.GeoPolygon parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.entitymanager.v1.GeoPolygon parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.GeoPolygon parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.GeoPolygon parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.GeoPolygon prototype) {
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
   * <pre>
   * A polygon shaped geo-entity.
   * See https://datatracker.ietf.org/doc/html/rfc7946#section-3.1.6, only canonical representations accepted
   * </pre>
   *
   * Protobuf type {@code anduril.entitymanager.v1.GeoPolygon}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.GeoPolygon)
      com.anduril.entitymanager.v1.GeoPolygonOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.GeoentityPubProto.internal_static_anduril_entitymanager_v1_GeoPolygon_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.GeoentityPubProto.internal_static_anduril_entitymanager_v1_GeoPolygon_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.GeoPolygon.class, com.anduril.entitymanager.v1.GeoPolygon.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.GeoPolygon.newBuilder()
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
      if (ringsBuilder_ == null) {
        rings_ = java.util.Collections.emptyList();
      } else {
        rings_ = null;
        ringsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      isRectangle_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.GeoentityPubProto.internal_static_anduril_entitymanager_v1_GeoPolygon_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.GeoPolygon getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.GeoPolygon.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.GeoPolygon build() {
      com.anduril.entitymanager.v1.GeoPolygon result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.GeoPolygon buildPartial() {
      com.anduril.entitymanager.v1.GeoPolygon result = new com.anduril.entitymanager.v1.GeoPolygon(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.anduril.entitymanager.v1.GeoPolygon result) {
      if (ringsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          rings_ = java.util.Collections.unmodifiableList(rings_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.rings_ = rings_;
      } else {
        result.rings_ = ringsBuilder_.build();
      }
    }

    private void buildPartial0(com.anduril.entitymanager.v1.GeoPolygon result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.isRectangle_ = isRectangle_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entitymanager.v1.GeoPolygon) {
        return mergeFrom((com.anduril.entitymanager.v1.GeoPolygon)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.GeoPolygon other) {
      if (other == com.anduril.entitymanager.v1.GeoPolygon.getDefaultInstance()) return this;
      if (ringsBuilder_ == null) {
        if (!other.rings_.isEmpty()) {
          if (rings_.isEmpty()) {
            rings_ = other.rings_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRingsIsMutable();
            rings_.addAll(other.rings_);
          }
          onChanged();
        }
      } else {
        if (!other.rings_.isEmpty()) {
          if (ringsBuilder_.isEmpty()) {
            ringsBuilder_.dispose();
            ringsBuilder_ = null;
            rings_ = other.rings_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ringsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getRingsFieldBuilder() : null;
          } else {
            ringsBuilder_.addAllMessages(other.rings_);
          }
        }
      }
      if (other.getIsRectangle() != false) {
        setIsRectangle(other.getIsRectangle());
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
              com.anduril.entitymanager.v1.LinearRing m =
                  input.readMessage(
                      com.anduril.entitymanager.v1.LinearRing.parser(),
                      extensionRegistry);
              if (ringsBuilder_ == null) {
                ensureRingsIsMutable();
                rings_.add(m);
              } else {
                ringsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 16: {
              isRectangle_ = input.readBool();
              bitField0_ |= 0x00000002;
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
    private int bitField0_;

    private java.util.List<com.anduril.entitymanager.v1.LinearRing> rings_ =
      java.util.Collections.emptyList();
    private void ensureRingsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        rings_ = new java.util.ArrayList<com.anduril.entitymanager.v1.LinearRing>(rings_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.anduril.entitymanager.v1.LinearRing, com.anduril.entitymanager.v1.LinearRing.Builder, com.anduril.entitymanager.v1.LinearRingOrBuilder> ringsBuilder_;

    /**
     * <pre>
     * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
     * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
     * </pre>
     *
     * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
     */
    public java.util.List<com.anduril.entitymanager.v1.LinearRing> getRingsList() {
      if (ringsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rings_);
      } else {
        return ringsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
     * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
     * </pre>
     *
     * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
     */
    public int getRingsCount() {
      if (ringsBuilder_ == null) {
        return rings_.size();
      } else {
        return ringsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
     * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
     * </pre>
     *
     * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
     */
    public com.anduril.entitymanager.v1.LinearRing getRings(int index) {
      if (ringsBuilder_ == null) {
        return rings_.get(index);
      } else {
        return ringsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
     * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
     * </pre>
     *
     * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
     */
    public Builder setRings(
        int index, com.anduril.entitymanager.v1.LinearRing value) {
      if (ringsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRingsIsMutable();
        rings_.set(index, value);
        onChanged();
      } else {
        ringsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
     * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
     * </pre>
     *
     * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
     */
    public Builder setRings(
        int index, com.anduril.entitymanager.v1.LinearRing.Builder builderForValue) {
      if (ringsBuilder_ == null) {
        ensureRingsIsMutable();
        rings_.set(index, builderForValue.build());
        onChanged();
      } else {
        ringsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
     * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
     * </pre>
     *
     * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
     */
    public Builder addRings(com.anduril.entitymanager.v1.LinearRing value) {
      if (ringsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRingsIsMutable();
        rings_.add(value);
        onChanged();
      } else {
        ringsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
     * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
     * </pre>
     *
     * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
     */
    public Builder addRings(
        int index, com.anduril.entitymanager.v1.LinearRing value) {
      if (ringsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRingsIsMutable();
        rings_.add(index, value);
        onChanged();
      } else {
        ringsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
     * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
     * </pre>
     *
     * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
     */
    public Builder addRings(
        com.anduril.entitymanager.v1.LinearRing.Builder builderForValue) {
      if (ringsBuilder_ == null) {
        ensureRingsIsMutable();
        rings_.add(builderForValue.build());
        onChanged();
      } else {
        ringsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
     * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
     * </pre>
     *
     * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
     */
    public Builder addRings(
        int index, com.anduril.entitymanager.v1.LinearRing.Builder builderForValue) {
      if (ringsBuilder_ == null) {
        ensureRingsIsMutable();
        rings_.add(index, builderForValue.build());
        onChanged();
      } else {
        ringsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
     * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
     * </pre>
     *
     * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
     */
    public Builder addAllRings(
        java.lang.Iterable<? extends com.anduril.entitymanager.v1.LinearRing> values) {
      if (ringsBuilder_ == null) {
        ensureRingsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rings_);
        onChanged();
      } else {
        ringsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
     * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
     * </pre>
     *
     * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
     */
    public Builder clearRings() {
      if (ringsBuilder_ == null) {
        rings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ringsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
     * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
     * </pre>
     *
     * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
     */
    public Builder removeRings(int index) {
      if (ringsBuilder_ == null) {
        ensureRingsIsMutable();
        rings_.remove(index);
        onChanged();
      } else {
        ringsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
     * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
     * </pre>
     *
     * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
     */
    public com.anduril.entitymanager.v1.LinearRing.Builder getRingsBuilder(
        int index) {
      return getRingsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
     * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
     * </pre>
     *
     * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
     */
    public com.anduril.entitymanager.v1.LinearRingOrBuilder getRingsOrBuilder(
        int index) {
      if (ringsBuilder_ == null) {
        return rings_.get(index);  } else {
        return ringsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
     * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
     * </pre>
     *
     * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
     */
    public java.util.List<? extends com.anduril.entitymanager.v1.LinearRingOrBuilder> 
         getRingsOrBuilderList() {
      if (ringsBuilder_ != null) {
        return ringsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rings_);
      }
    }
    /**
     * <pre>
     * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
     * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
     * </pre>
     *
     * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
     */
    public com.anduril.entitymanager.v1.LinearRing.Builder addRingsBuilder() {
      return getRingsFieldBuilder().addBuilder(
          com.anduril.entitymanager.v1.LinearRing.getDefaultInstance());
    }
    /**
     * <pre>
     * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
     * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
     * </pre>
     *
     * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
     */
    public com.anduril.entitymanager.v1.LinearRing.Builder addRingsBuilder(
        int index) {
      return getRingsFieldBuilder().addBuilder(
          index, com.anduril.entitymanager.v1.LinearRing.getDefaultInstance());
    }
    /**
     * <pre>
     * An array of LinearRings where the first item is the exterior ring and subsequent items are interior rings.
     * For a good introduction read (https://macwright.com/2015/03/23/geojson-second-bite.html#polygons)
     * </pre>
     *
     * <code>repeated .anduril.entitymanager.v1.LinearRing rings = 1 [json_name = "rings"];</code>
     */
    public java.util.List<com.anduril.entitymanager.v1.LinearRing.Builder> 
         getRingsBuilderList() {
      return getRingsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.anduril.entitymanager.v1.LinearRing, com.anduril.entitymanager.v1.LinearRing.Builder, com.anduril.entitymanager.v1.LinearRingOrBuilder> 
        getRingsFieldBuilder() {
      if (ringsBuilder_ == null) {
        ringsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.anduril.entitymanager.v1.LinearRing, com.anduril.entitymanager.v1.LinearRing.Builder, com.anduril.entitymanager.v1.LinearRingOrBuilder>(
                rings_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        rings_ = null;
      }
      return ringsBuilder_;
    }

    private boolean isRectangle_ ;
    /**
     * <pre>
     * An extension hint that this polygon is a rectangle. When true this implies several things:
     * * exactly 1 linear ring with 5 points (starting corner, 3 other corners and start again)
     * * each point has the same altitude corresponding with the plane of the rectangle
     * * each point has the same height (either all present and equal, or all not present)
     * </pre>
     *
     * <code>bool is_rectangle = 2 [json_name = "isRectangle"];</code>
     * @return The isRectangle.
     */
    @java.lang.Override
    public boolean getIsRectangle() {
      return isRectangle_;
    }
    /**
     * <pre>
     * An extension hint that this polygon is a rectangle. When true this implies several things:
     * * exactly 1 linear ring with 5 points (starting corner, 3 other corners and start again)
     * * each point has the same altitude corresponding with the plane of the rectangle
     * * each point has the same height (either all present and equal, or all not present)
     * </pre>
     *
     * <code>bool is_rectangle = 2 [json_name = "isRectangle"];</code>
     * @param value The isRectangle to set.
     * @return This builder for chaining.
     */
    public Builder setIsRectangle(boolean value) {

      isRectangle_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An extension hint that this polygon is a rectangle. When true this implies several things:
     * * exactly 1 linear ring with 5 points (starting corner, 3 other corners and start again)
     * * each point has the same altitude corresponding with the plane of the rectangle
     * * each point has the same height (either all present and equal, or all not present)
     * </pre>
     *
     * <code>bool is_rectangle = 2 [json_name = "isRectangle"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIsRectangle() {
      bitField0_ = (bitField0_ & ~0x00000002);
      isRectangle_ = false;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.GeoPolygon)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.GeoPolygon)
  private static final com.anduril.entitymanager.v1.GeoPolygon DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.GeoPolygon();
  }

  public static com.anduril.entitymanager.v1.GeoPolygon getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GeoPolygon>
      PARSER = new com.google.protobuf.AbstractParser<GeoPolygon>() {
    @java.lang.Override
    public GeoPolygon parsePartialFrom(
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

  public static com.google.protobuf.Parser<GeoPolygon> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GeoPolygon> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.GeoPolygon getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

