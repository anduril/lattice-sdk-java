// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/ad/desertguardian/rf/v1/rf_tasks.pub.proto

package com.anduril.tasks.ad.desertguardian.rf.v1;

/**
 * <pre>
 * Set whether or not an RF Platform has Emmission Control (EmCon).
 * If supported, RF platforms should only expose the SetTransmitState task when EmissionControlState is EMISSION_CONTROL_STATE_ALLOWED.
 * When in EMISSION_CONTROL_STATE_NOT_ALLOWED, the Platform should be in TRANSMIT_STATE_NOT_TRANSMITTING, and should remove SetTransmitState from the task Catalog.
 * </pre>
 *
 * Protobuf type {@code anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState}
 */
public final class SetEmissionControlState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState)
    SetEmissionControlStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetEmissionControlState.newBuilder() to construct.
  private SetEmissionControlState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetEmissionControlState() {
    emconState_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetEmissionControlState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.tasks.ad.desertguardian.rf.v1.RfTasksPubProto.internal_static_anduril_tasks_ad_desertguardian_rf_v1_SetEmissionControlState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.tasks.ad.desertguardian.rf.v1.RfTasksPubProto.internal_static_anduril_tasks_ad_desertguardian_rf_v1_SetEmissionControlState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState.class, com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState.Builder.class);
  }

  public static final int EMCON_STATE_FIELD_NUMBER = 1;
  private int emconState_ = 0;
  /**
   * <code>.anduril.tasks.ad.desertguardian.rf.v1.EmissionControlState emcon_state = 1 [json_name = "emconState"];</code>
   * @return The enum numeric value on the wire for emconState.
   */
  @java.lang.Override public int getEmconStateValue() {
    return emconState_;
  }
  /**
   * <code>.anduril.tasks.ad.desertguardian.rf.v1.EmissionControlState emcon_state = 1 [json_name = "emconState"];</code>
   * @return The emconState.
   */
  @java.lang.Override public com.anduril.tasks.ad.desertguardian.rf.v1.EmissionControlState getEmconState() {
    com.anduril.tasks.ad.desertguardian.rf.v1.EmissionControlState result = com.anduril.tasks.ad.desertguardian.rf.v1.EmissionControlState.forNumber(emconState_);
    return result == null ? com.anduril.tasks.ad.desertguardian.rf.v1.EmissionControlState.UNRECOGNIZED : result;
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
    if (emconState_ != com.anduril.tasks.ad.desertguardian.rf.v1.EmissionControlState.EMISSION_CONTROL_STATE_INVALID.getNumber()) {
      output.writeEnum(1, emconState_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (emconState_ != com.anduril.tasks.ad.desertguardian.rf.v1.EmissionControlState.EMISSION_CONTROL_STATE_INVALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, emconState_);
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
    if (!(obj instanceof com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState)) {
      return super.equals(obj);
    }
    com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState other = (com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState) obj;

    if (emconState_ != other.emconState_) return false;
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
    hash = (37 * hash) + EMCON_STATE_FIELD_NUMBER;
    hash = (53 * hash) + emconState_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState parseFrom(
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
  public static Builder newBuilder(com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState prototype) {
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
   * Set whether or not an RF Platform has Emmission Control (EmCon).
   * If supported, RF platforms should only expose the SetTransmitState task when EmissionControlState is EMISSION_CONTROL_STATE_ALLOWED.
   * When in EMISSION_CONTROL_STATE_NOT_ALLOWED, the Platform should be in TRANSMIT_STATE_NOT_TRANSMITTING, and should remove SetTransmitState from the task Catalog.
   * </pre>
   *
   * Protobuf type {@code anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState)
      com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.tasks.ad.desertguardian.rf.v1.RfTasksPubProto.internal_static_anduril_tasks_ad_desertguardian_rf_v1_SetEmissionControlState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.tasks.ad.desertguardian.rf.v1.RfTasksPubProto.internal_static_anduril_tasks_ad_desertguardian_rf_v1_SetEmissionControlState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState.class, com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState.Builder.class);
    }

    // Construct using com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState.newBuilder()
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
      emconState_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.tasks.ad.desertguardian.rf.v1.RfTasksPubProto.internal_static_anduril_tasks_ad_desertguardian_rf_v1_SetEmissionControlState_descriptor;
    }

    @java.lang.Override
    public com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState getDefaultInstanceForType() {
      return com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState build() {
      com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState buildPartial() {
      com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState result = new com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.emconState_ = emconState_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState) {
        return mergeFrom((com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState other) {
      if (other == com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState.getDefaultInstance()) return this;
      if (other.emconState_ != 0) {
        setEmconStateValue(other.getEmconStateValue());
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
              emconState_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private int emconState_ = 0;
    /**
     * <code>.anduril.tasks.ad.desertguardian.rf.v1.EmissionControlState emcon_state = 1 [json_name = "emconState"];</code>
     * @return The enum numeric value on the wire for emconState.
     */
    @java.lang.Override public int getEmconStateValue() {
      return emconState_;
    }
    /**
     * <code>.anduril.tasks.ad.desertguardian.rf.v1.EmissionControlState emcon_state = 1 [json_name = "emconState"];</code>
     * @param value The enum numeric value on the wire for emconState to set.
     * @return This builder for chaining.
     */
    public Builder setEmconStateValue(int value) {
      emconState_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.tasks.ad.desertguardian.rf.v1.EmissionControlState emcon_state = 1 [json_name = "emconState"];</code>
     * @return The emconState.
     */
    @java.lang.Override
    public com.anduril.tasks.ad.desertguardian.rf.v1.EmissionControlState getEmconState() {
      com.anduril.tasks.ad.desertguardian.rf.v1.EmissionControlState result = com.anduril.tasks.ad.desertguardian.rf.v1.EmissionControlState.forNumber(emconState_);
      return result == null ? com.anduril.tasks.ad.desertguardian.rf.v1.EmissionControlState.UNRECOGNIZED : result;
    }
    /**
     * <code>.anduril.tasks.ad.desertguardian.rf.v1.EmissionControlState emcon_state = 1 [json_name = "emconState"];</code>
     * @param value The emconState to set.
     * @return This builder for chaining.
     */
    public Builder setEmconState(com.anduril.tasks.ad.desertguardian.rf.v1.EmissionControlState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      emconState_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.tasks.ad.desertguardian.rf.v1.EmissionControlState emcon_state = 1 [json_name = "emconState"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEmconState() {
      bitField0_ = (bitField0_ & ~0x00000001);
      emconState_ = 0;
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


    // @@protoc_insertion_point(builder_scope:anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState)
  }

  // @@protoc_insertion_point(class_scope:anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState)
  private static final com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState();
  }

  public static com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetEmissionControlState>
      PARSER = new com.google.protobuf.AbstractParser<SetEmissionControlState>() {
    @java.lang.Override
    public SetEmissionControlState parsePartialFrom(
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

  public static com.google.protobuf.Parser<SetEmissionControlState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetEmissionControlState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.tasks.ad.desertguardian.rf.v1.SetEmissionControlState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

