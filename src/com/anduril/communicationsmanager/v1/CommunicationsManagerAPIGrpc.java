package com.anduril.communicationsmanager.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Manages the policies for distribution of data via application of filters &amp; priorities.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.1)",
    comments = "Source: anduril/communicationsmanager/v1/communications_manager_api.pub.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CommunicationsManagerAPIGrpc {

  private CommunicationsManagerAPIGrpc() {}

  public static final java.lang.String SERVICE_NAME = "anduril.communicationsmanager.v1.CommunicationsManagerAPI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.anduril.communicationsmanager.v1.PutRuleRequest,
      com.anduril.communicationsmanager.v1.PutRuleResponse> getPutRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutRule",
      requestType = com.anduril.communicationsmanager.v1.PutRuleRequest.class,
      responseType = com.anduril.communicationsmanager.v1.PutRuleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.anduril.communicationsmanager.v1.PutRuleRequest,
      com.anduril.communicationsmanager.v1.PutRuleResponse> getPutRuleMethod() {
    io.grpc.MethodDescriptor<com.anduril.communicationsmanager.v1.PutRuleRequest, com.anduril.communicationsmanager.v1.PutRuleResponse> getPutRuleMethod;
    if ((getPutRuleMethod = CommunicationsManagerAPIGrpc.getPutRuleMethod) == null) {
      synchronized (CommunicationsManagerAPIGrpc.class) {
        if ((getPutRuleMethod = CommunicationsManagerAPIGrpc.getPutRuleMethod) == null) {
          CommunicationsManagerAPIGrpc.getPutRuleMethod = getPutRuleMethod =
              io.grpc.MethodDescriptor.<com.anduril.communicationsmanager.v1.PutRuleRequest, com.anduril.communicationsmanager.v1.PutRuleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.communicationsmanager.v1.PutRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.communicationsmanager.v1.PutRuleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommunicationsManagerAPIMethodDescriptorSupplier("PutRule"))
              .build();
        }
      }
    }
    return getPutRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.anduril.communicationsmanager.v1.StreamRulesRequest,
      com.anduril.communicationsmanager.v1.StreamRulesResponse> getStreamRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamRules",
      requestType = com.anduril.communicationsmanager.v1.StreamRulesRequest.class,
      responseType = com.anduril.communicationsmanager.v1.StreamRulesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.anduril.communicationsmanager.v1.StreamRulesRequest,
      com.anduril.communicationsmanager.v1.StreamRulesResponse> getStreamRulesMethod() {
    io.grpc.MethodDescriptor<com.anduril.communicationsmanager.v1.StreamRulesRequest, com.anduril.communicationsmanager.v1.StreamRulesResponse> getStreamRulesMethod;
    if ((getStreamRulesMethod = CommunicationsManagerAPIGrpc.getStreamRulesMethod) == null) {
      synchronized (CommunicationsManagerAPIGrpc.class) {
        if ((getStreamRulesMethod = CommunicationsManagerAPIGrpc.getStreamRulesMethod) == null) {
          CommunicationsManagerAPIGrpc.getStreamRulesMethod = getStreamRulesMethod =
              io.grpc.MethodDescriptor.<com.anduril.communicationsmanager.v1.StreamRulesRequest, com.anduril.communicationsmanager.v1.StreamRulesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.communicationsmanager.v1.StreamRulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.communicationsmanager.v1.StreamRulesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommunicationsManagerAPIMethodDescriptorSupplier("StreamRules"))
              .build();
        }
      }
    }
    return getStreamRulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.anduril.communicationsmanager.v1.DeleteRuleRequest,
      com.anduril.communicationsmanager.v1.DeleteRuleResponse> getDeleteRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRule",
      requestType = com.anduril.communicationsmanager.v1.DeleteRuleRequest.class,
      responseType = com.anduril.communicationsmanager.v1.DeleteRuleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.anduril.communicationsmanager.v1.DeleteRuleRequest,
      com.anduril.communicationsmanager.v1.DeleteRuleResponse> getDeleteRuleMethod() {
    io.grpc.MethodDescriptor<com.anduril.communicationsmanager.v1.DeleteRuleRequest, com.anduril.communicationsmanager.v1.DeleteRuleResponse> getDeleteRuleMethod;
    if ((getDeleteRuleMethod = CommunicationsManagerAPIGrpc.getDeleteRuleMethod) == null) {
      synchronized (CommunicationsManagerAPIGrpc.class) {
        if ((getDeleteRuleMethod = CommunicationsManagerAPIGrpc.getDeleteRuleMethod) == null) {
          CommunicationsManagerAPIGrpc.getDeleteRuleMethod = getDeleteRuleMethod =
              io.grpc.MethodDescriptor.<com.anduril.communicationsmanager.v1.DeleteRuleRequest, com.anduril.communicationsmanager.v1.DeleteRuleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.communicationsmanager.v1.DeleteRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.communicationsmanager.v1.DeleteRuleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommunicationsManagerAPIMethodDescriptorSupplier("DeleteRule"))
              .build();
        }
      }
    }
    return getDeleteRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.anduril.communicationsmanager.v1.StreamIntegrationsRequest,
      com.anduril.communicationsmanager.v1.StreamIntegrationsResponse> getStreamIntegrationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamIntegrations",
      requestType = com.anduril.communicationsmanager.v1.StreamIntegrationsRequest.class,
      responseType = com.anduril.communicationsmanager.v1.StreamIntegrationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.anduril.communicationsmanager.v1.StreamIntegrationsRequest,
      com.anduril.communicationsmanager.v1.StreamIntegrationsResponse> getStreamIntegrationsMethod() {
    io.grpc.MethodDescriptor<com.anduril.communicationsmanager.v1.StreamIntegrationsRequest, com.anduril.communicationsmanager.v1.StreamIntegrationsResponse> getStreamIntegrationsMethod;
    if ((getStreamIntegrationsMethod = CommunicationsManagerAPIGrpc.getStreamIntegrationsMethod) == null) {
      synchronized (CommunicationsManagerAPIGrpc.class) {
        if ((getStreamIntegrationsMethod = CommunicationsManagerAPIGrpc.getStreamIntegrationsMethod) == null) {
          CommunicationsManagerAPIGrpc.getStreamIntegrationsMethod = getStreamIntegrationsMethod =
              io.grpc.MethodDescriptor.<com.anduril.communicationsmanager.v1.StreamIntegrationsRequest, com.anduril.communicationsmanager.v1.StreamIntegrationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamIntegrations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.communicationsmanager.v1.StreamIntegrationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.communicationsmanager.v1.StreamIntegrationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommunicationsManagerAPIMethodDescriptorSupplier("StreamIntegrations"))
              .build();
        }
      }
    }
    return getStreamIntegrationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.anduril.communicationsmanager.v1.GetIntegrationsRequest,
      com.anduril.communicationsmanager.v1.GetIntegrationsResponse> getGetIntegrationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIntegrations",
      requestType = com.anduril.communicationsmanager.v1.GetIntegrationsRequest.class,
      responseType = com.anduril.communicationsmanager.v1.GetIntegrationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.anduril.communicationsmanager.v1.GetIntegrationsRequest,
      com.anduril.communicationsmanager.v1.GetIntegrationsResponse> getGetIntegrationsMethod() {
    io.grpc.MethodDescriptor<com.anduril.communicationsmanager.v1.GetIntegrationsRequest, com.anduril.communicationsmanager.v1.GetIntegrationsResponse> getGetIntegrationsMethod;
    if ((getGetIntegrationsMethod = CommunicationsManagerAPIGrpc.getGetIntegrationsMethod) == null) {
      synchronized (CommunicationsManagerAPIGrpc.class) {
        if ((getGetIntegrationsMethod = CommunicationsManagerAPIGrpc.getGetIntegrationsMethod) == null) {
          CommunicationsManagerAPIGrpc.getGetIntegrationsMethod = getGetIntegrationsMethod =
              io.grpc.MethodDescriptor.<com.anduril.communicationsmanager.v1.GetIntegrationsRequest, com.anduril.communicationsmanager.v1.GetIntegrationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIntegrations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.communicationsmanager.v1.GetIntegrationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.communicationsmanager.v1.GetIntegrationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommunicationsManagerAPIMethodDescriptorSupplier("GetIntegrations"))
              .build();
        }
      }
    }
    return getGetIntegrationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.anduril.communicationsmanager.v1.IntegrationHealthUpdateRequest,
      com.anduril.communicationsmanager.v1.IntegrationHealthUpdateResponse> getIntegrationHealthUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IntegrationHealthUpdate",
      requestType = com.anduril.communicationsmanager.v1.IntegrationHealthUpdateRequest.class,
      responseType = com.anduril.communicationsmanager.v1.IntegrationHealthUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.anduril.communicationsmanager.v1.IntegrationHealthUpdateRequest,
      com.anduril.communicationsmanager.v1.IntegrationHealthUpdateResponse> getIntegrationHealthUpdateMethod() {
    io.grpc.MethodDescriptor<com.anduril.communicationsmanager.v1.IntegrationHealthUpdateRequest, com.anduril.communicationsmanager.v1.IntegrationHealthUpdateResponse> getIntegrationHealthUpdateMethod;
    if ((getIntegrationHealthUpdateMethod = CommunicationsManagerAPIGrpc.getIntegrationHealthUpdateMethod) == null) {
      synchronized (CommunicationsManagerAPIGrpc.class) {
        if ((getIntegrationHealthUpdateMethod = CommunicationsManagerAPIGrpc.getIntegrationHealthUpdateMethod) == null) {
          CommunicationsManagerAPIGrpc.getIntegrationHealthUpdateMethod = getIntegrationHealthUpdateMethod =
              io.grpc.MethodDescriptor.<com.anduril.communicationsmanager.v1.IntegrationHealthUpdateRequest, com.anduril.communicationsmanager.v1.IntegrationHealthUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IntegrationHealthUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.communicationsmanager.v1.IntegrationHealthUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.communicationsmanager.v1.IntegrationHealthUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommunicationsManagerAPIMethodDescriptorSupplier("IntegrationHealthUpdate"))
              .build();
        }
      }
    }
    return getIntegrationHealthUpdateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommunicationsManagerAPIStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommunicationsManagerAPIStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommunicationsManagerAPIStub>() {
        @java.lang.Override
        public CommunicationsManagerAPIStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommunicationsManagerAPIStub(channel, callOptions);
        }
      };
    return CommunicationsManagerAPIStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommunicationsManagerAPIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommunicationsManagerAPIBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommunicationsManagerAPIBlockingStub>() {
        @java.lang.Override
        public CommunicationsManagerAPIBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommunicationsManagerAPIBlockingStub(channel, callOptions);
        }
      };
    return CommunicationsManagerAPIBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommunicationsManagerAPIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommunicationsManagerAPIFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommunicationsManagerAPIFutureStub>() {
        @java.lang.Override
        public CommunicationsManagerAPIFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommunicationsManagerAPIFutureStub(channel, callOptions);
        }
      };
    return CommunicationsManagerAPIFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Manages the policies for distribution of data via application of filters &amp; priorities.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Puts a rule. Rules are distributed to all nodes in the mesh.
     * </pre>
     */
    default void putRule(com.anduril.communicationsmanager.v1.PutRuleRequest request,
        io.grpc.stub.StreamObserver<com.anduril.communicationsmanager.v1.PutRuleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutRuleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Streams all rules available to this distribution manager.
     * </pre>
     */
    default void streamRules(com.anduril.communicationsmanager.v1.StreamRulesRequest request,
        io.grpc.stub.StreamObserver<com.anduril.communicationsmanager.v1.StreamRulesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamRulesMethod(), responseObserver);
    }

    /**
     */
    default void deleteRule(com.anduril.communicationsmanager.v1.DeleteRuleRequest request,
        io.grpc.stub.StreamObserver<com.anduril.communicationsmanager.v1.DeleteRuleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRuleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stream a list of integrations registered with the system. Supports various
     * filters to constrain to specific nodes.
     * </pre>
     */
    default void streamIntegrations(com.anduril.communicationsmanager.v1.StreamIntegrationsRequest request,
        io.grpc.stub.StreamObserver<com.anduril.communicationsmanager.v1.StreamIntegrationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamIntegrationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: Use ListIntegrations instead.
     * </pre>
     */
    default void getIntegrations(com.anduril.communicationsmanager.v1.GetIntegrationsRequest request,
        io.grpc.stub.StreamObserver<com.anduril.communicationsmanager.v1.GetIntegrationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIntegrationsMethod(), responseObserver);
    }

    /**
     */
    default void integrationHealthUpdate(com.anduril.communicationsmanager.v1.IntegrationHealthUpdateRequest request,
        io.grpc.stub.StreamObserver<com.anduril.communicationsmanager.v1.IntegrationHealthUpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIntegrationHealthUpdateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CommunicationsManagerAPI.
   * <pre>
   * Manages the policies for distribution of data via application of filters &amp; priorities.
   * </pre>
   */
  public static abstract class CommunicationsManagerAPIImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CommunicationsManagerAPIGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CommunicationsManagerAPI.
   * <pre>
   * Manages the policies for distribution of data via application of filters &amp; priorities.
   * </pre>
   */
  public static final class CommunicationsManagerAPIStub
      extends io.grpc.stub.AbstractAsyncStub<CommunicationsManagerAPIStub> {
    private CommunicationsManagerAPIStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommunicationsManagerAPIStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommunicationsManagerAPIStub(channel, callOptions);
    }

    /**
     * <pre>
     * Puts a rule. Rules are distributed to all nodes in the mesh.
     * </pre>
     */
    public void putRule(com.anduril.communicationsmanager.v1.PutRuleRequest request,
        io.grpc.stub.StreamObserver<com.anduril.communicationsmanager.v1.PutRuleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Streams all rules available to this distribution manager.
     * </pre>
     */
    public void streamRules(com.anduril.communicationsmanager.v1.StreamRulesRequest request,
        io.grpc.stub.StreamObserver<com.anduril.communicationsmanager.v1.StreamRulesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamRulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRule(com.anduril.communicationsmanager.v1.DeleteRuleRequest request,
        io.grpc.stub.StreamObserver<com.anduril.communicationsmanager.v1.DeleteRuleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stream a list of integrations registered with the system. Supports various
     * filters to constrain to specific nodes.
     * </pre>
     */
    public void streamIntegrations(com.anduril.communicationsmanager.v1.StreamIntegrationsRequest request,
        io.grpc.stub.StreamObserver<com.anduril.communicationsmanager.v1.StreamIntegrationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamIntegrationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: Use ListIntegrations instead.
     * </pre>
     */
    public void getIntegrations(com.anduril.communicationsmanager.v1.GetIntegrationsRequest request,
        io.grpc.stub.StreamObserver<com.anduril.communicationsmanager.v1.GetIntegrationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIntegrationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void integrationHealthUpdate(com.anduril.communicationsmanager.v1.IntegrationHealthUpdateRequest request,
        io.grpc.stub.StreamObserver<com.anduril.communicationsmanager.v1.IntegrationHealthUpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIntegrationHealthUpdateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CommunicationsManagerAPI.
   * <pre>
   * Manages the policies for distribution of data via application of filters &amp; priorities.
   * </pre>
   */
  public static final class CommunicationsManagerAPIBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CommunicationsManagerAPIBlockingStub> {
    private CommunicationsManagerAPIBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommunicationsManagerAPIBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommunicationsManagerAPIBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Puts a rule. Rules are distributed to all nodes in the mesh.
     * </pre>
     */
    public com.anduril.communicationsmanager.v1.PutRuleResponse putRule(com.anduril.communicationsmanager.v1.PutRuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutRuleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Streams all rules available to this distribution manager.
     * </pre>
     */
    public java.util.Iterator<com.anduril.communicationsmanager.v1.StreamRulesResponse> streamRules(
        com.anduril.communicationsmanager.v1.StreamRulesRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamRulesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.anduril.communicationsmanager.v1.DeleteRuleResponse deleteRule(com.anduril.communicationsmanager.v1.DeleteRuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRuleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stream a list of integrations registered with the system. Supports various
     * filters to constrain to specific nodes.
     * </pre>
     */
    public java.util.Iterator<com.anduril.communicationsmanager.v1.StreamIntegrationsResponse> streamIntegrations(
        com.anduril.communicationsmanager.v1.StreamIntegrationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamIntegrationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: Use ListIntegrations instead.
     * </pre>
     */
    public com.anduril.communicationsmanager.v1.GetIntegrationsResponse getIntegrations(com.anduril.communicationsmanager.v1.GetIntegrationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIntegrationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.anduril.communicationsmanager.v1.IntegrationHealthUpdateResponse integrationHealthUpdate(com.anduril.communicationsmanager.v1.IntegrationHealthUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIntegrationHealthUpdateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CommunicationsManagerAPI.
   * <pre>
   * Manages the policies for distribution of data via application of filters &amp; priorities.
   * </pre>
   */
  public static final class CommunicationsManagerAPIFutureStub
      extends io.grpc.stub.AbstractFutureStub<CommunicationsManagerAPIFutureStub> {
    private CommunicationsManagerAPIFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommunicationsManagerAPIFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommunicationsManagerAPIFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Puts a rule. Rules are distributed to all nodes in the mesh.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.anduril.communicationsmanager.v1.PutRuleResponse> putRule(
        com.anduril.communicationsmanager.v1.PutRuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutRuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.anduril.communicationsmanager.v1.DeleteRuleResponse> deleteRule(
        com.anduril.communicationsmanager.v1.DeleteRuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRuleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: Use ListIntegrations instead.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.anduril.communicationsmanager.v1.GetIntegrationsResponse> getIntegrations(
        com.anduril.communicationsmanager.v1.GetIntegrationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIntegrationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.anduril.communicationsmanager.v1.IntegrationHealthUpdateResponse> integrationHealthUpdate(
        com.anduril.communicationsmanager.v1.IntegrationHealthUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIntegrationHealthUpdateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUT_RULE = 0;
  private static final int METHODID_STREAM_RULES = 1;
  private static final int METHODID_DELETE_RULE = 2;
  private static final int METHODID_STREAM_INTEGRATIONS = 3;
  private static final int METHODID_GET_INTEGRATIONS = 4;
  private static final int METHODID_INTEGRATION_HEALTH_UPDATE = 5;

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
        case METHODID_PUT_RULE:
          serviceImpl.putRule((com.anduril.communicationsmanager.v1.PutRuleRequest) request,
              (io.grpc.stub.StreamObserver<com.anduril.communicationsmanager.v1.PutRuleResponse>) responseObserver);
          break;
        case METHODID_STREAM_RULES:
          serviceImpl.streamRules((com.anduril.communicationsmanager.v1.StreamRulesRequest) request,
              (io.grpc.stub.StreamObserver<com.anduril.communicationsmanager.v1.StreamRulesResponse>) responseObserver);
          break;
        case METHODID_DELETE_RULE:
          serviceImpl.deleteRule((com.anduril.communicationsmanager.v1.DeleteRuleRequest) request,
              (io.grpc.stub.StreamObserver<com.anduril.communicationsmanager.v1.DeleteRuleResponse>) responseObserver);
          break;
        case METHODID_STREAM_INTEGRATIONS:
          serviceImpl.streamIntegrations((com.anduril.communicationsmanager.v1.StreamIntegrationsRequest) request,
              (io.grpc.stub.StreamObserver<com.anduril.communicationsmanager.v1.StreamIntegrationsResponse>) responseObserver);
          break;
        case METHODID_GET_INTEGRATIONS:
          serviceImpl.getIntegrations((com.anduril.communicationsmanager.v1.GetIntegrationsRequest) request,
              (io.grpc.stub.StreamObserver<com.anduril.communicationsmanager.v1.GetIntegrationsResponse>) responseObserver);
          break;
        case METHODID_INTEGRATION_HEALTH_UPDATE:
          serviceImpl.integrationHealthUpdate((com.anduril.communicationsmanager.v1.IntegrationHealthUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.anduril.communicationsmanager.v1.IntegrationHealthUpdateResponse>) responseObserver);
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
          getPutRuleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.anduril.communicationsmanager.v1.PutRuleRequest,
              com.anduril.communicationsmanager.v1.PutRuleResponse>(
                service, METHODID_PUT_RULE)))
        .addMethod(
          getStreamRulesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.anduril.communicationsmanager.v1.StreamRulesRequest,
              com.anduril.communicationsmanager.v1.StreamRulesResponse>(
                service, METHODID_STREAM_RULES)))
        .addMethod(
          getDeleteRuleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.anduril.communicationsmanager.v1.DeleteRuleRequest,
              com.anduril.communicationsmanager.v1.DeleteRuleResponse>(
                service, METHODID_DELETE_RULE)))
        .addMethod(
          getStreamIntegrationsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.anduril.communicationsmanager.v1.StreamIntegrationsRequest,
              com.anduril.communicationsmanager.v1.StreamIntegrationsResponse>(
                service, METHODID_STREAM_INTEGRATIONS)))
        .addMethod(
          getGetIntegrationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.anduril.communicationsmanager.v1.GetIntegrationsRequest,
              com.anduril.communicationsmanager.v1.GetIntegrationsResponse>(
                service, METHODID_GET_INTEGRATIONS)))
        .addMethod(
          getIntegrationHealthUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.anduril.communicationsmanager.v1.IntegrationHealthUpdateRequest,
              com.anduril.communicationsmanager.v1.IntegrationHealthUpdateResponse>(
                service, METHODID_INTEGRATION_HEALTH_UPDATE)))
        .build();
  }

  private static abstract class CommunicationsManagerAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommunicationsManagerAPIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.anduril.communicationsmanager.v1.CommunicationsManagerApiPubProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CommunicationsManagerAPI");
    }
  }

  private static final class CommunicationsManagerAPIFileDescriptorSupplier
      extends CommunicationsManagerAPIBaseDescriptorSupplier {
    CommunicationsManagerAPIFileDescriptorSupplier() {}
  }

  private static final class CommunicationsManagerAPIMethodDescriptorSupplier
      extends CommunicationsManagerAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CommunicationsManagerAPIMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CommunicationsManagerAPIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommunicationsManagerAPIFileDescriptorSupplier())
              .addMethod(getPutRuleMethod())
              .addMethod(getStreamRulesMethod())
              .addMethod(getDeleteRuleMethod())
              .addMethod(getStreamIntegrationsMethod())
              .addMethod(getGetIntegrationsMethod())
              .addMethod(getIntegrationHealthUpdateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
