// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/filter.pub.proto

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * The AndOperation represents the boolean AND operation, which is to be applied to the list of
 * children statement(s) or predicate(s).
 * </pre>
 *
 * Protobuf type {@code anduril.entitymanager.v1.AndOperation}
 */
public final class AndOperation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.AndOperation)
    AndOperationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AndOperation.newBuilder() to construct.
  private AndOperation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AndOperation() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AndOperation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.FilterPubProto.internal_static_anduril_entitymanager_v1_AndOperation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.FilterPubProto.internal_static_anduril_entitymanager_v1_AndOperation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.AndOperation.class, com.anduril.entitymanager.v1.AndOperation.Builder.class);
  }

  private int childrenCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object children_;
  public enum ChildrenCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    PREDICATE_SET(1),
    STATEMENT_SET(2),
    CHILDREN_NOT_SET(0);
    private final int value;
    private ChildrenCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ChildrenCase valueOf(int value) {
      return forNumber(value);
    }

    public static ChildrenCase forNumber(int value) {
      switch (value) {
        case 1: return PREDICATE_SET;
        case 2: return STATEMENT_SET;
        case 0: return CHILDREN_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ChildrenCase
  getChildrenCase() {
    return ChildrenCase.forNumber(
        childrenCase_);
  }

  public static final int PREDICATE_SET_FIELD_NUMBER = 1;
  /**
   * <code>.anduril.entitymanager.v1.PredicateSet predicate_set = 1 [json_name = "predicateSet"];</code>
   * @return Whether the predicateSet field is set.
   */
  @java.lang.Override
  public boolean hasPredicateSet() {
    return childrenCase_ == 1;
  }
  /**
   * <code>.anduril.entitymanager.v1.PredicateSet predicate_set = 1 [json_name = "predicateSet"];</code>
   * @return The predicateSet.
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.PredicateSet getPredicateSet() {
    if (childrenCase_ == 1) {
       return (com.anduril.entitymanager.v1.PredicateSet) children_;
    }
    return com.anduril.entitymanager.v1.PredicateSet.getDefaultInstance();
  }
  /**
   * <code>.anduril.entitymanager.v1.PredicateSet predicate_set = 1 [json_name = "predicateSet"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.PredicateSetOrBuilder getPredicateSetOrBuilder() {
    if (childrenCase_ == 1) {
       return (com.anduril.entitymanager.v1.PredicateSet) children_;
    }
    return com.anduril.entitymanager.v1.PredicateSet.getDefaultInstance();
  }

  public static final int STATEMENT_SET_FIELD_NUMBER = 2;
  /**
   * <code>.anduril.entitymanager.v1.StatementSet statement_set = 2 [json_name = "statementSet"];</code>
   * @return Whether the statementSet field is set.
   */
  @java.lang.Override
  public boolean hasStatementSet() {
    return childrenCase_ == 2;
  }
  /**
   * <code>.anduril.entitymanager.v1.StatementSet statement_set = 2 [json_name = "statementSet"];</code>
   * @return The statementSet.
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.StatementSet getStatementSet() {
    if (childrenCase_ == 2) {
       return (com.anduril.entitymanager.v1.StatementSet) children_;
    }
    return com.anduril.entitymanager.v1.StatementSet.getDefaultInstance();
  }
  /**
   * <code>.anduril.entitymanager.v1.StatementSet statement_set = 2 [json_name = "statementSet"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.StatementSetOrBuilder getStatementSetOrBuilder() {
    if (childrenCase_ == 2) {
       return (com.anduril.entitymanager.v1.StatementSet) children_;
    }
    return com.anduril.entitymanager.v1.StatementSet.getDefaultInstance();
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
    if (childrenCase_ == 1) {
      output.writeMessage(1, (com.anduril.entitymanager.v1.PredicateSet) children_);
    }
    if (childrenCase_ == 2) {
      output.writeMessage(2, (com.anduril.entitymanager.v1.StatementSet) children_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (childrenCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.anduril.entitymanager.v1.PredicateSet) children_);
    }
    if (childrenCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.anduril.entitymanager.v1.StatementSet) children_);
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
    if (!(obj instanceof com.anduril.entitymanager.v1.AndOperation)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.AndOperation other = (com.anduril.entitymanager.v1.AndOperation) obj;

    if (!getChildrenCase().equals(other.getChildrenCase())) return false;
    switch (childrenCase_) {
      case 1:
        if (!getPredicateSet()
            .equals(other.getPredicateSet())) return false;
        break;
      case 2:
        if (!getStatementSet()
            .equals(other.getStatementSet())) return false;
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
    switch (childrenCase_) {
      case 1:
        hash = (37 * hash) + PREDICATE_SET_FIELD_NUMBER;
        hash = (53 * hash) + getPredicateSet().hashCode();
        break;
      case 2:
        hash = (37 * hash) + STATEMENT_SET_FIELD_NUMBER;
        hash = (53 * hash) + getStatementSet().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.AndOperation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.AndOperation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.AndOperation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.AndOperation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.AndOperation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.AndOperation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.AndOperation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.AndOperation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.AndOperation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.AndOperation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.AndOperation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.AndOperation parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.AndOperation prototype) {
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
   * The AndOperation represents the boolean AND operation, which is to be applied to the list of
   * children statement(s) or predicate(s).
   * </pre>
   *
   * Protobuf type {@code anduril.entitymanager.v1.AndOperation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.AndOperation)
      com.anduril.entitymanager.v1.AndOperationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.FilterPubProto.internal_static_anduril_entitymanager_v1_AndOperation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.FilterPubProto.internal_static_anduril_entitymanager_v1_AndOperation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.AndOperation.class, com.anduril.entitymanager.v1.AndOperation.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.AndOperation.newBuilder()
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
      if (predicateSetBuilder_ != null) {
        predicateSetBuilder_.clear();
      }
      if (statementSetBuilder_ != null) {
        statementSetBuilder_.clear();
      }
      childrenCase_ = 0;
      children_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.FilterPubProto.internal_static_anduril_entitymanager_v1_AndOperation_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.AndOperation getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.AndOperation.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.AndOperation build() {
      com.anduril.entitymanager.v1.AndOperation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.AndOperation buildPartial() {
      com.anduril.entitymanager.v1.AndOperation result = new com.anduril.entitymanager.v1.AndOperation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.entitymanager.v1.AndOperation result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.anduril.entitymanager.v1.AndOperation result) {
      result.childrenCase_ = childrenCase_;
      result.children_ = this.children_;
      if (childrenCase_ == 1 &&
          predicateSetBuilder_ != null) {
        result.children_ = predicateSetBuilder_.build();
      }
      if (childrenCase_ == 2 &&
          statementSetBuilder_ != null) {
        result.children_ = statementSetBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entitymanager.v1.AndOperation) {
        return mergeFrom((com.anduril.entitymanager.v1.AndOperation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.AndOperation other) {
      if (other == com.anduril.entitymanager.v1.AndOperation.getDefaultInstance()) return this;
      switch (other.getChildrenCase()) {
        case PREDICATE_SET: {
          mergePredicateSet(other.getPredicateSet());
          break;
        }
        case STATEMENT_SET: {
          mergeStatementSet(other.getStatementSet());
          break;
        }
        case CHILDREN_NOT_SET: {
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
                  getPredicateSetFieldBuilder().getBuilder(),
                  extensionRegistry);
              childrenCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getStatementSetFieldBuilder().getBuilder(),
                  extensionRegistry);
              childrenCase_ = 2;
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
    private int childrenCase_ = 0;
    private java.lang.Object children_;
    public ChildrenCase
        getChildrenCase() {
      return ChildrenCase.forNumber(
          childrenCase_);
    }

    public Builder clearChildren() {
      childrenCase_ = 0;
      children_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.PredicateSet, com.anduril.entitymanager.v1.PredicateSet.Builder, com.anduril.entitymanager.v1.PredicateSetOrBuilder> predicateSetBuilder_;
    /**
     * <code>.anduril.entitymanager.v1.PredicateSet predicate_set = 1 [json_name = "predicateSet"];</code>
     * @return Whether the predicateSet field is set.
     */
    @java.lang.Override
    public boolean hasPredicateSet() {
      return childrenCase_ == 1;
    }
    /**
     * <code>.anduril.entitymanager.v1.PredicateSet predicate_set = 1 [json_name = "predicateSet"];</code>
     * @return The predicateSet.
     */
    @java.lang.Override
    public com.anduril.entitymanager.v1.PredicateSet getPredicateSet() {
      if (predicateSetBuilder_ == null) {
        if (childrenCase_ == 1) {
          return (com.anduril.entitymanager.v1.PredicateSet) children_;
        }
        return com.anduril.entitymanager.v1.PredicateSet.getDefaultInstance();
      } else {
        if (childrenCase_ == 1) {
          return predicateSetBuilder_.getMessage();
        }
        return com.anduril.entitymanager.v1.PredicateSet.getDefaultInstance();
      }
    }
    /**
     * <code>.anduril.entitymanager.v1.PredicateSet predicate_set = 1 [json_name = "predicateSet"];</code>
     */
    public Builder setPredicateSet(com.anduril.entitymanager.v1.PredicateSet value) {
      if (predicateSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        children_ = value;
        onChanged();
      } else {
        predicateSetBuilder_.setMessage(value);
      }
      childrenCase_ = 1;
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.PredicateSet predicate_set = 1 [json_name = "predicateSet"];</code>
     */
    public Builder setPredicateSet(
        com.anduril.entitymanager.v1.PredicateSet.Builder builderForValue) {
      if (predicateSetBuilder_ == null) {
        children_ = builderForValue.build();
        onChanged();
      } else {
        predicateSetBuilder_.setMessage(builderForValue.build());
      }
      childrenCase_ = 1;
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.PredicateSet predicate_set = 1 [json_name = "predicateSet"];</code>
     */
    public Builder mergePredicateSet(com.anduril.entitymanager.v1.PredicateSet value) {
      if (predicateSetBuilder_ == null) {
        if (childrenCase_ == 1 &&
            children_ != com.anduril.entitymanager.v1.PredicateSet.getDefaultInstance()) {
          children_ = com.anduril.entitymanager.v1.PredicateSet.newBuilder((com.anduril.entitymanager.v1.PredicateSet) children_)
              .mergeFrom(value).buildPartial();
        } else {
          children_ = value;
        }
        onChanged();
      } else {
        if (childrenCase_ == 1) {
          predicateSetBuilder_.mergeFrom(value);
        } else {
          predicateSetBuilder_.setMessage(value);
        }
      }
      childrenCase_ = 1;
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.PredicateSet predicate_set = 1 [json_name = "predicateSet"];</code>
     */
    public Builder clearPredicateSet() {
      if (predicateSetBuilder_ == null) {
        if (childrenCase_ == 1) {
          childrenCase_ = 0;
          children_ = null;
          onChanged();
        }
      } else {
        if (childrenCase_ == 1) {
          childrenCase_ = 0;
          children_ = null;
        }
        predicateSetBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.PredicateSet predicate_set = 1 [json_name = "predicateSet"];</code>
     */
    public com.anduril.entitymanager.v1.PredicateSet.Builder getPredicateSetBuilder() {
      return getPredicateSetFieldBuilder().getBuilder();
    }
    /**
     * <code>.anduril.entitymanager.v1.PredicateSet predicate_set = 1 [json_name = "predicateSet"];</code>
     */
    @java.lang.Override
    public com.anduril.entitymanager.v1.PredicateSetOrBuilder getPredicateSetOrBuilder() {
      if ((childrenCase_ == 1) && (predicateSetBuilder_ != null)) {
        return predicateSetBuilder_.getMessageOrBuilder();
      } else {
        if (childrenCase_ == 1) {
          return (com.anduril.entitymanager.v1.PredicateSet) children_;
        }
        return com.anduril.entitymanager.v1.PredicateSet.getDefaultInstance();
      }
    }
    /**
     * <code>.anduril.entitymanager.v1.PredicateSet predicate_set = 1 [json_name = "predicateSet"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.PredicateSet, com.anduril.entitymanager.v1.PredicateSet.Builder, com.anduril.entitymanager.v1.PredicateSetOrBuilder> 
        getPredicateSetFieldBuilder() {
      if (predicateSetBuilder_ == null) {
        if (!(childrenCase_ == 1)) {
          children_ = com.anduril.entitymanager.v1.PredicateSet.getDefaultInstance();
        }
        predicateSetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.entitymanager.v1.PredicateSet, com.anduril.entitymanager.v1.PredicateSet.Builder, com.anduril.entitymanager.v1.PredicateSetOrBuilder>(
                (com.anduril.entitymanager.v1.PredicateSet) children_,
                getParentForChildren(),
                isClean());
        children_ = null;
      }
      childrenCase_ = 1;
      onChanged();
      return predicateSetBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.StatementSet, com.anduril.entitymanager.v1.StatementSet.Builder, com.anduril.entitymanager.v1.StatementSetOrBuilder> statementSetBuilder_;
    /**
     * <code>.anduril.entitymanager.v1.StatementSet statement_set = 2 [json_name = "statementSet"];</code>
     * @return Whether the statementSet field is set.
     */
    @java.lang.Override
    public boolean hasStatementSet() {
      return childrenCase_ == 2;
    }
    /**
     * <code>.anduril.entitymanager.v1.StatementSet statement_set = 2 [json_name = "statementSet"];</code>
     * @return The statementSet.
     */
    @java.lang.Override
    public com.anduril.entitymanager.v1.StatementSet getStatementSet() {
      if (statementSetBuilder_ == null) {
        if (childrenCase_ == 2) {
          return (com.anduril.entitymanager.v1.StatementSet) children_;
        }
        return com.anduril.entitymanager.v1.StatementSet.getDefaultInstance();
      } else {
        if (childrenCase_ == 2) {
          return statementSetBuilder_.getMessage();
        }
        return com.anduril.entitymanager.v1.StatementSet.getDefaultInstance();
      }
    }
    /**
     * <code>.anduril.entitymanager.v1.StatementSet statement_set = 2 [json_name = "statementSet"];</code>
     */
    public Builder setStatementSet(com.anduril.entitymanager.v1.StatementSet value) {
      if (statementSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        children_ = value;
        onChanged();
      } else {
        statementSetBuilder_.setMessage(value);
      }
      childrenCase_ = 2;
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.StatementSet statement_set = 2 [json_name = "statementSet"];</code>
     */
    public Builder setStatementSet(
        com.anduril.entitymanager.v1.StatementSet.Builder builderForValue) {
      if (statementSetBuilder_ == null) {
        children_ = builderForValue.build();
        onChanged();
      } else {
        statementSetBuilder_.setMessage(builderForValue.build());
      }
      childrenCase_ = 2;
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.StatementSet statement_set = 2 [json_name = "statementSet"];</code>
     */
    public Builder mergeStatementSet(com.anduril.entitymanager.v1.StatementSet value) {
      if (statementSetBuilder_ == null) {
        if (childrenCase_ == 2 &&
            children_ != com.anduril.entitymanager.v1.StatementSet.getDefaultInstance()) {
          children_ = com.anduril.entitymanager.v1.StatementSet.newBuilder((com.anduril.entitymanager.v1.StatementSet) children_)
              .mergeFrom(value).buildPartial();
        } else {
          children_ = value;
        }
        onChanged();
      } else {
        if (childrenCase_ == 2) {
          statementSetBuilder_.mergeFrom(value);
        } else {
          statementSetBuilder_.setMessage(value);
        }
      }
      childrenCase_ = 2;
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.StatementSet statement_set = 2 [json_name = "statementSet"];</code>
     */
    public Builder clearStatementSet() {
      if (statementSetBuilder_ == null) {
        if (childrenCase_ == 2) {
          childrenCase_ = 0;
          children_ = null;
          onChanged();
        }
      } else {
        if (childrenCase_ == 2) {
          childrenCase_ = 0;
          children_ = null;
        }
        statementSetBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.StatementSet statement_set = 2 [json_name = "statementSet"];</code>
     */
    public com.anduril.entitymanager.v1.StatementSet.Builder getStatementSetBuilder() {
      return getStatementSetFieldBuilder().getBuilder();
    }
    /**
     * <code>.anduril.entitymanager.v1.StatementSet statement_set = 2 [json_name = "statementSet"];</code>
     */
    @java.lang.Override
    public com.anduril.entitymanager.v1.StatementSetOrBuilder getStatementSetOrBuilder() {
      if ((childrenCase_ == 2) && (statementSetBuilder_ != null)) {
        return statementSetBuilder_.getMessageOrBuilder();
      } else {
        if (childrenCase_ == 2) {
          return (com.anduril.entitymanager.v1.StatementSet) children_;
        }
        return com.anduril.entitymanager.v1.StatementSet.getDefaultInstance();
      }
    }
    /**
     * <code>.anduril.entitymanager.v1.StatementSet statement_set = 2 [json_name = "statementSet"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.StatementSet, com.anduril.entitymanager.v1.StatementSet.Builder, com.anduril.entitymanager.v1.StatementSetOrBuilder> 
        getStatementSetFieldBuilder() {
      if (statementSetBuilder_ == null) {
        if (!(childrenCase_ == 2)) {
          children_ = com.anduril.entitymanager.v1.StatementSet.getDefaultInstance();
        }
        statementSetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.entitymanager.v1.StatementSet, com.anduril.entitymanager.v1.StatementSet.Builder, com.anduril.entitymanager.v1.StatementSetOrBuilder>(
                (com.anduril.entitymanager.v1.StatementSet) children_,
                getParentForChildren(),
                isClean());
        children_ = null;
      }
      childrenCase_ = 2;
      onChanged();
      return statementSetBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.AndOperation)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.AndOperation)
  private static final com.anduril.entitymanager.v1.AndOperation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.AndOperation();
  }

  public static com.anduril.entitymanager.v1.AndOperation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AndOperation>
      PARSER = new com.google.protobuf.AbstractParser<AndOperation>() {
    @java.lang.Override
    public AndOperation parsePartialFrom(
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

  public static com.google.protobuf.Parser<AndOperation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AndOperation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.AndOperation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
