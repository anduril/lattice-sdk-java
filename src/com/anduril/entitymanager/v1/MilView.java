// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/ontology.pub.proto

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * Provides the disposition, environment, and nationality of an Entity.
 * </pre>
 *
 * Protobuf type {@code anduril.entitymanager.v1.MilView}
 */
public final class MilView extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.MilView)
    MilViewOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MilView.newBuilder() to construct.
  private MilView(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MilView() {
    disposition_ = 0;
    environment_ = 0;
    nationality_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MilView();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.OntologyPubProto.internal_static_anduril_entitymanager_v1_MilView_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.OntologyPubProto.internal_static_anduril_entitymanager_v1_MilView_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.MilView.class, com.anduril.entitymanager.v1.MilView.Builder.class);
  }

  public static final int DISPOSITION_FIELD_NUMBER = 1;
  private int disposition_ = 0;
  /**
   * <code>.anduril.ontology.v1.Disposition disposition = 1 [json_name = "disposition", (.anduril.entitymanager.v1.overridable) = true];</code>
   * @return The enum numeric value on the wire for disposition.
   */
  @java.lang.Override public int getDispositionValue() {
    return disposition_;
  }
  /**
   * <code>.anduril.ontology.v1.Disposition disposition = 1 [json_name = "disposition", (.anduril.entitymanager.v1.overridable) = true];</code>
   * @return The disposition.
   */
  @java.lang.Override public com.anduril.ontology.v1.Disposition getDisposition() {
    com.anduril.ontology.v1.Disposition result = com.anduril.ontology.v1.Disposition.forNumber(disposition_);
    return result == null ? com.anduril.ontology.v1.Disposition.UNRECOGNIZED : result;
  }

  public static final int ENVIRONMENT_FIELD_NUMBER = 2;
  private int environment_ = 0;
  /**
   * <code>.anduril.ontology.v1.Environment environment = 2 [json_name = "environment", (.anduril.entitymanager.v1.overridable) = true];</code>
   * @return The enum numeric value on the wire for environment.
   */
  @java.lang.Override public int getEnvironmentValue() {
    return environment_;
  }
  /**
   * <code>.anduril.ontology.v1.Environment environment = 2 [json_name = "environment", (.anduril.entitymanager.v1.overridable) = true];</code>
   * @return The environment.
   */
  @java.lang.Override public com.anduril.ontology.v1.Environment getEnvironment() {
    com.anduril.ontology.v1.Environment result = com.anduril.ontology.v1.Environment.forNumber(environment_);
    return result == null ? com.anduril.ontology.v1.Environment.UNRECOGNIZED : result;
  }

  public static final int NATIONALITY_FIELD_NUMBER = 3;
  private int nationality_ = 0;
  /**
   * <code>.anduril.ontology.v1.Nationality nationality = 3 [json_name = "nationality", (.anduril.entitymanager.v1.overridable) = true];</code>
   * @return The enum numeric value on the wire for nationality.
   */
  @java.lang.Override public int getNationalityValue() {
    return nationality_;
  }
  /**
   * <code>.anduril.ontology.v1.Nationality nationality = 3 [json_name = "nationality", (.anduril.entitymanager.v1.overridable) = true];</code>
   * @return The nationality.
   */
  @java.lang.Override public com.anduril.ontology.v1.Nationality getNationality() {
    com.anduril.ontology.v1.Nationality result = com.anduril.ontology.v1.Nationality.forNumber(nationality_);
    return result == null ? com.anduril.ontology.v1.Nationality.UNRECOGNIZED : result;
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
    if (disposition_ != com.anduril.ontology.v1.Disposition.DISPOSITION_UNKNOWN.getNumber()) {
      output.writeEnum(1, disposition_);
    }
    if (environment_ != com.anduril.ontology.v1.Environment.ENVIRONMENT_UNKNOWN.getNumber()) {
      output.writeEnum(2, environment_);
    }
    if (nationality_ != com.anduril.ontology.v1.Nationality.NATIONALITY_INVALID.getNumber()) {
      output.writeEnum(3, nationality_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (disposition_ != com.anduril.ontology.v1.Disposition.DISPOSITION_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, disposition_);
    }
    if (environment_ != com.anduril.ontology.v1.Environment.ENVIRONMENT_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, environment_);
    }
    if (nationality_ != com.anduril.ontology.v1.Nationality.NATIONALITY_INVALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, nationality_);
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
    if (!(obj instanceof com.anduril.entitymanager.v1.MilView)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.MilView other = (com.anduril.entitymanager.v1.MilView) obj;

    if (disposition_ != other.disposition_) return false;
    if (environment_ != other.environment_) return false;
    if (nationality_ != other.nationality_) return false;
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
    hash = (37 * hash) + DISPOSITION_FIELD_NUMBER;
    hash = (53 * hash) + disposition_;
    hash = (37 * hash) + ENVIRONMENT_FIELD_NUMBER;
    hash = (53 * hash) + environment_;
    hash = (37 * hash) + NATIONALITY_FIELD_NUMBER;
    hash = (53 * hash) + nationality_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.MilView parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.MilView parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.MilView parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.MilView parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.MilView parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.MilView parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.MilView parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.MilView parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.MilView parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.MilView parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.MilView parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.MilView parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.MilView prototype) {
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
   * Provides the disposition, environment, and nationality of an Entity.
   * </pre>
   *
   * Protobuf type {@code anduril.entitymanager.v1.MilView}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.MilView)
      com.anduril.entitymanager.v1.MilViewOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.OntologyPubProto.internal_static_anduril_entitymanager_v1_MilView_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.OntologyPubProto.internal_static_anduril_entitymanager_v1_MilView_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.MilView.class, com.anduril.entitymanager.v1.MilView.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.MilView.newBuilder()
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
      disposition_ = 0;
      environment_ = 0;
      nationality_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.OntologyPubProto.internal_static_anduril_entitymanager_v1_MilView_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.MilView getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.MilView.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.MilView build() {
      com.anduril.entitymanager.v1.MilView result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.MilView buildPartial() {
      com.anduril.entitymanager.v1.MilView result = new com.anduril.entitymanager.v1.MilView(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.entitymanager.v1.MilView result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.disposition_ = disposition_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.environment_ = environment_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.nationality_ = nationality_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entitymanager.v1.MilView) {
        return mergeFrom((com.anduril.entitymanager.v1.MilView)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.MilView other) {
      if (other == com.anduril.entitymanager.v1.MilView.getDefaultInstance()) return this;
      if (other.disposition_ != 0) {
        setDispositionValue(other.getDispositionValue());
      }
      if (other.environment_ != 0) {
        setEnvironmentValue(other.getEnvironmentValue());
      }
      if (other.nationality_ != 0) {
        setNationalityValue(other.getNationalityValue());
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
              disposition_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              environment_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              nationality_ = input.readEnum();
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

    private int disposition_ = 0;
    /**
     * <code>.anduril.ontology.v1.Disposition disposition = 1 [json_name = "disposition", (.anduril.entitymanager.v1.overridable) = true];</code>
     * @return The enum numeric value on the wire for disposition.
     */
    @java.lang.Override public int getDispositionValue() {
      return disposition_;
    }
    /**
     * <code>.anduril.ontology.v1.Disposition disposition = 1 [json_name = "disposition", (.anduril.entitymanager.v1.overridable) = true];</code>
     * @param value The enum numeric value on the wire for disposition to set.
     * @return This builder for chaining.
     */
    public Builder setDispositionValue(int value) {
      disposition_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.ontology.v1.Disposition disposition = 1 [json_name = "disposition", (.anduril.entitymanager.v1.overridable) = true];</code>
     * @return The disposition.
     */
    @java.lang.Override
    public com.anduril.ontology.v1.Disposition getDisposition() {
      com.anduril.ontology.v1.Disposition result = com.anduril.ontology.v1.Disposition.forNumber(disposition_);
      return result == null ? com.anduril.ontology.v1.Disposition.UNRECOGNIZED : result;
    }
    /**
     * <code>.anduril.ontology.v1.Disposition disposition = 1 [json_name = "disposition", (.anduril.entitymanager.v1.overridable) = true];</code>
     * @param value The disposition to set.
     * @return This builder for chaining.
     */
    public Builder setDisposition(com.anduril.ontology.v1.Disposition value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      disposition_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.ontology.v1.Disposition disposition = 1 [json_name = "disposition", (.anduril.entitymanager.v1.overridable) = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearDisposition() {
      bitField0_ = (bitField0_ & ~0x00000001);
      disposition_ = 0;
      onChanged();
      return this;
    }

    private int environment_ = 0;
    /**
     * <code>.anduril.ontology.v1.Environment environment = 2 [json_name = "environment", (.anduril.entitymanager.v1.overridable) = true];</code>
     * @return The enum numeric value on the wire for environment.
     */
    @java.lang.Override public int getEnvironmentValue() {
      return environment_;
    }
    /**
     * <code>.anduril.ontology.v1.Environment environment = 2 [json_name = "environment", (.anduril.entitymanager.v1.overridable) = true];</code>
     * @param value The enum numeric value on the wire for environment to set.
     * @return This builder for chaining.
     */
    public Builder setEnvironmentValue(int value) {
      environment_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.ontology.v1.Environment environment = 2 [json_name = "environment", (.anduril.entitymanager.v1.overridable) = true];</code>
     * @return The environment.
     */
    @java.lang.Override
    public com.anduril.ontology.v1.Environment getEnvironment() {
      com.anduril.ontology.v1.Environment result = com.anduril.ontology.v1.Environment.forNumber(environment_);
      return result == null ? com.anduril.ontology.v1.Environment.UNRECOGNIZED : result;
    }
    /**
     * <code>.anduril.ontology.v1.Environment environment = 2 [json_name = "environment", (.anduril.entitymanager.v1.overridable) = true];</code>
     * @param value The environment to set.
     * @return This builder for chaining.
     */
    public Builder setEnvironment(com.anduril.ontology.v1.Environment value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      environment_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.ontology.v1.Environment environment = 2 [json_name = "environment", (.anduril.entitymanager.v1.overridable) = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearEnvironment() {
      bitField0_ = (bitField0_ & ~0x00000002);
      environment_ = 0;
      onChanged();
      return this;
    }

    private int nationality_ = 0;
    /**
     * <code>.anduril.ontology.v1.Nationality nationality = 3 [json_name = "nationality", (.anduril.entitymanager.v1.overridable) = true];</code>
     * @return The enum numeric value on the wire for nationality.
     */
    @java.lang.Override public int getNationalityValue() {
      return nationality_;
    }
    /**
     * <code>.anduril.ontology.v1.Nationality nationality = 3 [json_name = "nationality", (.anduril.entitymanager.v1.overridable) = true];</code>
     * @param value The enum numeric value on the wire for nationality to set.
     * @return This builder for chaining.
     */
    public Builder setNationalityValue(int value) {
      nationality_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.ontology.v1.Nationality nationality = 3 [json_name = "nationality", (.anduril.entitymanager.v1.overridable) = true];</code>
     * @return The nationality.
     */
    @java.lang.Override
    public com.anduril.ontology.v1.Nationality getNationality() {
      com.anduril.ontology.v1.Nationality result = com.anduril.ontology.v1.Nationality.forNumber(nationality_);
      return result == null ? com.anduril.ontology.v1.Nationality.UNRECOGNIZED : result;
    }
    /**
     * <code>.anduril.ontology.v1.Nationality nationality = 3 [json_name = "nationality", (.anduril.entitymanager.v1.overridable) = true];</code>
     * @param value The nationality to set.
     * @return This builder for chaining.
     */
    public Builder setNationality(com.anduril.ontology.v1.Nationality value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      nationality_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.ontology.v1.Nationality nationality = 3 [json_name = "nationality", (.anduril.entitymanager.v1.overridable) = true];</code>
     * @return This builder for chaining.
     */
    public Builder clearNationality() {
      bitField0_ = (bitField0_ & ~0x00000004);
      nationality_ = 0;
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


    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.MilView)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.MilView)
  private static final com.anduril.entitymanager.v1.MilView DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.MilView();
  }

  public static com.anduril.entitymanager.v1.MilView getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MilView>
      PARSER = new com.google.protobuf.AbstractParser<MilView>() {
    @java.lang.Override
    public MilView parsePartialFrom(
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

  public static com.google.protobuf.Parser<MilView> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MilView> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.MilView getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
