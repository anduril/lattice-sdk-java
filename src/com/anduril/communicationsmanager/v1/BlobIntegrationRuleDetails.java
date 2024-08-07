// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/communicationsmanager/v1/blobs.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.communicationsmanager.v1;

/**
 * <pre>
 * Message to contain blob integration rules
 * </pre>
 *
 * Protobuf type {@code anduril.communicationsmanager.v1.BlobIntegrationRuleDetails}
 */
public final class BlobIntegrationRuleDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.communicationsmanager.v1.BlobIntegrationRuleDetails)
    BlobIntegrationRuleDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BlobIntegrationRuleDetails.newBuilder() to construct.
  private BlobIntegrationRuleDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BlobIntegrationRuleDetails() {
    filters_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BlobIntegrationRuleDetails();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.communicationsmanager.v1.BlobsPubProto.internal_static_anduril_communicationsmanager_v1_BlobIntegrationRuleDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.communicationsmanager.v1.BlobsPubProto.internal_static_anduril_communicationsmanager_v1_BlobIntegrationRuleDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails.class, com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails.Builder.class);
  }

  public static final int FILTERS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.anduril.blobs.v1.Statement> filters_;
  /**
   * <pre>
   * The filter to be applied to the integration
   * </pre>
   *
   * <code>repeated .anduril.blobs.v1.Statement filters = 1 [json_name = "filters"];</code>
   */
  @java.lang.Override
  public java.util.List<com.anduril.blobs.v1.Statement> getFiltersList() {
    return filters_;
  }
  /**
   * <pre>
   * The filter to be applied to the integration
   * </pre>
   *
   * <code>repeated .anduril.blobs.v1.Statement filters = 1 [json_name = "filters"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.anduril.blobs.v1.StatementOrBuilder> 
      getFiltersOrBuilderList() {
    return filters_;
  }
  /**
   * <pre>
   * The filter to be applied to the integration
   * </pre>
   *
   * <code>repeated .anduril.blobs.v1.Statement filters = 1 [json_name = "filters"];</code>
   */
  @java.lang.Override
  public int getFiltersCount() {
    return filters_.size();
  }
  /**
   * <pre>
   * The filter to be applied to the integration
   * </pre>
   *
   * <code>repeated .anduril.blobs.v1.Statement filters = 1 [json_name = "filters"];</code>
   */
  @java.lang.Override
  public com.anduril.blobs.v1.Statement getFilters(int index) {
    return filters_.get(index);
  }
  /**
   * <pre>
   * The filter to be applied to the integration
   * </pre>
   *
   * <code>repeated .anduril.blobs.v1.Statement filters = 1 [json_name = "filters"];</code>
   */
  @java.lang.Override
  public com.anduril.blobs.v1.StatementOrBuilder getFiltersOrBuilder(
      int index) {
    return filters_.get(index);
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
    for (int i = 0; i < filters_.size(); i++) {
      output.writeMessage(1, filters_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < filters_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, filters_.get(i));
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
    if (!(obj instanceof com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails)) {
      return super.equals(obj);
    }
    com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails other = (com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails) obj;

    if (!getFiltersList()
        .equals(other.getFiltersList())) return false;
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
    if (getFiltersCount() > 0) {
      hash = (37 * hash) + FILTERS_FIELD_NUMBER;
      hash = (53 * hash) + getFiltersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails parseFrom(
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
  public static Builder newBuilder(com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails prototype) {
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
   * Message to contain blob integration rules
   * </pre>
   *
   * Protobuf type {@code anduril.communicationsmanager.v1.BlobIntegrationRuleDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.communicationsmanager.v1.BlobIntegrationRuleDetails)
      com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.communicationsmanager.v1.BlobsPubProto.internal_static_anduril_communicationsmanager_v1_BlobIntegrationRuleDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.communicationsmanager.v1.BlobsPubProto.internal_static_anduril_communicationsmanager_v1_BlobIntegrationRuleDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails.class, com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails.Builder.class);
    }

    // Construct using com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails.newBuilder()
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
      if (filtersBuilder_ == null) {
        filters_ = java.util.Collections.emptyList();
      } else {
        filters_ = null;
        filtersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.communicationsmanager.v1.BlobsPubProto.internal_static_anduril_communicationsmanager_v1_BlobIntegrationRuleDetails_descriptor;
    }

    @java.lang.Override
    public com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails getDefaultInstanceForType() {
      return com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails build() {
      com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails buildPartial() {
      com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails result = new com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails result) {
      if (filtersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          filters_ = java.util.Collections.unmodifiableList(filters_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.filters_ = filters_;
      } else {
        result.filters_ = filtersBuilder_.build();
      }
    }

    private void buildPartial0(com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails) {
        return mergeFrom((com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails other) {
      if (other == com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails.getDefaultInstance()) return this;
      if (filtersBuilder_ == null) {
        if (!other.filters_.isEmpty()) {
          if (filters_.isEmpty()) {
            filters_ = other.filters_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFiltersIsMutable();
            filters_.addAll(other.filters_);
          }
          onChanged();
        }
      } else {
        if (!other.filters_.isEmpty()) {
          if (filtersBuilder_.isEmpty()) {
            filtersBuilder_.dispose();
            filtersBuilder_ = null;
            filters_ = other.filters_;
            bitField0_ = (bitField0_ & ~0x00000001);
            filtersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFiltersFieldBuilder() : null;
          } else {
            filtersBuilder_.addAllMessages(other.filters_);
          }
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
              com.anduril.blobs.v1.Statement m =
                  input.readMessage(
                      com.anduril.blobs.v1.Statement.parser(),
                      extensionRegistry);
              if (filtersBuilder_ == null) {
                ensureFiltersIsMutable();
                filters_.add(m);
              } else {
                filtersBuilder_.addMessage(m);
              }
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
    private int bitField0_;

    private java.util.List<com.anduril.blobs.v1.Statement> filters_ =
      java.util.Collections.emptyList();
    private void ensureFiltersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        filters_ = new java.util.ArrayList<com.anduril.blobs.v1.Statement>(filters_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.anduril.blobs.v1.Statement, com.anduril.blobs.v1.Statement.Builder, com.anduril.blobs.v1.StatementOrBuilder> filtersBuilder_;

    /**
     * <pre>
     * The filter to be applied to the integration
     * </pre>
     *
     * <code>repeated .anduril.blobs.v1.Statement filters = 1 [json_name = "filters"];</code>
     */
    public java.util.List<com.anduril.blobs.v1.Statement> getFiltersList() {
      if (filtersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(filters_);
      } else {
        return filtersBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The filter to be applied to the integration
     * </pre>
     *
     * <code>repeated .anduril.blobs.v1.Statement filters = 1 [json_name = "filters"];</code>
     */
    public int getFiltersCount() {
      if (filtersBuilder_ == null) {
        return filters_.size();
      } else {
        return filtersBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The filter to be applied to the integration
     * </pre>
     *
     * <code>repeated .anduril.blobs.v1.Statement filters = 1 [json_name = "filters"];</code>
     */
    public com.anduril.blobs.v1.Statement getFilters(int index) {
      if (filtersBuilder_ == null) {
        return filters_.get(index);
      } else {
        return filtersBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The filter to be applied to the integration
     * </pre>
     *
     * <code>repeated .anduril.blobs.v1.Statement filters = 1 [json_name = "filters"];</code>
     */
    public Builder setFilters(
        int index, com.anduril.blobs.v1.Statement value) {
      if (filtersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFiltersIsMutable();
        filters_.set(index, value);
        onChanged();
      } else {
        filtersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The filter to be applied to the integration
     * </pre>
     *
     * <code>repeated .anduril.blobs.v1.Statement filters = 1 [json_name = "filters"];</code>
     */
    public Builder setFilters(
        int index, com.anduril.blobs.v1.Statement.Builder builderForValue) {
      if (filtersBuilder_ == null) {
        ensureFiltersIsMutable();
        filters_.set(index, builderForValue.build());
        onChanged();
      } else {
        filtersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The filter to be applied to the integration
     * </pre>
     *
     * <code>repeated .anduril.blobs.v1.Statement filters = 1 [json_name = "filters"];</code>
     */
    public Builder addFilters(com.anduril.blobs.v1.Statement value) {
      if (filtersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFiltersIsMutable();
        filters_.add(value);
        onChanged();
      } else {
        filtersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The filter to be applied to the integration
     * </pre>
     *
     * <code>repeated .anduril.blobs.v1.Statement filters = 1 [json_name = "filters"];</code>
     */
    public Builder addFilters(
        int index, com.anduril.blobs.v1.Statement value) {
      if (filtersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFiltersIsMutable();
        filters_.add(index, value);
        onChanged();
      } else {
        filtersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The filter to be applied to the integration
     * </pre>
     *
     * <code>repeated .anduril.blobs.v1.Statement filters = 1 [json_name = "filters"];</code>
     */
    public Builder addFilters(
        com.anduril.blobs.v1.Statement.Builder builderForValue) {
      if (filtersBuilder_ == null) {
        ensureFiltersIsMutable();
        filters_.add(builderForValue.build());
        onChanged();
      } else {
        filtersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The filter to be applied to the integration
     * </pre>
     *
     * <code>repeated .anduril.blobs.v1.Statement filters = 1 [json_name = "filters"];</code>
     */
    public Builder addFilters(
        int index, com.anduril.blobs.v1.Statement.Builder builderForValue) {
      if (filtersBuilder_ == null) {
        ensureFiltersIsMutable();
        filters_.add(index, builderForValue.build());
        onChanged();
      } else {
        filtersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The filter to be applied to the integration
     * </pre>
     *
     * <code>repeated .anduril.blobs.v1.Statement filters = 1 [json_name = "filters"];</code>
     */
    public Builder addAllFilters(
        java.lang.Iterable<? extends com.anduril.blobs.v1.Statement> values) {
      if (filtersBuilder_ == null) {
        ensureFiltersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, filters_);
        onChanged();
      } else {
        filtersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The filter to be applied to the integration
     * </pre>
     *
     * <code>repeated .anduril.blobs.v1.Statement filters = 1 [json_name = "filters"];</code>
     */
    public Builder clearFilters() {
      if (filtersBuilder_ == null) {
        filters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        filtersBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The filter to be applied to the integration
     * </pre>
     *
     * <code>repeated .anduril.blobs.v1.Statement filters = 1 [json_name = "filters"];</code>
     */
    public Builder removeFilters(int index) {
      if (filtersBuilder_ == null) {
        ensureFiltersIsMutable();
        filters_.remove(index);
        onChanged();
      } else {
        filtersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The filter to be applied to the integration
     * </pre>
     *
     * <code>repeated .anduril.blobs.v1.Statement filters = 1 [json_name = "filters"];</code>
     */
    public com.anduril.blobs.v1.Statement.Builder getFiltersBuilder(
        int index) {
      return getFiltersFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The filter to be applied to the integration
     * </pre>
     *
     * <code>repeated .anduril.blobs.v1.Statement filters = 1 [json_name = "filters"];</code>
     */
    public com.anduril.blobs.v1.StatementOrBuilder getFiltersOrBuilder(
        int index) {
      if (filtersBuilder_ == null) {
        return filters_.get(index);  } else {
        return filtersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The filter to be applied to the integration
     * </pre>
     *
     * <code>repeated .anduril.blobs.v1.Statement filters = 1 [json_name = "filters"];</code>
     */
    public java.util.List<? extends com.anduril.blobs.v1.StatementOrBuilder> 
         getFiltersOrBuilderList() {
      if (filtersBuilder_ != null) {
        return filtersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(filters_);
      }
    }
    /**
     * <pre>
     * The filter to be applied to the integration
     * </pre>
     *
     * <code>repeated .anduril.blobs.v1.Statement filters = 1 [json_name = "filters"];</code>
     */
    public com.anduril.blobs.v1.Statement.Builder addFiltersBuilder() {
      return getFiltersFieldBuilder().addBuilder(
          com.anduril.blobs.v1.Statement.getDefaultInstance());
    }
    /**
     * <pre>
     * The filter to be applied to the integration
     * </pre>
     *
     * <code>repeated .anduril.blobs.v1.Statement filters = 1 [json_name = "filters"];</code>
     */
    public com.anduril.blobs.v1.Statement.Builder addFiltersBuilder(
        int index) {
      return getFiltersFieldBuilder().addBuilder(
          index, com.anduril.blobs.v1.Statement.getDefaultInstance());
    }
    /**
     * <pre>
     * The filter to be applied to the integration
     * </pre>
     *
     * <code>repeated .anduril.blobs.v1.Statement filters = 1 [json_name = "filters"];</code>
     */
    public java.util.List<com.anduril.blobs.v1.Statement.Builder> 
         getFiltersBuilderList() {
      return getFiltersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.anduril.blobs.v1.Statement, com.anduril.blobs.v1.Statement.Builder, com.anduril.blobs.v1.StatementOrBuilder> 
        getFiltersFieldBuilder() {
      if (filtersBuilder_ == null) {
        filtersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.anduril.blobs.v1.Statement, com.anduril.blobs.v1.Statement.Builder, com.anduril.blobs.v1.StatementOrBuilder>(
                filters_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        filters_ = null;
      }
      return filtersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.communicationsmanager.v1.BlobIntegrationRuleDetails)
  }

  // @@protoc_insertion_point(class_scope:anduril.communicationsmanager.v1.BlobIntegrationRuleDetails)
  private static final com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails();
  }

  public static com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlobIntegrationRuleDetails>
      PARSER = new com.google.protobuf.AbstractParser<BlobIntegrationRuleDetails>() {
    @java.lang.Override
    public BlobIntegrationRuleDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<BlobIntegrationRuleDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BlobIntegrationRuleDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.communicationsmanager.v1.BlobIntegrationRuleDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

