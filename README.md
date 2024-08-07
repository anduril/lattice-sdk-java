# Anduril SDK Java

The official [Anduril](https://www.anduril.com/) client library.

## Requirements

Java 1.8 or later

## Installation

### Authentication

To authenticate with the Github package repository, you will need to generate a [personal access token](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens#creating-a-personal-access-token-classic). This should have at least `read:packages` scope. Please keep the token safe for the next stage of the setup procedure.

### Gradle users

Using the Personal Access Token generated earlier, you will need to [setup Gradle](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-gradle-registry) to use this token. 

To do so you will need to create a `gradle.properties` file to include your personal access token. Create a new `gradle.properties` file in your repository and replace `GITHUB_USERNAME` and `GITHUB_TOKEN` with your username and your previously generated token.

```yaml
gpr.user=<GITHUB_USERNAME>
gpr.key=<GITHUB_TOKEN>
```

Once this is done, add your dependency to your project's build.gradle file:

```gradle
dependencies {
   implementation 'com.anduril:anduril-sdk-java:+'
}

repositories {
   maven {
        url = uri('https://maven.pkg.github.com/anduril/anduril-java')
        credentials {
            username = project.findProperty("gpr.user") ?: System.getenv("GITHUB_USERNAME")
            password = project.findProperty("gpr.key") ?: System.getenv("GITHUB_TOKEN")
        }
    }
}
```

### Maven users

Using the Personal Access Token generated earlier, you will need to [setup Maven](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-apache-maven-registry#authenticating-with-a-personal-access-token) to use this token. 

To do so you will need to edit your ~/.m2/settings.xml file to include your personal access token. Create a new ~/.m2/settings.xml file if one doesn't exist. Be sure to replace `GITHUB_USERNAME` and `GITHUB_TOKEN` with your username and your previously generated token.

```xml
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                      http://maven.apache.org/xsd/settings-1.0.0.xsd">

  <activeProfiles>
    <activeProfile>github</activeProfile>
  </activeProfiles>

  <profiles>
    <profile>
      <id>github</id>
      <repositories>
        <repository>
          <id>central</id>
          <url>https://repo1.maven.org/maven2</url>
        </repository>
        <repository>
          <id>github</id>
          <url>https://maven.pkg.github.com/anduril/anduril-java)</url>
          <snapshots>
            <enabled>true</enabled>
          </snapshots>
        </repository>
      </repositories>
    </profile>
  </profiles>

  <servers>
    <server>
      <id>github</id>
      <username>GITHUB_USERNAME</username>
      <password>GITHUB_TOKEN</password>
    </server>
  </servers>
</settings>
```

Once this is done, add your dependency to your project's POM. To get the latest version, please visit the Github [package](https://github.com/anduril/anduril-java/packages/2221565).

```xml
    <dependency>
      <groupId>com.anduril</groupId>
      <artifactId>anduril-sdk-java</artifactId>
      <version>1.0.0-SNAPSHOT6</version>
    </dependency>
```

## Usage

AndurilExample.java

```java

package com.demo;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.anduril.entitymanager.v1.EntityManagerAPIGrpc;
import com.anduril.entitymanager.v1.EntityManagerAPIGrpc.EntityManagerAPIBlockingStub;
import com.anduril.entitymanager.v1.GetEntityRequest;

import io.grpc.ClientInterceptor;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.stub.MetadataUtils;

class AndurilExample {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("desert-guardian.anduril.com", 443).useTransportSecurity().build();
    
        Metadata header = new Metadata();
        Metadata.Key<String> key = Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER);
        // REPLACE BEARER TOKEN 
        header.put(key, "Bearer <BEARER TOKEN");
               
        // apply interceptor to apply auth headers to requests
        ClientInterceptor interceptor = MetadataUtils.newAttachHeadersInterceptor(header);
        EntityManagerAPIBlockingStub serviceStub = EntityManagerAPIGrpc.newBlockingStub(channel).withInterceptors(interceptor);
    
        GetEntityRequest request = GetEntityRequest.newBuilder().setEntityId("ABC").build();
        try {
            serviceStub.getEntity(request);
        } catch (Exception e) {
            Status status = Status.fromThrowable(e);
            Logger.getGlobal().log(Level.INFO, status.getDescription());
        }
    }
}
```

## Support

For support with this library please [file an issue](https://github.com/anduril/anduril-java/issues/new) or reach out to your Anduril representative. 


