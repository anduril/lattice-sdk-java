// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/tasks/v2/shared/maneuver.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.tasks.v2;

/**
 * Protobuf type {@code anduril.tasks.v2.PathSegment}
 */
public final class PathSegment extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:anduril.tasks.v2.PathSegment)
    PathSegmentOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      PathSegment.class.getName());
  }
  // Use PathSegment.newBuilder() to construct.
  private PathSegment(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private PathSegment() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.tasks.v2.ManeuverPubProto.internal_static_anduril_tasks_v2_PathSegment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.tasks.v2.ManeuverPubProto.internal_static_anduril_tasks_v2_PathSegment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.tasks.v2.PathSegment.class, com.anduril.tasks.v2.PathSegment.Builder.class);
  }

  private int endPointCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object endPoint_;
  public enum EndPointCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    WAYPOINT(1),
    LOITER(2),
    ENDPOINT_NOT_SET(0);
    private final int value;
    private EndPointCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EndPointCase valueOf(int value) {
      return forNumber(value);
    }

    public static EndPointCase forNumber(int value) {
      switch (value) {
        case 1: return WAYPOINT;
        case 2: return LOITER;
        case 0: return ENDPOINT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public EndPointCase
  getEndPointCase() {
    return EndPointCase.forNumber(
        endPointCase_);
  }

  public static final int WAYPOINT_FIELD_NUMBER = 1;
  /**
   * <code>.anduril.tasks.v2.Waypoint waypoint = 1 [json_name = "waypoint"];</code>
   * @return Whether the waypoint field is set.
   */
  @java.lang.Override
  public boolean hasWaypoint() {
    return endPointCase_ == 1;
  }
  /**
   * <code>.anduril.tasks.v2.Waypoint waypoint = 1 [json_name = "waypoint"];</code>
   * @return The waypoint.
   */
  @java.lang.Override
  public com.anduril.tasks.v2.Waypoint getWaypoint() {
    if (endPointCase_ == 1) {
       return (com.anduril.tasks.v2.Waypoint) endPoint_;
    }
    return com.anduril.tasks.v2.Waypoint.getDefaultInstance();
  }
  /**
   * <code>.anduril.tasks.v2.Waypoint waypoint = 1 [json_name = "waypoint"];</code>
   */
  @java.lang.Override
  public com.anduril.tasks.v2.WaypointOrBuilder getWaypointOrBuilder() {
    if (endPointCase_ == 1) {
       return (com.anduril.tasks.v2.Waypoint) endPoint_;
    }
    return com.anduril.tasks.v2.Waypoint.getDefaultInstance();
  }

  public static final int LOITER_FIELD_NUMBER = 2;
  /**
   * <code>.anduril.tasks.v2.Loiter loiter = 2 [json_name = "loiter"];</code>
   * @return Whether the loiter field is set.
   */
  @java.lang.Override
  public boolean hasLoiter() {
    return endPointCase_ == 2;
  }
  /**
   * <code>.anduril.tasks.v2.Loiter loiter = 2 [json_name = "loiter"];</code>
   * @return The loiter.
   */
  @java.lang.Override
  public com.anduril.tasks.v2.Loiter getLoiter() {
    if (endPointCase_ == 2) {
       return (com.anduril.tasks.v2.Loiter) endPoint_;
    }
    return com.anduril.tasks.v2.Loiter.getDefaultInstance();
  }
  /**
   * <code>.anduril.tasks.v2.Loiter loiter = 2 [json_name = "loiter"];</code>
   */
  @java.lang.Override
  public com.anduril.tasks.v2.LoiterOrBuilder getLoiterOrBuilder() {
    if (endPointCase_ == 2) {
       return (com.anduril.tasks.v2.Loiter) endPoint_;
    }
    return com.anduril.tasks.v2.Loiter.getDefaultInstance();
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
    if (endPointCase_ == 1) {
      output.writeMessage(1, (com.anduril.tasks.v2.Waypoint) endPoint_);
    }
    if (endPointCase_ == 2) {
      output.writeMessage(2, (com.anduril.tasks.v2.Loiter) endPoint_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (endPointCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.anduril.tasks.v2.Waypoint) endPoint_);
    }
    if (endPointCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.anduril.tasks.v2.Loiter) endPoint_);
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
    if (!(obj instanceof com.anduril.tasks.v2.PathSegment)) {
      return super.equals(obj);
    }
    com.anduril.tasks.v2.PathSegment other = (com.anduril.tasks.v2.PathSegment) obj;

    if (!getEndPointCase().equals(other.getEndPointCase())) return false;
    switch (endPointCase_) {
      case 1:
        if (!getWaypoint()
            .equals(other.getWaypoint())) return false;
        break;
      case 2:
        if (!getLoiter()
            .equals(other.getLoiter())) return false;
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
    switch (endPointCase_) {
      case 1:
        hash = (37 * hash) + WAYPOINT_FIELD_NUMBER;
        hash = (53 * hash) + getWaypoint().hashCode();
        break;
      case 2:
        hash = (37 * hash) + LOITER_FIELD_NUMBER;
        hash = (53 * hash) + getLoiter().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.tasks.v2.PathSegment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.PathSegment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.PathSegment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.PathSegment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.PathSegment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.PathSegment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.PathSegment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.PathSegment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.tasks.v2.PathSegment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.tasks.v2.PathSegment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.tasks.v2.PathSegment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.PathSegment parseFrom(
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
  public static Builder newBuilder(com.anduril.tasks.v2.PathSegment prototype) {
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
   * Protobuf type {@code anduril.tasks.v2.PathSegment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.tasks.v2.PathSegment)
      com.anduril.tasks.v2.PathSegmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.tasks.v2.ManeuverPubProto.internal_static_anduril_tasks_v2_PathSegment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.tasks.v2.ManeuverPubProto.internal_static_anduril_tasks_v2_PathSegment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.tasks.v2.PathSegment.class, com.anduril.tasks.v2.PathSegment.Builder.class);
    }

    // Construct using com.anduril.tasks.v2.PathSegment.newBuilder()
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
      if (waypointBuilder_ != null) {
        waypointBuilder_.clear();
      }
      if (loiterBuilder_ != null) {
        loiterBuilder_.clear();
      }
      endPointCase_ = 0;
      endPoint_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.tasks.v2.ManeuverPubProto.internal_static_anduril_tasks_v2_PathSegment_descriptor;
    }

    @java.lang.Override
    public com.anduril.tasks.v2.PathSegment getDefaultInstanceForType() {
      return com.anduril.tasks.v2.PathSegment.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.tasks.v2.PathSegment build() {
      com.anduril.tasks.v2.PathSegment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.tasks.v2.PathSegment buildPartial() {
      com.anduril.tasks.v2.PathSegment result = new com.anduril.tasks.v2.PathSegment(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.tasks.v2.PathSegment result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.anduril.tasks.v2.PathSegment result) {
      result.endPointCase_ = endPointCase_;
      result.endPoint_ = this.endPoint_;
      if (endPointCase_ == 1 &&
          waypointBuilder_ != null) {
        result.endPoint_ = waypointBuilder_.build();
      }
      if (endPointCase_ == 2 &&
          loiterBuilder_ != null) {
        result.endPoint_ = loiterBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.tasks.v2.PathSegment) {
        return mergeFrom((com.anduril.tasks.v2.PathSegment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.tasks.v2.PathSegment other) {
      if (other == com.anduril.tasks.v2.PathSegment.getDefaultInstance()) return this;
      switch (other.getEndPointCase()) {
        case WAYPOINT: {
          mergeWaypoint(other.getWaypoint());
          break;
        }
        case LOITER: {
          mergeLoiter(other.getLoiter());
          break;
        }
        case ENDPOINT_NOT_SET: {
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
                  getWaypointFieldBuilder().getBuilder(),
                  extensionRegistry);
              endPointCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getLoiterFieldBuilder().getBuilder(),
                  extensionRegistry);
              endPointCase_ = 2;
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
    private int endPointCase_ = 0;
    private java.lang.Object endPoint_;
    public EndPointCase
        getEndPointCase() {
      return EndPointCase.forNumber(
          endPointCase_);
    }

    public Builder clearEndPoint() {
      endPointCase_ = 0;
      endPoint_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.tasks.v2.Waypoint, com.anduril.tasks.v2.Waypoint.Builder, com.anduril.tasks.v2.WaypointOrBuilder> waypointBuilder_;
    /**
     * <code>.anduril.tasks.v2.Waypoint waypoint = 1 [json_name = "waypoint"];</code>
     * @return Whether the waypoint field is set.
     */
    @java.lang.Override
    public boolean hasWaypoint() {
      return endPointCase_ == 1;
    }
    /**
     * <code>.anduril.tasks.v2.Waypoint waypoint = 1 [json_name = "waypoint"];</code>
     * @return The waypoint.
     */
    @java.lang.Override
    public com.anduril.tasks.v2.Waypoint getWaypoint() {
      if (waypointBuilder_ == null) {
        if (endPointCase_ == 1) {
          return (com.anduril.tasks.v2.Waypoint) endPoint_;
        }
        return com.anduril.tasks.v2.Waypoint.getDefaultInstance();
      } else {
        if (endPointCase_ == 1) {
          return waypointBuilder_.getMessage();
        }
        return com.anduril.tasks.v2.Waypoint.getDefaultInstance();
      }
    }
    /**
     * <code>.anduril.tasks.v2.Waypoint waypoint = 1 [json_name = "waypoint"];</code>
     */
    public Builder setWaypoint(com.anduril.tasks.v2.Waypoint value) {
      if (waypointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endPoint_ = value;
        onChanged();
      } else {
        waypointBuilder_.setMessage(value);
      }
      endPointCase_ = 1;
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.Waypoint waypoint = 1 [json_name = "waypoint"];</code>
     */
    public Builder setWaypoint(
        com.anduril.tasks.v2.Waypoint.Builder builderForValue) {
      if (waypointBuilder_ == null) {
        endPoint_ = builderForValue.build();
        onChanged();
      } else {
        waypointBuilder_.setMessage(builderForValue.build());
      }
      endPointCase_ = 1;
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.Waypoint waypoint = 1 [json_name = "waypoint"];</code>
     */
    public Builder mergeWaypoint(com.anduril.tasks.v2.Waypoint value) {
      if (waypointBuilder_ == null) {
        if (endPointCase_ == 1 &&
            endPoint_ != com.anduril.tasks.v2.Waypoint.getDefaultInstance()) {
          endPoint_ = com.anduril.tasks.v2.Waypoint.newBuilder((com.anduril.tasks.v2.Waypoint) endPoint_)
              .mergeFrom(value).buildPartial();
        } else {
          endPoint_ = value;
        }
        onChanged();
      } else {
        if (endPointCase_ == 1) {
          waypointBuilder_.mergeFrom(value);
        } else {
          waypointBuilder_.setMessage(value);
        }
      }
      endPointCase_ = 1;
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.Waypoint waypoint = 1 [json_name = "waypoint"];</code>
     */
    public Builder clearWaypoint() {
      if (waypointBuilder_ == null) {
        if (endPointCase_ == 1) {
          endPointCase_ = 0;
          endPoint_ = null;
          onChanged();
        }
      } else {
        if (endPointCase_ == 1) {
          endPointCase_ = 0;
          endPoint_ = null;
        }
        waypointBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.Waypoint waypoint = 1 [json_name = "waypoint"];</code>
     */
    public com.anduril.tasks.v2.Waypoint.Builder getWaypointBuilder() {
      return getWaypointFieldBuilder().getBuilder();
    }
    /**
     * <code>.anduril.tasks.v2.Waypoint waypoint = 1 [json_name = "waypoint"];</code>
     */
    @java.lang.Override
    public com.anduril.tasks.v2.WaypointOrBuilder getWaypointOrBuilder() {
      if ((endPointCase_ == 1) && (waypointBuilder_ != null)) {
        return waypointBuilder_.getMessageOrBuilder();
      } else {
        if (endPointCase_ == 1) {
          return (com.anduril.tasks.v2.Waypoint) endPoint_;
        }
        return com.anduril.tasks.v2.Waypoint.getDefaultInstance();
      }
    }
    /**
     * <code>.anduril.tasks.v2.Waypoint waypoint = 1 [json_name = "waypoint"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.tasks.v2.Waypoint, com.anduril.tasks.v2.Waypoint.Builder, com.anduril.tasks.v2.WaypointOrBuilder> 
        getWaypointFieldBuilder() {
      if (waypointBuilder_ == null) {
        if (!(endPointCase_ == 1)) {
          endPoint_ = com.anduril.tasks.v2.Waypoint.getDefaultInstance();
        }
        waypointBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.anduril.tasks.v2.Waypoint, com.anduril.tasks.v2.Waypoint.Builder, com.anduril.tasks.v2.WaypointOrBuilder>(
                (com.anduril.tasks.v2.Waypoint) endPoint_,
                getParentForChildren(),
                isClean());
        endPoint_ = null;
      }
      endPointCase_ = 1;
      onChanged();
      return waypointBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.tasks.v2.Loiter, com.anduril.tasks.v2.Loiter.Builder, com.anduril.tasks.v2.LoiterOrBuilder> loiterBuilder_;
    /**
     * <code>.anduril.tasks.v2.Loiter loiter = 2 [json_name = "loiter"];</code>
     * @return Whether the loiter field is set.
     */
    @java.lang.Override
    public boolean hasLoiter() {
      return endPointCase_ == 2;
    }
    /**
     * <code>.anduril.tasks.v2.Loiter loiter = 2 [json_name = "loiter"];</code>
     * @return The loiter.
     */
    @java.lang.Override
    public com.anduril.tasks.v2.Loiter getLoiter() {
      if (loiterBuilder_ == null) {
        if (endPointCase_ == 2) {
          return (com.anduril.tasks.v2.Loiter) endPoint_;
        }
        return com.anduril.tasks.v2.Loiter.getDefaultInstance();
      } else {
        if (endPointCase_ == 2) {
          return loiterBuilder_.getMessage();
        }
        return com.anduril.tasks.v2.Loiter.getDefaultInstance();
      }
    }
    /**
     * <code>.anduril.tasks.v2.Loiter loiter = 2 [json_name = "loiter"];</code>
     */
    public Builder setLoiter(com.anduril.tasks.v2.Loiter value) {
      if (loiterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endPoint_ = value;
        onChanged();
      } else {
        loiterBuilder_.setMessage(value);
      }
      endPointCase_ = 2;
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.Loiter loiter = 2 [json_name = "loiter"];</code>
     */
    public Builder setLoiter(
        com.anduril.tasks.v2.Loiter.Builder builderForValue) {
      if (loiterBuilder_ == null) {
        endPoint_ = builderForValue.build();
        onChanged();
      } else {
        loiterBuilder_.setMessage(builderForValue.build());
      }
      endPointCase_ = 2;
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.Loiter loiter = 2 [json_name = "loiter"];</code>
     */
    public Builder mergeLoiter(com.anduril.tasks.v2.Loiter value) {
      if (loiterBuilder_ == null) {
        if (endPointCase_ == 2 &&
            endPoint_ != com.anduril.tasks.v2.Loiter.getDefaultInstance()) {
          endPoint_ = com.anduril.tasks.v2.Loiter.newBuilder((com.anduril.tasks.v2.Loiter) endPoint_)
              .mergeFrom(value).buildPartial();
        } else {
          endPoint_ = value;
        }
        onChanged();
      } else {
        if (endPointCase_ == 2) {
          loiterBuilder_.mergeFrom(value);
        } else {
          loiterBuilder_.setMessage(value);
        }
      }
      endPointCase_ = 2;
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.Loiter loiter = 2 [json_name = "loiter"];</code>
     */
    public Builder clearLoiter() {
      if (loiterBuilder_ == null) {
        if (endPointCase_ == 2) {
          endPointCase_ = 0;
          endPoint_ = null;
          onChanged();
        }
      } else {
        if (endPointCase_ == 2) {
          endPointCase_ = 0;
          endPoint_ = null;
        }
        loiterBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.Loiter loiter = 2 [json_name = "loiter"];</code>
     */
    public com.anduril.tasks.v2.Loiter.Builder getLoiterBuilder() {
      return getLoiterFieldBuilder().getBuilder();
    }
    /**
     * <code>.anduril.tasks.v2.Loiter loiter = 2 [json_name = "loiter"];</code>
     */
    @java.lang.Override
    public com.anduril.tasks.v2.LoiterOrBuilder getLoiterOrBuilder() {
      if ((endPointCase_ == 2) && (loiterBuilder_ != null)) {
        return loiterBuilder_.getMessageOrBuilder();
      } else {
        if (endPointCase_ == 2) {
          return (com.anduril.tasks.v2.Loiter) endPoint_;
        }
        return com.anduril.tasks.v2.Loiter.getDefaultInstance();
      }
    }
    /**
     * <code>.anduril.tasks.v2.Loiter loiter = 2 [json_name = "loiter"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.tasks.v2.Loiter, com.anduril.tasks.v2.Loiter.Builder, com.anduril.tasks.v2.LoiterOrBuilder> 
        getLoiterFieldBuilder() {
      if (loiterBuilder_ == null) {
        if (!(endPointCase_ == 2)) {
          endPoint_ = com.anduril.tasks.v2.Loiter.getDefaultInstance();
        }
        loiterBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.anduril.tasks.v2.Loiter, com.anduril.tasks.v2.Loiter.Builder, com.anduril.tasks.v2.LoiterOrBuilder>(
                (com.anduril.tasks.v2.Loiter) endPoint_,
                getParentForChildren(),
                isClean());
        endPoint_ = null;
      }
      endPointCase_ = 2;
      onChanged();
      return loiterBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:anduril.tasks.v2.PathSegment)
  }

  // @@protoc_insertion_point(class_scope:anduril.tasks.v2.PathSegment)
  private static final com.anduril.tasks.v2.PathSegment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.tasks.v2.PathSegment();
  }

  public static com.anduril.tasks.v2.PathSegment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PathSegment>
      PARSER = new com.google.protobuf.AbstractParser<PathSegment>() {
    @java.lang.Override
    public PathSegment parsePartialFrom(
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

  public static com.google.protobuf.Parser<PathSegment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PathSegment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.tasks.v2.PathSegment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

