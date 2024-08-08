// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/entity.pub.proto

package com.anduril.entitymanager.v1;

/**
 * Protobuf enum {@code anduril.entitymanager.v1.InteractivityMode}
 */
public enum InteractivityMode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>INTERACTIVITY_MODE_INVALID = 0;</code>
   */
  INTERACTIVITY_MODE_INVALID(0),
  /**
   * <code>INTERACTIVITY_MODE_DEFAULT = 1;</code>
   */
  INTERACTIVITY_MODE_DEFAULT(1),
  /**
   * <code>INTERACTIVITY_MODE_DISABLED_ON_MAP = 2;</code>
   */
  INTERACTIVITY_MODE_DISABLED_ON_MAP(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>INTERACTIVITY_MODE_INVALID = 0;</code>
   */
  public static final int INTERACTIVITY_MODE_INVALID_VALUE = 0;
  /**
   * <code>INTERACTIVITY_MODE_DEFAULT = 1;</code>
   */
  public static final int INTERACTIVITY_MODE_DEFAULT_VALUE = 1;
  /**
   * <code>INTERACTIVITY_MODE_DISABLED_ON_MAP = 2;</code>
   */
  public static final int INTERACTIVITY_MODE_DISABLED_ON_MAP_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static InteractivityMode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static InteractivityMode forNumber(int value) {
    switch (value) {
      case 0: return INTERACTIVITY_MODE_INVALID;
      case 1: return INTERACTIVITY_MODE_DEFAULT;
      case 2: return INTERACTIVITY_MODE_DISABLED_ON_MAP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<InteractivityMode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      InteractivityMode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<InteractivityMode>() {
          public InteractivityMode findValueByNumber(int number) {
            return InteractivityMode.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.anduril.entitymanager.v1.EntityPubProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final InteractivityMode[] VALUES = values();

  public static InteractivityMode valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private InteractivityMode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:anduril.entitymanager.v1.InteractivityMode)
}

