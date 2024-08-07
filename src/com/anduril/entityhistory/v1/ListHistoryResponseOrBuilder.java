// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entityhistory/v1/entity_history_api.pub.proto

// Protobuf Java Version: 3.25.3
package com.anduril.entityhistory.v1;

public interface ListHistoryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.entityhistory.v1.ListHistoryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.anduril.entityhistory.v1.HistoryPage history_page = 1 [json_name = "historyPage"];</code>
   * @return Whether the historyPage field is set.
   */
  boolean hasHistoryPage();
  /**
   * <code>.anduril.entityhistory.v1.HistoryPage history_page = 1 [json_name = "historyPage"];</code>
   * @return The historyPage.
   */
  com.anduril.entityhistory.v1.HistoryPage getHistoryPage();
  /**
   * <code>.anduril.entityhistory.v1.HistoryPage history_page = 1 [json_name = "historyPage"];</code>
   */
  com.anduril.entityhistory.v1.HistoryPageOrBuilder getHistoryPageOrBuilder();

  /**
   * <pre>
   * If present this page token can be used to retrieve the next page of
   * history. If empty, there are no more results.
   * This will be deprecated in favor of next_history_page_token.
   * </pre>
   *
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * If present this page token can be used to retrieve the next page of
   * history. If empty, there are no more results.
   * This will be deprecated in favor of next_history_page_token.
   * </pre>
   *
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * Next_history_page_token received should be provided as part of any followup requests to continue consuming the data
   * for the query requested until the HistoryPageToken reports is_complete as true.
   * </pre>
   *
   * <code>.anduril.entityhistory.v1.HistoryPageToken next_history_page_token = 3 [json_name = "nextHistoryPageToken"];</code>
   * @return Whether the nextHistoryPageToken field is set.
   */
  boolean hasNextHistoryPageToken();
  /**
   * <pre>
   * Next_history_page_token received should be provided as part of any followup requests to continue consuming the data
   * for the query requested until the HistoryPageToken reports is_complete as true.
   * </pre>
   *
   * <code>.anduril.entityhistory.v1.HistoryPageToken next_history_page_token = 3 [json_name = "nextHistoryPageToken"];</code>
   * @return The nextHistoryPageToken.
   */
  com.anduril.entityhistory.v1.HistoryPageToken getNextHistoryPageToken();
  /**
   * <pre>
   * Next_history_page_token received should be provided as part of any followup requests to continue consuming the data
   * for the query requested until the HistoryPageToken reports is_complete as true.
   * </pre>
   *
   * <code>.anduril.entityhistory.v1.HistoryPageToken next_history_page_token = 3 [json_name = "nextHistoryPageToken"];</code>
   */
  com.anduril.entityhistory.v1.HistoryPageTokenOrBuilder getNextHistoryPageTokenOrBuilder();
}
