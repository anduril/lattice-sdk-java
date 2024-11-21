// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/taskmanager/v1/task_manager_grpcapi.pub.proto

package com.anduril.taskmanager.v1;

public interface CreateTaskRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:anduril.taskmanager.v1.CreateTaskRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Human readable display name for this Task, should be short (&lt;100 chars).
   * </pre>
   *
   * <code>string display_name = 1 [json_name = "displayName"];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Human readable display name for this Task, should be short (&lt;100 chars).
   * </pre>
   *
   * <code>string display_name = 1 [json_name = "displayName"];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Full task parameterization, must be a message under anduril/tasks/v*&#47;.
   * </pre>
   *
   * <code>.google.protobuf.Any specification = 2 [json_name = "specification"];</code>
   * @return Whether the specification field is set.
   */
  boolean hasSpecification();
  /**
   * <pre>
   * Full task parameterization, must be a message under anduril/tasks/v*&#47;.
   * </pre>
   *
   * <code>.google.protobuf.Any specification = 2 [json_name = "specification"];</code>
   * @return The specification.
   */
  com.google.protobuf.Any getSpecification();
  /**
   * <pre>
   * Full task parameterization, must be a message under anduril/tasks/v*&#47;.
   * </pre>
   *
   * <code>.google.protobuf.Any specification = 2 [json_name = "specification"];</code>
   */
  com.google.protobuf.AnyOrBuilder getSpecificationOrBuilder();

  /**
   * <pre>
   * Who or what is creating this Task. For example, if a user created this Task via a UI, it would
   *  contain the "user" Principal type with the user ID of that user. Or if a service is calling the
   *  CreateTask endpoint, then a "service" Principal type is to be provided.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Principal author = 3 [json_name = "author"];</code>
   * @return Whether the author field is set.
   */
  boolean hasAuthor();
  /**
   * <pre>
   * Who or what is creating this Task. For example, if a user created this Task via a UI, it would
   *  contain the "user" Principal type with the user ID of that user. Or if a service is calling the
   *  CreateTask endpoint, then a "service" Principal type is to be provided.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Principal author = 3 [json_name = "author"];</code>
   * @return The author.
   */
  com.anduril.taskmanager.v1.Principal getAuthor();
  /**
   * <pre>
   * Who or what is creating this Task. For example, if a user created this Task via a UI, it would
   *  contain the "user" Principal type with the user ID of that user. Or if a service is calling the
   *  CreateTask endpoint, then a "service" Principal type is to be provided.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Principal author = 3 [json_name = "author"];</code>
   */
  com.anduril.taskmanager.v1.PrincipalOrBuilder getAuthorOrBuilder();

  /**
   * <pre>
   * Any relationships associated with this Task, such as a parent Task or an assignee this Task is designated to
   *  for execution.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Relations relations = 5 [json_name = "relations"];</code>
   * @return Whether the relations field is set.
   */
  boolean hasRelations();
  /**
   * <pre>
   * Any relationships associated with this Task, such as a parent Task or an assignee this Task is designated to
   *  for execution.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Relations relations = 5 [json_name = "relations"];</code>
   * @return The relations.
   */
  com.anduril.taskmanager.v1.Relations getRelations();
  /**
   * <pre>
   * Any relationships associated with this Task, such as a parent Task or an assignee this Task is designated to
   *  for execution.
   * </pre>
   *
   * <code>.anduril.taskmanager.v1.Relations relations = 5 [json_name = "relations"];</code>
   */
  com.anduril.taskmanager.v1.RelationsOrBuilder getRelationsOrBuilder();

  /**
   * <pre>
   * Longer, free form human readable description of this Task.
   * </pre>
   *
   * <code>string description = 6 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Longer, free form human readable description of this Task.
   * </pre>
   *
   * <code>string description = 6 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * If set, then task-manager will not trigger execution of this task on an agent. Useful for when ingesting
   * tasks from an external system that is triggering execution of tasks on agents.
   * </pre>
   *
   * <code>bool is_executed_elsewhere = 7 [json_name = "isExecutedElsewhere"];</code>
   * @return The isExecutedElsewhere.
   */
  boolean getIsExecutedElsewhere();

  /**
   * <pre>
   * If non-empty, will set the requested Task ID, otherwise will generate a new random GUID.
   *  Will reject if supplied Task ID does not match `[A-Za-z0-9_-.]{5,36}`.
   * </pre>
   *
   * <code>string task_id = 8 [json_name = "taskId"];</code>
   * @return The taskId.
   */
  java.lang.String getTaskId();
  /**
   * <pre>
   * If non-empty, will set the requested Task ID, otherwise will generate a new random GUID.
   *  Will reject if supplied Task ID does not match `[A-Za-z0-9_-.]{5,36}`.
   * </pre>
   *
   * <code>string task_id = 8 [json_name = "taskId"];</code>
   * @return The bytes for taskId.
   */
  com.google.protobuf.ByteString
      getTaskIdBytes();

  /**
   * <pre>
   * Indicates an initial set of entities that can be used to execute an entity aware task.
   * For example, an entity Objective, an entity Keep In Zone, etc.
   * </pre>
   *
   * <code>repeated .anduril.taskmanager.v1.TaskEntity initial_entities = 9 [json_name = "initialEntities"];</code>
   */
  java.util.List<com.anduril.taskmanager.v1.TaskEntity> 
      getInitialEntitiesList();
  /**
   * <pre>
   * Indicates an initial set of entities that can be used to execute an entity aware task.
   * For example, an entity Objective, an entity Keep In Zone, etc.
   * </pre>
   *
   * <code>repeated .anduril.taskmanager.v1.TaskEntity initial_entities = 9 [json_name = "initialEntities"];</code>
   */
  com.anduril.taskmanager.v1.TaskEntity getInitialEntities(int index);
  /**
   * <pre>
   * Indicates an initial set of entities that can be used to execute an entity aware task.
   * For example, an entity Objective, an entity Keep In Zone, etc.
   * </pre>
   *
   * <code>repeated .anduril.taskmanager.v1.TaskEntity initial_entities = 9 [json_name = "initialEntities"];</code>
   */
  int getInitialEntitiesCount();
  /**
   * <pre>
   * Indicates an initial set of entities that can be used to execute an entity aware task.
   * For example, an entity Objective, an entity Keep In Zone, etc.
   * </pre>
   *
   * <code>repeated .anduril.taskmanager.v1.TaskEntity initial_entities = 9 [json_name = "initialEntities"];</code>
   */
  java.util.List<? extends com.anduril.taskmanager.v1.TaskEntityOrBuilder> 
      getInitialEntitiesOrBuilderList();
  /**
   * <pre>
   * Indicates an initial set of entities that can be used to execute an entity aware task.
   * For example, an entity Objective, an entity Keep In Zone, etc.
   * </pre>
   *
   * <code>repeated .anduril.taskmanager.v1.TaskEntity initial_entities = 9 [json_name = "initialEntities"];</code>
   */
  com.anduril.taskmanager.v1.TaskEntityOrBuilder getInitialEntitiesOrBuilder(
      int index);
}
