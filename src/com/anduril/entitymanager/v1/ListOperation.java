// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/filter.pub.proto

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * The ListOperation represents an operation against a proto list. If the list is of primitive proto
 * type (e.g. int32), paths in all child predicates should be left empty. If the list is of message
 * proto type (e.g. Sensor), paths in all child predicates should be relative to the list path.
 *
 * For example, the criteria "take an action if an entity has any sensor with sensor_id='sensor' and
 * OperationalState=STATE_OFF" would be modeled as:
 * Predicate1: { path: "sensor_id", comparator: EQUAL_TO, value: "sensor" }
 * Predicate2: { path: "operational_state", comparator: EQUAL_TO, value: STATE_OFF }
 *
 * Statement2: { AndOperation: PredicateSet: { &lt;Predicate1&gt;, &lt;Predicate2&gt; } }
 * ListOperation: { list_path: "sensors.sensors", list_comparator: ANY, statement: &lt;Statement2&gt; }
 * Statement1: { ListOperation: &lt;ListOperation&gt; }
 *
 * Note that in the above, the child predicates of the list operation have paths relative to the
 * list_path because the list is comprised of message not primitive types.
 * </pre>
 *
 * Protobuf type {@code anduril.entitymanager.v1.ListOperation}
 */
public final class ListOperation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.ListOperation)
    ListOperationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListOperation.newBuilder() to construct.
  private ListOperation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListOperation() {
    listPath_ = "";
    listComparator_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListOperation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.FilterPubProto.internal_static_anduril_entitymanager_v1_ListOperation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.FilterPubProto.internal_static_anduril_entitymanager_v1_ListOperation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.ListOperation.class, com.anduril.entitymanager.v1.ListOperation.Builder.class);
  }

  public static final int LIST_PATH_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object listPath_ = "";
  /**
   * <pre>
   * The list_path specifies the repeated field on an entity to which this operation applies.
   * </pre>
   *
   * <code>string list_path = 1 [json_name = "listPath"];</code>
   * @return The listPath.
   */
  @java.lang.Override
  public java.lang.String getListPath() {
    java.lang.Object ref = listPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      listPath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The list_path specifies the repeated field on an entity to which this operation applies.
   * </pre>
   *
   * <code>string list_path = 1 [json_name = "listPath"];</code>
   * @return The bytes for listPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getListPathBytes() {
    java.lang.Object ref = listPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      listPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LIST_COMPARATOR_FIELD_NUMBER = 2;
  private int listComparator_ = 0;
  /**
   * <pre>
   * The list_comparator specifies how to compose the boolean results from the child statement
   * for each member of the specified list.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.ListComparator list_comparator = 2 [json_name = "listComparator"];</code>
   * @return The enum numeric value on the wire for listComparator.
   */
  @java.lang.Override public int getListComparatorValue() {
    return listComparator_;
  }
  /**
   * <pre>
   * The list_comparator specifies how to compose the boolean results from the child statement
   * for each member of the specified list.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.ListComparator list_comparator = 2 [json_name = "listComparator"];</code>
   * @return The listComparator.
   */
  @java.lang.Override public com.anduril.entitymanager.v1.ListComparator getListComparator() {
    com.anduril.entitymanager.v1.ListComparator result = com.anduril.entitymanager.v1.ListComparator.forNumber(listComparator_);
    return result == null ? com.anduril.entitymanager.v1.ListComparator.UNRECOGNIZED : result;
  }

  public static final int STATEMENT_FIELD_NUMBER = 3;
  private com.anduril.entitymanager.v1.Statement statement_;
  /**
   * <pre>
   * The statement is a new expression tree conceptually rooted at type of the list. It determines
   * how each member of the list is evaluated.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Statement statement = 3 [json_name = "statement"];</code>
   * @return Whether the statement field is set.
   */
  @java.lang.Override
  public boolean hasStatement() {
    return statement_ != null;
  }
  /**
   * <pre>
   * The statement is a new expression tree conceptually rooted at type of the list. It determines
   * how each member of the list is evaluated.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Statement statement = 3 [json_name = "statement"];</code>
   * @return The statement.
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.Statement getStatement() {
    return statement_ == null ? com.anduril.entitymanager.v1.Statement.getDefaultInstance() : statement_;
  }
  /**
   * <pre>
   * The statement is a new expression tree conceptually rooted at type of the list. It determines
   * how each member of the list is evaluated.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Statement statement = 3 [json_name = "statement"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.StatementOrBuilder getStatementOrBuilder() {
    return statement_ == null ? com.anduril.entitymanager.v1.Statement.getDefaultInstance() : statement_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(listPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, listPath_);
    }
    if (listComparator_ != com.anduril.entitymanager.v1.ListComparator.LIST_COMPARATOR_INVALID.getNumber()) {
      output.writeEnum(2, listComparator_);
    }
    if (statement_ != null) {
      output.writeMessage(3, getStatement());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(listPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, listPath_);
    }
    if (listComparator_ != com.anduril.entitymanager.v1.ListComparator.LIST_COMPARATOR_INVALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, listComparator_);
    }
    if (statement_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getStatement());
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
    if (!(obj instanceof com.anduril.entitymanager.v1.ListOperation)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.ListOperation other = (com.anduril.entitymanager.v1.ListOperation) obj;

    if (!getListPath()
        .equals(other.getListPath())) return false;
    if (listComparator_ != other.listComparator_) return false;
    if (hasStatement() != other.hasStatement()) return false;
    if (hasStatement()) {
      if (!getStatement()
          .equals(other.getStatement())) return false;
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
    hash = (37 * hash) + LIST_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getListPath().hashCode();
    hash = (37 * hash) + LIST_COMPARATOR_FIELD_NUMBER;
    hash = (53 * hash) + listComparator_;
    if (hasStatement()) {
      hash = (37 * hash) + STATEMENT_FIELD_NUMBER;
      hash = (53 * hash) + getStatement().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.ListOperation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.ListOperation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.ListOperation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.ListOperation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.ListOperation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.ListOperation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.ListOperation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.ListOperation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.ListOperation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.ListOperation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.ListOperation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.ListOperation parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.ListOperation prototype) {
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
   * The ListOperation represents an operation against a proto list. If the list is of primitive proto
   * type (e.g. int32), paths in all child predicates should be left empty. If the list is of message
   * proto type (e.g. Sensor), paths in all child predicates should be relative to the list path.
   *
   * For example, the criteria "take an action if an entity has any sensor with sensor_id='sensor' and
   * OperationalState=STATE_OFF" would be modeled as:
   * Predicate1: { path: "sensor_id", comparator: EQUAL_TO, value: "sensor" }
   * Predicate2: { path: "operational_state", comparator: EQUAL_TO, value: STATE_OFF }
   *
   * Statement2: { AndOperation: PredicateSet: { &lt;Predicate1&gt;, &lt;Predicate2&gt; } }
   * ListOperation: { list_path: "sensors.sensors", list_comparator: ANY, statement: &lt;Statement2&gt; }
   * Statement1: { ListOperation: &lt;ListOperation&gt; }
   *
   * Note that in the above, the child predicates of the list operation have paths relative to the
   * list_path because the list is comprised of message not primitive types.
   * </pre>
   *
   * Protobuf type {@code anduril.entitymanager.v1.ListOperation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.ListOperation)
      com.anduril.entitymanager.v1.ListOperationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.FilterPubProto.internal_static_anduril_entitymanager_v1_ListOperation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.FilterPubProto.internal_static_anduril_entitymanager_v1_ListOperation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.ListOperation.class, com.anduril.entitymanager.v1.ListOperation.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.ListOperation.newBuilder()
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
      listPath_ = "";
      listComparator_ = 0;
      statement_ = null;
      if (statementBuilder_ != null) {
        statementBuilder_.dispose();
        statementBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.FilterPubProto.internal_static_anduril_entitymanager_v1_ListOperation_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.ListOperation getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.ListOperation.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.ListOperation build() {
      com.anduril.entitymanager.v1.ListOperation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.ListOperation buildPartial() {
      com.anduril.entitymanager.v1.ListOperation result = new com.anduril.entitymanager.v1.ListOperation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.entitymanager.v1.ListOperation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.listPath_ = listPath_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.listComparator_ = listComparator_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.statement_ = statementBuilder_ == null
            ? statement_
            : statementBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entitymanager.v1.ListOperation) {
        return mergeFrom((com.anduril.entitymanager.v1.ListOperation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.ListOperation other) {
      if (other == com.anduril.entitymanager.v1.ListOperation.getDefaultInstance()) return this;
      if (!other.getListPath().isEmpty()) {
        listPath_ = other.listPath_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.listComparator_ != 0) {
        setListComparatorValue(other.getListComparatorValue());
      }
      if (other.hasStatement()) {
        mergeStatement(other.getStatement());
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
              listPath_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              listComparator_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getStatementFieldBuilder().getBuilder(),
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

    private java.lang.Object listPath_ = "";
    /**
     * <pre>
     * The list_path specifies the repeated field on an entity to which this operation applies.
     * </pre>
     *
     * <code>string list_path = 1 [json_name = "listPath"];</code>
     * @return The listPath.
     */
    public java.lang.String getListPath() {
      java.lang.Object ref = listPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        listPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The list_path specifies the repeated field on an entity to which this operation applies.
     * </pre>
     *
     * <code>string list_path = 1 [json_name = "listPath"];</code>
     * @return The bytes for listPath.
     */
    public com.google.protobuf.ByteString
        getListPathBytes() {
      java.lang.Object ref = listPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        listPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The list_path specifies the repeated field on an entity to which this operation applies.
     * </pre>
     *
     * <code>string list_path = 1 [json_name = "listPath"];</code>
     * @param value The listPath to set.
     * @return This builder for chaining.
     */
    public Builder setListPath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      listPath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list_path specifies the repeated field on an entity to which this operation applies.
     * </pre>
     *
     * <code>string list_path = 1 [json_name = "listPath"];</code>
     * @return This builder for chaining.
     */
    public Builder clearListPath() {
      listPath_ = getDefaultInstance().getListPath();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list_path specifies the repeated field on an entity to which this operation applies.
     * </pre>
     *
     * <code>string list_path = 1 [json_name = "listPath"];</code>
     * @param value The bytes for listPath to set.
     * @return This builder for chaining.
     */
    public Builder setListPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      listPath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int listComparator_ = 0;
    /**
     * <pre>
     * The list_comparator specifies how to compose the boolean results from the child statement
     * for each member of the specified list.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.ListComparator list_comparator = 2 [json_name = "listComparator"];</code>
     * @return The enum numeric value on the wire for listComparator.
     */
    @java.lang.Override public int getListComparatorValue() {
      return listComparator_;
    }
    /**
     * <pre>
     * The list_comparator specifies how to compose the boolean results from the child statement
     * for each member of the specified list.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.ListComparator list_comparator = 2 [json_name = "listComparator"];</code>
     * @param value The enum numeric value on the wire for listComparator to set.
     * @return This builder for chaining.
     */
    public Builder setListComparatorValue(int value) {
      listComparator_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list_comparator specifies how to compose the boolean results from the child statement
     * for each member of the specified list.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.ListComparator list_comparator = 2 [json_name = "listComparator"];</code>
     * @return The listComparator.
     */
    @java.lang.Override
    public com.anduril.entitymanager.v1.ListComparator getListComparator() {
      com.anduril.entitymanager.v1.ListComparator result = com.anduril.entitymanager.v1.ListComparator.forNumber(listComparator_);
      return result == null ? com.anduril.entitymanager.v1.ListComparator.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The list_comparator specifies how to compose the boolean results from the child statement
     * for each member of the specified list.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.ListComparator list_comparator = 2 [json_name = "listComparator"];</code>
     * @param value The listComparator to set.
     * @return This builder for chaining.
     */
    public Builder setListComparator(com.anduril.entitymanager.v1.ListComparator value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      listComparator_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list_comparator specifies how to compose the boolean results from the child statement
     * for each member of the specified list.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.ListComparator list_comparator = 2 [json_name = "listComparator"];</code>
     * @return This builder for chaining.
     */
    public Builder clearListComparator() {
      bitField0_ = (bitField0_ & ~0x00000002);
      listComparator_ = 0;
      onChanged();
      return this;
    }

    private com.anduril.entitymanager.v1.Statement statement_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Statement, com.anduril.entitymanager.v1.Statement.Builder, com.anduril.entitymanager.v1.StatementOrBuilder> statementBuilder_;
    /**
     * <pre>
     * The statement is a new expression tree conceptually rooted at type of the list. It determines
     * how each member of the list is evaluated.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Statement statement = 3 [json_name = "statement"];</code>
     * @return Whether the statement field is set.
     */
    public boolean hasStatement() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The statement is a new expression tree conceptually rooted at type of the list. It determines
     * how each member of the list is evaluated.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Statement statement = 3 [json_name = "statement"];</code>
     * @return The statement.
     */
    public com.anduril.entitymanager.v1.Statement getStatement() {
      if (statementBuilder_ == null) {
        return statement_ == null ? com.anduril.entitymanager.v1.Statement.getDefaultInstance() : statement_;
      } else {
        return statementBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The statement is a new expression tree conceptually rooted at type of the list. It determines
     * how each member of the list is evaluated.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Statement statement = 3 [json_name = "statement"];</code>
     */
    public Builder setStatement(com.anduril.entitymanager.v1.Statement value) {
      if (statementBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        statement_ = value;
      } else {
        statementBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The statement is a new expression tree conceptually rooted at type of the list. It determines
     * how each member of the list is evaluated.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Statement statement = 3 [json_name = "statement"];</code>
     */
    public Builder setStatement(
        com.anduril.entitymanager.v1.Statement.Builder builderForValue) {
      if (statementBuilder_ == null) {
        statement_ = builderForValue.build();
      } else {
        statementBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The statement is a new expression tree conceptually rooted at type of the list. It determines
     * how each member of the list is evaluated.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Statement statement = 3 [json_name = "statement"];</code>
     */
    public Builder mergeStatement(com.anduril.entitymanager.v1.Statement value) {
      if (statementBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          statement_ != null &&
          statement_ != com.anduril.entitymanager.v1.Statement.getDefaultInstance()) {
          getStatementBuilder().mergeFrom(value);
        } else {
          statement_ = value;
        }
      } else {
        statementBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The statement is a new expression tree conceptually rooted at type of the list. It determines
     * how each member of the list is evaluated.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Statement statement = 3 [json_name = "statement"];</code>
     */
    public Builder clearStatement() {
      bitField0_ = (bitField0_ & ~0x00000004);
      statement_ = null;
      if (statementBuilder_ != null) {
        statementBuilder_.dispose();
        statementBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The statement is a new expression tree conceptually rooted at type of the list. It determines
     * how each member of the list is evaluated.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Statement statement = 3 [json_name = "statement"];</code>
     */
    public com.anduril.entitymanager.v1.Statement.Builder getStatementBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getStatementFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The statement is a new expression tree conceptually rooted at type of the list. It determines
     * how each member of the list is evaluated.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Statement statement = 3 [json_name = "statement"];</code>
     */
    public com.anduril.entitymanager.v1.StatementOrBuilder getStatementOrBuilder() {
      if (statementBuilder_ != null) {
        return statementBuilder_.getMessageOrBuilder();
      } else {
        return statement_ == null ?
            com.anduril.entitymanager.v1.Statement.getDefaultInstance() : statement_;
      }
    }
    /**
     * <pre>
     * The statement is a new expression tree conceptually rooted at type of the list. It determines
     * how each member of the list is evaluated.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Statement statement = 3 [json_name = "statement"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Statement, com.anduril.entitymanager.v1.Statement.Builder, com.anduril.entitymanager.v1.StatementOrBuilder> 
        getStatementFieldBuilder() {
      if (statementBuilder_ == null) {
        statementBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.entitymanager.v1.Statement, com.anduril.entitymanager.v1.Statement.Builder, com.anduril.entitymanager.v1.StatementOrBuilder>(
                getStatement(),
                getParentForChildren(),
                isClean());
        statement_ = null;
      }
      return statementBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.ListOperation)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.ListOperation)
  private static final com.anduril.entitymanager.v1.ListOperation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.ListOperation();
  }

  public static com.anduril.entitymanager.v1.ListOperation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListOperation>
      PARSER = new com.google.protobuf.AbstractParser<ListOperation>() {
    @java.lang.Override
    public ListOperation parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListOperation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListOperation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.ListOperation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

