// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/health_status.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.entitymanager.v1;

/**
 * <pre>
 * Enumeration of possible connection states.
 * </pre>
 *
 * Protobuf enum {@code anduril.entitymanager.v1.ConnectionStatus}
 */
public enum ConnectionStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CONNECTION_STATUS_INVALID = 0;</code>
   */
  CONNECTION_STATUS_INVALID(0),
  /**
   * <code>CONNECTION_STATUS_ONLINE = 1;</code>
   */
  CONNECTION_STATUS_ONLINE(1),
  /**
   * <code>CONNECTION_STATUS_OFFLINE = 2;</code>
   */
  CONNECTION_STATUS_OFFLINE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CONNECTION_STATUS_INVALID = 0;</code>
   */
  public static final int CONNECTION_STATUS_INVALID_VALUE = 0;
  /**
   * <code>CONNECTION_STATUS_ONLINE = 1;</code>
   */
  public static final int CONNECTION_STATUS_ONLINE_VALUE = 1;
  /**
   * <code>CONNECTION_STATUS_OFFLINE = 2;</code>
   */
  public static final int CONNECTION_STATUS_OFFLINE_VALUE = 2;


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
  public static ConnectionStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ConnectionStatus forNumber(int value) {
    switch (value) {
      case 0: return CONNECTION_STATUS_INVALID;
      case 1: return CONNECTION_STATUS_ONLINE;
      case 2: return CONNECTION_STATUS_OFFLINE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ConnectionStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ConnectionStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ConnectionStatus>() {
          public ConnectionStatus findValueByNumber(int number) {
            return ConnectionStatus.forNumber(number);
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
    return com.anduril.entitymanager.v1.HealthStatusPubProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ConnectionStatus[] VALUES = values();

  public static ConnectionStatus valueOf(
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

  private ConnectionStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:anduril.entitymanager.v1.ConnectionStatus)
}

