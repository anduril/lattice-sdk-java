// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/transponder_codes.pub.proto

package com.anduril.entitymanager.v1;

/**
 * <pre>
 * Indicates the interrogation status of a target.
 * </pre>
 *
 * Protobuf enum {@code anduril.entitymanager.v1.InterrogationResponse}
 */
public enum InterrogationResponse
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Note that INTERROGATION_INVALID indicates that the target has not been interrogated.
   * </pre>
   *
   * <code>INTERROGATION_RESPONSE_INVALID = 0;</code>
   */
  INTERROGATION_RESPONSE_INVALID(0),
  /**
   * <code>INTERROGATION_RESPONSE_CORRECT = 1;</code>
   */
  INTERROGATION_RESPONSE_CORRECT(1),
  /**
   * <code>INTERROGATION_RESPONSE_INCORRECT = 2;</code>
   */
  INTERROGATION_RESPONSE_INCORRECT(2),
  /**
   * <code>INTERROGATION_RESPONSE_NO_RESPONSE = 3;</code>
   */
  INTERROGATION_RESPONSE_NO_RESPONSE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Note that INTERROGATION_INVALID indicates that the target has not been interrogated.
   * </pre>
   *
   * <code>INTERROGATION_RESPONSE_INVALID = 0;</code>
   */
  public static final int INTERROGATION_RESPONSE_INVALID_VALUE = 0;
  /**
   * <code>INTERROGATION_RESPONSE_CORRECT = 1;</code>
   */
  public static final int INTERROGATION_RESPONSE_CORRECT_VALUE = 1;
  /**
   * <code>INTERROGATION_RESPONSE_INCORRECT = 2;</code>
   */
  public static final int INTERROGATION_RESPONSE_INCORRECT_VALUE = 2;
  /**
   * <code>INTERROGATION_RESPONSE_NO_RESPONSE = 3;</code>
   */
  public static final int INTERROGATION_RESPONSE_NO_RESPONSE_VALUE = 3;


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
  public static InterrogationResponse valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static InterrogationResponse forNumber(int value) {
    switch (value) {
      case 0: return INTERROGATION_RESPONSE_INVALID;
      case 1: return INTERROGATION_RESPONSE_CORRECT;
      case 2: return INTERROGATION_RESPONSE_INCORRECT;
      case 3: return INTERROGATION_RESPONSE_NO_RESPONSE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<InterrogationResponse>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      InterrogationResponse> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<InterrogationResponse>() {
          public InterrogationResponse findValueByNumber(int number) {
            return InterrogationResponse.forNumber(number);
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
    return com.anduril.entitymanager.v1.TransponderCodesPubProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final InterrogationResponse[] VALUES = values();

  public static InterrogationResponse valueOf(
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

  private InterrogationResponse(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:anduril.entitymanager.v1.InterrogationResponse)
}

