// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/tasks/v2/shared/isr.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.tasks.v2;

/**
 * <pre>
 * Maps to UCI v2 LoiterType.
 * </pre>
 *
 * Protobuf type {@code anduril.tasks.v2.LoiterType}
 */
public final class LoiterType extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:anduril.tasks.v2.LoiterType)
    LoiterTypeOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      LoiterType.class.getName());
  }
  // Use LoiterType.newBuilder() to construct.
  private LoiterType(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private LoiterType() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_LoiterType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_LoiterType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.tasks.v2.LoiterType.class, com.anduril.tasks.v2.LoiterType.Builder.class);
  }

  private int loiterTypeCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object loiterType_;
  public enum LoiterTypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ORBIT_TYPE(1),
    LOITERTYPE_NOT_SET(0);
    private final int value;
    private LoiterTypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LoiterTypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static LoiterTypeCase forNumber(int value) {
      switch (value) {
        case 1: return ORBIT_TYPE;
        case 0: return LOITERTYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public LoiterTypeCase
  getLoiterTypeCase() {
    return LoiterTypeCase.forNumber(
        loiterTypeCase_);
  }

  public static final int ORBIT_TYPE_FIELD_NUMBER = 1;
  /**
   * <code>.anduril.tasks.v2.OrbitType orbit_type = 1 [json_name = "orbitType"];</code>
   * @return Whether the orbitType field is set.
   */
  @java.lang.Override
  public boolean hasOrbitType() {
    return loiterTypeCase_ == 1;
  }
  /**
   * <code>.anduril.tasks.v2.OrbitType orbit_type = 1 [json_name = "orbitType"];</code>
   * @return The orbitType.
   */
  @java.lang.Override
  public com.anduril.tasks.v2.OrbitType getOrbitType() {
    if (loiterTypeCase_ == 1) {
       return (com.anduril.tasks.v2.OrbitType) loiterType_;
    }
    return com.anduril.tasks.v2.OrbitType.getDefaultInstance();
  }
  /**
   * <code>.anduril.tasks.v2.OrbitType orbit_type = 1 [json_name = "orbitType"];</code>
   */
  @java.lang.Override
  public com.anduril.tasks.v2.OrbitTypeOrBuilder getOrbitTypeOrBuilder() {
    if (loiterTypeCase_ == 1) {
       return (com.anduril.tasks.v2.OrbitType) loiterType_;
    }
    return com.anduril.tasks.v2.OrbitType.getDefaultInstance();
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
    if (loiterTypeCase_ == 1) {
      output.writeMessage(1, (com.anduril.tasks.v2.OrbitType) loiterType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (loiterTypeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.anduril.tasks.v2.OrbitType) loiterType_);
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
    if (!(obj instanceof com.anduril.tasks.v2.LoiterType)) {
      return super.equals(obj);
    }
    com.anduril.tasks.v2.LoiterType other = (com.anduril.tasks.v2.LoiterType) obj;

    if (!getLoiterTypeCase().equals(other.getLoiterTypeCase())) return false;
    switch (loiterTypeCase_) {
      case 1:
        if (!getOrbitType()
            .equals(other.getOrbitType())) return false;
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
    switch (loiterTypeCase_) {
      case 1:
        hash = (37 * hash) + ORBIT_TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getOrbitType().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.tasks.v2.LoiterType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.LoiterType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.LoiterType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.LoiterType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.LoiterType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.LoiterType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.LoiterType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.LoiterType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.tasks.v2.LoiterType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.tasks.v2.LoiterType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.tasks.v2.LoiterType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.LoiterType parseFrom(
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
  public static Builder newBuilder(com.anduril.tasks.v2.LoiterType prototype) {
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
   * Maps to UCI v2 LoiterType.
   * </pre>
   *
   * Protobuf type {@code anduril.tasks.v2.LoiterType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.tasks.v2.LoiterType)
      com.anduril.tasks.v2.LoiterTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_LoiterType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_LoiterType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.tasks.v2.LoiterType.class, com.anduril.tasks.v2.LoiterType.Builder.class);
    }

    // Construct using com.anduril.tasks.v2.LoiterType.newBuilder()
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
      if (orbitTypeBuilder_ != null) {
        orbitTypeBuilder_.clear();
      }
      loiterTypeCase_ = 0;
      loiterType_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_LoiterType_descriptor;
    }

    @java.lang.Override
    public com.anduril.tasks.v2.LoiterType getDefaultInstanceForType() {
      return com.anduril.tasks.v2.LoiterType.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.tasks.v2.LoiterType build() {
      com.anduril.tasks.v2.LoiterType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.tasks.v2.LoiterType buildPartial() {
      com.anduril.tasks.v2.LoiterType result = new com.anduril.tasks.v2.LoiterType(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.tasks.v2.LoiterType result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.anduril.tasks.v2.LoiterType result) {
      result.loiterTypeCase_ = loiterTypeCase_;
      result.loiterType_ = this.loiterType_;
      if (loiterTypeCase_ == 1 &&
          orbitTypeBuilder_ != null) {
        result.loiterType_ = orbitTypeBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.tasks.v2.LoiterType) {
        return mergeFrom((com.anduril.tasks.v2.LoiterType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.tasks.v2.LoiterType other) {
      if (other == com.anduril.tasks.v2.LoiterType.getDefaultInstance()) return this;
      switch (other.getLoiterTypeCase()) {
        case ORBIT_TYPE: {
          mergeOrbitType(other.getOrbitType());
          break;
        }
        case LOITERTYPE_NOT_SET: {
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
                  getOrbitTypeFieldBuilder().getBuilder(),
                  extensionRegistry);
              loiterTypeCase_ = 1;
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
    private int loiterTypeCase_ = 0;
    private java.lang.Object loiterType_;
    public LoiterTypeCase
        getLoiterTypeCase() {
      return LoiterTypeCase.forNumber(
          loiterTypeCase_);
    }

    public Builder clearLoiterType() {
      loiterTypeCase_ = 0;
      loiterType_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.tasks.v2.OrbitType, com.anduril.tasks.v2.OrbitType.Builder, com.anduril.tasks.v2.OrbitTypeOrBuilder> orbitTypeBuilder_;
    /**
     * <code>.anduril.tasks.v2.OrbitType orbit_type = 1 [json_name = "orbitType"];</code>
     * @return Whether the orbitType field is set.
     */
    @java.lang.Override
    public boolean hasOrbitType() {
      return loiterTypeCase_ == 1;
    }
    /**
     * <code>.anduril.tasks.v2.OrbitType orbit_type = 1 [json_name = "orbitType"];</code>
     * @return The orbitType.
     */
    @java.lang.Override
    public com.anduril.tasks.v2.OrbitType getOrbitType() {
      if (orbitTypeBuilder_ == null) {
        if (loiterTypeCase_ == 1) {
          return (com.anduril.tasks.v2.OrbitType) loiterType_;
        }
        return com.anduril.tasks.v2.OrbitType.getDefaultInstance();
      } else {
        if (loiterTypeCase_ == 1) {
          return orbitTypeBuilder_.getMessage();
        }
        return com.anduril.tasks.v2.OrbitType.getDefaultInstance();
      }
    }
    /**
     * <code>.anduril.tasks.v2.OrbitType orbit_type = 1 [json_name = "orbitType"];</code>
     */
    public Builder setOrbitType(com.anduril.tasks.v2.OrbitType value) {
      if (orbitTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        loiterType_ = value;
        onChanged();
      } else {
        orbitTypeBuilder_.setMessage(value);
      }
      loiterTypeCase_ = 1;
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.OrbitType orbit_type = 1 [json_name = "orbitType"];</code>
     */
    public Builder setOrbitType(
        com.anduril.tasks.v2.OrbitType.Builder builderForValue) {
      if (orbitTypeBuilder_ == null) {
        loiterType_ = builderForValue.build();
        onChanged();
      } else {
        orbitTypeBuilder_.setMessage(builderForValue.build());
      }
      loiterTypeCase_ = 1;
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.OrbitType orbit_type = 1 [json_name = "orbitType"];</code>
     */
    public Builder mergeOrbitType(com.anduril.tasks.v2.OrbitType value) {
      if (orbitTypeBuilder_ == null) {
        if (loiterTypeCase_ == 1 &&
            loiterType_ != com.anduril.tasks.v2.OrbitType.getDefaultInstance()) {
          loiterType_ = com.anduril.tasks.v2.OrbitType.newBuilder((com.anduril.tasks.v2.OrbitType) loiterType_)
              .mergeFrom(value).buildPartial();
        } else {
          loiterType_ = value;
        }
        onChanged();
      } else {
        if (loiterTypeCase_ == 1) {
          orbitTypeBuilder_.mergeFrom(value);
        } else {
          orbitTypeBuilder_.setMessage(value);
        }
      }
      loiterTypeCase_ = 1;
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.OrbitType orbit_type = 1 [json_name = "orbitType"];</code>
     */
    public Builder clearOrbitType() {
      if (orbitTypeBuilder_ == null) {
        if (loiterTypeCase_ == 1) {
          loiterTypeCase_ = 0;
          loiterType_ = null;
          onChanged();
        }
      } else {
        if (loiterTypeCase_ == 1) {
          loiterTypeCase_ = 0;
          loiterType_ = null;
        }
        orbitTypeBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.anduril.tasks.v2.OrbitType orbit_type = 1 [json_name = "orbitType"];</code>
     */
    public com.anduril.tasks.v2.OrbitType.Builder getOrbitTypeBuilder() {
      return getOrbitTypeFieldBuilder().getBuilder();
    }
    /**
     * <code>.anduril.tasks.v2.OrbitType orbit_type = 1 [json_name = "orbitType"];</code>
     */
    @java.lang.Override
    public com.anduril.tasks.v2.OrbitTypeOrBuilder getOrbitTypeOrBuilder() {
      if ((loiterTypeCase_ == 1) && (orbitTypeBuilder_ != null)) {
        return orbitTypeBuilder_.getMessageOrBuilder();
      } else {
        if (loiterTypeCase_ == 1) {
          return (com.anduril.tasks.v2.OrbitType) loiterType_;
        }
        return com.anduril.tasks.v2.OrbitType.getDefaultInstance();
      }
    }
    /**
     * <code>.anduril.tasks.v2.OrbitType orbit_type = 1 [json_name = "orbitType"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.tasks.v2.OrbitType, com.anduril.tasks.v2.OrbitType.Builder, com.anduril.tasks.v2.OrbitTypeOrBuilder> 
        getOrbitTypeFieldBuilder() {
      if (orbitTypeBuilder_ == null) {
        if (!(loiterTypeCase_ == 1)) {
          loiterType_ = com.anduril.tasks.v2.OrbitType.getDefaultInstance();
        }
        orbitTypeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.anduril.tasks.v2.OrbitType, com.anduril.tasks.v2.OrbitType.Builder, com.anduril.tasks.v2.OrbitTypeOrBuilder>(
                (com.anduril.tasks.v2.OrbitType) loiterType_,
                getParentForChildren(),
                isClean());
        loiterType_ = null;
      }
      loiterTypeCase_ = 1;
      onChanged();
      return orbitTypeBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:anduril.tasks.v2.LoiterType)
  }

  // @@protoc_insertion_point(class_scope:anduril.tasks.v2.LoiterType)
  private static final com.anduril.tasks.v2.LoiterType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.tasks.v2.LoiterType();
  }

  public static com.anduril.tasks.v2.LoiterType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LoiterType>
      PARSER = new com.google.protobuf.AbstractParser<LoiterType>() {
    @java.lang.Override
    public LoiterType parsePartialFrom(
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

  public static com.google.protobuf.Parser<LoiterType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LoiterType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.tasks.v2.LoiterType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

