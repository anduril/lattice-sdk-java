/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.anduril;

import com.anduril.core.ClientOptions;
import com.anduril.core.Suppliers;
import com.anduril.resources.entities.AsyncEntitiesClient;
import com.anduril.resources.objects.AsyncObjectsClient;
import com.anduril.resources.tasks.AsyncTasksClient;
import java.util.function.Supplier;

public class AsyncLattice {
    protected final ClientOptions clientOptions;

    protected final Supplier<AsyncEntitiesClient> entitiesClient;

    protected final Supplier<AsyncTasksClient> tasksClient;

    protected final Supplier<AsyncObjectsClient> objectsClient;

    public AsyncLattice(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.entitiesClient = Suppliers.memoize(() -> new AsyncEntitiesClient(clientOptions));
        this.tasksClient = Suppliers.memoize(() -> new AsyncTasksClient(clientOptions));
        this.objectsClient = Suppliers.memoize(() -> new AsyncObjectsClient(clientOptions));
    }

    public AsyncEntitiesClient entities() {
        return this.entitiesClient.get();
    }

    public AsyncTasksClient tasks() {
        return this.tasksClient.get();
    }

    public AsyncObjectsClient objects() {
        return this.objectsClient.get();
    }

    public static AsyncLatticeBuilder builder() {
        return new AsyncLatticeBuilder();
    }
}
