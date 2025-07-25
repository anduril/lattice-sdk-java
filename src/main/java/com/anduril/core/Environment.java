/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.anduril.core;

public final class Environment {
    public static final Environment DEFAULT = new Environment("https://example.developer.anduril.com");

    private final String url;

    private Environment(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

    public static Environment custom(String url) {
        return new Environment(url);
    }
}
