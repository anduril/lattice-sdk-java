// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/entitymanager/v1/payloads.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.entitymanager.v1;

public interface PayloadConfigurationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.PayloadConfiguration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Identifying ID for the capability.
   * This ID may be used multiple times to represent payloads that are the same capability but have different operational states
   * </pre>
   *
   * <code>string capability_id = 1 [json_name = "capabilityId"];</code>
   * @return The capabilityId.
   */
  java.lang.String getCapabilityId();
  /**
   * <pre>
   * Identifying ID for the capability.
   * This ID may be used multiple times to represent payloads that are the same capability but have different operational states
   * </pre>
   *
   * <code>string capability_id = 1 [json_name = "capabilityId"];</code>
   * @return The bytes for capabilityId.
   */
  com.google.protobuf.ByteString
      getCapabilityIdBytes();

  /**
   * <pre>
   * The number of payloads currently available in the configuration.
   * </pre>
   *
   * <code>uint32 quantity = 4 [json_name = "quantity"];</code>
   * @return The quantity.
   */
  int getQuantity();

  /**
   * <pre>
   * The target environments the configuration is effective against.
   * </pre>
   *
   * <code>repeated .anduril.ontology.v1.Environment effective_environment = 5 [json_name = "effectiveEnvironment"];</code>
   * @return A list containing the effectiveEnvironment.
   */
  java.util.List<com.anduril.ontology.v1.Environment> getEffectiveEnvironmentList();
  /**
   * <pre>
   * The target environments the configuration is effective against.
   * </pre>
   *
   * <code>repeated .anduril.ontology.v1.Environment effective_environment = 5 [json_name = "effectiveEnvironment"];</code>
   * @return The count of effectiveEnvironment.
   */
  int getEffectiveEnvironmentCount();
  /**
   * <pre>
   * The target environments the configuration is effective against.
   * </pre>
   *
   * <code>repeated .anduril.ontology.v1.Environment effective_environment = 5 [json_name = "effectiveEnvironment"];</code>
   * @param index The index of the element to return.
   * @return The effectiveEnvironment at the given index.
   */
  com.anduril.ontology.v1.Environment getEffectiveEnvironment(int index);
  /**
   * <pre>
   * The target environments the configuration is effective against.
   * </pre>
   *
   * <code>repeated .anduril.ontology.v1.Environment effective_environment = 5 [json_name = "effectiveEnvironment"];</code>
   * @return A list containing the enum numeric values on the wire for effectiveEnvironment.
   */
  java.util.List<java.lang.Integer>
  getEffectiveEnvironmentValueList();
  /**
   * <pre>
   * The target environments the configuration is effective against.
   * </pre>
   *
   * <code>repeated .anduril.ontology.v1.Environment effective_environment = 5 [json_name = "effectiveEnvironment"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of effectiveEnvironment at the given index.
   */
  int getEffectiveEnvironmentValue(int index);

  /**
   * <pre>
   * The operational state of this payload.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.PayloadOperationalState payload_operational_state = 6 [json_name = "payloadOperationalState"];</code>
   * @return The enum numeric value on the wire for payloadOperationalState.
   */
  int getPayloadOperationalStateValue();
  /**
   * <pre>
   * The operational state of this payload.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.PayloadOperationalState payload_operational_state = 6 [json_name = "payloadOperationalState"];</code>
   * @return The payloadOperationalState.
   */
  com.anduril.entitymanager.v1.PayloadOperationalState getPayloadOperationalState();

  /**
   * <pre>
   * A human readable description of the payload
   * </pre>
   *
   * <code>string payload_description = 7 [json_name = "payloadDescription"];</code>
   * @return The payloadDescription.
   */
  java.lang.String getPayloadDescription();
  /**
   * <pre>
   * A human readable description of the payload
   * </pre>
   *
   * <code>string payload_description = 7 [json_name = "payloadDescription"];</code>
   * @return The bytes for payloadDescription.
   */
  com.google.protobuf.ByteString
      getPayloadDescriptionBytes();
}
