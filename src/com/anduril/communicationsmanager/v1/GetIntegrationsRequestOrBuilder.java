// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/communicationsmanager/v1/integration.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.communicationsmanager.v1;

public interface GetIntegrationsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.communicationsmanager.v1.GetIntegrationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * String of node ids. If no nodes are specified, integrations for all nodes are returned.
   * </pre>
   *
   * <code>repeated string nodes = 1 [json_name = "nodes"];</code>
   * @return A list containing the nodes.
   */
  java.util.List<java.lang.String>
      getNodesList();
  /**
   * <pre>
   * String of node ids. If no nodes are specified, integrations for all nodes are returned.
   * </pre>
   *
   * <code>repeated string nodes = 1 [json_name = "nodes"];</code>
   * @return The count of nodes.
   */
  int getNodesCount();
  /**
   * <pre>
   * String of node ids. If no nodes are specified, integrations for all nodes are returned.
   * </pre>
   *
   * <code>repeated string nodes = 1 [json_name = "nodes"];</code>
   * @param index The index of the element to return.
   * @return The nodes at the given index.
   */
  java.lang.String getNodes(int index);
  /**
   * <pre>
   * String of node ids. If no nodes are specified, integrations for all nodes are returned.
   * </pre>
   *
   * <code>repeated string nodes = 1 [json_name = "nodes"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the nodes at the given index.
   */
  com.google.protobuf.ByteString
      getNodesBytes(int index);
}
