// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/communicationsmanager/v1/integration.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.communicationsmanager.v1;

public interface IntegrationDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.communicationsmanager.v1.IntegrationDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.anduril.communicationsmanager.v1.EntityIntegrationDetails entity_details = 1 [json_name = "entityDetails"];</code>
   * @return Whether the entityDetails field is set.
   */
  boolean hasEntityDetails();
  /**
   * <code>.anduril.communicationsmanager.v1.EntityIntegrationDetails entity_details = 1 [json_name = "entityDetails"];</code>
   * @return The entityDetails.
   */
  com.anduril.communicationsmanager.v1.EntityIntegrationDetails getEntityDetails();
  /**
   * <code>.anduril.communicationsmanager.v1.EntityIntegrationDetails entity_details = 1 [json_name = "entityDetails"];</code>
   */
  com.anduril.communicationsmanager.v1.EntityIntegrationDetailsOrBuilder getEntityDetailsOrBuilder();

  /**
   * <code>.anduril.communicationsmanager.v1.BlobsIntegrationDetails blob_details = 2 [json_name = "blobDetails"];</code>
   * @return Whether the blobDetails field is set.
   */
  boolean hasBlobDetails();
  /**
   * <code>.anduril.communicationsmanager.v1.BlobsIntegrationDetails blob_details = 2 [json_name = "blobDetails"];</code>
   * @return The blobDetails.
   */
  com.anduril.communicationsmanager.v1.BlobsIntegrationDetails getBlobDetails();
  /**
   * <code>.anduril.communicationsmanager.v1.BlobsIntegrationDetails blob_details = 2 [json_name = "blobDetails"];</code>
   */
  com.anduril.communicationsmanager.v1.BlobsIntegrationDetailsOrBuilder getBlobDetailsOrBuilder();
}
