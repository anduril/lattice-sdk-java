# Reference
## entity
<details><summary><code>client.entity.publishEntityRest(request) -> Entity</code></summary>
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
client.entity().publishEntityRest(
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

<details><summary><code>client.entity.getEntityById(entityId) -> Entity</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().getEntityById("entityId");
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

<details><summary><code>client.entity.putEntityOverrideRest(entityId, fieldPath, request) -> Entity</code></summary>
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
client.entity().putEntityOverrideRest(
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

**entityId:** `String` — ID of the entity to override
    
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

<details><summary><code>client.entity.removeEntityOverrideRest(entityId, fieldPath) -> Entity</code></summary>
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
client.entity().removeEntityOverrideRest("entityId", "mil_view.disposition");
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

**entityId:** `String` — ID of the entity to undo an override from
    
</dd>
</dl>

<dl>
<dd>

**fieldPath:** `String` — fieldPath to clear overrides from
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.longPollEntityEvents(request) -> EntityEventResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This is a long polling API that will first return all preexisting data and then return all new data as
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
client.entity().longPollEntityEvents(
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

## task
<details><summary><code>client.task.createTask(request) -> Task</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Submit a request to create a task and schedule it for delivery. Tasks, once delivered, will 
be asynchronously updated by their destined agent. 
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
client.task().createTask(
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

**specification:** `Optional<GoogleProtobufAny>` — Full set of task parameters.
    
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

<details><summary><code>client.task.getTaskById(taskId) -> Task</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.task().getTaskById("taskId");
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

<details><summary><code>client.task.updateTaskStatusById(taskId, request) -> Task</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.task().updateTaskStatusById(
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

<details><summary><code>client.task.queryTasks(request) -> TaskQueryResults</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.task().queryTasks(
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
Note: this is mutually exclusive with all other query parameters, i.e., either provide parent Task ID, or
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

<details><summary><code>client.task.longPollListenAsAgent(request) -> AgentRequest</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

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
client.task().longPollListenAsAgent(
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
