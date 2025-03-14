// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/jadc2/thirdparty/v1/transit.pub.proto

package com.anduril.tasks.jadc2.thirdparty.v1;

/**
 * Protobuf type {@code anduril.tasks.jadc2.thirdparty.v1.PathSegment}
 */
public final class PathSegment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.tasks.jadc2.thirdparty.v1.PathSegment)
    PathSegmentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PathSegment.newBuilder() to construct.
  private PathSegment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PathSegment() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PathSegment();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.tasks.jadc2.thirdparty.v1.TransitPubProto.internal_static_anduril_tasks_jadc2_thirdparty_v1_PathSegment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.tasks.jadc2.thirdparty.v1.TransitPubProto.internal_static_anduril_tasks_jadc2_thirdparty_v1_PathSegment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.tasks.jadc2.thirdparty.v1.PathSegment.class, com.anduril.tasks.jadc2.thirdparty.v1.PathSegment.Builder.class);
  }

  public static final int ENDPOINT_FIELD_NUMBER = 1;
  private com.anduril.type.LLA endpoint_;
  /**
   * <pre>
   * Describes the end of the path segment, the starting point is the end of the previous segment or the
   * current position if first. Note that the Altitude reference for a given waypoint dictates the height
   *  mode used when traversing TO that waypoint.
   * </pre>
   *
   * <code>.anduril.type.LLA endpoint = 1 [json_name = "endpoint"];</code>
   * @return Whether the endpoint field is set.
   */
  @java.lang.Override
  public boolean hasEndpoint() {
    return endpoint_ != null;
  }
  /**
   * <pre>
   * Describes the end of the path segment, the starting point is the end of the previous segment or the
   * current position if first. Note that the Altitude reference for a given waypoint dictates the height
   *  mode used when traversing TO that waypoint.
   * </pre>
   *
   * <code>.anduril.type.LLA endpoint = 1 [json_name = "endpoint"];</code>
   * @return The endpoint.
   */
  @java.lang.Override
  public com.anduril.type.LLA getEndpoint() {
    return endpoint_ == null ? com.anduril.type.LLA.getDefaultInstance() : endpoint_;
  }
  /**
   * <pre>
   * Describes the end of the path segment, the starting point is the end of the previous segment or the
   * current position if first. Note that the Altitude reference for a given waypoint dictates the height
   *  mode used when traversing TO that waypoint.
   * </pre>
   *
   * <code>.anduril.type.LLA endpoint = 1 [json_name = "endpoint"];</code>
   */
  @java.lang.Override
  public com.anduril.type.LLAOrBuilder getEndpointOrBuilder() {
    return endpoint_ == null ? com.anduril.type.LLA.getDefaultInstance() : endpoint_;
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
    if (endpoint_ != null) {
      output.writeMessage(1, getEndpoint());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (endpoint_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEndpoint());
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
    if (!(obj instanceof com.anduril.tasks.jadc2.thirdparty.v1.PathSegment)) {
      return super.equals(obj);
    }
    com.anduril.tasks.jadc2.thirdparty.v1.PathSegment other = (com.anduril.tasks.jadc2.thirdparty.v1.PathSegment) obj;

    if (hasEndpoint() != other.hasEndpoint()) return false;
    if (hasEndpoint()) {
      if (!getEndpoint()
          .equals(other.getEndpoint())) return false;
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
    if (hasEndpoint()) {
      hash = (37 * hash) + ENDPOINT_FIELD_NUMBER;
      hash = (53 * hash) + getEndpoint().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.tasks.jadc2.thirdparty.v1.PathSegment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.jadc2.thirdparty.v1.PathSegment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.jadc2.thirdparty.v1.PathSegment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.jadc2.thirdparty.v1.PathSegment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.jadc2.thirdparty.v1.PathSegment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.jadc2.thirdparty.v1.PathSegment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.jadc2.thirdparty.v1.PathSegment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.jadc2.thirdparty.v1.PathSegment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.tasks.jadc2.thirdparty.v1.PathSegment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.jadc2.thirdparty.v1.PathSegment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.tasks.jadc2.thirdparty.v1.PathSegment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.jadc2.thirdparty.v1.PathSegment parseFrom(
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
  public static Builder newBuilder(com.anduril.tasks.jadc2.thirdparty.v1.PathSegment prototype) {
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
   * Protobuf type {@code anduril.tasks.jadc2.thirdparty.v1.PathSegment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.tasks.jadc2.thirdparty.v1.PathSegment)
      com.anduril.tasks.jadc2.thirdparty.v1.PathSegmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.tasks.jadc2.thirdparty.v1.TransitPubProto.internal_static_anduril_tasks_jadc2_thirdparty_v1_PathSegment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.tasks.jadc2.thirdparty.v1.TransitPubProto.internal_static_anduril_tasks_jadc2_thirdparty_v1_PathSegment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.tasks.jadc2.thirdparty.v1.PathSegment.class, com.anduril.tasks.jadc2.thirdparty.v1.PathSegment.Builder.class);
    }

    // Construct using com.anduril.tasks.jadc2.thirdparty.v1.PathSegment.newBuilder()
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
      endpoint_ = null;
      if (endpointBuilder_ != null) {
        endpointBuilder_.dispose();
        endpointBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.tasks.jadc2.thirdparty.v1.TransitPubProto.internal_static_anduril_tasks_jadc2_thirdparty_v1_PathSegment_descriptor;
    }

    @java.lang.Override
    public com.anduril.tasks.jadc2.thirdparty.v1.PathSegment getDefaultInstanceForType() {
      return com.anduril.tasks.jadc2.thirdparty.v1.PathSegment.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.tasks.jadc2.thirdparty.v1.PathSegment build() {
      com.anduril.tasks.jadc2.thirdparty.v1.PathSegment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.tasks.jadc2.thirdparty.v1.PathSegment buildPartial() {
      com.anduril.tasks.jadc2.thirdparty.v1.PathSegment result = new com.anduril.tasks.jadc2.thirdparty.v1.PathSegment(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.tasks.jadc2.thirdparty.v1.PathSegment result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.endpoint_ = endpointBuilder_ == null
            ? endpoint_
            : endpointBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.tasks.jadc2.thirdparty.v1.PathSegment) {
        return mergeFrom((com.anduril.tasks.jadc2.thirdparty.v1.PathSegment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.tasks.jadc2.thirdparty.v1.PathSegment other) {
      if (other == com.anduril.tasks.jadc2.thirdparty.v1.PathSegment.getDefaultInstance()) return this;
      if (other.hasEndpoint()) {
        mergeEndpoint(other.getEndpoint());
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
                  getEndpointFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.anduril.type.LLA endpoint_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.type.LLA, com.anduril.type.LLA.Builder, com.anduril.type.LLAOrBuilder> endpointBuilder_;
    /**
     * <pre>
     * Describes the end of the path segment, the starting point is the end of the previous segment or the
     * current position if first. Note that the Altitude reference for a given waypoint dictates the height
     *  mode used when traversing TO that waypoint.
     * </pre>
     *
     * <code>.anduril.type.LLA endpoint = 1 [json_name = "endpoint"];</code>
     * @return Whether the endpoint field is set.
     */
    public boolean hasEndpoint() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Describes the end of the path segment, the starting point is the end of the previous segment or the
     * current position if first. Note that the Altitude reference for a given waypoint dictates the height
     *  mode used when traversing TO that waypoint.
     * </pre>
     *
     * <code>.anduril.type.LLA endpoint = 1 [json_name = "endpoint"];</code>
     * @return The endpoint.
     */
    public com.anduril.type.LLA getEndpoint() {
      if (endpointBuilder_ == null) {
        return endpoint_ == null ? com.anduril.type.LLA.getDefaultInstance() : endpoint_;
      } else {
        return endpointBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Describes the end of the path segment, the starting point is the end of the previous segment or the
     * current position if first. Note that the Altitude reference for a given waypoint dictates the height
     *  mode used when traversing TO that waypoint.
     * </pre>
     *
     * <code>.anduril.type.LLA endpoint = 1 [json_name = "endpoint"];</code>
     */
    public Builder setEndpoint(com.anduril.type.LLA value) {
      if (endpointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endpoint_ = value;
      } else {
        endpointBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Describes the end of the path segment, the starting point is the end of the previous segment or the
     * current position if first. Note that the Altitude reference for a given waypoint dictates the height
     *  mode used when traversing TO that waypoint.
     * </pre>
     *
     * <code>.anduril.type.LLA endpoint = 1 [json_name = "endpoint"];</code>
     */
    public Builder setEndpoint(
        com.anduril.type.LLA.Builder builderForValue) {
      if (endpointBuilder_ == null) {
        endpoint_ = builderForValue.build();
      } else {
        endpointBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Describes the end of the path segment, the starting point is the end of the previous segment or the
     * current position if first. Note that the Altitude reference for a given waypoint dictates the height
     *  mode used when traversing TO that waypoint.
     * </pre>
     *
     * <code>.anduril.type.LLA endpoint = 1 [json_name = "endpoint"];</code>
     */
    public Builder mergeEndpoint(com.anduril.type.LLA value) {
      if (endpointBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          endpoint_ != null &&
          endpoint_ != com.anduril.type.LLA.getDefaultInstance()) {
          getEndpointBuilder().mergeFrom(value);
        } else {
          endpoint_ = value;
        }
      } else {
        endpointBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Describes the end of the path segment, the starting point is the end of the previous segment or the
     * current position if first. Note that the Altitude reference for a given waypoint dictates the height
     *  mode used when traversing TO that waypoint.
     * </pre>
     *
     * <code>.anduril.type.LLA endpoint = 1 [json_name = "endpoint"];</code>
     */
    public Builder clearEndpoint() {
      bitField0_ = (bitField0_ & ~0x00000001);
      endpoint_ = null;
      if (endpointBuilder_ != null) {
        endpointBuilder_.dispose();
        endpointBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Describes the end of the path segment, the starting point is the end of the previous segment or the
     * current position if first. Note that the Altitude reference for a given waypoint dictates the height
     *  mode used when traversing TO that waypoint.
     * </pre>
     *
     * <code>.anduril.type.LLA endpoint = 1 [json_name = "endpoint"];</code>
     */
    public com.anduril.type.LLA.Builder getEndpointBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEndpointFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Describes the end of the path segment, the starting point is the end of the previous segment or the
     * current position if first. Note that the Altitude reference for a given waypoint dictates the height
     *  mode used when traversing TO that waypoint.
     * </pre>
     *
     * <code>.anduril.type.LLA endpoint = 1 [json_name = "endpoint"];</code>
     */
    public com.anduril.type.LLAOrBuilder getEndpointOrBuilder() {
      if (endpointBuilder_ != null) {
        return endpointBuilder_.getMessageOrBuilder();
      } else {
        return endpoint_ == null ?
            com.anduril.type.LLA.getDefaultInstance() : endpoint_;
      }
    }
    /**
     * <pre>
     * Describes the end of the path segment, the starting point is the end of the previous segment or the
     * current position if first. Note that the Altitude reference for a given waypoint dictates the height
     *  mode used when traversing TO that waypoint.
     * </pre>
     *
     * <code>.anduril.type.LLA endpoint = 1 [json_name = "endpoint"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.type.LLA, com.anduril.type.LLA.Builder, com.anduril.type.LLAOrBuilder> 
        getEndpointFieldBuilder() {
      if (endpointBuilder_ == null) {
        endpointBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.type.LLA, com.anduril.type.LLA.Builder, com.anduril.type.LLAOrBuilder>(
                getEndpoint(),
                getParentForChildren(),
                isClean());
        endpoint_ = null;
      }
      return endpointBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.tasks.jadc2.thirdparty.v1.PathSegment)
  }

  // @@protoc_insertion_point(class_scope:anduril.tasks.jadc2.thirdparty.v1.PathSegment)
  private static final com.anduril.tasks.jadc2.thirdparty.v1.PathSegment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.tasks.jadc2.thirdparty.v1.PathSegment();
  }

  public static com.anduril.tasks.jadc2.thirdparty.v1.PathSegment getDefaultInstance() {
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
  public com.anduril.tasks.jadc2.thirdparty.v1.PathSegment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

