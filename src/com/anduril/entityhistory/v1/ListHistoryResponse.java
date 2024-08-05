// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/entityhistory/v1/entity_history_api.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.entityhistory.v1;

/**
 * Protobuf type {@code anduril.entityhistory.v1.ListHistoryResponse}
 */
public final class ListHistoryResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:anduril.entityhistory.v1.ListHistoryResponse)
    ListHistoryResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      ListHistoryResponse.class.getName());
  }
  // Use ListHistoryResponse.newBuilder() to construct.
  private ListHistoryResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ListHistoryResponse() {
    nextPageToken_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entityhistory.v1.EntityHistoryApiPubProto.internal_static_anduril_entityhistory_v1_ListHistoryResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entityhistory.v1.EntityHistoryApiPubProto.internal_static_anduril_entityhistory_v1_ListHistoryResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entityhistory.v1.ListHistoryResponse.class, com.anduril.entityhistory.v1.ListHistoryResponse.Builder.class);
  }

  private int bitField0_;
  public static final int HISTORY_PAGE_FIELD_NUMBER = 1;
  private com.anduril.entityhistory.v1.HistoryPage historyPage_;
  /**
   * <code>.anduril.entityhistory.v1.HistoryPage history_page = 1 [json_name = "historyPage"];</code>
   * @return Whether the historyPage field is set.
   */
  @java.lang.Override
  public boolean hasHistoryPage() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.anduril.entityhistory.v1.HistoryPage history_page = 1 [json_name = "historyPage"];</code>
   * @return The historyPage.
   */
  @java.lang.Override
  public com.anduril.entityhistory.v1.HistoryPage getHistoryPage() {
    return historyPage_ == null ? com.anduril.entityhistory.v1.HistoryPage.getDefaultInstance() : historyPage_;
  }
  /**
   * <code>.anduril.entityhistory.v1.HistoryPage history_page = 1 [json_name = "historyPage"];</code>
   */
  @java.lang.Override
  public com.anduril.entityhistory.v1.HistoryPageOrBuilder getHistoryPageOrBuilder() {
    return historyPage_ == null ? com.anduril.entityhistory.v1.HistoryPage.getDefaultInstance() : historyPage_;
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * If present this page token can be used to retrieve the next page of
   * history. If empty, there are no more results.
   * This will be deprecated in favor of next_history_page_token.
   * </pre>
   *
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * If present this page token can be used to retrieve the next page of
   * history. If empty, there are no more results.
   * This will be deprecated in favor of next_history_page_token.
   * </pre>
   *
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEXT_HISTORY_PAGE_TOKEN_FIELD_NUMBER = 3;
  private com.anduril.entityhistory.v1.HistoryPageToken nextHistoryPageToken_;
  /**
   * <pre>
   * Next_history_page_token received should be provided as part of any followup requests to continue consuming the data
   * for the query requested until the HistoryPageToken reports is_complete as true.
   * </pre>
   *
   * <code>.anduril.entityhistory.v1.HistoryPageToken next_history_page_token = 3 [json_name = "nextHistoryPageToken"];</code>
   * @return Whether the nextHistoryPageToken field is set.
   */
  @java.lang.Override
  public boolean hasNextHistoryPageToken() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Next_history_page_token received should be provided as part of any followup requests to continue consuming the data
   * for the query requested until the HistoryPageToken reports is_complete as true.
   * </pre>
   *
   * <code>.anduril.entityhistory.v1.HistoryPageToken next_history_page_token = 3 [json_name = "nextHistoryPageToken"];</code>
   * @return The nextHistoryPageToken.
   */
  @java.lang.Override
  public com.anduril.entityhistory.v1.HistoryPageToken getNextHistoryPageToken() {
    return nextHistoryPageToken_ == null ? com.anduril.entityhistory.v1.HistoryPageToken.getDefaultInstance() : nextHistoryPageToken_;
  }
  /**
   * <pre>
   * Next_history_page_token received should be provided as part of any followup requests to continue consuming the data
   * for the query requested until the HistoryPageToken reports is_complete as true.
   * </pre>
   *
   * <code>.anduril.entityhistory.v1.HistoryPageToken next_history_page_token = 3 [json_name = "nextHistoryPageToken"];</code>
   */
  @java.lang.Override
  public com.anduril.entityhistory.v1.HistoryPageTokenOrBuilder getNextHistoryPageTokenOrBuilder() {
    return nextHistoryPageToken_ == null ? com.anduril.entityhistory.v1.HistoryPageToken.getDefaultInstance() : nextHistoryPageToken_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getHistoryPage());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, nextPageToken_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getNextHistoryPageToken());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHistoryPage());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, nextPageToken_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getNextHistoryPageToken());
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
    if (!(obj instanceof com.anduril.entityhistory.v1.ListHistoryResponse)) {
      return super.equals(obj);
    }
    com.anduril.entityhistory.v1.ListHistoryResponse other = (com.anduril.entityhistory.v1.ListHistoryResponse) obj;

    if (hasHistoryPage() != other.hasHistoryPage()) return false;
    if (hasHistoryPage()) {
      if (!getHistoryPage()
          .equals(other.getHistoryPage())) return false;
    }
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
    if (hasNextHistoryPageToken() != other.hasNextHistoryPageToken()) return false;
    if (hasNextHistoryPageToken()) {
      if (!getNextHistoryPageToken()
          .equals(other.getNextHistoryPageToken())) return false;
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
    if (hasHistoryPage()) {
      hash = (37 * hash) + HISTORY_PAGE_FIELD_NUMBER;
      hash = (53 * hash) + getHistoryPage().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    if (hasNextHistoryPageToken()) {
      hash = (37 * hash) + NEXT_HISTORY_PAGE_TOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getNextHistoryPageToken().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entityhistory.v1.ListHistoryResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entityhistory.v1.ListHistoryResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entityhistory.v1.ListHistoryResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entityhistory.v1.ListHistoryResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entityhistory.v1.ListHistoryResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entityhistory.v1.ListHistoryResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entityhistory.v1.ListHistoryResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entityhistory.v1.ListHistoryResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.entityhistory.v1.ListHistoryResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.entityhistory.v1.ListHistoryResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entityhistory.v1.ListHistoryResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entityhistory.v1.ListHistoryResponse parseFrom(
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
  public static Builder newBuilder(com.anduril.entityhistory.v1.ListHistoryResponse prototype) {
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
   * Protobuf type {@code anduril.entityhistory.v1.ListHistoryResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entityhistory.v1.ListHistoryResponse)
      com.anduril.entityhistory.v1.ListHistoryResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entityhistory.v1.EntityHistoryApiPubProto.internal_static_anduril_entityhistory_v1_ListHistoryResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entityhistory.v1.EntityHistoryApiPubProto.internal_static_anduril_entityhistory_v1_ListHistoryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entityhistory.v1.ListHistoryResponse.class, com.anduril.entityhistory.v1.ListHistoryResponse.Builder.class);
    }

    // Construct using com.anduril.entityhistory.v1.ListHistoryResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getHistoryPageFieldBuilder();
        getNextHistoryPageTokenFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      historyPage_ = null;
      if (historyPageBuilder_ != null) {
        historyPageBuilder_.dispose();
        historyPageBuilder_ = null;
      }
      nextPageToken_ = "";
      nextHistoryPageToken_ = null;
      if (nextHistoryPageTokenBuilder_ != null) {
        nextHistoryPageTokenBuilder_.dispose();
        nextHistoryPageTokenBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entityhistory.v1.EntityHistoryApiPubProto.internal_static_anduril_entityhistory_v1_ListHistoryResponse_descriptor;
    }

    @java.lang.Override
    public com.anduril.entityhistory.v1.ListHistoryResponse getDefaultInstanceForType() {
      return com.anduril.entityhistory.v1.ListHistoryResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entityhistory.v1.ListHistoryResponse build() {
      com.anduril.entityhistory.v1.ListHistoryResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entityhistory.v1.ListHistoryResponse buildPartial() {
      com.anduril.entityhistory.v1.ListHistoryResponse result = new com.anduril.entityhistory.v1.ListHistoryResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.entityhistory.v1.ListHistoryResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.historyPage_ = historyPageBuilder_ == null
            ? historyPage_
            : historyPageBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.nextHistoryPageToken_ = nextHistoryPageTokenBuilder_ == null
            ? nextHistoryPageToken_
            : nextHistoryPageTokenBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entityhistory.v1.ListHistoryResponse) {
        return mergeFrom((com.anduril.entityhistory.v1.ListHistoryResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entityhistory.v1.ListHistoryResponse other) {
      if (other == com.anduril.entityhistory.v1.ListHistoryResponse.getDefaultInstance()) return this;
      if (other.hasHistoryPage()) {
        mergeHistoryPage(other.getHistoryPage());
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasNextHistoryPageToken()) {
        mergeNextHistoryPageToken(other.getNextHistoryPageToken());
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
                  getHistoryPageFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getNextHistoryPageTokenFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private com.anduril.entityhistory.v1.HistoryPage historyPage_;
    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.entityhistory.v1.HistoryPage, com.anduril.entityhistory.v1.HistoryPage.Builder, com.anduril.entityhistory.v1.HistoryPageOrBuilder> historyPageBuilder_;
    /**
     * <code>.anduril.entityhistory.v1.HistoryPage history_page = 1 [json_name = "historyPage"];</code>
     * @return Whether the historyPage field is set.
     */
    public boolean hasHistoryPage() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.anduril.entityhistory.v1.HistoryPage history_page = 1 [json_name = "historyPage"];</code>
     * @return The historyPage.
     */
    public com.anduril.entityhistory.v1.HistoryPage getHistoryPage() {
      if (historyPageBuilder_ == null) {
        return historyPage_ == null ? com.anduril.entityhistory.v1.HistoryPage.getDefaultInstance() : historyPage_;
      } else {
        return historyPageBuilder_.getMessage();
      }
    }
    /**
     * <code>.anduril.entityhistory.v1.HistoryPage history_page = 1 [json_name = "historyPage"];</code>
     */
    public Builder setHistoryPage(com.anduril.entityhistory.v1.HistoryPage value) {
      if (historyPageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        historyPage_ = value;
      } else {
        historyPageBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entityhistory.v1.HistoryPage history_page = 1 [json_name = "historyPage"];</code>
     */
    public Builder setHistoryPage(
        com.anduril.entityhistory.v1.HistoryPage.Builder builderForValue) {
      if (historyPageBuilder_ == null) {
        historyPage_ = builderForValue.build();
      } else {
        historyPageBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entityhistory.v1.HistoryPage history_page = 1 [json_name = "historyPage"];</code>
     */
    public Builder mergeHistoryPage(com.anduril.entityhistory.v1.HistoryPage value) {
      if (historyPageBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          historyPage_ != null &&
          historyPage_ != com.anduril.entityhistory.v1.HistoryPage.getDefaultInstance()) {
          getHistoryPageBuilder().mergeFrom(value);
        } else {
          historyPage_ = value;
        }
      } else {
        historyPageBuilder_.mergeFrom(value);
      }
      if (historyPage_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.anduril.entityhistory.v1.HistoryPage history_page = 1 [json_name = "historyPage"];</code>
     */
    public Builder clearHistoryPage() {
      bitField0_ = (bitField0_ & ~0x00000001);
      historyPage_ = null;
      if (historyPageBuilder_ != null) {
        historyPageBuilder_.dispose();
        historyPageBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entityhistory.v1.HistoryPage history_page = 1 [json_name = "historyPage"];</code>
     */
    public com.anduril.entityhistory.v1.HistoryPage.Builder getHistoryPageBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getHistoryPageFieldBuilder().getBuilder();
    }
    /**
     * <code>.anduril.entityhistory.v1.HistoryPage history_page = 1 [json_name = "historyPage"];</code>
     */
    public com.anduril.entityhistory.v1.HistoryPageOrBuilder getHistoryPageOrBuilder() {
      if (historyPageBuilder_ != null) {
        return historyPageBuilder_.getMessageOrBuilder();
      } else {
        return historyPage_ == null ?
            com.anduril.entityhistory.v1.HistoryPage.getDefaultInstance() : historyPage_;
      }
    }
    /**
     * <code>.anduril.entityhistory.v1.HistoryPage history_page = 1 [json_name = "historyPage"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.entityhistory.v1.HistoryPage, com.anduril.entityhistory.v1.HistoryPage.Builder, com.anduril.entityhistory.v1.HistoryPageOrBuilder> 
        getHistoryPageFieldBuilder() {
      if (historyPageBuilder_ == null) {
        historyPageBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.anduril.entityhistory.v1.HistoryPage, com.anduril.entityhistory.v1.HistoryPage.Builder, com.anduril.entityhistory.v1.HistoryPageOrBuilder>(
                getHistoryPage(),
                getParentForChildren(),
                isClean());
        historyPage_ = null;
      }
      return historyPageBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * If present this page token can be used to retrieve the next page of
     * history. If empty, there are no more results.
     * This will be deprecated in favor of next_history_page_token.
     * </pre>
     *
     * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * If present this page token can be used to retrieve the next page of
     * history. If empty, there are no more results.
     * This will be deprecated in favor of next_history_page_token.
     * </pre>
     *
     * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * If present this page token can be used to retrieve the next page of
     * history. If empty, there are no more results.
     * This will be deprecated in favor of next_history_page_token.
     * </pre>
     *
     * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If present this page token can be used to retrieve the next page of
     * history. If empty, there are no more results.
     * This will be deprecated in favor of next_history_page_token.
     * </pre>
     *
     * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If present this page token can be used to retrieve the next page of
     * history. If empty, there are no more results.
     * This will be deprecated in favor of next_history_page_token.
     * </pre>
     *
     * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.anduril.entityhistory.v1.HistoryPageToken nextHistoryPageToken_;
    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.entityhistory.v1.HistoryPageToken, com.anduril.entityhistory.v1.HistoryPageToken.Builder, com.anduril.entityhistory.v1.HistoryPageTokenOrBuilder> nextHistoryPageTokenBuilder_;
    /**
     * <pre>
     * Next_history_page_token received should be provided as part of any followup requests to continue consuming the data
     * for the query requested until the HistoryPageToken reports is_complete as true.
     * </pre>
     *
     * <code>.anduril.entityhistory.v1.HistoryPageToken next_history_page_token = 3 [json_name = "nextHistoryPageToken"];</code>
     * @return Whether the nextHistoryPageToken field is set.
     */
    public boolean hasNextHistoryPageToken() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Next_history_page_token received should be provided as part of any followup requests to continue consuming the data
     * for the query requested until the HistoryPageToken reports is_complete as true.
     * </pre>
     *
     * <code>.anduril.entityhistory.v1.HistoryPageToken next_history_page_token = 3 [json_name = "nextHistoryPageToken"];</code>
     * @return The nextHistoryPageToken.
     */
    public com.anduril.entityhistory.v1.HistoryPageToken getNextHistoryPageToken() {
      if (nextHistoryPageTokenBuilder_ == null) {
        return nextHistoryPageToken_ == null ? com.anduril.entityhistory.v1.HistoryPageToken.getDefaultInstance() : nextHistoryPageToken_;
      } else {
        return nextHistoryPageTokenBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Next_history_page_token received should be provided as part of any followup requests to continue consuming the data
     * for the query requested until the HistoryPageToken reports is_complete as true.
     * </pre>
     *
     * <code>.anduril.entityhistory.v1.HistoryPageToken next_history_page_token = 3 [json_name = "nextHistoryPageToken"];</code>
     */
    public Builder setNextHistoryPageToken(com.anduril.entityhistory.v1.HistoryPageToken value) {
      if (nextHistoryPageTokenBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nextHistoryPageToken_ = value;
      } else {
        nextHistoryPageTokenBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Next_history_page_token received should be provided as part of any followup requests to continue consuming the data
     * for the query requested until the HistoryPageToken reports is_complete as true.
     * </pre>
     *
     * <code>.anduril.entityhistory.v1.HistoryPageToken next_history_page_token = 3 [json_name = "nextHistoryPageToken"];</code>
     */
    public Builder setNextHistoryPageToken(
        com.anduril.entityhistory.v1.HistoryPageToken.Builder builderForValue) {
      if (nextHistoryPageTokenBuilder_ == null) {
        nextHistoryPageToken_ = builderForValue.build();
      } else {
        nextHistoryPageTokenBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Next_history_page_token received should be provided as part of any followup requests to continue consuming the data
     * for the query requested until the HistoryPageToken reports is_complete as true.
     * </pre>
     *
     * <code>.anduril.entityhistory.v1.HistoryPageToken next_history_page_token = 3 [json_name = "nextHistoryPageToken"];</code>
     */
    public Builder mergeNextHistoryPageToken(com.anduril.entityhistory.v1.HistoryPageToken value) {
      if (nextHistoryPageTokenBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          nextHistoryPageToken_ != null &&
          nextHistoryPageToken_ != com.anduril.entityhistory.v1.HistoryPageToken.getDefaultInstance()) {
          getNextHistoryPageTokenBuilder().mergeFrom(value);
        } else {
          nextHistoryPageToken_ = value;
        }
      } else {
        nextHistoryPageTokenBuilder_.mergeFrom(value);
      }
      if (nextHistoryPageToken_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Next_history_page_token received should be provided as part of any followup requests to continue consuming the data
     * for the query requested until the HistoryPageToken reports is_complete as true.
     * </pre>
     *
     * <code>.anduril.entityhistory.v1.HistoryPageToken next_history_page_token = 3 [json_name = "nextHistoryPageToken"];</code>
     */
    public Builder clearNextHistoryPageToken() {
      bitField0_ = (bitField0_ & ~0x00000004);
      nextHistoryPageToken_ = null;
      if (nextHistoryPageTokenBuilder_ != null) {
        nextHistoryPageTokenBuilder_.dispose();
        nextHistoryPageTokenBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Next_history_page_token received should be provided as part of any followup requests to continue consuming the data
     * for the query requested until the HistoryPageToken reports is_complete as true.
     * </pre>
     *
     * <code>.anduril.entityhistory.v1.HistoryPageToken next_history_page_token = 3 [json_name = "nextHistoryPageToken"];</code>
     */
    public com.anduril.entityhistory.v1.HistoryPageToken.Builder getNextHistoryPageTokenBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getNextHistoryPageTokenFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Next_history_page_token received should be provided as part of any followup requests to continue consuming the data
     * for the query requested until the HistoryPageToken reports is_complete as true.
     * </pre>
     *
     * <code>.anduril.entityhistory.v1.HistoryPageToken next_history_page_token = 3 [json_name = "nextHistoryPageToken"];</code>
     */
    public com.anduril.entityhistory.v1.HistoryPageTokenOrBuilder getNextHistoryPageTokenOrBuilder() {
      if (nextHistoryPageTokenBuilder_ != null) {
        return nextHistoryPageTokenBuilder_.getMessageOrBuilder();
      } else {
        return nextHistoryPageToken_ == null ?
            com.anduril.entityhistory.v1.HistoryPageToken.getDefaultInstance() : nextHistoryPageToken_;
      }
    }
    /**
     * <pre>
     * Next_history_page_token received should be provided as part of any followup requests to continue consuming the data
     * for the query requested until the HistoryPageToken reports is_complete as true.
     * </pre>
     *
     * <code>.anduril.entityhistory.v1.HistoryPageToken next_history_page_token = 3 [json_name = "nextHistoryPageToken"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.entityhistory.v1.HistoryPageToken, com.anduril.entityhistory.v1.HistoryPageToken.Builder, com.anduril.entityhistory.v1.HistoryPageTokenOrBuilder> 
        getNextHistoryPageTokenFieldBuilder() {
      if (nextHistoryPageTokenBuilder_ == null) {
        nextHistoryPageTokenBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.anduril.entityhistory.v1.HistoryPageToken, com.anduril.entityhistory.v1.HistoryPageToken.Builder, com.anduril.entityhistory.v1.HistoryPageTokenOrBuilder>(
                getNextHistoryPageToken(),
                getParentForChildren(),
                isClean());
        nextHistoryPageToken_ = null;
      }
      return nextHistoryPageTokenBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:anduril.entityhistory.v1.ListHistoryResponse)
  }

  // @@protoc_insertion_point(class_scope:anduril.entityhistory.v1.ListHistoryResponse)
  private static final com.anduril.entityhistory.v1.ListHistoryResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entityhistory.v1.ListHistoryResponse();
  }

  public static com.anduril.entityhistory.v1.ListHistoryResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListHistoryResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListHistoryResponse>() {
    @java.lang.Override
    public ListHistoryResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListHistoryResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListHistoryResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entityhistory.v1.ListHistoryResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

