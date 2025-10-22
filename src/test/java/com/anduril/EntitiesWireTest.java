package com.anduril;

import com.anduril.core.ObjectMappers;
import com.anduril.resources.entities.requests.EntityEventRequest;
import com.anduril.resources.entities.requests.EntityOverride;
import com.anduril.types.Entity;
import com.anduril.types.EntityEventResponse;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EntitiesWireTest {
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
    public void testPublishEntity() throws Exception {
        server.enqueue(
                new MockResponse()
                        .setResponseCode(200)
                        .setBody(
                                "{\"entityId\":\"entityId\",\"description\":\"description\",\"isLive\":true,\"createdTime\":\"2024-01-15T09:30:00Z\",\"expiryTime\":\"2024-01-15T09:30:00Z\",\"noExpiry\":true,\"status\":{\"platformActivity\":\"platformActivity\",\"role\":\"role\"},\"location\":{\"position\":{\"latitudeDegrees\":1.1,\"longitudeDegrees\":1.1,\"altitudeHaeMeters\":1.1,\"altitudeAglMeters\":1.1,\"altitudeAsfMeters\":1.1,\"pressureDepthMeters\":1.1},\"velocityEnu\":{\"e\":1.1,\"n\":1.1,\"u\":1.1},\"speedMps\":1.1,\"acceleration\":{\"e\":1.1,\"n\":1.1,\"u\":1.1},\"attitudeEnu\":{\"x\":1.1,\"y\":1.1,\"z\":1.1,\"w\":1.1}},\"locationUncertainty\":{\"positionEnuCov\":{\"mxx\":1.1,\"mxy\":1.1,\"mxz\":1.1,\"myy\":1.1,\"myz\":1.1,\"mzz\":1.1},\"velocityEnuCov\":{\"mxx\":1.1,\"mxy\":1.1,\"mxz\":1.1,\"myy\":1.1,\"myz\":1.1,\"mzz\":1.1},\"positionErrorEllipse\":{\"probability\":1.1,\"semiMajorAxisM\":1.1,\"semiMinorAxisM\":1.1,\"orientationD\":1.1}},\"geoShape\":{\"line\":{\"positions\":[{}]},\"polygon\":{\"rings\":[{}],\"isRectangle\":true},\"ellipse\":{\"semiMajorAxisM\":1.1,\"semiMinorAxisM\":1.1,\"orientationD\":1.1,\"heightM\":1.1},\"ellipsoid\":{\"forwardAxisM\":1.1,\"sideAxisM\":1.1,\"upAxisM\":1.1}},\"geoDetails\":{\"type\":\"GEO_TYPE_INVALID\",\"controlArea\":{\"type\":\"CONTROL_AREA_TYPE_INVALID\"},\"acm\":{\"acmType\":\"ACM_DETAIL_TYPE_INVALID\",\"acmDescription\":\"acmDescription\"}},\"aliases\":{\"alternateIds\":[{}],\"name\":\"name\"},\"tracked\":{\"trackQualityWrapper\":1,\"sensorHits\":1,\"numberOfObjects\":{\"lowerBound\":1,\"upperBound\":1},\"radarCrossSection\":1.1,\"lastMeasurementTime\":\"2024-01-15T09:30:00Z\"},\"correlation\":{\"primary\":{\"secondaryEntityIds\":[\"secondaryEntityIds\"]},\"secondary\":{\"primaryEntityId\":\"primaryEntityId\"},\"membership\":{\"correlationSetId\":\"correlationSetId\"},\"decorrelation\":{\"decorrelatedEntities\":[{}]}},\"milView\":{\"disposition\":\"DISPOSITION_UNKNOWN\",\"environment\":\"ENVIRONMENT_UNKNOWN\",\"nationality\":\"NATIONALITY_INVALID\"},\"ontology\":{\"platformType\":\"platformType\",\"specificType\":\"specificType\",\"template\":\"TEMPLATE_INVALID\"},\"sensors\":{\"sensors\":[{}]},\"payloads\":{\"payloadConfigurations\":[{}]},\"powerState\":{\"sourceIdToState\":{\"key\":{}}},\"provenance\":{\"integrationName\":\"integrationName\",\"dataType\":\"dataType\",\"sourceId\":\"sourceId\",\"sourceUpdateTime\":\"2024-01-15T09:30:00Z\",\"sourceDescription\":\"sourceDescription\"},\"overrides\":{\"override\":[{}]},\"indicators\":{\"simulated\":true,\"exercise\":true,\"emergency\":true,\"c2\":true,\"egressable\":true,\"starred\":true},\"targetPriority\":{\"highValueTarget\":{\"isHighValueTarget\":true,\"targetPriority\":1,\"targetMatches\":[{}],\"isHighPayoffTarget\":true},\"threat\":{\"isThreat\":true}},\"signal\":{\"bandwidthHz\":1.1,\"signalToNoiseRatio\":1.1,\"emitterNotations\":[{}],\"pulseWidthS\":1.1,\"scanCharacteristics\":{\"scanType\":\"SCAN_TYPE_INVALID\",\"scanPeriodS\":1.1}},\"transponderCodes\":{\"mode1\":1,\"mode2\":1,\"mode3\":1,\"mode4InterrogationResponse\":\"INTERROGATION_RESPONSE_INVALID\",\"mode5\":{\"mode5InterrogationResponse\":\"INTERROGATION_RESPONSE_INVALID\",\"mode5\":1,\"mode5PlatformId\":1},\"modeS\":{\"id\":\"id\",\"address\":1}},\"dataClassification\":{\"default\":{\"level\":\"CLASSIFICATION_LEVELS_INVALID\",\"caveats\":[\"caveats\"]},\"fields\":[{}]},\"taskCatalog\":{\"taskDefinitions\":[{}]},\"media\":{\"media\":[{}]},\"relationships\":{\"relationships\":[{}]},\"visualDetails\":{\"rangeRings\":{\"minDistanceM\":1.1,\"maxDistanceM\":1.1,\"ringCount\":1}},\"dimensions\":{\"lengthM\":1.1},\"routeDetails\":{\"destinationName\":\"destinationName\",\"estimatedArrivalTime\":\"2024-01-15T09:30:00Z\"},\"schedules\":{\"schedules\":[{}]},\"health\":{\"connectionStatus\":\"CONNECTION_STATUS_INVALID\",\"healthStatus\":\"HEALTH_STATUS_INVALID\",\"components\":[{}],\"updateTime\":\"2024-01-15T09:30:00Z\",\"activeAlerts\":[{}]},\"groupDetails\":{\"echelon\":{\"armyEchelon\":\"ARMY_ECHELON_INVALID\"}},\"supplies\":{\"fuel\":[{}]},\"symbology\":{\"milStd2525C\":{\"sidc\":\"sidc\"}}}"));
        Entity response = client.entities().publishEntity(Entity.builder().build());
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
                + "  \"entityId\": \"entityId\",\n"
                + "  \"description\": \"description\",\n"
                + "  \"isLive\": true,\n"
                + "  \"createdTime\": \"2024-01-15T09:30:00Z\",\n"
                + "  \"expiryTime\": \"2024-01-15T09:30:00Z\",\n"
                + "  \"noExpiry\": true,\n"
                + "  \"status\": {\n"
                + "    \"platformActivity\": \"platformActivity\",\n"
                + "    \"role\": \"role\"\n"
                + "  },\n"
                + "  \"location\": {\n"
                + "    \"position\": {\n"
                + "      \"latitudeDegrees\": 1.1,\n"
                + "      \"longitudeDegrees\": 1.1,\n"
                + "      \"altitudeHaeMeters\": 1.1,\n"
                + "      \"altitudeAglMeters\": 1.1,\n"
                + "      \"altitudeAsfMeters\": 1.1,\n"
                + "      \"pressureDepthMeters\": 1.1\n"
                + "    },\n"
                + "    \"velocityEnu\": {\n"
                + "      \"e\": 1.1,\n"
                + "      \"n\": 1.1,\n"
                + "      \"u\": 1.1\n"
                + "    },\n"
                + "    \"speedMps\": 1.1,\n"
                + "    \"acceleration\": {\n"
                + "      \"e\": 1.1,\n"
                + "      \"n\": 1.1,\n"
                + "      \"u\": 1.1\n"
                + "    },\n"
                + "    \"attitudeEnu\": {\n"
                + "      \"x\": 1.1,\n"
                + "      \"y\": 1.1,\n"
                + "      \"z\": 1.1,\n"
                + "      \"w\": 1.1\n"
                + "    }\n"
                + "  },\n"
                + "  \"locationUncertainty\": {\n"
                + "    \"positionEnuCov\": {\n"
                + "      \"mxx\": 1.1,\n"
                + "      \"mxy\": 1.1,\n"
                + "      \"mxz\": 1.1,\n"
                + "      \"myy\": 1.1,\n"
                + "      \"myz\": 1.1,\n"
                + "      \"mzz\": 1.1\n"
                + "    },\n"
                + "    \"velocityEnuCov\": {\n"
                + "      \"mxx\": 1.1,\n"
                + "      \"mxy\": 1.1,\n"
                + "      \"mxz\": 1.1,\n"
                + "      \"myy\": 1.1,\n"
                + "      \"myz\": 1.1,\n"
                + "      \"mzz\": 1.1\n"
                + "    },\n"
                + "    \"positionErrorEllipse\": {\n"
                + "      \"probability\": 1.1,\n"
                + "      \"semiMajorAxisM\": 1.1,\n"
                + "      \"semiMinorAxisM\": 1.1,\n"
                + "      \"orientationD\": 1.1\n"
                + "    }\n"
                + "  },\n"
                + "  \"geoShape\": {\n"
                + "    \"line\": {\n"
                + "      \"positions\": [\n"
                + "        {}\n"
                + "      ]\n"
                + "    },\n"
                + "    \"polygon\": {\n"
                + "      \"rings\": [\n"
                + "        {}\n"
                + "      ],\n"
                + "      \"isRectangle\": true\n"
                + "    },\n"
                + "    \"ellipse\": {\n"
                + "      \"semiMajorAxisM\": 1.1,\n"
                + "      \"semiMinorAxisM\": 1.1,\n"
                + "      \"orientationD\": 1.1,\n"
                + "      \"heightM\": 1.1\n"
                + "    },\n"
                + "    \"ellipsoid\": {\n"
                + "      \"forwardAxisM\": 1.1,\n"
                + "      \"sideAxisM\": 1.1,\n"
                + "      \"upAxisM\": 1.1\n"
                + "    }\n"
                + "  },\n"
                + "  \"geoDetails\": {\n"
                + "    \"type\": \"GEO_TYPE_INVALID\",\n"
                + "    \"controlArea\": {\n"
                + "      \"type\": \"CONTROL_AREA_TYPE_INVALID\"\n"
                + "    },\n"
                + "    \"acm\": {\n"
                + "      \"acmType\": \"ACM_DETAIL_TYPE_INVALID\",\n"
                + "      \"acmDescription\": \"acmDescription\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"aliases\": {\n"
                + "    \"alternateIds\": [\n"
                + "      {}\n"
                + "    ],\n"
                + "    \"name\": \"name\"\n"
                + "  },\n"
                + "  \"tracked\": {\n"
                + "    \"trackQualityWrapper\": 1,\n"
                + "    \"sensorHits\": 1,\n"
                + "    \"numberOfObjects\": {\n"
                + "      \"lowerBound\": 1,\n"
                + "      \"upperBound\": 1\n"
                + "    },\n"
                + "    \"radarCrossSection\": 1.1,\n"
                + "    \"lastMeasurementTime\": \"2024-01-15T09:30:00Z\"\n"
                + "  },\n"
                + "  \"correlation\": {\n"
                + "    \"primary\": {\n"
                + "      \"secondaryEntityIds\": [\n"
                + "        \"secondaryEntityIds\"\n"
                + "      ]\n"
                + "    },\n"
                + "    \"secondary\": {\n"
                + "      \"primaryEntityId\": \"primaryEntityId\"\n"
                + "    },\n"
                + "    \"membership\": {\n"
                + "      \"correlationSetId\": \"correlationSetId\"\n"
                + "    },\n"
                + "    \"decorrelation\": {\n"
                + "      \"decorrelatedEntities\": [\n"
                + "        {}\n"
                + "      ]\n"
                + "    }\n"
                + "  },\n"
                + "  \"milView\": {\n"
                + "    \"disposition\": \"DISPOSITION_UNKNOWN\",\n"
                + "    \"environment\": \"ENVIRONMENT_UNKNOWN\",\n"
                + "    \"nationality\": \"NATIONALITY_INVALID\"\n"
                + "  },\n"
                + "  \"ontology\": {\n"
                + "    \"platformType\": \"platformType\",\n"
                + "    \"specificType\": \"specificType\",\n"
                + "    \"template\": \"TEMPLATE_INVALID\"\n"
                + "  },\n"
                + "  \"sensors\": {\n"
                + "    \"sensors\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"payloads\": {\n"
                + "    \"payloadConfigurations\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"powerState\": {\n"
                + "    \"sourceIdToState\": {\n"
                + "      \"key\": {}\n"
                + "    }\n"
                + "  },\n"
                + "  \"provenance\": {\n"
                + "    \"integrationName\": \"integrationName\",\n"
                + "    \"dataType\": \"dataType\",\n"
                + "    \"sourceId\": \"sourceId\",\n"
                + "    \"sourceUpdateTime\": \"2024-01-15T09:30:00Z\",\n"
                + "    \"sourceDescription\": \"sourceDescription\"\n"
                + "  },\n"
                + "  \"overrides\": {\n"
                + "    \"override\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"indicators\": {\n"
                + "    \"simulated\": true,\n"
                + "    \"exercise\": true,\n"
                + "    \"emergency\": true,\n"
                + "    \"c2\": true,\n"
                + "    \"egressable\": true,\n"
                + "    \"starred\": true\n"
                + "  },\n"
                + "  \"targetPriority\": {\n"
                + "    \"highValueTarget\": {\n"
                + "      \"isHighValueTarget\": true,\n"
                + "      \"targetPriority\": 1,\n"
                + "      \"targetMatches\": [\n"
                + "        {}\n"
                + "      ],\n"
                + "      \"isHighPayoffTarget\": true\n"
                + "    },\n"
                + "    \"threat\": {\n"
                + "      \"isThreat\": true\n"
                + "    }\n"
                + "  },\n"
                + "  \"signal\": {\n"
                + "    \"bandwidthHz\": 1.1,\n"
                + "    \"signalToNoiseRatio\": 1.1,\n"
                + "    \"emitterNotations\": [\n"
                + "      {}\n"
                + "    ],\n"
                + "    \"pulseWidthS\": 1.1,\n"
                + "    \"scanCharacteristics\": {\n"
                + "      \"scanType\": \"SCAN_TYPE_INVALID\",\n"
                + "      \"scanPeriodS\": 1.1\n"
                + "    }\n"
                + "  },\n"
                + "  \"transponderCodes\": {\n"
                + "    \"mode1\": 1,\n"
                + "    \"mode2\": 1,\n"
                + "    \"mode3\": 1,\n"
                + "    \"mode4InterrogationResponse\": \"INTERROGATION_RESPONSE_INVALID\",\n"
                + "    \"mode5\": {\n"
                + "      \"mode5InterrogationResponse\": \"INTERROGATION_RESPONSE_INVALID\",\n"
                + "      \"mode5\": 1,\n"
                + "      \"mode5PlatformId\": 1\n"
                + "    },\n"
                + "    \"modeS\": {\n"
                + "      \"id\": \"id\",\n"
                + "      \"address\": 1\n"
                + "    }\n"
                + "  },\n"
                + "  \"dataClassification\": {\n"
                + "    \"default\": {\n"
                + "      \"level\": \"CLASSIFICATION_LEVELS_INVALID\",\n"
                + "      \"caveats\": [\n"
                + "        \"caveats\"\n"
                + "      ]\n"
                + "    },\n"
                + "    \"fields\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"taskCatalog\": {\n"
                + "    \"taskDefinitions\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"media\": {\n"
                + "    \"media\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"relationships\": {\n"
                + "    \"relationships\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"visualDetails\": {\n"
                + "    \"rangeRings\": {\n"
                + "      \"minDistanceM\": 1.1,\n"
                + "      \"maxDistanceM\": 1.1,\n"
                + "      \"ringCount\": 1\n"
                + "    }\n"
                + "  },\n"
                + "  \"dimensions\": {\n"
                + "    \"lengthM\": 1.1\n"
                + "  },\n"
                + "  \"routeDetails\": {\n"
                + "    \"destinationName\": \"destinationName\",\n"
                + "    \"estimatedArrivalTime\": \"2024-01-15T09:30:00Z\"\n"
                + "  },\n"
                + "  \"schedules\": {\n"
                + "    \"schedules\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"health\": {\n"
                + "    \"connectionStatus\": \"CONNECTION_STATUS_INVALID\",\n"
                + "    \"healthStatus\": \"HEALTH_STATUS_INVALID\",\n"
                + "    \"components\": [\n"
                + "      {}\n"
                + "    ],\n"
                + "    \"updateTime\": \"2024-01-15T09:30:00Z\",\n"
                + "    \"activeAlerts\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"groupDetails\": {\n"
                + "    \"echelon\": {\n"
                + "      \"armyEchelon\": \"ARMY_ECHELON_INVALID\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"supplies\": {\n"
                + "    \"fuel\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"symbology\": {\n"
                + "    \"milStd2525C\": {\n"
                + "      \"sidc\": \"sidc\"\n"
                + "    }\n"
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
    public void testGetEntity() throws Exception {
        server.enqueue(
                new MockResponse()
                        .setResponseCode(200)
                        .setBody(
                                "{\"entityId\":\"entityId\",\"description\":\"description\",\"isLive\":true,\"createdTime\":\"2024-01-15T09:30:00Z\",\"expiryTime\":\"2024-01-15T09:30:00Z\",\"noExpiry\":true,\"status\":{\"platformActivity\":\"platformActivity\",\"role\":\"role\"},\"location\":{\"position\":{\"latitudeDegrees\":1.1,\"longitudeDegrees\":1.1,\"altitudeHaeMeters\":1.1,\"altitudeAglMeters\":1.1,\"altitudeAsfMeters\":1.1,\"pressureDepthMeters\":1.1},\"velocityEnu\":{\"e\":1.1,\"n\":1.1,\"u\":1.1},\"speedMps\":1.1,\"acceleration\":{\"e\":1.1,\"n\":1.1,\"u\":1.1},\"attitudeEnu\":{\"x\":1.1,\"y\":1.1,\"z\":1.1,\"w\":1.1}},\"locationUncertainty\":{\"positionEnuCov\":{\"mxx\":1.1,\"mxy\":1.1,\"mxz\":1.1,\"myy\":1.1,\"myz\":1.1,\"mzz\":1.1},\"velocityEnuCov\":{\"mxx\":1.1,\"mxy\":1.1,\"mxz\":1.1,\"myy\":1.1,\"myz\":1.1,\"mzz\":1.1},\"positionErrorEllipse\":{\"probability\":1.1,\"semiMajorAxisM\":1.1,\"semiMinorAxisM\":1.1,\"orientationD\":1.1}},\"geoShape\":{\"line\":{\"positions\":[{}]},\"polygon\":{\"rings\":[{}],\"isRectangle\":true},\"ellipse\":{\"semiMajorAxisM\":1.1,\"semiMinorAxisM\":1.1,\"orientationD\":1.1,\"heightM\":1.1},\"ellipsoid\":{\"forwardAxisM\":1.1,\"sideAxisM\":1.1,\"upAxisM\":1.1}},\"geoDetails\":{\"type\":\"GEO_TYPE_INVALID\",\"controlArea\":{\"type\":\"CONTROL_AREA_TYPE_INVALID\"},\"acm\":{\"acmType\":\"ACM_DETAIL_TYPE_INVALID\",\"acmDescription\":\"acmDescription\"}},\"aliases\":{\"alternateIds\":[{}],\"name\":\"name\"},\"tracked\":{\"trackQualityWrapper\":1,\"sensorHits\":1,\"numberOfObjects\":{\"lowerBound\":1,\"upperBound\":1},\"radarCrossSection\":1.1,\"lastMeasurementTime\":\"2024-01-15T09:30:00Z\"},\"correlation\":{\"primary\":{\"secondaryEntityIds\":[\"secondaryEntityIds\"]},\"secondary\":{\"primaryEntityId\":\"primaryEntityId\"},\"membership\":{\"correlationSetId\":\"correlationSetId\"},\"decorrelation\":{\"decorrelatedEntities\":[{}]}},\"milView\":{\"disposition\":\"DISPOSITION_UNKNOWN\",\"environment\":\"ENVIRONMENT_UNKNOWN\",\"nationality\":\"NATIONALITY_INVALID\"},\"ontology\":{\"platformType\":\"platformType\",\"specificType\":\"specificType\",\"template\":\"TEMPLATE_INVALID\"},\"sensors\":{\"sensors\":[{}]},\"payloads\":{\"payloadConfigurations\":[{}]},\"powerState\":{\"sourceIdToState\":{\"key\":{}}},\"provenance\":{\"integrationName\":\"integrationName\",\"dataType\":\"dataType\",\"sourceId\":\"sourceId\",\"sourceUpdateTime\":\"2024-01-15T09:30:00Z\",\"sourceDescription\":\"sourceDescription\"},\"overrides\":{\"override\":[{}]},\"indicators\":{\"simulated\":true,\"exercise\":true,\"emergency\":true,\"c2\":true,\"egressable\":true,\"starred\":true},\"targetPriority\":{\"highValueTarget\":{\"isHighValueTarget\":true,\"targetPriority\":1,\"targetMatches\":[{}],\"isHighPayoffTarget\":true},\"threat\":{\"isThreat\":true}},\"signal\":{\"bandwidthHz\":1.1,\"signalToNoiseRatio\":1.1,\"emitterNotations\":[{}],\"pulseWidthS\":1.1,\"scanCharacteristics\":{\"scanType\":\"SCAN_TYPE_INVALID\",\"scanPeriodS\":1.1}},\"transponderCodes\":{\"mode1\":1,\"mode2\":1,\"mode3\":1,\"mode4InterrogationResponse\":\"INTERROGATION_RESPONSE_INVALID\",\"mode5\":{\"mode5InterrogationResponse\":\"INTERROGATION_RESPONSE_INVALID\",\"mode5\":1,\"mode5PlatformId\":1},\"modeS\":{\"id\":\"id\",\"address\":1}},\"dataClassification\":{\"default\":{\"level\":\"CLASSIFICATION_LEVELS_INVALID\",\"caveats\":[\"caveats\"]},\"fields\":[{}]},\"taskCatalog\":{\"taskDefinitions\":[{}]},\"media\":{\"media\":[{}]},\"relationships\":{\"relationships\":[{}]},\"visualDetails\":{\"rangeRings\":{\"minDistanceM\":1.1,\"maxDistanceM\":1.1,\"ringCount\":1}},\"dimensions\":{\"lengthM\":1.1},\"routeDetails\":{\"destinationName\":\"destinationName\",\"estimatedArrivalTime\":\"2024-01-15T09:30:00Z\"},\"schedules\":{\"schedules\":[{}]},\"health\":{\"connectionStatus\":\"CONNECTION_STATUS_INVALID\",\"healthStatus\":\"HEALTH_STATUS_INVALID\",\"components\":[{}],\"updateTime\":\"2024-01-15T09:30:00Z\",\"activeAlerts\":[{}]},\"groupDetails\":{\"echelon\":{\"armyEchelon\":\"ARMY_ECHELON_INVALID\"}},\"supplies\":{\"fuel\":[{}]},\"symbology\":{\"milStd2525C\":{\"sidc\":\"sidc\"}}}"));
        Entity response = client.entities().getEntity("entityId");
        RecordedRequest request = server.takeRequest();
        Assertions.assertNotNull(request);
        Assertions.assertEquals("GET", request.getMethod());

        // Validate response body
        Assertions.assertNotNull(response, "Response should not be null");
        String actualResponseJson = objectMapper.writeValueAsString(response);
        String expectedResponseBody = ""
                + "{\n"
                + "  \"entityId\": \"entityId\",\n"
                + "  \"description\": \"description\",\n"
                + "  \"isLive\": true,\n"
                + "  \"createdTime\": \"2024-01-15T09:30:00Z\",\n"
                + "  \"expiryTime\": \"2024-01-15T09:30:00Z\",\n"
                + "  \"noExpiry\": true,\n"
                + "  \"status\": {\n"
                + "    \"platformActivity\": \"platformActivity\",\n"
                + "    \"role\": \"role\"\n"
                + "  },\n"
                + "  \"location\": {\n"
                + "    \"position\": {\n"
                + "      \"latitudeDegrees\": 1.1,\n"
                + "      \"longitudeDegrees\": 1.1,\n"
                + "      \"altitudeHaeMeters\": 1.1,\n"
                + "      \"altitudeAglMeters\": 1.1,\n"
                + "      \"altitudeAsfMeters\": 1.1,\n"
                + "      \"pressureDepthMeters\": 1.1\n"
                + "    },\n"
                + "    \"velocityEnu\": {\n"
                + "      \"e\": 1.1,\n"
                + "      \"n\": 1.1,\n"
                + "      \"u\": 1.1\n"
                + "    },\n"
                + "    \"speedMps\": 1.1,\n"
                + "    \"acceleration\": {\n"
                + "      \"e\": 1.1,\n"
                + "      \"n\": 1.1,\n"
                + "      \"u\": 1.1\n"
                + "    },\n"
                + "    \"attitudeEnu\": {\n"
                + "      \"x\": 1.1,\n"
                + "      \"y\": 1.1,\n"
                + "      \"z\": 1.1,\n"
                + "      \"w\": 1.1\n"
                + "    }\n"
                + "  },\n"
                + "  \"locationUncertainty\": {\n"
                + "    \"positionEnuCov\": {\n"
                + "      \"mxx\": 1.1,\n"
                + "      \"mxy\": 1.1,\n"
                + "      \"mxz\": 1.1,\n"
                + "      \"myy\": 1.1,\n"
                + "      \"myz\": 1.1,\n"
                + "      \"mzz\": 1.1\n"
                + "    },\n"
                + "    \"velocityEnuCov\": {\n"
                + "      \"mxx\": 1.1,\n"
                + "      \"mxy\": 1.1,\n"
                + "      \"mxz\": 1.1,\n"
                + "      \"myy\": 1.1,\n"
                + "      \"myz\": 1.1,\n"
                + "      \"mzz\": 1.1\n"
                + "    },\n"
                + "    \"positionErrorEllipse\": {\n"
                + "      \"probability\": 1.1,\n"
                + "      \"semiMajorAxisM\": 1.1,\n"
                + "      \"semiMinorAxisM\": 1.1,\n"
                + "      \"orientationD\": 1.1\n"
                + "    }\n"
                + "  },\n"
                + "  \"geoShape\": {\n"
                + "    \"line\": {\n"
                + "      \"positions\": [\n"
                + "        {}\n"
                + "      ]\n"
                + "    },\n"
                + "    \"polygon\": {\n"
                + "      \"rings\": [\n"
                + "        {}\n"
                + "      ],\n"
                + "      \"isRectangle\": true\n"
                + "    },\n"
                + "    \"ellipse\": {\n"
                + "      \"semiMajorAxisM\": 1.1,\n"
                + "      \"semiMinorAxisM\": 1.1,\n"
                + "      \"orientationD\": 1.1,\n"
                + "      \"heightM\": 1.1\n"
                + "    },\n"
                + "    \"ellipsoid\": {\n"
                + "      \"forwardAxisM\": 1.1,\n"
                + "      \"sideAxisM\": 1.1,\n"
                + "      \"upAxisM\": 1.1\n"
                + "    }\n"
                + "  },\n"
                + "  \"geoDetails\": {\n"
                + "    \"type\": \"GEO_TYPE_INVALID\",\n"
                + "    \"controlArea\": {\n"
                + "      \"type\": \"CONTROL_AREA_TYPE_INVALID\"\n"
                + "    },\n"
                + "    \"acm\": {\n"
                + "      \"acmType\": \"ACM_DETAIL_TYPE_INVALID\",\n"
                + "      \"acmDescription\": \"acmDescription\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"aliases\": {\n"
                + "    \"alternateIds\": [\n"
                + "      {}\n"
                + "    ],\n"
                + "    \"name\": \"name\"\n"
                + "  },\n"
                + "  \"tracked\": {\n"
                + "    \"trackQualityWrapper\": 1,\n"
                + "    \"sensorHits\": 1,\n"
                + "    \"numberOfObjects\": {\n"
                + "      \"lowerBound\": 1,\n"
                + "      \"upperBound\": 1\n"
                + "    },\n"
                + "    \"radarCrossSection\": 1.1,\n"
                + "    \"lastMeasurementTime\": \"2024-01-15T09:30:00Z\"\n"
                + "  },\n"
                + "  \"correlation\": {\n"
                + "    \"primary\": {\n"
                + "      \"secondaryEntityIds\": [\n"
                + "        \"secondaryEntityIds\"\n"
                + "      ]\n"
                + "    },\n"
                + "    \"secondary\": {\n"
                + "      \"primaryEntityId\": \"primaryEntityId\"\n"
                + "    },\n"
                + "    \"membership\": {\n"
                + "      \"correlationSetId\": \"correlationSetId\"\n"
                + "    },\n"
                + "    \"decorrelation\": {\n"
                + "      \"decorrelatedEntities\": [\n"
                + "        {}\n"
                + "      ]\n"
                + "    }\n"
                + "  },\n"
                + "  \"milView\": {\n"
                + "    \"disposition\": \"DISPOSITION_UNKNOWN\",\n"
                + "    \"environment\": \"ENVIRONMENT_UNKNOWN\",\n"
                + "    \"nationality\": \"NATIONALITY_INVALID\"\n"
                + "  },\n"
                + "  \"ontology\": {\n"
                + "    \"platformType\": \"platformType\",\n"
                + "    \"specificType\": \"specificType\",\n"
                + "    \"template\": \"TEMPLATE_INVALID\"\n"
                + "  },\n"
                + "  \"sensors\": {\n"
                + "    \"sensors\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"payloads\": {\n"
                + "    \"payloadConfigurations\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"powerState\": {\n"
                + "    \"sourceIdToState\": {\n"
                + "      \"key\": {}\n"
                + "    }\n"
                + "  },\n"
                + "  \"provenance\": {\n"
                + "    \"integrationName\": \"integrationName\",\n"
                + "    \"dataType\": \"dataType\",\n"
                + "    \"sourceId\": \"sourceId\",\n"
                + "    \"sourceUpdateTime\": \"2024-01-15T09:30:00Z\",\n"
                + "    \"sourceDescription\": \"sourceDescription\"\n"
                + "  },\n"
                + "  \"overrides\": {\n"
                + "    \"override\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"indicators\": {\n"
                + "    \"simulated\": true,\n"
                + "    \"exercise\": true,\n"
                + "    \"emergency\": true,\n"
                + "    \"c2\": true,\n"
                + "    \"egressable\": true,\n"
                + "    \"starred\": true\n"
                + "  },\n"
                + "  \"targetPriority\": {\n"
                + "    \"highValueTarget\": {\n"
                + "      \"isHighValueTarget\": true,\n"
                + "      \"targetPriority\": 1,\n"
                + "      \"targetMatches\": [\n"
                + "        {}\n"
                + "      ],\n"
                + "      \"isHighPayoffTarget\": true\n"
                + "    },\n"
                + "    \"threat\": {\n"
                + "      \"isThreat\": true\n"
                + "    }\n"
                + "  },\n"
                + "  \"signal\": {\n"
                + "    \"bandwidthHz\": 1.1,\n"
                + "    \"signalToNoiseRatio\": 1.1,\n"
                + "    \"emitterNotations\": [\n"
                + "      {}\n"
                + "    ],\n"
                + "    \"pulseWidthS\": 1.1,\n"
                + "    \"scanCharacteristics\": {\n"
                + "      \"scanType\": \"SCAN_TYPE_INVALID\",\n"
                + "      \"scanPeriodS\": 1.1\n"
                + "    }\n"
                + "  },\n"
                + "  \"transponderCodes\": {\n"
                + "    \"mode1\": 1,\n"
                + "    \"mode2\": 1,\n"
                + "    \"mode3\": 1,\n"
                + "    \"mode4InterrogationResponse\": \"INTERROGATION_RESPONSE_INVALID\",\n"
                + "    \"mode5\": {\n"
                + "      \"mode5InterrogationResponse\": \"INTERROGATION_RESPONSE_INVALID\",\n"
                + "      \"mode5\": 1,\n"
                + "      \"mode5PlatformId\": 1\n"
                + "    },\n"
                + "    \"modeS\": {\n"
                + "      \"id\": \"id\",\n"
                + "      \"address\": 1\n"
                + "    }\n"
                + "  },\n"
                + "  \"dataClassification\": {\n"
                + "    \"default\": {\n"
                + "      \"level\": \"CLASSIFICATION_LEVELS_INVALID\",\n"
                + "      \"caveats\": [\n"
                + "        \"caveats\"\n"
                + "      ]\n"
                + "    },\n"
                + "    \"fields\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"taskCatalog\": {\n"
                + "    \"taskDefinitions\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"media\": {\n"
                + "    \"media\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"relationships\": {\n"
                + "    \"relationships\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"visualDetails\": {\n"
                + "    \"rangeRings\": {\n"
                + "      \"minDistanceM\": 1.1,\n"
                + "      \"maxDistanceM\": 1.1,\n"
                + "      \"ringCount\": 1\n"
                + "    }\n"
                + "  },\n"
                + "  \"dimensions\": {\n"
                + "    \"lengthM\": 1.1\n"
                + "  },\n"
                + "  \"routeDetails\": {\n"
                + "    \"destinationName\": \"destinationName\",\n"
                + "    \"estimatedArrivalTime\": \"2024-01-15T09:30:00Z\"\n"
                + "  },\n"
                + "  \"schedules\": {\n"
                + "    \"schedules\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"health\": {\n"
                + "    \"connectionStatus\": \"CONNECTION_STATUS_INVALID\",\n"
                + "    \"healthStatus\": \"HEALTH_STATUS_INVALID\",\n"
                + "    \"components\": [\n"
                + "      {}\n"
                + "    ],\n"
                + "    \"updateTime\": \"2024-01-15T09:30:00Z\",\n"
                + "    \"activeAlerts\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"groupDetails\": {\n"
                + "    \"echelon\": {\n"
                + "      \"armyEchelon\": \"ARMY_ECHELON_INVALID\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"supplies\": {\n"
                + "    \"fuel\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"symbology\": {\n"
                + "    \"milStd2525C\": {\n"
                + "      \"sidc\": \"sidc\"\n"
                + "    }\n"
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
    public void testOverrideEntity() throws Exception {
        server.enqueue(
                new MockResponse()
                        .setResponseCode(200)
                        .setBody(
                                "{\"entityId\":\"entityId\",\"description\":\"description\",\"isLive\":true,\"createdTime\":\"2024-01-15T09:30:00Z\",\"expiryTime\":\"2024-01-15T09:30:00Z\",\"noExpiry\":true,\"status\":{\"platformActivity\":\"platformActivity\",\"role\":\"role\"},\"location\":{\"position\":{\"latitudeDegrees\":1.1,\"longitudeDegrees\":1.1,\"altitudeHaeMeters\":1.1,\"altitudeAglMeters\":1.1,\"altitudeAsfMeters\":1.1,\"pressureDepthMeters\":1.1},\"velocityEnu\":{\"e\":1.1,\"n\":1.1,\"u\":1.1},\"speedMps\":1.1,\"acceleration\":{\"e\":1.1,\"n\":1.1,\"u\":1.1},\"attitudeEnu\":{\"x\":1.1,\"y\":1.1,\"z\":1.1,\"w\":1.1}},\"locationUncertainty\":{\"positionEnuCov\":{\"mxx\":1.1,\"mxy\":1.1,\"mxz\":1.1,\"myy\":1.1,\"myz\":1.1,\"mzz\":1.1},\"velocityEnuCov\":{\"mxx\":1.1,\"mxy\":1.1,\"mxz\":1.1,\"myy\":1.1,\"myz\":1.1,\"mzz\":1.1},\"positionErrorEllipse\":{\"probability\":1.1,\"semiMajorAxisM\":1.1,\"semiMinorAxisM\":1.1,\"orientationD\":1.1}},\"geoShape\":{\"line\":{\"positions\":[{}]},\"polygon\":{\"rings\":[{}],\"isRectangle\":true},\"ellipse\":{\"semiMajorAxisM\":1.1,\"semiMinorAxisM\":1.1,\"orientationD\":1.1,\"heightM\":1.1},\"ellipsoid\":{\"forwardAxisM\":1.1,\"sideAxisM\":1.1,\"upAxisM\":1.1}},\"geoDetails\":{\"type\":\"GEO_TYPE_INVALID\",\"controlArea\":{\"type\":\"CONTROL_AREA_TYPE_INVALID\"},\"acm\":{\"acmType\":\"ACM_DETAIL_TYPE_INVALID\",\"acmDescription\":\"acmDescription\"}},\"aliases\":{\"alternateIds\":[{}],\"name\":\"name\"},\"tracked\":{\"trackQualityWrapper\":1,\"sensorHits\":1,\"numberOfObjects\":{\"lowerBound\":1,\"upperBound\":1},\"radarCrossSection\":1.1,\"lastMeasurementTime\":\"2024-01-15T09:30:00Z\"},\"correlation\":{\"primary\":{\"secondaryEntityIds\":[\"secondaryEntityIds\"]},\"secondary\":{\"primaryEntityId\":\"primaryEntityId\"},\"membership\":{\"correlationSetId\":\"correlationSetId\"},\"decorrelation\":{\"decorrelatedEntities\":[{}]}},\"milView\":{\"disposition\":\"DISPOSITION_UNKNOWN\",\"environment\":\"ENVIRONMENT_UNKNOWN\",\"nationality\":\"NATIONALITY_INVALID\"},\"ontology\":{\"platformType\":\"platformType\",\"specificType\":\"specificType\",\"template\":\"TEMPLATE_INVALID\"},\"sensors\":{\"sensors\":[{}]},\"payloads\":{\"payloadConfigurations\":[{}]},\"powerState\":{\"sourceIdToState\":{\"key\":{}}},\"provenance\":{\"integrationName\":\"integrationName\",\"dataType\":\"dataType\",\"sourceId\":\"sourceId\",\"sourceUpdateTime\":\"2024-01-15T09:30:00Z\",\"sourceDescription\":\"sourceDescription\"},\"overrides\":{\"override\":[{}]},\"indicators\":{\"simulated\":true,\"exercise\":true,\"emergency\":true,\"c2\":true,\"egressable\":true,\"starred\":true},\"targetPriority\":{\"highValueTarget\":{\"isHighValueTarget\":true,\"targetPriority\":1,\"targetMatches\":[{}],\"isHighPayoffTarget\":true},\"threat\":{\"isThreat\":true}},\"signal\":{\"bandwidthHz\":1.1,\"signalToNoiseRatio\":1.1,\"emitterNotations\":[{}],\"pulseWidthS\":1.1,\"scanCharacteristics\":{\"scanType\":\"SCAN_TYPE_INVALID\",\"scanPeriodS\":1.1}},\"transponderCodes\":{\"mode1\":1,\"mode2\":1,\"mode3\":1,\"mode4InterrogationResponse\":\"INTERROGATION_RESPONSE_INVALID\",\"mode5\":{\"mode5InterrogationResponse\":\"INTERROGATION_RESPONSE_INVALID\",\"mode5\":1,\"mode5PlatformId\":1},\"modeS\":{\"id\":\"id\",\"address\":1}},\"dataClassification\":{\"default\":{\"level\":\"CLASSIFICATION_LEVELS_INVALID\",\"caveats\":[\"caveats\"]},\"fields\":[{}]},\"taskCatalog\":{\"taskDefinitions\":[{}]},\"media\":{\"media\":[{}]},\"relationships\":{\"relationships\":[{}]},\"visualDetails\":{\"rangeRings\":{\"minDistanceM\":1.1,\"maxDistanceM\":1.1,\"ringCount\":1}},\"dimensions\":{\"lengthM\":1.1},\"routeDetails\":{\"destinationName\":\"destinationName\",\"estimatedArrivalTime\":\"2024-01-15T09:30:00Z\"},\"schedules\":{\"schedules\":[{}]},\"health\":{\"connectionStatus\":\"CONNECTION_STATUS_INVALID\",\"healthStatus\":\"HEALTH_STATUS_INVALID\",\"components\":[{}],\"updateTime\":\"2024-01-15T09:30:00Z\",\"activeAlerts\":[{}]},\"groupDetails\":{\"echelon\":{\"armyEchelon\":\"ARMY_ECHELON_INVALID\"}},\"supplies\":{\"fuel\":[{}]},\"symbology\":{\"milStd2525C\":{\"sidc\":\"sidc\"}}}"));
        Entity response = client.entities()
                .overrideEntity(
                        "entityId",
                        "mil_view.disposition",
                        EntityOverride.builder().build());
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
                + "  \"entityId\": \"entityId\",\n"
                + "  \"description\": \"description\",\n"
                + "  \"isLive\": true,\n"
                + "  \"createdTime\": \"2024-01-15T09:30:00Z\",\n"
                + "  \"expiryTime\": \"2024-01-15T09:30:00Z\",\n"
                + "  \"noExpiry\": true,\n"
                + "  \"status\": {\n"
                + "    \"platformActivity\": \"platformActivity\",\n"
                + "    \"role\": \"role\"\n"
                + "  },\n"
                + "  \"location\": {\n"
                + "    \"position\": {\n"
                + "      \"latitudeDegrees\": 1.1,\n"
                + "      \"longitudeDegrees\": 1.1,\n"
                + "      \"altitudeHaeMeters\": 1.1,\n"
                + "      \"altitudeAglMeters\": 1.1,\n"
                + "      \"altitudeAsfMeters\": 1.1,\n"
                + "      \"pressureDepthMeters\": 1.1\n"
                + "    },\n"
                + "    \"velocityEnu\": {\n"
                + "      \"e\": 1.1,\n"
                + "      \"n\": 1.1,\n"
                + "      \"u\": 1.1\n"
                + "    },\n"
                + "    \"speedMps\": 1.1,\n"
                + "    \"acceleration\": {\n"
                + "      \"e\": 1.1,\n"
                + "      \"n\": 1.1,\n"
                + "      \"u\": 1.1\n"
                + "    },\n"
                + "    \"attitudeEnu\": {\n"
                + "      \"x\": 1.1,\n"
                + "      \"y\": 1.1,\n"
                + "      \"z\": 1.1,\n"
                + "      \"w\": 1.1\n"
                + "    }\n"
                + "  },\n"
                + "  \"locationUncertainty\": {\n"
                + "    \"positionEnuCov\": {\n"
                + "      \"mxx\": 1.1,\n"
                + "      \"mxy\": 1.1,\n"
                + "      \"mxz\": 1.1,\n"
                + "      \"myy\": 1.1,\n"
                + "      \"myz\": 1.1,\n"
                + "      \"mzz\": 1.1\n"
                + "    },\n"
                + "    \"velocityEnuCov\": {\n"
                + "      \"mxx\": 1.1,\n"
                + "      \"mxy\": 1.1,\n"
                + "      \"mxz\": 1.1,\n"
                + "      \"myy\": 1.1,\n"
                + "      \"myz\": 1.1,\n"
                + "      \"mzz\": 1.1\n"
                + "    },\n"
                + "    \"positionErrorEllipse\": {\n"
                + "      \"probability\": 1.1,\n"
                + "      \"semiMajorAxisM\": 1.1,\n"
                + "      \"semiMinorAxisM\": 1.1,\n"
                + "      \"orientationD\": 1.1\n"
                + "    }\n"
                + "  },\n"
                + "  \"geoShape\": {\n"
                + "    \"line\": {\n"
                + "      \"positions\": [\n"
                + "        {}\n"
                + "      ]\n"
                + "    },\n"
                + "    \"polygon\": {\n"
                + "      \"rings\": [\n"
                + "        {}\n"
                + "      ],\n"
                + "      \"isRectangle\": true\n"
                + "    },\n"
                + "    \"ellipse\": {\n"
                + "      \"semiMajorAxisM\": 1.1,\n"
                + "      \"semiMinorAxisM\": 1.1,\n"
                + "      \"orientationD\": 1.1,\n"
                + "      \"heightM\": 1.1\n"
                + "    },\n"
                + "    \"ellipsoid\": {\n"
                + "      \"forwardAxisM\": 1.1,\n"
                + "      \"sideAxisM\": 1.1,\n"
                + "      \"upAxisM\": 1.1\n"
                + "    }\n"
                + "  },\n"
                + "  \"geoDetails\": {\n"
                + "    \"type\": \"GEO_TYPE_INVALID\",\n"
                + "    \"controlArea\": {\n"
                + "      \"type\": \"CONTROL_AREA_TYPE_INVALID\"\n"
                + "    },\n"
                + "    \"acm\": {\n"
                + "      \"acmType\": \"ACM_DETAIL_TYPE_INVALID\",\n"
                + "      \"acmDescription\": \"acmDescription\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"aliases\": {\n"
                + "    \"alternateIds\": [\n"
                + "      {}\n"
                + "    ],\n"
                + "    \"name\": \"name\"\n"
                + "  },\n"
                + "  \"tracked\": {\n"
                + "    \"trackQualityWrapper\": 1,\n"
                + "    \"sensorHits\": 1,\n"
                + "    \"numberOfObjects\": {\n"
                + "      \"lowerBound\": 1,\n"
                + "      \"upperBound\": 1\n"
                + "    },\n"
                + "    \"radarCrossSection\": 1.1,\n"
                + "    \"lastMeasurementTime\": \"2024-01-15T09:30:00Z\"\n"
                + "  },\n"
                + "  \"correlation\": {\n"
                + "    \"primary\": {\n"
                + "      \"secondaryEntityIds\": [\n"
                + "        \"secondaryEntityIds\"\n"
                + "      ]\n"
                + "    },\n"
                + "    \"secondary\": {\n"
                + "      \"primaryEntityId\": \"primaryEntityId\"\n"
                + "    },\n"
                + "    \"membership\": {\n"
                + "      \"correlationSetId\": \"correlationSetId\"\n"
                + "    },\n"
                + "    \"decorrelation\": {\n"
                + "      \"decorrelatedEntities\": [\n"
                + "        {}\n"
                + "      ]\n"
                + "    }\n"
                + "  },\n"
                + "  \"milView\": {\n"
                + "    \"disposition\": \"DISPOSITION_UNKNOWN\",\n"
                + "    \"environment\": \"ENVIRONMENT_UNKNOWN\",\n"
                + "    \"nationality\": \"NATIONALITY_INVALID\"\n"
                + "  },\n"
                + "  \"ontology\": {\n"
                + "    \"platformType\": \"platformType\",\n"
                + "    \"specificType\": \"specificType\",\n"
                + "    \"template\": \"TEMPLATE_INVALID\"\n"
                + "  },\n"
                + "  \"sensors\": {\n"
                + "    \"sensors\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"payloads\": {\n"
                + "    \"payloadConfigurations\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"powerState\": {\n"
                + "    \"sourceIdToState\": {\n"
                + "      \"key\": {}\n"
                + "    }\n"
                + "  },\n"
                + "  \"provenance\": {\n"
                + "    \"integrationName\": \"integrationName\",\n"
                + "    \"dataType\": \"dataType\",\n"
                + "    \"sourceId\": \"sourceId\",\n"
                + "    \"sourceUpdateTime\": \"2024-01-15T09:30:00Z\",\n"
                + "    \"sourceDescription\": \"sourceDescription\"\n"
                + "  },\n"
                + "  \"overrides\": {\n"
                + "    \"override\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"indicators\": {\n"
                + "    \"simulated\": true,\n"
                + "    \"exercise\": true,\n"
                + "    \"emergency\": true,\n"
                + "    \"c2\": true,\n"
                + "    \"egressable\": true,\n"
                + "    \"starred\": true\n"
                + "  },\n"
                + "  \"targetPriority\": {\n"
                + "    \"highValueTarget\": {\n"
                + "      \"isHighValueTarget\": true,\n"
                + "      \"targetPriority\": 1,\n"
                + "      \"targetMatches\": [\n"
                + "        {}\n"
                + "      ],\n"
                + "      \"isHighPayoffTarget\": true\n"
                + "    },\n"
                + "    \"threat\": {\n"
                + "      \"isThreat\": true\n"
                + "    }\n"
                + "  },\n"
                + "  \"signal\": {\n"
                + "    \"bandwidthHz\": 1.1,\n"
                + "    \"signalToNoiseRatio\": 1.1,\n"
                + "    \"emitterNotations\": [\n"
                + "      {}\n"
                + "    ],\n"
                + "    \"pulseWidthS\": 1.1,\n"
                + "    \"scanCharacteristics\": {\n"
                + "      \"scanType\": \"SCAN_TYPE_INVALID\",\n"
                + "      \"scanPeriodS\": 1.1\n"
                + "    }\n"
                + "  },\n"
                + "  \"transponderCodes\": {\n"
                + "    \"mode1\": 1,\n"
                + "    \"mode2\": 1,\n"
                + "    \"mode3\": 1,\n"
                + "    \"mode4InterrogationResponse\": \"INTERROGATION_RESPONSE_INVALID\",\n"
                + "    \"mode5\": {\n"
                + "      \"mode5InterrogationResponse\": \"INTERROGATION_RESPONSE_INVALID\",\n"
                + "      \"mode5\": 1,\n"
                + "      \"mode5PlatformId\": 1\n"
                + "    },\n"
                + "    \"modeS\": {\n"
                + "      \"id\": \"id\",\n"
                + "      \"address\": 1\n"
                + "    }\n"
                + "  },\n"
                + "  \"dataClassification\": {\n"
                + "    \"default\": {\n"
                + "      \"level\": \"CLASSIFICATION_LEVELS_INVALID\",\n"
                + "      \"caveats\": [\n"
                + "        \"caveats\"\n"
                + "      ]\n"
                + "    },\n"
                + "    \"fields\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"taskCatalog\": {\n"
                + "    \"taskDefinitions\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"media\": {\n"
                + "    \"media\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"relationships\": {\n"
                + "    \"relationships\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"visualDetails\": {\n"
                + "    \"rangeRings\": {\n"
                + "      \"minDistanceM\": 1.1,\n"
                + "      \"maxDistanceM\": 1.1,\n"
                + "      \"ringCount\": 1\n"
                + "    }\n"
                + "  },\n"
                + "  \"dimensions\": {\n"
                + "    \"lengthM\": 1.1\n"
                + "  },\n"
                + "  \"routeDetails\": {\n"
                + "    \"destinationName\": \"destinationName\",\n"
                + "    \"estimatedArrivalTime\": \"2024-01-15T09:30:00Z\"\n"
                + "  },\n"
                + "  \"schedules\": {\n"
                + "    \"schedules\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"health\": {\n"
                + "    \"connectionStatus\": \"CONNECTION_STATUS_INVALID\",\n"
                + "    \"healthStatus\": \"HEALTH_STATUS_INVALID\",\n"
                + "    \"components\": [\n"
                + "      {}\n"
                + "    ],\n"
                + "    \"updateTime\": \"2024-01-15T09:30:00Z\",\n"
                + "    \"activeAlerts\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"groupDetails\": {\n"
                + "    \"echelon\": {\n"
                + "      \"armyEchelon\": \"ARMY_ECHELON_INVALID\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"supplies\": {\n"
                + "    \"fuel\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"symbology\": {\n"
                + "    \"milStd2525C\": {\n"
                + "      \"sidc\": \"sidc\"\n"
                + "    }\n"
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
    public void testRemoveEntityOverride() throws Exception {
        server.enqueue(
                new MockResponse()
                        .setResponseCode(200)
                        .setBody(
                                "{\"entityId\":\"entityId\",\"description\":\"description\",\"isLive\":true,\"createdTime\":\"2024-01-15T09:30:00Z\",\"expiryTime\":\"2024-01-15T09:30:00Z\",\"noExpiry\":true,\"status\":{\"platformActivity\":\"platformActivity\",\"role\":\"role\"},\"location\":{\"position\":{\"latitudeDegrees\":1.1,\"longitudeDegrees\":1.1,\"altitudeHaeMeters\":1.1,\"altitudeAglMeters\":1.1,\"altitudeAsfMeters\":1.1,\"pressureDepthMeters\":1.1},\"velocityEnu\":{\"e\":1.1,\"n\":1.1,\"u\":1.1},\"speedMps\":1.1,\"acceleration\":{\"e\":1.1,\"n\":1.1,\"u\":1.1},\"attitudeEnu\":{\"x\":1.1,\"y\":1.1,\"z\":1.1,\"w\":1.1}},\"locationUncertainty\":{\"positionEnuCov\":{\"mxx\":1.1,\"mxy\":1.1,\"mxz\":1.1,\"myy\":1.1,\"myz\":1.1,\"mzz\":1.1},\"velocityEnuCov\":{\"mxx\":1.1,\"mxy\":1.1,\"mxz\":1.1,\"myy\":1.1,\"myz\":1.1,\"mzz\":1.1},\"positionErrorEllipse\":{\"probability\":1.1,\"semiMajorAxisM\":1.1,\"semiMinorAxisM\":1.1,\"orientationD\":1.1}},\"geoShape\":{\"line\":{\"positions\":[{}]},\"polygon\":{\"rings\":[{}],\"isRectangle\":true},\"ellipse\":{\"semiMajorAxisM\":1.1,\"semiMinorAxisM\":1.1,\"orientationD\":1.1,\"heightM\":1.1},\"ellipsoid\":{\"forwardAxisM\":1.1,\"sideAxisM\":1.1,\"upAxisM\":1.1}},\"geoDetails\":{\"type\":\"GEO_TYPE_INVALID\",\"controlArea\":{\"type\":\"CONTROL_AREA_TYPE_INVALID\"},\"acm\":{\"acmType\":\"ACM_DETAIL_TYPE_INVALID\",\"acmDescription\":\"acmDescription\"}},\"aliases\":{\"alternateIds\":[{}],\"name\":\"name\"},\"tracked\":{\"trackQualityWrapper\":1,\"sensorHits\":1,\"numberOfObjects\":{\"lowerBound\":1,\"upperBound\":1},\"radarCrossSection\":1.1,\"lastMeasurementTime\":\"2024-01-15T09:30:00Z\"},\"correlation\":{\"primary\":{\"secondaryEntityIds\":[\"secondaryEntityIds\"]},\"secondary\":{\"primaryEntityId\":\"primaryEntityId\"},\"membership\":{\"correlationSetId\":\"correlationSetId\"},\"decorrelation\":{\"decorrelatedEntities\":[{}]}},\"milView\":{\"disposition\":\"DISPOSITION_UNKNOWN\",\"environment\":\"ENVIRONMENT_UNKNOWN\",\"nationality\":\"NATIONALITY_INVALID\"},\"ontology\":{\"platformType\":\"platformType\",\"specificType\":\"specificType\",\"template\":\"TEMPLATE_INVALID\"},\"sensors\":{\"sensors\":[{}]},\"payloads\":{\"payloadConfigurations\":[{}]},\"powerState\":{\"sourceIdToState\":{\"key\":{}}},\"provenance\":{\"integrationName\":\"integrationName\",\"dataType\":\"dataType\",\"sourceId\":\"sourceId\",\"sourceUpdateTime\":\"2024-01-15T09:30:00Z\",\"sourceDescription\":\"sourceDescription\"},\"overrides\":{\"override\":[{}]},\"indicators\":{\"simulated\":true,\"exercise\":true,\"emergency\":true,\"c2\":true,\"egressable\":true,\"starred\":true},\"targetPriority\":{\"highValueTarget\":{\"isHighValueTarget\":true,\"targetPriority\":1,\"targetMatches\":[{}],\"isHighPayoffTarget\":true},\"threat\":{\"isThreat\":true}},\"signal\":{\"bandwidthHz\":1.1,\"signalToNoiseRatio\":1.1,\"emitterNotations\":[{}],\"pulseWidthS\":1.1,\"scanCharacteristics\":{\"scanType\":\"SCAN_TYPE_INVALID\",\"scanPeriodS\":1.1}},\"transponderCodes\":{\"mode1\":1,\"mode2\":1,\"mode3\":1,\"mode4InterrogationResponse\":\"INTERROGATION_RESPONSE_INVALID\",\"mode5\":{\"mode5InterrogationResponse\":\"INTERROGATION_RESPONSE_INVALID\",\"mode5\":1,\"mode5PlatformId\":1},\"modeS\":{\"id\":\"id\",\"address\":1}},\"dataClassification\":{\"default\":{\"level\":\"CLASSIFICATION_LEVELS_INVALID\",\"caveats\":[\"caveats\"]},\"fields\":[{}]},\"taskCatalog\":{\"taskDefinitions\":[{}]},\"media\":{\"media\":[{}]},\"relationships\":{\"relationships\":[{}]},\"visualDetails\":{\"rangeRings\":{\"minDistanceM\":1.1,\"maxDistanceM\":1.1,\"ringCount\":1}},\"dimensions\":{\"lengthM\":1.1},\"routeDetails\":{\"destinationName\":\"destinationName\",\"estimatedArrivalTime\":\"2024-01-15T09:30:00Z\"},\"schedules\":{\"schedules\":[{}]},\"health\":{\"connectionStatus\":\"CONNECTION_STATUS_INVALID\",\"healthStatus\":\"HEALTH_STATUS_INVALID\",\"components\":[{}],\"updateTime\":\"2024-01-15T09:30:00Z\",\"activeAlerts\":[{}]},\"groupDetails\":{\"echelon\":{\"armyEchelon\":\"ARMY_ECHELON_INVALID\"}},\"supplies\":{\"fuel\":[{}]},\"symbology\":{\"milStd2525C\":{\"sidc\":\"sidc\"}}}"));
        Entity response = client.entities().removeEntityOverride("entityId", "mil_view.disposition");
        RecordedRequest request = server.takeRequest();
        Assertions.assertNotNull(request);
        Assertions.assertEquals("DELETE", request.getMethod());

        // Validate response body
        Assertions.assertNotNull(response, "Response should not be null");
        String actualResponseJson = objectMapper.writeValueAsString(response);
        String expectedResponseBody = ""
                + "{\n"
                + "  \"entityId\": \"entityId\",\n"
                + "  \"description\": \"description\",\n"
                + "  \"isLive\": true,\n"
                + "  \"createdTime\": \"2024-01-15T09:30:00Z\",\n"
                + "  \"expiryTime\": \"2024-01-15T09:30:00Z\",\n"
                + "  \"noExpiry\": true,\n"
                + "  \"status\": {\n"
                + "    \"platformActivity\": \"platformActivity\",\n"
                + "    \"role\": \"role\"\n"
                + "  },\n"
                + "  \"location\": {\n"
                + "    \"position\": {\n"
                + "      \"latitudeDegrees\": 1.1,\n"
                + "      \"longitudeDegrees\": 1.1,\n"
                + "      \"altitudeHaeMeters\": 1.1,\n"
                + "      \"altitudeAglMeters\": 1.1,\n"
                + "      \"altitudeAsfMeters\": 1.1,\n"
                + "      \"pressureDepthMeters\": 1.1\n"
                + "    },\n"
                + "    \"velocityEnu\": {\n"
                + "      \"e\": 1.1,\n"
                + "      \"n\": 1.1,\n"
                + "      \"u\": 1.1\n"
                + "    },\n"
                + "    \"speedMps\": 1.1,\n"
                + "    \"acceleration\": {\n"
                + "      \"e\": 1.1,\n"
                + "      \"n\": 1.1,\n"
                + "      \"u\": 1.1\n"
                + "    },\n"
                + "    \"attitudeEnu\": {\n"
                + "      \"x\": 1.1,\n"
                + "      \"y\": 1.1,\n"
                + "      \"z\": 1.1,\n"
                + "      \"w\": 1.1\n"
                + "    }\n"
                + "  },\n"
                + "  \"locationUncertainty\": {\n"
                + "    \"positionEnuCov\": {\n"
                + "      \"mxx\": 1.1,\n"
                + "      \"mxy\": 1.1,\n"
                + "      \"mxz\": 1.1,\n"
                + "      \"myy\": 1.1,\n"
                + "      \"myz\": 1.1,\n"
                + "      \"mzz\": 1.1\n"
                + "    },\n"
                + "    \"velocityEnuCov\": {\n"
                + "      \"mxx\": 1.1,\n"
                + "      \"mxy\": 1.1,\n"
                + "      \"mxz\": 1.1,\n"
                + "      \"myy\": 1.1,\n"
                + "      \"myz\": 1.1,\n"
                + "      \"mzz\": 1.1\n"
                + "    },\n"
                + "    \"positionErrorEllipse\": {\n"
                + "      \"probability\": 1.1,\n"
                + "      \"semiMajorAxisM\": 1.1,\n"
                + "      \"semiMinorAxisM\": 1.1,\n"
                + "      \"orientationD\": 1.1\n"
                + "    }\n"
                + "  },\n"
                + "  \"geoShape\": {\n"
                + "    \"line\": {\n"
                + "      \"positions\": [\n"
                + "        {}\n"
                + "      ]\n"
                + "    },\n"
                + "    \"polygon\": {\n"
                + "      \"rings\": [\n"
                + "        {}\n"
                + "      ],\n"
                + "      \"isRectangle\": true\n"
                + "    },\n"
                + "    \"ellipse\": {\n"
                + "      \"semiMajorAxisM\": 1.1,\n"
                + "      \"semiMinorAxisM\": 1.1,\n"
                + "      \"orientationD\": 1.1,\n"
                + "      \"heightM\": 1.1\n"
                + "    },\n"
                + "    \"ellipsoid\": {\n"
                + "      \"forwardAxisM\": 1.1,\n"
                + "      \"sideAxisM\": 1.1,\n"
                + "      \"upAxisM\": 1.1\n"
                + "    }\n"
                + "  },\n"
                + "  \"geoDetails\": {\n"
                + "    \"type\": \"GEO_TYPE_INVALID\",\n"
                + "    \"controlArea\": {\n"
                + "      \"type\": \"CONTROL_AREA_TYPE_INVALID\"\n"
                + "    },\n"
                + "    \"acm\": {\n"
                + "      \"acmType\": \"ACM_DETAIL_TYPE_INVALID\",\n"
                + "      \"acmDescription\": \"acmDescription\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"aliases\": {\n"
                + "    \"alternateIds\": [\n"
                + "      {}\n"
                + "    ],\n"
                + "    \"name\": \"name\"\n"
                + "  },\n"
                + "  \"tracked\": {\n"
                + "    \"trackQualityWrapper\": 1,\n"
                + "    \"sensorHits\": 1,\n"
                + "    \"numberOfObjects\": {\n"
                + "      \"lowerBound\": 1,\n"
                + "      \"upperBound\": 1\n"
                + "    },\n"
                + "    \"radarCrossSection\": 1.1,\n"
                + "    \"lastMeasurementTime\": \"2024-01-15T09:30:00Z\"\n"
                + "  },\n"
                + "  \"correlation\": {\n"
                + "    \"primary\": {\n"
                + "      \"secondaryEntityIds\": [\n"
                + "        \"secondaryEntityIds\"\n"
                + "      ]\n"
                + "    },\n"
                + "    \"secondary\": {\n"
                + "      \"primaryEntityId\": \"primaryEntityId\"\n"
                + "    },\n"
                + "    \"membership\": {\n"
                + "      \"correlationSetId\": \"correlationSetId\"\n"
                + "    },\n"
                + "    \"decorrelation\": {\n"
                + "      \"decorrelatedEntities\": [\n"
                + "        {}\n"
                + "      ]\n"
                + "    }\n"
                + "  },\n"
                + "  \"milView\": {\n"
                + "    \"disposition\": \"DISPOSITION_UNKNOWN\",\n"
                + "    \"environment\": \"ENVIRONMENT_UNKNOWN\",\n"
                + "    \"nationality\": \"NATIONALITY_INVALID\"\n"
                + "  },\n"
                + "  \"ontology\": {\n"
                + "    \"platformType\": \"platformType\",\n"
                + "    \"specificType\": \"specificType\",\n"
                + "    \"template\": \"TEMPLATE_INVALID\"\n"
                + "  },\n"
                + "  \"sensors\": {\n"
                + "    \"sensors\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"payloads\": {\n"
                + "    \"payloadConfigurations\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"powerState\": {\n"
                + "    \"sourceIdToState\": {\n"
                + "      \"key\": {}\n"
                + "    }\n"
                + "  },\n"
                + "  \"provenance\": {\n"
                + "    \"integrationName\": \"integrationName\",\n"
                + "    \"dataType\": \"dataType\",\n"
                + "    \"sourceId\": \"sourceId\",\n"
                + "    \"sourceUpdateTime\": \"2024-01-15T09:30:00Z\",\n"
                + "    \"sourceDescription\": \"sourceDescription\"\n"
                + "  },\n"
                + "  \"overrides\": {\n"
                + "    \"override\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"indicators\": {\n"
                + "    \"simulated\": true,\n"
                + "    \"exercise\": true,\n"
                + "    \"emergency\": true,\n"
                + "    \"c2\": true,\n"
                + "    \"egressable\": true,\n"
                + "    \"starred\": true\n"
                + "  },\n"
                + "  \"targetPriority\": {\n"
                + "    \"highValueTarget\": {\n"
                + "      \"isHighValueTarget\": true,\n"
                + "      \"targetPriority\": 1,\n"
                + "      \"targetMatches\": [\n"
                + "        {}\n"
                + "      ],\n"
                + "      \"isHighPayoffTarget\": true\n"
                + "    },\n"
                + "    \"threat\": {\n"
                + "      \"isThreat\": true\n"
                + "    }\n"
                + "  },\n"
                + "  \"signal\": {\n"
                + "    \"bandwidthHz\": 1.1,\n"
                + "    \"signalToNoiseRatio\": 1.1,\n"
                + "    \"emitterNotations\": [\n"
                + "      {}\n"
                + "    ],\n"
                + "    \"pulseWidthS\": 1.1,\n"
                + "    \"scanCharacteristics\": {\n"
                + "      \"scanType\": \"SCAN_TYPE_INVALID\",\n"
                + "      \"scanPeriodS\": 1.1\n"
                + "    }\n"
                + "  },\n"
                + "  \"transponderCodes\": {\n"
                + "    \"mode1\": 1,\n"
                + "    \"mode2\": 1,\n"
                + "    \"mode3\": 1,\n"
                + "    \"mode4InterrogationResponse\": \"INTERROGATION_RESPONSE_INVALID\",\n"
                + "    \"mode5\": {\n"
                + "      \"mode5InterrogationResponse\": \"INTERROGATION_RESPONSE_INVALID\",\n"
                + "      \"mode5\": 1,\n"
                + "      \"mode5PlatformId\": 1\n"
                + "    },\n"
                + "    \"modeS\": {\n"
                + "      \"id\": \"id\",\n"
                + "      \"address\": 1\n"
                + "    }\n"
                + "  },\n"
                + "  \"dataClassification\": {\n"
                + "    \"default\": {\n"
                + "      \"level\": \"CLASSIFICATION_LEVELS_INVALID\",\n"
                + "      \"caveats\": [\n"
                + "        \"caveats\"\n"
                + "      ]\n"
                + "    },\n"
                + "    \"fields\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"taskCatalog\": {\n"
                + "    \"taskDefinitions\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"media\": {\n"
                + "    \"media\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"relationships\": {\n"
                + "    \"relationships\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"visualDetails\": {\n"
                + "    \"rangeRings\": {\n"
                + "      \"minDistanceM\": 1.1,\n"
                + "      \"maxDistanceM\": 1.1,\n"
                + "      \"ringCount\": 1\n"
                + "    }\n"
                + "  },\n"
                + "  \"dimensions\": {\n"
                + "    \"lengthM\": 1.1\n"
                + "  },\n"
                + "  \"routeDetails\": {\n"
                + "    \"destinationName\": \"destinationName\",\n"
                + "    \"estimatedArrivalTime\": \"2024-01-15T09:30:00Z\"\n"
                + "  },\n"
                + "  \"schedules\": {\n"
                + "    \"schedules\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"health\": {\n"
                + "    \"connectionStatus\": \"CONNECTION_STATUS_INVALID\",\n"
                + "    \"healthStatus\": \"HEALTH_STATUS_INVALID\",\n"
                + "    \"components\": [\n"
                + "      {}\n"
                + "    ],\n"
                + "    \"updateTime\": \"2024-01-15T09:30:00Z\",\n"
                + "    \"activeAlerts\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"groupDetails\": {\n"
                + "    \"echelon\": {\n"
                + "      \"armyEchelon\": \"ARMY_ECHELON_INVALID\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"supplies\": {\n"
                + "    \"fuel\": [\n"
                + "      {}\n"
                + "    ]\n"
                + "  },\n"
                + "  \"symbology\": {\n"
                + "    \"milStd2525C\": {\n"
                + "      \"sidc\": \"sidc\"\n"
                + "    }\n"
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
    public void testLongPollEntityEvents() throws Exception {
        server.enqueue(
                new MockResponse()
                        .setResponseCode(200)
                        .setBody(
                                "{\"sessionToken\":\"sessionToken\",\"entityEvents\":[{\"eventType\":\"EVENT_TYPE_INVALID\",\"time\":\"2024-01-15T09:30:00Z\"}]}"));
        EntityEventResponse response = client.entities()
                .longPollEntityEvents(EntityEventRequest.builder()
                        .sessionToken("sessionToken")
                        .build());
        RecordedRequest request = server.takeRequest();
        Assertions.assertNotNull(request);
        Assertions.assertEquals("POST", request.getMethod());
        // Validate request body
        String actualRequestBody = request.getBody().readUtf8();
        String expectedRequestBody = "" + "{\n" + "  \"sessionToken\": \"sessionToken\"\n" + "}";
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
                + "  \"sessionToken\": \"sessionToken\",\n"
                + "  \"entityEvents\": [\n"
                + "    {\n"
                + "      \"eventType\": \"EVENT_TYPE_INVALID\",\n"
                + "      \"time\": \"2024-01-15T09:30:00Z\"\n"
                + "    }\n"
                + "  ]\n"
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
