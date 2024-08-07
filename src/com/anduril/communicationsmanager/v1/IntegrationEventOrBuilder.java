// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/communicationsmanager/v1/integration.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.communicationsmanager.v1;

public interface IntegrationEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.communicationsmanager.v1.IntegrationEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.anduril.communicationsmanager.v1.EventType event_type = 1 [json_name = "eventType"];</code>
   * @return The enum numeric value on the wire for eventType.
   */
  int getEventTypeValue();
  /**
   * <code>.anduril.communicationsmanager.v1.EventType event_type = 1 [json_name = "eventType"];</code>
   * @return The eventType.
   */
  com.anduril.communicationsmanager.v1.EventType getEventType();

  /**
   * <code>.google.protobuf.Timestamp time = 2 [json_name = "time"];</code>
   * @return Whether the time field is set.
   */
  boolean hasTime();
  /**
   * <code>.google.protobuf.Timestamp time = 2 [json_name = "time"];</code>
   * @return The time.
   */
  com.google.protobuf.Timestamp getTime();
  /**
   * <code>.google.protobuf.Timestamp time = 2 [json_name = "time"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeOrBuilder();

  /**
   * <code>.anduril.communicationsmanager.v1.RegisteredIntegration integration = 3 [json_name = "integration"];</code>
   * @return Whether the integration field is set.
   */
  boolean hasIntegration();
  /**
   * <code>.anduril.communicationsmanager.v1.RegisteredIntegration integration = 3 [json_name = "integration"];</code>
   * @return The integration.
   */
  com.anduril.communicationsmanager.v1.RegisteredIntegration getIntegration();
  /**
   * <code>.anduril.communicationsmanager.v1.RegisteredIntegration integration = 3 [json_name = "integration"];</code>
   */
  com.anduril.communicationsmanager.v1.RegisteredIntegrationOrBuilder getIntegrationOrBuilder();
}
