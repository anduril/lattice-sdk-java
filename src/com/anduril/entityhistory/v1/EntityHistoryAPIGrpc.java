package com.anduril.entityhistory.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The EntityHistoryAPI provides UI-centric data models for understanding
 * the historic view of a battle space. The API draws heavily on the Entity
 * data model and Entity filter to form the core of its client contract.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.1)",
    comments = "Source: anduril/entityhistory/v1/entity_history_api.pub.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EntityHistoryAPIGrpc {

  private EntityHistoryAPIGrpc() {}

  public static final java.lang.String SERVICE_NAME = "anduril.entityhistory.v1.EntityHistoryAPI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.anduril.entityhistory.v1.ListHistoryRequest,
      com.anduril.entityhistory.v1.ListHistoryResponse> getListHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHistory",
      requestType = com.anduril.entityhistory.v1.ListHistoryRequest.class,
      responseType = com.anduril.entityhistory.v1.ListHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.anduril.entityhistory.v1.ListHistoryRequest,
      com.anduril.entityhistory.v1.ListHistoryResponse> getListHistoryMethod() {
    io.grpc.MethodDescriptor<com.anduril.entityhistory.v1.ListHistoryRequest, com.anduril.entityhistory.v1.ListHistoryResponse> getListHistoryMethod;
    if ((getListHistoryMethod = EntityHistoryAPIGrpc.getListHistoryMethod) == null) {
      synchronized (EntityHistoryAPIGrpc.class) {
        if ((getListHistoryMethod = EntityHistoryAPIGrpc.getListHistoryMethod) == null) {
          EntityHistoryAPIGrpc.getListHistoryMethod = getListHistoryMethod =
              io.grpc.MethodDescriptor.<com.anduril.entityhistory.v1.ListHistoryRequest, com.anduril.entityhistory.v1.ListHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.entityhistory.v1.ListHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.entityhistory.v1.ListHistoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EntityHistoryAPIMethodDescriptorSupplier("ListHistory"))
              .build();
        }
      }
    }
    return getListHistoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EntityHistoryAPIStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EntityHistoryAPIStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EntityHistoryAPIStub>() {
        @java.lang.Override
        public EntityHistoryAPIStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EntityHistoryAPIStub(channel, callOptions);
        }
      };
    return EntityHistoryAPIStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EntityHistoryAPIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EntityHistoryAPIBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EntityHistoryAPIBlockingStub>() {
        @java.lang.Override
        public EntityHistoryAPIBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EntityHistoryAPIBlockingStub(channel, callOptions);
        }
      };
    return EntityHistoryAPIBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EntityHistoryAPIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EntityHistoryAPIFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EntityHistoryAPIFutureStub>() {
        @java.lang.Override
        public EntityHistoryAPIFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EntityHistoryAPIFutureStub(channel, callOptions);
        }
      };
    return EntityHistoryAPIFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The EntityHistoryAPI provides UI-centric data models for understanding
   * the historic view of a battle space. The API draws heavily on the Entity
   * data model and Entity filter to form the core of its client contract.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns a page of history given a history query.
     * </pre>
     */
    default void listHistory(com.anduril.entityhistory.v1.ListHistoryRequest request,
        io.grpc.stub.StreamObserver<com.anduril.entityhistory.v1.ListHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListHistoryMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EntityHistoryAPI.
   * <pre>
   * The EntityHistoryAPI provides UI-centric data models for understanding
   * the historic view of a battle space. The API draws heavily on the Entity
   * data model and Entity filter to form the core of its client contract.
   * </pre>
   */
  public static abstract class EntityHistoryAPIImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EntityHistoryAPIGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EntityHistoryAPI.
   * <pre>
   * The EntityHistoryAPI provides UI-centric data models for understanding
   * the historic view of a battle space. The API draws heavily on the Entity
   * data model and Entity filter to form the core of its client contract.
   * </pre>
   */
  public static final class EntityHistoryAPIStub
      extends io.grpc.stub.AbstractAsyncStub<EntityHistoryAPIStub> {
    private EntityHistoryAPIStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EntityHistoryAPIStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EntityHistoryAPIStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a page of history given a history query.
     * </pre>
     */
    public void listHistory(com.anduril.entityhistory.v1.ListHistoryRequest request,
        io.grpc.stub.StreamObserver<com.anduril.entityhistory.v1.ListHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListHistoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EntityHistoryAPI.
   * <pre>
   * The EntityHistoryAPI provides UI-centric data models for understanding
   * the historic view of a battle space. The API draws heavily on the Entity
   * data model and Entity filter to form the core of its client contract.
   * </pre>
   */
  public static final class EntityHistoryAPIBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EntityHistoryAPIBlockingStub> {
    private EntityHistoryAPIBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EntityHistoryAPIBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EntityHistoryAPIBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a page of history given a history query.
     * </pre>
     */
    public com.anduril.entityhistory.v1.ListHistoryResponse listHistory(com.anduril.entityhistory.v1.ListHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListHistoryMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EntityHistoryAPI.
   * <pre>
   * The EntityHistoryAPI provides UI-centric data models for understanding
   * the historic view of a battle space. The API draws heavily on the Entity
   * data model and Entity filter to form the core of its client contract.
   * </pre>
   */
  public static final class EntityHistoryAPIFutureStub
      extends io.grpc.stub.AbstractFutureStub<EntityHistoryAPIFutureStub> {
    private EntityHistoryAPIFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EntityHistoryAPIFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EntityHistoryAPIFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a page of history given a history query.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.anduril.entityhistory.v1.ListHistoryResponse> listHistory(
        com.anduril.entityhistory.v1.ListHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListHistoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_HISTORY = 0;

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
        case METHODID_LIST_HISTORY:
          serviceImpl.listHistory((com.anduril.entityhistory.v1.ListHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.anduril.entityhistory.v1.ListHistoryResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getListHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.anduril.entityhistory.v1.ListHistoryRequest,
              com.anduril.entityhistory.v1.ListHistoryResponse>(
                service, METHODID_LIST_HISTORY)))
        .build();
  }

  private static abstract class EntityHistoryAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EntityHistoryAPIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.anduril.entityhistory.v1.EntityHistoryApiPubProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EntityHistoryAPI");
    }
  }

  private static final class EntityHistoryAPIFileDescriptorSupplier
      extends EntityHistoryAPIBaseDescriptorSupplier {
    EntityHistoryAPIFileDescriptorSupplier() {}
  }

  private static final class EntityHistoryAPIMethodDescriptorSupplier
      extends EntityHistoryAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EntityHistoryAPIMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EntityHistoryAPIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EntityHistoryAPIFileDescriptorSupplier())
              .addMethod(getListHistoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
