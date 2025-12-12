# Reference
## Entities
<details><summary><code>client.entities.publishEntity(request) -> Entity</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Publish an entity for ingest into the Entities API. Entities created with this method are "owned" by the originator: other sources, 
such as the UI, may not edit or delete these entities. The server validates entities at API call time and 
returns an error if the entity is invalid.

An entity ID must be provided when calling this endpoint. If the entity referenced by the entity ID does not exist
then it will be created. Otherwise the entity will be updated. An entity will only be updated if its
provenance.sourceUpdateTime is greater than the provenance.sourceUpdateTime of the existing entity.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entities().publishEntity(
    Entity
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `Entity` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entities.getEntity(entityId) -> Entity</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entities().getEntity(
    "entityId",
    GetEntityRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — ID of the entity to return
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entities.overrideEntity(entityId, fieldPath, request) -> Entity</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Only fields marked with overridable can be overridden. Please refer to our documentation to see the comprehensive
list of fields that can be overridden. The entity in the request body should only have a value set on the field 
specified in the field path parameter. Field paths are rooted in the base entity object and must be represented 
using lower_snake_case. Do not include "entity" in the field path.

Note that overrides are applied in an eventually consistent manner. If multiple overrides are created 
concurrently for the same field path, the last writer wins.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entities().overrideEntity(
    "entityId",
    "mil_view.disposition",
    EntityOverride
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — The unique ID of the entity to override
    
</dd>
</dl>

<dl>
<dd>

**fieldPath:** `String` — fieldPath to override
    
</dd>
</dl>

<dl>
<dd>

**entity:** `Optional<Entity>` 

The entity containing the overridden fields. The service will extract the overridable fields from 
the object and ignore all other fields.
    
</dd>
</dl>

<dl>
<dd>

**provenance:** `Optional<Provenance>` — Additional information about the source of the override.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entities.removeEntityOverride(entityId, fieldPath) -> Entity</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This operation clears the override value from the specified field path on the entity.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entities().removeEntityOverride(
    "entityId",
    "mil_view.disposition",
    RemoveEntityOverrideRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — The unique ID of the entity to undo an override from.
    
</dd>
</dl>

<dl>
<dd>

**fieldPath:** `String` — The fieldPath to clear overrides from.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entities.longPollEntityEvents(request) -> EntityEventResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This is a long polling API that will first return all pre-existing data and then return all new data as
it becomes available. If you want to start a new polling session then open a request with an empty
'sessionToken' in the request body. The server will return a new session token in the response.
If you want to retrieve the next batch of results from an existing polling session then send the session
token you received from the server in the request body. If no new data is available then the server will
hold the connection open for up to 5 minutes. After the 5 minute timeout period, the server will close the 
connection with no results and you may resume polling with the same session token. If your session falls behind 
more than 3x the total number of entities in the environment, the server will terminate your session. 
In this case you must start a new session by sending a request with an empty session token.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entities().longPollEntityEvents(
    EntityEventRequest
        .builder()
        .sessionToken("sessionToken")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**sessionToken:** `String` — Long-poll session identifier. Leave empty to start a new polling session.
    
</dd>
</dl>

<dl>
<dd>

**batchSize:** `Optional<Integer>` — Maximum size of response batch. Defaults to 100. Must be between 1 and 2000 (inclusive).
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entities.streamEntities(request) -> Optional&lt;StreamEntitiesResponse&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Establishes a server-sent events (SSE) connection that streams entity data in real-time.
This is a one-way connection from server to client that follows the SSE protocol with text/event-stream content type.

This endpoint enables clients to maintain a real-time view of the common operational picture (COP)
by first streaming all pre-existing entities that match filter criteria, then continuously delivering
updates as entities are created, modified, or deleted.

The server first sends events with type PREEXISTING for all live entities matching the filter that existed before the stream was open,
then streams CREATE events for newly created entities, UPDATE events when existing entities change, and DELETED events when entities are removed. The stream remains open
indefinitely unless preExistingOnly is set to true.

Heartbeat messages can be configured to maintain connection health and detect disconnects by setting the heartbeatIntervalMS
parameter. These heartbeats help keep the connection alive and allow clients to verify the server is still responsive.

Clients can optimize bandwidth usage by specifying which entity components they need populated using the componentsToInclude parameter.
This allows receiving only relevant data instead of complete entities.

The connection automatically recovers from temporary disconnections, resuming the stream where it left off. Unlike polling approaches,
this provides real-time updates with minimal latency and reduced server load.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entities().streamEntities(
    EntityStreamRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**heartbeatIntervalMs:** `Optional<Integer>` — at what interval to send heartbeat events, defaults to 30s.
    
</dd>
</dl>

<dl>
<dd>

**preExistingOnly:** `Optional<Boolean>` — only stream pre-existing entities in the environment and then close the connection, defaults to false.
    
</dd>
</dl>

<dl>
<dd>

**componentsToInclude:** `Optional<List<String>>` — list of components to include, leave empty to include all components.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Tasks
<details><summary><code>client.tasks.createTask(request) -> Task</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a new Task in the system with the specified parameters.

This method initiates a new task with a unique ID (either provided or auto-generated),
sets the initial task state to STATUS_CREATED, and establishes task ownership. The task
can be assigned to a specific agent through the Relations field.

Once created, a task enters the lifecycle workflow and can be tracked, updated, and managed
through other Tasks API endpoints.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tasks().createTask(
    TaskCreation
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**taskId:** `Optional<String>` 

If non-empty, will set the requested Task ID, otherwise will generate a new random
GUID. Will reject if supplied Task ID does not match [A-Za-z0-9_-.]{5,36}.
    
</dd>
</dl>

<dl>
<dd>

**displayName:** `Optional<String>` — Human readable display name for this Task, should be short (<100 chars).
    
</dd>
</dl>

<dl>
<dd>

**description:** `Optional<String>` — Longer, free form human readable description of this Task.
    
</dd>
</dl>

<dl>
<dd>

**specification:** `Optional<GoogleProtobufAny>` — The path for the Protobuf task definition, and the complete task data.
    
</dd>
</dl>

<dl>
<dd>

**author:** `Optional<Principal>` 
    
</dd>
</dl>

<dl>
<dd>

**relations:** `Optional<Relations>` 

Any relationships associated with this Task, such as a parent Task or an assignee
this Task is designated to for execution.
    
</dd>
</dl>

<dl>
<dd>

**isExecutedElsewhere:** `Optional<Boolean>` 

If set, then the service will not trigger execution of this task on an agent. Useful
for when ingesting tasks from an external system that is triggering execution of tasks
on agents.
    
</dd>
</dl>

<dl>
<dd>

**initialEntities:** `Optional<List<TaskEntity>>` 

Indicates an initial set of entities that can be used to execute an entity aware
task. For example, an entity Objective, an entity Keep In Zone, etc.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tasks.getTask(taskId) -> Task</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieves a specific Task by its ID, with options to select a particular task version or view.

This method returns detailed information about a task including its current status,
specification, relations, and other metadata. The response includes the complete Task object
with all associated fields.

By default, the method returns the latest definition version of the task from the manager's
perspective.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tasks().getTask(
    "taskId",
    GetTaskRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**taskId:** `String` — ID of task to return
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tasks.updateTaskStatus(taskId, request) -> Task</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Updates the status of a Task as it progresses through its lifecycle.

This method allows agents or operators to report the current state of a task,
which could include changes to task status, and error information.

Each status update increments the task's status_version. When updating status,
clients must provide the current version to ensure consistency. The system rejects
updates with mismatched versions to prevent race conditions.

Terminal states (`STATUS_DONE_OK` and `STATUS_DONE_NOT_OK`) are permanent; once a task
reaches these states, no further updates are allowed.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tasks().updateTaskStatus(
    "taskId",
    TaskStatusUpdate
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**taskId:** `String` — ID of task to update status of
    
</dd>
</dl>

<dl>
<dd>

**statusVersion:** `Optional<Integer>` 

The status version of the task to update. This version number increments to indicate the task's 
current stage in its status lifecycle. Specifically, whenever a task's status updates, the status 
version increments by one. Any status updates received with a lower status version number than what 
is known are considered stale and ignored.
    
</dd>
</dl>

<dl>
<dd>

**newStatus:** `Optional<TaskStatus>` — The new status of the task.
    
</dd>
</dl>

<dl>
<dd>

**author:** `Optional<Principal>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tasks.queryTasks(request) -> TaskQueryResults</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Searches for Tasks that match specified filtering criteria and returns matching tasks in paginated form.

This method allows filtering tasks based on multiple criteria including:
- Parent task relationships
- Task status (with inclusive or exclusive filtering)
- Update time ranges
- Task view (manager or agent perspective)
- Task assignee
- Task type (via exact URL matches or prefix matching)

Results are returned in pages. When more results are available than can be returned in a single
response, a page_token is provided that can be used in subsequent requests to retrieve the next
set of results.

By default, this returns the latest task version for each matching task from the manager's perspective.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tasks().queryTasks(
    TaskQuery
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**pageToken:** `Optional<String>` — If set, returns results starting from the given pageToken.
    
</dd>
</dl>

<dl>
<dd>

**parentTaskId:** `Optional<String>` 

If present matches Tasks with this parent Task ID.
Note: this is mutually exclusive with all other query parameters, for example, either provide parent task ID, or
any of the remaining parameters, but not both.
    
</dd>
</dl>

<dl>
<dd>

**statusFilter:** `Optional<TaskQueryStatusFilter>` 
    
</dd>
</dl>

<dl>
<dd>

**updateTimeRange:** `Optional<TaskQueryUpdateTimeRange>` — If provided, only provides Tasks updated within the time range.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tasks.listenAsAgent(request) -> AgentRequest</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Establishes a server streaming connection that delivers tasks to taskable agents for execution.

This method creates a persistent connection from Tasks API to an agent, allowing the server
to push tasks to the agent as they become available. The agent receives a stream of tasks that
match its selector criteria (entity IDs).

The stream delivers three types of requests:
- ExecuteRequest: Contains a new task for the agent to execute
- CancelRequest: Indicates a task should be canceled
- CompleteRequest: Indicates a task should be completed

This is the primary method for taskable agents to receive and process tasks in real-time.
Agents should maintain this connection and process incoming tasks according to their capabilities.

When an agent receives a task, it should update the task status using the UpdateStatus endpoint
to provide progress information back to Tasks API.

This is a long polling API that will block until a new task is ready for delivery. If no new task is
available then the server will hold on to your request for up to 5 minutes, after that 5 minute timeout
period you will be expected to reinitiate a new request.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tasks().listenAsAgent(
    AgentListener
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**agentSelector:** `Optional<EntityIdsSelector>` — Selector criteria to determine which Agent Tasks the agent receives
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Objects
<details><summary><code>client.objects.listObjects() -> SyncPagingIterable&lt;PathMetadata&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists objects in your environment. You can define a prefix to list a subset of your objects. If you do not set a prefix, Lattice returns all available objects. By default this endpoint will list local objects only.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.objects().listObjects(
    ListObjectsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**prefix:** `Optional<String>` — Filters the objects based on the specified prefix path. If no path is specified, all objects are returned.
    
</dd>
</dl>

<dl>
<dd>

**sinceTimestamp:** `Optional<OffsetDateTime>` — Sets the age for the oldest objects to query across the environment.
    
</dd>
</dl>

<dl>
<dd>

**pageToken:** `Optional<String>` — Base64 and URL-encoded cursor returned by the service to continue paging.
    
</dd>
</dl>

<dl>
<dd>

**allObjectsInMesh:** `Optional<Boolean>` — Lists objects across all environment nodes in a Lattice Mesh.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.objects.getObject(objectPath) -> InputStream</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Fetches an object from your environment using the objectPath path parameter.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.objects().getObject(
    "objectPath",
    GetObjectRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**objectPath:** `String` — The path of the object to fetch.
    
</dd>
</dl>

<dl>
<dd>

**acceptEncoding:** `Optional<GetObjectRequestAcceptEncoding>` — If set, Lattice will compress the response using the specified compression method. If the header is not defined, or the compression method is set to `identity`, no compression will be applied to the response.
    
</dd>
</dl>

<dl>
<dd>

**priority:** `Optional<String>` — Indicates a client's preference for the priority of the response. The value is a structured header as defined in RFC 9218. If you do not set the header, Lattice uses the default priority set for the environment. Incremental delivery directives are not supported and will be ignored.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.objects.uploadObject(objectPath, request) -> PathMetadata</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Uploads an object. The object must be 1 GiB or smaller.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.objects().uploadObject("".getBytes());
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**objectPath:** `String` — Path of the Object that is to be uploaded.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.objects.deleteObject(objectPath)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deletes an object from your environment given the objectPath path parameter.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.objects().deleteObject(
    "objectPath",
    DeleteObjectRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**objectPath:** `String` — The path of the object to delete.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.objects.getObjectMetadata(objectPath)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns metadata for a specified object path. Use this to fetch metadata such as object size (size_bytes), its expiry time (expiry_time), or its latest update timestamp (last_updated_at).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.objects().getObjectMetadata(
    "objectPath",
    GetObjectMetadataRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**objectPath:** `String` — The path of the object to query.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>
