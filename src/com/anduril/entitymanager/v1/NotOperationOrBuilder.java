// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/filter.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.entitymanager.v1;

public interface NotOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.NotOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.anduril.entitymanager.v1.Predicate predicate = 1 [json_name = "predicate"];</code>
   * @return Whether the predicate field is set.
   */
  boolean hasPredicate();
  /**
   * <code>.anduril.entitymanager.v1.Predicate predicate = 1 [json_name = "predicate"];</code>
   * @return The predicate.
   */
  com.anduril.entitymanager.v1.Predicate getPredicate();
  /**
   * <code>.anduril.entitymanager.v1.Predicate predicate = 1 [json_name = "predicate"];</code>
   */
  com.anduril.entitymanager.v1.PredicateOrBuilder getPredicateOrBuilder();

  /**
   * <code>.anduril.entitymanager.v1.Statement statement = 2 [json_name = "statement"];</code>
   * @return Whether the statement field is set.
   */
  boolean hasStatement();
  /**
   * <code>.anduril.entitymanager.v1.Statement statement = 2 [json_name = "statement"];</code>
   * @return The statement.
   */
  com.anduril.entitymanager.v1.Statement getStatement();
  /**
   * <code>.anduril.entitymanager.v1.Statement statement = 2 [json_name = "statement"];</code>
   */
  com.anduril.entitymanager.v1.StatementOrBuilder getStatementOrBuilder();

  com.anduril.entitymanager.v1.NotOperation.ChildCase getChildCase();
}
