# Lattice SDK Java Library

![](https://www.anduril.com/lattice-sdk/)

[![Maven Central](https://img.shields.io/maven-central/v/com.anduril/lattice-sdk)](https://central.sonatype.com/artifact/com.anduril/lattice-sdk)

The Lattice SDK Java library provides convenient access to the Lattice SDK APIs from Java.

## Documentation

API reference documentation is available [here](https://developer.anduril.com/).

## Requirements

This repository is tested against Java 1.8 or later. 

## Installation

### Gradle

Add the dependency in your `build.gradle` file:

```groovy
dependencies {
  implementation 'com.anduril:lattice-sdk'
}
```

### Maven

Add the dependency in your `pom.xml` file:

```xml
<dependency>
  <groupId>com.anduril</groupId>
  <artifactId>lattice-sdk</artifactId>
  <version>3.0.0</version>
</dependency>
```

## Support

For support with this library please reach out to your Anduril representative.

## Usage

Instantiate and use the client with the following:

```java
package com.example.usage;

import com.anduril.Lattice;
import com.anduril.resources.entities.requests.EntityEventRequest;

public class Example {
    public static void main(String[] args) {
        Lattice client = Lattice
            .builder()
            .token("<token>")
            .build();

        client.entities().longPollEntityEvents(
            EntityEventRequest
                .builder()
                .sessionToken("sessionToken")
                .build()
        );
    }
}
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
import com.anduril.core.AndurilApiApiException;

try {
    client.entities().longPollEntityEvents(...);
} catch (AndurilApiApiException e) {
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
retry limit (default: 2).

A request is deemed retryable when any of the following HTTP status codes is returned:

- [408](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/408) (Timeout)
- [429](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/429) (Too Many Requests)
- [5XX](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/500) (Internal Server Errors)

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
    .timeout(10)
    .build();

// Request level
client.entities().longPollEntityEvents(
    ...,
    RequestOptions
        .builder()
        .timeout(10)
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

## Reference

A full reference for this library is available [here](https://github.com/anduril/lattice-sdk-java/blob/HEAD/./reference.md).
