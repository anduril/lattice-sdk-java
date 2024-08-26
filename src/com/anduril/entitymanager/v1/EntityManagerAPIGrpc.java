package com.anduril.entitymanager.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The EntityManager provides a UI centric data model for understanding the entities in a battle space.
 * Every object in a battle space is represented as an "Entity". Each Entity is essentially an ID, with a life cycle,
 * and a collection of data components. Each data component is a separate protobuf message definition.
 * EntityManager provides a way to query the currently live set of entities within a set of filter constraints,
 * as well as a limited set of management APIs to change the grouping or relationships between entities.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.1)",
    comments = "Source: anduril/entitymanager/v1/entity_manager_api.pub.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EntityManagerAPIGrpc {

  private EntityManagerAPIGrpc() {}

  public static final String SERVICE_NAME = "anduril.entitymanager.v1.EntityManagerAPI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.GetEntityRequest,
      com.anduril.entitymanager.v1.GetEntityResponse> getGetEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEntity",
      requestType = com.anduril.entitymanager.v1.GetEntityRequest.class,
      responseType = com.anduril.entitymanager.v1.GetEntityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.GetEntityRequest,
      com.anduril.entitymanager.v1.GetEntityResponse> getGetEntityMethod() {
    io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.GetEntityRequest, com.anduril.entitymanager.v1.GetEntityResponse> getGetEntityMethod;
    if ((getGetEntityMethod = EntityManagerAPIGrpc.getGetEntityMethod) == null) {
      synchronized (EntityManagerAPIGrpc.class) {
        if ((getGetEntityMethod = EntityManagerAPIGrpc.getGetEntityMethod) == null) {
          EntityManagerAPIGrpc.getGetEntityMethod = getGetEntityMethod =
              io.grpc.MethodDescriptor.<com.anduril.entitymanager.v1.GetEntityRequest, com.anduril.entitymanager.v1.GetEntityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.entitymanager.v1.GetEntityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.entitymanager.v1.GetEntityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EntityManagerAPIMethodDescriptorSupplier("GetEntity"))
              .build();
        }
      }
    }
    return getGetEntityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.StreamEntityComponentsRequest,
      com.anduril.entitymanager.v1.StreamEntityComponentsResponse> getStreamEntityComponentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamEntityComponents",
      requestType = com.anduril.entitymanager.v1.StreamEntityComponentsRequest.class,
      responseType = com.anduril.entitymanager.v1.StreamEntityComponentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.StreamEntityComponentsRequest,
      com.anduril.entitymanager.v1.StreamEntityComponentsResponse> getStreamEntityComponentsMethod() {
    io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.StreamEntityComponentsRequest, com.anduril.entitymanager.v1.StreamEntityComponentsResponse> getStreamEntityComponentsMethod;
    if ((getStreamEntityComponentsMethod = EntityManagerAPIGrpc.getStreamEntityComponentsMethod) == null) {
      synchronized (EntityManagerAPIGrpc.class) {
        if ((getStreamEntityComponentsMethod = EntityManagerAPIGrpc.getStreamEntityComponentsMethod) == null) {
          EntityManagerAPIGrpc.getStreamEntityComponentsMethod = getStreamEntityComponentsMethod =
              io.grpc.MethodDescriptor.<com.anduril.entitymanager.v1.StreamEntityComponentsRequest, com.anduril.entitymanager.v1.StreamEntityComponentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamEntityComponents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.entitymanager.v1.StreamEntityComponentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.entitymanager.v1.StreamEntityComponentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EntityManagerAPIMethodDescriptorSupplier("StreamEntityComponents"))
              .build();
        }
      }
    }
    return getStreamEntityComponentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.PutEntityRequest,
      com.anduril.entitymanager.v1.PutEntityResponse> getPutEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutEntity",
      requestType = com.anduril.entitymanager.v1.PutEntityRequest.class,
      responseType = com.anduril.entitymanager.v1.PutEntityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.PutEntityRequest,
      com.anduril.entitymanager.v1.PutEntityResponse> getPutEntityMethod() {
    io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.PutEntityRequest, com.anduril.entitymanager.v1.PutEntityResponse> getPutEntityMethod;
    if ((getPutEntityMethod = EntityManagerAPIGrpc.getPutEntityMethod) == null) {
      synchronized (EntityManagerAPIGrpc.class) {
        if ((getPutEntityMethod = EntityManagerAPIGrpc.getPutEntityMethod) == null) {
          EntityManagerAPIGrpc.getPutEntityMethod = getPutEntityMethod =
              io.grpc.MethodDescriptor.<com.anduril.entitymanager.v1.PutEntityRequest, com.anduril.entitymanager.v1.PutEntityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.entitymanager.v1.PutEntityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.entitymanager.v1.PutEntityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EntityManagerAPIMethodDescriptorSupplier("PutEntity"))
              .build();
        }
      }
    }
    return getPutEntityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.PublishEntitiesRequest,
      com.anduril.entitymanager.v1.PublishEntitiesResponse> getPublishEntitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishEntities",
      requestType = com.anduril.entitymanager.v1.PublishEntitiesRequest.class,
      responseType = com.anduril.entitymanager.v1.PublishEntitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.PublishEntitiesRequest,
      com.anduril.entitymanager.v1.PublishEntitiesResponse> getPublishEntitiesMethod() {
    io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.PublishEntitiesRequest, com.anduril.entitymanager.v1.PublishEntitiesResponse> getPublishEntitiesMethod;
    if ((getPublishEntitiesMethod = EntityManagerAPIGrpc.getPublishEntitiesMethod) == null) {
      synchronized (EntityManagerAPIGrpc.class) {
        if ((getPublishEntitiesMethod = EntityManagerAPIGrpc.getPublishEntitiesMethod) == null) {
          EntityManagerAPIGrpc.getPublishEntitiesMethod = getPublishEntitiesMethod =
              io.grpc.MethodDescriptor.<com.anduril.entitymanager.v1.PublishEntitiesRequest, com.anduril.entitymanager.v1.PublishEntitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishEntities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.entitymanager.v1.PublishEntitiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.entitymanager.v1.PublishEntitiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EntityManagerAPIMethodDescriptorSupplier("PublishEntities"))
              .build();
        }
      }
    }
    return getPublishEntitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.OverrideEntityRequest,
      com.anduril.entitymanager.v1.OverrideEntityResponse> getOverrideEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OverrideEntity",
      requestType = com.anduril.entitymanager.v1.OverrideEntityRequest.class,
      responseType = com.anduril.entitymanager.v1.OverrideEntityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.OverrideEntityRequest,
      com.anduril.entitymanager.v1.OverrideEntityResponse> getOverrideEntityMethod() {
    io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.OverrideEntityRequest, com.anduril.entitymanager.v1.OverrideEntityResponse> getOverrideEntityMethod;
    if ((getOverrideEntityMethod = EntityManagerAPIGrpc.getOverrideEntityMethod) == null) {
      synchronized (EntityManagerAPIGrpc.class) {
        if ((getOverrideEntityMethod = EntityManagerAPIGrpc.getOverrideEntityMethod) == null) {
          EntityManagerAPIGrpc.getOverrideEntityMethod = getOverrideEntityMethod =
              io.grpc.MethodDescriptor.<com.anduril.entitymanager.v1.OverrideEntityRequest, com.anduril.entitymanager.v1.OverrideEntityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OverrideEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.entitymanager.v1.OverrideEntityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.entitymanager.v1.OverrideEntityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EntityManagerAPIMethodDescriptorSupplier("OverrideEntity"))
              .build();
        }
      }
    }
    return getOverrideEntityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.RemoveEntityOverrideRequest,
      com.anduril.entitymanager.v1.RemoveEntityOverrideResponse> getRemoveEntityOverrideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveEntityOverride",
      requestType = com.anduril.entitymanager.v1.RemoveEntityOverrideRequest.class,
      responseType = com.anduril.entitymanager.v1.RemoveEntityOverrideResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.RemoveEntityOverrideRequest,
      com.anduril.entitymanager.v1.RemoveEntityOverrideResponse> getRemoveEntityOverrideMethod() {
    io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.RemoveEntityOverrideRequest, com.anduril.entitymanager.v1.RemoveEntityOverrideResponse> getRemoveEntityOverrideMethod;
    if ((getRemoveEntityOverrideMethod = EntityManagerAPIGrpc.getRemoveEntityOverrideMethod) == null) {
      synchronized (EntityManagerAPIGrpc.class) {
        if ((getRemoveEntityOverrideMethod = EntityManagerAPIGrpc.getRemoveEntityOverrideMethod) == null) {
          EntityManagerAPIGrpc.getRemoveEntityOverrideMethod = getRemoveEntityOverrideMethod =
              io.grpc.MethodDescriptor.<com.anduril.entitymanager.v1.RemoveEntityOverrideRequest, com.anduril.entitymanager.v1.RemoveEntityOverrideResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveEntityOverride"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.entitymanager.v1.RemoveEntityOverrideRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.entitymanager.v1.RemoveEntityOverrideResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EntityManagerAPIMethodDescriptorSupplier("RemoveEntityOverride"))
              .build();
        }
      }
    }
    return getRemoveEntityOverrideMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.DeleteEntityRequest,
      com.anduril.entitymanager.v1.DeleteEntityResponse> getDeleteEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEntity",
      requestType = com.anduril.entitymanager.v1.DeleteEntityRequest.class,
      responseType = com.anduril.entitymanager.v1.DeleteEntityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.DeleteEntityRequest,
      com.anduril.entitymanager.v1.DeleteEntityResponse> getDeleteEntityMethod() {
    io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.DeleteEntityRequest, com.anduril.entitymanager.v1.DeleteEntityResponse> getDeleteEntityMethod;
    if ((getDeleteEntityMethod = EntityManagerAPIGrpc.getDeleteEntityMethod) == null) {
      synchronized (EntityManagerAPIGrpc.class) {
        if ((getDeleteEntityMethod = EntityManagerAPIGrpc.getDeleteEntityMethod) == null) {
          EntityManagerAPIGrpc.getDeleteEntityMethod = getDeleteEntityMethod =
              io.grpc.MethodDescriptor.<com.anduril.entitymanager.v1.DeleteEntityRequest, com.anduril.entitymanager.v1.DeleteEntityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.entitymanager.v1.DeleteEntityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.entitymanager.v1.DeleteEntityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EntityManagerAPIMethodDescriptorSupplier("DeleteEntity"))
              .build();
        }
      }
    }
    return getDeleteEntityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.RelateEntityRequest,
      com.anduril.entitymanager.v1.RelateEntityResponse> getRelateEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RelateEntity",
      requestType = com.anduril.entitymanager.v1.RelateEntityRequest.class,
      responseType = com.anduril.entitymanager.v1.RelateEntityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.RelateEntityRequest,
      com.anduril.entitymanager.v1.RelateEntityResponse> getRelateEntityMethod() {
    io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.RelateEntityRequest, com.anduril.entitymanager.v1.RelateEntityResponse> getRelateEntityMethod;
    if ((getRelateEntityMethod = EntityManagerAPIGrpc.getRelateEntityMethod) == null) {
      synchronized (EntityManagerAPIGrpc.class) {
        if ((getRelateEntityMethod = EntityManagerAPIGrpc.getRelateEntityMethod) == null) {
          EntityManagerAPIGrpc.getRelateEntityMethod = getRelateEntityMethod =
              io.grpc.MethodDescriptor.<com.anduril.entitymanager.v1.RelateEntityRequest, com.anduril.entitymanager.v1.RelateEntityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RelateEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.entitymanager.v1.RelateEntityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.entitymanager.v1.RelateEntityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EntityManagerAPIMethodDescriptorSupplier("RelateEntity"))
              .build();
        }
      }
    }
    return getRelateEntityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.UnrelateEntityRequest,
      com.anduril.entitymanager.v1.UnrelateEntityResponse> getUnrelateEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnrelateEntity",
      requestType = com.anduril.entitymanager.v1.UnrelateEntityRequest.class,
      responseType = com.anduril.entitymanager.v1.UnrelateEntityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.UnrelateEntityRequest,
      com.anduril.entitymanager.v1.UnrelateEntityResponse> getUnrelateEntityMethod() {
    io.grpc.MethodDescriptor<com.anduril.entitymanager.v1.UnrelateEntityRequest, com.anduril.entitymanager.v1.UnrelateEntityResponse> getUnrelateEntityMethod;
    if ((getUnrelateEntityMethod = EntityManagerAPIGrpc.getUnrelateEntityMethod) == null) {
      synchronized (EntityManagerAPIGrpc.class) {
        if ((getUnrelateEntityMethod = EntityManagerAPIGrpc.getUnrelateEntityMethod) == null) {
          EntityManagerAPIGrpc.getUnrelateEntityMethod = getUnrelateEntityMethod =
              io.grpc.MethodDescriptor.<com.anduril.entitymanager.v1.UnrelateEntityRequest, com.anduril.entitymanager.v1.UnrelateEntityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnrelateEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.entitymanager.v1.UnrelateEntityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.entitymanager.v1.UnrelateEntityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EntityManagerAPIMethodDescriptorSupplier("UnrelateEntity"))
              .build();
        }
      }
    }
    return getUnrelateEntityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EntityManagerAPIStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EntityManagerAPIStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EntityManagerAPIStub>() {
        @java.lang.Override
        public EntityManagerAPIStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EntityManagerAPIStub(channel, callOptions);
        }
      };
    return EntityManagerAPIStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EntityManagerAPIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EntityManagerAPIBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EntityManagerAPIBlockingStub>() {
        @java.lang.Override
        public EntityManagerAPIBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EntityManagerAPIBlockingStub(channel, callOptions);
        }
      };
    return EntityManagerAPIBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EntityManagerAPIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EntityManagerAPIFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EntityManagerAPIFutureStub>() {
        @java.lang.Override
        public EntityManagerAPIFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EntityManagerAPIFutureStub(channel, callOptions);
        }
      };
    return EntityManagerAPIFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The EntityManager provides a UI centric data model for understanding the entities in a battle space.
   * Every object in a battle space is represented as an "Entity". Each Entity is essentially an ID, with a life cycle,
   * and a collection of data components. Each data component is a separate protobuf message definition.
   * EntityManager provides a way to query the currently live set of entities within a set of filter constraints,
   * as well as a limited set of management APIs to change the grouping or relationships between entities.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Get a entity based on an entityId.
     * </pre>
     */
    default void getEntity(com.anduril.entitymanager.v1.GetEntityRequest request,
        io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.GetEntityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEntityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a stream of entity with specified components populated.
     * </pre>
     */
    default void streamEntityComponents(com.anduril.entitymanager.v1.StreamEntityComponentsRequest request,
        io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.StreamEntityComponentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamEntityComponentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create or Update an Entity. This should be used by low update rate situations where Entity Manager is
     * the source of truth, rather than an aggregator. The canonical example is a manually created entity.
     * Entities created in this fashion are stored as a Base entity, overrides on top are still possible.
     * </pre>
     */
    default void putEntity(com.anduril.entitymanager.v1.PutEntityRequest request,
        io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.PutEntityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutEntityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create or Update one or more Entities. This should be used during high update rate situations where the originator
     * is both the aggregator and source of truth for the published entities, and the originator does not have
     * the ability to directly publish to Flux.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.PublishEntitiesRequest> publishEntities(
        io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.PublishEntitiesResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getPublishEntitiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Override an Entity Component. Only fields marked with overridable can be overwritten.
     * </pre>
     */
    default void overrideEntity(com.anduril.entitymanager.v1.OverrideEntityRequest request,
        io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.OverrideEntityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOverrideEntityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove an override for an Entity component.
     * </pre>
     */
    default void removeEntityOverride(com.anduril.entitymanager.v1.RemoveEntityOverrideRequest request,
        io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.RemoveEntityOverrideResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveEntityOverrideMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an Entity - only works on entities created by PutEntity.
     * </pre>
     */
    default void deleteEntity(com.anduril.entitymanager.v1.DeleteEntityRequest request,
        io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.DeleteEntityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEntityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates or Updates relationships on an Entity. All relationships that are being added in the request
     * succeed or fail as a batch (i.e. if any one relationship is invalid, the request will fail).
     * </pre>
     */
    default void relateEntity(com.anduril.entitymanager.v1.RelateEntityRequest request,
        io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.RelateEntityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRelateEntityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes relationships on an Entity.
     * </pre>
     */
    default void unrelateEntity(com.anduril.entitymanager.v1.UnrelateEntityRequest request,
        io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.UnrelateEntityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnrelateEntityMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EntityManagerAPI.
   * <pre>
   * The EntityManager provides a UI centric data model for understanding the entities in a battle space.
   * Every object in a battle space is represented as an "Entity". Each Entity is essentially an ID, with a life cycle,
   * and a collection of data components. Each data component is a separate protobuf message definition.
   * EntityManager provides a way to query the currently live set of entities within a set of filter constraints,
   * as well as a limited set of management APIs to change the grouping or relationships between entities.
   * </pre>
   */
  public static abstract class EntityManagerAPIImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EntityManagerAPIGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EntityManagerAPI.
   * <pre>
   * The EntityManager provides a UI centric data model for understanding the entities in a battle space.
   * Every object in a battle space is represented as an "Entity". Each Entity is essentially an ID, with a life cycle,
   * and a collection of data components. Each data component is a separate protobuf message definition.
   * EntityManager provides a way to query the currently live set of entities within a set of filter constraints,
   * as well as a limited set of management APIs to change the grouping or relationships between entities.
   * </pre>
   */
  public static final class EntityManagerAPIStub
      extends io.grpc.stub.AbstractAsyncStub<EntityManagerAPIStub> {
    private EntityManagerAPIStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EntityManagerAPIStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EntityManagerAPIStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a entity based on an entityId.
     * </pre>
     */
    public void getEntity(com.anduril.entitymanager.v1.GetEntityRequest request,
        io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.GetEntityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEntityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a stream of entity with specified components populated.
     * </pre>
     */
    public void streamEntityComponents(com.anduril.entitymanager.v1.StreamEntityComponentsRequest request,
        io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.StreamEntityComponentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamEntityComponentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create or Update an Entity. This should be used by low update rate situations where Entity Manager is
     * the source of truth, rather than an aggregator. The canonical example is a manually created entity.
     * Entities created in this fashion are stored as a Base entity, overrides on top are still possible.
     * </pre>
     */
    public void putEntity(com.anduril.entitymanager.v1.PutEntityRequest request,
        io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.PutEntityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutEntityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create or Update one or more Entities. This should be used during high update rate situations where the originator
     * is both the aggregator and source of truth for the published entities, and the originator does not have
     * the ability to directly publish to Flux.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.PublishEntitiesRequest> publishEntities(
        io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.PublishEntitiesResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getPublishEntitiesMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Override an Entity Component. Only fields marked with overridable can be overwritten.
     * </pre>
     */
    public void overrideEntity(com.anduril.entitymanager.v1.OverrideEntityRequest request,
        io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.OverrideEntityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOverrideEntityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove an override for an Entity component.
     * </pre>
     */
    public void removeEntityOverride(com.anduril.entitymanager.v1.RemoveEntityOverrideRequest request,
        io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.RemoveEntityOverrideResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveEntityOverrideMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an Entity - only works on entities created by PutEntity.
     * </pre>
     */
    public void deleteEntity(com.anduril.entitymanager.v1.DeleteEntityRequest request,
        io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.DeleteEntityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEntityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates or Updates relationships on an Entity. All relationships that are being added in the request
     * succeed or fail as a batch (i.e. if any one relationship is invalid, the request will fail).
     * </pre>
     */
    public void relateEntity(com.anduril.entitymanager.v1.RelateEntityRequest request,
        io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.RelateEntityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRelateEntityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes relationships on an Entity.
     * </pre>
     */
    public void unrelateEntity(com.anduril.entitymanager.v1.UnrelateEntityRequest request,
        io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.UnrelateEntityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnrelateEntityMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EntityManagerAPI.
   * <pre>
   * The EntityManager provides a UI centric data model for understanding the entities in a battle space.
   * Every object in a battle space is represented as an "Entity". Each Entity is essentially an ID, with a life cycle,
   * and a collection of data components. Each data component is a separate protobuf message definition.
   * EntityManager provides a way to query the currently live set of entities within a set of filter constraints,
   * as well as a limited set of management APIs to change the grouping or relationships between entities.
   * </pre>
   */
  public static final class EntityManagerAPIBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EntityManagerAPIBlockingStub> {
    private EntityManagerAPIBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EntityManagerAPIBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EntityManagerAPIBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a entity based on an entityId.
     * </pre>
     */
    public com.anduril.entitymanager.v1.GetEntityResponse getEntity(com.anduril.entitymanager.v1.GetEntityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEntityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a stream of entity with specified components populated.
     * </pre>
     */
    public java.util.Iterator<com.anduril.entitymanager.v1.StreamEntityComponentsResponse> streamEntityComponents(
        com.anduril.entitymanager.v1.StreamEntityComponentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamEntityComponentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create or Update an Entity. This should be used by low update rate situations where Entity Manager is
     * the source of truth, rather than an aggregator. The canonical example is a manually created entity.
     * Entities created in this fashion are stored as a Base entity, overrides on top are still possible.
     * </pre>
     */
    public com.anduril.entitymanager.v1.PutEntityResponse putEntity(com.anduril.entitymanager.v1.PutEntityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutEntityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Override an Entity Component. Only fields marked with overridable can be overwritten.
     * </pre>
     */
    public com.anduril.entitymanager.v1.OverrideEntityResponse overrideEntity(com.anduril.entitymanager.v1.OverrideEntityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOverrideEntityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove an override for an Entity component.
     * </pre>
     */
    public com.anduril.entitymanager.v1.RemoveEntityOverrideResponse removeEntityOverride(com.anduril.entitymanager.v1.RemoveEntityOverrideRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveEntityOverrideMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an Entity - only works on entities created by PutEntity.
     * </pre>
     */
    public com.anduril.entitymanager.v1.DeleteEntityResponse deleteEntity(com.anduril.entitymanager.v1.DeleteEntityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEntityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates or Updates relationships on an Entity. All relationships that are being added in the request
     * succeed or fail as a batch (i.e. if any one relationship is invalid, the request will fail).
     * </pre>
     */
    public com.anduril.entitymanager.v1.RelateEntityResponse relateEntity(com.anduril.entitymanager.v1.RelateEntityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRelateEntityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes relationships on an Entity.
     * </pre>
     */
    public com.anduril.entitymanager.v1.UnrelateEntityResponse unrelateEntity(com.anduril.entitymanager.v1.UnrelateEntityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnrelateEntityMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EntityManagerAPI.
   * <pre>
   * The EntityManager provides a UI centric data model for understanding the entities in a battle space.
   * Every object in a battle space is represented as an "Entity". Each Entity is essentially an ID, with a life cycle,
   * and a collection of data components. Each data component is a separate protobuf message definition.
   * EntityManager provides a way to query the currently live set of entities within a set of filter constraints,
   * as well as a limited set of management APIs to change the grouping or relationships between entities.
   * </pre>
   */
  public static final class EntityManagerAPIFutureStub
      extends io.grpc.stub.AbstractFutureStub<EntityManagerAPIFutureStub> {
    private EntityManagerAPIFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EntityManagerAPIFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EntityManagerAPIFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a entity based on an entityId.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.anduril.entitymanager.v1.GetEntityResponse> getEntity(
        com.anduril.entitymanager.v1.GetEntityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEntityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create or Update an Entity. This should be used by low update rate situations where Entity Manager is
     * the source of truth, rather than an aggregator. The canonical example is a manually created entity.
     * Entities created in this fashion are stored as a Base entity, overrides on top are still possible.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.anduril.entitymanager.v1.PutEntityResponse> putEntity(
        com.anduril.entitymanager.v1.PutEntityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutEntityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Override an Entity Component. Only fields marked with overridable can be overwritten.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.anduril.entitymanager.v1.OverrideEntityResponse> overrideEntity(
        com.anduril.entitymanager.v1.OverrideEntityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOverrideEntityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove an override for an Entity component.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.anduril.entitymanager.v1.RemoveEntityOverrideResponse> removeEntityOverride(
        com.anduril.entitymanager.v1.RemoveEntityOverrideRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveEntityOverrideMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an Entity - only works on entities created by PutEntity.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.anduril.entitymanager.v1.DeleteEntityResponse> deleteEntity(
        com.anduril.entitymanager.v1.DeleteEntityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEntityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates or Updates relationships on an Entity. All relationships that are being added in the request
     * succeed or fail as a batch (i.e. if any one relationship is invalid, the request will fail).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.anduril.entitymanager.v1.RelateEntityResponse> relateEntity(
        com.anduril.entitymanager.v1.RelateEntityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRelateEntityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes relationships on an Entity.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.anduril.entitymanager.v1.UnrelateEntityResponse> unrelateEntity(
        com.anduril.entitymanager.v1.UnrelateEntityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnrelateEntityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ENTITY = 0;
  private static final int METHODID_STREAM_ENTITY_COMPONENTS = 1;
  private static final int METHODID_PUT_ENTITY = 2;
  private static final int METHODID_OVERRIDE_ENTITY = 3;
  private static final int METHODID_REMOVE_ENTITY_OVERRIDE = 4;
  private static final int METHODID_DELETE_ENTITY = 5;
  private static final int METHODID_RELATE_ENTITY = 6;
  private static final int METHODID_UNRELATE_ENTITY = 7;
  private static final int METHODID_PUBLISH_ENTITIES = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ENTITY:
          serviceImpl.getEntity((com.anduril.entitymanager.v1.GetEntityRequest) request,
              (io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.GetEntityResponse>) responseObserver);
          break;
        case METHODID_STREAM_ENTITY_COMPONENTS:
          serviceImpl.streamEntityComponents((com.anduril.entitymanager.v1.StreamEntityComponentsRequest) request,
              (io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.StreamEntityComponentsResponse>) responseObserver);
          break;
        case METHODID_PUT_ENTITY:
          serviceImpl.putEntity((com.anduril.entitymanager.v1.PutEntityRequest) request,
              (io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.PutEntityResponse>) responseObserver);
          break;
        case METHODID_OVERRIDE_ENTITY:
          serviceImpl.overrideEntity((com.anduril.entitymanager.v1.OverrideEntityRequest) request,
              (io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.OverrideEntityResponse>) responseObserver);
          break;
        case METHODID_REMOVE_ENTITY_OVERRIDE:
          serviceImpl.removeEntityOverride((com.anduril.entitymanager.v1.RemoveEntityOverrideRequest) request,
              (io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.RemoveEntityOverrideResponse>) responseObserver);
          break;
        case METHODID_DELETE_ENTITY:
          serviceImpl.deleteEntity((com.anduril.entitymanager.v1.DeleteEntityRequest) request,
              (io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.DeleteEntityResponse>) responseObserver);
          break;
        case METHODID_RELATE_ENTITY:
          serviceImpl.relateEntity((com.anduril.entitymanager.v1.RelateEntityRequest) request,
              (io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.RelateEntityResponse>) responseObserver);
          break;
        case METHODID_UNRELATE_ENTITY:
          serviceImpl.unrelateEntity((com.anduril.entitymanager.v1.UnrelateEntityRequest) request,
              (io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.UnrelateEntityResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUBLISH_ENTITIES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.publishEntities(
              (io.grpc.stub.StreamObserver<com.anduril.entitymanager.v1.PublishEntitiesResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.anduril.entitymanager.v1.GetEntityRequest,
              com.anduril.entitymanager.v1.GetEntityResponse>(
                service, METHODID_GET_ENTITY)))
        .addMethod(
          getStreamEntityComponentsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.anduril.entitymanager.v1.StreamEntityComponentsRequest,
              com.anduril.entitymanager.v1.StreamEntityComponentsResponse>(
                service, METHODID_STREAM_ENTITY_COMPONENTS)))
        .addMethod(
          getPutEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.anduril.entitymanager.v1.PutEntityRequest,
              com.anduril.entitymanager.v1.PutEntityResponse>(
                service, METHODID_PUT_ENTITY)))
        .addMethod(
          getPublishEntitiesMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.anduril.entitymanager.v1.PublishEntitiesRequest,
              com.anduril.entitymanager.v1.PublishEntitiesResponse>(
                service, METHODID_PUBLISH_ENTITIES)))
        .addMethod(
          getOverrideEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.anduril.entitymanager.v1.OverrideEntityRequest,
              com.anduril.entitymanager.v1.OverrideEntityResponse>(
                service, METHODID_OVERRIDE_ENTITY)))
        .addMethod(
          getRemoveEntityOverrideMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.anduril.entitymanager.v1.RemoveEntityOverrideRequest,
              com.anduril.entitymanager.v1.RemoveEntityOverrideResponse>(
                service, METHODID_REMOVE_ENTITY_OVERRIDE)))
        .addMethod(
          getDeleteEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.anduril.entitymanager.v1.DeleteEntityRequest,
              com.anduril.entitymanager.v1.DeleteEntityResponse>(
                service, METHODID_DELETE_ENTITY)))
        .addMethod(
          getRelateEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.anduril.entitymanager.v1.RelateEntityRequest,
              com.anduril.entitymanager.v1.RelateEntityResponse>(
                service, METHODID_RELATE_ENTITY)))
        .addMethod(
          getUnrelateEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.anduril.entitymanager.v1.UnrelateEntityRequest,
              com.anduril.entitymanager.v1.UnrelateEntityResponse>(
                service, METHODID_UNRELATE_ENTITY)))
        .build();
  }

  private static abstract class EntityManagerAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EntityManagerAPIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.anduril.entitymanager.v1.EntityManagerApiPubProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EntityManagerAPI");
    }
  }

  private static final class EntityManagerAPIFileDescriptorSupplier
      extends EntityManagerAPIBaseDescriptorSupplier {
    EntityManagerAPIFileDescriptorSupplier() {}
  }

  private static final class EntityManagerAPIMethodDescriptorSupplier
      extends EntityManagerAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EntityManagerAPIMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EntityManagerAPIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EntityManagerAPIFileDescriptorSupplier())
              .addMethod(getGetEntityMethod())
              .addMethod(getStreamEntityComponentsMethod())
              .addMethod(getPutEntityMethod())
              .addMethod(getPublishEntitiesMethod())
              .addMethod(getOverrideEntityMethod())
              .addMethod(getRemoveEntityOverrideMethod())
              .addMethod(getDeleteEntityMethod())
              .addMethod(getRelateEntityMethod())
              .addMethod(getUnrelateEntityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
