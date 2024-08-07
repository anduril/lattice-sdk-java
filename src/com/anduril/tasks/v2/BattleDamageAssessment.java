// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/tasks/v2/shared/isr.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.tasks.v2;

/**
 * <pre>
 * Performs a Battle Damage Assessment (BDA). Does not map to any Task in either UCI or BREVITY.
 * </pre>
 *
 * Protobuf type {@code anduril.tasks.v2.BattleDamageAssessment}
 */
public final class BattleDamageAssessment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.tasks.v2.BattleDamageAssessment)
    BattleDamageAssessmentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BattleDamageAssessment.newBuilder() to construct.
  private BattleDamageAssessment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BattleDamageAssessment() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BattleDamageAssessment();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_BattleDamageAssessment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_BattleDamageAssessment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.tasks.v2.BattleDamageAssessment.class, com.anduril.tasks.v2.BattleDamageAssessment.Builder.class);
  }

  private int bitField0_;
  public static final int OBJECTIVE_FIELD_NUMBER = 1;
  private com.anduril.tasks.v2.Objective objective_;
  /**
   * <pre>
   * Objective to perform BDA on.
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
   * Objective to perform BDA on.
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
   * Objective to perform BDA on.
   * </pre>
   *
   * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
   */
  @java.lang.Override
  public com.anduril.tasks.v2.ObjectiveOrBuilder getObjectiveOrBuilder() {
    return objective_ == null ? com.anduril.tasks.v2.Objective.getDefaultInstance() : objective_;
  }

  public static final int PARAMETERS_FIELD_NUMBER = 2;
  private com.anduril.tasks.v2.ISRParameters parameters_;
  /**
   * <pre>
   * Optional common ISR parameters.
   * </pre>
   *
   * <code>.anduril.tasks.v2.ISRParameters parameters = 2 [json_name = "parameters"];</code>
   * @return Whether the parameters field is set.
   */
  @java.lang.Override
  public boolean hasParameters() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Optional common ISR parameters.
   * </pre>
   *
   * <code>.anduril.tasks.v2.ISRParameters parameters = 2 [json_name = "parameters"];</code>
   * @return The parameters.
   */
  @java.lang.Override
  public com.anduril.tasks.v2.ISRParameters getParameters() {
    return parameters_ == null ? com.anduril.tasks.v2.ISRParameters.getDefaultInstance() : parameters_;
  }
  /**
   * <pre>
   * Optional common ISR parameters.
   * </pre>
   *
   * <code>.anduril.tasks.v2.ISRParameters parameters = 2 [json_name = "parameters"];</code>
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
      output.writeMessage(2, getParameters());
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
        .computeMessageSize(2, getParameters());
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
    if (!(obj instanceof com.anduril.tasks.v2.BattleDamageAssessment)) {
      return super.equals(obj);
    }
    com.anduril.tasks.v2.BattleDamageAssessment other = (com.anduril.tasks.v2.BattleDamageAssessment) obj;

    if (hasObjective() != other.hasObjective()) return false;
    if (hasObjective()) {
      if (!getObjective()
          .equals(other.getObjective())) return false;
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
    if (hasParameters()) {
      hash = (37 * hash) + PARAMETERS_FIELD_NUMBER;
      hash = (53 * hash) + getParameters().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.tasks.v2.BattleDamageAssessment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.BattleDamageAssessment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.BattleDamageAssessment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.BattleDamageAssessment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.BattleDamageAssessment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.tasks.v2.BattleDamageAssessment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.tasks.v2.BattleDamageAssessment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.BattleDamageAssessment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.anduril.tasks.v2.BattleDamageAssessment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.anduril.tasks.v2.BattleDamageAssessment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.tasks.v2.BattleDamageAssessment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.tasks.v2.BattleDamageAssessment parseFrom(
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
  public static Builder newBuilder(com.anduril.tasks.v2.BattleDamageAssessment prototype) {
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
   * Performs a Battle Damage Assessment (BDA). Does not map to any Task in either UCI or BREVITY.
   * </pre>
   *
   * Protobuf type {@code anduril.tasks.v2.BattleDamageAssessment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.tasks.v2.BattleDamageAssessment)
      com.anduril.tasks.v2.BattleDamageAssessmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_BattleDamageAssessment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_BattleDamageAssessment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.tasks.v2.BattleDamageAssessment.class, com.anduril.tasks.v2.BattleDamageAssessment.Builder.class);
    }

    // Construct using com.anduril.tasks.v2.BattleDamageAssessment.newBuilder()
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
        getObjectiveFieldBuilder();
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
      return com.anduril.tasks.v2.IsrPubProto.internal_static_anduril_tasks_v2_BattleDamageAssessment_descriptor;
    }

    @java.lang.Override
    public com.anduril.tasks.v2.BattleDamageAssessment getDefaultInstanceForType() {
      return com.anduril.tasks.v2.BattleDamageAssessment.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.tasks.v2.BattleDamageAssessment build() {
      com.anduril.tasks.v2.BattleDamageAssessment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.tasks.v2.BattleDamageAssessment buildPartial() {
      com.anduril.tasks.v2.BattleDamageAssessment result = new com.anduril.tasks.v2.BattleDamageAssessment(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.tasks.v2.BattleDamageAssessment result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.objective_ = objectiveBuilder_ == null
            ? objective_
            : objectiveBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.parameters_ = parametersBuilder_ == null
            ? parameters_
            : parametersBuilder_.build();
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
      if (other instanceof com.anduril.tasks.v2.BattleDamageAssessment) {
        return mergeFrom((com.anduril.tasks.v2.BattleDamageAssessment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.tasks.v2.BattleDamageAssessment other) {
      if (other == com.anduril.tasks.v2.BattleDamageAssessment.getDefaultInstance()) return this;
      if (other.hasObjective()) {
        mergeObjective(other.getObjective());
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
                  getParametersFieldBuilder().getBuilder(),
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

    private com.anduril.tasks.v2.Objective objective_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.tasks.v2.Objective, com.anduril.tasks.v2.Objective.Builder, com.anduril.tasks.v2.ObjectiveOrBuilder> objectiveBuilder_;
    /**
     * <pre>
     * Objective to perform BDA on.
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
     * Objective to perform BDA on.
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
     * Objective to perform BDA on.
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
     * Objective to perform BDA on.
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
     * Objective to perform BDA on.
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
     * Objective to perform BDA on.
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
     * Objective to perform BDA on.
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
     * Objective to perform BDA on.
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
     * Objective to perform BDA on.
     * </pre>
     *
     * <code>.anduril.tasks.v2.Objective objective = 1 [json_name = "objective"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.tasks.v2.Objective, com.anduril.tasks.v2.Objective.Builder, com.anduril.tasks.v2.ObjectiveOrBuilder> 
        getObjectiveFieldBuilder() {
      if (objectiveBuilder_ == null) {
        objectiveBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.tasks.v2.Objective, com.anduril.tasks.v2.Objective.Builder, com.anduril.tasks.v2.ObjectiveOrBuilder>(
                getObjective(),
                getParentForChildren(),
                isClean());
        objective_ = null;
      }
      return objectiveBuilder_;
    }

    private com.anduril.tasks.v2.ISRParameters parameters_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.tasks.v2.ISRParameters, com.anduril.tasks.v2.ISRParameters.Builder, com.anduril.tasks.v2.ISRParametersOrBuilder> parametersBuilder_;
    /**
     * <pre>
     * Optional common ISR parameters.
     * </pre>
     *
     * <code>.anduril.tasks.v2.ISRParameters parameters = 2 [json_name = "parameters"];</code>
     * @return Whether the parameters field is set.
     */
    public boolean hasParameters() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Optional common ISR parameters.
     * </pre>
     *
     * <code>.anduril.tasks.v2.ISRParameters parameters = 2 [json_name = "parameters"];</code>
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
     * </pre>
     *
     * <code>.anduril.tasks.v2.ISRParameters parameters = 2 [json_name = "parameters"];</code>
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
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional common ISR parameters.
     * </pre>
     *
     * <code>.anduril.tasks.v2.ISRParameters parameters = 2 [json_name = "parameters"];</code>
     */
    public Builder setParameters(
        com.anduril.tasks.v2.ISRParameters.Builder builderForValue) {
      if (parametersBuilder_ == null) {
        parameters_ = builderForValue.build();
      } else {
        parametersBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional common ISR parameters.
     * </pre>
     *
     * <code>.anduril.tasks.v2.ISRParameters parameters = 2 [json_name = "parameters"];</code>
     */
    public Builder mergeParameters(com.anduril.tasks.v2.ISRParameters value) {
      if (parametersBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
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
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Optional common ISR parameters.
     * </pre>
     *
     * <code>.anduril.tasks.v2.ISRParameters parameters = 2 [json_name = "parameters"];</code>
     */
    public Builder clearParameters() {
      bitField0_ = (bitField0_ & ~0x00000002);
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
     * </pre>
     *
     * <code>.anduril.tasks.v2.ISRParameters parameters = 2 [json_name = "parameters"];</code>
     */
    public com.anduril.tasks.v2.ISRParameters.Builder getParametersBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getParametersFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional common ISR parameters.
     * </pre>
     *
     * <code>.anduril.tasks.v2.ISRParameters parameters = 2 [json_name = "parameters"];</code>
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
     * </pre>
     *
     * <code>.anduril.tasks.v2.ISRParameters parameters = 2 [json_name = "parameters"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.tasks.v2.ISRParameters, com.anduril.tasks.v2.ISRParameters.Builder, com.anduril.tasks.v2.ISRParametersOrBuilder> 
        getParametersFieldBuilder() {
      if (parametersBuilder_ == null) {
        parametersBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.tasks.v2.ISRParameters, com.anduril.tasks.v2.ISRParameters.Builder, com.anduril.tasks.v2.ISRParametersOrBuilder>(
                getParameters(),
                getParentForChildren(),
                isClean());
        parameters_ = null;
      }
      return parametersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.tasks.v2.BattleDamageAssessment)
  }

  // @@protoc_insertion_point(class_scope:anduril.tasks.v2.BattleDamageAssessment)
  private static final com.anduril.tasks.v2.BattleDamageAssessment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.tasks.v2.BattleDamageAssessment();
  }

  public static com.anduril.tasks.v2.BattleDamageAssessment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BattleDamageAssessment>
      PARSER = new com.google.protobuf.AbstractParser<BattleDamageAssessment>() {
    @java.lang.Override
    public BattleDamageAssessment parsePartialFrom(
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

  public static com.google.protobuf.Parser<BattleDamageAssessment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BattleDamageAssessment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.tasks.v2.BattleDamageAssessment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

