package com.anduril.auth.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.1)",
    comments = "Source: anduril/auth/v2/idp.pub.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class IdpsGrpc {

  private IdpsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "anduril.auth.v2.Idps";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.anduril.auth.v2.GetSSOURLRequest,
      com.anduril.auth.v2.GetSSOURLResponse> getGetSSOURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSSOURL",
      requestType = com.anduril.auth.v2.GetSSOURLRequest.class,
      responseType = com.anduril.auth.v2.GetSSOURLResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.anduril.auth.v2.GetSSOURLRequest,
      com.anduril.auth.v2.GetSSOURLResponse> getGetSSOURLMethod() {
    io.grpc.MethodDescriptor<com.anduril.auth.v2.GetSSOURLRequest, com.anduril.auth.v2.GetSSOURLResponse> getGetSSOURLMethod;
    if ((getGetSSOURLMethod = IdpsGrpc.getGetSSOURLMethod) == null) {
      synchronized (IdpsGrpc.class) {
        if ((getGetSSOURLMethod = IdpsGrpc.getGetSSOURLMethod) == null) {
          IdpsGrpc.getGetSSOURLMethod = getGetSSOURLMethod =
              io.grpc.MethodDescriptor.<com.anduril.auth.v2.GetSSOURLRequest, com.anduril.auth.v2.GetSSOURLResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSSOURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.auth.v2.GetSSOURLRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.auth.v2.GetSSOURLResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdpsMethodDescriptorSupplier("GetSSOURL"))
              .build();
        }
      }
    }
    return getGetSSOURLMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IdpsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdpsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdpsStub>() {
        @java.lang.Override
        public IdpsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdpsStub(channel, callOptions);
        }
      };
    return IdpsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IdpsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdpsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdpsBlockingStub>() {
        @java.lang.Override
        public IdpsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdpsBlockingStub(channel, callOptions);
        }
      };
    return IdpsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IdpsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdpsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdpsFutureStub>() {
        @java.lang.Override
        public IdpsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdpsFutureStub(channel, callOptions);
        }
      };
    return IdpsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * GetSSOURL returns an identity provider's single sign on (SSO) URL which a user should be redirected to
     * authenticate. If no IDP can be located for the email's domain then a NotFound error is returned.
     * </pre>
     */
    default void getSSOURL(com.anduril.auth.v2.GetSSOURLRequest request,
        io.grpc.stub.StreamObserver<com.anduril.auth.v2.GetSSOURLResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSSOURLMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Idps.
   */
  public static abstract class IdpsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return IdpsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Idps.
   */
  public static final class IdpsStub
      extends io.grpc.stub.AbstractAsyncStub<IdpsStub> {
    private IdpsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdpsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdpsStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetSSOURL returns an identity provider's single sign on (SSO) URL which a user should be redirected to
     * authenticate. If no IDP can be located for the email's domain then a NotFound error is returned.
     * </pre>
     */
    public void getSSOURL(com.anduril.auth.v2.GetSSOURLRequest request,
        io.grpc.stub.StreamObserver<com.anduril.auth.v2.GetSSOURLResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSSOURLMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Idps.
   */
  public static final class IdpsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<IdpsBlockingStub> {
    private IdpsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdpsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdpsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetSSOURL returns an identity provider's single sign on (SSO) URL which a user should be redirected to
     * authenticate. If no IDP can be located for the email's domain then a NotFound error is returned.
     * </pre>
     */
    public com.anduril.auth.v2.GetSSOURLResponse getSSOURL(com.anduril.auth.v2.GetSSOURLRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSSOURLMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Idps.
   */
  public static final class IdpsFutureStub
      extends io.grpc.stub.AbstractFutureStub<IdpsFutureStub> {
    private IdpsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdpsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdpsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetSSOURL returns an identity provider's single sign on (SSO) URL which a user should be redirected to
     * authenticate. If no IDP can be located for the email's domain then a NotFound error is returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.anduril.auth.v2.GetSSOURLResponse> getSSOURL(
        com.anduril.auth.v2.GetSSOURLRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSSOURLMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SSOURL = 0;

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
        case METHODID_GET_SSOURL:
          serviceImpl.getSSOURL((com.anduril.auth.v2.GetSSOURLRequest) request,
              (io.grpc.stub.StreamObserver<com.anduril.auth.v2.GetSSOURLResponse>) responseObserver);
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
          getGetSSOURLMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.anduril.auth.v2.GetSSOURLRequest,
              com.anduril.auth.v2.GetSSOURLResponse>(
                service, METHODID_GET_SSOURL)))
        .build();
  }

  private static abstract class IdpsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IdpsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.anduril.auth.v2.IdpPubProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Idps");
    }
  }

  private static final class IdpsFileDescriptorSupplier
      extends IdpsBaseDescriptorSupplier {
    IdpsFileDescriptorSupplier() {}
  }

  private static final class IdpsMethodDescriptorSupplier
      extends IdpsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    IdpsMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (IdpsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IdpsFileDescriptorSupplier())
              .addMethod(getGetSSOURLMethod())
              .build();
        }
      }
    }
    return result;
  }
}
