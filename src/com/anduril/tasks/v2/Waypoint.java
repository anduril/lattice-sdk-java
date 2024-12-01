// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/shared/maneuver.pub.proto

package com.anduril.tasks.v2;

/**
 * Protobuf type {@code anduril.tasks.v2.Waypoint}
 */
public final class Waypoint extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.tasks.v2.Waypoint)
    WaypointOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Waypoint.newBuilder() to construct.
  private Waypoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Waypoint() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Waypoint();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.tasks.v2.ManeuverPubProto.internal_static_anduril_tasks_v2_Waypoint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.tasks.v2.ManeuverPubProto.internal_static_anduril_tasks_v2_Waypoint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.tasks.v2.Waypoint.class, com.anduril.tasks.v2.Waypoint.Builder.class);
  }

  private int pointCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object point_;
  public enum PointCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    LLA_POINT(1),
    POINT_NOT_SET(0);
    private final int value;
    private PointCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PointCase valueOf(int value) {
      return forNumber(value);
    }

    public static PointCase forNumber(int value) {
      switch (value) {
        case 1: return LLA_POINT;
        case 0: return POINT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public PointCase
  getPointCase() {
    return PointCase.forNumber(
        pointCase_);
  }

  public static final int LLA_POINT_FIELD_NUMBER = 1;
  /**
   * <code>.anduril.tasks.v2.Point lla_point = 1 [json_name = "llaPoint"];</code>
   * @return Whether the llaPoint field is set.
   */
  @java.lang.Override
  public boolean hasLlaPoint() {
    return pointCase_ == 1;
  }
  /**
   * <code>.anduril.tasks.v2.Point lla_point = 1 [json_name = "llaPoint"];</code>
   * @return The llaPoint.
   */
  @java.lang.Override
  public com.anduril.tasks.v2.Point getLlaPoint() {
    if (pointCase_ == 1) {
       return (com.anduril.tasks.v2.Point) point_;
    }
    return com.anduril.tasks.v2.Point.getDefaultInstance();
  }
  /**
   * <code>.anduril.tasks.v2.Point lla_point = 1 [json_name = "llaPoint"];</code>
   */
  @java.lang.Override
  public com.anduril.tasks.v2.PointOrBuilder getLlaPointOrBuilder() {
    if (pointCase_ == 1) {
       return (com.anduril.tasks.v2.Point) point_;
    }
    return com.anduril.tasks.v2.Point.getDefaultInstance();
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
    if (pointCase_ == 1) {
      output.writeMessage(1, (com.anduril.tasks.v2.Point) point_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pointCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.anduril.tasks.v2.Point) point_);
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
    if (!(obj instanceof com.anduril.tasks.v2.Waypoint)) {
      return super.equals(obj);
    }
    com.anduril.tasks.v2.Waypoint other = (com.anduril.tasks.v2.Waypoint) obj;

    if (!getPointCase().equals(other.getPointCase())) return false;
    switch (pointCase_) {
      case 1:
        if (!getLlaPoint()
            .equals(other.getLlaPoint())) return false;
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
    switch (pointCase_) {
      case 1:
        hash = (37 * hash) + LLA_POINT_FIELD_NUMBER;
        hash = (53 * hash) + getLlaPoint().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.tasks.v2.Waypoint parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.Waypoint parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.Waypoint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.Waypoint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.Waypoint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.Waypoint parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.Waypoint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.Waypoint parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.tasks.v2.Waypoint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.Waypoint parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.tasks.v2.Waypoint parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.Waypoint parseFrom(
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
  public static Builder newBuilder(com.anduril.tasks.v2.Waypoint prototype) {
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
   * Protobuf type {@code anduril.tasks.v2.Waypoint}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.tasks.v2.Waypoint)
      com.anduril.tasks.v2.WaypointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.tasks.v2.ManeuverPubProto.internal_static_anduril_tasks_v2_Waypoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.tasks.v2.ManeuverPubProto.internal_static_anduril_tasks_v2_Waypoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.tasks.v2.Waypoint.class, com.anduril.tasks.v2.Waypoint.Builder.class);
    }

    // Construct using com.anduril.tasks.v2.Waypoint.newBuilder()
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
      if (llaPointBuilder_ != null) {
        llaPointBuilder_.clear();
      }
      pointCase_ = 0;
      point_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.tasks.v2.ManeuverPubProto.internal_static_anduril_tasks_v2_Waypoint_descriptor;
    }

    @java.lang.Override
    public com.anduril.tasks.v2.Waypoint getDefaultInstanceForType() {
      return com.anduril.tasks.v2.Waypoint.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.tasks.v2.Waypoint build() {
      com.anduril.tasks.v2.Waypoint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.tasks.v2.Waypoint buildPartial() {
      com.anduril.tasks.v2.Waypoint result = new com.anduril.tasks.v2.Waypoint(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.tasks.v2.Waypoint result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.anduril.tasks.v2.Waypoint result) {
      result.pointCase_ = pointCase_;
      result.point_ = this.point_;
      if (pointCase_ == 1 &&
          llaPointBuilder_ != null) {
        result.point_ = llaPointBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.tasks.v2.Waypoint) {
        return mergeFrom((com.anduril.tasks.v2.Waypoint)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.tasks.v2.Waypoint other) {
      if (other == com.anduril.tasks.v2.Waypoint.getDefaultInstance()) return this;
      switch (other.getPointCase()) {
        case LLA_POINT: {
          mergeLlaPoint(other.getLlaPoint());
          break;
        }
        case POINT_NOT_SET: {
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
                  getLlaPointFieldBuilder().getBuilder(),
                  extensionRegistry);
              pointCase_ = 1;
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
    private int pointCase_ = 0;
    private java.lang.Object point_;
    public PointCase
        getPointCase() {
      return PointCase.forNumber(
          pointCase_);
    }

    public Builder clearPoint() {
      pointCase_ = 0;
      point_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.tasks.v2.Point, com.anduril.tasks.v2.Point.Builder, com.anduril.tasks.v2.PointOrBuilder> llaPointBuilder_;
    /**
     * <code>.anduril.tasks.v2.Point lla_point = 1 [json_name = "llaPoint"];</code>
     * @return Whether the llaPoint field is set.
     */
    @java.lang.Override
    public boolean hasLlaPoint() {
      return pointCase_ == 1;
    }
    /**
     * <code>.anduril.tasks.v2.Point lla_point = 1 [json_name = "llaPoint"];</code>
     * @return The llaPoint.
     */
    @java.lang.Override
    public com.anduril.tasks.v2.Point getLlaPoint() {
      if (llaPointBuilder_ == null) {
        if (pointCase_ == 1) {
          return (com.anduril.tasks.v2.Point) point_;
        }
        return com.anduril.tasks.v2.Point.getDefaultInstance();
      } else {
        if (pointCase_ == 1) {
          return llaPointBuilder_.getMessage();
        }
        return com.anduril.tasks.v2.Point.getDefaultInstance();
      }
    }
    /**
     * <code>.anduril.tasks.v2.Point lla_point = 1 [json_name = "llaPoint"];</code>
     */
    public Builder setLlaPoint(com.anduril.tasks.v2.Point value) {
      if (llaPointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        point_ = value;
        onChanged();
      } else {
        llaPointBuilder_.setMessage(value);
      }
      pointCase_ = 1;
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.Point lla_point = 1 [json_name = "llaPoint"];</code>
     */
    public Builder setLlaPoint(
        com.anduril.tasks.v2.Point.Builder builderForValue) {
      if (llaPointBuilder_ == null) {
        point_ = builderForValue.build();
        onChanged();
      } else {
        llaPointBuilder_.setMessage(builderForValue.build());
      }
      pointCase_ = 1;
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.Point lla_point = 1 [json_name = "llaPoint"];</code>
     */
    public Builder mergeLlaPoint(com.anduril.tasks.v2.Point value) {
      if (llaPointBuilder_ == null) {
        if (pointCase_ == 1 &&
            point_ != com.anduril.tasks.v2.Point.getDefaultInstance()) {
          point_ = com.anduril.tasks.v2.Point.newBuilder((com.anduril.tasks.v2.Point) point_)
              .mergeFrom(value).buildPartial();
        } else {
          point_ = value;
        }
        onChanged();
      } else {
        if (pointCase_ == 1) {
          llaPointBuilder_.mergeFrom(value);
        } else {
          llaPointBuilder_.setMessage(value);
        }
      }
      pointCase_ = 1;
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.Point lla_point = 1 [json_name = "llaPoint"];</code>
     */
    public Builder clearLlaPoint() {
      if (llaPointBuilder_ == null) {
        if (pointCase_ == 1) {
          pointCase_ = 0;
          point_ = null;
          onChanged();
        }
      } else {
        if (pointCase_ == 1) {
          pointCase_ = 0;
          point_ = null;
        }
        llaPointBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.Point lla_point = 1 [json_name = "llaPoint"];</code>
     */
    public com.anduril.tasks.v2.Point.Builder getLlaPointBuilder() {
      return getLlaPointFieldBuilder().getBuilder();
    }
    /**
     * <code>.anduril.tasks.v2.Point lla_point = 1 [json_name = "llaPoint"];</code>
     */
    @java.lang.Override
    public com.anduril.tasks.v2.PointOrBuilder getLlaPointOrBuilder() {
      if ((pointCase_ == 1) && (llaPointBuilder_ != null)) {
        return llaPointBuilder_.getMessageOrBuilder();
      } else {
        if (pointCase_ == 1) {
          return (com.anduril.tasks.v2.Point) point_;
        }
        return com.anduril.tasks.v2.Point.getDefaultInstance();
      }
    }
    /**
     * <code>.anduril.tasks.v2.Point lla_point = 1 [json_name = "llaPoint"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.tasks.v2.Point, com.anduril.tasks.v2.Point.Builder, com.anduril.tasks.v2.PointOrBuilder> 
        getLlaPointFieldBuilder() {
      if (llaPointBuilder_ == null) {
        if (!(pointCase_ == 1)) {
          point_ = com.anduril.tasks.v2.Point.getDefaultInstance();
        }
        llaPointBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.tasks.v2.Point, com.anduril.tasks.v2.Point.Builder, com.anduril.tasks.v2.PointOrBuilder>(
                (com.anduril.tasks.v2.Point) point_,
                getParentForChildren(),
                isClean());
        point_ = null;
      }
      pointCase_ = 1;
      onChanged();
      return llaPointBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.tasks.v2.Waypoint)
  }

  // @@protoc_insertion_point(class_scope:anduril.tasks.v2.Waypoint)
  private static final com.anduril.tasks.v2.Waypoint DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.tasks.v2.Waypoint();
  }

  public static com.anduril.tasks.v2.Waypoint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Waypoint>
      PARSER = new com.google.protobuf.AbstractParser<Waypoint>() {
    @java.lang.Override
    public Waypoint parsePartialFrom(
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

  public static com.google.protobuf.Parser<Waypoint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Waypoint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.tasks.v2.Waypoint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

