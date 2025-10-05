package com.anduril;

import com.anduril.core.ObjectMappers;
import com.anduril.resources.tasks.requests.AgentListener;
import com.anduril.resources.tasks.requests.TaskCreation;
import com.anduril.resources.tasks.requests.TaskQuery;
import com.anduril.resources.tasks.requests.TaskStatusUpdate;
import com.anduril.types.AgentRequest;
import com.anduril.types.Task;
import com.anduril.types.TaskQueryResults;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TasksWireTest {
    private MockWebServer server;
    private Lattice client;
    private ObjectMapper objectMapper = ObjectMappers.JSON_MAPPER;

    @BeforeEach
    public void setup() throws Exception {
        server = new MockWebServer();
        server.start();
        client = Lattice.builder()
                .url(server.url("/").toString())
                .token("test-token")
                .build();
    }

    @AfterEach
    public void teardown() throws Exception {
        server.shutdown();
    }

    @Test
    public void testCreateTask() throws Exception {
        server.enqueue(
                new MockResponse()
                        .setResponseCode(200)
                        .setBody(
                                "{\"version\":{\"taskId\":\"taskId\",\"definitionVersion\":1,\"statusVersion\":1},\"displayName\":\"displayName\",\"specification\":{\"@type\":\"@type\"},\"createdBy\":{\"system\":{\"serviceName\":\"serviceName\",\"entityId\":\"entityId\",\"managesOwnScheduling\":true},\"user\":{\"userId\":\"userId\"},\"team\":{\"entityId\":\"entityId\",\"members\":[{}]}},\"lastUpdatedBy\":{\"system\":{\"serviceName\":\"serviceName\",\"entityId\":\"entityId\",\"managesOwnScheduling\":true},\"user\":{\"userId\":\"userId\"},\"team\":{\"entityId\":\"entityId\",\"members\":[{}]}},\"lastUpdateTime\":\"2024-01-15T09:30:00Z\",\"status\":{\"status\":\"STATUS_INVALID\",\"taskError\":{\"code\":\"ERROR_CODE_INVALID\",\"message\":\"message\"},\"progress\":{\"@type\":\"@type\"},\"result\":{\"@type\":\"@type\"},\"startTime\":\"2024-01-15T09:30:00Z\",\"estimate\":{\"@type\":\"@type\"},\"allocation\":{\"activeAgents\":[{}]}},\"scheduledTime\":\"2024-01-15T09:30:00Z\",\"relations\":{\"parentTaskId\":\"parentTaskId\"},\"description\":\"description\",\"isExecutedElsewhere\":true,\"createTime\":\"2024-01-15T09:30:00Z\",\"replication\":{\"staleTime\":\"2024-01-15T09:30:00Z\"},\"initialEntities\":[{\"snapshot\":true}],\"owner\":{\"entityId\":\"entityId\"}}"));
        Task response = client.tasks().createTask(TaskCreation.builder().build());
        RecordedRequest request = server.takeRequest();
        Assertions.assertNotNull(request);
        Assertions.assertEquals("POST", request.getMethod());
        // Validate request body
        String actualRequestBody = request.getBody().readUtf8();
        String expectedRequestBody = "" + "{}";
        JsonNode actualJson = objectMapper.readTree(actualRequestBody);
        JsonNode expectedJson = objectMapper.readTree(expectedRequestBody);
        Assertions.assertEquals(expectedJson, actualJson, "Request body structure does not match expected");
        if (actualJson.has("type") || actualJson.has("_type") || actualJson.has("kind")) {
            String discriminator = null;
            if (actualJson.has("type")) discriminator = actualJson.get("type").asText();
            else if (actualJson.has("_type"))
                discriminator = actualJson.get("_type").asText();
            else if (actualJson.has("kind"))
                discriminator = actualJson.get("kind").asText();
            Assertions.assertNotNull(discriminator, "Union type should have a discriminator field");
            Assertions.assertFalse(discriminator.isEmpty(), "Union discriminator should not be empty");
        }

        if (!actualJson.isNull()) {
            Assertions.assertTrue(
                    actualJson.isObject() || actualJson.isArray() || actualJson.isValueNode(),
                    "request should be a valid JSON value");
        }

        if (actualJson.isArray()) {
            Assertions.assertTrue(actualJson.size() >= 0, "Array should have valid size");
        }
        if (actualJson.isObject()) {
            Assertions.assertTrue(actualJson.size() >= 0, "Object should have valid field count");
        }

        // Validate response body
        Assertions.assertNotNull(response, "Response should not be null");
        String actualResponseJson = objectMapper.writeValueAsString(response);
        String expectedResponseBody = ""
                + "{\n"
                + "  \"version\": {\n"
                + "    \"taskId\": \"taskId\",\n"
                + "    \"definitionVersion\": 1,\n"
                + "    \"statusVersion\": 1\n"
                + "  },\n"
                + "  \"displayName\": \"displayName\",\n"
                + "  \"specification\": {\n"
                + "    \"@type\": \"@type\"\n"
                + "  },\n"
                + "  \"createdBy\": {\n"
                + "    \"system\": {\n"
                + "      \"serviceName\": \"serviceName\",\n"
                + "      \"entityId\": \"entityId\",\n"
                + "      \"managesOwnScheduling\": true\n"
                + "    },\n"
                + "    \"user\": {\n"
                + "      \"userId\": \"userId\"\n"
                + "    },\n"
                + "    \"team\": {\n"
                + "      \"entityId\": \"entityId\",\n"
                + "      \"members\": [\n"
                + "        {}\n"
                + "      ]\n"
                + "    }\n"
                + "  },\n"
                + "  \"lastUpdatedBy\": {\n"
                + "    \"system\": {\n"
                + "      \"serviceName\": \"serviceName\",\n"
                + "      \"entityId\": \"entityId\",\n"
                + "      \"managesOwnScheduling\": true\n"
                + "    },\n"
                + "    \"user\": {\n"
                + "      \"userId\": \"userId\"\n"
                + "    },\n"
                + "    \"team\": {\n"
                + "      \"entityId\": \"entityId\",\n"
                + "      \"members\": [\n"
                + "        {}\n"
                + "      ]\n"
                + "    }\n"
                + "  },\n"
                + "  \"lastUpdateTime\": \"2024-01-15T09:30:00Z\",\n"
                + "  \"status\": {\n"
                + "    \"status\": \"STATUS_INVALID\",\n"
                + "    \"taskError\": {\n"
                + "      \"code\": \"ERROR_CODE_INVALID\",\n"
                + "      \"message\": \"message\"\n"
                + "    },\n"
                + "    \"progress\": {\n"
                + "      \"@type\": \"@type\"\n"
                + "    },\n"
                + "    \"result\": {\n"
                + "      \"@type\": \"@type\"\n"
                + "    },\n"
                + "    \"startTime\": \"2024-01-15T09:30:00Z\",\n"
                + "    \"estimate\": {\n"
                + "      \"@type\": \"@type\"\n"
                + "    },\n"
                + "    \"allocation\": {\n"
                + "      \"activeAgents\": [\n"
                + "        {}\n"
                + "      ]\n"
                + "    }\n"
                + "  },\n"
                + "  \"scheduledTime\": \"2024-01-15T09:30:00Z\",\n"
                + "  \"relations\": {\n"
                + "    \"parentTaskId\": \"parentTaskId\"\n"
                + "  },\n"
                + "  \"description\": \"description\",\n"
                + "  \"isExecutedElsewhere\": true,\n"
                + "  \"createTime\": \"2024-01-15T09:30:00Z\",\n"
                + "  \"replication\": {\n"
                + "    \"staleTime\": \"2024-01-15T09:30:00Z\"\n"
                + "  },\n"
                + "  \"initialEntities\": [\n"
                + "    {\n"
                + "      \"snapshot\": true\n"
                + "    }\n"
                + "  ],\n"
                + "  \"owner\": {\n"
                + "    \"entityId\": \"entityId\"\n"
                + "  }\n"
                + "}";
        JsonNode actualResponseNode = objectMapper.readTree(actualResponseJson);
        JsonNode expectedResponseNode = objectMapper.readTree(expectedResponseBody);
        Assertions.assertEquals(
                expectedResponseNode, actualResponseNode, "Response body structure does not match expected");
        if (actualResponseNode.has("type") || actualResponseNode.has("_type") || actualResponseNode.has("kind")) {
            String discriminator = null;
            if (actualResponseNode.has("type"))
                discriminator = actualResponseNode.get("type").asText();
            else if (actualResponseNode.has("_type"))
                discriminator = actualResponseNode.get("_type").asText();
            else if (actualResponseNode.has("kind"))
                discriminator = actualResponseNode.get("kind").asText();
            Assertions.assertNotNull(discriminator, "Union type should have a discriminator field");
            Assertions.assertFalse(discriminator.isEmpty(), "Union discriminator should not be empty");
        }

        if (!actualResponseNode.isNull()) {
            Assertions.assertTrue(
                    actualResponseNode.isObject() || actualResponseNode.isArray() || actualResponseNode.isValueNode(),
                    "response should be a valid JSON value");
        }

        if (actualResponseNode.isArray()) {
            Assertions.assertTrue(actualResponseNode.size() >= 0, "Array should have valid size");
        }
        if (actualResponseNode.isObject()) {
            Assertions.assertTrue(actualResponseNode.size() >= 0, "Object should have valid field count");
        }
    }

    @Test
    public void testGetTask() throws Exception {
        server.enqueue(
                new MockResponse()
                        .setResponseCode(200)
                        .setBody(
                                "{\"version\":{\"taskId\":\"taskId\",\"definitionVersion\":1,\"statusVersion\":1},\"displayName\":\"displayName\",\"specification\":{\"@type\":\"@type\"},\"createdBy\":{\"system\":{\"serviceName\":\"serviceName\",\"entityId\":\"entityId\",\"managesOwnScheduling\":true},\"user\":{\"userId\":\"userId\"},\"team\":{\"entityId\":\"entityId\",\"members\":[{}]}},\"lastUpdatedBy\":{\"system\":{\"serviceName\":\"serviceName\",\"entityId\":\"entityId\",\"managesOwnScheduling\":true},\"user\":{\"userId\":\"userId\"},\"team\":{\"entityId\":\"entityId\",\"members\":[{}]}},\"lastUpdateTime\":\"2024-01-15T09:30:00Z\",\"status\":{\"status\":\"STATUS_INVALID\",\"taskError\":{\"code\":\"ERROR_CODE_INVALID\",\"message\":\"message\"},\"progress\":{\"@type\":\"@type\"},\"result\":{\"@type\":\"@type\"},\"startTime\":\"2024-01-15T09:30:00Z\",\"estimate\":{\"@type\":\"@type\"},\"allocation\":{\"activeAgents\":[{}]}},\"scheduledTime\":\"2024-01-15T09:30:00Z\",\"relations\":{\"parentTaskId\":\"parentTaskId\"},\"description\":\"description\",\"isExecutedElsewhere\":true,\"createTime\":\"2024-01-15T09:30:00Z\",\"replication\":{\"staleTime\":\"2024-01-15T09:30:00Z\"},\"initialEntities\":[{\"snapshot\":true}],\"owner\":{\"entityId\":\"entityId\"}}"));
        Task response = client.tasks().getTask("taskId");
        RecordedRequest request = server.takeRequest();
        Assertions.assertNotNull(request);
        Assertions.assertEquals("GET", request.getMethod());

        // Validate response body
        Assertions.assertNotNull(response, "Response should not be null");
        String actualResponseJson = objectMapper.writeValueAsString(response);
        String expectedResponseBody = ""
                + "{\n"
                + "  \"version\": {\n"
                + "    \"taskId\": \"taskId\",\n"
                + "    \"definitionVersion\": 1,\n"
                + "    \"statusVersion\": 1\n"
                + "  },\n"
                + "  \"displayName\": \"displayName\",\n"
                + "  \"specification\": {\n"
                + "    \"@type\": \"@type\"\n"
                + "  },\n"
                + "  \"createdBy\": {\n"
                + "    \"system\": {\n"
                + "      \"serviceName\": \"serviceName\",\n"
                + "      \"entityId\": \"entityId\",\n"
                + "      \"managesOwnScheduling\": true\n"
                + "    },\n"
                + "    \"user\": {\n"
                + "      \"userId\": \"userId\"\n"
                + "    },\n"
                + "    \"team\": {\n"
                + "      \"entityId\": \"entityId\",\n"
                + "      \"members\": [\n"
                + "        {}\n"
                + "      ]\n"
                + "    }\n"
                + "  },\n"
                + "  \"lastUpdatedBy\": {\n"
                + "    \"system\": {\n"
                + "      \"serviceName\": \"serviceName\",\n"
                + "      \"entityId\": \"entityId\",\n"
                + "      \"managesOwnScheduling\": true\n"
                + "    },\n"
                + "    \"user\": {\n"
                + "      \"userId\": \"userId\"\n"
                + "    },\n"
                + "    \"team\": {\n"
                + "      \"entityId\": \"entityId\",\n"
                + "      \"members\": [\n"
                + "        {}\n"
                + "      ]\n"
                + "    }\n"
                + "  },\n"
                + "  \"lastUpdateTime\": \"2024-01-15T09:30:00Z\",\n"
                + "  \"status\": {\n"
                + "    \"status\": \"STATUS_INVALID\",\n"
                + "    \"taskError\": {\n"
                + "      \"code\": \"ERROR_CODE_INVALID\",\n"
                + "      \"message\": \"message\"\n"
                + "    },\n"
                + "    \"progress\": {\n"
                + "      \"@type\": \"@type\"\n"
                + "    },\n"
                + "    \"result\": {\n"
                + "      \"@type\": \"@type\"\n"
                + "    },\n"
                + "    \"startTime\": \"2024-01-15T09:30:00Z\",\n"
                + "    \"estimate\": {\n"
                + "      \"@type\": \"@type\"\n"
                + "    },\n"
                + "    \"allocation\": {\n"
                + "      \"activeAgents\": [\n"
                + "        {}\n"
                + "      ]\n"
                + "    }\n"
                + "  },\n"
                + "  \"scheduledTime\": \"2024-01-15T09:30:00Z\",\n"
                + "  \"relations\": {\n"
                + "    \"parentTaskId\": \"parentTaskId\"\n"
                + "  },\n"
                + "  \"description\": \"description\",\n"
                + "  \"isExecutedElsewhere\": true,\n"
                + "  \"createTime\": \"2024-01-15T09:30:00Z\",\n"
                + "  \"replication\": {\n"
                + "    \"staleTime\": \"2024-01-15T09:30:00Z\"\n"
                + "  },\n"
                + "  \"initialEntities\": [\n"
                + "    {\n"
                + "      \"snapshot\": true\n"
                + "    }\n"
                + "  ],\n"
                + "  \"owner\": {\n"
                + "    \"entityId\": \"entityId\"\n"
                + "  }\n"
                + "}";
        JsonNode actualResponseNode = objectMapper.readTree(actualResponseJson);
        JsonNode expectedResponseNode = objectMapper.readTree(expectedResponseBody);
        Assertions.assertEquals(
                expectedResponseNode, actualResponseNode, "Response body structure does not match expected");
        if (actualResponseNode.has("type") || actualResponseNode.has("_type") || actualResponseNode.has("kind")) {
            String discriminator = null;
            if (actualResponseNode.has("type"))
                discriminator = actualResponseNode.get("type").asText();
            else if (actualResponseNode.has("_type"))
                discriminator = actualResponseNode.get("_type").asText();
            else if (actualResponseNode.has("kind"))
                discriminator = actualResponseNode.get("kind").asText();
            Assertions.assertNotNull(discriminator, "Union type should have a discriminator field");
            Assertions.assertFalse(discriminator.isEmpty(), "Union discriminator should not be empty");
        }

        if (!actualResponseNode.isNull()) {
            Assertions.assertTrue(
                    actualResponseNode.isObject() || actualResponseNode.isArray() || actualResponseNode.isValueNode(),
                    "response should be a valid JSON value");
        }

        if (actualResponseNode.isArray()) {
            Assertions.assertTrue(actualResponseNode.size() >= 0, "Array should have valid size");
        }
        if (actualResponseNode.isObject()) {
            Assertions.assertTrue(actualResponseNode.size() >= 0, "Object should have valid field count");
        }
    }

    @Test
    public void testUpdateTaskStatus() throws Exception {
        server.enqueue(
                new MockResponse()
                        .setResponseCode(200)
                        .setBody(
                                "{\"version\":{\"taskId\":\"taskId\",\"definitionVersion\":1,\"statusVersion\":1},\"displayName\":\"displayName\",\"specification\":{\"@type\":\"@type\"},\"createdBy\":{\"system\":{\"serviceName\":\"serviceName\",\"entityId\":\"entityId\",\"managesOwnScheduling\":true},\"user\":{\"userId\":\"userId\"},\"team\":{\"entityId\":\"entityId\",\"members\":[{}]}},\"lastUpdatedBy\":{\"system\":{\"serviceName\":\"serviceName\",\"entityId\":\"entityId\",\"managesOwnScheduling\":true},\"user\":{\"userId\":\"userId\"},\"team\":{\"entityId\":\"entityId\",\"members\":[{}]}},\"lastUpdateTime\":\"2024-01-15T09:30:00Z\",\"status\":{\"status\":\"STATUS_INVALID\",\"taskError\":{\"code\":\"ERROR_CODE_INVALID\",\"message\":\"message\"},\"progress\":{\"@type\":\"@type\"},\"result\":{\"@type\":\"@type\"},\"startTime\":\"2024-01-15T09:30:00Z\",\"estimate\":{\"@type\":\"@type\"},\"allocation\":{\"activeAgents\":[{}]}},\"scheduledTime\":\"2024-01-15T09:30:00Z\",\"relations\":{\"parentTaskId\":\"parentTaskId\"},\"description\":\"description\",\"isExecutedElsewhere\":true,\"createTime\":\"2024-01-15T09:30:00Z\",\"replication\":{\"staleTime\":\"2024-01-15T09:30:00Z\"},\"initialEntities\":[{\"snapshot\":true}],\"owner\":{\"entityId\":\"entityId\"}}"));
        Task response = client.tasks()
                .updateTaskStatus("taskId", TaskStatusUpdate.builder().build());
        RecordedRequest request = server.takeRequest();
        Assertions.assertNotNull(request);
        Assertions.assertEquals("PUT", request.getMethod());
        // Validate request body
        String actualRequestBody = request.getBody().readUtf8();
        String expectedRequestBody = "" + "{}";
        JsonNode actualJson = objectMapper.readTree(actualRequestBody);
        JsonNode expectedJson = objectMapper.readTree(expectedRequestBody);
        Assertions.assertEquals(expectedJson, actualJson, "Request body structure does not match expected");
        if (actualJson.has("type") || actualJson.has("_type") || actualJson.has("kind")) {
            String discriminator = null;
            if (actualJson.has("type")) discriminator = actualJson.get("type").asText();
            else if (actualJson.has("_type"))
                discriminator = actualJson.get("_type").asText();
            else if (actualJson.has("kind"))
                discriminator = actualJson.get("kind").asText();
            Assertions.assertNotNull(discriminator, "Union type should have a discriminator field");
            Assertions.assertFalse(discriminator.isEmpty(), "Union discriminator should not be empty");
        }

        if (!actualJson.isNull()) {
            Assertions.assertTrue(
                    actualJson.isObject() || actualJson.isArray() || actualJson.isValueNode(),
                    "request should be a valid JSON value");
        }

        if (actualJson.isArray()) {
            Assertions.assertTrue(actualJson.size() >= 0, "Array should have valid size");
        }
        if (actualJson.isObject()) {
            Assertions.assertTrue(actualJson.size() >= 0, "Object should have valid field count");
        }

        // Validate response body
        Assertions.assertNotNull(response, "Response should not be null");
        String actualResponseJson = objectMapper.writeValueAsString(response);
        String expectedResponseBody = ""
                + "{\n"
                + "  \"version\": {\n"
                + "    \"taskId\": \"taskId\",\n"
                + "    \"definitionVersion\": 1,\n"
                + "    \"statusVersion\": 1\n"
                + "  },\n"
                + "  \"displayName\": \"displayName\",\n"
                + "  \"specification\": {\n"
                + "    \"@type\": \"@type\"\n"
                + "  },\n"
                + "  \"createdBy\": {\n"
                + "    \"system\": {\n"
                + "      \"serviceName\": \"serviceName\",\n"
                + "      \"entityId\": \"entityId\",\n"
                + "      \"managesOwnScheduling\": true\n"
                + "    },\n"
                + "    \"user\": {\n"
                + "      \"userId\": \"userId\"\n"
                + "    },\n"
                + "    \"team\": {\n"
                + "      \"entityId\": \"entityId\",\n"
                + "      \"members\": [\n"
                + "        {}\n"
                + "      ]\n"
                + "    }\n"
                + "  },\n"
                + "  \"lastUpdatedBy\": {\n"
                + "    \"system\": {\n"
                + "      \"serviceName\": \"serviceName\",\n"
                + "      \"entityId\": \"entityId\",\n"
                + "      \"managesOwnScheduling\": true\n"
                + "    },\n"
                + "    \"user\": {\n"
                + "      \"userId\": \"userId\"\n"
                + "    },\n"
                + "    \"team\": {\n"
                + "      \"entityId\": \"entityId\",\n"
                + "      \"members\": [\n"
                + "        {}\n"
                + "      ]\n"
                + "    }\n"
                + "  },\n"
                + "  \"lastUpdateTime\": \"2024-01-15T09:30:00Z\",\n"
                + "  \"status\": {\n"
                + "    \"status\": \"STATUS_INVALID\",\n"
                + "    \"taskError\": {\n"
                + "      \"code\": \"ERROR_CODE_INVALID\",\n"
                + "      \"message\": \"message\"\n"
                + "    },\n"
                + "    \"progress\": {\n"
                + "      \"@type\": \"@type\"\n"
                + "    },\n"
                + "    \"result\": {\n"
                + "      \"@type\": \"@type\"\n"
                + "    },\n"
                + "    \"startTime\": \"2024-01-15T09:30:00Z\",\n"
                + "    \"estimate\": {\n"
                + "      \"@type\": \"@type\"\n"
                + "    },\n"
                + "    \"allocation\": {\n"
                + "      \"activeAgents\": [\n"
                + "        {}\n"
                + "      ]\n"
                + "    }\n"
                + "  },\n"
                + "  \"scheduledTime\": \"2024-01-15T09:30:00Z\",\n"
                + "  \"relations\": {\n"
                + "    \"parentTaskId\": \"parentTaskId\"\n"
                + "  },\n"
                + "  \"description\": \"description\",\n"
                + "  \"isExecutedElsewhere\": true,\n"
                + "  \"createTime\": \"2024-01-15T09:30:00Z\",\n"
                + "  \"replication\": {\n"
                + "    \"staleTime\": \"2024-01-15T09:30:00Z\"\n"
                + "  },\n"
                + "  \"initialEntities\": [\n"
                + "    {\n"
                + "      \"snapshot\": true\n"
                + "    }\n"
                + "  ],\n"
                + "  \"owner\": {\n"
                + "    \"entityId\": \"entityId\"\n"
                + "  }\n"
                + "}";
        JsonNode actualResponseNode = objectMapper.readTree(actualResponseJson);
        JsonNode expectedResponseNode = objectMapper.readTree(expectedResponseBody);
        Assertions.assertEquals(
                expectedResponseNode, actualResponseNode, "Response body structure does not match expected");
        if (actualResponseNode.has("type") || actualResponseNode.has("_type") || actualResponseNode.has("kind")) {
            String discriminator = null;
            if (actualResponseNode.has("type"))
                discriminator = actualResponseNode.get("type").asText();
            else if (actualResponseNode.has("_type"))
                discriminator = actualResponseNode.get("_type").asText();
            else if (actualResponseNode.has("kind"))
                discriminator = actualResponseNode.get("kind").asText();
            Assertions.assertNotNull(discriminator, "Union type should have a discriminator field");
            Assertions.assertFalse(discriminator.isEmpty(), "Union discriminator should not be empty");
        }

        if (!actualResponseNode.isNull()) {
            Assertions.assertTrue(
                    actualResponseNode.isObject() || actualResponseNode.isArray() || actualResponseNode.isValueNode(),
                    "response should be a valid JSON value");
        }

        if (actualResponseNode.isArray()) {
            Assertions.assertTrue(actualResponseNode.size() >= 0, "Array should have valid size");
        }
        if (actualResponseNode.isObject()) {
            Assertions.assertTrue(actualResponseNode.size() >= 0, "Object should have valid field count");
        }
    }

    @Test
    public void testQueryTasks() throws Exception {
        server.enqueue(
                new MockResponse()
                        .setResponseCode(200)
                        .setBody(
                                "{\"tasks\":[{\"displayName\":\"displayName\",\"lastUpdateTime\":\"2024-01-15T09:30:00Z\",\"scheduledTime\":\"2024-01-15T09:30:00Z\",\"description\":\"description\",\"isExecutedElsewhere\":true,\"createTime\":\"2024-01-15T09:30:00Z\",\"initialEntities\":[{}]}],\"nextPageToken\":\"nextPageToken\"}"));
        TaskQueryResults response =
                client.tasks().queryTasks(TaskQuery.builder().build());
        RecordedRequest request = server.takeRequest();
        Assertions.assertNotNull(request);
        Assertions.assertEquals("POST", request.getMethod());
        // Validate request body
        String actualRequestBody = request.getBody().readUtf8();
        String expectedRequestBody = "" + "{}";
        JsonNode actualJson = objectMapper.readTree(actualRequestBody);
        JsonNode expectedJson = objectMapper.readTree(expectedRequestBody);
        Assertions.assertEquals(expectedJson, actualJson, "Request body structure does not match expected");
        if (actualJson.has("type") || actualJson.has("_type") || actualJson.has("kind")) {
            String discriminator = null;
            if (actualJson.has("type")) discriminator = actualJson.get("type").asText();
            else if (actualJson.has("_type"))
                discriminator = actualJson.get("_type").asText();
            else if (actualJson.has("kind"))
                discriminator = actualJson.get("kind").asText();
            Assertions.assertNotNull(discriminator, "Union type should have a discriminator field");
            Assertions.assertFalse(discriminator.isEmpty(), "Union discriminator should not be empty");
        }

        if (!actualJson.isNull()) {
            Assertions.assertTrue(
                    actualJson.isObject() || actualJson.isArray() || actualJson.isValueNode(),
                    "request should be a valid JSON value");
        }

        if (actualJson.isArray()) {
            Assertions.assertTrue(actualJson.size() >= 0, "Array should have valid size");
        }
        if (actualJson.isObject()) {
            Assertions.assertTrue(actualJson.size() >= 0, "Object should have valid field count");
        }

        // Validate response body
        Assertions.assertNotNull(response, "Response should not be null");
        String actualResponseJson = objectMapper.writeValueAsString(response);
        String expectedResponseBody = ""
                + "{\n"
                + "  \"tasks\": [\n"
                + "    {\n"
                + "      \"displayName\": \"displayName\",\n"
                + "      \"lastUpdateTime\": \"2024-01-15T09:30:00Z\",\n"
                + "      \"scheduledTime\": \"2024-01-15T09:30:00Z\",\n"
                + "      \"description\": \"description\",\n"
                + "      \"isExecutedElsewhere\": true,\n"
                + "      \"createTime\": \"2024-01-15T09:30:00Z\",\n"
                + "      \"initialEntities\": [\n"
                + "        {}\n"
                + "      ]\n"
                + "    }\n"
                + "  ],\n"
                + "  \"nextPageToken\": \"nextPageToken\"\n"
                + "}";
        JsonNode actualResponseNode = objectMapper.readTree(actualResponseJson);
        JsonNode expectedResponseNode = objectMapper.readTree(expectedResponseBody);
        Assertions.assertEquals(
                expectedResponseNode, actualResponseNode, "Response body structure does not match expected");
        if (actualResponseNode.has("type") || actualResponseNode.has("_type") || actualResponseNode.has("kind")) {
            String discriminator = null;
            if (actualResponseNode.has("type"))
                discriminator = actualResponseNode.get("type").asText();
            else if (actualResponseNode.has("_type"))
                discriminator = actualResponseNode.get("_type").asText();
            else if (actualResponseNode.has("kind"))
                discriminator = actualResponseNode.get("kind").asText();
            Assertions.assertNotNull(discriminator, "Union type should have a discriminator field");
            Assertions.assertFalse(discriminator.isEmpty(), "Union discriminator should not be empty");
        }

        if (!actualResponseNode.isNull()) {
            Assertions.assertTrue(
                    actualResponseNode.isObject() || actualResponseNode.isArray() || actualResponseNode.isValueNode(),
                    "response should be a valid JSON value");
        }

        if (actualResponseNode.isArray()) {
            Assertions.assertTrue(actualResponseNode.size() >= 0, "Array should have valid size");
        }
        if (actualResponseNode.isObject()) {
            Assertions.assertTrue(actualResponseNode.size() >= 0, "Object should have valid field count");
        }
    }

    @Test
    public void testListenAsAgent() throws Exception {
        server.enqueue(
                new MockResponse()
                        .setResponseCode(200)
                        .setBody(
                                "{\"executeRequest\":{\"task\":{\"displayName\":\"displayName\",\"lastUpdateTime\":\"2024-01-15T09:30:00Z\",\"scheduledTime\":\"2024-01-15T09:30:00Z\",\"description\":\"description\",\"isExecutedElsewhere\":true,\"createTime\":\"2024-01-15T09:30:00Z\",\"initialEntities\":[{}]}},\"cancelRequest\":{\"taskId\":\"taskId\"},\"completeRequest\":{\"taskId\":\"taskId\"}}"));
        AgentRequest response =
                client.tasks().listenAsAgent(AgentListener.builder().build());
        RecordedRequest request = server.takeRequest();
        Assertions.assertNotNull(request);
        Assertions.assertEquals("POST", request.getMethod());
        // Validate request body
        String actualRequestBody = request.getBody().readUtf8();
        String expectedRequestBody = "" + "{}";
        JsonNode actualJson = objectMapper.readTree(actualRequestBody);
        JsonNode expectedJson = objectMapper.readTree(expectedRequestBody);
        Assertions.assertEquals(expectedJson, actualJson, "Request body structure does not match expected");
        if (actualJson.has("type") || actualJson.has("_type") || actualJson.has("kind")) {
            String discriminator = null;
            if (actualJson.has("type")) discriminator = actualJson.get("type").asText();
            else if (actualJson.has("_type"))
                discriminator = actualJson.get("_type").asText();
            else if (actualJson.has("kind"))
                discriminator = actualJson.get("kind").asText();
            Assertions.assertNotNull(discriminator, "Union type should have a discriminator field");
            Assertions.assertFalse(discriminator.isEmpty(), "Union discriminator should not be empty");
        }

        if (!actualJson.isNull()) {
            Assertions.assertTrue(
                    actualJson.isObject() || actualJson.isArray() || actualJson.isValueNode(),
                    "request should be a valid JSON value");
        }

        if (actualJson.isArray()) {
            Assertions.assertTrue(actualJson.size() >= 0, "Array should have valid size");
        }
        if (actualJson.isObject()) {
            Assertions.assertTrue(actualJson.size() >= 0, "Object should have valid field count");
        }

        // Validate response body
        Assertions.assertNotNull(response, "Response should not be null");
        String actualResponseJson = objectMapper.writeValueAsString(response);
        String expectedResponseBody = ""
                + "{\n"
                + "  \"executeRequest\": {\n"
                + "    \"task\": {\n"
                + "      \"displayName\": \"displayName\",\n"
                + "      \"lastUpdateTime\": \"2024-01-15T09:30:00Z\",\n"
                + "      \"scheduledTime\": \"2024-01-15T09:30:00Z\",\n"
                + "      \"description\": \"description\",\n"
                + "      \"isExecutedElsewhere\": true,\n"
                + "      \"createTime\": \"2024-01-15T09:30:00Z\",\n"
                + "      \"initialEntities\": [\n"
                + "        {}\n"
                + "      ]\n"
                + "    }\n"
                + "  },\n"
                + "  \"cancelRequest\": {\n"
                + "    \"taskId\": \"taskId\"\n"
                + "  },\n"
                + "  \"completeRequest\": {\n"
                + "    \"taskId\": \"taskId\"\n"
                + "  }\n"
                + "}";
        JsonNode actualResponseNode = objectMapper.readTree(actualResponseJson);
        JsonNode expectedResponseNode = objectMapper.readTree(expectedResponseBody);
        Assertions.assertEquals(
                expectedResponseNode, actualResponseNode, "Response body structure does not match expected");
        if (actualResponseNode.has("type") || actualResponseNode.has("_type") || actualResponseNode.has("kind")) {
            String discriminator = null;
            if (actualResponseNode.has("type"))
                discriminator = actualResponseNode.get("type").asText();
            else if (actualResponseNode.has("_type"))
                discriminator = actualResponseNode.get("_type").asText();
            else if (actualResponseNode.has("kind"))
                discriminator = actualResponseNode.get("kind").asText();
            Assertions.assertNotNull(discriminator, "Union type should have a discriminator field");
            Assertions.assertFalse(discriminator.isEmpty(), "Union discriminator should not be empty");
        }

        if (!actualResponseNode.isNull()) {
            Assertions.assertTrue(
                    actualResponseNode.isObject() || actualResponseNode.isArray() || actualResponseNode.isValueNode(),
                    "response should be a valid JSON value");
        }

        if (actualResponseNode.isArray()) {
            Assertions.assertTrue(actualResponseNode.size() >= 0, "Array should have valid size");
        }
        if (actualResponseNode.isObject()) {
            Assertions.assertTrue(actualResponseNode.size() >= 0, "Object should have valid field count");
        }
    }
}
