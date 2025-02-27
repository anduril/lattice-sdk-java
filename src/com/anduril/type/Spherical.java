// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/type/coords.pub.proto

package com.anduril.type;

/**
 * Protobuf type {@code anduril.type.Spherical}
 */
public final class Spherical extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.type.Spherical)
    SphericalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Spherical.newBuilder() to construct.
  private Spherical(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Spherical() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Spherical();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.type.CoordsPubProto.internal_static_anduril_type_Spherical_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.type.CoordsPubProto.internal_static_anduril_type_Spherical_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.type.Spherical.class, com.anduril.type.Spherical.Builder.class);
  }

  public static final int AZ_FIELD_NUMBER = 1;
  private double az_ = 0D;
  /**
   * <pre>
   * azimuth angle in radians
   * </pre>
   *
   * <code>double az = 1 [json_name = "az"];</code>
   * @return The az.
   */
  @java.lang.Override
  public double getAz() {
    return az_;
  }

  public static final int EL_FIELD_NUMBER = 2;
  private double el_ = 0D;
  /**
   * <pre>
   * elevation angle in radians, we'll use 0 = XY plane
   * </pre>
   *
   * <code>double el = 2 [json_name = "el"];</code>
   * @return The el.
   */
  @java.lang.Override
  public double getEl() {
    return el_;
  }

  public static final int RANGE_FIELD_NUMBER = 3;
  private double range_ = 0D;
  /**
   * <pre>
   * range in meters
   * </pre>
   *
   * <code>double range = 3 [json_name = "range"];</code>
   * @return The range.
   */
  @java.lang.Override
  public double getRange() {
    return range_;
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
    if (java.lang.Double.doubleToRawLongBits(az_) != 0) {
      output.writeDouble(1, az_);
    }
    if (java.lang.Double.doubleToRawLongBits(el_) != 0) {
      output.writeDouble(2, el_);
    }
    if (java.lang.Double.doubleToRawLongBits(range_) != 0) {
      output.writeDouble(3, range_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(az_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, az_);
    }
    if (java.lang.Double.doubleToRawLongBits(el_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, el_);
    }
    if (java.lang.Double.doubleToRawLongBits(range_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, range_);
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
    if (!(obj instanceof com.anduril.type.Spherical)) {
      return super.equals(obj);
    }
    com.anduril.type.Spherical other = (com.anduril.type.Spherical) obj;

    if (java.lang.Double.doubleToLongBits(getAz())
        != java.lang.Double.doubleToLongBits(
            other.getAz())) return false;
    if (java.lang.Double.doubleToLongBits(getEl())
        != java.lang.Double.doubleToLongBits(
            other.getEl())) return false;
    if (java.lang.Double.doubleToLongBits(getRange())
        != java.lang.Double.doubleToLongBits(
            other.getRange())) return false;
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
    hash = (37 * hash) + AZ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getAz()));
    hash = (37 * hash) + EL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getEl()));
    hash = (37 * hash) + RANGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getRange()));
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.type.Spherical parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.type.Spherical parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.type.Spherical parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.type.Spherical parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.type.Spherical parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.type.Spherical parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.type.Spherical parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.type.Spherical parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.type.Spherical parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.type.Spherical parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.type.Spherical parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.type.Spherical parseFrom(
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
  public static Builder newBuilder(com.anduril.type.Spherical prototype) {
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
   * Protobuf type {@code anduril.type.Spherical}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.type.Spherical)
      com.anduril.type.SphericalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.type.CoordsPubProto.internal_static_anduril_type_Spherical_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.type.CoordsPubProto.internal_static_anduril_type_Spherical_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.type.Spherical.class, com.anduril.type.Spherical.Builder.class);
    }

    // Construct using com.anduril.type.Spherical.newBuilder()
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
      az_ = 0D;
      el_ = 0D;
      range_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.type.CoordsPubProto.internal_static_anduril_type_Spherical_descriptor;
    }

    @java.lang.Override
    public com.anduril.type.Spherical getDefaultInstanceForType() {
      return com.anduril.type.Spherical.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.type.Spherical build() {
      com.anduril.type.Spherical result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.type.Spherical buildPartial() {
      com.anduril.type.Spherical result = new com.anduril.type.Spherical(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.type.Spherical result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.az_ = az_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.el_ = el_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.range_ = range_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.type.Spherical) {
        return mergeFrom((com.anduril.type.Spherical)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.type.Spherical other) {
      if (other == com.anduril.type.Spherical.getDefaultInstance()) return this;
      if (other.getAz() != 0D) {
        setAz(other.getAz());
      }
      if (other.getEl() != 0D) {
        setEl(other.getEl());
      }
      if (other.getRange() != 0D) {
        setRange(other.getRange());
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
              az_ = input.readDouble();
              bitField0_ |= 0x00000001;
              break;
            } // case 9
            case 17: {
              el_ = input.readDouble();
              bitField0_ |= 0x00000002;
              break;
            } // case 17
            case 25: {
              range_ = input.readDouble();
              bitField0_ |= 0x00000004;
              break;
            } // case 25
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

    private double az_ ;
    /**
     * <pre>
     * azimuth angle in radians
     * </pre>
     *
     * <code>double az = 1 [json_name = "az"];</code>
     * @return The az.
     */
    @java.lang.Override
    public double getAz() {
      return az_;
    }
    /**
     * <pre>
     * azimuth angle in radians
     * </pre>
     *
     * <code>double az = 1 [json_name = "az"];</code>
     * @param value The az to set.
     * @return This builder for chaining.
     */
    public Builder setAz(double value) {

      az_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * azimuth angle in radians
     * </pre>
     *
     * <code>double az = 1 [json_name = "az"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAz() {
      bitField0_ = (bitField0_ & ~0x00000001);
      az_ = 0D;
      onChanged();
      return this;
    }

    private double el_ ;
    /**
     * <pre>
     * elevation angle in radians, we'll use 0 = XY plane
     * </pre>
     *
     * <code>double el = 2 [json_name = "el"];</code>
     * @return The el.
     */
    @java.lang.Override
    public double getEl() {
      return el_;
    }
    /**
     * <pre>
     * elevation angle in radians, we'll use 0 = XY plane
     * </pre>
     *
     * <code>double el = 2 [json_name = "el"];</code>
     * @param value The el to set.
     * @return This builder for chaining.
     */
    public Builder setEl(double value) {

      el_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * elevation angle in radians, we'll use 0 = XY plane
     * </pre>
     *
     * <code>double el = 2 [json_name = "el"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEl() {
      bitField0_ = (bitField0_ & ~0x00000002);
      el_ = 0D;
      onChanged();
      return this;
    }

    private double range_ ;
    /**
     * <pre>
     * range in meters
     * </pre>
     *
     * <code>double range = 3 [json_name = "range"];</code>
     * @return The range.
     */
    @java.lang.Override
    public double getRange() {
      return range_;
    }
    /**
     * <pre>
     * range in meters
     * </pre>
     *
     * <code>double range = 3 [json_name = "range"];</code>
     * @param value The range to set.
     * @return This builder for chaining.
     */
    public Builder setRange(double value) {

      range_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * range in meters
     * </pre>
     *
     * <code>double range = 3 [json_name = "range"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRange() {
      bitField0_ = (bitField0_ & ~0x00000004);
      range_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:anduril.type.Spherical)
  }

  // @@protoc_insertion_point(class_scope:anduril.type.Spherical)
  private static final com.anduril.type.Spherical DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.type.Spherical();
  }

  public static com.anduril.type.Spherical getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Spherical>
      PARSER = new com.google.protobuf.AbstractParser<Spherical>() {
    @java.lang.Override
    public Spherical parsePartialFrom(
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

  public static com.google.protobuf.Parser<Spherical> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Spherical> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.type.Spherical getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

