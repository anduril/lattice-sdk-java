// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/communicationsmanager/v1/integration.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.communicationsmanager.v1;

/**
 * Protobuf type {@code anduril.communicationsmanager.v1.StreamIntegrationsRequest}
 */
public final class StreamIntegrationsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.communicationsmanager.v1.StreamIntegrationsRequest)
    StreamIntegrationsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StreamIntegrationsRequest.newBuilder() to construct.
  private StreamIntegrationsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StreamIntegrationsRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StreamIntegrationsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.communicationsmanager.v1.IntegrationPubProto.internal_static_anduril_communicationsmanager_v1_StreamIntegrationsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.communicationsmanager.v1.IntegrationPubProto.internal_static_anduril_communicationsmanager_v1_StreamIntegrationsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.communicationsmanager.v1.StreamIntegrationsRequest.class, com.anduril.communicationsmanager.v1.StreamIntegrationsRequest.Builder.class);
  }

  private int ownerFilterCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object ownerFilter_;
  public enum OwnerFilterCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ALL_NODES(1),
    LOCAL_NODE(2),
    OWNERFILTER_NOT_SET(0);
    private final int value;
    private OwnerFilterCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OwnerFilterCase valueOf(int value) {
      return forNumber(value);
    }

    public static OwnerFilterCase forNumber(int value) {
      switch (value) {
        case 1: return ALL_NODES;
        case 2: return LOCAL_NODE;
        case 0: return OWNERFILTER_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public OwnerFilterCase
  getOwnerFilterCase() {
    return OwnerFilterCase.forNumber(
        ownerFilterCase_);
  }

  public static final int ALL_NODES_FIELD_NUMBER = 1;
  /**
   * <code>.anduril.communicationsmanager.v1.AllNodes all_nodes = 1 [json_name = "allNodes"];</code>
   * @return Whether the allNodes field is set.
   */
  @java.lang.Override
  public boolean hasAllNodes() {
    return ownerFilterCase_ == 1;
  }
  /**
   * <code>.anduril.communicationsmanager.v1.AllNodes all_nodes = 1 [json_name = "allNodes"];</code>
   * @return The allNodes.
   */
  @java.lang.Override
  public com.anduril.communicationsmanager.v1.AllNodes getAllNodes() {
    if (ownerFilterCase_ == 1) {
       return (com.anduril.communicationsmanager.v1.AllNodes) ownerFilter_;
    }
    return com.anduril.communicationsmanager.v1.AllNodes.getDefaultInstance();
  }
  /**
   * <code>.anduril.communicationsmanager.v1.AllNodes all_nodes = 1 [json_name = "allNodes"];</code>
   */
  @java.lang.Override
  public com.anduril.communicationsmanager.v1.AllNodesOrBuilder getAllNodesOrBuilder() {
    if (ownerFilterCase_ == 1) {
       return (com.anduril.communicationsmanager.v1.AllNodes) ownerFilter_;
    }
    return com.anduril.communicationsmanager.v1.AllNodes.getDefaultInstance();
  }

  public static final int LOCAL_NODE_FIELD_NUMBER = 2;
  /**
   * <code>.anduril.communicationsmanager.v1.LocalNode local_node = 2 [json_name = "localNode"];</code>
   * @return Whether the localNode field is set.
   */
  @java.lang.Override
  public boolean hasLocalNode() {
    return ownerFilterCase_ == 2;
  }
  /**
   * <code>.anduril.communicationsmanager.v1.LocalNode local_node = 2 [json_name = "localNode"];</code>
   * @return The localNode.
   */
  @java.lang.Override
  public com.anduril.communicationsmanager.v1.LocalNode getLocalNode() {
    if (ownerFilterCase_ == 2) {
       return (com.anduril.communicationsmanager.v1.LocalNode) ownerFilter_;
    }
    return com.anduril.communicationsmanager.v1.LocalNode.getDefaultInstance();
  }
  /**
   * <code>.anduril.communicationsmanager.v1.LocalNode local_node = 2 [json_name = "localNode"];</code>
   */
  @java.lang.Override
  public com.anduril.communicationsmanager.v1.LocalNodeOrBuilder getLocalNodeOrBuilder() {
    if (ownerFilterCase_ == 2) {
       return (com.anduril.communicationsmanager.v1.LocalNode) ownerFilter_;
    }
    return com.anduril.communicationsmanager.v1.LocalNode.getDefaultInstance();
  }

  public static final int PREEXISTING_ONLY_FIELD_NUMBER = 3;
  private boolean preexistingOnly_ = false;
  /**
   * <pre>
   * Close the stream after sending all currently existing integrations. Set this
   * to false to have a long-lived stream.
   * </pre>
   *
   * <code>bool preexisting_only = 3 [json_name = "preexistingOnly"];</code>
   * @return The preexistingOnly.
   */
  @java.lang.Override
  public boolean getPreexistingOnly() {
    return preexistingOnly_;
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
    if (ownerFilterCase_ == 1) {
      output.writeMessage(1, (com.anduril.communicationsmanager.v1.AllNodes) ownerFilter_);
    }
    if (ownerFilterCase_ == 2) {
      output.writeMessage(2, (com.anduril.communicationsmanager.v1.LocalNode) ownerFilter_);
    }
    if (preexistingOnly_ != false) {
      output.writeBool(3, preexistingOnly_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ownerFilterCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.anduril.communicationsmanager.v1.AllNodes) ownerFilter_);
    }
    if (ownerFilterCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.anduril.communicationsmanager.v1.LocalNode) ownerFilter_);
    }
    if (preexistingOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, preexistingOnly_);
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
    if (!(obj instanceof com.anduril.communicationsmanager.v1.StreamIntegrationsRequest)) {
      return super.equals(obj);
    }
    com.anduril.communicationsmanager.v1.StreamIntegrationsRequest other = (com.anduril.communicationsmanager.v1.StreamIntegrationsRequest) obj;

    if (getPreexistingOnly()
        != other.getPreexistingOnly()) return false;
    if (!getOwnerFilterCase().equals(other.getOwnerFilterCase())) return false;
    switch (ownerFilterCase_) {
      case 1:
        if (!getAllNodes()
            .equals(other.getAllNodes())) return false;
        break;
      case 2:
        if (!getLocalNode()
            .equals(other.getLocalNode())) return false;
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
    hash = (37 * hash) + PREEXISTING_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPreexistingOnly());
    switch (ownerFilterCase_) {
      case 1:
        hash = (37 * hash) + ALL_NODES_FIELD_NUMBER;
        hash = (53 * hash) + getAllNodes().hashCode();
        break;
      case 2:
        hash = (37 * hash) + LOCAL_NODE_FIELD_NUMBER;
        hash = (53 * hash) + getLocalNode().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.communicationsmanager.v1.StreamIntegrationsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.communicationsmanager.v1.StreamIntegrationsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.communicationsmanager.v1.StreamIntegrationsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.communicationsmanager.v1.StreamIntegrationsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.communicationsmanager.v1.StreamIntegrationsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.communicationsmanager.v1.StreamIntegrationsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.communicationsmanager.v1.StreamIntegrationsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.communicationsmanager.v1.StreamIntegrationsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.communicationsmanager.v1.StreamIntegrationsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.communicationsmanager.v1.StreamIntegrationsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.communicationsmanager.v1.StreamIntegrationsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.communicationsmanager.v1.StreamIntegrationsRequest parseFrom(
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
  public static Builder newBuilder(com.anduril.communicationsmanager.v1.StreamIntegrationsRequest prototype) {
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
   * Protobuf type {@code anduril.communicationsmanager.v1.StreamIntegrationsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.communicationsmanager.v1.StreamIntegrationsRequest)
      com.anduril.communicationsmanager.v1.StreamIntegrationsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.communicationsmanager.v1.IntegrationPubProto.internal_static_anduril_communicationsmanager_v1_StreamIntegrationsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.communicationsmanager.v1.IntegrationPubProto.internal_static_anduril_communicationsmanager_v1_StreamIntegrationsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.communicationsmanager.v1.StreamIntegrationsRequest.class, com.anduril.communicationsmanager.v1.StreamIntegrationsRequest.Builder.class);
    }

    // Construct using com.anduril.communicationsmanager.v1.StreamIntegrationsRequest.newBuilder()
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
      if (allNodesBuilder_ != null) {
        allNodesBuilder_.clear();
      }
      if (localNodeBuilder_ != null) {
        localNodeBuilder_.clear();
      }
      preexistingOnly_ = false;
      ownerFilterCase_ = 0;
      ownerFilter_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.communicationsmanager.v1.IntegrationPubProto.internal_static_anduril_communicationsmanager_v1_StreamIntegrationsRequest_descriptor;
    }

    @java.lang.Override
    public com.anduril.communicationsmanager.v1.StreamIntegrationsRequest getDefaultInstanceForType() {
      return com.anduril.communicationsmanager.v1.StreamIntegrationsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.communicationsmanager.v1.StreamIntegrationsRequest build() {
      com.anduril.communicationsmanager.v1.StreamIntegrationsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.communicationsmanager.v1.StreamIntegrationsRequest buildPartial() {
      com.anduril.communicationsmanager.v1.StreamIntegrationsRequest result = new com.anduril.communicationsmanager.v1.StreamIntegrationsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.communicationsmanager.v1.StreamIntegrationsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.preexistingOnly_ = preexistingOnly_;
      }
    }

    private void buildPartialOneofs(com.anduril.communicationsmanager.v1.StreamIntegrationsRequest result) {
      result.ownerFilterCase_ = ownerFilterCase_;
      result.ownerFilter_ = this.ownerFilter_;
      if (ownerFilterCase_ == 1 &&
          allNodesBuilder_ != null) {
        result.ownerFilter_ = allNodesBuilder_.build();
      }
      if (ownerFilterCase_ == 2 &&
          localNodeBuilder_ != null) {
        result.ownerFilter_ = localNodeBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.communicationsmanager.v1.StreamIntegrationsRequest) {
        return mergeFrom((com.anduril.communicationsmanager.v1.StreamIntegrationsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.communicationsmanager.v1.StreamIntegrationsRequest other) {
      if (other == com.anduril.communicationsmanager.v1.StreamIntegrationsRequest.getDefaultInstance()) return this;
      if (other.getPreexistingOnly() != false) {
        setPreexistingOnly(other.getPreexistingOnly());
      }
      switch (other.getOwnerFilterCase()) {
        case ALL_NODES: {
          mergeAllNodes(other.getAllNodes());
          break;
        }
        case LOCAL_NODE: {
          mergeLocalNode(other.getLocalNode());
          break;
        }
        case OWNERFILTER_NOT_SET: {
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
                  getAllNodesFieldBuilder().getBuilder(),
                  extensionRegistry);
              ownerFilterCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getLocalNodeFieldBuilder().getBuilder(),
                  extensionRegistry);
              ownerFilterCase_ = 2;
              break;
            } // case 18
            case 24: {
              preexistingOnly_ = input.readBool();
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
    private int ownerFilterCase_ = 0;
    private java.lang.Object ownerFilter_;
    public OwnerFilterCase
        getOwnerFilterCase() {
      return OwnerFilterCase.forNumber(
          ownerFilterCase_);
    }

    public Builder clearOwnerFilter() {
      ownerFilterCase_ = 0;
      ownerFilter_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.communicationsmanager.v1.AllNodes, com.anduril.communicationsmanager.v1.AllNodes.Builder, com.anduril.communicationsmanager.v1.AllNodesOrBuilder> allNodesBuilder_;
    /**
     * <code>.anduril.communicationsmanager.v1.AllNodes all_nodes = 1 [json_name = "allNodes"];</code>
     * @return Whether the allNodes field is set.
     */
    @java.lang.Override
    public boolean hasAllNodes() {
      return ownerFilterCase_ == 1;
    }
    /**
     * <code>.anduril.communicationsmanager.v1.AllNodes all_nodes = 1 [json_name = "allNodes"];</code>
     * @return The allNodes.
     */
    @java.lang.Override
    public com.anduril.communicationsmanager.v1.AllNodes getAllNodes() {
      if (allNodesBuilder_ == null) {
        if (ownerFilterCase_ == 1) {
          return (com.anduril.communicationsmanager.v1.AllNodes) ownerFilter_;
        }
        return com.anduril.communicationsmanager.v1.AllNodes.getDefaultInstance();
      } else {
        if (ownerFilterCase_ == 1) {
          return allNodesBuilder_.getMessage();
        }
        return com.anduril.communicationsmanager.v1.AllNodes.getDefaultInstance();
      }
    }
    /**
     * <code>.anduril.communicationsmanager.v1.AllNodes all_nodes = 1 [json_name = "allNodes"];</code>
     */
    public Builder setAllNodes(com.anduril.communicationsmanager.v1.AllNodes value) {
      if (allNodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ownerFilter_ = value;
        onChanged();
      } else {
        allNodesBuilder_.setMessage(value);
      }
      ownerFilterCase_ = 1;
      return this;
    }
    /**
     * <code>.anduril.communicationsmanager.v1.AllNodes all_nodes = 1 [json_name = "allNodes"];</code>
     */
    public Builder setAllNodes(
        com.anduril.communicationsmanager.v1.AllNodes.Builder builderForValue) {
      if (allNodesBuilder_ == null) {
        ownerFilter_ = builderForValue.build();
        onChanged();
      } else {
        allNodesBuilder_.setMessage(builderForValue.build());
      }
      ownerFilterCase_ = 1;
      return this;
    }
    /**
     * <code>.anduril.communicationsmanager.v1.AllNodes all_nodes = 1 [json_name = "allNodes"];</code>
     */
    public Builder mergeAllNodes(com.anduril.communicationsmanager.v1.AllNodes value) {
      if (allNodesBuilder_ == null) {
        if (ownerFilterCase_ == 1 &&
            ownerFilter_ != com.anduril.communicationsmanager.v1.AllNodes.getDefaultInstance()) {
          ownerFilter_ = com.anduril.communicationsmanager.v1.AllNodes.newBuilder((com.anduril.communicationsmanager.v1.AllNodes) ownerFilter_)
              .mergeFrom(value).buildPartial();
        } else {
          ownerFilter_ = value;
        }
        onChanged();
      } else {
        if (ownerFilterCase_ == 1) {
          allNodesBuilder_.mergeFrom(value);
        } else {
          allNodesBuilder_.setMessage(value);
        }
      }
      ownerFilterCase_ = 1;
      return this;
    }
    /**
     * <code>.anduril.communicationsmanager.v1.AllNodes all_nodes = 1 [json_name = "allNodes"];</code>
     */
    public Builder clearAllNodes() {
      if (allNodesBuilder_ == null) {
        if (ownerFilterCase_ == 1) {
          ownerFilterCase_ = 0;
          ownerFilter_ = null;
          onChanged();
        }
      } else {
        if (ownerFilterCase_ == 1) {
          ownerFilterCase_ = 0;
          ownerFilter_ = null;
        }
        allNodesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.anduril.communicationsmanager.v1.AllNodes all_nodes = 1 [json_name = "allNodes"];</code>
     */
    public com.anduril.communicationsmanager.v1.AllNodes.Builder getAllNodesBuilder() {
      return getAllNodesFieldBuilder().getBuilder();
    }
    /**
     * <code>.anduril.communicationsmanager.v1.AllNodes all_nodes = 1 [json_name = "allNodes"];</code>
     */
    @java.lang.Override
    public com.anduril.communicationsmanager.v1.AllNodesOrBuilder getAllNodesOrBuilder() {
      if ((ownerFilterCase_ == 1) && (allNodesBuilder_ != null)) {
        return allNodesBuilder_.getMessageOrBuilder();
      } else {
        if (ownerFilterCase_ == 1) {
          return (com.anduril.communicationsmanager.v1.AllNodes) ownerFilter_;
        }
        return com.anduril.communicationsmanager.v1.AllNodes.getDefaultInstance();
      }
    }
    /**
     * <code>.anduril.communicationsmanager.v1.AllNodes all_nodes = 1 [json_name = "allNodes"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.communicationsmanager.v1.AllNodes, com.anduril.communicationsmanager.v1.AllNodes.Builder, com.anduril.communicationsmanager.v1.AllNodesOrBuilder> 
        getAllNodesFieldBuilder() {
      if (allNodesBuilder_ == null) {
        if (!(ownerFilterCase_ == 1)) {
          ownerFilter_ = com.anduril.communicationsmanager.v1.AllNodes.getDefaultInstance();
        }
        allNodesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.communicationsmanager.v1.AllNodes, com.anduril.communicationsmanager.v1.AllNodes.Builder, com.anduril.communicationsmanager.v1.AllNodesOrBuilder>(
                (com.anduril.communicationsmanager.v1.AllNodes) ownerFilter_,
                getParentForChildren(),
                isClean());
        ownerFilter_ = null;
      }
      ownerFilterCase_ = 1;
      onChanged();
      return allNodesBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.communicationsmanager.v1.LocalNode, com.anduril.communicationsmanager.v1.LocalNode.Builder, com.anduril.communicationsmanager.v1.LocalNodeOrBuilder> localNodeBuilder_;
    /**
     * <code>.anduril.communicationsmanager.v1.LocalNode local_node = 2 [json_name = "localNode"];</code>
     * @return Whether the localNode field is set.
     */
    @java.lang.Override
    public boolean hasLocalNode() {
      return ownerFilterCase_ == 2;
    }
    /**
     * <code>.anduril.communicationsmanager.v1.LocalNode local_node = 2 [json_name = "localNode"];</code>
     * @return The localNode.
     */
    @java.lang.Override
    public com.anduril.communicationsmanager.v1.LocalNode getLocalNode() {
      if (localNodeBuilder_ == null) {
        if (ownerFilterCase_ == 2) {
          return (com.anduril.communicationsmanager.v1.LocalNode) ownerFilter_;
        }
        return com.anduril.communicationsmanager.v1.LocalNode.getDefaultInstance();
      } else {
        if (ownerFilterCase_ == 2) {
          return localNodeBuilder_.getMessage();
        }
        return com.anduril.communicationsmanager.v1.LocalNode.getDefaultInstance();
      }
    }
    /**
     * <code>.anduril.communicationsmanager.v1.LocalNode local_node = 2 [json_name = "localNode"];</code>
     */
    public Builder setLocalNode(com.anduril.communicationsmanager.v1.LocalNode value) {
      if (localNodeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ownerFilter_ = value;
        onChanged();
      } else {
        localNodeBuilder_.setMessage(value);
      }
      ownerFilterCase_ = 2;
      return this;
    }
    /**
     * <code>.anduril.communicationsmanager.v1.LocalNode local_node = 2 [json_name = "localNode"];</code>
     */
    public Builder setLocalNode(
        com.anduril.communicationsmanager.v1.LocalNode.Builder builderForValue) {
      if (localNodeBuilder_ == null) {
        ownerFilter_ = builderForValue.build();
        onChanged();
      } else {
        localNodeBuilder_.setMessage(builderForValue.build());
      }
      ownerFilterCase_ = 2;
      return this;
    }
    /**
     * <code>.anduril.communicationsmanager.v1.LocalNode local_node = 2 [json_name = "localNode"];</code>
     */
    public Builder mergeLocalNode(com.anduril.communicationsmanager.v1.LocalNode value) {
      if (localNodeBuilder_ == null) {
        if (ownerFilterCase_ == 2 &&
            ownerFilter_ != com.anduril.communicationsmanager.v1.LocalNode.getDefaultInstance()) {
          ownerFilter_ = com.anduril.communicationsmanager.v1.LocalNode.newBuilder((com.anduril.communicationsmanager.v1.LocalNode) ownerFilter_)
              .mergeFrom(value).buildPartial();
        } else {
          ownerFilter_ = value;
        }
        onChanged();
      } else {
        if (ownerFilterCase_ == 2) {
          localNodeBuilder_.mergeFrom(value);
        } else {
          localNodeBuilder_.setMessage(value);
        }
      }
      ownerFilterCase_ = 2;
      return this;
    }
    /**
     * <code>.anduril.communicationsmanager.v1.LocalNode local_node = 2 [json_name = "localNode"];</code>
     */
    public Builder clearLocalNode() {
      if (localNodeBuilder_ == null) {
        if (ownerFilterCase_ == 2) {
          ownerFilterCase_ = 0;
          ownerFilter_ = null;
          onChanged();
        }
      } else {
        if (ownerFilterCase_ == 2) {
          ownerFilterCase_ = 0;
          ownerFilter_ = null;
        }
        localNodeBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.anduril.communicationsmanager.v1.LocalNode local_node = 2 [json_name = "localNode"];</code>
     */
    public com.anduril.communicationsmanager.v1.LocalNode.Builder getLocalNodeBuilder() {
      return getLocalNodeFieldBuilder().getBuilder();
    }
    /**
     * <code>.anduril.communicationsmanager.v1.LocalNode local_node = 2 [json_name = "localNode"];</code>
     */
    @java.lang.Override
    public com.anduril.communicationsmanager.v1.LocalNodeOrBuilder getLocalNodeOrBuilder() {
      if ((ownerFilterCase_ == 2) && (localNodeBuilder_ != null)) {
        return localNodeBuilder_.getMessageOrBuilder();
      } else {
        if (ownerFilterCase_ == 2) {
          return (com.anduril.communicationsmanager.v1.LocalNode) ownerFilter_;
        }
        return com.anduril.communicationsmanager.v1.LocalNode.getDefaultInstance();
      }
    }
    /**
     * <code>.anduril.communicationsmanager.v1.LocalNode local_node = 2 [json_name = "localNode"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.communicationsmanager.v1.LocalNode, com.anduril.communicationsmanager.v1.LocalNode.Builder, com.anduril.communicationsmanager.v1.LocalNodeOrBuilder> 
        getLocalNodeFieldBuilder() {
      if (localNodeBuilder_ == null) {
        if (!(ownerFilterCase_ == 2)) {
          ownerFilter_ = com.anduril.communicationsmanager.v1.LocalNode.getDefaultInstance();
        }
        localNodeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.communicationsmanager.v1.LocalNode, com.anduril.communicationsmanager.v1.LocalNode.Builder, com.anduril.communicationsmanager.v1.LocalNodeOrBuilder>(
                (com.anduril.communicationsmanager.v1.LocalNode) ownerFilter_,
                getParentForChildren(),
                isClean());
        ownerFilter_ = null;
      }
      ownerFilterCase_ = 2;
      onChanged();
      return localNodeBuilder_;
    }

    private boolean preexistingOnly_ ;
    /**
     * <pre>
     * Close the stream after sending all currently existing integrations. Set this
     * to false to have a long-lived stream.
     * </pre>
     *
     * <code>bool preexisting_only = 3 [json_name = "preexistingOnly"];</code>
     * @return The preexistingOnly.
     */
    @java.lang.Override
    public boolean getPreexistingOnly() {
      return preexistingOnly_;
    }
    /**
     * <pre>
     * Close the stream after sending all currently existing integrations. Set this
     * to false to have a long-lived stream.
     * </pre>
     *
     * <code>bool preexisting_only = 3 [json_name = "preexistingOnly"];</code>
     * @param value The preexistingOnly to set.
     * @return This builder for chaining.
     */
    public Builder setPreexistingOnly(boolean value) {

      preexistingOnly_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Close the stream after sending all currently existing integrations. Set this
     * to false to have a long-lived stream.
     * </pre>
     *
     * <code>bool preexisting_only = 3 [json_name = "preexistingOnly"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPreexistingOnly() {
      bitField0_ = (bitField0_ & ~0x00000004);
      preexistingOnly_ = false;
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


    // @@protoc_insertion_point(builder_scope:anduril.communicationsmanager.v1.StreamIntegrationsRequest)
  }

  // @@protoc_insertion_point(class_scope:anduril.communicationsmanager.v1.StreamIntegrationsRequest)
  private static final com.anduril.communicationsmanager.v1.StreamIntegrationsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.communicationsmanager.v1.StreamIntegrationsRequest();
  }

  public static com.anduril.communicationsmanager.v1.StreamIntegrationsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamIntegrationsRequest>
      PARSER = new com.google.protobuf.AbstractParser<StreamIntegrationsRequest>() {
    @java.lang.Override
    public StreamIntegrationsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<StreamIntegrationsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamIntegrationsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.communicationsmanager.v1.StreamIntegrationsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

