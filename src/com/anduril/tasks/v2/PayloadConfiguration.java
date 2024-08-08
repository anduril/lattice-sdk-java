// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/shared/strike.pub.proto

package com.anduril.tasks.v2;

/**
 * <pre>
 * Individual payload configuration, can represent a munition such as a missile, a gun, or a non-kinetic effect.
 * </pre>
 *
 * Protobuf type {@code anduril.tasks.v2.PayloadConfiguration}
 */
public final class PayloadConfiguration extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.tasks.v2.PayloadConfiguration)
    PayloadConfigurationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PayloadConfiguration.newBuilder() to construct.
  private PayloadConfiguration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PayloadConfiguration() {
    capabilityId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PayloadConfiguration();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.tasks.v2.StrikePubProto.internal_static_anduril_tasks_v2_PayloadConfiguration_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.tasks.v2.StrikePubProto.internal_static_anduril_tasks_v2_PayloadConfiguration_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.tasks.v2.PayloadConfiguration.class, com.anduril.tasks.v2.PayloadConfiguration.Builder.class);
  }

  public static final int CAPABILITY_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object capabilityId_ = "";
  /**
   * <pre>
   * Unique ID or descriptor for the capability.
   * </pre>
   *
   * <code>string capability_id = 1 [json_name = "capabilityId"];</code>
   * @return The capabilityId.
   */
  @java.lang.Override
  public java.lang.String getCapabilityId() {
    java.lang.Object ref = capabilityId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      capabilityId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Unique ID or descriptor for the capability.
   * </pre>
   *
   * <code>string capability_id = 1 [json_name = "capabilityId"];</code>
   * @return The bytes for capabilityId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCapabilityIdBytes() {
    java.lang.Object ref = capabilityId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      capabilityId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUANTITY_FIELD_NUMBER = 2;
  private int quantity_ = 0;
  /**
   * <code>uint32 quantity = 2 [json_name = "quantity"];</code>
   * @return The quantity.
   */
  @java.lang.Override
  public int getQuantity() {
    return quantity_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(capabilityId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, capabilityId_);
    }
    if (quantity_ != 0) {
      output.writeUInt32(2, quantity_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(capabilityId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, capabilityId_);
    }
    if (quantity_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, quantity_);
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
    if (!(obj instanceof com.anduril.tasks.v2.PayloadConfiguration)) {
      return super.equals(obj);
    }
    com.anduril.tasks.v2.PayloadConfiguration other = (com.anduril.tasks.v2.PayloadConfiguration) obj;

    if (!getCapabilityId()
        .equals(other.getCapabilityId())) return false;
    if (getQuantity()
        != other.getQuantity()) return false;
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
    hash = (37 * hash) + CAPABILITY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCapabilityId().hashCode();
    hash = (37 * hash) + QUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + getQuantity();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.tasks.v2.PayloadConfiguration parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.PayloadConfiguration parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.PayloadConfiguration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.PayloadConfiguration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.PayloadConfiguration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.PayloadConfiguration parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.PayloadConfiguration parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.PayloadConfiguration parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.tasks.v2.PayloadConfiguration parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.PayloadConfiguration parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.tasks.v2.PayloadConfiguration parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.PayloadConfiguration parseFrom(
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
  public static Builder newBuilder(com.anduril.tasks.v2.PayloadConfiguration prototype) {
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
   * Individual payload configuration, can represent a munition such as a missile, a gun, or a non-kinetic effect.
   * </pre>
   *
   * Protobuf type {@code anduril.tasks.v2.PayloadConfiguration}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.tasks.v2.PayloadConfiguration)
      com.anduril.tasks.v2.PayloadConfigurationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.tasks.v2.StrikePubProto.internal_static_anduril_tasks_v2_PayloadConfiguration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.tasks.v2.StrikePubProto.internal_static_anduril_tasks_v2_PayloadConfiguration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.tasks.v2.PayloadConfiguration.class, com.anduril.tasks.v2.PayloadConfiguration.Builder.class);
    }

    // Construct using com.anduril.tasks.v2.PayloadConfiguration.newBuilder()
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
      capabilityId_ = "";
      quantity_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.tasks.v2.StrikePubProto.internal_static_anduril_tasks_v2_PayloadConfiguration_descriptor;
    }

    @java.lang.Override
    public com.anduril.tasks.v2.PayloadConfiguration getDefaultInstanceForType() {
      return com.anduril.tasks.v2.PayloadConfiguration.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.tasks.v2.PayloadConfiguration build() {
      com.anduril.tasks.v2.PayloadConfiguration result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.tasks.v2.PayloadConfiguration buildPartial() {
      com.anduril.tasks.v2.PayloadConfiguration result = new com.anduril.tasks.v2.PayloadConfiguration(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.tasks.v2.PayloadConfiguration result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.capabilityId_ = capabilityId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.quantity_ = quantity_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.tasks.v2.PayloadConfiguration) {
        return mergeFrom((com.anduril.tasks.v2.PayloadConfiguration)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.tasks.v2.PayloadConfiguration other) {
      if (other == com.anduril.tasks.v2.PayloadConfiguration.getDefaultInstance()) return this;
      if (!other.getCapabilityId().isEmpty()) {
        capabilityId_ = other.capabilityId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getQuantity() != 0) {
        setQuantity(other.getQuantity());
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
              capabilityId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              quantity_ = input.readUInt32();
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

    private java.lang.Object capabilityId_ = "";
    /**
     * <pre>
     * Unique ID or descriptor for the capability.
     * </pre>
     *
     * <code>string capability_id = 1 [json_name = "capabilityId"];</code>
     * @return The capabilityId.
     */
    public java.lang.String getCapabilityId() {
      java.lang.Object ref = capabilityId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        capabilityId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Unique ID or descriptor for the capability.
     * </pre>
     *
     * <code>string capability_id = 1 [json_name = "capabilityId"];</code>
     * @return The bytes for capabilityId.
     */
    public com.google.protobuf.ByteString
        getCapabilityIdBytes() {
      java.lang.Object ref = capabilityId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        capabilityId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Unique ID or descriptor for the capability.
     * </pre>
     *
     * <code>string capability_id = 1 [json_name = "capabilityId"];</code>
     * @param value The capabilityId to set.
     * @return This builder for chaining.
     */
    public Builder setCapabilityId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      capabilityId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique ID or descriptor for the capability.
     * </pre>
     *
     * <code>string capability_id = 1 [json_name = "capabilityId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCapabilityId() {
      capabilityId_ = getDefaultInstance().getCapabilityId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique ID or descriptor for the capability.
     * </pre>
     *
     * <code>string capability_id = 1 [json_name = "capabilityId"];</code>
     * @param value The bytes for capabilityId to set.
     * @return This builder for chaining.
     */
    public Builder setCapabilityIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      capabilityId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int quantity_ ;
    /**
     * <code>uint32 quantity = 2 [json_name = "quantity"];</code>
     * @return The quantity.
     */
    @java.lang.Override
    public int getQuantity() {
      return quantity_;
    }
    /**
     * <code>uint32 quantity = 2 [json_name = "quantity"];</code>
     * @param value The quantity to set.
     * @return This builder for chaining.
     */
    public Builder setQuantity(int value) {

      quantity_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 quantity = 2 [json_name = "quantity"];</code>
     * @return This builder for chaining.
     */
    public Builder clearQuantity() {
      bitField0_ = (bitField0_ & ~0x00000002);
      quantity_ = 0;
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


    // @@protoc_insertion_point(builder_scope:anduril.tasks.v2.PayloadConfiguration)
  }

  // @@protoc_insertion_point(class_scope:anduril.tasks.v2.PayloadConfiguration)
  private static final com.anduril.tasks.v2.PayloadConfiguration DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.tasks.v2.PayloadConfiguration();
  }

  public static com.anduril.tasks.v2.PayloadConfiguration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PayloadConfiguration>
      PARSER = new com.google.protobuf.AbstractParser<PayloadConfiguration>() {
    @java.lang.Override
    public PayloadConfiguration parsePartialFrom(
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

  public static com.google.protobuf.Parser<PayloadConfiguration> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PayloadConfiguration> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.tasks.v2.PayloadConfiguration getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

