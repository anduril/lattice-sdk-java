// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/ontology/v1/type.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.ontology.v1;

/**
 * <pre>
 * An ObjectType describes the type of object within the ontology and its disposition.
 * </pre>
 *
 * Protobuf type {@code anduril.ontology.v1.ObjectType}
 */
public final class ObjectType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.ontology.v1.ObjectType)
    ObjectTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ObjectType.newBuilder() to construct.
  private ObjectType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ObjectType() {
    class__ = 0;
    disposition_ = 0;
    environment_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ObjectType();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.ontology.v1.TypePubProto.internal_static_anduril_ontology_v1_ObjectType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.ontology.v1.TypePubProto.internal_static_anduril_ontology_v1_ObjectType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.ontology.v1.ObjectType.class, com.anduril.ontology.v1.ObjectType.Builder.class);
  }

  public static final int CLASS_FIELD_NUMBER = 1;
  private int class__ = 0;
  /**
   * <code>.anduril.ontology.v1.Class class = 1 [json_name = "class"];</code>
   * @return The enum numeric value on the wire for class.
   */
  @java.lang.Override public int getClass_Value() {
    return class__;
  }
  /**
   * <code>.anduril.ontology.v1.Class class = 1 [json_name = "class"];</code>
   * @return The class.
   */
  @java.lang.Override public com.anduril.ontology.v1.Class getClass_() {
    com.anduril.ontology.v1.Class result = com.anduril.ontology.v1.Class.forNumber(class__);
    return result == null ? com.anduril.ontology.v1.Class.UNRECOGNIZED : result;
  }

  public static final int DISPOSITION_FIELD_NUMBER = 2;
  private int disposition_ = 0;
  /**
   * <code>.anduril.ontology.v1.Disposition disposition = 2 [json_name = "disposition"];</code>
   * @return The enum numeric value on the wire for disposition.
   */
  @java.lang.Override public int getDispositionValue() {
    return disposition_;
  }
  /**
   * <code>.anduril.ontology.v1.Disposition disposition = 2 [json_name = "disposition"];</code>
   * @return The disposition.
   */
  @java.lang.Override public com.anduril.ontology.v1.Disposition getDisposition() {
    com.anduril.ontology.v1.Disposition result = com.anduril.ontology.v1.Disposition.forNumber(disposition_);
    return result == null ? com.anduril.ontology.v1.Disposition.UNRECOGNIZED : result;
  }

  public static final int ENVIRONMENT_FIELD_NUMBER = 3;
  private int environment_ = 0;
  /**
   * <code>.anduril.ontology.v1.Environment environment = 3 [json_name = "environment"];</code>
   * @return The enum numeric value on the wire for environment.
   */
  @java.lang.Override public int getEnvironmentValue() {
    return environment_;
  }
  /**
   * <code>.anduril.ontology.v1.Environment environment = 3 [json_name = "environment"];</code>
   * @return The environment.
   */
  @java.lang.Override public com.anduril.ontology.v1.Environment getEnvironment() {
    com.anduril.ontology.v1.Environment result = com.anduril.ontology.v1.Environment.forNumber(environment_);
    return result == null ? com.anduril.ontology.v1.Environment.UNRECOGNIZED : result;
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
    if (class__ != com.anduril.ontology.v1.Class.CLASS_UNKNOWN.getNumber()) {
      output.writeEnum(1, class__);
    }
    if (disposition_ != com.anduril.ontology.v1.Disposition.DISPOSITION_UNKNOWN.getNumber()) {
      output.writeEnum(2, disposition_);
    }
    if (environment_ != com.anduril.ontology.v1.Environment.ENVIRONMENT_UNKNOWN.getNumber()) {
      output.writeEnum(3, environment_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (class__ != com.anduril.ontology.v1.Class.CLASS_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, class__);
    }
    if (disposition_ != com.anduril.ontology.v1.Disposition.DISPOSITION_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, disposition_);
    }
    if (environment_ != com.anduril.ontology.v1.Environment.ENVIRONMENT_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, environment_);
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
    if (!(obj instanceof com.anduril.ontology.v1.ObjectType)) {
      return super.equals(obj);
    }
    com.anduril.ontology.v1.ObjectType other = (com.anduril.ontology.v1.ObjectType) obj;

    if (class__ != other.class__) return false;
    if (disposition_ != other.disposition_) return false;
    if (environment_ != other.environment_) return false;
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
    hash = (37 * hash) + CLASS_FIELD_NUMBER;
    hash = (53 * hash) + class__;
    hash = (37 * hash) + DISPOSITION_FIELD_NUMBER;
    hash = (53 * hash) + disposition_;
    hash = (37 * hash) + ENVIRONMENT_FIELD_NUMBER;
    hash = (53 * hash) + environment_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.ontology.v1.ObjectType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.ontology.v1.ObjectType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.ontology.v1.ObjectType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.ontology.v1.ObjectType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.ontology.v1.ObjectType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.ontology.v1.ObjectType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.ontology.v1.ObjectType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.ontology.v1.ObjectType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.ontology.v1.ObjectType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.ontology.v1.ObjectType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.ontology.v1.ObjectType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.ontology.v1.ObjectType parseFrom(
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
  public static Builder newBuilder(com.anduril.ontology.v1.ObjectType prototype) {
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
   * An ObjectType describes the type of object within the ontology and its disposition.
   * </pre>
   *
   * Protobuf type {@code anduril.ontology.v1.ObjectType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.ontology.v1.ObjectType)
      com.anduril.ontology.v1.ObjectTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.ontology.v1.TypePubProto.internal_static_anduril_ontology_v1_ObjectType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.ontology.v1.TypePubProto.internal_static_anduril_ontology_v1_ObjectType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.ontology.v1.ObjectType.class, com.anduril.ontology.v1.ObjectType.Builder.class);
    }

    // Construct using com.anduril.ontology.v1.ObjectType.newBuilder()
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
      class__ = 0;
      disposition_ = 0;
      environment_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.ontology.v1.TypePubProto.internal_static_anduril_ontology_v1_ObjectType_descriptor;
    }

    @java.lang.Override
    public com.anduril.ontology.v1.ObjectType getDefaultInstanceForType() {
      return com.anduril.ontology.v1.ObjectType.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.ontology.v1.ObjectType build() {
      com.anduril.ontology.v1.ObjectType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.ontology.v1.ObjectType buildPartial() {
      com.anduril.ontology.v1.ObjectType result = new com.anduril.ontology.v1.ObjectType(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.ontology.v1.ObjectType result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.class__ = class__;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.disposition_ = disposition_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.environment_ = environment_;
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
      if (other instanceof com.anduril.ontology.v1.ObjectType) {
        return mergeFrom((com.anduril.ontology.v1.ObjectType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.ontology.v1.ObjectType other) {
      if (other == com.anduril.ontology.v1.ObjectType.getDefaultInstance()) return this;
      if (other.class__ != 0) {
        setClass_Value(other.getClass_Value());
      }
      if (other.disposition_ != 0) {
        setDispositionValue(other.getDispositionValue());
      }
      if (other.environment_ != 0) {
        setEnvironmentValue(other.getEnvironmentValue());
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
            case 8: {
              class__ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              disposition_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              environment_ = input.readEnum();
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

    private int class__ = 0;
    /**
     * <code>.anduril.ontology.v1.Class class = 1 [json_name = "class"];</code>
     * @return The enum numeric value on the wire for class.
     */
    @java.lang.Override public int getClass_Value() {
      return class__;
    }
    /**
     * <code>.anduril.ontology.v1.Class class = 1 [json_name = "class"];</code>
     * @param value The enum numeric value on the wire for class to set.
     * @return This builder for chaining.
     */
    public Builder setClass_Value(int value) {
      class__ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.ontology.v1.Class class = 1 [json_name = "class"];</code>
     * @return The class.
     */
    @java.lang.Override
    public com.anduril.ontology.v1.Class getClass_() {
      com.anduril.ontology.v1.Class result = com.anduril.ontology.v1.Class.forNumber(class__);
      return result == null ? com.anduril.ontology.v1.Class.UNRECOGNIZED : result;
    }
    /**
     * <code>.anduril.ontology.v1.Class class = 1 [json_name = "class"];</code>
     * @param value The class to set.
     * @return This builder for chaining.
     */
    public Builder setClass_(com.anduril.ontology.v1.Class value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      class__ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.ontology.v1.Class class = 1 [json_name = "class"];</code>
     * @return This builder for chaining.
     */
    public Builder clearClass_() {
      bitField0_ = (bitField0_ & ~0x00000001);
      class__ = 0;
      onChanged();
      return this;
    }

    private int disposition_ = 0;
    /**
     * <code>.anduril.ontology.v1.Disposition disposition = 2 [json_name = "disposition"];</code>
     * @return The enum numeric value on the wire for disposition.
     */
    @java.lang.Override public int getDispositionValue() {
      return disposition_;
    }
    /**
     * <code>.anduril.ontology.v1.Disposition disposition = 2 [json_name = "disposition"];</code>
     * @param value The enum numeric value on the wire for disposition to set.
     * @return This builder for chaining.
     */
    public Builder setDispositionValue(int value) {
      disposition_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.ontology.v1.Disposition disposition = 2 [json_name = "disposition"];</code>
     * @return The disposition.
     */
    @java.lang.Override
    public com.anduril.ontology.v1.Disposition getDisposition() {
      com.anduril.ontology.v1.Disposition result = com.anduril.ontology.v1.Disposition.forNumber(disposition_);
      return result == null ? com.anduril.ontology.v1.Disposition.UNRECOGNIZED : result;
    }
    /**
     * <code>.anduril.ontology.v1.Disposition disposition = 2 [json_name = "disposition"];</code>
     * @param value The disposition to set.
     * @return This builder for chaining.
     */
    public Builder setDisposition(com.anduril.ontology.v1.Disposition value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      disposition_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.ontology.v1.Disposition disposition = 2 [json_name = "disposition"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDisposition() {
      bitField0_ = (bitField0_ & ~0x00000002);
      disposition_ = 0;
      onChanged();
      return this;
    }

    private int environment_ = 0;
    /**
     * <code>.anduril.ontology.v1.Environment environment = 3 [json_name = "environment"];</code>
     * @return The enum numeric value on the wire for environment.
     */
    @java.lang.Override public int getEnvironmentValue() {
      return environment_;
    }
    /**
     * <code>.anduril.ontology.v1.Environment environment = 3 [json_name = "environment"];</code>
     * @param value The enum numeric value on the wire for environment to set.
     * @return This builder for chaining.
     */
    public Builder setEnvironmentValue(int value) {
      environment_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.ontology.v1.Environment environment = 3 [json_name = "environment"];</code>
     * @return The environment.
     */
    @java.lang.Override
    public com.anduril.ontology.v1.Environment getEnvironment() {
      com.anduril.ontology.v1.Environment result = com.anduril.ontology.v1.Environment.forNumber(environment_);
      return result == null ? com.anduril.ontology.v1.Environment.UNRECOGNIZED : result;
    }
    /**
     * <code>.anduril.ontology.v1.Environment environment = 3 [json_name = "environment"];</code>
     * @param value The environment to set.
     * @return This builder for chaining.
     */
    public Builder setEnvironment(com.anduril.ontology.v1.Environment value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      environment_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.ontology.v1.Environment environment = 3 [json_name = "environment"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEnvironment() {
      bitField0_ = (bitField0_ & ~0x00000004);
      environment_ = 0;
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


    // @@protoc_insertion_point(builder_scope:anduril.ontology.v1.ObjectType)
  }

  // @@protoc_insertion_point(class_scope:anduril.ontology.v1.ObjectType)
  private static final com.anduril.ontology.v1.ObjectType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.ontology.v1.ObjectType();
  }

  public static com.anduril.ontology.v1.ObjectType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ObjectType>
      PARSER = new com.google.protobuf.AbstractParser<ObjectType>() {
    @java.lang.Override
    public ObjectType parsePartialFrom(
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

  public static com.google.protobuf.Parser<ObjectType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ObjectType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.ontology.v1.ObjectType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

