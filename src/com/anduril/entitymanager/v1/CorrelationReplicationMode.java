// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/entity.pub.proto

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * The replication mode of the correlation indicating how the correlation will be replication to
 * other nodes in the mesh.
 * </pre>
 *
 * Protobuf enum {@code anduril.entitymanager.v1.CorrelationReplicationMode}
 */
public enum CorrelationReplicationMode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CORRELATION_REPLICATION_MODE_INVALID = 0;</code>
   */
  CORRELATION_REPLICATION_MODE_INVALID(0),
  /**
   * <pre>
   * The correlation is local only to the originating node and will not be distributed to other
   * nodes in the mesh. In the case of conflicts, this correlation will override ones coming from
   * other nodes. Local is always higher precedence than global regardless of the correlation type.
   * </pre>
   *
   * <code>CORRELATION_REPLICATION_MODE_LOCAL = 1;</code>
   */
  CORRELATION_REPLICATION_MODE_LOCAL(1),
  /**
   * <pre>
   * The correlation is distributed globally across all nodes in the mesh. Because an entity can
   * only be part of one correlation, this is based on last-write-wins semantics, however, the
   * correlation will also be stored locally in the originating node preventing any overrides.
   * Global is always lower precedence than local regardless of the correlation type.
   * </pre>
   *
   * <code>CORRELATION_REPLICATION_MODE_GLOBAL = 2;</code>
   */
  CORRELATION_REPLICATION_MODE_GLOBAL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CORRELATION_REPLICATION_MODE_INVALID = 0;</code>
   */
  public static final int CORRELATION_REPLICATION_MODE_INVALID_VALUE = 0;
  /**
   * <pre>
   * The correlation is local only to the originating node and will not be distributed to other
   * nodes in the mesh. In the case of conflicts, this correlation will override ones coming from
   * other nodes. Local is always higher precedence than global regardless of the correlation type.
   * </pre>
   *
   * <code>CORRELATION_REPLICATION_MODE_LOCAL = 1;</code>
   */
  public static final int CORRELATION_REPLICATION_MODE_LOCAL_VALUE = 1;
  /**
   * <pre>
   * The correlation is distributed globally across all nodes in the mesh. Because an entity can
   * only be part of one correlation, this is based on last-write-wins semantics, however, the
   * correlation will also be stored locally in the originating node preventing any overrides.
   * Global is always lower precedence than local regardless of the correlation type.
   * </pre>
   *
   * <code>CORRELATION_REPLICATION_MODE_GLOBAL = 2;</code>
   */
  public static final int CORRELATION_REPLICATION_MODE_GLOBAL_VALUE = 2;


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
  public static CorrelationReplicationMode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CorrelationReplicationMode forNumber(int value) {
    switch (value) {
      case 0: return CORRELATION_REPLICATION_MODE_INVALID;
      case 1: return CORRELATION_REPLICATION_MODE_LOCAL;
      case 2: return CORRELATION_REPLICATION_MODE_GLOBAL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CorrelationReplicationMode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CorrelationReplicationMode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CorrelationReplicationMode>() {
          public CorrelationReplicationMode findValueByNumber(int number) {
            return CorrelationReplicationMode.forNumber(number);
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

  private static final CorrelationReplicationMode[] VALUES = values();

  public static CorrelationReplicationMode valueOf(
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

  private CorrelationReplicationMode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:anduril.entitymanager.v1.CorrelationReplicationMode)
}
