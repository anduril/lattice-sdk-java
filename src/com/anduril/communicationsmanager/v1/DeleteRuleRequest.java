// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/communicationsmanager/v1/communications_manager_api.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.communicationsmanager.v1;

/**
 * <pre>
 * A request to delete a rule on this distribution manager.
 * </pre>
 *
 * Protobuf type {@code anduril.communicationsmanager.v1.DeleteRuleRequest}
 */
public final class DeleteRuleRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:anduril.communicationsmanager.v1.DeleteRuleRequest)
    DeleteRuleRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      DeleteRuleRequest.class.getName());
  }
  // Use DeleteRuleRequest.newBuilder() to construct.
  private DeleteRuleRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private DeleteRuleRequest() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.communicationsmanager.v1.CommunicationsManagerApiPubProto.internal_static_anduril_communicationsmanager_v1_DeleteRuleRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.communicationsmanager.v1.CommunicationsManagerApiPubProto.internal_static_anduril_communicationsmanager_v1_DeleteRuleRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.communicationsmanager.v1.DeleteRuleRequest.class, com.anduril.communicationsmanager.v1.DeleteRuleRequest.Builder.class);
  }

  private int bitField0_;
  public static final int RULE_FIELD_NUMBER = 2;
  private com.anduril.communicationsmanager.v1.Rule rule_;
  /**
   * <code>.anduril.communicationsmanager.v1.Rule rule = 2 [json_name = "rule"];</code>
   * @return Whether the rule field is set.
   */
  @java.lang.Override
  public boolean hasRule() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.anduril.communicationsmanager.v1.Rule rule = 2 [json_name = "rule"];</code>
   * @return The rule.
   */
  @java.lang.Override
  public com.anduril.communicationsmanager.v1.Rule getRule() {
    return rule_ == null ? com.anduril.communicationsmanager.v1.Rule.getDefaultInstance() : rule_;
  }
  /**
   * <code>.anduril.communicationsmanager.v1.Rule rule = 2 [json_name = "rule"];</code>
   */
  @java.lang.Override
  public com.anduril.communicationsmanager.v1.RuleOrBuilder getRuleOrBuilder() {
    return rule_ == null ? com.anduril.communicationsmanager.v1.Rule.getDefaultInstance() : rule_;
  }

  public static final int DISTRIBUTION_RULE_FIELD_NUMBER = 1;
  private com.anduril.communicationsmanager.v1.DistributionRule distributionRule_;
  /**
   * <pre>
   * To be DEPRECATED. Use `Rule`
   * </pre>
   *
   * <code>.anduril.communicationsmanager.v1.DistributionRule distribution_rule = 1 [json_name = "distributionRule"];</code>
   * @return Whether the distributionRule field is set.
   */
  @java.lang.Override
  public boolean hasDistributionRule() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * To be DEPRECATED. Use `Rule`
   * </pre>
   *
   * <code>.anduril.communicationsmanager.v1.DistributionRule distribution_rule = 1 [json_name = "distributionRule"];</code>
   * @return The distributionRule.
   */
  @java.lang.Override
  public com.anduril.communicationsmanager.v1.DistributionRule getDistributionRule() {
    return distributionRule_ == null ? com.anduril.communicationsmanager.v1.DistributionRule.getDefaultInstance() : distributionRule_;
  }
  /**
   * <pre>
   * To be DEPRECATED. Use `Rule`
   * </pre>
   *
   * <code>.anduril.communicationsmanager.v1.DistributionRule distribution_rule = 1 [json_name = "distributionRule"];</code>
   */
  @java.lang.Override
  public com.anduril.communicationsmanager.v1.DistributionRuleOrBuilder getDistributionRuleOrBuilder() {
    return distributionRule_ == null ? com.anduril.communicationsmanager.v1.DistributionRule.getDefaultInstance() : distributionRule_;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(1, getDistributionRule());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getRule());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDistributionRule());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRule());
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
    if (!(obj instanceof com.anduril.communicationsmanager.v1.DeleteRuleRequest)) {
      return super.equals(obj);
    }
    com.anduril.communicationsmanager.v1.DeleteRuleRequest other = (com.anduril.communicationsmanager.v1.DeleteRuleRequest) obj;

    if (hasRule() != other.hasRule()) return false;
    if (hasRule()) {
      if (!getRule()
          .equals(other.getRule())) return false;
    }
    if (hasDistributionRule() != other.hasDistributionRule()) return false;
    if (hasDistributionRule()) {
      if (!getDistributionRule()
          .equals(other.getDistributionRule())) return false;
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
    if (hasRule()) {
      hash = (37 * hash) + RULE_FIELD_NUMBER;
      hash = (53 * hash) + getRule().hashCode();
    }
    if (hasDistributionRule()) {
      hash = (37 * hash) + DISTRIBUTION_RULE_FIELD_NUMBER;
      hash = (53 * hash) + getDistributionRule().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.communicationsmanager.v1.DeleteRuleRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.communicationsmanager.v1.DeleteRuleRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.communicationsmanager.v1.DeleteRuleRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.communicationsmanager.v1.DeleteRuleRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.communicationsmanager.v1.DeleteRuleRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.communicationsmanager.v1.DeleteRuleRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.communicationsmanager.v1.DeleteRuleRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.communicationsmanager.v1.DeleteRuleRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.communicationsmanager.v1.DeleteRuleRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.communicationsmanager.v1.DeleteRuleRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.communicationsmanager.v1.DeleteRuleRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.communicationsmanager.v1.DeleteRuleRequest parseFrom(
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
  public static Builder newBuilder(com.anduril.communicationsmanager.v1.DeleteRuleRequest prototype) {
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
   * A request to delete a rule on this distribution manager.
   * </pre>
   *
   * Protobuf type {@code anduril.communicationsmanager.v1.DeleteRuleRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.communicationsmanager.v1.DeleteRuleRequest)
      com.anduril.communicationsmanager.v1.DeleteRuleRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.communicationsmanager.v1.CommunicationsManagerApiPubProto.internal_static_anduril_communicationsmanager_v1_DeleteRuleRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.communicationsmanager.v1.CommunicationsManagerApiPubProto.internal_static_anduril_communicationsmanager_v1_DeleteRuleRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.communicationsmanager.v1.DeleteRuleRequest.class, com.anduril.communicationsmanager.v1.DeleteRuleRequest.Builder.class);
    }

    // Construct using com.anduril.communicationsmanager.v1.DeleteRuleRequest.newBuilder()
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
        getRuleFieldBuilder();
        getDistributionRuleFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      rule_ = null;
      if (ruleBuilder_ != null) {
        ruleBuilder_.dispose();
        ruleBuilder_ = null;
      }
      distributionRule_ = null;
      if (distributionRuleBuilder_ != null) {
        distributionRuleBuilder_.dispose();
        distributionRuleBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.communicationsmanager.v1.CommunicationsManagerApiPubProto.internal_static_anduril_communicationsmanager_v1_DeleteRuleRequest_descriptor;
    }

    @java.lang.Override
    public com.anduril.communicationsmanager.v1.DeleteRuleRequest getDefaultInstanceForType() {
      return com.anduril.communicationsmanager.v1.DeleteRuleRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.communicationsmanager.v1.DeleteRuleRequest build() {
      com.anduril.communicationsmanager.v1.DeleteRuleRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.communicationsmanager.v1.DeleteRuleRequest buildPartial() {
      com.anduril.communicationsmanager.v1.DeleteRuleRequest result = new com.anduril.communicationsmanager.v1.DeleteRuleRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.communicationsmanager.v1.DeleteRuleRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rule_ = ruleBuilder_ == null
            ? rule_
            : ruleBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.distributionRule_ = distributionRuleBuilder_ == null
            ? distributionRule_
            : distributionRuleBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.communicationsmanager.v1.DeleteRuleRequest) {
        return mergeFrom((com.anduril.communicationsmanager.v1.DeleteRuleRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.communicationsmanager.v1.DeleteRuleRequest other) {
      if (other == com.anduril.communicationsmanager.v1.DeleteRuleRequest.getDefaultInstance()) return this;
      if (other.hasRule()) {
        mergeRule(other.getRule());
      }
      if (other.hasDistributionRule()) {
        mergeDistributionRule(other.getDistributionRule());
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
                  getDistributionRuleFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getRuleFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.anduril.communicationsmanager.v1.Rule rule_;
    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.communicationsmanager.v1.Rule, com.anduril.communicationsmanager.v1.Rule.Builder, com.anduril.communicationsmanager.v1.RuleOrBuilder> ruleBuilder_;
    /**
     * <code>.anduril.communicationsmanager.v1.Rule rule = 2 [json_name = "rule"];</code>
     * @return Whether the rule field is set.
     */
    public boolean hasRule() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.anduril.communicationsmanager.v1.Rule rule = 2 [json_name = "rule"];</code>
     * @return The rule.
     */
    public com.anduril.communicationsmanager.v1.Rule getRule() {
      if (ruleBuilder_ == null) {
        return rule_ == null ? com.anduril.communicationsmanager.v1.Rule.getDefaultInstance() : rule_;
      } else {
        return ruleBuilder_.getMessage();
      }
    }
    /**
     * <code>.anduril.communicationsmanager.v1.Rule rule = 2 [json_name = "rule"];</code>
     */
    public Builder setRule(com.anduril.communicationsmanager.v1.Rule value) {
      if (ruleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rule_ = value;
      } else {
        ruleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.communicationsmanager.v1.Rule rule = 2 [json_name = "rule"];</code>
     */
    public Builder setRule(
        com.anduril.communicationsmanager.v1.Rule.Builder builderForValue) {
      if (ruleBuilder_ == null) {
        rule_ = builderForValue.build();
      } else {
        ruleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.communicationsmanager.v1.Rule rule = 2 [json_name = "rule"];</code>
     */
    public Builder mergeRule(com.anduril.communicationsmanager.v1.Rule value) {
      if (ruleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          rule_ != null &&
          rule_ != com.anduril.communicationsmanager.v1.Rule.getDefaultInstance()) {
          getRuleBuilder().mergeFrom(value);
        } else {
          rule_ = value;
        }
      } else {
        ruleBuilder_.mergeFrom(value);
      }
      if (rule_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.anduril.communicationsmanager.v1.Rule rule = 2 [json_name = "rule"];</code>
     */
    public Builder clearRule() {
      bitField0_ = (bitField0_ & ~0x00000001);
      rule_ = null;
      if (ruleBuilder_ != null) {
        ruleBuilder_.dispose();
        ruleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.communicationsmanager.v1.Rule rule = 2 [json_name = "rule"];</code>
     */
    public com.anduril.communicationsmanager.v1.Rule.Builder getRuleBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRuleFieldBuilder().getBuilder();
    }
    /**
     * <code>.anduril.communicationsmanager.v1.Rule rule = 2 [json_name = "rule"];</code>
     */
    public com.anduril.communicationsmanager.v1.RuleOrBuilder getRuleOrBuilder() {
      if (ruleBuilder_ != null) {
        return ruleBuilder_.getMessageOrBuilder();
      } else {
        return rule_ == null ?
            com.anduril.communicationsmanager.v1.Rule.getDefaultInstance() : rule_;
      }
    }
    /**
     * <code>.anduril.communicationsmanager.v1.Rule rule = 2 [json_name = "rule"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.communicationsmanager.v1.Rule, com.anduril.communicationsmanager.v1.Rule.Builder, com.anduril.communicationsmanager.v1.RuleOrBuilder> 
        getRuleFieldBuilder() {
      if (ruleBuilder_ == null) {
        ruleBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.anduril.communicationsmanager.v1.Rule, com.anduril.communicationsmanager.v1.Rule.Builder, com.anduril.communicationsmanager.v1.RuleOrBuilder>(
                getRule(),
                getParentForChildren(),
                isClean());
        rule_ = null;
      }
      return ruleBuilder_;
    }

    private com.anduril.communicationsmanager.v1.DistributionRule distributionRule_;
    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.communicationsmanager.v1.DistributionRule, com.anduril.communicationsmanager.v1.DistributionRule.Builder, com.anduril.communicationsmanager.v1.DistributionRuleOrBuilder> distributionRuleBuilder_;
    /**
     * <pre>
     * To be DEPRECATED. Use `Rule`
     * </pre>
     *
     * <code>.anduril.communicationsmanager.v1.DistributionRule distribution_rule = 1 [json_name = "distributionRule"];</code>
     * @return Whether the distributionRule field is set.
     */
    public boolean hasDistributionRule() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * To be DEPRECATED. Use `Rule`
     * </pre>
     *
     * <code>.anduril.communicationsmanager.v1.DistributionRule distribution_rule = 1 [json_name = "distributionRule"];</code>
     * @return The distributionRule.
     */
    public com.anduril.communicationsmanager.v1.DistributionRule getDistributionRule() {
      if (distributionRuleBuilder_ == null) {
        return distributionRule_ == null ? com.anduril.communicationsmanager.v1.DistributionRule.getDefaultInstance() : distributionRule_;
      } else {
        return distributionRuleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * To be DEPRECATED. Use `Rule`
     * </pre>
     *
     * <code>.anduril.communicationsmanager.v1.DistributionRule distribution_rule = 1 [json_name = "distributionRule"];</code>
     */
    public Builder setDistributionRule(com.anduril.communicationsmanager.v1.DistributionRule value) {
      if (distributionRuleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        distributionRule_ = value;
      } else {
        distributionRuleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * To be DEPRECATED. Use `Rule`
     * </pre>
     *
     * <code>.anduril.communicationsmanager.v1.DistributionRule distribution_rule = 1 [json_name = "distributionRule"];</code>
     */
    public Builder setDistributionRule(
        com.anduril.communicationsmanager.v1.DistributionRule.Builder builderForValue) {
      if (distributionRuleBuilder_ == null) {
        distributionRule_ = builderForValue.build();
      } else {
        distributionRuleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * To be DEPRECATED. Use `Rule`
     * </pre>
     *
     * <code>.anduril.communicationsmanager.v1.DistributionRule distribution_rule = 1 [json_name = "distributionRule"];</code>
     */
    public Builder mergeDistributionRule(com.anduril.communicationsmanager.v1.DistributionRule value) {
      if (distributionRuleBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          distributionRule_ != null &&
          distributionRule_ != com.anduril.communicationsmanager.v1.DistributionRule.getDefaultInstance()) {
          getDistributionRuleBuilder().mergeFrom(value);
        } else {
          distributionRule_ = value;
        }
      } else {
        distributionRuleBuilder_.mergeFrom(value);
      }
      if (distributionRule_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * To be DEPRECATED. Use `Rule`
     * </pre>
     *
     * <code>.anduril.communicationsmanager.v1.DistributionRule distribution_rule = 1 [json_name = "distributionRule"];</code>
     */
    public Builder clearDistributionRule() {
      bitField0_ = (bitField0_ & ~0x00000002);
      distributionRule_ = null;
      if (distributionRuleBuilder_ != null) {
        distributionRuleBuilder_.dispose();
        distributionRuleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * To be DEPRECATED. Use `Rule`
     * </pre>
     *
     * <code>.anduril.communicationsmanager.v1.DistributionRule distribution_rule = 1 [json_name = "distributionRule"];</code>
     */
    public com.anduril.communicationsmanager.v1.DistributionRule.Builder getDistributionRuleBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDistributionRuleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * To be DEPRECATED. Use `Rule`
     * </pre>
     *
     * <code>.anduril.communicationsmanager.v1.DistributionRule distribution_rule = 1 [json_name = "distributionRule"];</code>
     */
    public com.anduril.communicationsmanager.v1.DistributionRuleOrBuilder getDistributionRuleOrBuilder() {
      if (distributionRuleBuilder_ != null) {
        return distributionRuleBuilder_.getMessageOrBuilder();
      } else {
        return distributionRule_ == null ?
            com.anduril.communicationsmanager.v1.DistributionRule.getDefaultInstance() : distributionRule_;
      }
    }
    /**
     * <pre>
     * To be DEPRECATED. Use `Rule`
     * </pre>
     *
     * <code>.anduril.communicationsmanager.v1.DistributionRule distribution_rule = 1 [json_name = "distributionRule"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.communicationsmanager.v1.DistributionRule, com.anduril.communicationsmanager.v1.DistributionRule.Builder, com.anduril.communicationsmanager.v1.DistributionRuleOrBuilder> 
        getDistributionRuleFieldBuilder() {
      if (distributionRuleBuilder_ == null) {
        distributionRuleBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.anduril.communicationsmanager.v1.DistributionRule, com.anduril.communicationsmanager.v1.DistributionRule.Builder, com.anduril.communicationsmanager.v1.DistributionRuleOrBuilder>(
                getDistributionRule(),
                getParentForChildren(),
                isClean());
        distributionRule_ = null;
      }
      return distributionRuleBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:anduril.communicationsmanager.v1.DeleteRuleRequest)
  }

  // @@protoc_insertion_point(class_scope:anduril.communicationsmanager.v1.DeleteRuleRequest)
  private static final com.anduril.communicationsmanager.v1.DeleteRuleRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.communicationsmanager.v1.DeleteRuleRequest();
  }

  public static com.anduril.communicationsmanager.v1.DeleteRuleRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteRuleRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteRuleRequest>() {
    @java.lang.Override
    public DeleteRuleRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteRuleRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteRuleRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.communicationsmanager.v1.DeleteRuleRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

