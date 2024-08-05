// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/tasks/v2/shared/isr.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.tasks.v2;

/**
 * <pre>
 * Maps to the Loiter behavior within the FlightTask type within UCI v2.
 * </pre>
 *
 * Protobuf type {@code anduril.tasks.v2.Loiter}
 */
public final class Loiter extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:anduril.tasks.v2.Loiter)
    LoiterOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      Loiter.class.getName());
  }
  // Use Loiter.newBuilder() to construct.
  private Loiter(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Loiter() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_Loiter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_Loiter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.tasks.v2.Loiter.class, com.anduril.tasks.v2.Loiter.Builder.class);
  }

  private int bitField0_;
  public static final int OBJECTIVE_FIELD_NUMBER = 1;
  private com.anduril.tasks.v2.Objective objective_;
  /**
   * <pre>
   * Indicates where to perform the loiter.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
   * @return Whether the objective field is set.
   */
  @java.lang.Override
  public boolean hasObjective() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Indicates where to perform the loiter.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
   * @return The objective.
   */
  @java.lang.Override
  public com.anduril.tasks.v2.Objective getObjective() {
    return objective_ == null ? com.anduril.tasks.v2.Objective.getDefaultInstance() : objective_;
  }
  /**
   * <pre>
   * Indicates where to perform the loiter.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
   */
  @java.lang.Override
  public com.anduril.tasks.v2.ObjectiveOrBuilder getObjectiveOrBuilder() {
    return objective_ == null ? com.anduril.tasks.v2.Objective.getDefaultInstance() : objective_;
  }

  public static final int LOITER_TYPE_FIELD_NUMBER = 2;
  private com.anduril.tasks.v2.LoiterType loiterType_;
  /**
   * <pre>
   * Specifies the details of the loiter.
   * </pre>
   *
   * <code>.anduril.tasks.v2.LoiterType loiter_type = 2 [json_name = "loiterType"];</code>
   * @return Whether the loiterType field is set.
   */
  @java.lang.Override
  public boolean hasLoiterType() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Specifies the details of the loiter.
   * </pre>
   *
   * <code>.anduril.tasks.v2.LoiterType loiter_type = 2 [json_name = "loiterType"];</code>
   * @return The loiterType.
   */
  @java.lang.Override
  public com.anduril.tasks.v2.LoiterType getLoiterType() {
    return loiterType_ == null ? com.anduril.tasks.v2.LoiterType.getDefaultInstance() : loiterType_;
  }
  /**
   * <pre>
   * Specifies the details of the loiter.
   * </pre>
   *
   * <code>.anduril.tasks.v2.LoiterType loiter_type = 2 [json_name = "loiterType"];</code>
   */
  @java.lang.Override
  public com.anduril.tasks.v2.LoiterTypeOrBuilder getLoiterTypeOrBuilder() {
    return loiterType_ == null ? com.anduril.tasks.v2.LoiterType.getDefaultInstance() : loiterType_;
  }

  public static final int PARAMETERS_FIELD_NUMBER = 3;
  private com.anduril.tasks.v2.ISRParameters parameters_;
  /**
   * <pre>
   * Optional common ISR parameters.
   * The loiter radius and bearing should be inferred from the standoff_distance and standoff_angle respectively.
   * </pre>
   *
   * <code>.anduril.tasks.v2.ISRParameters parameters = 3 [json_name = "parameters"];</code>
   * @return Whether the parameters field is set.
   */
  @java.lang.Override
  public boolean hasParameters() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Optional common ISR parameters.
   * The loiter radius and bearing should be inferred from the standoff_distance and standoff_angle respectively.
   * </pre>
   *
   * <code>.anduril.tasks.v2.ISRParameters parameters = 3 [json_name = "parameters"];</code>
   * @return The parameters.
   */
  @java.lang.Override
  public com.anduril.tasks.v2.ISRParameters getParameters() {
    return parameters_ == null ? com.anduril.tasks.v2.ISRParameters.getDefaultInstance() : parameters_;
  }
  /**
   * <pre>
   * Optional common ISR parameters.
   * The loiter radius and bearing should be inferred from the standoff_distance and standoff_angle respectively.
   * </pre>
   *
   * <code>.anduril.tasks.v2.ISRParameters parameters = 3 [json_name = "parameters"];</code>
   */
  @java.lang.Override
  public com.anduril.tasks.v2.ISRParametersOrBuilder getParametersOrBuilder() {
    return parameters_ == null ? com.anduril.tasks.v2.ISRParameters.getDefaultInstance() : parameters_;
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
      output.writeMessage(1, getObjective());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getLoiterType());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(3, getParameters());
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
        .computeMessageSize(1, getObjective());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLoiterType());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getParameters());
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
    if (!(obj instanceof com.anduril.tasks.v2.Loiter)) {
      return super.equals(obj);
    }
    com.anduril.tasks.v2.Loiter other = (com.anduril.tasks.v2.Loiter) obj;

    if (hasObjective() != other.hasObjective()) return false;
    if (hasObjective()) {
      if (!getObjective()
          .equals(other.getObjective())) return false;
    }
    if (hasLoiterType() != other.hasLoiterType()) return false;
    if (hasLoiterType()) {
      if (!getLoiterType()
          .equals(other.getLoiterType())) return false;
    }
    if (hasParameters() != other.hasParameters()) return false;
    if (hasParameters()) {
      if (!getParameters()
          .equals(other.getParameters())) return false;
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
    if (hasObjective()) {
      hash = (37 * hash) + OBJECTIVE_FIELD_NUMBER;
      hash = (53 * hash) + getObjective().hashCode();
    }
    if (hasLoiterType()) {
      hash = (37 * hash) + LOITER_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getLoiterType().hashCode();
    }
    if (hasParameters()) {
      hash = (37 * hash) + PARAMETERS_FIELD_NUMBER;
      hash = (53 * hash) + getParameters().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.tasks.v2.Loiter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.Loiter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.Loiter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.Loiter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.Loiter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.Loiter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.Loiter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.Loiter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.tasks.v2.Loiter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.tasks.v2.Loiter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.tasks.v2.Loiter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.Loiter parseFrom(
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
  public static Builder newBuilder(com.anduril.tasks.v2.Loiter prototype) {
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
   * Maps to the Loiter behavior within the FlightTask type within UCI v2.
   * </pre>
   *
   * Protobuf type {@code anduril.tasks.v2.Loiter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.tasks.v2.Loiter)
      com.anduril.tasks.v2.LoiterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_Loiter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_Loiter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.tasks.v2.Loiter.class, com.anduril.tasks.v2.Loiter.Builder.class);
    }

    // Construct using com.anduril.tasks.v2.Loiter.newBuilder()
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
        getObjectiveFieldBuilder();
        getLoiterTypeFieldBuilder();
        getParametersFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      objective_ = null;
      if (objectiveBuilder_ != null) {
        objectiveBuilder_.dispose();
        objectiveBuilder_ = null;
      }
      loiterType_ = null;
      if (loiterTypeBuilder_ != null) {
        loiterTypeBuilder_.dispose();
        loiterTypeBuilder_ = null;
      }
      parameters_ = null;
      if (parametersBuilder_ != null) {
        parametersBuilder_.dispose();
        parametersBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_Loiter_descriptor;
    }

    @java.lang.Override
    public com.anduril.tasks.v2.Loiter getDefaultInstanceForType() {
      return com.anduril.tasks.v2.Loiter.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.tasks.v2.Loiter build() {
      com.anduril.tasks.v2.Loiter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.tasks.v2.Loiter buildPartial() {
      com.anduril.tasks.v2.Loiter result = new com.anduril.tasks.v2.Loiter(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.tasks.v2.Loiter result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.objective_ = objectiveBuilder_ == null
            ? objective_
            : objectiveBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.loiterType_ = loiterTypeBuilder_ == null
            ? loiterType_
            : loiterTypeBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.parameters_ = parametersBuilder_ == null
            ? parameters_
            : parametersBuilder_.build();
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.tasks.v2.Loiter) {
        return mergeFrom((com.anduril.tasks.v2.Loiter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.tasks.v2.Loiter other) {
      if (other == com.anduril.tasks.v2.Loiter.getDefaultInstance()) return this;
      if (other.hasObjective()) {
        mergeObjective(other.getObjective());
      }
      if (other.hasLoiterType()) {
        mergeLoiterType(other.getLoiterType());
      }
      if (other.hasParameters()) {
        mergeParameters(other.getParameters());
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
                  getObjectiveFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getLoiterTypeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getParametersFieldBuilder().getBuilder(),
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

    private com.anduril.tasks.v2.Objective objective_;
    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.tasks.v2.Objective, com.anduril.tasks.v2.Objective.Builder, com.anduril.tasks.v2.ObjectiveOrBuilder> objectiveBuilder_;
    /**
     * <pre>
     * Indicates where to perform the loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
     * @return Whether the objective field is set.
     */
    public boolean hasObjective() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Indicates where to perform the loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
     * @return The objective.
     */
    public com.anduril.tasks.v2.Objective getObjective() {
      if (objectiveBuilder_ == null) {
        return objective_ == null ? com.anduril.tasks.v2.Objective.getDefaultInstance() : objective_;
      } else {
        return objectiveBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Indicates where to perform the loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
     */
    public Builder setObjective(com.anduril.tasks.v2.Objective value) {
      if (objectiveBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        objective_ = value;
      } else {
        objectiveBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates where to perform the loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
     */
    public Builder setObjective(
        com.anduril.tasks.v2.Objective.Builder builderForValue) {
      if (objectiveBuilder_ == null) {
        objective_ = builderForValue.build();
      } else {
        objectiveBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates where to perform the loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
     */
    public Builder mergeObjective(com.anduril.tasks.v2.Objective value) {
      if (objectiveBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          objective_ != null &&
          objective_ != com.anduril.tasks.v2.Objective.getDefaultInstance()) {
          getObjectiveBuilder().mergeFrom(value);
        } else {
          objective_ = value;
        }
      } else {
        objectiveBuilder_.mergeFrom(value);
      }
      if (objective_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Indicates where to perform the loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
     */
    public Builder clearObjective() {
      bitField0_ = (bitField0_ & ~0x00000001);
      objective_ = null;
      if (objectiveBuilder_ != null) {
        objectiveBuilder_.dispose();
        objectiveBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates where to perform the loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
     */
    public com.anduril.tasks.v2.Objective.Builder getObjectiveBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getObjectiveFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Indicates where to perform the loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
     */
    public com.anduril.tasks.v2.ObjectiveOrBuilder getObjectiveOrBuilder() {
      if (objectiveBuilder_ != null) {
        return objectiveBuilder_.getMessageOrBuilder();
      } else {
        return objective_ == null ?
            com.anduril.tasks.v2.Objective.getDefaultInstance() : objective_;
      }
    }
    /**
     * <pre>
     * Indicates where to perform the loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.tasks.v2.Objective, com.anduril.tasks.v2.Objective.Builder, com.anduril.tasks.v2.ObjectiveOrBuilder> 
        getObjectiveFieldBuilder() {
      if (objectiveBuilder_ == null) {
        objectiveBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.anduril.tasks.v2.Objective, com.anduril.tasks.v2.Objective.Builder, com.anduril.tasks.v2.ObjectiveOrBuilder>(
                getObjective(),
                getParentForChildren(),
                isClean());
        objective_ = null;
      }
      return objectiveBuilder_;
    }

    private com.anduril.tasks.v2.LoiterType loiterType_;
    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.tasks.v2.LoiterType, com.anduril.tasks.v2.LoiterType.Builder, com.anduril.tasks.v2.LoiterTypeOrBuilder> loiterTypeBuilder_;
    /**
     * <pre>
     * Specifies the details of the loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.LoiterType loiter_type = 2 [json_name = "loiterType"];</code>
     * @return Whether the loiterType field is set.
     */
    public boolean hasLoiterType() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Specifies the details of the loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.LoiterType loiter_type = 2 [json_name = "loiterType"];</code>
     * @return The loiterType.
     */
    public com.anduril.tasks.v2.LoiterType getLoiterType() {
      if (loiterTypeBuilder_ == null) {
        return loiterType_ == null ? com.anduril.tasks.v2.LoiterType.getDefaultInstance() : loiterType_;
      } else {
        return loiterTypeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Specifies the details of the loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.LoiterType loiter_type = 2 [json_name = "loiterType"];</code>
     */
    public Builder setLoiterType(com.anduril.tasks.v2.LoiterType value) {
      if (loiterTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        loiterType_ = value;
      } else {
        loiterTypeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the details of the loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.LoiterType loiter_type = 2 [json_name = "loiterType"];</code>
     */
    public Builder setLoiterType(
        com.anduril.tasks.v2.LoiterType.Builder builderForValue) {
      if (loiterTypeBuilder_ == null) {
        loiterType_ = builderForValue.build();
      } else {
        loiterTypeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the details of the loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.LoiterType loiter_type = 2 [json_name = "loiterType"];</code>
     */
    public Builder mergeLoiterType(com.anduril.tasks.v2.LoiterType value) {
      if (loiterTypeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          loiterType_ != null &&
          loiterType_ != com.anduril.tasks.v2.LoiterType.getDefaultInstance()) {
          getLoiterTypeBuilder().mergeFrom(value);
        } else {
          loiterType_ = value;
        }
      } else {
        loiterTypeBuilder_.mergeFrom(value);
      }
      if (loiterType_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Specifies the details of the loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.LoiterType loiter_type = 2 [json_name = "loiterType"];</code>
     */
    public Builder clearLoiterType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      loiterType_ = null;
      if (loiterTypeBuilder_ != null) {
        loiterTypeBuilder_.dispose();
        loiterTypeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the details of the loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.LoiterType loiter_type = 2 [json_name = "loiterType"];</code>
     */
    public com.anduril.tasks.v2.LoiterType.Builder getLoiterTypeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getLoiterTypeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Specifies the details of the loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.LoiterType loiter_type = 2 [json_name = "loiterType"];</code>
     */
    public com.anduril.tasks.v2.LoiterTypeOrBuilder getLoiterTypeOrBuilder() {
      if (loiterTypeBuilder_ != null) {
        return loiterTypeBuilder_.getMessageOrBuilder();
      } else {
        return loiterType_ == null ?
            com.anduril.tasks.v2.LoiterType.getDefaultInstance() : loiterType_;
      }
    }
    /**
     * <pre>
     * Specifies the details of the loiter.
     * </pre>
     *
     * <code>.anduril.tasks.v2.LoiterType loiter_type = 2 [json_name = "loiterType"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.tasks.v2.LoiterType, com.anduril.tasks.v2.LoiterType.Builder, com.anduril.tasks.v2.LoiterTypeOrBuilder> 
        getLoiterTypeFieldBuilder() {
      if (loiterTypeBuilder_ == null) {
        loiterTypeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.anduril.tasks.v2.LoiterType, com.anduril.tasks.v2.LoiterType.Builder, com.anduril.tasks.v2.LoiterTypeOrBuilder>(
                getLoiterType(),
                getParentForChildren(),
                isClean());
        loiterType_ = null;
      }
      return loiterTypeBuilder_;
    }

    private com.anduril.tasks.v2.ISRParameters parameters_;
    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.tasks.v2.ISRParameters, com.anduril.tasks.v2.ISRParameters.Builder, com.anduril.tasks.v2.ISRParametersOrBuilder> parametersBuilder_;
    /**
     * <pre>
     * Optional common ISR parameters.
     * The loiter radius and bearing should be inferred from the standoff_distance and standoff_angle respectively.
     * </pre>
     *
     * <code>.anduril.tasks.v2.ISRParameters parameters = 3 [json_name = "parameters"];</code>
     * @return Whether the parameters field is set.
     */
    public boolean hasParameters() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Optional common ISR parameters.
     * The loiter radius and bearing should be inferred from the standoff_distance and standoff_angle respectively.
     * </pre>
     *
     * <code>.anduril.tasks.v2.ISRParameters parameters = 3 [json_name = "parameters"];</code>
     * @return The parameters.
     */
    public com.anduril.tasks.v2.ISRParameters getParameters() {
      if (parametersBuilder_ == null) {
        return parameters_ == null ? com.anduril.tasks.v2.ISRParameters.getDefaultInstance() : parameters_;
      } else {
        return parametersBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional common ISR parameters.
     * The loiter radius and bearing should be inferred from the standoff_distance and standoff_angle respectively.
     * </pre>
     *
     * <code>.anduril.tasks.v2.ISRParameters parameters = 3 [json_name = "parameters"];</code>
     */
    public Builder setParameters(com.anduril.tasks.v2.ISRParameters value) {
      if (parametersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        parameters_ = value;
      } else {
        parametersBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional common ISR parameters.
     * The loiter radius and bearing should be inferred from the standoff_distance and standoff_angle respectively.
     * </pre>
     *
     * <code>.anduril.tasks.v2.ISRParameters parameters = 3 [json_name = "parameters"];</code>
     */
    public Builder setParameters(
        com.anduril.tasks.v2.ISRParameters.Builder builderForValue) {
      if (parametersBuilder_ == null) {
        parameters_ = builderForValue.build();
      } else {
        parametersBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional common ISR parameters.
     * The loiter radius and bearing should be inferred from the standoff_distance and standoff_angle respectively.
     * </pre>
     *
     * <code>.anduril.tasks.v2.ISRParameters parameters = 3 [json_name = "parameters"];</code>
     */
    public Builder mergeParameters(com.anduril.tasks.v2.ISRParameters value) {
      if (parametersBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          parameters_ != null &&
          parameters_ != com.anduril.tasks.v2.ISRParameters.getDefaultInstance()) {
          getParametersBuilder().mergeFrom(value);
        } else {
          parameters_ = value;
        }
      } else {
        parametersBuilder_.mergeFrom(value);
      }
      if (parameters_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Optional common ISR parameters.
     * The loiter radius and bearing should be inferred from the standoff_distance and standoff_angle respectively.
     * </pre>
     *
     * <code>.anduril.tasks.v2.ISRParameters parameters = 3 [json_name = "parameters"];</code>
     */
    public Builder clearParameters() {
      bitField0_ = (bitField0_ & ~0x00000004);
      parameters_ = null;
      if (parametersBuilder_ != null) {
        parametersBuilder_.dispose();
        parametersBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional common ISR parameters.
     * The loiter radius and bearing should be inferred from the standoff_distance and standoff_angle respectively.
     * </pre>
     *
     * <code>.anduril.tasks.v2.ISRParameters parameters = 3 [json_name = "parameters"];</code>
     */
    public com.anduril.tasks.v2.ISRParameters.Builder getParametersBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getParametersFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional common ISR parameters.
     * The loiter radius and bearing should be inferred from the standoff_distance and standoff_angle respectively.
     * </pre>
     *
     * <code>.anduril.tasks.v2.ISRParameters parameters = 3 [json_name = "parameters"];</code>
     */
    public com.anduril.tasks.v2.ISRParametersOrBuilder getParametersOrBuilder() {
      if (parametersBuilder_ != null) {
        return parametersBuilder_.getMessageOrBuilder();
      } else {
        return parameters_ == null ?
            com.anduril.tasks.v2.ISRParameters.getDefaultInstance() : parameters_;
      }
    }
    /**
     * <pre>
     * Optional common ISR parameters.
     * The loiter radius and bearing should be inferred from the standoff_distance and standoff_angle respectively.
     * </pre>
     *
     * <code>.anduril.tasks.v2.ISRParameters parameters = 3 [json_name = "parameters"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.anduril.tasks.v2.ISRParameters, com.anduril.tasks.v2.ISRParameters.Builder, com.anduril.tasks.v2.ISRParametersOrBuilder> 
        getParametersFieldBuilder() {
      if (parametersBuilder_ == null) {
        parametersBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.anduril.tasks.v2.ISRParameters, com.anduril.tasks.v2.ISRParameters.Builder, com.anduril.tasks.v2.ISRParametersOrBuilder>(
                getParameters(),
                getParentForChildren(),
                isClean());
        parameters_ = null;
      }
      return parametersBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:anduril.tasks.v2.Loiter)
  }

  // @@protoc_insertion_point(class_scope:anduril.tasks.v2.Loiter)
  private static final com.anduril.tasks.v2.Loiter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.tasks.v2.Loiter();
  }

  public static com.anduril.tasks.v2.Loiter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Loiter>
      PARSER = new com.google.protobuf.AbstractParser<Loiter>() {
    @java.lang.Override
    public Loiter parsePartialFrom(
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

  public static com.google.protobuf.Parser<Loiter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Loiter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.tasks.v2.Loiter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

