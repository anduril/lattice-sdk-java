// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/supplies.pub.proto

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * Represents the state of supplies associated with an entity (available but not in condition to use immediately)
 * </pre>
 *
 * Protobuf type {@code anduril.entitymanager.v1.Supplies}
 */
public final class Supplies extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:anduril.entitymanager.v1.Supplies)
    SuppliesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Supplies.newBuilder() to construct.
  private Supplies(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Supplies() {
    fuel_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Supplies();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.SuppliesPubProto.internal_static_anduril_entitymanager_v1_Supplies_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.anduril.entitymanager.v1.SuppliesPubProto.internal_static_anduril_entitymanager_v1_Supplies_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.anduril.entitymanager.v1.Supplies.class, com.anduril.entitymanager.v1.Supplies.Builder.class);
  }

  public static final int FUEL_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.anduril.entitymanager.v1.Fuel> fuel_;
  /**
   * <code>repeated .anduril.entitymanager.v1.Fuel fuel = 2 [json_name = "fuel", (.anduril.entitymanager.v1.overridable) = true];</code>
   */
  @java.lang.Override
  public java.util.List<com.anduril.entitymanager.v1.Fuel> getFuelList() {
    return fuel_;
  }
  /**
   * <code>repeated .anduril.entitymanager.v1.Fuel fuel = 2 [json_name = "fuel", (.anduril.entitymanager.v1.overridable) = true];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.anduril.entitymanager.v1.FuelOrBuilder> 
      getFuelOrBuilderList() {
    return fuel_;
  }
  /**
   * <code>repeated .anduril.entitymanager.v1.Fuel fuel = 2 [json_name = "fuel", (.anduril.entitymanager.v1.overridable) = true];</code>
   */
  @java.lang.Override
  public int getFuelCount() {
    return fuel_.size();
  }
  /**
   * <code>repeated .anduril.entitymanager.v1.Fuel fuel = 2 [json_name = "fuel", (.anduril.entitymanager.v1.overridable) = true];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.Fuel getFuel(int index) {
    return fuel_.get(index);
  }
  /**
   * <code>repeated .anduril.entitymanager.v1.Fuel fuel = 2 [json_name = "fuel", (.anduril.entitymanager.v1.overridable) = true];</code>
   */
  @java.lang.Override
  public com.anduril.entitymanager.v1.FuelOrBuilder getFuelOrBuilder(
      int index) {
    return fuel_.get(index);
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
    for (int i = 0; i < fuel_.size(); i++) {
      output.writeMessage(2, fuel_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < fuel_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, fuel_.get(i));
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
    if (!(obj instanceof com.anduril.entitymanager.v1.Supplies)) {
      return super.equals(obj);
    }
    com.anduril.entitymanager.v1.Supplies other = (com.anduril.entitymanager.v1.Supplies) obj;

    if (!getFuelList()
        .equals(other.getFuelList())) return false;
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
    if (getFuelCount() > 0) {
      hash = (37 * hash) + FUEL_FIELD_NUMBER;
      hash = (53 * hash) + getFuelList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.anduril.entitymanager.v1.Supplies parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.Supplies parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Supplies parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.Supplies parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Supplies parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.anduril.entitymanager.v1.Supplies parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Supplies parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.Supplies parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Supplies parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.Supplies parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.anduril.entitymanager.v1.Supplies parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.anduril.entitymanager.v1.Supplies parseFrom(
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
  public static Builder newBuilder(com.anduril.entitymanager.v1.Supplies prototype) {
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
   * Represents the state of supplies associated with an entity (available but not in condition to use immediately)
   * </pre>
   *
   * Protobuf type {@code anduril.entitymanager.v1.Supplies}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:anduril.entitymanager.v1.Supplies)
      com.anduril.entitymanager.v1.SuppliesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.anduril.entitymanager.v1.SuppliesPubProto.internal_static_anduril_entitymanager_v1_Supplies_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.anduril.entitymanager.v1.SuppliesPubProto.internal_static_anduril_entitymanager_v1_Supplies_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.anduril.entitymanager.v1.Supplies.class, com.anduril.entitymanager.v1.Supplies.Builder.class);
    }

    // Construct using com.anduril.entitymanager.v1.Supplies.newBuilder()
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
      if (fuelBuilder_ == null) {
        fuel_ = java.util.Collections.emptyList();
      } else {
        fuel_ = null;
        fuelBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.anduril.entitymanager.v1.SuppliesPubProto.internal_static_anduril_entitymanager_v1_Supplies_descriptor;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.Supplies getDefaultInstanceForType() {
      return com.anduril.entitymanager.v1.Supplies.getDefaultInstance();
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.Supplies build() {
      com.anduril.entitymanager.v1.Supplies result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.anduril.entitymanager.v1.Supplies buildPartial() {
      com.anduril.entitymanager.v1.Supplies result = new com.anduril.entitymanager.v1.Supplies(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.anduril.entitymanager.v1.Supplies result) {
      if (fuelBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          fuel_ = java.util.Collections.unmodifiableList(fuel_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fuel_ = fuel_;
      } else {
        result.fuel_ = fuelBuilder_.build();
      }
    }

    private void buildPartial0(com.anduril.entitymanager.v1.Supplies result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.anduril.entitymanager.v1.Supplies) {
        return mergeFrom((com.anduril.entitymanager.v1.Supplies)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.anduril.entitymanager.v1.Supplies other) {
      if (other == com.anduril.entitymanager.v1.Supplies.getDefaultInstance()) return this;
      if (fuelBuilder_ == null) {
        if (!other.fuel_.isEmpty()) {
          if (fuel_.isEmpty()) {
            fuel_ = other.fuel_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFuelIsMutable();
            fuel_.addAll(other.fuel_);
          }
          onChanged();
        }
      } else {
        if (!other.fuel_.isEmpty()) {
          if (fuelBuilder_.isEmpty()) {
            fuelBuilder_.dispose();
            fuelBuilder_ = null;
            fuel_ = other.fuel_;
            bitField0_ = (bitField0_ & ~0x00000001);
            fuelBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFuelFieldBuilder() : null;
          } else {
            fuelBuilder_.addAllMessages(other.fuel_);
          }
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
            case 18: {
              com.anduril.entitymanager.v1.Fuel m =
                  input.readMessage(
                      com.anduril.entitymanager.v1.Fuel.parser(),
                      extensionRegistry);
              if (fuelBuilder_ == null) {
                ensureFuelIsMutable();
                fuel_.add(m);
              } else {
                fuelBuilder_.addMessage(m);
              }
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

    private java.util.List<com.anduril.entitymanager.v1.Fuel> fuel_ =
      java.util.Collections.emptyList();
    private void ensureFuelIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fuel_ = new java.util.ArrayList<com.anduril.entitymanager.v1.Fuel>(fuel_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.anduril.entitymanager.v1.Fuel, com.anduril.entitymanager.v1.Fuel.Builder, com.anduril.entitymanager.v1.FuelOrBuilder> fuelBuilder_;

    /**
     * <code>repeated .anduril.entitymanager.v1.Fuel fuel = 2 [json_name = "fuel", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public java.util.List<com.anduril.entitymanager.v1.Fuel> getFuelList() {
      if (fuelBuilder_ == null) {
        return java.util.Collections.unmodifiableList(fuel_);
      } else {
        return fuelBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Fuel fuel = 2 [json_name = "fuel", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public int getFuelCount() {
      if (fuelBuilder_ == null) {
        return fuel_.size();
      } else {
        return fuelBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Fuel fuel = 2 [json_name = "fuel", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public com.anduril.entitymanager.v1.Fuel getFuel(int index) {
      if (fuelBuilder_ == null) {
        return fuel_.get(index);
      } else {
        return fuelBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Fuel fuel = 2 [json_name = "fuel", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public Builder setFuel(
        int index, com.anduril.entitymanager.v1.Fuel value) {
      if (fuelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFuelIsMutable();
        fuel_.set(index, value);
        onChanged();
      } else {
        fuelBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Fuel fuel = 2 [json_name = "fuel", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public Builder setFuel(
        int index, com.anduril.entitymanager.v1.Fuel.Builder builderForValue) {
      if (fuelBuilder_ == null) {
        ensureFuelIsMutable();
        fuel_.set(index, builderForValue.build());
        onChanged();
      } else {
        fuelBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Fuel fuel = 2 [json_name = "fuel", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public Builder addFuel(com.anduril.entitymanager.v1.Fuel value) {
      if (fuelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFuelIsMutable();
        fuel_.add(value);
        onChanged();
      } else {
        fuelBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Fuel fuel = 2 [json_name = "fuel", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public Builder addFuel(
        int index, com.anduril.entitymanager.v1.Fuel value) {
      if (fuelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFuelIsMutable();
        fuel_.add(index, value);
        onChanged();
      } else {
        fuelBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Fuel fuel = 2 [json_name = "fuel", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public Builder addFuel(
        com.anduril.entitymanager.v1.Fuel.Builder builderForValue) {
      if (fuelBuilder_ == null) {
        ensureFuelIsMutable();
        fuel_.add(builderForValue.build());
        onChanged();
      } else {
        fuelBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Fuel fuel = 2 [json_name = "fuel", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public Builder addFuel(
        int index, com.anduril.entitymanager.v1.Fuel.Builder builderForValue) {
      if (fuelBuilder_ == null) {
        ensureFuelIsMutable();
        fuel_.add(index, builderForValue.build());
        onChanged();
      } else {
        fuelBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Fuel fuel = 2 [json_name = "fuel", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public Builder addAllFuel(
        java.lang.Iterable<? extends com.anduril.entitymanager.v1.Fuel> values) {
      if (fuelBuilder_ == null) {
        ensureFuelIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fuel_);
        onChanged();
      } else {
        fuelBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Fuel fuel = 2 [json_name = "fuel", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public Builder clearFuel() {
      if (fuelBuilder_ == null) {
        fuel_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        fuelBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Fuel fuel = 2 [json_name = "fuel", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public Builder removeFuel(int index) {
      if (fuelBuilder_ == null) {
        ensureFuelIsMutable();
        fuel_.remove(index);
        onChanged();
      } else {
        fuelBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Fuel fuel = 2 [json_name = "fuel", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public com.anduril.entitymanager.v1.Fuel.Builder getFuelBuilder(
        int index) {
      return getFuelFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Fuel fuel = 2 [json_name = "fuel", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public com.anduril.entitymanager.v1.FuelOrBuilder getFuelOrBuilder(
        int index) {
      if (fuelBuilder_ == null) {
        return fuel_.get(index);  } else {
        return fuelBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Fuel fuel = 2 [json_name = "fuel", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public java.util.List<? extends com.anduril.entitymanager.v1.FuelOrBuilder> 
         getFuelOrBuilderList() {
      if (fuelBuilder_ != null) {
        return fuelBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(fuel_);
      }
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Fuel fuel = 2 [json_name = "fuel", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public com.anduril.entitymanager.v1.Fuel.Builder addFuelBuilder() {
      return getFuelFieldBuilder().addBuilder(
          com.anduril.entitymanager.v1.Fuel.getDefaultInstance());
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Fuel fuel = 2 [json_name = "fuel", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public com.anduril.entitymanager.v1.Fuel.Builder addFuelBuilder(
        int index) {
      return getFuelFieldBuilder().addBuilder(
          index, com.anduril.entitymanager.v1.Fuel.getDefaultInstance());
    }
    /**
     * <code>repeated .anduril.entitymanager.v1.Fuel fuel = 2 [json_name = "fuel", (.anduril.entitymanager.v1.overridable) = true];</code>
     */
    public java.util.List<com.anduril.entitymanager.v1.Fuel.Builder> 
         getFuelBuilderList() {
      return getFuelFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.anduril.entitymanager.v1.Fuel, com.anduril.entitymanager.v1.Fuel.Builder, com.anduril.entitymanager.v1.FuelOrBuilder> 
        getFuelFieldBuilder() {
      if (fuelBuilder_ == null) {
        fuelBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.anduril.entitymanager.v1.Fuel, com.anduril.entitymanager.v1.Fuel.Builder, com.anduril.entitymanager.v1.FuelOrBuilder>(
                fuel_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        fuel_ = null;
      }
      return fuelBuilder_;
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


    // @@protoc_insertion_point(builder_scope:anduril.entitymanager.v1.Supplies)
  }

  // @@protoc_insertion_point(class_scope:anduril.entitymanager.v1.Supplies)
  private static final com.anduril.entitymanager.v1.Supplies DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.anduril.entitymanager.v1.Supplies();
  }

  public static com.anduril.entitymanager.v1.Supplies getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Supplies>
      PARSER = new com.google.protobuf.AbstractParser<Supplies>() {
    @java.lang.Override
    public Supplies parsePartialFrom(
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

  public static com.google.protobuf.Parser<Supplies> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Supplies> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.anduril.entitymanager.v1.Supplies getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

