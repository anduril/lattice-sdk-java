/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.anduril.core;

import java.util.Optional;

public final class NullableNonemptyFilter {
    @Override
    public boolean equals(Object o) {
        boolean isOptionalEmpty = isOptionalEmpty(o);

        return isOptionalEmpty;
    }

    private boolean isOptionalEmpty(Object o) {
        return o instanceof Optional && !((Optional<?>) o).isPresent();
    }
}
