// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/filter.pub.proto

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * The Predicate fully encodes the information required to make an evaluation of an entity field
 * against a given static value, resulting in a boolean TRUE/FALSE result. The structure of a
 * predicate will always follow: "{entity-value} {comparator} {fixed-value}" where the entity value
 * is determined by the field path.
 *
 * For example, a predicate would read as: "{entity.location.velocity_enu} {LESS_THAN} {500kph}"
 * </pre>
 *
 * Protobuf type {@code anduril.entitymanager.v1.Predicate}
 */
public final class Predicate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.Predicate)
    PredicateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Predicate.newBuilder() to construct.
  private Predicate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Predicate() {
    fieldPath_ = "";
    comparator_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Predicate();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.FilterPubProto.internal_static_anduril_entitymanager_v1_Predicate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.FilterPubProto.internal_static_anduril_entitymanager_v1_Predicate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.Predicate.class, com.anduril.entitymanager.v1.Predicate.Builder.class);
  }

  public static final int FIELD_PATH_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fieldPath_ = "";
  /**
   * <pre>
   * The field_path determines which field on an entity is being referenced in this predicate. For
   * example: correlated.primary_entity_id would be primary_entity_id in correlated component.
   * </pre>
   *
   * <code>string field_path = 1 [json_name = "fieldPath"];</code>
   * @return The fieldPath.
   */
  @java.lang.Override
  public java.lang.String getFieldPath() {
    java.lang.Object ref = fieldPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fieldPath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The field_path determines which field on an entity is being referenced in this predicate. For
   * example: correlated.primary_entity_id would be primary_entity_id in correlated component.
   * </pre>
   *
   * <code>string field_path = 1 [json_name = "fieldPath"];</code>
   * @return The bytes for fieldPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFieldPathBytes() {
    java.lang.Object ref = fieldPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fieldPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private com.anduril.entitymanager.v1.Value value_;
  /**
   * <pre>
   * The value determines the fixed value against which the entity field is to be compared.
   * In the case of COMPARATOR_MATCH_ALL, the value contents do not matter as long as the Value is a supported
   * type.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Value value = 2 [json_name = "value"];</code>
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return value_ != null;
  }
  /**
   * <pre>
   * The value determines the fixed value against which the entity field is to be compared.
   * In the case of COMPARATOR_MATCH_ALL, the value contents do not matter as long as the Value is a supported
   * type.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Value value = 2 [json_name = "value"];</code>
   * @return The value.
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.Value getValue() {
    return value_ == null ? com.anduril.entitymanager.v1.Value.getDefaultInstance() : value_;
  }
  /**
   * <pre>
   * The value determines the fixed value against which the entity field is to be compared.
   * In the case of COMPARATOR_MATCH_ALL, the value contents do not matter as long as the Value is a supported
   * type.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Value value = 2 [json_name = "value"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.ValueOrBuilder getValueOrBuilder() {
    return value_ == null ? com.anduril.entitymanager.v1.Value.getDefaultInstance() : value_;
  }

  public static final int COMPARATOR_FIELD_NUMBER = 3;
  private int comparator_ = 0;
  /**
   * <pre>
   * The comparator determines the manner in which the entity field and static value are compared.
   * Comparators may only be applied to certain values. For example, the WITHIN comparator cannot
   * be used for a boolean value comparison.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Comparator comparator = 3 [json_name = "comparator"];</code>
   * @return The enum numeric value on the wire for comparator.
   */
  @java.lang.Override public int getComparatorValue() {
    return comparator_;
  }
  /**
   * <pre>
   * The comparator determines the manner in which the entity field and static value are compared.
   * Comparators may only be applied to certain values. For example, the WITHIN comparator cannot
   * be used for a boolean value comparison.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Comparator comparator = 3 [json_name = "comparator"];</code>
   * @return The comparator.
   */
  @java.lang.Override public com.anduril.entitymanager.v1.Comparator getComparator() {
    com.anduril.entitymanager.v1.Comparator result = com.anduril.entitymanager.v1.Comparator.forNumber(comparator_);
    return result == null ? com.anduril.entitymanager.v1.Comparator.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fieldPath_);
    }
    if (value_ != null) {
      output.writeMessage(2, getValue());
    }
    if (comparator_ != com.anduril.entitymanager.v1.Comparator.COMPARATOR_INVALID.getNumber()) {
      output.writeEnum(3, comparator_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fieldPath_);
    }
    if (value_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getValue());
    }
    if (comparator_ != com.anduril.entitymanager.v1.Comparator.COMPARATOR_INVALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, comparator_);
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
    if (!(obj instanceof com.anduril.entitymanager.v1.Predicate)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.Predicate other = (com.anduril.entitymanager.v1.Predicate) obj;

    if (!getFieldPath()
        .equals(other.getFieldPath())) return false;
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue()
          .equals(other.getValue())) return false;
    }
    if (comparator_ != other.comparator_) return false;
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
    hash = (37 * hash) + FIELD_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getFieldPath().hashCode();
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    hash = (37 * hash) + COMPARATOR_FIELD_NUMBER;
    hash = (53 * hash) + comparator_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.Predicate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.Predicate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Predicate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.Predicate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Predicate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.Predicate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Predicate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.Predicate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Predicate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.Predicate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Predicate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.Predicate parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.Predicate prototype) {
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
   * The Predicate fully encodes the information required to make an evaluation of an entity field
   * against a given static value, resulting in a boolean TRUE/FALSE result. The structure of a
   * predicate will always follow: "{entity-value} {comparator} {fixed-value}" where the entity value
   * is determined by the field path.
   *
   * For example, a predicate would read as: "{entity.location.velocity_enu} {LESS_THAN} {500kph}"
   * </pre>
   *
   * Protobuf type {@code anduril.entitymanager.v1.Predicate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.Predicate)
      com.anduril.entitymanager.v1.PredicateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.FilterPubProto.internal_static_anduril_entitymanager_v1_Predicate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.FilterPubProto.internal_static_anduril_entitymanager_v1_Predicate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.Predicate.class, com.anduril.entitymanager.v1.Predicate.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.Predicate.newBuilder()
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
      fieldPath_ = "";
      value_ = null;
      if (valueBuilder_ != null) {
        valueBuilder_.dispose();
        valueBuilder_ = null;
      }
      comparator_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.FilterPubProto.internal_static_anduril_entitymanager_v1_Predicate_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.Predicate getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.Predicate.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.Predicate build() {
      com.anduril.entitymanager.v1.Predicate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.Predicate buildPartial() {
      com.anduril.entitymanager.v1.Predicate result = new com.anduril.entitymanager.v1.Predicate(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.entitymanager.v1.Predicate result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fieldPath_ = fieldPath_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.value_ = valueBuilder_ == null
            ? value_
            : valueBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.comparator_ = comparator_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entitymanager.v1.Predicate) {
        return mergeFrom((com.anduril.entitymanager.v1.Predicate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.Predicate other) {
      if (other == com.anduril.entitymanager.v1.Predicate.getDefaultInstance()) return this;
      if (!other.getFieldPath().isEmpty()) {
        fieldPath_ = other.fieldPath_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasValue()) {
        mergeValue(other.getValue());
      }
      if (other.comparator_ != 0) {
        setComparatorValue(other.getComparatorValue());
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
              fieldPath_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getValueFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              comparator_ = input.readEnum();
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
    private int bitField0_;

    private java.lang.Object fieldPath_ = "";
    /**
     * <pre>
     * The field_path determines which field on an entity is being referenced in this predicate. For
     * example: correlated.primary_entity_id would be primary_entity_id in correlated component.
     * </pre>
     *
     * <code>string field_path = 1 [json_name = "fieldPath"];</code>
     * @return The fieldPath.
     */
    public java.lang.String getFieldPath() {
      java.lang.Object ref = fieldPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fieldPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The field_path determines which field on an entity is being referenced in this predicate. For
     * example: correlated.primary_entity_id would be primary_entity_id in correlated component.
     * </pre>
     *
     * <code>string field_path = 1 [json_name = "fieldPath"];</code>
     * @return The bytes for fieldPath.
     */
    public com.google.protobuf.ByteString
        getFieldPathBytes() {
      java.lang.Object ref = fieldPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fieldPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The field_path determines which field on an entity is being referenced in this predicate. For
     * example: correlated.primary_entity_id would be primary_entity_id in correlated component.
     * </pre>
     *
     * <code>string field_path = 1 [json_name = "fieldPath"];</code>
     * @param value The fieldPath to set.
     * @return This builder for chaining.
     */
    public Builder setFieldPath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fieldPath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The field_path determines which field on an entity is being referenced in this predicate. For
     * example: correlated.primary_entity_id would be primary_entity_id in correlated component.
     * </pre>
     *
     * <code>string field_path = 1 [json_name = "fieldPath"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFieldPath() {
      fieldPath_ = getDefaultInstance().getFieldPath();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The field_path determines which field on an entity is being referenced in this predicate. For
     * example: correlated.primary_entity_id would be primary_entity_id in correlated component.
     * </pre>
     *
     * <code>string field_path = 1 [json_name = "fieldPath"];</code>
     * @param value The bytes for fieldPath to set.
     * @return This builder for chaining.
     */
    public Builder setFieldPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fieldPath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.anduril.entitymanager.v1.Value value_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Value, com.anduril.entitymanager.v1.Value.Builder, com.anduril.entitymanager.v1.ValueOrBuilder> valueBuilder_;
    /**
     * <pre>
     * The value determines the fixed value against which the entity field is to be compared.
     * In the case of COMPARATOR_MATCH_ALL, the value contents do not matter as long as the Value is a supported
     * type.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Value value = 2 [json_name = "value"];</code>
     * @return Whether the value field is set.
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The value determines the fixed value against which the entity field is to be compared.
     * In the case of COMPARATOR_MATCH_ALL, the value contents do not matter as long as the Value is a supported
     * type.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Value value = 2 [json_name = "value"];</code>
     * @return The value.
     */
    public com.anduril.entitymanager.v1.Value getValue() {
      if (valueBuilder_ == null) {
        return value_ == null ? com.anduril.entitymanager.v1.Value.getDefaultInstance() : value_;
      } else {
        return valueBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The value determines the fixed value against which the entity field is to be compared.
     * In the case of COMPARATOR_MATCH_ALL, the value contents do not matter as long as the Value is a supported
     * type.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Value value = 2 [json_name = "value"];</code>
     */
    public Builder setValue(com.anduril.entitymanager.v1.Value value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
      } else {
        valueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The value determines the fixed value against which the entity field is to be compared.
     * In the case of COMPARATOR_MATCH_ALL, the value contents do not matter as long as the Value is a supported
     * type.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Value value = 2 [json_name = "value"];</code>
     */
    public Builder setValue(
        com.anduril.entitymanager.v1.Value.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The value determines the fixed value against which the entity field is to be compared.
     * In the case of COMPARATOR_MATCH_ALL, the value contents do not matter as long as the Value is a supported
     * type.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Value value = 2 [json_name = "value"];</code>
     */
    public Builder mergeValue(com.anduril.entitymanager.v1.Value value) {
      if (valueBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          value_ != null &&
          value_ != com.anduril.entitymanager.v1.Value.getDefaultInstance()) {
          getValueBuilder().mergeFrom(value);
        } else {
          value_ = value;
        }
      } else {
        valueBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The value determines the fixed value against which the entity field is to be compared.
     * In the case of COMPARATOR_MATCH_ALL, the value contents do not matter as long as the Value is a supported
     * type.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Value value = 2 [json_name = "value"];</code>
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000002);
      value_ = null;
      if (valueBuilder_ != null) {
        valueBuilder_.dispose();
        valueBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The value determines the fixed value against which the entity field is to be compared.
     * In the case of COMPARATOR_MATCH_ALL, the value contents do not matter as long as the Value is a supported
     * type.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Value value = 2 [json_name = "value"];</code>
     */
    public com.anduril.entitymanager.v1.Value.Builder getValueBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getValueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The value determines the fixed value against which the entity field is to be compared.
     * In the case of COMPARATOR_MATCH_ALL, the value contents do not matter as long as the Value is a supported
     * type.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Value value = 2 [json_name = "value"];</code>
     */
    public com.anduril.entitymanager.v1.ValueOrBuilder getValueOrBuilder() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        return value_ == null ?
            com.anduril.entitymanager.v1.Value.getDefaultInstance() : value_;
      }
    }
    /**
     * <pre>
     * The value determines the fixed value against which the entity field is to be compared.
     * In the case of COMPARATOR_MATCH_ALL, the value contents do not matter as long as the Value is a supported
     * type.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Value value = 2 [json_name = "value"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Value, com.anduril.entitymanager.v1.Value.Builder, com.anduril.entitymanager.v1.ValueOrBuilder> 
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.entitymanager.v1.Value, com.anduril.entitymanager.v1.Value.Builder, com.anduril.entitymanager.v1.ValueOrBuilder>(
                getValue(),
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      return valueBuilder_;
    }

    private int comparator_ = 0;
    /**
     * <pre>
     * The comparator determines the manner in which the entity field and static value are compared.
     * Comparators may only be applied to certain values. For example, the WITHIN comparator cannot
     * be used for a boolean value comparison.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Comparator comparator = 3 [json_name = "comparator"];</code>
     * @return The enum numeric value on the wire for comparator.
     */
    @java.lang.Override public int getComparatorValue() {
      return comparator_;
    }
    /**
     * <pre>
     * The comparator determines the manner in which the entity field and static value are compared.
     * Comparators may only be applied to certain values. For example, the WITHIN comparator cannot
     * be used for a boolean value comparison.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Comparator comparator = 3 [json_name = "comparator"];</code>
     * @param value The enum numeric value on the wire for comparator to set.
     * @return This builder for chaining.
     */
    public Builder setComparatorValue(int value) {
      comparator_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The comparator determines the manner in which the entity field and static value are compared.
     * Comparators may only be applied to certain values. For example, the WITHIN comparator cannot
     * be used for a boolean value comparison.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Comparator comparator = 3 [json_name = "comparator"];</code>
     * @return The comparator.
     */
    @java.lang.Override
    public com.anduril.entitymanager.v1.Comparator getComparator() {
      com.anduril.entitymanager.v1.Comparator result = com.anduril.entitymanager.v1.Comparator.forNumber(comparator_);
      return result == null ? com.anduril.entitymanager.v1.Comparator.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The comparator determines the manner in which the entity field and static value are compared.
     * Comparators may only be applied to certain values. For example, the WITHIN comparator cannot
     * be used for a boolean value comparison.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Comparator comparator = 3 [json_name = "comparator"];</code>
     * @param value The comparator to set.
     * @return This builder for chaining.
     */
    public Builder setComparator(com.anduril.entitymanager.v1.Comparator value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      comparator_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The comparator determines the manner in which the entity field and static value are compared.
     * Comparators may only be applied to certain values. For example, the WITHIN comparator cannot
     * be used for a boolean value comparison.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Comparator comparator = 3 [json_name = "comparator"];</code>
     * @return This builder for chaining.
     */
    public Builder clearComparator() {
      bitField0_ = (bitField0_ & ~0x00000004);
      comparator_ = 0;
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


    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.Predicate)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.Predicate)
  private static final com.anduril.entitymanager.v1.Predicate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.Predicate();
  }

  public static com.anduril.entitymanager.v1.Predicate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Predicate>
      PARSER = new com.google.protobuf.AbstractParser<Predicate>() {
    @java.lang.Override
    public Predicate parsePartialFrom(
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

  public static com.google.protobuf.Parser<Predicate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Predicate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.Predicate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

