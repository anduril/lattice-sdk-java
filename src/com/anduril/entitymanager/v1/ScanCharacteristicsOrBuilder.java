// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/signal.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.entitymanager.v1;

public interface ScanCharacteristicsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.ScanCharacteristics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.anduril.entitymanager.v1.ScanType scan_type = 1 [json_name = "scanType"];</code>
   * @return The enum numeric value on the wire for scanType.
   */
  int getScanTypeValue();
  /**
   * <code>.anduril.entitymanager.v1.ScanType scan_type = 1 [json_name = "scanType"];</code>
   * @return The scanType.
   */
  com.anduril.entitymanager.v1.ScanType getScanType();

  /**
   * <code>.google.protobuf.DoubleValue scan_period_s = 2 [json_name = "scanPeriodS"];</code>
   * @return Whether the scanPeriodS field is set.
   */
  boolean hasScanPeriodS();
  /**
   * <code>.google.protobuf.DoubleValue scan_period_s = 2 [json_name = "scanPeriodS"];</code>
   * @return The scanPeriodS.
   */
  com.google.protobuf.DoubleValue getScanPeriodS();
  /**
   * <code>.google.protobuf.DoubleValue scan_period_s = 2 [json_name = "scanPeriodS"];</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getScanPeriodSOrBuilder();
}
