// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/health_status.pub.proto

package com.anduril.entitymanager.v1;

public interface HealthOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.Health)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Status indicating whether the entity is able to communicate with Entity Manager.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.ConnectionStatus connection_status = 1 [json_name = "connectionStatus"];</code>
   * @return The enum numeric value on the wire for connectionStatus.
   */
  int getConnectionStatusValue();
  /**
   * <pre>
   * Status indicating whether the entity is able to communicate with Entity Manager.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.ConnectionStatus connection_status = 1 [json_name = "connectionStatus"];</code>
   * @return The connectionStatus.
   */
  com.anduril.entitymanager.v1.ConnectionStatus getConnectionStatus();

  /**
   * <pre>
   * Top-level health status; typically a roll-up of individual component healths.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.HealthStatus health_status = 2 [json_name = "healthStatus"];</code>
   * @return The enum numeric value on the wire for healthStatus.
   */
  int getHealthStatusValue();
  /**
   * <pre>
   * Top-level health status; typically a roll-up of individual component healths.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.HealthStatus health_status = 2 [json_name = "healthStatus"];</code>
   * @return The healthStatus.
   */
  com.anduril.entitymanager.v1.HealthStatus getHealthStatus();

  /**
   * <pre>
   * Health of individual components running on this Entity.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.ComponentHealth components = 3 [json_name = "components"];</code>
   */
  java.util.List<com.anduril.entitymanager.v1.ComponentHealth> 
      getComponentsList();
  /**
   * <pre>
   * Health of individual components running on this Entity.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.ComponentHealth components = 3 [json_name = "components"];</code>
   */
  com.anduril.entitymanager.v1.ComponentHealth getComponents(int index);
  /**
   * <pre>
   * Health of individual components running on this Entity.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.ComponentHealth components = 3 [json_name = "components"];</code>
   */
  int getComponentsCount();
  /**
   * <pre>
   * Health of individual components running on this Entity.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.ComponentHealth components = 3 [json_name = "components"];</code>
   */
  java.util.List<? extends com.anduril.entitymanager.v1.ComponentHealthOrBuilder> 
      getComponentsOrBuilderList();
  /**
   * <pre>
   * Health of individual components running on this Entity.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.ComponentHealth components = 3 [json_name = "components"];</code>
   */
  com.anduril.entitymanager.v1.ComponentHealthOrBuilder getComponentsOrBuilder(
      int index);

  /**
   * <pre>
   * The update time for the top-level health information.
   * If this timestamp is unset, the data is assumed to be most recent
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [json_name = "updateTime"];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * The update time for the top-level health information.
   * If this timestamp is unset, the data is assumed to be most recent
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [json_name = "updateTime"];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * The update time for the top-level health information.
   * If this timestamp is unset, the data is assumed to be most recent
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [json_name = "updateTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Active alerts indicate a critical change in system state sent by the asset
   * that must be made known to an operator or consumer of the common operating picture.
   * Alerts are different from ComponentHealth messages--an active alert does not necessarily
   * indicate a component is in an unhealthy state. For example, an asset may trigger
   * an active alert based on fuel levels running low. Alerts should be removed from this list when their conditions
   * are cleared. In other words, only active alerts should be reported here.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.Alert active_alerts = 5 [json_name = "activeAlerts"];</code>
   */
  java.util.List<com.anduril.entitymanager.v1.Alert> 
      getActiveAlertsList();
  /**
   * <pre>
   * Active alerts indicate a critical change in system state sent by the asset
   * that must be made known to an operator or consumer of the common operating picture.
   * Alerts are different from ComponentHealth messages--an active alert does not necessarily
   * indicate a component is in an unhealthy state. For example, an asset may trigger
   * an active alert based on fuel levels running low. Alerts should be removed from this list when their conditions
   * are cleared. In other words, only active alerts should be reported here.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.Alert active_alerts = 5 [json_name = "activeAlerts"];</code>
   */
  com.anduril.entitymanager.v1.Alert getActiveAlerts(int index);
  /**
   * <pre>
   * Active alerts indicate a critical change in system state sent by the asset
   * that must be made known to an operator or consumer of the common operating picture.
   * Alerts are different from ComponentHealth messages--an active alert does not necessarily
   * indicate a component is in an unhealthy state. For example, an asset may trigger
   * an active alert based on fuel levels running low. Alerts should be removed from this list when their conditions
   * are cleared. In other words, only active alerts should be reported here.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.Alert active_alerts = 5 [json_name = "activeAlerts"];</code>
   */
  int getActiveAlertsCount();
  /**
   * <pre>
   * Active alerts indicate a critical change in system state sent by the asset
   * that must be made known to an operator or consumer of the common operating picture.
   * Alerts are different from ComponentHealth messages--an active alert does not necessarily
   * indicate a component is in an unhealthy state. For example, an asset may trigger
   * an active alert based on fuel levels running low. Alerts should be removed from this list when their conditions
   * are cleared. In other words, only active alerts should be reported here.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.Alert active_alerts = 5 [json_name = "activeAlerts"];</code>
   */
  java.util.List<? extends com.anduril.entitymanager.v1.AlertOrBuilder> 
      getActiveAlertsOrBuilderList();
  /**
   * <pre>
   * Active alerts indicate a critical change in system state sent by the asset
   * that must be made known to an operator or consumer of the common operating picture.
   * Alerts are different from ComponentHealth messages--an active alert does not necessarily
   * indicate a component is in an unhealthy state. For example, an asset may trigger
   * an active alert based on fuel levels running low. Alerts should be removed from this list when their conditions
   * are cleared. In other words, only active alerts should be reported here.
   * </pre>
   *
   * <code>repeated .anduril.entitymanager.v1.Alert active_alerts = 5 [json_name = "activeAlerts"];</code>
   */
  com.anduril.entitymanager.v1.AlertOrBuilder getActiveAlertsOrBuilder(
      int index);
}
