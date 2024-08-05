// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/entitymanager/v1/transponder_codes.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * Describes the Mode 5 transponder interrogation status and codes.
 * </pre>
 *
 * Protobuf type {@code anduril.entitymanager.v1.Mode5}
 */
public final class Mode5 extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.Mode5)
    Mode5OrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      Mode5.class.getName());
  }
  // Use Mode5.newBuilder() to construct.
  private Mode5(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Mode5() {
    mode5InterrogationResponse_ = 0;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.TransponderCodesPubProto.internal_static_anduril_entitymanager_v1_Mode5_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.TransponderCodesPubProto.internal_static_anduril_entitymanager_v1_Mode5_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.Mode5.class, com.anduril.entitymanager.v1.Mode5.Builder.class);
  }

  public static final int MODE5_INTERROGATION_RESPONSE_FIELD_NUMBER = 1;
  private int mode5InterrogationResponse_ = 0;
  /**
   * <pre>
   * The validity of the response from the Mode 5 interrogation.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.InterrogationResponse mode5_interrogation_response = 1 [json_name = "mode5InterrogationResponse"];</code>
   * @return The enum numeric value on the wire for mode5InterrogationResponse.
   */
  @java.lang.Override public int getMode5InterrogationResponseValue() {
    return mode5InterrogationResponse_;
  }
  /**
   * <pre>
   * The validity of the response from the Mode 5 interrogation.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.InterrogationResponse mode5_interrogation_response = 1 [json_name = "mode5InterrogationResponse"];</code>
   * @return The mode5InterrogationResponse.
   */
  @java.lang.Override public com.anduril.entitymanager.v1.InterrogationResponse getMode5InterrogationResponse() {
    com.anduril.entitymanager.v1.InterrogationResponse result = com.anduril.entitymanager.v1.InterrogationResponse.forNumber(mode5InterrogationResponse_);
    return result == null ? com.anduril.entitymanager.v1.InterrogationResponse.UNRECOGNIZED : result;
  }

  public static final int MODE5_FIELD_NUMBER = 2;
  private int mode5_ = 0;
  /**
   * <pre>
   * The Mode 5 code assigned to military assets. Mode 5 is a 12-bit decimal (1-4095) value. If displaying to a user,
   * convert to 4 digit octal 0001-7777. Note that Mode 5 codes are NOT unique by themselves, but should be used in
   * conjunction with the Mode 5 platform ID &amp; nationality to provide unique identification.
   * A zero mode code indicates No Statement.
   * </pre>
   *
   * <code>uint32 mode5 = 2 [json_name = "mode5"];</code>
   * @return The mode5.
   */
  @java.lang.Override
  public int getMode5() {
    return mode5_;
  }

  public static final int MODE5_PLATFORM_ID_FIELD_NUMBER = 3;
  private int mode5PlatformId_ = 0;
  /**
   * <pre>
   * The Mode 5 platform identification code. Expected values are between 1 and 16383. Used in conjunction with the
   * Nationality it provides IFF/SIF capabilities.
   * A zero platform id indicates No Statement.
   * </pre>
   *
   * <code>uint32 mode5_platform_id = 3 [json_name = "mode5PlatformId"];</code>
   * @return The mode5PlatformId.
   */
  @java.lang.Override
  public int getMode5PlatformId() {
    return mode5PlatformId_;
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
    if (mode5InterrogationResponse_ != com.anduril.entitymanager.v1.InterrogationResponse.INTERROGATION_RESPONSE_INVALID.getNumber()) {
      output.writeEnum(1, mode5InterrogationResponse_);
    }
    if (mode5_ != 0) {
      output.writeUInt32(2, mode5_);
    }
    if (mode5PlatformId_ != 0) {
      output.writeUInt32(3, mode5PlatformId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mode5InterrogationResponse_ != com.anduril.entitymanager.v1.InterrogationResponse.INTERROGATION_RESPONSE_INVALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, mode5InterrogationResponse_);
    }
    if (mode5_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, mode5_);
    }
    if (mode5PlatformId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, mode5PlatformId_);
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
    if (!(obj instanceof com.anduril.entitymanager.v1.Mode5)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.Mode5 other = (com.anduril.entitymanager.v1.Mode5) obj;

    if (mode5InterrogationResponse_ != other.mode5InterrogationResponse_) return false;
    if (getMode5()
        != other.getMode5()) return false;
    if (getMode5PlatformId()
        != other.getMode5PlatformId()) return false;
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
    hash = (37 * hash) + MODE5_INTERROGATION_RESPONSE_FIELD_NUMBER;
    hash = (53 * hash) + mode5InterrogationResponse_;
    hash = (37 * hash) + MODE5_FIELD_NUMBER;
    hash = (53 * hash) + getMode5();
    hash = (37 * hash) + MODE5_PLATFORM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getMode5PlatformId();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.Mode5 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.Mode5 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Mode5 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.Mode5 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Mode5 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.Mode5 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Mode5 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.Mode5 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.entitymanager.v1.Mode5 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.entitymanager.v1.Mode5 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Mode5 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.Mode5 parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.Mode5 prototype) {
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
   * Describes the Mode 5 transponder interrogation status and codes.
   * </pre>
   *
   * Protobuf type {@code anduril.entitymanager.v1.Mode5}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.Mode5)
      com.anduril.entitymanager.v1.Mode5OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.TransponderCodesPubProto.internal_static_anduril_entitymanager_v1_Mode5_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.TransponderCodesPubProto.internal_static_anduril_entitymanager_v1_Mode5_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.Mode5.class, com.anduril.entitymanager.v1.Mode5.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.Mode5.newBuilder()
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
      mode5InterrogationResponse_ = 0;
      mode5_ = 0;
      mode5PlatformId_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.TransponderCodesPubProto.internal_static_anduril_entitymanager_v1_Mode5_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.Mode5 getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.Mode5.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.Mode5 build() {
      com.anduril.entitymanager.v1.Mode5 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.Mode5 buildPartial() {
      com.anduril.entitymanager.v1.Mode5 result = new com.anduril.entitymanager.v1.Mode5(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.entitymanager.v1.Mode5 result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.mode5InterrogationResponse_ = mode5InterrogationResponse_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.mode5_ = mode5_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.mode5PlatformId_ = mode5PlatformId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entitymanager.v1.Mode5) {
        return mergeFrom((com.anduril.entitymanager.v1.Mode5)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.Mode5 other) {
      if (other == com.anduril.entitymanager.v1.Mode5.getDefaultInstance()) return this;
      if (other.mode5InterrogationResponse_ != 0) {
        setMode5InterrogationResponseValue(other.getMode5InterrogationResponseValue());
      }
      if (other.getMode5() != 0) {
        setMode5(other.getMode5());
      }
      if (other.getMode5PlatformId() != 0) {
        setMode5PlatformId(other.getMode5PlatformId());
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
            case 8: {
              mode5InterrogationResponse_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              mode5_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              mode5PlatformId_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private int mode5InterrogationResponse_ = 0;
    /**
     * <pre>
     * The validity of the response from the Mode 5 interrogation.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.InterrogationResponse mode5_interrogation_response = 1 [json_name = "mode5InterrogationResponse"];</code>
     * @return The enum numeric value on the wire for mode5InterrogationResponse.
     */
    @java.lang.Override public int getMode5InterrogationResponseValue() {
      return mode5InterrogationResponse_;
    }
    /**
     * <pre>
     * The validity of the response from the Mode 5 interrogation.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.InterrogationResponse mode5_interrogation_response = 1 [json_name = "mode5InterrogationResponse"];</code>
     * @param value The enum numeric value on the wire for mode5InterrogationResponse to set.
     * @return This builder for chaining.
     */
    public Builder setMode5InterrogationResponseValue(int value) {
      mode5InterrogationResponse_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The validity of the response from the Mode 5 interrogation.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.InterrogationResponse mode5_interrogation_response = 1 [json_name = "mode5InterrogationResponse"];</code>
     * @return The mode5InterrogationResponse.
     */
    @java.lang.Override
    public com.anduril.entitymanager.v1.InterrogationResponse getMode5InterrogationResponse() {
      com.anduril.entitymanager.v1.InterrogationResponse result = com.anduril.entitymanager.v1.InterrogationResponse.forNumber(mode5InterrogationResponse_);
      return result == null ? com.anduril.entitymanager.v1.InterrogationResponse.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The validity of the response from the Mode 5 interrogation.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.InterrogationResponse mode5_interrogation_response = 1 [json_name = "mode5InterrogationResponse"];</code>
     * @param value The mode5InterrogationResponse to set.
     * @return This builder for chaining.
     */
    public Builder setMode5InterrogationResponse(com.anduril.entitymanager.v1.InterrogationResponse value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      mode5InterrogationResponse_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The validity of the response from the Mode 5 interrogation.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.InterrogationResponse mode5_interrogation_response = 1 [json_name = "mode5InterrogationResponse"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMode5InterrogationResponse() {
      bitField0_ = (bitField0_ & ~0x00000001);
      mode5InterrogationResponse_ = 0;
      onChanged();
      return this;
    }

    private int mode5_ ;
    /**
     * <pre>
     * The Mode 5 code assigned to military assets. Mode 5 is a 12-bit decimal (1-4095) value. If displaying to a user,
     * convert to 4 digit octal 0001-7777. Note that Mode 5 codes are NOT unique by themselves, but should be used in
     * conjunction with the Mode 5 platform ID &amp; nationality to provide unique identification.
     * A zero mode code indicates No Statement.
     * </pre>
     *
     * <code>uint32 mode5 = 2 [json_name = "mode5"];</code>
     * @return The mode5.
     */
    @java.lang.Override
    public int getMode5() {
      return mode5_;
    }
    /**
     * <pre>
     * The Mode 5 code assigned to military assets. Mode 5 is a 12-bit decimal (1-4095) value. If displaying to a user,
     * convert to 4 digit octal 0001-7777. Note that Mode 5 codes are NOT unique by themselves, but should be used in
     * conjunction with the Mode 5 platform ID &amp; nationality to provide unique identification.
     * A zero mode code indicates No Statement.
     * </pre>
     *
     * <code>uint32 mode5 = 2 [json_name = "mode5"];</code>
     * @param value The mode5 to set.
     * @return This builder for chaining.
     */
    public Builder setMode5(int value) {

      mode5_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Mode 5 code assigned to military assets. Mode 5 is a 12-bit decimal (1-4095) value. If displaying to a user,
     * convert to 4 digit octal 0001-7777. Note that Mode 5 codes are NOT unique by themselves, but should be used in
     * conjunction with the Mode 5 platform ID &amp; nationality to provide unique identification.
     * A zero mode code indicates No Statement.
     * </pre>
     *
     * <code>uint32 mode5 = 2 [json_name = "mode5"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMode5() {
      bitField0_ = (bitField0_ & ~0x00000002);
      mode5_ = 0;
      onChanged();
      return this;
    }

    private int mode5PlatformId_ ;
    /**
     * <pre>
     * The Mode 5 platform identification code. Expected values are between 1 and 16383. Used in conjunction with the
     * Nationality it provides IFF/SIF capabilities.
     * A zero platform id indicates No Statement.
     * </pre>
     *
     * <code>uint32 mode5_platform_id = 3 [json_name = "mode5PlatformId"];</code>
     * @return The mode5PlatformId.
     */
    @java.lang.Override
    public int getMode5PlatformId() {
      return mode5PlatformId_;
    }
    /**
     * <pre>
     * The Mode 5 platform identification code. Expected values are between 1 and 16383. Used in conjunction with the
     * Nationality it provides IFF/SIF capabilities.
     * A zero platform id indicates No Statement.
     * </pre>
     *
     * <code>uint32 mode5_platform_id = 3 [json_name = "mode5PlatformId"];</code>
     * @param value The mode5PlatformId to set.
     * @return This builder for chaining.
     */
    public Builder setMode5PlatformId(int value) {

      mode5PlatformId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Mode 5 platform identification code. Expected values are between 1 and 16383. Used in conjunction with the
     * Nationality it provides IFF/SIF capabilities.
     * A zero platform id indicates No Statement.
     * </pre>
     *
     * <code>uint32 mode5_platform_id = 3 [json_name = "mode5PlatformId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMode5PlatformId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      mode5PlatformId_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.Mode5)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.Mode5)
  private static final com.anduril.entitymanager.v1.Mode5 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.Mode5();
  }

  public static com.anduril.entitymanager.v1.Mode5 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Mode5>
      PARSER = new com.google.protobuf.AbstractParser<Mode5>() {
    @java.lang.Override
    public Mode5 parsePartialFrom(
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

  public static com.google.protobuf.Parser<Mode5> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Mode5> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.Mode5 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

