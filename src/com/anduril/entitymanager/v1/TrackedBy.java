// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/relationship.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.entitymanager.v1;

/**
 * <pre>
 * Describes the relationship between the entity being tracked ("tracked entity") and the entity that is
 * performing the tracking ("tracking entity").
 * </pre>
 *
 * Protobuf type {@code anduril.entitymanager.v1.TrackedBy}
 */
public final class TrackedBy extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.TrackedBy)
    TrackedByOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TrackedBy.newBuilder() to construct.
  private TrackedBy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TrackedBy() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TrackedBy();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.RelationshipPubProto.internal_static_anduril_entitymanager_v1_TrackedBy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.RelationshipPubProto.internal_static_anduril_entitymanager_v1_TrackedBy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.TrackedBy.class, com.anduril.entitymanager.v1.TrackedBy.Builder.class);
  }

  private int bitField0_;
  public static final int ACTIVELY_TRACKING_SENSORS_FIELD_NUMBER = 1;
  private com.anduril.entitymanager.v1.Sensors activelyTrackingSensors_;
  /**
   * <pre>
   * Sensor details of the tracking entity's sensors that were active and tracking the tracked entity. This may be
   * a subset of the total sensors available on the tracking entity.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Sensors actively_tracking_sensors = 1 [json_name = "activelyTrackingSensors"];</code>
   * @return Whether the activelyTrackingSensors field is set.
   */
  @java.lang.Override
  public boolean hasActivelyTrackingSensors() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Sensor details of the tracking entity's sensors that were active and tracking the tracked entity. This may be
   * a subset of the total sensors available on the tracking entity.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Sensors actively_tracking_sensors = 1 [json_name = "activelyTrackingSensors"];</code>
   * @return The activelyTrackingSensors.
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.Sensors getActivelyTrackingSensors() {
    return activelyTrackingSensors_ == null ? com.anduril.entitymanager.v1.Sensors.getDefaultInstance() : activelyTrackingSensors_;
  }
  /**
   * <pre>
   * Sensor details of the tracking entity's sensors that were active and tracking the tracked entity. This may be
   * a subset of the total sensors available on the tracking entity.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.Sensors actively_tracking_sensors = 1 [json_name = "activelyTrackingSensors"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.SensorsOrBuilder getActivelyTrackingSensorsOrBuilder() {
    return activelyTrackingSensors_ == null ? com.anduril.entitymanager.v1.Sensors.getDefaultInstance() : activelyTrackingSensors_;
  }

  public static final int LAST_MEASUREMENT_TIMESTAMP_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp lastMeasurementTimestamp_;
  /**
   * <pre>
   * Latest time that any sensor in actively_tracking_sensors detected the tracked entity.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_measurement_timestamp = 2 [json_name = "lastMeasurementTimestamp"];</code>
   * @return Whether the lastMeasurementTimestamp field is set.
   */
  @java.lang.Override
  public boolean hasLastMeasurementTimestamp() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Latest time that any sensor in actively_tracking_sensors detected the tracked entity.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_measurement_timestamp = 2 [json_name = "lastMeasurementTimestamp"];</code>
   * @return The lastMeasurementTimestamp.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getLastMeasurementTimestamp() {
    return lastMeasurementTimestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lastMeasurementTimestamp_;
  }
  /**
   * <pre>
   * Latest time that any sensor in actively_tracking_sensors detected the tracked entity.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_measurement_timestamp = 2 [json_name = "lastMeasurementTimestamp"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getLastMeasurementTimestampOrBuilder() {
    return lastMeasurementTimestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lastMeasurementTimestamp_;
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
      output.writeMessage(1, getActivelyTrackingSensors());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getLastMeasurementTimestamp());
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
        .computeMessageSize(1, getActivelyTrackingSensors());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLastMeasurementTimestamp());
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
    if (!(obj instanceof com.anduril.entitymanager.v1.TrackedBy)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.TrackedBy other = (com.anduril.entitymanager.v1.TrackedBy) obj;

    if (hasActivelyTrackingSensors() != other.hasActivelyTrackingSensors()) return false;
    if (hasActivelyTrackingSensors()) {
      if (!getActivelyTrackingSensors()
          .equals(other.getActivelyTrackingSensors())) return false;
    }
    if (hasLastMeasurementTimestamp() != other.hasLastMeasurementTimestamp()) return false;
    if (hasLastMeasurementTimestamp()) {
      if (!getLastMeasurementTimestamp()
          .equals(other.getLastMeasurementTimestamp())) return false;
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
    if (hasActivelyTrackingSensors()) {
      hash = (37 * hash) + ACTIVELY_TRACKING_SENSORS_FIELD_NUMBER;
      hash = (53 * hash) + getActivelyTrackingSensors().hashCode();
    }
    if (hasLastMeasurementTimestamp()) {
      hash = (37 * hash) + LAST_MEASUREMENT_TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getLastMeasurementTimestamp().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.TrackedBy parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.TrackedBy parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.TrackedBy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.TrackedBy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.TrackedBy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.TrackedBy parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.TrackedBy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.TrackedBy parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.entitymanager.v1.TrackedBy parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.entitymanager.v1.TrackedBy parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.TrackedBy parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.TrackedBy parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.TrackedBy prototype) {
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
   * Describes the relationship between the entity being tracked ("tracked entity") and the entity that is
   * performing the tracking ("tracking entity").
   * </pre>
   *
   * Protobuf type {@code anduril.entitymanager.v1.TrackedBy}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.TrackedBy)
      com.anduril.entitymanager.v1.TrackedByOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.RelationshipPubProto.internal_static_anduril_entitymanager_v1_TrackedBy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.RelationshipPubProto.internal_static_anduril_entitymanager_v1_TrackedBy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.TrackedBy.class, com.anduril.entitymanager.v1.TrackedBy.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.TrackedBy.newBuilder()
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
        getActivelyTrackingSensorsFieldBuilder();
        getLastMeasurementTimestampFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      activelyTrackingSensors_ = null;
      if (activelyTrackingSensorsBuilder_ != null) {
        activelyTrackingSensorsBuilder_.dispose();
        activelyTrackingSensorsBuilder_ = null;
      }
      lastMeasurementTimestamp_ = null;
      if (lastMeasurementTimestampBuilder_ != null) {
        lastMeasurementTimestampBuilder_.dispose();
        lastMeasurementTimestampBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.RelationshipPubProto.internal_static_anduril_entitymanager_v1_TrackedBy_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.TrackedBy getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.TrackedBy.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.TrackedBy build() {
      com.anduril.entitymanager.v1.TrackedBy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.TrackedBy buildPartial() {
      com.anduril.entitymanager.v1.TrackedBy result = new com.anduril.entitymanager.v1.TrackedBy(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.entitymanager.v1.TrackedBy result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.activelyTrackingSensors_ = activelyTrackingSensorsBuilder_ == null
            ? activelyTrackingSensors_
            : activelyTrackingSensorsBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.lastMeasurementTimestamp_ = lastMeasurementTimestampBuilder_ == null
            ? lastMeasurementTimestamp_
            : lastMeasurementTimestampBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.anduril.entitymanager.v1.TrackedBy) {
        return mergeFrom((com.anduril.entitymanager.v1.TrackedBy)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.TrackedBy other) {
      if (other == com.anduril.entitymanager.v1.TrackedBy.getDefaultInstance()) return this;
      if (other.hasActivelyTrackingSensors()) {
        mergeActivelyTrackingSensors(other.getActivelyTrackingSensors());
      }
      if (other.hasLastMeasurementTimestamp()) {
        mergeLastMeasurementTimestamp(other.getLastMeasurementTimestamp());
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
                  getActivelyTrackingSensorsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getLastMeasurementTimestampFieldBuilder().getBuilder(),
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

    private com.anduril.entitymanager.v1.Sensors activelyTrackingSensors_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Sensors, com.anduril.entitymanager.v1.Sensors.Builder, com.anduril.entitymanager.v1.SensorsOrBuilder> activelyTrackingSensorsBuilder_;
    /**
     * <pre>
     * Sensor details of the tracking entity's sensors that were active and tracking the tracked entity. This may be
     * a subset of the total sensors available on the tracking entity.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Sensors actively_tracking_sensors = 1 [json_name = "activelyTrackingSensors"];</code>
     * @return Whether the activelyTrackingSensors field is set.
     */
    public boolean hasActivelyTrackingSensors() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Sensor details of the tracking entity's sensors that were active and tracking the tracked entity. This may be
     * a subset of the total sensors available on the tracking entity.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Sensors actively_tracking_sensors = 1 [json_name = "activelyTrackingSensors"];</code>
     * @return The activelyTrackingSensors.
     */
    public com.anduril.entitymanager.v1.Sensors getActivelyTrackingSensors() {
      if (activelyTrackingSensorsBuilder_ == null) {
        return activelyTrackingSensors_ == null ? com.anduril.entitymanager.v1.Sensors.getDefaultInstance() : activelyTrackingSensors_;
      } else {
        return activelyTrackingSensorsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Sensor details of the tracking entity's sensors that were active and tracking the tracked entity. This may be
     * a subset of the total sensors available on the tracking entity.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Sensors actively_tracking_sensors = 1 [json_name = "activelyTrackingSensors"];</code>
     */
    public Builder setActivelyTrackingSensors(com.anduril.entitymanager.v1.Sensors value) {
      if (activelyTrackingSensorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        activelyTrackingSensors_ = value;
      } else {
        activelyTrackingSensorsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Sensor details of the tracking entity's sensors that were active and tracking the tracked entity. This may be
     * a subset of the total sensors available on the tracking entity.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Sensors actively_tracking_sensors = 1 [json_name = "activelyTrackingSensors"];</code>
     */
    public Builder setActivelyTrackingSensors(
        com.anduril.entitymanager.v1.Sensors.Builder builderForValue) {
      if (activelyTrackingSensorsBuilder_ == null) {
        activelyTrackingSensors_ = builderForValue.build();
      } else {
        activelyTrackingSensorsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Sensor details of the tracking entity's sensors that were active and tracking the tracked entity. This may be
     * a subset of the total sensors available on the tracking entity.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Sensors actively_tracking_sensors = 1 [json_name = "activelyTrackingSensors"];</code>
     */
    public Builder mergeActivelyTrackingSensors(com.anduril.entitymanager.v1.Sensors value) {
      if (activelyTrackingSensorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          activelyTrackingSensors_ != null &&
          activelyTrackingSensors_ != com.anduril.entitymanager.v1.Sensors.getDefaultInstance()) {
          getActivelyTrackingSensorsBuilder().mergeFrom(value);
        } else {
          activelyTrackingSensors_ = value;
        }
      } else {
        activelyTrackingSensorsBuilder_.mergeFrom(value);
      }
      if (activelyTrackingSensors_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Sensor details of the tracking entity's sensors that were active and tracking the tracked entity. This may be
     * a subset of the total sensors available on the tracking entity.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Sensors actively_tracking_sensors = 1 [json_name = "activelyTrackingSensors"];</code>
     */
    public Builder clearActivelyTrackingSensors() {
      bitField0_ = (bitField0_ & ~0x00000001);
      activelyTrackingSensors_ = null;
      if (activelyTrackingSensorsBuilder_ != null) {
        activelyTrackingSensorsBuilder_.dispose();
        activelyTrackingSensorsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Sensor details of the tracking entity's sensors that were active and tracking the tracked entity. This may be
     * a subset of the total sensors available on the tracking entity.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Sensors actively_tracking_sensors = 1 [json_name = "activelyTrackingSensors"];</code>
     */
    public com.anduril.entitymanager.v1.Sensors.Builder getActivelyTrackingSensorsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getActivelyTrackingSensorsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Sensor details of the tracking entity's sensors that were active and tracking the tracked entity. This may be
     * a subset of the total sensors available on the tracking entity.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Sensors actively_tracking_sensors = 1 [json_name = "activelyTrackingSensors"];</code>
     */
    public com.anduril.entitymanager.v1.SensorsOrBuilder getActivelyTrackingSensorsOrBuilder() {
      if (activelyTrackingSensorsBuilder_ != null) {
        return activelyTrackingSensorsBuilder_.getMessageOrBuilder();
      } else {
        return activelyTrackingSensors_ == null ?
            com.anduril.entitymanager.v1.Sensors.getDefaultInstance() : activelyTrackingSensors_;
      }
    }
    /**
     * <pre>
     * Sensor details of the tracking entity's sensors that were active and tracking the tracked entity. This may be
     * a subset of the total sensors available on the tracking entity.
     * </pre>
     *
     * <code>.anduril.entitymanager.v1.Sensors actively_tracking_sensors = 1 [json_name = "activelyTrackingSensors"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Sensors, com.anduril.entitymanager.v1.Sensors.Builder, com.anduril.entitymanager.v1.SensorsOrBuilder> 
        getActivelyTrackingSensorsFieldBuilder() {
      if (activelyTrackingSensorsBuilder_ == null) {
        activelyTrackingSensorsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.entitymanager.v1.Sensors, com.anduril.entitymanager.v1.Sensors.Builder, com.anduril.entitymanager.v1.SensorsOrBuilder>(
                getActivelyTrackingSensors(),
                getParentForChildren(),
                isClean());
        activelyTrackingSensors_ = null;
      }
      return activelyTrackingSensorsBuilder_;
    }

    private com.google.protobuf.Timestamp lastMeasurementTimestamp_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> lastMeasurementTimestampBuilder_;
    /**
     * <pre>
     * Latest time that any sensor in actively_tracking_sensors detected the tracked entity.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_measurement_timestamp = 2 [json_name = "lastMeasurementTimestamp"];</code>
     * @return Whether the lastMeasurementTimestamp field is set.
     */
    public boolean hasLastMeasurementTimestamp() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Latest time that any sensor in actively_tracking_sensors detected the tracked entity.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_measurement_timestamp = 2 [json_name = "lastMeasurementTimestamp"];</code>
     * @return The lastMeasurementTimestamp.
     */
    public com.google.protobuf.Timestamp getLastMeasurementTimestamp() {
      if (lastMeasurementTimestampBuilder_ == null) {
        return lastMeasurementTimestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lastMeasurementTimestamp_;
      } else {
        return lastMeasurementTimestampBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Latest time that any sensor in actively_tracking_sensors detected the tracked entity.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_measurement_timestamp = 2 [json_name = "lastMeasurementTimestamp"];</code>
     */
    public Builder setLastMeasurementTimestamp(com.google.protobuf.Timestamp value) {
      if (lastMeasurementTimestampBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lastMeasurementTimestamp_ = value;
      } else {
        lastMeasurementTimestampBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Latest time that any sensor in actively_tracking_sensors detected the tracked entity.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_measurement_timestamp = 2 [json_name = "lastMeasurementTimestamp"];</code>
     */
    public Builder setLastMeasurementTimestamp(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (lastMeasurementTimestampBuilder_ == null) {
        lastMeasurementTimestamp_ = builderForValue.build();
      } else {
        lastMeasurementTimestampBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Latest time that any sensor in actively_tracking_sensors detected the tracked entity.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_measurement_timestamp = 2 [json_name = "lastMeasurementTimestamp"];</code>
     */
    public Builder mergeLastMeasurementTimestamp(com.google.protobuf.Timestamp value) {
      if (lastMeasurementTimestampBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          lastMeasurementTimestamp_ != null &&
          lastMeasurementTimestamp_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getLastMeasurementTimestampBuilder().mergeFrom(value);
        } else {
          lastMeasurementTimestamp_ = value;
        }
      } else {
        lastMeasurementTimestampBuilder_.mergeFrom(value);
      }
      if (lastMeasurementTimestamp_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Latest time that any sensor in actively_tracking_sensors detected the tracked entity.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_measurement_timestamp = 2 [json_name = "lastMeasurementTimestamp"];</code>
     */
    public Builder clearLastMeasurementTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000002);
      lastMeasurementTimestamp_ = null;
      if (lastMeasurementTimestampBuilder_ != null) {
        lastMeasurementTimestampBuilder_.dispose();
        lastMeasurementTimestampBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Latest time that any sensor in actively_tracking_sensors detected the tracked entity.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_measurement_timestamp = 2 [json_name = "lastMeasurementTimestamp"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getLastMeasurementTimestampBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getLastMeasurementTimestampFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Latest time that any sensor in actively_tracking_sensors detected the tracked entity.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_measurement_timestamp = 2 [json_name = "lastMeasurementTimestamp"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getLastMeasurementTimestampOrBuilder() {
      if (lastMeasurementTimestampBuilder_ != null) {
        return lastMeasurementTimestampBuilder_.getMessageOrBuilder();
      } else {
        return lastMeasurementTimestamp_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : lastMeasurementTimestamp_;
      }
    }
    /**
     * <pre>
     * Latest time that any sensor in actively_tracking_sensors detected the tracked entity.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_measurement_timestamp = 2 [json_name = "lastMeasurementTimestamp"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getLastMeasurementTimestampFieldBuilder() {
      if (lastMeasurementTimestampBuilder_ == null) {
        lastMeasurementTimestampBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getLastMeasurementTimestamp(),
                getParentForChildren(),
                isClean());
        lastMeasurementTimestamp_ = null;
      }
      return lastMeasurementTimestampBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.TrackedBy)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.TrackedBy)
  private static final com.anduril.entitymanager.v1.TrackedBy DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.TrackedBy();
  }

  public static com.anduril.entitymanager.v1.TrackedBy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TrackedBy>
      PARSER = new com.google.protobuf.AbstractParser<TrackedBy>() {
    @java.lang.Override
    public TrackedBy parsePartialFrom(
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

  public static com.google.protobuf.Parser<TrackedBy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TrackedBy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.TrackedBy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

