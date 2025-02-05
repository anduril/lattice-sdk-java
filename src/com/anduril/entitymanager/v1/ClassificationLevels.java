// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/classification.pub.proto

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * An enumeration of security classification levels.
 * </pre>
 *
 * Protobuf enum {@code anduril.entitymanager.v1.ClassificationLevels}
 */
public enum ClassificationLevels
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CLASSIFICATION_LEVELS_INVALID = 0;</code>
   */
  CLASSIFICATION_LEVELS_INVALID(0),
  /**
   * <code>CLASSIFICATION_LEVELS_UNCLASSIFIED = 1;</code>
   */
  CLASSIFICATION_LEVELS_UNCLASSIFIED(1),
  /**
   * <code>CLASSIFICATION_LEVELS_CONTROLLED_UNCLASSIFIED = 2;</code>
   */
  CLASSIFICATION_LEVELS_CONTROLLED_UNCLASSIFIED(2),
  /**
   * <code>CLASSIFICATION_LEVELS_CONFIDENTIAL = 3;</code>
   */
  CLASSIFICATION_LEVELS_CONFIDENTIAL(3),
  /**
   * <code>CLASSIFICATION_LEVELS_SECRET = 4;</code>
   */
  CLASSIFICATION_LEVELS_SECRET(4),
  /**
   * <code>CLASSIFICATION_LEVELS_TOP_SECRET = 5;</code>
   */
  CLASSIFICATION_LEVELS_TOP_SECRET(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CLASSIFICATION_LEVELS_INVALID = 0;</code>
   */
  public static final int CLASSIFICATION_LEVELS_INVALID_VALUE = 0;
  /**
   * <code>CLASSIFICATION_LEVELS_UNCLASSIFIED = 1;</code>
   */
  public static final int CLASSIFICATION_LEVELS_UNCLASSIFIED_VALUE = 1;
  /**
   * <code>CLASSIFICATION_LEVELS_CONTROLLED_UNCLASSIFIED = 2;</code>
   */
  public static final int CLASSIFICATION_LEVELS_CONTROLLED_UNCLASSIFIED_VALUE = 2;
  /**
   * <code>CLASSIFICATION_LEVELS_CONFIDENTIAL = 3;</code>
   */
  public static final int CLASSIFICATION_LEVELS_CONFIDENTIAL_VALUE = 3;
  /**
   * <code>CLASSIFICATION_LEVELS_SECRET = 4;</code>
   */
  public static final int CLASSIFICATION_LEVELS_SECRET_VALUE = 4;
  /**
   * <code>CLASSIFICATION_LEVELS_TOP_SECRET = 5;</code>
   */
  public static final int CLASSIFICATION_LEVELS_TOP_SECRET_VALUE = 5;


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
  public static ClassificationLevels valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ClassificationLevels forNumber(int value) {
    switch (value) {
      case 0: return CLASSIFICATION_LEVELS_INVALID;
      case 1: return CLASSIFICATION_LEVELS_UNCLASSIFIED;
      case 2: return CLASSIFICATION_LEVELS_CONTROLLED_UNCLASSIFIED;
      case 3: return CLASSIFICATION_LEVELS_CONFIDENTIAL;
      case 4: return CLASSIFICATION_LEVELS_SECRET;
      case 5: return CLASSIFICATION_LEVELS_TOP_SECRET;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ClassificationLevels>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ClassificationLevels> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ClassificationLevels>() {
          public ClassificationLevels findValueByNumber(int number) {
            return ClassificationLevels.forNumber(number);
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
    return com.anduril.entitymanager.v1.ClassificationPubProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ClassificationLevels[] VALUES = values();

  public static ClassificationLevels valueOf(
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

  private ClassificationLevels(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:anduril.entitymanager.v1.ClassificationLevels)
}

