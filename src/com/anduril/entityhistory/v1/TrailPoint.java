// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entityhistory/v1/history.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.entityhistory.v1;

/**
 * <pre>
 * A trail point consists of a timestamp, location, and uncertainty.
 * The above information preserves kinematics, precise position, and
 * uncertainty for all reported points.
 * </pre>
 *
 * Protobuf type {@code anduril.entityhistory.v1.TrailPoint}
 */
public final class TrailPoint extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.entityhistory.v1.TrailPoint)
    TrailPointOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TrailPoint.newBuilder() to construct.
  private TrailPoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TrailPoint() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TrailPoint();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entityhistory.v1.HistoryPubProto.internal_static_anduril_entityhistory_v1_TrailPoint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entityhistory.v1.HistoryPubProto.internal_static_anduril_entityhistory_v1_TrailPoint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entityhistory.v1.TrailPoint.class, com.anduril.entityhistory.v1.TrailPoint.Builder.class);
  }

  private int bitField0_;
  public static final int TIMESTAMP_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp timestamp_;
  /**
   * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
   * @return Whether the timestamp field is set.
   */
  @java.lang.Override
  public boolean hasTimestamp() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getTimestamp() {
    return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
  }
  /**
   * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder() {
    return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
  }

  public static final int LOCATION_FIELD_NUMBER = 2;
  private com.anduril.entitymanager.v1.Location location_;
  /**
   * <code>.anduril.entitymanager.v1.Location location = 2 [json_name = "location"];</code>
   * @return Whether the location field is set.
   */
  @java.lang.Override
  public boolean hasLocation() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.anduril.entitymanager.v1.Location location = 2 [json_name = "location"];</code>
   * @return The location.
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.Location getLocation() {
    return location_ == null ? com.anduril.entitymanager.v1.Location.getDefaultInstance() : location_;
  }
  /**
   * <code>.anduril.entitymanager.v1.Location location = 2 [json_name = "location"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.LocationOrBuilder getLocationOrBuilder() {
    return location_ == null ? com.anduril.entitymanager.v1.Location.getDefaultInstance() : location_;
  }

  public static final int LOCATION_UNCERTAINTY_FIELD_NUMBER = 3;
  private com.anduril.entitymanager.v1.LocationUncertainty locationUncertainty_;
  /**
   * <code>.anduril.entitymanager.v1.LocationUncertainty location_uncertainty = 3 [json_name = "locationUncertainty"];</code>
   * @return Whether the locationUncertainty field is set.
   */
  @java.lang.Override
  public boolean hasLocationUncertainty() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>.anduril.entitymanager.v1.LocationUncertainty location_uncertainty = 3 [json_name = "locationUncertainty"];</code>
   * @return The locationUncertainty.
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.LocationUncertainty getLocationUncertainty() {
    return locationUncertainty_ == null ? com.anduril.entitymanager.v1.LocationUncertainty.getDefaultInstance() : locationUncertainty_;
  }
  /**
   * <code>.anduril.entitymanager.v1.LocationUncertainty location_uncertainty = 3 [json_name = "locationUncertainty"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.LocationUncertaintyOrBuilder getLocationUncertaintyOrBuilder() {
    return locationUncertainty_ == null ? com.anduril.entitymanager.v1.LocationUncertainty.getDefaultInstance() : locationUncertainty_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getTimestamp());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getLocation());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(3, getLocationUncertainty());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTimestamp());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLocation());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getLocationUncertainty());
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
    if (!(obj instanceof com.anduril.entityhistory.v1.TrailPoint)) {
      return super.equals(obj);
    }
    com.anduril.entityhistory.v1.TrailPoint other = (com.anduril.entityhistory.v1.TrailPoint) obj;

    if (hasTimestamp() != other.hasTimestamp()) return false;
    if (hasTimestamp()) {
      if (!getTimestamp()
          .equals(other.getTimestamp())) return false;
    }
    if (hasLocation() != other.hasLocation()) return false;
    if (hasLocation()) {
      if (!getLocation()
          .equals(other.getLocation())) return false;
    }
    if (hasLocationUncertainty() != other.hasLocationUncertainty()) return false;
    if (hasLocationUncertainty()) {
      if (!getLocationUncertainty()
          .equals(other.getLocationUncertainty())) return false;
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
    if (hasTimestamp()) {
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTimestamp().hashCode();
    }
    if (hasLocation()) {
      hash = (37 * hash) + LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getLocation().hashCode();
    }
    if (hasLocationUncertainty()) {
      hash = (37 * hash) + LOCATION_UNCERTAINTY_FIELD_NUMBER;
      hash = (53 * hash) + getLocationUncertainty().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entityhistory.v1.TrailPoint parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entityhistory.v1.TrailPoint parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entityhistory.v1.TrailPoint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entityhistory.v1.TrailPoint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entityhistory.v1.TrailPoint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entityhistory.v1.TrailPoint parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entityhistory.v1.TrailPoint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entityhistory.v1.TrailPoint parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.entityhistory.v1.TrailPoint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.entityhistory.v1.TrailPoint parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entityhistory.v1.TrailPoint parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entityhistory.v1.TrailPoint parseFrom(
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
  public static Builder newBuilder(com.anduril.entityhistory.v1.TrailPoint prototype) {
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
   * A trail point consists of a timestamp, location, and uncertainty.
   * The above information preserves kinematics, precise position, and
   * uncertainty for all reported points.
   * </pre>
   *
   * Protobuf type {@code anduril.entityhistory.v1.TrailPoint}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entityhistory.v1.TrailPoint)
      com.anduril.entityhistory.v1.TrailPointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entityhistory.v1.HistoryPubProto.internal_static_anduril_entityhistory_v1_TrailPoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entityhistory.v1.HistoryPubProto.internal_static_anduril_entityhistory_v1_TrailPoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entityhistory.v1.TrailPoint.class, com.anduril.entityhistory.v1.TrailPoint.Builder.class);
    }

    // Construct using com.anduril.entityhistory.v1.TrailPoint.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getTimestampFieldBuilder();
        getLocationFieldBuilder();
        getLocationUncertaintyFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      timestamp_ = null;
      if (timestampBuilder_ != null) {
        timestampBuilder_.dispose();
        timestampBuilder_ = null;
      }
      location_ = null;
      if (locationBuilder_ != null) {
        locationBuilder_.dispose();
        locationBuilder_ = null;
      }
      locationUncertainty_ = null;
      if (locationUncertaintyBuilder_ != null) {
        locationUncertaintyBuilder_.dispose();
        locationUncertaintyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entityhistory.v1.HistoryPubProto.internal_static_anduril_entityhistory_v1_TrailPoint_descriptor;
    }

    @java.lang.Override
    public com.anduril.entityhistory.v1.TrailPoint getDefaultInstanceForType() {
      return com.anduril.entityhistory.v1.TrailPoint.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entityhistory.v1.TrailPoint build() {
      com.anduril.entityhistory.v1.TrailPoint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entityhistory.v1.TrailPoint buildPartial() {
      com.anduril.entityhistory.v1.TrailPoint result = new com.anduril.entityhistory.v1.TrailPoint(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.entityhistory.v1.TrailPoint result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.timestamp_ = timestampBuilder_ == null
            ? timestamp_
            : timestampBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.location_ = locationBuilder_ == null
            ? location_
            : locationBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.locationUncertainty_ = locationUncertaintyBuilder_ == null
            ? locationUncertainty_
            : locationUncertaintyBuilder_.build();
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.anduril.entityhistory.v1.TrailPoint) {
        return mergeFrom((com.anduril.entityhistory.v1.TrailPoint)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entityhistory.v1.TrailPoint other) {
      if (other == com.anduril.entityhistory.v1.TrailPoint.getDefaultInstance()) return this;
      if (other.hasTimestamp()) {
        mergeTimestamp(other.getTimestamp());
      }
      if (other.hasLocation()) {
        mergeLocation(other.getLocation());
      }
      if (other.hasLocationUncertainty()) {
        mergeLocationUncertainty(other.getLocationUncertainty());
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
                  getTimestampFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getLocationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getLocationUncertaintyFieldBuilder().getBuilder(),
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

    private com.google.protobuf.Timestamp timestamp_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timestampBuilder_;
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
     * @return Whether the timestamp field is set.
     */
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
     * @return The timestamp.
     */
    public com.google.protobuf.Timestamp getTimestamp() {
      if (timestampBuilder_ == null) {
        return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
      } else {
        return timestampBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
     */
    public Builder setTimestamp(com.google.protobuf.Timestamp value) {
      if (timestampBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timestamp_ = value;
      } else {
        timestampBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
     */
    public Builder setTimestamp(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timestampBuilder_ == null) {
        timestamp_ = builderForValue.build();
      } else {
        timestampBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
     */
    public Builder mergeTimestamp(com.google.protobuf.Timestamp value) {
      if (timestampBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          timestamp_ != null &&
          timestamp_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getTimestampBuilder().mergeFrom(value);
        } else {
          timestamp_ = value;
        }
      } else {
        timestampBuilder_.mergeFrom(value);
      }
      if (timestamp_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
     */
    public Builder clearTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000001);
      timestamp_ = null;
      if (timestampBuilder_ != null) {
        timestampBuilder_.dispose();
        timestampBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimestampBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTimestampFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder() {
      if (timestampBuilder_ != null) {
        return timestampBuilder_.getMessageOrBuilder();
      } else {
        return timestamp_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp = 1 [json_name = "timestamp"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimestampFieldBuilder() {
      if (timestampBuilder_ == null) {
        timestampBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTimestamp(),
                getParentForChildren(),
                isClean());
        timestamp_ = null;
      }
      return timestampBuilder_;
    }

    private com.anduril.entitymanager.v1.Location location_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Location, com.anduril.entitymanager.v1.Location.Builder, com.anduril.entitymanager.v1.LocationOrBuilder> locationBuilder_;
    /**
     * <code>.anduril.entitymanager.v1.Location location = 2 [json_name = "location"];</code>
     * @return Whether the location field is set.
     */
    public boolean hasLocation() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.anduril.entitymanager.v1.Location location = 2 [json_name = "location"];</code>
     * @return The location.
     */
    public com.anduril.entitymanager.v1.Location getLocation() {
      if (locationBuilder_ == null) {
        return location_ == null ? com.anduril.entitymanager.v1.Location.getDefaultInstance() : location_;
      } else {
        return locationBuilder_.getMessage();
      }
    }
    /**
     * <code>.anduril.entitymanager.v1.Location location = 2 [json_name = "location"];</code>
     */
    public Builder setLocation(com.anduril.entitymanager.v1.Location value) {
      if (locationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        location_ = value;
      } else {
        locationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.Location location = 2 [json_name = "location"];</code>
     */
    public Builder setLocation(
        com.anduril.entitymanager.v1.Location.Builder builderForValue) {
      if (locationBuilder_ == null) {
        location_ = builderForValue.build();
      } else {
        locationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.Location location = 2 [json_name = "location"];</code>
     */
    public Builder mergeLocation(com.anduril.entitymanager.v1.Location value) {
      if (locationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          location_ != null &&
          location_ != com.anduril.entitymanager.v1.Location.getDefaultInstance()) {
          getLocationBuilder().mergeFrom(value);
        } else {
          location_ = value;
        }
      } else {
        locationBuilder_.mergeFrom(value);
      }
      if (location_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.Location location = 2 [json_name = "location"];</code>
     */
    public Builder clearLocation() {
      bitField0_ = (bitField0_ & ~0x00000002);
      location_ = null;
      if (locationBuilder_ != null) {
        locationBuilder_.dispose();
        locationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.Location location = 2 [json_name = "location"];</code>
     */
    public com.anduril.entitymanager.v1.Location.Builder getLocationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getLocationFieldBuilder().getBuilder();
    }
    /**
     * <code>.anduril.entitymanager.v1.Location location = 2 [json_name = "location"];</code>
     */
    public com.anduril.entitymanager.v1.LocationOrBuilder getLocationOrBuilder() {
      if (locationBuilder_ != null) {
        return locationBuilder_.getMessageOrBuilder();
      } else {
        return location_ == null ?
            com.anduril.entitymanager.v1.Location.getDefaultInstance() : location_;
      }
    }
    /**
     * <code>.anduril.entitymanager.v1.Location location = 2 [json_name = "location"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Location, com.anduril.entitymanager.v1.Location.Builder, com.anduril.entitymanager.v1.LocationOrBuilder> 
        getLocationFieldBuilder() {
      if (locationBuilder_ == null) {
        locationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.entitymanager.v1.Location, com.anduril.entitymanager.v1.Location.Builder, com.anduril.entitymanager.v1.LocationOrBuilder>(
                getLocation(),
                getParentForChildren(),
                isClean());
        location_ = null;
      }
      return locationBuilder_;
    }

    private com.anduril.entitymanager.v1.LocationUncertainty locationUncertainty_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.LocationUncertainty, com.anduril.entitymanager.v1.LocationUncertainty.Builder, com.anduril.entitymanager.v1.LocationUncertaintyOrBuilder> locationUncertaintyBuilder_;
    /**
     * <code>.anduril.entitymanager.v1.LocationUncertainty location_uncertainty = 3 [json_name = "locationUncertainty"];</code>
     * @return Whether the locationUncertainty field is set.
     */
    public boolean hasLocationUncertainty() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.anduril.entitymanager.v1.LocationUncertainty location_uncertainty = 3 [json_name = "locationUncertainty"];</code>
     * @return The locationUncertainty.
     */
    public com.anduril.entitymanager.v1.LocationUncertainty getLocationUncertainty() {
      if (locationUncertaintyBuilder_ == null) {
        return locationUncertainty_ == null ? com.anduril.entitymanager.v1.LocationUncertainty.getDefaultInstance() : locationUncertainty_;
      } else {
        return locationUncertaintyBuilder_.getMessage();
      }
    }
    /**
     * <code>.anduril.entitymanager.v1.LocationUncertainty location_uncertainty = 3 [json_name = "locationUncertainty"];</code>
     */
    public Builder setLocationUncertainty(com.anduril.entitymanager.v1.LocationUncertainty value) {
      if (locationUncertaintyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        locationUncertainty_ = value;
      } else {
        locationUncertaintyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.LocationUncertainty location_uncertainty = 3 [json_name = "locationUncertainty"];</code>
     */
    public Builder setLocationUncertainty(
        com.anduril.entitymanager.v1.LocationUncertainty.Builder builderForValue) {
      if (locationUncertaintyBuilder_ == null) {
        locationUncertainty_ = builderForValue.build();
      } else {
        locationUncertaintyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.LocationUncertainty location_uncertainty = 3 [json_name = "locationUncertainty"];</code>
     */
    public Builder mergeLocationUncertainty(com.anduril.entitymanager.v1.LocationUncertainty value) {
      if (locationUncertaintyBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          locationUncertainty_ != null &&
          locationUncertainty_ != com.anduril.entitymanager.v1.LocationUncertainty.getDefaultInstance()) {
          getLocationUncertaintyBuilder().mergeFrom(value);
        } else {
          locationUncertainty_ = value;
        }
      } else {
        locationUncertaintyBuilder_.mergeFrom(value);
      }
      if (locationUncertainty_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.LocationUncertainty location_uncertainty = 3 [json_name = "locationUncertainty"];</code>
     */
    public Builder clearLocationUncertainty() {
      bitField0_ = (bitField0_ & ~0x00000004);
      locationUncertainty_ = null;
      if (locationUncertaintyBuilder_ != null) {
        locationUncertaintyBuilder_.dispose();
        locationUncertaintyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.LocationUncertainty location_uncertainty = 3 [json_name = "locationUncertainty"];</code>
     */
    public com.anduril.entitymanager.v1.LocationUncertainty.Builder getLocationUncertaintyBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getLocationUncertaintyFieldBuilder().getBuilder();
    }
    /**
     * <code>.anduril.entitymanager.v1.LocationUncertainty location_uncertainty = 3 [json_name = "locationUncertainty"];</code>
     */
    public com.anduril.entitymanager.v1.LocationUncertaintyOrBuilder getLocationUncertaintyOrBuilder() {
      if (locationUncertaintyBuilder_ != null) {
        return locationUncertaintyBuilder_.getMessageOrBuilder();
      } else {
        return locationUncertainty_ == null ?
            com.anduril.entitymanager.v1.LocationUncertainty.getDefaultInstance() : locationUncertainty_;
      }
    }
    /**
     * <code>.anduril.entitymanager.v1.LocationUncertainty location_uncertainty = 3 [json_name = "locationUncertainty"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.LocationUncertainty, com.anduril.entitymanager.v1.LocationUncertainty.Builder, com.anduril.entitymanager.v1.LocationUncertaintyOrBuilder> 
        getLocationUncertaintyFieldBuilder() {
      if (locationUncertaintyBuilder_ == null) {
        locationUncertaintyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.entitymanager.v1.LocationUncertainty, com.anduril.entitymanager.v1.LocationUncertainty.Builder, com.anduril.entitymanager.v1.LocationUncertaintyOrBuilder>(
                getLocationUncertainty(),
                getParentForChildren(),
                isClean());
        locationUncertainty_ = null;
      }
      return locationUncertaintyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.entityhistory.v1.TrailPoint)
  }

  // @@protoc_insertion_point(class_scope:anduril.entityhistory.v1.TrailPoint)
  private static final com.anduril.entityhistory.v1.TrailPoint DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entityhistory.v1.TrailPoint();
  }

  public static com.anduril.entityhistory.v1.TrailPoint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TrailPoint>
      PARSER = new com.google.protobuf.AbstractParser<TrailPoint>() {
    @java.lang.Override
    public TrailPoint parsePartialFrom(
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

  public static com.google.protobuf.Parser<TrailPoint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TrailPoint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entityhistory.v1.TrailPoint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

