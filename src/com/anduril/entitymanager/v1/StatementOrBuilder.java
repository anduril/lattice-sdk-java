// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/filter.pub.proto

package com.anduril.entitymanager.v1;

public interface StatementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.Statement)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.anduril.entitymanager.v1.AndOperation and = 1 [json_name = "and"];</code>
   * @return Whether the and field is set.
   */
  boolean hasAnd();
  /**
   * <code>.anduril.entitymanager.v1.AndOperation and = 1 [json_name = "and"];</code>
   * @return The and.
   */
  com.anduril.entitymanager.v1.AndOperation getAnd();
  /**
   * <code>.anduril.entitymanager.v1.AndOperation and = 1 [json_name = "and"];</code>
   */
  com.anduril.entitymanager.v1.AndOperationOrBuilder getAndOrBuilder();

  /**
   * <code>.anduril.entitymanager.v1.OrOperation or = 2 [json_name = "or"];</code>
   * @return Whether the or field is set.
   */
  boolean hasOr();
  /**
   * <code>.anduril.entitymanager.v1.OrOperation or = 2 [json_name = "or"];</code>
   * @return The or.
   */
  com.anduril.entitymanager.v1.OrOperation getOr();
  /**
   * <code>.anduril.entitymanager.v1.OrOperation or = 2 [json_name = "or"];</code>
   */
  com.anduril.entitymanager.v1.OrOperationOrBuilder getOrOrBuilder();

  /**
   * <code>.anduril.entitymanager.v1.NotOperation not = 3 [json_name = "not"];</code>
   * @return Whether the not field is set.
   */
  boolean hasNot();
  /**
   * <code>.anduril.entitymanager.v1.NotOperation not = 3 [json_name = "not"];</code>
   * @return The not.
   */
  com.anduril.entitymanager.v1.NotOperation getNot();
  /**
   * <code>.anduril.entitymanager.v1.NotOperation not = 3 [json_name = "not"];</code>
   */
  com.anduril.entitymanager.v1.NotOperationOrBuilder getNotOrBuilder();

  /**
   * <code>.anduril.entitymanager.v1.ListOperation list = 4 [json_name = "list"];</code>
   * @return Whether the list field is set.
   */
  boolean hasList();
  /**
   * <code>.anduril.entitymanager.v1.ListOperation list = 4 [json_name = "list"];</code>
   * @return The list.
   */
  com.anduril.entitymanager.v1.ListOperation getList();
  /**
   * <code>.anduril.entitymanager.v1.ListOperation list = 4 [json_name = "list"];</code>
   */
  com.anduril.entitymanager.v1.ListOperationOrBuilder getListOrBuilder();

  /**
   * <code>.anduril.entitymanager.v1.Predicate predicate = 5 [json_name = "predicate"];</code>
   * @return Whether the predicate field is set.
   */
  boolean hasPredicate();
  /**
   * <code>.anduril.entitymanager.v1.Predicate predicate = 5 [json_name = "predicate"];</code>
   * @return The predicate.
   */
  com.anduril.entitymanager.v1.Predicate getPredicate();
  /**
   * <code>.anduril.entitymanager.v1.Predicate predicate = 5 [json_name = "predicate"];</code>
   */
  com.anduril.entitymanager.v1.PredicateOrBuilder getPredicateOrBuilder();

  com.anduril.entitymanager.v1.Statement.OperationCase getOperationCase();
}
