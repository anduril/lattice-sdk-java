package com.anduril.auth.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.1)",
    comments = "Source: anduril/auth/v2/tokens.pub.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TokensGrpc {

  private TokensGrpc() {}

  public static final java.lang.String SERVICE_NAME = "anduril.auth.v2.Tokens";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.anduril.auth.v2.RefreshOidcTokensRequest,
      com.anduril.auth.v2.RefreshOidcTokensResponse> getRefreshOidcTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RefreshOidcTokens",
      requestType = com.anduril.auth.v2.RefreshOidcTokensRequest.class,
      responseType = com.anduril.auth.v2.RefreshOidcTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.anduril.auth.v2.RefreshOidcTokensRequest,
      com.anduril.auth.v2.RefreshOidcTokensResponse> getRefreshOidcTokensMethod() {
    io.grpc.MethodDescriptor<com.anduril.auth.v2.RefreshOidcTokensRequest, com.anduril.auth.v2.RefreshOidcTokensResponse> getRefreshOidcTokensMethod;
    if ((getRefreshOidcTokensMethod = TokensGrpc.getRefreshOidcTokensMethod) == null) {
      synchronized (TokensGrpc.class) {
        if ((getRefreshOidcTokensMethod = TokensGrpc.getRefreshOidcTokensMethod) == null) {
          TokensGrpc.getRefreshOidcTokensMethod = getRefreshOidcTokensMethod =
              io.grpc.MethodDescriptor.<com.anduril.auth.v2.RefreshOidcTokensRequest, com.anduril.auth.v2.RefreshOidcTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RefreshOidcTokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.auth.v2.RefreshOidcTokensRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.auth.v2.RefreshOidcTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TokensMethodDescriptorSupplier("RefreshOidcTokens"))
              .build();
        }
      }
    }
    return getRefreshOidcTokensMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TokensStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TokensStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TokensStub>() {
        @java.lang.Override
        public TokensStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TokensStub(channel, callOptions);
        }
      };
    return TokensStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TokensBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TokensBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TokensBlockingStub>() {
        @java.lang.Override
        public TokensBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TokensBlockingStub(channel, callOptions);
        }
      };
    return TokensBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TokensFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TokensFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TokensFutureStub>() {
        @java.lang.Override
        public TokensFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TokensFutureStub(channel, callOptions);
        }
      };
    return TokensFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * RefreshSessionToken attempts to retrieve new OIDC tokens from a user's refresh token. May also return a new
     * refresh_token with which future RefreshOidcTokens requests should use
     * </pre>
     */
    default void refreshOidcTokens(com.anduril.auth.v2.RefreshOidcTokensRequest request,
        io.grpc.stub.StreamObserver<com.anduril.auth.v2.RefreshOidcTokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRefreshOidcTokensMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Tokens.
   */
  public static abstract class TokensImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TokensGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Tokens.
   */
  public static final class TokensStub
      extends io.grpc.stub.AbstractAsyncStub<TokensStub> {
    private TokensStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TokensStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TokensStub(channel, callOptions);
    }

    /**
     * <pre>
     * RefreshSessionToken attempts to retrieve new OIDC tokens from a user's refresh token. May also return a new
     * refresh_token with which future RefreshOidcTokens requests should use
     * </pre>
     */
    public void refreshOidcTokens(com.anduril.auth.v2.RefreshOidcTokensRequest request,
        io.grpc.stub.StreamObserver<com.anduril.auth.v2.RefreshOidcTokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRefreshOidcTokensMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Tokens.
   */
  public static final class TokensBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TokensBlockingStub> {
    private TokensBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TokensBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TokensBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RefreshSessionToken attempts to retrieve new OIDC tokens from a user's refresh token. May also return a new
     * refresh_token with which future RefreshOidcTokens requests should use
     * </pre>
     */
    public com.anduril.auth.v2.RefreshOidcTokensResponse refreshOidcTokens(com.anduril.auth.v2.RefreshOidcTokensRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRefreshOidcTokensMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Tokens.
   */
  public static final class TokensFutureStub
      extends io.grpc.stub.AbstractFutureStub<TokensFutureStub> {
    private TokensFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TokensFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TokensFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RefreshSessionToken attempts to retrieve new OIDC tokens from a user's refresh token. May also return a new
     * refresh_token with which future RefreshOidcTokens requests should use
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.anduril.auth.v2.RefreshOidcTokensResponse> refreshOidcTokens(
        com.anduril.auth.v2.RefreshOidcTokensRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRefreshOidcTokensMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REFRESH_OIDC_TOKENS = 0;

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
        case METHODID_REFRESH_OIDC_TOKENS:
          serviceImpl.refreshOidcTokens((com.anduril.auth.v2.RefreshOidcTokensRequest) request,
              (io.grpc.stub.StreamObserver<com.anduril.auth.v2.RefreshOidcTokensResponse>) responseObserver);
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
          getRefreshOidcTokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.anduril.auth.v2.RefreshOidcTokensRequest,
              com.anduril.auth.v2.RefreshOidcTokensResponse>(
                service, METHODID_REFRESH_OIDC_TOKENS)))
        .build();
  }

  private static abstract class TokensBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TokensBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.anduril.auth.v2.TokensPubProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Tokens");
    }
  }

  private static final class TokensFileDescriptorSupplier
      extends TokensBaseDescriptorSupplier {
    TokensFileDescriptorSupplier() {}
  }

  private static final class TokensMethodDescriptorSupplier
      extends TokensBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TokensMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TokensGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TokensFileDescriptorSupplier())
              .addMethod(getRefreshOidcTokensMethod())
              .build();
        }
      }
    }
    return result;
  }
}
