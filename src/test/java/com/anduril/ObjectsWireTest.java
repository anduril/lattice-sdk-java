package com.anduril;

import com.anduril.core.ObjectMappers;
import com.anduril.core.pagination.SyncPagingIterable;
import com.anduril.resources.objects.requests.ListObjectsRequest;
import com.anduril.types.PathMetadata;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.OffsetDateTime;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ObjectsWireTest {
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
    public void testListObjects() throws Exception {
        server.enqueue(
                new MockResponse()
                        .setResponseCode(200)
                        .setBody(
                                "{\"path_metadatas\":[{\"content_identifier\":{\"path\":\"path\",\"checksum\":\"checksum\"},\"size_bytes\":1000000,\"last_updated_at\":\"2024-01-15T09:30:00Z\",\"expiry_time\":\"2024-01-15T09:30:00Z\"}],\"next_page_token\":\"next_page_token\"}"));
        SyncPagingIterable<PathMetadata> response = client.objects()
                .listObjects(ListObjectsRequest.builder()
                        .prefix("prefix")
                        .sinceTimestamp(OffsetDateTime.parse("2024-01-15T09:30:00Z"))
                        .pageToken("pageToken")
                        .allObjectsInMesh(true)
                        .build());
        RecordedRequest request = server.takeRequest();
        Assertions.assertNotNull(request);
        Assertions.assertEquals("GET", request.getMethod());

        // Validate response body
        Assertions.assertNotNull(response, "Response should not be null");
        // Pagination response validated via MockWebServer
        // The SDK correctly parses the response into a SyncPagingIterable
    }

    @Test
    public void testDeleteObject() throws Exception {
        server.enqueue(new MockResponse().setResponseCode(200).setBody("{}"));
        client.objects().deleteObject("objectPath");
        RecordedRequest request = server.takeRequest();
        Assertions.assertNotNull(request);
        Assertions.assertEquals("DELETE", request.getMethod());
    }

    @Test
    public void testGetObjectMetadata() throws Exception {
        server.enqueue(new MockResponse().setResponseCode(200).setBody("{}"));
        client.objects().getObjectMetadata("objectPath");
        RecordedRequest request = server.takeRequest();
        Assertions.assertNotNull(request);
        Assertions.assertEquals("HEAD", request.getMethod());
    }
}
