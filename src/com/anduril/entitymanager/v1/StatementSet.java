// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/filter.pub.proto

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * The StatementSet represents a list of statements or "tree nodes," each of which follow the same
 * behavior as the Statement proto message.
 * </pre>
 *
 * Protobuf type {@code anduril.entitymanager.v1.StatementSet}
 */
public final class StatementSet extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.StatementSet)
    StatementSetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StatementSet.newBuilder() to construct.
  private StatementSet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StatementSet() {
    statements_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StatementSet();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.FilterPubProto.internal_static_anduril_entitymanager_v1_StatementSet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.FilterPubProto.internal_static_anduril_entitymanager_v1_StatementSet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.StatementSet.class, com.anduril.entitymanager.v1.StatementSet.Builder.class);
  }

  public static final int STATEMENTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.anduril.entitymanager.v1.Statement> statements_;
  /**
   * <code>repeated .anduril.entitymanager.v1.Statement statements = 1 [json_name = "statements"];</code>
   */
  @java.lang.Override
  public java.util.List<com.anduril.entitymanager.v1.Statement> getStatementsList() {
    return statements_;
  }
  /**
   * <code>repeated .anduril.entitymanager.v1.Statement statements = 1 [json_name = "statements"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.anduril.entitymanager.v1.StatementOrBuilder> 
      getStatementsOrBuilderList() {
    return statements_;
  }
  /**
   * <code>repeated .anduril.entitymanager.v1.Statement statements = 1 [json_name = "statements"];</code>
   */
  @java.lang.Override
  public int getStatementsCount() {
    return statements_.size();
  }
  /**
   * <code>repeated .anduril.entitymanager.v1.Statement statements = 1 [json_name = "statements"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.Statement getStatements(int index) {
    return statements_.get(index);
  }
  /**
   * <code>repeated .anduril.entitymanager.v1.Statement statements = 1 [json_name = "statements"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.StatementOrBuilder getStatementsOrBuilder(
      int index) {
    return statements_.get(index);
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
    for (int i = 0; i < statements_.size(); i++) {
      output.writeMessage(1, statements_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < statements_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, statements_.get(i));
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
    if (!(obj instanceof com.anduril.entitymanager.v1.StatementSet)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.StatementSet other = (com.anduril.entitymanager.v1.StatementSet) obj;

    if (!getStatementsList()
        .equals(other.getStatementsList())) return false;
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
    if (getStatementsCount() > 0) {
      hash = (37 * hash) + STATEMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getStatementsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.StatementSet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.StatementSet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.StatementSet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.StatementSet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.StatementSet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.StatementSet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.StatementSet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.StatementSet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.StatementSet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.StatementSet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.StatementSet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.StatementSet parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.StatementSet prototype) {
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
   * The StatementSet represents a list of statements or "tree nodes," each of which follow the same
   * behavior as the Statement proto message.
   * </pre>
   *
   * Protobuf type {@code anduril.entitymanager.v1.StatementSet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.StatementSet)
      com.anduril.entitymanager.v1.StatementSetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.FilterPubProto.internal_static_anduril_entitymanager_v1_StatementSet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.FilterPubProto.internal_static_anduril_entitymanager_v1_StatementSet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.StatementSet.class, com.anduril.entitymanager.v1.StatementSet.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.StatementSet.newBuilder()
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
      if (statementsBuilder_ == null) {
        statements_ = java.util.Collections.emptyList();
      } else {
        statements_ = null;
        statementsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.FilterPubProto.internal_static_anduril_entitymanager_v1_StatementSet_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.StatementSet getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.StatementSet.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.StatementSet build() {
      com.anduril.entitymanager.v1.StatementSet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.StatementSet buildPartial() {
      com.anduril.entitymanager.v1.StatementSet result = new com.anduril.entitymanager.v1.StatementSet(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.anduril.entitymanager.v1.StatementSet result) {
      if (statementsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          statements_ = java.util.Collections.unmodifiableList(statements_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.statements_ = statements_;
      } else {
        result.statements_ = statementsBuilder_.build();
      }
    }

    private void buildPartial0(com.anduril.entitymanager.v1.StatementSet result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entitymanager.v1.StatementSet) {
        return mergeFrom((com.anduril.entitymanager.v1.StatementSet)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.StatementSet other) {
      if (other == com.anduril.entitymanager.v1.StatementSet.getDefaultInstance()) return this;
      if (statementsBuilder_ == null) {
        if (!other.statements_.isEmpty()) {
          if (statements_.isEmpty()) {
            statements_ = other.statements_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStatementsIsMutable();
            statements_.addAll(other.statements_);
          }
          onChanged();
        }
      } else {
        if (!other.statements_.isEmpty()) {
          if (statementsBuilder_.isEmpty()) {
            statementsBuilder_.dispose();
            statementsBuilder_ = null;
            statements_ = other.statements_;
            bitField0_ = (bitField0_ & ~0x00000001);
            statementsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStatementsFieldBuilder() : null;
          } else {
            statementsBuilder_.addAllMessages(other.statements_);
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
              com.anduril.entitymanager.v1.Statement m =
                  input.readMessage(
                      com.anduril.entitymanager.v1.Statement.parser(),
                      extensionRegistry);
              if (statementsBuilder_ == null) {
                ensureStatementsIsMutable();
                statements_.add(m);
              } else {
                statementsBuilder_.addMessage(m);
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

    private java.util.List<com.anduril.entitymanager.v1.Statement> statements_ =
      java.util.Collections.emptyList();
    private void ensureStatementsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        statements_ = new java.util.ArrayList<com.anduril.entitymanager.v1.Statement>(statements_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.anduril.entitymanager.v1.Statement, com.anduril.entitymanager.v1.Statement.Builder, com.anduril.entitymanager.v1.StatementOrBuilder> statementsBuilder_;

    /**
     * <code>repeated .anduril.entitymanager.v1.Statement statements = 1 [json_name = "statements"];</code>
     */
    public java.util.List<com.anduril.entitymanager.v1.Statement> getStatementsList() {
      if (statementsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(statements_);
      } else {
        return statementsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Statement statements = 1 [json_name = "statements"];</code>
     */
    public int getStatementsCount() {
      if (statementsBuilder_ == null) {
        return statements_.size();
      } else {
        return statementsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Statement statements = 1 [json_name = "statements"];</code>
     */
    public com.anduril.entitymanager.v1.Statement getStatements(int index) {
      if (statementsBuilder_ == null) {
        return statements_.get(index);
      } else {
        return statementsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Statement statements = 1 [json_name = "statements"];</code>
     */
    public Builder setStatements(
        int index, com.anduril.entitymanager.v1.Statement value) {
      if (statementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStatementsIsMutable();
        statements_.set(index, value);
        onChanged();
      } else {
        statementsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Statement statements = 1 [json_name = "statements"];</code>
     */
    public Builder setStatements(
        int index, com.anduril.entitymanager.v1.Statement.Builder builderForValue) {
      if (statementsBuilder_ == null) {
        ensureStatementsIsMutable();
        statements_.set(index, builderForValue.build());
        onChanged();
      } else {
        statementsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Statement statements = 1 [json_name = "statements"];</code>
     */
    public Builder addStatements(com.anduril.entitymanager.v1.Statement value) {
      if (statementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStatementsIsMutable();
        statements_.add(value);
        onChanged();
      } else {
        statementsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Statement statements = 1 [json_name = "statements"];</code>
     */
    public Builder addStatements(
        int index, com.anduril.entitymanager.v1.Statement value) {
      if (statementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStatementsIsMutable();
        statements_.add(index, value);
        onChanged();
      } else {
        statementsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Statement statements = 1 [json_name = "statements"];</code>
     */
    public Builder addStatements(
        com.anduril.entitymanager.v1.Statement.Builder builderForValue) {
      if (statementsBuilder_ == null) {
        ensureStatementsIsMutable();
        statements_.add(builderForValue.build());
        onChanged();
      } else {
        statementsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Statement statements = 1 [json_name = "statements"];</code>
     */
    public Builder addStatements(
        int index, com.anduril.entitymanager.v1.Statement.Builder builderForValue) {
      if (statementsBuilder_ == null) {
        ensureStatementsIsMutable();
        statements_.add(index, builderForValue.build());
        onChanged();
      } else {
        statementsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Statement statements = 1 [json_name = "statements"];</code>
     */
    public Builder addAllStatements(
        java.lang.Iterable<? extends com.anduril.entitymanager.v1.Statement> values) {
      if (statementsBuilder_ == null) {
        ensureStatementsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, statements_);
        onChanged();
      } else {
        statementsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Statement statements = 1 [json_name = "statements"];</code>
     */
    public Builder clearStatements() {
      if (statementsBuilder_ == null) {
        statements_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        statementsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Statement statements = 1 [json_name = "statements"];</code>
     */
    public Builder removeStatements(int index) {
      if (statementsBuilder_ == null) {
        ensureStatementsIsMutable();
        statements_.remove(index);
        onChanged();
      } else {
        statementsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Statement statements = 1 [json_name = "statements"];</code>
     */
    public com.anduril.entitymanager.v1.Statement.Builder getStatementsBuilder(
        int index) {
      return getStatementsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Statement statements = 1 [json_name = "statements"];</code>
     */
    public com.anduril.entitymanager.v1.StatementOrBuilder getStatementsOrBuilder(
        int index) {
      if (statementsBuilder_ == null) {
        return statements_.get(index);  } else {
        return statementsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Statement statements = 1 [json_name = "statements"];</code>
     */
    public java.util.List<? extends com.anduril.entitymanager.v1.StatementOrBuilder> 
         getStatementsOrBuilderList() {
      if (statementsBuilder_ != null) {
        return statementsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(statements_);
      }
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Statement statements = 1 [json_name = "statements"];</code>
     */
    public com.anduril.entitymanager.v1.Statement.Builder addStatementsBuilder() {
      return getStatementsFieldBuilder().addBuilder(
          com.anduril.entitymanager.v1.Statement.getDefaultInstance());
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Statement statements = 1 [json_name = "statements"];</code>
     */
    public com.anduril.entitymanager.v1.Statement.Builder addStatementsBuilder(
        int index) {
      return getStatementsFieldBuilder().addBuilder(
          index, com.anduril.entitymanager.v1.Statement.getDefaultInstance());
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Statement statements = 1 [json_name = "statements"];</code>
     */
    public java.util.List<com.anduril.entitymanager.v1.Statement.Builder> 
         getStatementsBuilderList() {
      return getStatementsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.anduril.entitymanager.v1.Statement, com.anduril.entitymanager.v1.Statement.Builder, com.anduril.entitymanager.v1.StatementOrBuilder> 
        getStatementsFieldBuilder() {
      if (statementsBuilder_ == null) {
        statementsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.anduril.entitymanager.v1.Statement, com.anduril.entitymanager.v1.Statement.Builder, com.anduril.entitymanager.v1.StatementOrBuilder>(
                statements_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        statements_ = null;
      }
      return statementsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.StatementSet)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.StatementSet)
  private static final com.anduril.entitymanager.v1.StatementSet DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.StatementSet();
  }

  public static com.anduril.entitymanager.v1.StatementSet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StatementSet>
      PARSER = new com.google.protobuf.AbstractParser<StatementSet>() {
    @java.lang.Override
    public StatementSet parsePartialFrom(
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

  public static com.google.protobuf.Parser<StatementSet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StatementSet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.StatementSet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

