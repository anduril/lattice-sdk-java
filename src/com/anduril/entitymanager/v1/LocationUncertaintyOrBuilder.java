// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/location.pub.proto

package com.anduril.entitymanager.v1;

public interface LocationUncertaintyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.LocationUncertainty)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Positional covariance represented by the upper triangle of the covariance matrix. It is valid to populate
   * only the diagonal of the matrix if the full covariance matrix is unknown.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.TMat3 position_enu_cov = 1 [json_name = "positionEnuCov"];</code>
   * @return Whether the positionEnuCov field is set.
   */
  boolean hasPositionEnuCov();
  /**
   * <pre>
   * Positional covariance represented by the upper triangle of the covariance matrix. It is valid to populate
   * only the diagonal of the matrix if the full covariance matrix is unknown.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.TMat3 position_enu_cov = 1 [json_name = "positionEnuCov"];</code>
   * @return The positionEnuCov.
   */
  com.anduril.entitymanager.v1.TMat3 getPositionEnuCov();
  /**
   * <pre>
   * Positional covariance represented by the upper triangle of the covariance matrix. It is valid to populate
   * only the diagonal of the matrix if the full covariance matrix is unknown.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.TMat3 position_enu_cov = 1 [json_name = "positionEnuCov"];</code>
   */
  com.anduril.entitymanager.v1.TMat3OrBuilder getPositionEnuCovOrBuilder();

  /**
   * <pre>
   * Velocity covariance represented by the upper triangle of the covariance matrix. It is valid to populate
   * only the diagonal of the matrix if the full covariance matrix is unknown.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.TMat3 velocity_enu_cov = 2 [json_name = "velocityEnuCov"];</code>
   * @return Whether the velocityEnuCov field is set.
   */
  boolean hasVelocityEnuCov();
  /**
   * <pre>
   * Velocity covariance represented by the upper triangle of the covariance matrix. It is valid to populate
   * only the diagonal of the matrix if the full covariance matrix is unknown.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.TMat3 velocity_enu_cov = 2 [json_name = "velocityEnuCov"];</code>
   * @return The velocityEnuCov.
   */
  com.anduril.entitymanager.v1.TMat3 getVelocityEnuCov();
  /**
   * <pre>
   * Velocity covariance represented by the upper triangle of the covariance matrix. It is valid to populate
   * only the diagonal of the matrix if the full covariance matrix is unknown.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.TMat3 velocity_enu_cov = 2 [json_name = "velocityEnuCov"];</code>
   */
  com.anduril.entitymanager.v1.TMat3OrBuilder getVelocityEnuCovOrBuilder();

  /**
   * <pre>
   * An ellipse that describes the certainty probability and error boundary for a given geolocation.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.ErrorEllipse position_error_ellipse = 3 [json_name = "positionErrorEllipse"];</code>
   * @return Whether the positionErrorEllipse field is set.
   */
  boolean hasPositionErrorEllipse();
  /**
   * <pre>
   * An ellipse that describes the certainty probability and error boundary for a given geolocation.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.ErrorEllipse position_error_ellipse = 3 [json_name = "positionErrorEllipse"];</code>
   * @return The positionErrorEllipse.
   */
  com.anduril.entitymanager.v1.ErrorEllipse getPositionErrorEllipse();
  /**
   * <pre>
   * An ellipse that describes the certainty probability and error boundary for a given geolocation.
   * </pre>
   *
   * <code>.anduril.entitymanager.v1.ErrorEllipse position_error_ellipse = 3 [json_name = "positionErrorEllipse"];</code>
   */
  com.anduril.entitymanager.v1.ErrorEllipseOrBuilder getPositionErrorEllipseOrBuilder();
}