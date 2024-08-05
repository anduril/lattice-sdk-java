// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/taskmanager/v1/task.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.taskmanager.v1;

/**
 * <pre>
 * System Principal representing some autonomous system.
 * </pre>
 *
 * Protobuf type {@code anduril.taskmanager.v1.System}
 */
public final class System extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:anduril.taskmanager.v1.System)
    SystemOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      System.class.getName());
  }
  // Use System.newBuilder() to construct.
  private System(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private System() {
    serviceName_ = "";
    entityId_ = "";
    assetId_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.taskmanager.v1.TaskPubProto.internal_static_anduril_taskmanager_v1_System_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.taskmanager.v1.TaskPubProto.internal_static_anduril_taskmanager_v1_System_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.taskmanager.v1.System.class, com.anduril.taskmanager.v1.System.Builder.class);
  }

  public static final int SERVICE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object serviceName_ = "";
  /**
   * <pre>
   * Name of the service associated with this System.
   * </pre>
   *
   * <code>string service_name = 1 [json_name = "serviceName"];</code>
   * @return The serviceName.
   */
  @java.lang.Override
  public java.lang.String getServiceName() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the service associated with this System.
   * </pre>
   *
   * <code>string service_name = 1 [json_name = "serviceName"];</code>
   * @return The bytes for serviceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getServiceNameBytes() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENTITY_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object entityId_ = "";
  /**
   * <pre>
   * The Entity ID of the System.
   * </pre>
   *
   * <code>string entity_id = 2 [json_name = "entityId"];</code>
   * @return The entityId.
   */
  @java.lang.Override
  public java.lang.String getEntityId() {
    java.lang.Object ref = entityId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      entityId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Entity ID of the System.
   * </pre>
   *
   * <code>string entity_id = 2 [json_name = "entityId"];</code>
   * @return The bytes for entityId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEntityIdBytes() {
    java.lang.Object ref = entityId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      entityId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASSET_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object assetId_ = "";
  /**
   * <pre>
   * The Asset ID of the System.
   * </pre>
   *
   * <code>string asset_id = 3 [json_name = "assetId"];</code>
   * @return The assetId.
   */
  @java.lang.Override
  public java.lang.String getAssetId() {
    java.lang.Object ref = assetId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      assetId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Asset ID of the System.
   * </pre>
   *
   * <code>string asset_id = 3 [json_name = "assetId"];</code>
   * @return The bytes for assetId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAssetIdBytes() {
    java.lang.Object ref = assetId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      assetId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MANAGES_OWN_SCHEDULING_FIELD_NUMBER = 4;
  private boolean managesOwnScheduling_ = false;
  /**
   * <pre>
   * Whether the System Principal (for example, an Asset) can own scheduling.
   * This means we bypass manager-owned scheduling and defer to the system
   * Principal to handle scheduling and give us status updates for the Task.
   * Regardless of the value defined by the client, the Task Manager will
   * determine and set this value appropriately.
   * </pre>
   *
   * <code>bool manages_own_scheduling = 4 [json_name = "managesOwnScheduling"];</code>
   * @return The managesOwnScheduling.
   */
  @java.lang.Override
  public boolean getManagesOwnScheduling() {
    return managesOwnScheduling_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(serviceName_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, serviceName_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(entityId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, entityId_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(assetId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, assetId_);
    }
    if (managesOwnScheduling_ != false) {
      output.writeBool(4, managesOwnScheduling_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(serviceName_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, serviceName_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(entityId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, entityId_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(assetId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, assetId_);
    }
    if (managesOwnScheduling_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, managesOwnScheduling_);
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
    if (!(obj instanceof com.anduril.taskmanager.v1.System)) {
      return super.equals(obj);
    }
    com.anduril.taskmanager.v1.System other = (com.anduril.taskmanager.v1.System) obj;

    if (!getServiceName()
        .equals(other.getServiceName())) return false;
    if (!getEntityId()
        .equals(other.getEntityId())) return false;
    if (!getAssetId()
        .equals(other.getAssetId())) return false;
    if (getManagesOwnScheduling()
        != other.getManagesOwnScheduling()) return false;
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
    hash = (37 * hash) + SERVICE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getServiceName().hashCode();
    hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEntityId().hashCode();
    hash = (37 * hash) + ASSET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAssetId().hashCode();
    hash = (37 * hash) + MANAGES_OWN_SCHEDULING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getManagesOwnScheduling());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.taskmanager.v1.System parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.taskmanager.v1.System parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.System parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.taskmanager.v1.System parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.System parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.taskmanager.v1.System parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.System parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.taskmanager.v1.System parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.taskmanager.v1.System parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.taskmanager.v1.System parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.taskmanager.v1.System parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.taskmanager.v1.System parseFrom(
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
  public static Builder newBuilder(com.anduril.taskmanager.v1.System prototype) {
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
   * System Principal representing some autonomous system.
   * </pre>
   *
   * Protobuf type {@code anduril.taskmanager.v1.System}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.taskmanager.v1.System)
      com.anduril.taskmanager.v1.SystemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.taskmanager.v1.TaskPubProto.internal_static_anduril_taskmanager_v1_System_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.taskmanager.v1.TaskPubProto.internal_static_anduril_taskmanager_v1_System_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.taskmanager.v1.System.class, com.anduril.taskmanager.v1.System.Builder.class);
    }

    // Construct using com.anduril.taskmanager.v1.System.newBuilder()
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
      serviceName_ = "";
      entityId_ = "";
      assetId_ = "";
      managesOwnScheduling_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.taskmanager.v1.TaskPubProto.internal_static_anduril_taskmanager_v1_System_descriptor;
    }

    @java.lang.Override
    public com.anduril.taskmanager.v1.System getDefaultInstanceForType() {
      return com.anduril.taskmanager.v1.System.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.taskmanager.v1.System build() {
      com.anduril.taskmanager.v1.System result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.taskmanager.v1.System buildPartial() {
      com.anduril.taskmanager.v1.System result = new com.anduril.taskmanager.v1.System(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.taskmanager.v1.System result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.serviceName_ = serviceName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.entityId_ = entityId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.assetId_ = assetId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.managesOwnScheduling_ = managesOwnScheduling_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.taskmanager.v1.System) {
        return mergeFrom((com.anduril.taskmanager.v1.System)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.taskmanager.v1.System other) {
      if (other == com.anduril.taskmanager.v1.System.getDefaultInstance()) return this;
      if (!other.getServiceName().isEmpty()) {
        serviceName_ = other.serviceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getEntityId().isEmpty()) {
        entityId_ = other.entityId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getAssetId().isEmpty()) {
        assetId_ = other.assetId_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getManagesOwnScheduling() != false) {
        setManagesOwnScheduling(other.getManagesOwnScheduling());
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
              serviceName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              entityId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              assetId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              managesOwnScheduling_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private java.lang.Object serviceName_ = "";
    /**
     * <pre>
     * Name of the service associated with this System.
     * </pre>
     *
     * <code>string service_name = 1 [json_name = "serviceName"];</code>
     * @return The serviceName.
     */
    public java.lang.String getServiceName() {
      java.lang.Object ref = serviceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the service associated with this System.
     * </pre>
     *
     * <code>string service_name = 1 [json_name = "serviceName"];</code>
     * @return The bytes for serviceName.
     */
    public com.google.protobuf.ByteString
        getServiceNameBytes() {
      java.lang.Object ref = serviceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the service associated with this System.
     * </pre>
     *
     * <code>string service_name = 1 [json_name = "serviceName"];</code>
     * @param value The serviceName to set.
     * @return This builder for chaining.
     */
    public Builder setServiceName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      serviceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the service associated with this System.
     * </pre>
     *
     * <code>string service_name = 1 [json_name = "serviceName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearServiceName() {
      serviceName_ = getDefaultInstance().getServiceName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the service associated with this System.
     * </pre>
     *
     * <code>string service_name = 1 [json_name = "serviceName"];</code>
     * @param value The bytes for serviceName to set.
     * @return This builder for chaining.
     */
    public Builder setServiceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      serviceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object entityId_ = "";
    /**
     * <pre>
     * The Entity ID of the System.
     * </pre>
     *
     * <code>string entity_id = 2 [json_name = "entityId"];</code>
     * @return The entityId.
     */
    public java.lang.String getEntityId() {
      java.lang.Object ref = entityId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        entityId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Entity ID of the System.
     * </pre>
     *
     * <code>string entity_id = 2 [json_name = "entityId"];</code>
     * @return The bytes for entityId.
     */
    public com.google.protobuf.ByteString
        getEntityIdBytes() {
      java.lang.Object ref = entityId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        entityId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Entity ID of the System.
     * </pre>
     *
     * <code>string entity_id = 2 [json_name = "entityId"];</code>
     * @param value The entityId to set.
     * @return This builder for chaining.
     */
    public Builder setEntityId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      entityId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Entity ID of the System.
     * </pre>
     *
     * <code>string entity_id = 2 [json_name = "entityId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEntityId() {
      entityId_ = getDefaultInstance().getEntityId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Entity ID of the System.
     * </pre>
     *
     * <code>string entity_id = 2 [json_name = "entityId"];</code>
     * @param value The bytes for entityId to set.
     * @return This builder for chaining.
     */
    public Builder setEntityIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      entityId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object assetId_ = "";
    /**
     * <pre>
     * The Asset ID of the System.
     * </pre>
     *
     * <code>string asset_id = 3 [json_name = "assetId"];</code>
     * @return The assetId.
     */
    public java.lang.String getAssetId() {
      java.lang.Object ref = assetId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        assetId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Asset ID of the System.
     * </pre>
     *
     * <code>string asset_id = 3 [json_name = "assetId"];</code>
     * @return The bytes for assetId.
     */
    public com.google.protobuf.ByteString
        getAssetIdBytes() {
      java.lang.Object ref = assetId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        assetId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Asset ID of the System.
     * </pre>
     *
     * <code>string asset_id = 3 [json_name = "assetId"];</code>
     * @param value The assetId to set.
     * @return This builder for chaining.
     */
    public Builder setAssetId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      assetId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Asset ID of the System.
     * </pre>
     *
     * <code>string asset_id = 3 [json_name = "assetId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAssetId() {
      assetId_ = getDefaultInstance().getAssetId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Asset ID of the System.
     * </pre>
     *
     * <code>string asset_id = 3 [json_name = "assetId"];</code>
     * @param value The bytes for assetId to set.
     * @return This builder for chaining.
     */
    public Builder setAssetIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      assetId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private boolean managesOwnScheduling_ ;
    /**
     * <pre>
     * Whether the System Principal (for example, an Asset) can own scheduling.
     * This means we bypass manager-owned scheduling and defer to the system
     * Principal to handle scheduling and give us status updates for the Task.
     * Regardless of the value defined by the client, the Task Manager will
     * determine and set this value appropriately.
     * </pre>
     *
     * <code>bool manages_own_scheduling = 4 [json_name = "managesOwnScheduling"];</code>
     * @return The managesOwnScheduling.
     */
    @java.lang.Override
    public boolean getManagesOwnScheduling() {
      return managesOwnScheduling_;
    }
    /**
     * <pre>
     * Whether the System Principal (for example, an Asset) can own scheduling.
     * This means we bypass manager-owned scheduling and defer to the system
     * Principal to handle scheduling and give us status updates for the Task.
     * Regardless of the value defined by the client, the Task Manager will
     * determine and set this value appropriately.
     * </pre>
     *
     * <code>bool manages_own_scheduling = 4 [json_name = "managesOwnScheduling"];</code>
     * @param value The managesOwnScheduling to set.
     * @return This builder for chaining.
     */
    public Builder setManagesOwnScheduling(boolean value) {

      managesOwnScheduling_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether the System Principal (for example, an Asset) can own scheduling.
     * This means we bypass manager-owned scheduling and defer to the system
     * Principal to handle scheduling and give us status updates for the Task.
     * Regardless of the value defined by the client, the Task Manager will
     * determine and set this value appropriately.
     * </pre>
     *
     * <code>bool manages_own_scheduling = 4 [json_name = "managesOwnScheduling"];</code>
     * @return This builder for chaining.
     */
    public Builder clearManagesOwnScheduling() {
      bitField0_ = (bitField0_ & ~0x00000008);
      managesOwnScheduling_ = false;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:anduril.taskmanager.v1.System)
  }

  // @@protoc_insertion_point(class_scope:anduril.taskmanager.v1.System)
  private static final com.anduril.taskmanager.v1.System DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.taskmanager.v1.System();
  }

  public static com.anduril.taskmanager.v1.System getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<System>
      PARSER = new com.google.protobuf.AbstractParser<System>() {
    @java.lang.Override
    public System parsePartialFrom(
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

  public static com.google.protobuf.Parser<System> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<System> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.taskmanager.v1.System getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

