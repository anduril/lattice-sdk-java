// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/entity_manager_grpcapi.pub.proto

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * The type of entity event.
 * </pre>
 *
 * Protobuf enum {@code anduril.entitymanager.v1.EventType}
 */
public enum EventType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>EVENT_TYPE_INVALID = 0;</code>
   */
  EVENT_TYPE_INVALID(0),
  /**
   * <pre>
   * entity was created.
   * </pre>
   *
   * <code>EVENT_TYPE_CREATED = 1;</code>
   */
  EVENT_TYPE_CREATED(1),
  /**
   * <pre>
   * entity was updated.
   * </pre>
   *
   * <code>EVENT_TYPE_UPDATE = 2;</code>
   */
  EVENT_TYPE_UPDATE(2),
  /**
   * <pre>
   * entity was deleted.
   * </pre>
   *
   * <code>EVENT_TYPE_DELETED = 3;</code>
   */
  EVENT_TYPE_DELETED(3),
  /**
   * <pre>
   * entity already existed, but sent on a new stream connection.
   * </pre>
   *
   * <code>EVENT_TYPE_PREEXISTING = 4;</code>
   */
  EVENT_TYPE_PREEXISTING(4),
  /**
   * <pre>
   * entity override was set after the entity expiration.
   * </pre>
   *
   * <code>EVENT_TYPE_POST_EXPIRY_OVERRIDE = 5;</code>
   */
  EVENT_TYPE_POST_EXPIRY_OVERRIDE(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>EVENT_TYPE_INVALID = 0;</code>
   */
  public static final int EVENT_TYPE_INVALID_VALUE = 0;
  /**
   * <pre>
   * entity was created.
   * </pre>
   *
   * <code>EVENT_TYPE_CREATED = 1;</code>
   */
  public static final int EVENT_TYPE_CREATED_VALUE = 1;
  /**
   * <pre>
   * entity was updated.
   * </pre>
   *
   * <code>EVENT_TYPE_UPDATE = 2;</code>
   */
  public static final int EVENT_TYPE_UPDATE_VALUE = 2;
  /**
   * <pre>
   * entity was deleted.
   * </pre>
   *
   * <code>EVENT_TYPE_DELETED = 3;</code>
   */
  public static final int EVENT_TYPE_DELETED_VALUE = 3;
  /**
   * <pre>
   * entity already existed, but sent on a new stream connection.
   * </pre>
   *
   * <code>EVENT_TYPE_PREEXISTING = 4;</code>
   */
  public static final int EVENT_TYPE_PREEXISTING_VALUE = 4;
  /**
   * <pre>
   * entity override was set after the entity expiration.
   * </pre>
   *
   * <code>EVENT_TYPE_POST_EXPIRY_OVERRIDE = 5;</code>
   */
  public static final int EVENT_TYPE_POST_EXPIRY_OVERRIDE_VALUE = 5;


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
  public static EventType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EventType forNumber(int value) {
    switch (value) {
      case 0: return EVENT_TYPE_INVALID;
      case 1: return EVENT_TYPE_CREATED;
      case 2: return EVENT_TYPE_UPDATE;
      case 3: return EVENT_TYPE_DELETED;
      case 4: return EVENT_TYPE_PREEXISTING;
      case 5: return EVENT_TYPE_POST_EXPIRY_OVERRIDE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EventType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EventType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EventType>() {
          public EventType findValueByNumber(int number) {
            return EventType.forNumber(number);
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
    return com.anduril.entitymanager.v1.EntityManagerGrpcapiPubProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final EventType[] VALUES = values();

  public static EventType valueOf(
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

  private EventType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:anduril.entitymanager.v1.EventType)
}

