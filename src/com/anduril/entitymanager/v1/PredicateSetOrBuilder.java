// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/filter.pub.proto

package com.anduril.entitymanager.v1;

public interface PredicateSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entitymanager.v1.PredicateSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .anduril.entitymanager.v1.Predicate predicates = 1 [json_name = "predicates"];</code>
   */
  java.util.List<com.anduril.entitymanager.v1.Predicate> 
      getPredicatesList();
  /**
   * <code>repeated .anduril.entitymanager.v1.Predicate predicates = 1 [json_name = "predicates"];</code>
   */
  com.anduril.entitymanager.v1.Predicate getPredicates(int index);
  /**
   * <code>repeated .anduril.entitymanager.v1.Predicate predicates = 1 [json_name = "predicates"];</code>
   */
  int getPredicatesCount();
  /**
   * <code>repeated .anduril.entitymanager.v1.Predicate predicates = 1 [json_name = "predicates"];</code>
   */
  java.util.List<? extends com.anduril.entitymanager.v1.PredicateOrBuilder> 
      getPredicatesOrBuilderList();
  /**
   * <code>repeated .anduril.entitymanager.v1.Predicate predicates = 1 [json_name = "predicates"];</code>
   */
  com.anduril.entitymanager.v1.PredicateOrBuilder getPredicatesOrBuilder(
      int index);
}