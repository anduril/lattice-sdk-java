// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/entitymanager/v1/signal.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * A component that describes the scanning characteristics of a signal
 * </pre>
 *
 * Protobuf type {@code anduril.entitymanager.v1.ScanCharacteristics}
 */
public final class ScanCharacteristics extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.ScanCharacteristics)
    ScanCharacteristicsOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      ScanCharacteristics.class.getName());
  }
  // Use ScanCharacteristics.newBuilder() to construct.
  private ScanCharacteristics(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ScanCharacteristics() {
    scanType_ = 0;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.SignalPubProto.internal_static_anduril_entitymanager_v1_ScanCharacteristics_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.SignalPubProto.internal_static_anduril_entitymanager_v1_ScanCharacteristics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.ScanCharacteristics.class, com.anduril.entitymanager.v1.ScanCharacteristics.Builder.class);
  }

  private int bitField0_;
  public static final int SCAN_TYPE_FIELD_NUMBER = 1;
  private int scanType_ = 0;
  /**
   * <code>.anduril.entitymanager.v1.ScanType scan_type = 1 [json_name = "scanType"];</code>
   * @return The enum numeric value on the wire for scanType.
   */
  @java.lang.Override public int getScanTypeValue() {
    return scanType_;
  }
  /**
   * <code>.anduril.entitymanager.v1.ScanType scan_type = 1 [json_name = "scanType"];</code>
   * @return The scanType.
   */
  @java.lang.Override public com.anduril.entitymanager.v1.ScanType getScanType() {
    com.anduril.entitymanager.v1.ScanType result = com.anduril.entitymanager.v1.ScanType.forNumber(scanType_);
    return result == null ? com.anduril.entitymanager.v1.ScanType.UNRECOGNIZED : result;
  }

  public static final int SCAN_PERIOD_S_FIELD_NUMBER = 2;
  private com.google.protobuf.DoubleValue scanPeriodS_;
  /**
   * <code>.google.protobuf.DoubleValue scan_period_s = 2 [json_name = "scanPeriodS"];</code>
   * @return Whether the scanPeriodS field is set.
   */
  @java.lang.Override
  public boolean hasScanPeriodS() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.google.protobuf.DoubleValue scan_period_s = 2 [json_name = "scanPeriodS"];</code>
   * @return The scanPeriodS.
   */
  @java.lang.Override
  public com.google.protobuf.DoubleValue getScanPeriodS() {
    return scanPeriodS_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : scanPeriodS_;
  }
  /**
   * <code>.google.protobuf.DoubleValue scan_period_s = 2 [json_name = "scanPeriodS"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.DoubleValueOrBuilder getScanPeriodSOrBuilder() {
    return scanPeriodS_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : scanPeriodS_;
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
    if (scanType_ != com.anduril.entitymanager.v1.ScanType.SCAN_TYPE_INVALID.getNumber()) {
      output.writeEnum(1, scanType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getScanPeriodS());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (scanType_ != com.anduril.entitymanager.v1.ScanType.SCAN_TYPE_INVALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, scanType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getScanPeriodS());
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
    if (!(obj instanceof com.anduril.entitymanager.v1.ScanCharacteristics)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.ScanCharacteristics other = (com.anduril.entitymanager.v1.ScanCharacteristics) obj;

    if (scanType_ != other.scanType_) return false;
    if (hasScanPeriodS() != other.hasScanPeriodS()) return false;
    if (hasScanPeriodS()) {
      if (!getScanPeriodS()
          .equals(other.getScanPeriodS())) return false;
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
    hash = (37 * hash) + SCAN_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + scanType_;
    if (hasScanPeriodS()) {
      hash = (37 * hash) + SCAN_PERIOD_S_FIELD_NUMBER;
      hash = (53 * hash) + getScanPeriodS().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.ScanCharacteristics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.ScanCharacteristics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.ScanCharacteristics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.ScanCharacteristics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.ScanCharacteristics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.ScanCharacteristics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.ScanCharacteristics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.ScanCharacteristics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.entitymanager.v1.ScanCharacteristics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.entitymanager.v1.ScanCharacteristics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.ScanCharacteristics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.ScanCharacteristics parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.ScanCharacteristics prototype) {
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
   * A component that describes the scanning characteristics of a signal
   * </pre>
   *
   * Protobuf type {@code anduril.entitymanager.v1.ScanCharacteristics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.ScanCharacteristics)
      com.anduril.entitymanager.v1.ScanCharacteristicsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.SignalPubProto.internal_static_anduril_entitymanager_v1_ScanCharacteristics_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.SignalPubProto.internal_static_anduril_entitymanager_v1_ScanCharacteristics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.ScanCharacteristics.class, com.anduril.entitymanager.v1.ScanCharacteristics.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.ScanCharacteristics.newBuilder()
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
        getScanPeriodSFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      scanType_ = 0;
      scanPeriodS_ = null;
      if (scanPeriodSBuilder_ != null) {
        scanPeriodSBuilder_.dispose();
        scanPeriodSBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.SignalPubProto.internal_static_anduril_entitymanager_v1_ScanCharacteristics_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.ScanCharacteristics getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.ScanCharacteristics.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.ScanCharacteristics build() {
      com.anduril.entitymanager.v1.ScanCharacteristics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.ScanCharacteristics buildPartial() {
      com.anduril.entitymanager.v1.ScanCharacteristics result = new com.anduril.entitymanager.v1.ScanCharacteristics(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.entitymanager.v1.ScanCharacteristics result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.scanType_ = scanType_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.scanPeriodS_ = scanPeriodSBuilder_ == null
            ? scanPeriodS_
            : scanPeriodSBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entitymanager.v1.ScanCharacteristics) {
        return mergeFrom((com.anduril.entitymanager.v1.ScanCharacteristics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.ScanCharacteristics other) {
      if (other == com.anduril.entitymanager.v1.ScanCharacteristics.getDefaultInstance()) return this;
      if (other.scanType_ != 0) {
        setScanTypeValue(other.getScanTypeValue());
      }
      if (other.hasScanPeriodS()) {
        mergeScanPeriodS(other.getScanPeriodS());
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
              scanType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getScanPeriodSFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
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

    private int scanType_ = 0;
    /**
     * <code>.anduril.entitymanager.v1.ScanType scan_type = 1 [json_name = "scanType"];</code>
     * @return The enum numeric value on the wire for scanType.
     */
    @java.lang.Override public int getScanTypeValue() {
      return scanType_;
    }
    /**
     * <code>.anduril.entitymanager.v1.ScanType scan_type = 1 [json_name = "scanType"];</code>
     * @param value The enum numeric value on the wire for scanType to set.
     * @return This builder for chaining.
     */
    public Builder setScanTypeValue(int value) {
      scanType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.ScanType scan_type = 1 [json_name = "scanType"];</code>
     * @return The scanType.
     */
    @java.lang.Override
    public com.anduril.entitymanager.v1.ScanType getScanType() {
      com.anduril.entitymanager.v1.ScanType result = com.anduril.entitymanager.v1.ScanType.forNumber(scanType_);
      return result == null ? com.anduril.entitymanager.v1.ScanType.UNRECOGNIZED : result;
    }
    /**
     * <code>.anduril.entitymanager.v1.ScanType scan_type = 1 [json_name = "scanType"];</code>
     * @param value The scanType to set.
     * @return This builder for chaining.
     */
    public Builder setScanType(com.anduril.entitymanager.v1.ScanType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      scanType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.ScanType scan_type = 1 [json_name = "scanType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearScanType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      scanType_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.DoubleValue scanPeriodS_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> scanPeriodSBuilder_;
    /**
     * <code>.google.protobuf.DoubleValue scan_period_s = 2 [json_name = "scanPeriodS"];</code>
     * @return Whether the scanPeriodS field is set.
     */
    public boolean hasScanPeriodS() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.google.protobuf.DoubleValue scan_period_s = 2 [json_name = "scanPeriodS"];</code>
     * @return The scanPeriodS.
     */
    public com.google.protobuf.DoubleValue getScanPeriodS() {
      if (scanPeriodSBuilder_ == null) {
        return scanPeriodS_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : scanPeriodS_;
      } else {
        return scanPeriodSBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.DoubleValue scan_period_s = 2 [json_name = "scanPeriodS"];</code>
     */
    public Builder setScanPeriodS(com.google.protobuf.DoubleValue value) {
      if (scanPeriodSBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        scanPeriodS_ = value;
      } else {
        scanPeriodSBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.DoubleValue scan_period_s = 2 [json_name = "scanPeriodS"];</code>
     */
    public Builder setScanPeriodS(
        com.google.protobuf.DoubleValue.Builder builderForValue) {
      if (scanPeriodSBuilder_ == null) {
        scanPeriodS_ = builderForValue.build();
      } else {
        scanPeriodSBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.DoubleValue scan_period_s = 2 [json_name = "scanPeriodS"];</code>
     */
    public Builder mergeScanPeriodS(com.google.protobuf.DoubleValue value) {
      if (scanPeriodSBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          scanPeriodS_ != null &&
          scanPeriodS_ != com.google.protobuf.DoubleValue.getDefaultInstance()) {
          getScanPeriodSBuilder().mergeFrom(value);
        } else {
          scanPeriodS_ = value;
        }
      } else {
        scanPeriodSBuilder_.mergeFrom(value);
      }
      if (scanPeriodS_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.google.protobuf.DoubleValue scan_period_s = 2 [json_name = "scanPeriodS"];</code>
     */
    public Builder clearScanPeriodS() {
      bitField0_ = (bitField0_ & ~0x00000002);
      scanPeriodS_ = null;
      if (scanPeriodSBuilder_ != null) {
        scanPeriodSBuilder_.dispose();
        scanPeriodSBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.DoubleValue scan_period_s = 2 [json_name = "scanPeriodS"];</code>
     */
    public com.google.protobuf.DoubleValue.Builder getScanPeriodSBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getScanPeriodSFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.DoubleValue scan_period_s = 2 [json_name = "scanPeriodS"];</code>
     */
    public com.google.protobuf.DoubleValueOrBuilder getScanPeriodSOrBuilder() {
      if (scanPeriodSBuilder_ != null) {
        return scanPeriodSBuilder_.getMessageOrBuilder();
      } else {
        return scanPeriodS_ == null ?
            com.google.protobuf.DoubleValue.getDefaultInstance() : scanPeriodS_;
      }
    }
    /**
     * <code>.google.protobuf.DoubleValue scan_period_s = 2 [json_name = "scanPeriodS"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> 
        getScanPeriodSFieldBuilder() {
      if (scanPeriodSBuilder_ == null) {
        scanPeriodSBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder>(
                getScanPeriodS(),
                getParentForChildren(),
                isClean());
        scanPeriodS_ = null;
      }
      return scanPeriodSBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.ScanCharacteristics)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.ScanCharacteristics)
  private static final com.anduril.entitymanager.v1.ScanCharacteristics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.ScanCharacteristics();
  }

  public static com.anduril.entitymanager.v1.ScanCharacteristics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScanCharacteristics>
      PARSER = new com.google.protobuf.AbstractParser<ScanCharacteristics>() {
    @java.lang.Override
    public ScanCharacteristics parsePartialFrom(
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

  public static com.google.protobuf.Parser<ScanCharacteristics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScanCharacteristics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.ScanCharacteristics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

