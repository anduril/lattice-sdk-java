// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/target_priority.pub.proto

package com.anduril.entitymanager.v1;

/**
 * Protobuf type {@code anduril.entitymanager.v1.HighValueTargetMatch}
 */
public final class HighValueTargetMatch extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.HighValueTargetMatch)
    HighValueTargetMatchOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HighValueTargetMatch.newBuilder() to construct.
  private HighValueTargetMatch(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HighValueTargetMatch() {
    highValueTargetListId_ = "";
    highValueTargetDescriptionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HighValueTargetMatch();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.TargetPriorityPubProto.internal_static_anduril_entitymanager_v1_HighValueTargetMatch_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.TargetPriorityPubProto.internal_static_anduril_entitymanager_v1_HighValueTargetMatch_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.HighValueTargetMatch.class, com.anduril.entitymanager.v1.HighValueTargetMatch.Builder.class);
  }

  public static final int HIGH_VALUE_TARGET_LIST_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object highValueTargetListId_ = "";
  /**
   * <pre>
   * The ID of the high value target list that matches the target description.
   * </pre>
   *
   * <code>string high_value_target_list_id = 1 [json_name = "highValueTargetListId"];</code>
   * @return The highValueTargetListId.
   */
  @java.lang.Override
  public java.lang.String getHighValueTargetListId() {
    java.lang.Object ref = highValueTargetListId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      highValueTargetListId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The ID of the high value target list that matches the target description.
   * </pre>
   *
   * <code>string high_value_target_list_id = 1 [json_name = "highValueTargetListId"];</code>
   * @return The bytes for highValueTargetListId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHighValueTargetListIdBytes() {
    java.lang.Object ref = highValueTargetListId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      highValueTargetListId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HIGH_VALUE_TARGET_DESCRIPTION_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object highValueTargetDescriptionId_ = "";
  /**
   * <pre>
   * The ID of the specific high value target description within a high value target list that was matched against.
   * The ID is considered to be a globally unique identifier across all high value target IDs.
   * </pre>
   *
   * <code>string high_value_target_description_id = 2 [json_name = "highValueTargetDescriptionId"];</code>
   * @return The highValueTargetDescriptionId.
   */
  @java.lang.Override
  public java.lang.String getHighValueTargetDescriptionId() {
    java.lang.Object ref = highValueTargetDescriptionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      highValueTargetDescriptionId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The ID of the specific high value target description within a high value target list that was matched against.
   * The ID is considered to be a globally unique identifier across all high value target IDs.
   * </pre>
   *
   * <code>string high_value_target_description_id = 2 [json_name = "highValueTargetDescriptionId"];</code>
   * @return The bytes for highValueTargetDescriptionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHighValueTargetDescriptionIdBytes() {
    java.lang.Object ref = highValueTargetDescriptionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      highValueTargetDescriptionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(highValueTargetListId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, highValueTargetListId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(highValueTargetDescriptionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, highValueTargetDescriptionId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(highValueTargetListId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, highValueTargetListId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(highValueTargetDescriptionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, highValueTargetDescriptionId_);
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
    if (!(obj instanceof com.anduril.entitymanager.v1.HighValueTargetMatch)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.HighValueTargetMatch other = (com.anduril.entitymanager.v1.HighValueTargetMatch) obj;

    if (!getHighValueTargetListId()
        .equals(other.getHighValueTargetListId())) return false;
    if (!getHighValueTargetDescriptionId()
        .equals(other.getHighValueTargetDescriptionId())) return false;
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
    hash = (37 * hash) + HIGH_VALUE_TARGET_LIST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getHighValueTargetListId().hashCode();
    hash = (37 * hash) + HIGH_VALUE_TARGET_DESCRIPTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getHighValueTargetDescriptionId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.HighValueTargetMatch parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.HighValueTargetMatch parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.HighValueTargetMatch parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.HighValueTargetMatch parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.HighValueTargetMatch parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.HighValueTargetMatch parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.HighValueTargetMatch parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.HighValueTargetMatch parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.HighValueTargetMatch parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.HighValueTargetMatch parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.HighValueTargetMatch parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.HighValueTargetMatch parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.HighValueTargetMatch prototype) {
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
   * Protobuf type {@code anduril.entitymanager.v1.HighValueTargetMatch}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.HighValueTargetMatch)
      com.anduril.entitymanager.v1.HighValueTargetMatchOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.TargetPriorityPubProto.internal_static_anduril_entitymanager_v1_HighValueTargetMatch_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.TargetPriorityPubProto.internal_static_anduril_entitymanager_v1_HighValueTargetMatch_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.HighValueTargetMatch.class, com.anduril.entitymanager.v1.HighValueTargetMatch.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.HighValueTargetMatch.newBuilder()
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
      highValueTargetListId_ = "";
      highValueTargetDescriptionId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.TargetPriorityPubProto.internal_static_anduril_entitymanager_v1_HighValueTargetMatch_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.HighValueTargetMatch getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.HighValueTargetMatch.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.HighValueTargetMatch build() {
      com.anduril.entitymanager.v1.HighValueTargetMatch result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.HighValueTargetMatch buildPartial() {
      com.anduril.entitymanager.v1.HighValueTargetMatch result = new com.anduril.entitymanager.v1.HighValueTargetMatch(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.entitymanager.v1.HighValueTargetMatch result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.highValueTargetListId_ = highValueTargetListId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.highValueTargetDescriptionId_ = highValueTargetDescriptionId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entitymanager.v1.HighValueTargetMatch) {
        return mergeFrom((com.anduril.entitymanager.v1.HighValueTargetMatch)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.HighValueTargetMatch other) {
      if (other == com.anduril.entitymanager.v1.HighValueTargetMatch.getDefaultInstance()) return this;
      if (!other.getHighValueTargetListId().isEmpty()) {
        highValueTargetListId_ = other.highValueTargetListId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getHighValueTargetDescriptionId().isEmpty()) {
        highValueTargetDescriptionId_ = other.highValueTargetDescriptionId_;
        bitField0_ |= 0x00000002;
        onChanged();
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
              highValueTargetListId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              highValueTargetDescriptionId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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
    private int bitField0_;

    private java.lang.Object highValueTargetListId_ = "";
    /**
     * <pre>
     * The ID of the high value target list that matches the target description.
     * </pre>
     *
     * <code>string high_value_target_list_id = 1 [json_name = "highValueTargetListId"];</code>
     * @return The highValueTargetListId.
     */
    public java.lang.String getHighValueTargetListId() {
      java.lang.Object ref = highValueTargetListId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        highValueTargetListId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The ID of the high value target list that matches the target description.
     * </pre>
     *
     * <code>string high_value_target_list_id = 1 [json_name = "highValueTargetListId"];</code>
     * @return The bytes for highValueTargetListId.
     */
    public com.google.protobuf.ByteString
        getHighValueTargetListIdBytes() {
      java.lang.Object ref = highValueTargetListId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        highValueTargetListId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The ID of the high value target list that matches the target description.
     * </pre>
     *
     * <code>string high_value_target_list_id = 1 [json_name = "highValueTargetListId"];</code>
     * @param value The highValueTargetListId to set.
     * @return This builder for chaining.
     */
    public Builder setHighValueTargetListId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      highValueTargetListId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the high value target list that matches the target description.
     * </pre>
     *
     * <code>string high_value_target_list_id = 1 [json_name = "highValueTargetListId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHighValueTargetListId() {
      highValueTargetListId_ = getDefaultInstance().getHighValueTargetListId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the high value target list that matches the target description.
     * </pre>
     *
     * <code>string high_value_target_list_id = 1 [json_name = "highValueTargetListId"];</code>
     * @param value The bytes for highValueTargetListId to set.
     * @return This builder for chaining.
     */
    public Builder setHighValueTargetListIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      highValueTargetListId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object highValueTargetDescriptionId_ = "";
    /**
     * <pre>
     * The ID of the specific high value target description within a high value target list that was matched against.
     * The ID is considered to be a globally unique identifier across all high value target IDs.
     * </pre>
     *
     * <code>string high_value_target_description_id = 2 [json_name = "highValueTargetDescriptionId"];</code>
     * @return The highValueTargetDescriptionId.
     */
    public java.lang.String getHighValueTargetDescriptionId() {
      java.lang.Object ref = highValueTargetDescriptionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        highValueTargetDescriptionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The ID of the specific high value target description within a high value target list that was matched against.
     * The ID is considered to be a globally unique identifier across all high value target IDs.
     * </pre>
     *
     * <code>string high_value_target_description_id = 2 [json_name = "highValueTargetDescriptionId"];</code>
     * @return The bytes for highValueTargetDescriptionId.
     */
    public com.google.protobuf.ByteString
        getHighValueTargetDescriptionIdBytes() {
      java.lang.Object ref = highValueTargetDescriptionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        highValueTargetDescriptionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The ID of the specific high value target description within a high value target list that was matched against.
     * The ID is considered to be a globally unique identifier across all high value target IDs.
     * </pre>
     *
     * <code>string high_value_target_description_id = 2 [json_name = "highValueTargetDescriptionId"];</code>
     * @param value The highValueTargetDescriptionId to set.
     * @return This builder for chaining.
     */
    public Builder setHighValueTargetDescriptionId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      highValueTargetDescriptionId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the specific high value target description within a high value target list that was matched against.
     * The ID is considered to be a globally unique identifier across all high value target IDs.
     * </pre>
     *
     * <code>string high_value_target_description_id = 2 [json_name = "highValueTargetDescriptionId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHighValueTargetDescriptionId() {
      highValueTargetDescriptionId_ = getDefaultInstance().getHighValueTargetDescriptionId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the specific high value target description within a high value target list that was matched against.
     * The ID is considered to be a globally unique identifier across all high value target IDs.
     * </pre>
     *
     * <code>string high_value_target_description_id = 2 [json_name = "highValueTargetDescriptionId"];</code>
     * @param value The bytes for highValueTargetDescriptionId to set.
     * @return This builder for chaining.
     */
    public Builder setHighValueTargetDescriptionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      highValueTargetDescriptionId_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.HighValueTargetMatch)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.HighValueTargetMatch)
  private static final com.anduril.entitymanager.v1.HighValueTargetMatch DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.HighValueTargetMatch();
  }

  public static com.anduril.entitymanager.v1.HighValueTargetMatch getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HighValueTargetMatch>
      PARSER = new com.google.protobuf.AbstractParser<HighValueTargetMatch>() {
    @java.lang.Override
    public HighValueTargetMatch parsePartialFrom(
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

  public static com.google.protobuf.Parser<HighValueTargetMatch> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HighValueTargetMatch> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.HighValueTargetMatch getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

