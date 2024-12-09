// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/filter.pub.proto

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * The Comparator specifies the set of supported comparison operations. It also provides the
 * mapping information about which comparators are supported for which values. Services that wish
 * to implement entity filters must provide validation functionality to strictly enforce these
 * mappings.
 * </pre>
 *
 * Protobuf enum {@code anduril.entitymanager.v1.Comparator}
 */
public enum Comparator
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>COMPARATOR_INVALID = 0;</code>
   */
  COMPARATOR_INVALID(0),
  /**
   * <pre>
   * Comparators for: boolean, numeric, string, enum, position, timestamp, positions, and bounded shapes.
   * </pre>
   *
   * <code>COMPARATOR_MATCH_ALL = 11;</code>
   */
  COMPARATOR_MATCH_ALL(11),
  /**
   * <pre>
   * Comparators for: boolean, numeric, string, enum, position, and timestamp.
   * </pre>
   *
   * <code>COMPARATOR_EQUALITY = 1;</code>
   */
  COMPARATOR_EQUALITY(1),
  /**
   * <code>COMPARATOR_IN = 9;</code>
   */
  COMPARATOR_IN(9),
  /**
   * <pre>
   * Comparators for: numeric, string, and timestamp.
   * </pre>
   *
   * <code>COMPARATOR_LESS_THAN = 2;</code>
   */
  COMPARATOR_LESS_THAN(2),
  /**
   * <code>COMPARATOR_GREATER_THAN = 3;</code>
   */
  COMPARATOR_GREATER_THAN(3),
  /**
   * <code>COMPARATOR_LESS_THAN_EQUAL_TO = 4;</code>
   */
  COMPARATOR_LESS_THAN_EQUAL_TO(4),
  /**
   * <code>COMPARATOR_GREATER_THAN_EQUAL_TO = 5;</code>
   */
  COMPARATOR_GREATER_THAN_EQUAL_TO(5),
  /**
   * <pre>
   * Comparators for: positions and bounded shapes.
   * </pre>
   *
   * <code>COMPARATOR_WITHIN = 6;</code>
   */
  COMPARATOR_WITHIN(6),
  /**
   * <pre>
   * Comparators for: existential checks.
   * TRUE if path to field exists (parent message is present), and either:
   *   1. the field is a primitive: all values including default pass check.
   *   2. the field is a message and set/present.
   *   3. the field is repeated or map with size &gt; 0.
   * FALSE unless path exists and one of the above 3 conditions is met
   * </pre>
   *
   * <code>COMPARATOR_EXISTS = 7;</code>
   */
  COMPARATOR_EXISTS(7),
  /**
   * <pre>
   * Comparator for string type only.
   * </pre>
   *
   * <code>COMPARATOR_CASE_INSENSITIVE_EQUALITY = 8;</code>
   */
  COMPARATOR_CASE_INSENSITIVE_EQUALITY(8),
  /**
   * <code>COMPARATOR_CASE_INSENSITIVE_EQUALITY_IN = 10;</code>
   */
  COMPARATOR_CASE_INSENSITIVE_EQUALITY_IN(10),
  /**
   * <pre>
   * Comparators for range types only.
   * Closed (inclusive endpoints) [a, b]
   * </pre>
   *
   * <code>COMPARATOR_RANGE_CLOSED = 12;</code>
   */
  COMPARATOR_RANGE_CLOSED(12),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>COMPARATOR_INVALID = 0;</code>
   */
  public static final int COMPARATOR_INVALID_VALUE = 0;
  /**
   * <pre>
   * Comparators for: boolean, numeric, string, enum, position, timestamp, positions, and bounded shapes.
   * </pre>
   *
   * <code>COMPARATOR_MATCH_ALL = 11;</code>
   */
  public static final int COMPARATOR_MATCH_ALL_VALUE = 11;
  /**
   * <pre>
   * Comparators for: boolean, numeric, string, enum, position, and timestamp.
   * </pre>
   *
   * <code>COMPARATOR_EQUALITY = 1;</code>
   */
  public static final int COMPARATOR_EQUALITY_VALUE = 1;
  /**
   * <code>COMPARATOR_IN = 9;</code>
   */
  public static final int COMPARATOR_IN_VALUE = 9;
  /**
   * <pre>
   * Comparators for: numeric, string, and timestamp.
   * </pre>
   *
   * <code>COMPARATOR_LESS_THAN = 2;</code>
   */
  public static final int COMPARATOR_LESS_THAN_VALUE = 2;
  /**
   * <code>COMPARATOR_GREATER_THAN = 3;</code>
   */
  public static final int COMPARATOR_GREATER_THAN_VALUE = 3;
  /**
   * <code>COMPARATOR_LESS_THAN_EQUAL_TO = 4;</code>
   */
  public static final int COMPARATOR_LESS_THAN_EQUAL_TO_VALUE = 4;
  /**
   * <code>COMPARATOR_GREATER_THAN_EQUAL_TO = 5;</code>
   */
  public static final int COMPARATOR_GREATER_THAN_EQUAL_TO_VALUE = 5;
  /**
   * <pre>
   * Comparators for: positions and bounded shapes.
   * </pre>
   *
   * <code>COMPARATOR_WITHIN = 6;</code>
   */
  public static final int COMPARATOR_WITHIN_VALUE = 6;
  /**
   * <pre>
   * Comparators for: existential checks.
   * TRUE if path to field exists (parent message is present), and either:
   *   1. the field is a primitive: all values including default pass check.
   *   2. the field is a message and set/present.
   *   3. the field is repeated or map with size &gt; 0.
   * FALSE unless path exists and one of the above 3 conditions is met
   * </pre>
   *
   * <code>COMPARATOR_EXISTS = 7;</code>
   */
  public static final int COMPARATOR_EXISTS_VALUE = 7;
  /**
   * <pre>
   * Comparator for string type only.
   * </pre>
   *
   * <code>COMPARATOR_CASE_INSENSITIVE_EQUALITY = 8;</code>
   */
  public static final int COMPARATOR_CASE_INSENSITIVE_EQUALITY_VALUE = 8;
  /**
   * <code>COMPARATOR_CASE_INSENSITIVE_EQUALITY_IN = 10;</code>
   */
  public static final int COMPARATOR_CASE_INSENSITIVE_EQUALITY_IN_VALUE = 10;
  /**
   * <pre>
   * Comparators for range types only.
   * Closed (inclusive endpoints) [a, b]
   * </pre>
   *
   * <code>COMPARATOR_RANGE_CLOSED = 12;</code>
   */
  public static final int COMPARATOR_RANGE_CLOSED_VALUE = 12;


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
  public static Comparator valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Comparator forNumber(int value) {
    switch (value) {
      case 0: return COMPARATOR_INVALID;
      case 11: return COMPARATOR_MATCH_ALL;
      case 1: return COMPARATOR_EQUALITY;
      case 9: return COMPARATOR_IN;
      case 2: return COMPARATOR_LESS_THAN;
      case 3: return COMPARATOR_GREATER_THAN;
      case 4: return COMPARATOR_LESS_THAN_EQUAL_TO;
      case 5: return COMPARATOR_GREATER_THAN_EQUAL_TO;
      case 6: return COMPARATOR_WITHIN;
      case 7: return COMPARATOR_EXISTS;
      case 8: return COMPARATOR_CASE_INSENSITIVE_EQUALITY;
      case 10: return COMPARATOR_CASE_INSENSITIVE_EQUALITY_IN;
      case 12: return COMPARATOR_RANGE_CLOSED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Comparator>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Comparator> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Comparator>() {
          public Comparator findValueByNumber(int number) {
            return Comparator.forNumber(number);
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
    return com.anduril.entitymanager.v1.FilterPubProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Comparator[] VALUES = values();

  public static Comparator valueOf(
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

  private Comparator(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:anduril.entitymanager.v1.Comparator)
}
