# Anduril SDK Java

The official [Anduril](https://www.anduril.com/) client library.

## Requirements

Java 1.8 or later

## Installation

### Gradle users

Add this dependency and repository to your project's build.gradle

```gradle
dependencies {
   implementation 'com.anduril:anduril-sdk-java:1.0'
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

Add this dependency to your project's POM:

```xml
    <dependency>
      <groupId>com.anduril</groupId>
      <artifactId>anduril-sdk-java</artifactId>
      <version>LATEST</version>
    </dependency>
```

## Usage

## Support

