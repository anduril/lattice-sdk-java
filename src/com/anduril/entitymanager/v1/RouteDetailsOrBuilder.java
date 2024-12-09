// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/route_details.pub.proto

package com.anduril.entitymanager.v1;

public interface RouteDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.RouteDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Free form text giving the name of the entity's destination
   * </pre>
   *
   * <code>string destination_name = 1 [json_name = "destinationName"];</code>
   * @return The destinationName.
   */
  java.lang.String getDestinationName();
  /**
   * <pre>
   * Free form text giving the name of the entity's destination
   * </pre>
   *
   * <code>string destination_name = 1 [json_name = "destinationName"];</code>
   * @return The bytes for destinationName.
   */
  com.google.protobuf.ByteString
      getDestinationNameBytes();

  /**
   * <pre>
   * Estimated time of arrival at destination
   * </pre>
   *
   * <code>.google.protobuf.Timestamp estimated_arrival_time = 2 [json_name = "estimatedArrivalTime"];</code>
   * @return Whether the estimatedArrivalTime field is set.
   */
  boolean hasEstimatedArrivalTime();
  /**
   * <pre>
   * Estimated time of arrival at destination
   * </pre>
   *
   * <code>.google.protobuf.Timestamp estimated_arrival_time = 2 [json_name = "estimatedArrivalTime"];</code>
   * @return The estimatedArrivalTime.
   */
  com.google.protobuf.Timestamp getEstimatedArrivalTime();
  /**
   * <pre>
   * Estimated time of arrival at destination
   * </pre>
   *
   * <code>.google.protobuf.Timestamp estimated_arrival_time = 2 [json_name = "estimatedArrivalTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEstimatedArrivalTimeOrBuilder();
}