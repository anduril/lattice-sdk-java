/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.anduril.errors;

import com.anduril.core.LatticeApiException;
import okhttp3.Response;

public final class RequestTimeoutError extends LatticeApiException {
    /**
     * The body of the response that triggered the exception.
     */
    private final Object body;

    public RequestTimeoutError(Object body) {
        super("RequestTimeoutError", 408, body);
        this.body = body;
    }

    public RequestTimeoutError(Object body, Response rawResponse) {
        super("RequestTimeoutError", 408, body, rawResponse);
        this.body = body;
    }

    /**
     * @return the body
     */
    @java.lang.Override
    public Object body() {
        return this.body;
    }
}
