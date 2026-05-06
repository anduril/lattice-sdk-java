# Lattice SDK Java Library

![](https://www.anduril.com/lattice-sdk/)

[![Maven Central](https://img.shields.io/maven-central/v/com.anduril/lattice-sdk)](https://central.sonatype.com/artifact/com.anduril/lattice-sdk)

The Lattice SDK Java library provides convenient access to the Lattice SDK APIs from Java.

## Table of Contents

- [Documentation](#documentation)
- [Requirements](#requirements)
- [Installation](#installation)
- [Support](#support)
- [Usage](#usage)
- [Authentication](#authentication)
- [Environments](#environments)
- [Base Url](#base-url)
- [Exception Handling](#exception-handling)
- [Advanced](#advanced)
  - [Custom Client](#custom-client)
  - [Retries](#retries)
  - [Timeouts](#timeouts)
  - [Custom Headers](#custom-headers)
  - [Access Raw Response Data](#access-raw-response-data)
- [Reference](#reference)

## Documentation

API reference documentation is available [here](https://developer.anduril.com/).

## Requirements

This repository is tested against Java 1.8 or later. 

## Installation

### Gradle

Add the dependency in your `build.gradle` file:

```groovy
dependencies {
  implementation 'com.anduril:lattice-sdk:5.8.1'
}
```

### Maven

Add the dependency in your `pom.xml` file:

```xml
<dependency>
  <groupId>com.anduril</groupId>
  <artifactId>lattice-sdk</artifactId>
  <version>5.8.1</version>
</dependency>
```

## Support

For support with this library please reach out to your Anduril representative.

## Usage

Instantiate and use the client with the following:

```java
package com.example.usage;

import com.anduril.Lattice;

Lattice client = Lattice
    .builder()
    .server("YOUR_SERVER")
    .build();

client.entities().longPollEntityEvents(...);
```

## Authentication

This SDK supports two authentication methods:

### Option 1: Direct Bearer Token

If you already have a valid access token, you can use it directly:

```java
Lattice client = Lattice.builder()
    .token("your-access-token")
    .url("https://api.example.com")
    .build();
```

### Option 2: OAuth Client Credentials

The SDK can automatically handle token acquisition and refresh:

```java
Lattice client = Lattice.builder()
    .credentials("client-id", "client-secret")
    .url("https://api.example.com")
    .build();
```

## Environments

This SDK allows you to configure different environments for API requests.

```java
import com.anduril.Lattice;
import com.anduril.core.Environment;

Lattice client = Lattice
    .builder()
    .environment(Environment.Default)
    .build();
```

## Base Url

You can set a custom base URL when constructing the client.

```java
import com.anduril.Lattice;

Lattice client = Lattice
    .builder()
    .url("https://example.com")
    .build();
```

## Exception Handling

When the API returns a non-success status code (4xx or 5xx response), an API exception will be thrown.

```java
import com.anduril.core.LatticeApiException;

try{
    client.entities().longPollEntityEvents(...);
} catch (LatticeApiException e){
    // Do something with the API exception...
}
```

## Advanced

### Custom Client

This SDK is built to work with any instance of `OkHttpClient`. By default, if no client is provided, the SDK will construct one.
However, you can pass your own client like so:

```java
import com.anduril.Lattice;
import okhttp3.OkHttpClient;

OkHttpClient customClient = ...;

Lattice client = Lattice
    .builder()
    .httpClient(customClient)
    .build();
```

### Retries

The SDK is instrumented with automatic retries with exponential backoff. A request will be retried as long
as the request is deemed retryable and the number of retry attempts has not grown larger than the configured
retry limit (default: 2). Before defaulting to exponential backoff, the SDK will first attempt to respect
the `Retry-After` header (as either in seconds or as an HTTP date), and then the `X-RateLimit-Reset` header
(as a Unix timestamp in epoch seconds); failing both of those, it will fall back to exponential backoff.

Which status codes are retried depends on the `retry-status-codes` generator configuration:

**`legacy`** (current default): retries on
- [408](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/408) (Timeout)
- [429](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/429) (Too Many Requests)
- [5XX](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status#server_error_responses) (All server errors, including 500)

**`recommended`**: retries on
- [408](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/408) (Timeout)
- [429](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/429) (Too Many Requests)
- [502](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/502) (Bad Gateway)
- [503](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/503) (Service Unavailable)
- [504](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/504) (Gateway Timeout)

Use the `maxRetries` client option to configure this behavior.

```java
import com.anduril.Lattice;

Lattice client = Lattice
    .builder()
    .maxRetries(1)
    .build();
```

### Timeouts

The SDK defaults to a 60 second timeout. You can configure this with a timeout option at the client or request level.
```java
import com.anduril.Lattice;
import com.anduril.core.RequestOptions;

// Client level
Lattice client = Lattice
    .builder()
    .timeout(60)
    .build();

// Request level
client.entities().longPollEntityEvents(
    ...,
    RequestOptions
        .builder()
        .timeout(60)
        .build()
);
```

### Custom Headers

The SDK allows you to add custom headers to requests. You can configure headers at the client level or at the request level.

```java
import com.anduril.Lattice;
import com.anduril.core.RequestOptions;

// Client level
Lattice client = Lattice
    .builder()
    .addHeader("X-Custom-Header", "custom-value")
    .addHeader("X-Request-Id", "abc-123")
    .build();
;

// Request level
client.entities().longPollEntityEvents(
    ...,
    RequestOptions
        .builder()
        .addHeader("X-Request-Header", "request-value")
        .build()
);
```

### Access Raw Response Data

The SDK provides access to raw response data, including headers, through the `withRawResponse()` method.
The `withRawResponse()` method returns a raw client that wraps all responses with `body()` and `headers()` methods.
(A normal client's `response` is identical to a raw client's `response.body()`.)

```java
LatticeHttpResponse response = client.entities().withRawResponse().longPollEntityEvents(...);

System.out.println(response.body());
System.out.println(response.headers().get("X-My-Header"));
```

## Reference

A full reference for this library is available [here](https://github.com/anduril/lattice-sdk-java/blob/HEAD/./reference.md).

