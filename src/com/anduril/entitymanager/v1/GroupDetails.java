// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/group.pub.proto

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * Details related to grouping for this entity
 * </pre>
 *
 * Protobuf type {@code anduril.entitymanager.v1.GroupDetails}
 */
public final class GroupDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.GroupDetails)
    GroupDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GroupDetails.newBuilder() to construct.
  private GroupDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GroupDetails() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GroupDetails();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.GroupPubProto.internal_static_anduril_entitymanager_v1_GroupDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.GroupPubProto.internal_static_anduril_entitymanager_v1_GroupDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.GroupDetails.class, com.anduril.entitymanager.v1.GroupDetails.Builder.class);
  }

  private int groupTypeCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object groupType_;
  public enum GroupTypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ECHELON(3),
    GROUPTYPE_NOT_SET(0);
    private final int value;
    private GroupTypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static GroupTypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static GroupTypeCase forNumber(int value) {
      switch (value) {
        case 3: return ECHELON;
        case 0: return GROUPTYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public GroupTypeCase
  getGroupTypeCase() {
    return GroupTypeCase.forNumber(
        groupTypeCase_);
  }

  public static final int ECHELON_FIELD_NUMBER = 3;
  /**
   * <code>.anduril.entitymanager.v1.Echelon echelon = 3 [json_name = "echelon"];</code>
   * @return Whether the echelon field is set.
   */
  @java.lang.Override
  public boolean hasEchelon() {
    return groupTypeCase_ == 3;
  }
  /**
   * <code>.anduril.entitymanager.v1.Echelon echelon = 3 [json_name = "echelon"];</code>
   * @return The echelon.
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.Echelon getEchelon() {
    if (groupTypeCase_ == 3) {
       return (com.anduril.entitymanager.v1.Echelon) groupType_;
    }
    return com.anduril.entitymanager.v1.Echelon.getDefaultInstance();
  }
  /**
   * <code>.anduril.entitymanager.v1.Echelon echelon = 3 [json_name = "echelon"];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.EchelonOrBuilder getEchelonOrBuilder() {
    if (groupTypeCase_ == 3) {
       return (com.anduril.entitymanager.v1.Echelon) groupType_;
    }
    return com.anduril.entitymanager.v1.Echelon.getDefaultInstance();
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
    if (groupTypeCase_ == 3) {
      output.writeMessage(3, (com.anduril.entitymanager.v1.Echelon) groupType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (groupTypeCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (com.anduril.entitymanager.v1.Echelon) groupType_);
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
    if (!(obj instanceof com.anduril.entitymanager.v1.GroupDetails)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.GroupDetails other = (com.anduril.entitymanager.v1.GroupDetails) obj;

    if (!getGroupTypeCase().equals(other.getGroupTypeCase())) return false;
    switch (groupTypeCase_) {
      case 3:
        if (!getEchelon()
            .equals(other.getEchelon())) return false;
        break;
      case 0:
      default:
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
    switch (groupTypeCase_) {
      case 3:
        hash = (37 * hash) + ECHELON_FIELD_NUMBER;
        hash = (53 * hash) + getEchelon().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.GroupDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.GroupDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.GroupDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.GroupDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.GroupDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.GroupDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.GroupDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.GroupDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.GroupDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.GroupDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.GroupDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.GroupDetails parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.GroupDetails prototype) {
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
   * Details related to grouping for this entity
   * </pre>
   *
   * Protobuf type {@code anduril.entitymanager.v1.GroupDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.GroupDetails)
      com.anduril.entitymanager.v1.GroupDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.GroupPubProto.internal_static_anduril_entitymanager_v1_GroupDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.GroupPubProto.internal_static_anduril_entitymanager_v1_GroupDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.GroupDetails.class, com.anduril.entitymanager.v1.GroupDetails.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.GroupDetails.newBuilder()
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
      if (echelonBuilder_ != null) {
        echelonBuilder_.clear();
      }
      groupTypeCase_ = 0;
      groupType_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.GroupPubProto.internal_static_anduril_entitymanager_v1_GroupDetails_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.GroupDetails getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.GroupDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.GroupDetails build() {
      com.anduril.entitymanager.v1.GroupDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.GroupDetails buildPartial() {
      com.anduril.entitymanager.v1.GroupDetails result = new com.anduril.entitymanager.v1.GroupDetails(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.anduril.entitymanager.v1.GroupDetails result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.anduril.entitymanager.v1.GroupDetails result) {
      result.groupTypeCase_ = groupTypeCase_;
      result.groupType_ = this.groupType_;
      if (groupTypeCase_ == 3 &&
          echelonBuilder_ != null) {
        result.groupType_ = echelonBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entitymanager.v1.GroupDetails) {
        return mergeFrom((com.anduril.entitymanager.v1.GroupDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.GroupDetails other) {
      if (other == com.anduril.entitymanager.v1.GroupDetails.getDefaultInstance()) return this;
      switch (other.getGroupTypeCase()) {
        case ECHELON: {
          mergeEchelon(other.getEchelon());
          break;
        }
        case GROUPTYPE_NOT_SET: {
          break;
        }
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
            case 26: {
              input.readMessage(
                  getEchelonFieldBuilder().getBuilder(),
                  extensionRegistry);
              groupTypeCase_ = 3;
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
    private int groupTypeCase_ = 0;
    private java.lang.Object groupType_;
    public GroupTypeCase
        getGroupTypeCase() {
      return GroupTypeCase.forNumber(
          groupTypeCase_);
    }

    public Builder clearGroupType() {
      groupTypeCase_ = 0;
      groupType_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Echelon, com.anduril.entitymanager.v1.Echelon.Builder, com.anduril.entitymanager.v1.EchelonOrBuilder> echelonBuilder_;
    /**
     * <code>.anduril.entitymanager.v1.Echelon echelon = 3 [json_name = "echelon"];</code>
     * @return Whether the echelon field is set.
     */
    @java.lang.Override
    public boolean hasEchelon() {
      return groupTypeCase_ == 3;
    }
    /**
     * <code>.anduril.entitymanager.v1.Echelon echelon = 3 [json_name = "echelon"];</code>
     * @return The echelon.
     */
    @java.lang.Override
    public com.anduril.entitymanager.v1.Echelon getEchelon() {
      if (echelonBuilder_ == null) {
        if (groupTypeCase_ == 3) {
          return (com.anduril.entitymanager.v1.Echelon) groupType_;
        }
        return com.anduril.entitymanager.v1.Echelon.getDefaultInstance();
      } else {
        if (groupTypeCase_ == 3) {
          return echelonBuilder_.getMessage();
        }
        return com.anduril.entitymanager.v1.Echelon.getDefaultInstance();
      }
    }
    /**
     * <code>.anduril.entitymanager.v1.Echelon echelon = 3 [json_name = "echelon"];</code>
     */
    public Builder setEchelon(com.anduril.entitymanager.v1.Echelon value) {
      if (echelonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        groupType_ = value;
        onChanged();
      } else {
        echelonBuilder_.setMessage(value);
      }
      groupTypeCase_ = 3;
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.Echelon echelon = 3 [json_name = "echelon"];</code>
     */
    public Builder setEchelon(
        com.anduril.entitymanager.v1.Echelon.Builder builderForValue) {
      if (echelonBuilder_ == null) {
        groupType_ = builderForValue.build();
        onChanged();
      } else {
        echelonBuilder_.setMessage(builderForValue.build());
      }
      groupTypeCase_ = 3;
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.Echelon echelon = 3 [json_name = "echelon"];</code>
     */
    public Builder mergeEchelon(com.anduril.entitymanager.v1.Echelon value) {
      if (echelonBuilder_ == null) {
        if (groupTypeCase_ == 3 &&
            groupType_ != com.anduril.entitymanager.v1.Echelon.getDefaultInstance()) {
          groupType_ = com.anduril.entitymanager.v1.Echelon.newBuilder((com.anduril.entitymanager.v1.Echelon) groupType_)
              .mergeFrom(value).buildPartial();
        } else {
          groupType_ = value;
        }
        onChanged();
      } else {
        if (groupTypeCase_ == 3) {
          echelonBuilder_.mergeFrom(value);
        } else {
          echelonBuilder_.setMessage(value);
        }
      }
      groupTypeCase_ = 3;
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.Echelon echelon = 3 [json_name = "echelon"];</code>
     */
    public Builder clearEchelon() {
      if (echelonBuilder_ == null) {
        if (groupTypeCase_ == 3) {
          groupTypeCase_ = 0;
          groupType_ = null;
          onChanged();
        }
      } else {
        if (groupTypeCase_ == 3) {
          groupTypeCase_ = 0;
          groupType_ = null;
        }
        echelonBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.anduril.entitymanager.v1.Echelon echelon = 3 [json_name = "echelon"];</code>
     */
    public com.anduril.entitymanager.v1.Echelon.Builder getEchelonBuilder() {
      return getEchelonFieldBuilder().getBuilder();
    }
    /**
     * <code>.anduril.entitymanager.v1.Echelon echelon = 3 [json_name = "echelon"];</code>
     */
    @java.lang.Override
    public com.anduril.entitymanager.v1.EchelonOrBuilder getEchelonOrBuilder() {
      if ((groupTypeCase_ == 3) && (echelonBuilder_ != null)) {
        return echelonBuilder_.getMessageOrBuilder();
      } else {
        if (groupTypeCase_ == 3) {
          return (com.anduril.entitymanager.v1.Echelon) groupType_;
        }
        return com.anduril.entitymanager.v1.Echelon.getDefaultInstance();
      }
    }
    /**
     * <code>.anduril.entitymanager.v1.Echelon echelon = 3 [json_name = "echelon"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.anduril.entitymanager.v1.Echelon, com.anduril.entitymanager.v1.Echelon.Builder, com.anduril.entitymanager.v1.EchelonOrBuilder> 
        getEchelonFieldBuilder() {
      if (echelonBuilder_ == null) {
        if (!(groupTypeCase_ == 3)) {
          groupType_ = com.anduril.entitymanager.v1.Echelon.getDefaultInstance();
        }
        echelonBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.anduril.entitymanager.v1.Echelon, com.anduril.entitymanager.v1.Echelon.Builder, com.anduril.entitymanager.v1.EchelonOrBuilder>(
                (com.anduril.entitymanager.v1.Echelon) groupType_,
                getParentForChildren(),
                isClean());
        groupType_ = null;
      }
      groupTypeCase_ = 3;
      onChanged();
      return echelonBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.GroupDetails)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.GroupDetails)
  private static final com.anduril.entitymanager.v1.GroupDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.GroupDetails();
  }

  public static com.anduril.entitymanager.v1.GroupDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GroupDetails>
      PARSER = new com.google.protobuf.AbstractParser<GroupDetails>() {
    @java.lang.Override
    public GroupDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<GroupDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GroupDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.GroupDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

