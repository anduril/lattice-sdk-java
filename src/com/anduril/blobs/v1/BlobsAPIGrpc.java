package com.anduril.blobs.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A general purpose blob storage service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.1)",
    comments = "Source: anduril/blobs/v1/blobs_api.pub.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BlobsAPIGrpc {

  private BlobsAPIGrpc() {}

  public static final java.lang.String SERVICE_NAME = "anduril.blobs.v1.BlobsAPI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.anduril.blobs.v1.CreateBlobRequest,
      com.anduril.blobs.v1.CreateBlobResponse> getCreateBlobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBlob",
      requestType = com.anduril.blobs.v1.CreateBlobRequest.class,
      responseType = com.anduril.blobs.v1.CreateBlobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.anduril.blobs.v1.CreateBlobRequest,
      com.anduril.blobs.v1.CreateBlobResponse> getCreateBlobMethod() {
    io.grpc.MethodDescriptor<com.anduril.blobs.v1.CreateBlobRequest, com.anduril.blobs.v1.CreateBlobResponse> getCreateBlobMethod;
    if ((getCreateBlobMethod = BlobsAPIGrpc.getCreateBlobMethod) == null) {
      synchronized (BlobsAPIGrpc.class) {
        if ((getCreateBlobMethod = BlobsAPIGrpc.getCreateBlobMethod) == null) {
          BlobsAPIGrpc.getCreateBlobMethod = getCreateBlobMethod =
              io.grpc.MethodDescriptor.<com.anduril.blobs.v1.CreateBlobRequest, com.anduril.blobs.v1.CreateBlobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBlob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.blobs.v1.CreateBlobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.blobs.v1.CreateBlobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlobsAPIMethodDescriptorSupplier("CreateBlob"))
              .build();
        }
      }
    }
    return getCreateBlobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.anduril.blobs.v1.CreateBlobChunkedRequest,
      com.anduril.blobs.v1.CreateBlobChunkedResponse> getCreateBlobChunkedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBlobChunked",
      requestType = com.anduril.blobs.v1.CreateBlobChunkedRequest.class,
      responseType = com.anduril.blobs.v1.CreateBlobChunkedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.anduril.blobs.v1.CreateBlobChunkedRequest,
      com.anduril.blobs.v1.CreateBlobChunkedResponse> getCreateBlobChunkedMethod() {
    io.grpc.MethodDescriptor<com.anduril.blobs.v1.CreateBlobChunkedRequest, com.anduril.blobs.v1.CreateBlobChunkedResponse> getCreateBlobChunkedMethod;
    if ((getCreateBlobChunkedMethod = BlobsAPIGrpc.getCreateBlobChunkedMethod) == null) {
      synchronized (BlobsAPIGrpc.class) {
        if ((getCreateBlobChunkedMethod = BlobsAPIGrpc.getCreateBlobChunkedMethod) == null) {
          BlobsAPIGrpc.getCreateBlobChunkedMethod = getCreateBlobChunkedMethod =
              io.grpc.MethodDescriptor.<com.anduril.blobs.v1.CreateBlobChunkedRequest, com.anduril.blobs.v1.CreateBlobChunkedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBlobChunked"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.blobs.v1.CreateBlobChunkedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.blobs.v1.CreateBlobChunkedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlobsAPIMethodDescriptorSupplier("CreateBlobChunked"))
              .build();
        }
      }
    }
    return getCreateBlobChunkedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.anduril.blobs.v1.GetBlobRequest,
      com.anduril.blobs.v1.GetBlobResponse> getGetBlobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlob",
      requestType = com.anduril.blobs.v1.GetBlobRequest.class,
      responseType = com.anduril.blobs.v1.GetBlobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.anduril.blobs.v1.GetBlobRequest,
      com.anduril.blobs.v1.GetBlobResponse> getGetBlobMethod() {
    io.grpc.MethodDescriptor<com.anduril.blobs.v1.GetBlobRequest, com.anduril.blobs.v1.GetBlobResponse> getGetBlobMethod;
    if ((getGetBlobMethod = BlobsAPIGrpc.getGetBlobMethod) == null) {
      synchronized (BlobsAPIGrpc.class) {
        if ((getGetBlobMethod = BlobsAPIGrpc.getGetBlobMethod) == null) {
          BlobsAPIGrpc.getGetBlobMethod = getGetBlobMethod =
              io.grpc.MethodDescriptor.<com.anduril.blobs.v1.GetBlobRequest, com.anduril.blobs.v1.GetBlobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.blobs.v1.GetBlobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.blobs.v1.GetBlobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlobsAPIMethodDescriptorSupplier("GetBlob"))
              .build();
        }
      }
    }
    return getGetBlobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.anduril.blobs.v1.HeadBlobRequest,
      com.anduril.blobs.v1.HeadBlobResponse> getHeadBlobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HeadBlob",
      requestType = com.anduril.blobs.v1.HeadBlobRequest.class,
      responseType = com.anduril.blobs.v1.HeadBlobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.anduril.blobs.v1.HeadBlobRequest,
      com.anduril.blobs.v1.HeadBlobResponse> getHeadBlobMethod() {
    io.grpc.MethodDescriptor<com.anduril.blobs.v1.HeadBlobRequest, com.anduril.blobs.v1.HeadBlobResponse> getHeadBlobMethod;
    if ((getHeadBlobMethod = BlobsAPIGrpc.getHeadBlobMethod) == null) {
      synchronized (BlobsAPIGrpc.class) {
        if ((getHeadBlobMethod = BlobsAPIGrpc.getHeadBlobMethod) == null) {
          BlobsAPIGrpc.getHeadBlobMethod = getHeadBlobMethod =
              io.grpc.MethodDescriptor.<com.anduril.blobs.v1.HeadBlobRequest, com.anduril.blobs.v1.HeadBlobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HeadBlob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.blobs.v1.HeadBlobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.blobs.v1.HeadBlobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlobsAPIMethodDescriptorSupplier("HeadBlob"))
              .build();
        }
      }
    }
    return getHeadBlobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.anduril.blobs.v1.StreamBlobMetadataRequest,
      com.anduril.blobs.v1.StreamBlobMetadataResponse> getStreamBlobMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamBlobMetadata",
      requestType = com.anduril.blobs.v1.StreamBlobMetadataRequest.class,
      responseType = com.anduril.blobs.v1.StreamBlobMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.anduril.blobs.v1.StreamBlobMetadataRequest,
      com.anduril.blobs.v1.StreamBlobMetadataResponse> getStreamBlobMetadataMethod() {
    io.grpc.MethodDescriptor<com.anduril.blobs.v1.StreamBlobMetadataRequest, com.anduril.blobs.v1.StreamBlobMetadataResponse> getStreamBlobMetadataMethod;
    if ((getStreamBlobMetadataMethod = BlobsAPIGrpc.getStreamBlobMetadataMethod) == null) {
      synchronized (BlobsAPIGrpc.class) {
        if ((getStreamBlobMetadataMethod = BlobsAPIGrpc.getStreamBlobMetadataMethod) == null) {
          BlobsAPIGrpc.getStreamBlobMetadataMethod = getStreamBlobMetadataMethod =
              io.grpc.MethodDescriptor.<com.anduril.blobs.v1.StreamBlobMetadataRequest, com.anduril.blobs.v1.StreamBlobMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamBlobMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.blobs.v1.StreamBlobMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.blobs.v1.StreamBlobMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlobsAPIMethodDescriptorSupplier("StreamBlobMetadata"))
              .build();
        }
      }
    }
    return getStreamBlobMetadataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BlobsAPIStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BlobsAPIStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BlobsAPIStub>() {
        @java.lang.Override
        public BlobsAPIStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BlobsAPIStub(channel, callOptions);
        }
      };
    return BlobsAPIStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BlobsAPIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BlobsAPIBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BlobsAPIBlockingStub>() {
        @java.lang.Override
        public BlobsAPIBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BlobsAPIBlockingStub(channel, callOptions);
        }
      };
    return BlobsAPIBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BlobsAPIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BlobsAPIFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BlobsAPIFutureStub>() {
        @java.lang.Override
        public BlobsAPIFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BlobsAPIFutureStub(channel, callOptions);
        }
      };
    return BlobsAPIFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A general purpose blob storage service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates a new blob. This is a simple form for small (&lt;=2MB) blobs with unary atomic API.
     * </pre>
     */
    default void createBlob(com.anduril.blobs.v1.CreateBlobRequest request,
        io.grpc.stub.StreamObserver<com.anduril.blobs.v1.CreateBlobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBlobMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new blob. This is for creating any sized blob using a client streaming API.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.anduril.blobs.v1.CreateBlobChunkedRequest> createBlobChunked(
        io.grpc.stub.StreamObserver<com.anduril.blobs.v1.CreateBlobChunkedResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCreateBlobChunkedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a blob (streams blob contents).
     * </pre>
     */
    default void getBlob(com.anduril.blobs.v1.GetBlobRequest request,
        io.grpc.stub.StreamObserver<com.anduril.blobs.v1.GetBlobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlobMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the metadata for a blob, but not the contents.
     * </pre>
     */
    default void headBlob(com.anduril.blobs.v1.HeadBlobRequest request,
        io.grpc.stub.StreamObserver<com.anduril.blobs.v1.HeadBlobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHeadBlobMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stream blob metadata announcements for the provided clientID.
     * </pre>
     */
    default void streamBlobMetadata(com.anduril.blobs.v1.StreamBlobMetadataRequest request,
        io.grpc.stub.StreamObserver<com.anduril.blobs.v1.StreamBlobMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamBlobMetadataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BlobsAPI.
   * <pre>
   * A general purpose blob storage service.
   * </pre>
   */
  public static abstract class BlobsAPIImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BlobsAPIGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BlobsAPI.
   * <pre>
   * A general purpose blob storage service.
   * </pre>
   */
  public static final class BlobsAPIStub
      extends io.grpc.stub.AbstractAsyncStub<BlobsAPIStub> {
    private BlobsAPIStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlobsAPIStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BlobsAPIStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a new blob. This is a simple form for small (&lt;=2MB) blobs with unary atomic API.
     * </pre>
     */
    public void createBlob(com.anduril.blobs.v1.CreateBlobRequest request,
        io.grpc.stub.StreamObserver<com.anduril.blobs.v1.CreateBlobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBlobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new blob. This is for creating any sized blob using a client streaming API.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.anduril.blobs.v1.CreateBlobChunkedRequest> createBlobChunked(
        io.grpc.stub.StreamObserver<com.anduril.blobs.v1.CreateBlobChunkedResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCreateBlobChunkedMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Gets a blob (streams blob contents).
     * </pre>
     */
    public void getBlob(com.anduril.blobs.v1.GetBlobRequest request,
        io.grpc.stub.StreamObserver<com.anduril.blobs.v1.GetBlobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetBlobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the metadata for a blob, but not the contents.
     * </pre>
     */
    public void headBlob(com.anduril.blobs.v1.HeadBlobRequest request,
        io.grpc.stub.StreamObserver<com.anduril.blobs.v1.HeadBlobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHeadBlobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stream blob metadata announcements for the provided clientID.
     * </pre>
     */
    public void streamBlobMetadata(com.anduril.blobs.v1.StreamBlobMetadataRequest request,
        io.grpc.stub.StreamObserver<com.anduril.blobs.v1.StreamBlobMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamBlobMetadataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BlobsAPI.
   * <pre>
   * A general purpose blob storage service.
   * </pre>
   */
  public static final class BlobsAPIBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BlobsAPIBlockingStub> {
    private BlobsAPIBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlobsAPIBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BlobsAPIBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a new blob. This is a simple form for small (&lt;=2MB) blobs with unary atomic API.
     * </pre>
     */
    public com.anduril.blobs.v1.CreateBlobResponse createBlob(com.anduril.blobs.v1.CreateBlobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBlobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a blob (streams blob contents).
     * </pre>
     */
    public java.util.Iterator<com.anduril.blobs.v1.GetBlobResponse> getBlob(
        com.anduril.blobs.v1.GetBlobRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetBlobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the metadata for a blob, but not the contents.
     * </pre>
     */
    public com.anduril.blobs.v1.HeadBlobResponse headBlob(com.anduril.blobs.v1.HeadBlobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHeadBlobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stream blob metadata announcements for the provided clientID.
     * </pre>
     */
    public java.util.Iterator<com.anduril.blobs.v1.StreamBlobMetadataResponse> streamBlobMetadata(
        com.anduril.blobs.v1.StreamBlobMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamBlobMetadataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BlobsAPI.
   * <pre>
   * A general purpose blob storage service.
   * </pre>
   */
  public static final class BlobsAPIFutureStub
      extends io.grpc.stub.AbstractFutureStub<BlobsAPIFutureStub> {
    private BlobsAPIFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlobsAPIFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BlobsAPIFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a new blob. This is a simple form for small (&lt;=2MB) blobs with unary atomic API.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.anduril.blobs.v1.CreateBlobResponse> createBlob(
        com.anduril.blobs.v1.CreateBlobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBlobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the metadata for a blob, but not the contents.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.anduril.blobs.v1.HeadBlobResponse> headBlob(
        com.anduril.blobs.v1.HeadBlobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHeadBlobMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BLOB = 0;
  private static final int METHODID_GET_BLOB = 1;
  private static final int METHODID_HEAD_BLOB = 2;
  private static final int METHODID_STREAM_BLOB_METADATA = 3;
  private static final int METHODID_CREATE_BLOB_CHUNKED = 4;

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
        case METHODID_CREATE_BLOB:
          serviceImpl.createBlob((com.anduril.blobs.v1.CreateBlobRequest) request,
              (io.grpc.stub.StreamObserver<com.anduril.blobs.v1.CreateBlobResponse>) responseObserver);
          break;
        case METHODID_GET_BLOB:
          serviceImpl.getBlob((com.anduril.blobs.v1.GetBlobRequest) request,
              (io.grpc.stub.StreamObserver<com.anduril.blobs.v1.GetBlobResponse>) responseObserver);
          break;
        case METHODID_HEAD_BLOB:
          serviceImpl.headBlob((com.anduril.blobs.v1.HeadBlobRequest) request,
              (io.grpc.stub.StreamObserver<com.anduril.blobs.v1.HeadBlobResponse>) responseObserver);
          break;
        case METHODID_STREAM_BLOB_METADATA:
          serviceImpl.streamBlobMetadata((com.anduril.blobs.v1.StreamBlobMetadataRequest) request,
              (io.grpc.stub.StreamObserver<com.anduril.blobs.v1.StreamBlobMetadataResponse>) responseObserver);
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
        case METHODID_CREATE_BLOB_CHUNKED:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.createBlobChunked(
              (io.grpc.stub.StreamObserver<com.anduril.blobs.v1.CreateBlobChunkedResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateBlobMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.anduril.blobs.v1.CreateBlobRequest,
              com.anduril.blobs.v1.CreateBlobResponse>(
                service, METHODID_CREATE_BLOB)))
        .addMethod(
          getCreateBlobChunkedMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.anduril.blobs.v1.CreateBlobChunkedRequest,
              com.anduril.blobs.v1.CreateBlobChunkedResponse>(
                service, METHODID_CREATE_BLOB_CHUNKED)))
        .addMethod(
          getGetBlobMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.anduril.blobs.v1.GetBlobRequest,
              com.anduril.blobs.v1.GetBlobResponse>(
                service, METHODID_GET_BLOB)))
        .addMethod(
          getHeadBlobMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.anduril.blobs.v1.HeadBlobRequest,
              com.anduril.blobs.v1.HeadBlobResponse>(
                service, METHODID_HEAD_BLOB)))
        .addMethod(
          getStreamBlobMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.anduril.blobs.v1.StreamBlobMetadataRequest,
              com.anduril.blobs.v1.StreamBlobMetadataResponse>(
                service, METHODID_STREAM_BLOB_METADATA)))
        .build();
  }

  private static abstract class BlobsAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BlobsAPIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.anduril.blobs.v1.BlobsApiPubProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BlobsAPI");
    }
  }

  private static final class BlobsAPIFileDescriptorSupplier
      extends BlobsAPIBaseDescriptorSupplier {
    BlobsAPIFileDescriptorSupplier() {}
  }

  private static final class BlobsAPIMethodDescriptorSupplier
      extends BlobsAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BlobsAPIMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BlobsAPIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BlobsAPIFileDescriptorSupplier())
              .addMethod(getCreateBlobMethod())
              .addMethod(getCreateBlobChunkedMethod())
              .addMethod(getGetBlobMethod())
              .addMethod(getHeadBlobMethod())
              .addMethod(getStreamBlobMetadataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
