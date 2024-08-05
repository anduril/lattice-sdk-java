// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/tasks/v2/shared/isr.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.tasks.v2;

/**
 * <pre>
 * A Prior that can be used to inform an ISR Task.
 * </pre>
 *
 * Protobuf type {@code anduril.tasks.v2.Prior}
 */
public final class Prior extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:anduril.tasks.v2.Prior)
    PriorOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      Prior.class.getName());
  }
  // Use Prior.newBuilder() to construct.
  private Prior(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Prior() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_Prior_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_Prior_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.tasks.v2.Prior.class, com.anduril.tasks.v2.Prior.Builder.class);
  }

  private int priorCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object prior_;
  public enum PriorCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ENTITY_ID(1),
    POINT(5),
    PRIOR_NOT_SET(0);
    private final int value;
    private PriorCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PriorCase valueOf(int value) {
      return forNumber(value);
    }

    public static PriorCase forNumber(int value) {
      switch (value) {
        case 1: return ENTITY_ID;
        case 5: return POINT;
        case 0: return PRIOR_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public PriorCase
  getPriorCase() {
    return PriorCase.forNumber(
        priorCase_);
  }

  public static final int ENTITY_ID_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Prefer Entity priors whenever the prior is in fact an entity. In other words, don't take position/point
   * out of an entity and pass it as a simple point.
   * </pre>
   *
   * <code>string entity_id = 1 [json_name = "entityId"];</code>
   * @return Whether the entityId field is set.
   */
  public boolean hasEntityId() {
    return priorCase_ == 1;
  }
  /**
   * <pre>
   * Prefer Entity priors whenever the prior is in fact an entity. In other words, don't take position/point
   * out of an entity and pass it as a simple point.
   * </pre>
   *
   * <code>string entity_id = 1 [json_name = "entityId"];</code>
   * @return The entityId.
   */
  public java.lang.String getEntityId() {
    java.lang.Object ref = "";
    if (priorCase_ == 1) {
      ref = prior_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (priorCase_ == 1) {
        prior_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Prefer Entity priors whenever the prior is in fact an entity. In other words, don't take position/point
   * out of an entity and pass it as a simple point.
   * </pre>
   *
   * <code>string entity_id = 1 [json_name = "entityId"];</code>
   * @return The bytes for entityId.
   */
  public com.google.protobuf.ByteString
      getEntityIdBytes() {
    java.lang.Object ref = "";
    if (priorCase_ == 1) {
      ref = prior_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (priorCase_ == 1) {
        prior_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POINT_FIELD_NUMBER = 5;
  /**
   * <pre>
   * Point priors for simple reference points that are not geo entities.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Point point = 5 [json_name = "point"];</code>
   * @return Whether the point field is set.
   */
  @java.lang.Override
  public boolean hasPoint() {
    return priorCase_ == 5;
  }
  /**
   * <pre>
   * Point priors for simple reference points that are not geo entities.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Point point = 5 [json_name = "point"];</code>
   * @return The point.
   */
  @java.lang.Override
  public com.anduril.tasks.v2.Point getPoint() {
    if (priorCase_ == 5) {
       return (com.anduril.tasks.v2.Point) prior_;
    }
    return com.anduril.tasks.v2.Point.getDefaultInstance();
  }
  /**
   * <pre>
   * Point priors for simple reference points that are not geo entities.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Point point = 5 [json_name = "point"];</code>
   */
  @java.lang.Override
  public com.anduril.tasks.v2.PointOrBuilder getPointOrBuilder() {
    if (priorCase_ == 5) {
       return (com.anduril.tasks.v2.Point) prior_;
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
    if (priorCase_ == 1) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, prior_);
    }
    if (priorCase_ == 5) {
      output.writeMessage(5, (com.anduril.tasks.v2.Point) prior_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (priorCase_ == 1) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, prior_);
    }
    if (priorCase_ == 5) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, (com.anduril.tasks.v2.Point) prior_);
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
    if (!(obj instanceof com.anduril.tasks.v2.Prior)) {
      return super.equals(obj);
    }
    com.anduril.tasks.v2.Prior other = (com.anduril.tasks.v2.Prior) obj;

    if (!getPriorCase().equals(other.getPriorCase())) return false;
    switch (priorCase_) {
      case 1:
        if (!getEntityId()
            .equals(other.getEntityId())) return false;
        break;
      case 5:
        if (!getPoint()
            .equals(other.getPoint())) return false;
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
    switch (priorCase_) {
      case 1:
        hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
        hash = (53 * hash) + getEntityId().hashCode();
        break;
      case 5:
        hash = (37 * hash) + POINT_FIELD_NUMBER;
        hash = (53 * hash) + getPoint().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.tasks.v2.Prior parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.Prior parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.Prior parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.Prior parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.Prior parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.Prior parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.Prior parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.Prior parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.tasks.v2.Prior parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.tasks.v2.Prior parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.tasks.v2.Prior parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.Prior parseFrom(
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
  public static Builder newBuilder(com.anduril.tasks.v2.Prior prototype) {
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
   * A Prior that can be used to inform an ISR Task.
   * </pre>
   *
   * Protobuf type {@code anduril.tasks.v2.Prior}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.tasks.v2.Prior)
      com.anduril.tasks.v2.PriorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_Prior_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_Prior_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.tasks.v2.Prior.class, com.anduril.tasks.v2.Prior.Builder.class);
    }

    // Construct using com.anduril.tasks.v2.Prior.newBuilder()
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
      if (pointBuilder_ != null) {
        pointBuilder_.clear();
      }
      priorCase_ = 0;
      prior_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_Prior_descriptor;
    }

    @java.lang.Override
    public com.anduril.tasks.v2.Prior getDefaultInstanceForType() {
      return com.anduril.tasks.v2.Prior.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.tasks.v2.Prior build() {
      com.anduril.tasks.v2.Prior result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.tasks.v2.Prior buildPartial() {
      com.anduril.tasks.v2.Prior result = new com.anduril.tasks.v2.Prior(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.tasks.v2.Prior result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.anduril.tasks.v2.Prior result) {
      result.priorCase_ = priorCase_;
      result.prior_ = this.prior_;
      if (priorCase_ == 5 &&
          pointBuilder_ != null) {
        result.prior_ = pointBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.tasks.v2.Prior) {
        return mergeFrom((com.anduril.tasks.v2.Prior)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.tasks.v2.Prior other) {
      if (other == com.anduril.tasks.v2.Prior.getDefaultInstance()) return this;
      switch (other.getPriorCase()) {
        case ENTITY_ID: {
          priorCase_ = 1;
          prior_ = other.prior_;
          onChanged();
          break;
        }
        case POINT: {
          mergePoint(other.getPoint());
          break;
        }
        case PRIOR_NOT_SET: {
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
              java.lang.String s = input.readStringRequireUtf8();
              priorCase_ = 1;
              prior_ = s;
              break;
            } // case 10
            case 42: {
              input.readMessage(
                  getPointFieldBuilder().getBuilder(),
                  extensionRegistry);
              priorCase_ = 5;
              break;
            } // case 42
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
    private int priorCase_ = 0;
    private java.lang.Object prior_;
    public PriorCase
        getPriorCase() {
      return PriorCase.forNumber(
          priorCase_);
    }

    public Builder clearPrior() {
      priorCase_ = 0;
      prior_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <pre>
     * Prefer Entity priors whenever the prior is in fact an entity. In other words, don't take position/point
     * out of an entity and pass it as a simple point.
     * </pre>
     *
     * <code>string entity_id = 1 [json_name = "entityId"];</code>
     * @return Whether the entityId field is set.
     */
    @java.lang.Override
    public boolean hasEntityId() {
      return priorCase_ == 1;
    }
    /**
     * <pre>
     * Prefer Entity priors whenever the prior is in fact an entity. In other words, don't take position/point
     * out of an entity and pass it as a simple point.
     * </pre>
     *
     * <code>string entity_id = 1 [json_name = "entityId"];</code>
     * @return The entityId.
     */
    @java.lang.Override
    public java.lang.String getEntityId() {
      java.lang.Object ref = "";
      if (priorCase_ == 1) {
        ref = prior_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (priorCase_ == 1) {
          prior_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Prefer Entity priors whenever the prior is in fact an entity. In other words, don't take position/point
     * out of an entity and pass it as a simple point.
     * </pre>
     *
     * <code>string entity_id = 1 [json_name = "entityId"];</code>
     * @return The bytes for entityId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEntityIdBytes() {
      java.lang.Object ref = "";
      if (priorCase_ == 1) {
        ref = prior_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (priorCase_ == 1) {
          prior_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Prefer Entity priors whenever the prior is in fact an entity. In other words, don't take position/point
     * out of an entity and pass it as a simple point.
     * </pre>
     *
     * <code>string entity_id = 1 [json_name = "entityId"];</code>
     * @param value The entityId to set.
     * @return This builder for chaining.
     */
    public Builder setEntityId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      priorCase_ = 1;
      prior_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Prefer Entity priors whenever the prior is in fact an entity. In other words, don't take position/point
     * out of an entity and pass it as a simple point.
     * </pre>
     *
     * <code>string entity_id = 1 [json_name = "entityId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEntityId() {
      if (priorCase_ == 1) {
        priorCase_ = 0;
        prior_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Prefer Entity priors whenever the prior is in fact an entity. In other words, don't take position/point
     * out of an entity and pass it as a simple point.
     * </pre>
     *
     * <code>string entity_id = 1 [json_name = "entityId"];</code>
     * @param value The bytes for entityId to set.
     * @return This builder for chaining.
     */
    public Builder setEntityIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      priorCase_ = 1;
      prior_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.tasks.v2.Point, com.anduril.tasks.v2.Point.Builder, com.anduril.tasks.v2.PointOrBuilder> pointBuilder_;
    /**
     * <pre>
     * Point priors for simple reference points that are not geo entities.
     * </pre>
     *
     * <code>.anduril.tasks.v2.Point point = 5 [json_name = "point"];</code>
     * @return Whether the point field is set.
     */
    @java.lang.Override
    public boolean hasPoint() {
      return priorCase_ == 5;
    }
    /**
     * <pre>
     * Point priors for simple reference points that are not geo entities.
     * </pre>
     *
     * <code>.anduril.tasks.v2.Point point = 5 [json_name = "point"];</code>
     * @return The point.
     */
    @java.lang.Override
    public com.anduril.tasks.v2.Point getPoint() {
      if (pointBuilder_ == null) {
        if (priorCase_ == 5) {
          return (com.anduril.tasks.v2.Point) prior_;
        }
        return com.anduril.tasks.v2.Point.getDefaultInstance();
      } else {
        if (priorCase_ == 5) {
          return pointBuilder_.getMessage();
        }
        return com.anduril.tasks.v2.Point.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Point priors for simple reference points that are not geo entities.
     * </pre>
     *
     * <code>.anduril.tasks.v2.Point point = 5 [json_name = "point"];</code>
     */
    public Builder setPoint(com.anduril.tasks.v2.Point value) {
      if (pointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        prior_ = value;
        onChanged();
      } else {
        pointBuilder_.setMessage(value);
      }
      priorCase_ = 5;
      return this;
    }
    /**
     * <pre>
     * Point priors for simple reference points that are not geo entities.
     * </pre>
     *
     * <code>.anduril.tasks.v2.Point point = 5 [json_name = "point"];</code>
     */
    public Builder setPoint(
        com.anduril.tasks.v2.Point.Builder builderForValue) {
      if (pointBuilder_ == null) {
        prior_ = builderForValue.build();
        onChanged();
      } else {
        pointBuilder_.setMessage(builderForValue.build());
      }
      priorCase_ = 5;
      return this;
    }
    /**
     * <pre>
     * Point priors for simple reference points that are not geo entities.
     * </pre>
     *
     * <code>.anduril.tasks.v2.Point point = 5 [json_name = "point"];</code>
     */
    public Builder mergePoint(com.anduril.tasks.v2.Point value) {
      if (pointBuilder_ == null) {
        if (priorCase_ == 5 &&
            prior_ != com.anduril.tasks.v2.Point.getDefaultInstance()) {
          prior_ = com.anduril.tasks.v2.Point.newBuilder((com.anduril.tasks.v2.Point) prior_)
              .mergeFrom(value).buildPartial();
        } else {
          prior_ = value;
        }
        onChanged();
      } else {
        if (priorCase_ == 5) {
          pointBuilder_.mergeFrom(value);
        } else {
          pointBuilder_.setMessage(value);
        }
      }
      priorCase_ = 5;
      return this;
    }
    /**
     * <pre>
     * Point priors for simple reference points that are not geo entities.
     * </pre>
     *
     * <code>.anduril.tasks.v2.Point point = 5 [json_name = "point"];</code>
     */
    public Builder clearPoint() {
      if (pointBuilder_ == null) {
        if (priorCase_ == 5) {
          priorCase_ = 0;
          prior_ = null;
          onChanged();
        }
      } else {
        if (priorCase_ == 5) {
          priorCase_ = 0;
          prior_ = null;
        }
        pointBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Point priors for simple reference points that are not geo entities.
     * </pre>
     *
     * <code>.anduril.tasks.v2.Point point = 5 [json_name = "point"];</code>
     */
    public com.anduril.tasks.v2.Point.Builder getPointBuilder() {
      return getPointFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Point priors for simple reference points that are not geo entities.
     * </pre>
     *
     * <code>.anduril.tasks.v2.Point point = 5 [json_name = "point"];</code>
     */
    @java.lang.Override
    public com.anduril.tasks.v2.PointOrBuilder getPointOrBuilder() {
      if ((priorCase_ == 5) && (pointBuilder_ != null)) {
        return pointBuilder_.getMessageOrBuilder();
      } else {
        if (priorCase_ == 5) {
          return (com.anduril.tasks.v2.Point) prior_;
        }
        return com.anduril.tasks.v2.Point.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Point priors for simple reference points that are not geo entities.
     * </pre>
     *
     * <code>.anduril.tasks.v2.Point point = 5 [json_name = "point"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.tasks.v2.Point, com.anduril.tasks.v2.Point.Builder, com.anduril.tasks.v2.PointOrBuilder> 
        getPointFieldBuilder() {
      if (pointBuilder_ == null) {
        if (!(priorCase_ == 5)) {
          prior_ = com.anduril.tasks.v2.Point.getDefaultInstance();
        }
        pointBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.anduril.tasks.v2.Point, com.anduril.tasks.v2.Point.Builder, com.anduril.tasks.v2.PointOrBuilder>(
                (com.anduril.tasks.v2.Point) prior_,
                getParentForChildren(),
                isClean());
        prior_ = null;
      }
      priorCase_ = 5;
      onChanged();
      return pointBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:anduril.tasks.v2.Prior)
  }

  // @@protoc_insertion_point(class_scope:anduril.tasks.v2.Prior)
  private static final com.anduril.tasks.v2.Prior DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.tasks.v2.Prior();
  }

  public static com.anduril.tasks.v2.Prior getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Prior>
      PARSER = new com.google.protobuf.AbstractParser<Prior>() {
    @java.lang.Override
    public Prior parsePartialFrom(
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

  public static com.google.protobuf.Parser<Prior> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Prior> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.tasks.v2.Prior getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

