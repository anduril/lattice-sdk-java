// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/communicationsmanager/v1/integration.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.communicationsmanager.v1;

/**
 * Protobuf type {@code anduril.communicationsmanager.v1.DeregisterIntegrationRequest}
 */
public final class DeregisterIntegrationRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:anduril.communicationsmanager.v1.DeregisterIntegrationRequest)
    DeregisterIntegrationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      DeregisterIntegrationRequest.class.getName());
  }
  // Use DeregisterIntegrationRequest.newBuilder() to construct.
  private DeregisterIntegrationRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private DeregisterIntegrationRequest() {
    integrationName_ = "";
    nodeId_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.communicationsmanager.v1.IntegrationPubProto.internal_static_anduril_communicationsmanager_v1_DeregisterIntegrationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.communicationsmanager.v1.IntegrationPubProto.internal_static_anduril_communicationsmanager_v1_DeregisterIntegrationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest.class, com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest.Builder.class);
  }

  public static final int INTEGRATION_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object integrationName_ = "";
  /**
   * <pre>
   * Identifier for the integration. The integration_name + node_id is globally unique.
   * </pre>
   *
   * <code>string integration_name = 1 [json_name = "integrationName"];</code>
   * @return The integrationName.
   */
  @java.lang.Override
  public java.lang.String getIntegrationName() {
    java.lang.Object ref = integrationName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      integrationName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Identifier for the integration. The integration_name + node_id is globally unique.
   * </pre>
   *
   * <code>string integration_name = 1 [json_name = "integrationName"];</code>
   * @return The bytes for integrationName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIntegrationNameBytes() {
    java.lang.Object ref = integrationName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      integrationName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NODE_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nodeId_ = "";
  /**
   * <pre>
   * Unique identifier for the node that the integration is registered under.
   * </pre>
   *
   * <code>string node_id = 2 [json_name = "nodeId"];</code>
   * @return The nodeId.
   */
  @java.lang.Override
  public java.lang.String getNodeId() {
    java.lang.Object ref = nodeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nodeId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Unique identifier for the node that the integration is registered under.
   * </pre>
   *
   * <code>string node_id = 2 [json_name = "nodeId"];</code>
   * @return The bytes for nodeId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNodeIdBytes() {
    java.lang.Object ref = nodeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nodeId_ = b;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(integrationName_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, integrationName_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(nodeId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, nodeId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(integrationName_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, integrationName_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(nodeId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, nodeId_);
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
    if (!(obj instanceof com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest)) {
      return super.equals(obj);
    }
    com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest other = (com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest) obj;

    if (!getIntegrationName()
        .equals(other.getIntegrationName())) return false;
    if (!getNodeId()
        .equals(other.getNodeId())) return false;
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
    hash = (37 * hash) + INTEGRATION_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getIntegrationName().hashCode();
    hash = (37 * hash) + NODE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getNodeId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest parseFrom(
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
  public static Builder newBuilder(com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest prototype) {
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
   * Protobuf type {@code anduril.communicationsmanager.v1.DeregisterIntegrationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.communicationsmanager.v1.DeregisterIntegrationRequest)
      com.anduril.communicationsmanager.v1.DeregisterIntegrationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.communicationsmanager.v1.IntegrationPubProto.internal_static_anduril_communicationsmanager_v1_DeregisterIntegrationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.communicationsmanager.v1.IntegrationPubProto.internal_static_anduril_communicationsmanager_v1_DeregisterIntegrationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest.class, com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest.Builder.class);
    }

    // Construct using com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest.newBuilder()
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
      integrationName_ = "";
      nodeId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.communicationsmanager.v1.IntegrationPubProto.internal_static_anduril_communicationsmanager_v1_DeregisterIntegrationRequest_descriptor;
    }

    @java.lang.Override
    public com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest getDefaultInstanceForType() {
      return com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest build() {
      com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest buildPartial() {
      com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest result = new com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.integrationName_ = integrationName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nodeId_ = nodeId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest) {
        return mergeFrom((com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest other) {
      if (other == com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest.getDefaultInstance()) return this;
      if (!other.getIntegrationName().isEmpty()) {
        integrationName_ = other.integrationName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getNodeId().isEmpty()) {
        nodeId_ = other.nodeId_;
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
              integrationName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              nodeId_ = input.readStringRequireUtf8();
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

    private java.lang.Object integrationName_ = "";
    /**
     * <pre>
     * Identifier for the integration. The integration_name + node_id is globally unique.
     * </pre>
     *
     * <code>string integration_name = 1 [json_name = "integrationName"];</code>
     * @return The integrationName.
     */
    public java.lang.String getIntegrationName() {
      java.lang.Object ref = integrationName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        integrationName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Identifier for the integration. The integration_name + node_id is globally unique.
     * </pre>
     *
     * <code>string integration_name = 1 [json_name = "integrationName"];</code>
     * @return The bytes for integrationName.
     */
    public com.google.protobuf.ByteString
        getIntegrationNameBytes() {
      java.lang.Object ref = integrationName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        integrationName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Identifier for the integration. The integration_name + node_id is globally unique.
     * </pre>
     *
     * <code>string integration_name = 1 [json_name = "integrationName"];</code>
     * @param value The integrationName to set.
     * @return This builder for chaining.
     */
    public Builder setIntegrationName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      integrationName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Identifier for the integration. The integration_name + node_id is globally unique.
     * </pre>
     *
     * <code>string integration_name = 1 [json_name = "integrationName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIntegrationName() {
      integrationName_ = getDefaultInstance().getIntegrationName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Identifier for the integration. The integration_name + node_id is globally unique.
     * </pre>
     *
     * <code>string integration_name = 1 [json_name = "integrationName"];</code>
     * @param value The bytes for integrationName to set.
     * @return This builder for chaining.
     */
    public Builder setIntegrationNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      integrationName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object nodeId_ = "";
    /**
     * <pre>
     * Unique identifier for the node that the integration is registered under.
     * </pre>
     *
     * <code>string node_id = 2 [json_name = "nodeId"];</code>
     * @return The nodeId.
     */
    public java.lang.String getNodeId() {
      java.lang.Object ref = nodeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nodeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Unique identifier for the node that the integration is registered under.
     * </pre>
     *
     * <code>string node_id = 2 [json_name = "nodeId"];</code>
     * @return The bytes for nodeId.
     */
    public com.google.protobuf.ByteString
        getNodeIdBytes() {
      java.lang.Object ref = nodeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nodeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Unique identifier for the node that the integration is registered under.
     * </pre>
     *
     * <code>string node_id = 2 [json_name = "nodeId"];</code>
     * @param value The nodeId to set.
     * @return This builder for chaining.
     */
    public Builder setNodeId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nodeId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique identifier for the node that the integration is registered under.
     * </pre>
     *
     * <code>string node_id = 2 [json_name = "nodeId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNodeId() {
      nodeId_ = getDefaultInstance().getNodeId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique identifier for the node that the integration is registered under.
     * </pre>
     *
     * <code>string node_id = 2 [json_name = "nodeId"];</code>
     * @param value The bytes for nodeId to set.
     * @return This builder for chaining.
     */
    public Builder setNodeIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nodeId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:anduril.communicationsmanager.v1.DeregisterIntegrationRequest)
  }

  // @@protoc_insertion_point(class_scope:anduril.communicationsmanager.v1.DeregisterIntegrationRequest)
  private static final com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest();
  }

  public static com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeregisterIntegrationRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeregisterIntegrationRequest>() {
    @java.lang.Override
    public DeregisterIntegrationRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeregisterIntegrationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeregisterIntegrationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.communicationsmanager.v1.DeregisterIntegrationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

