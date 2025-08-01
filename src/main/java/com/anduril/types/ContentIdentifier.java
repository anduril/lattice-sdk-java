/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.anduril.types;

import com.anduril.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ContentIdentifier.Builder.class)
public final class ContentIdentifier {
    private final String path;

    private final String checksum;

    private final Map<String, Object> additionalProperties;

    private ContentIdentifier(String path, String checksum, Map<String, Object> additionalProperties) {
        this.path = path;
        this.checksum = checksum;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return A valid path must not contain the following:
     * <ul>
     * <li>Spaces or Tabs</li>
     * <li>Special characters other than underscore (_), dash (-), period (.) and slash (/)</li>
     * <li>Non-ASCII characters such as accents or symbols
     * Paths must not start with a leading space.</li>
     * </ul>
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * @return The SHA-256 checksum of this object.
     */
    @JsonProperty("checksum")
    public String getChecksum() {
        return checksum;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ContentIdentifier && equalTo((ContentIdentifier) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ContentIdentifier other) {
        return path.equals(other.path) && checksum.equals(other.checksum);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.path, this.checksum);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static PathStage builder() {
        return new Builder();
    }

    public interface PathStage {
        /**
         * <p>A valid path must not contain the following:</p>
         * <ul>
         * <li>Spaces or Tabs</li>
         * <li>Special characters other than underscore (_), dash (-), period (.) and slash (/)</li>
         * <li>Non-ASCII characters such as accents or symbols
         * Paths must not start with a leading space.</li>
         * </ul>
         */
        ChecksumStage path(@NotNull String path);

        Builder from(ContentIdentifier other);
    }

    public interface ChecksumStage {
        /**
         * <p>The SHA-256 checksum of this object.</p>
         */
        _FinalStage checksum(@NotNull String checksum);
    }

    public interface _FinalStage {
        ContentIdentifier build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements PathStage, ChecksumStage, _FinalStage {
        private String path;

        private String checksum;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ContentIdentifier other) {
            path(other.getPath());
            checksum(other.getChecksum());
            return this;
        }

        /**
         * <p>A valid path must not contain the following:</p>
         * <ul>
         * <li>Spaces or Tabs</li>
         * <li>Special characters other than underscore (_), dash (-), period (.) and slash (/)</li>
         * <li>Non-ASCII characters such as accents or symbols
         * Paths must not start with a leading space.</li>
         * </ul>
         * <p>A valid path must not contain the following:</p>
         * <ul>
         * <li>Spaces or Tabs</li>
         * <li>Special characters other than underscore (_), dash (-), period (.) and slash (/)</li>
         * <li>Non-ASCII characters such as accents or symbols
         * Paths must not start with a leading space.</li>
         * </ul>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("path")
        public ChecksumStage path(@NotNull String path) {
            this.path = Objects.requireNonNull(path, "path must not be null");
            return this;
        }

        /**
         * <p>The SHA-256 checksum of this object.</p>
         * <p>The SHA-256 checksum of this object.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("checksum")
        public _FinalStage checksum(@NotNull String checksum) {
            this.checksum = Objects.requireNonNull(checksum, "checksum must not be null");
            return this;
        }

        @java.lang.Override
        public ContentIdentifier build() {
            return new ContentIdentifier(path, checksum, additionalProperties);
        }
    }
}
