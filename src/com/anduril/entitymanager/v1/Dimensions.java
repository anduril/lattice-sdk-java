// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/entitymanager/v1/dimensions.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.entitymanager.v1;

/**
 * Protobuf type {@code anduril.entitymanager.v1.Dimensions}
 */
public final class Dimensions extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.Dimensions)
    DimensionsOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      Dimensions.class.getName());
  }
  // Use Dimensions.newBuilder() to construct.
  private Dimensions(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Dimensions() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.DimensionsPubProto.internal_static_anduril_entitymanager_v1_Dimensions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.DimensionsPubProto.internal_static_anduril_entitymanager_v1_Dimensions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.Dimensions.class, com.anduril.entitymanager.v1.Dimensions.Builder.class);
  }

  public static final int LENGTH_M_FIELD_NUMBER = 1;
  private float lengthM_ = 0F;
  /**
   * <pre>
   * Length of the entity in meters
   * </pre>
   *
   * <code>float length_m = 1 [json_name = "lengthM"];</code>
   * @return The lengthM.
   */
  @java.lang.Override
  public float getLengthM() {
    return lengthM_;
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
    if (java.lang.Float.floatToRawIntBits(lengthM_) != 0) {
      output.writeFloat(1, lengthM_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(lengthM_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, lengthM_);
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
    if (!(obj instanceof com.anduril.entitymanager.v1.Dimensions)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.Dimensions other = (com.anduril.entitymanager.v1.Dimensions) obj;

    if (java.lang.Float.floatToIntBits(getLengthM())
        != java.lang.Float.floatToIntBits(
            other.getLengthM())) return false;
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
    hash = (37 * hash) + LENGTH_M_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getLengthM());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.Dimensions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.Dimensions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Dimensions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.Dimensions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Dimensions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.Dimensions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Dimensions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.Dimensions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.entitymanager.v1.Dimensions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.entitymanager.v1.Dimensions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Dimensions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.Dimensions parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.Dimensions prototype) {
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
   * Protobuf type {@code anduril.entitymanager.v1.Dimensions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.Dimensions)
      com.anduril.entitymanager.v1.DimensionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.DimensionsPubProto.internal_static_anduril_entitymanager_v1_Dimensions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.DimensionsPubProto.internal_static_anduril_entitymanager_v1_Dimensions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.Dimensions.class, com.anduril.entitymanager.v1.Dimensions.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.Dimensions.newBuilder()
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
      lengthM_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.DimensionsPubProto.internal_static_anduril_entitymanager_v1_Dimensions_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.Dimensions getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.Dimensions.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.Dimensions build() {
      com.anduril.entitymanager.v1.Dimensions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.Dimensions buildPartial() {
      com.anduril.entitymanager.v1.Dimensions result = new com.anduril.entitymanager.v1.Dimensions(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.entitymanager.v1.Dimensions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.lengthM_ = lengthM_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entitymanager.v1.Dimensions) {
        return mergeFrom((com.anduril.entitymanager.v1.Dimensions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.Dimensions other) {
      if (other == com.anduril.entitymanager.v1.Dimensions.getDefaultInstance()) return this;
      if (other.getLengthM() != 0F) {
        setLengthM(other.getLengthM());
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
            case 13: {
              lengthM_ = input.readFloat();
              bitField0_ |= 0x00000001;
              break;
            } // case 13
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

    private float lengthM_ ;
    /**
     * <pre>
     * Length of the entity in meters
     * </pre>
     *
     * <code>float length_m = 1 [json_name = "lengthM"];</code>
     * @return The lengthM.
     */
    @java.lang.Override
    public float getLengthM() {
      return lengthM_;
    }
    /**
     * <pre>
     * Length of the entity in meters
     * </pre>
     *
     * <code>float length_m = 1 [json_name = "lengthM"];</code>
     * @param value The lengthM to set.
     * @return This builder for chaining.
     */
    public Builder setLengthM(float value) {

      lengthM_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Length of the entity in meters
     * </pre>
     *
     * <code>float length_m = 1 [json_name = "lengthM"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLengthM() {
      bitField0_ = (bitField0_ & ~0x00000001);
      lengthM_ = 0F;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.Dimensions)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.Dimensions)
  private static final com.anduril.entitymanager.v1.Dimensions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.Dimensions();
  }

  public static com.anduril.entitymanager.v1.Dimensions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Dimensions>
      PARSER = new com.google.protobuf.AbstractParser<Dimensions>() {
    @java.lang.Override
    public Dimensions parsePartialFrom(
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

  public static com.google.protobuf.Parser<Dimensions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Dimensions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.Dimensions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

