package com.anduril.taskmanager.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Task Manager is a service that performs state management associated with Tasks, and also the execution of Tasks
 * on their designated agents.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.1)",
    comments = "Source: anduril/taskmanager/v1/task_manager_grpcapi.pub.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TaskManagerAPIGrpc {

  private TaskManagerAPIGrpc() {}

  public static final String SERVICE_NAME = "anduril.taskmanager.v1.TaskManagerAPI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.anduril.taskmanager.v1.CreateTaskRequest,
      com.anduril.taskmanager.v1.CreateTaskResponse> getCreateTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTask",
      requestType = com.anduril.taskmanager.v1.CreateTaskRequest.class,
      responseType = com.anduril.taskmanager.v1.CreateTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.anduril.taskmanager.v1.CreateTaskRequest,
      com.anduril.taskmanager.v1.CreateTaskResponse> getCreateTaskMethod() {
    io.grpc.MethodDescriptor<com.anduril.taskmanager.v1.CreateTaskRequest, com.anduril.taskmanager.v1.CreateTaskResponse> getCreateTaskMethod;
    if ((getCreateTaskMethod = TaskManagerAPIGrpc.getCreateTaskMethod) == null) {
      synchronized (TaskManagerAPIGrpc.class) {
        if ((getCreateTaskMethod = TaskManagerAPIGrpc.getCreateTaskMethod) == null) {
          TaskManagerAPIGrpc.getCreateTaskMethod = getCreateTaskMethod =
              io.grpc.MethodDescriptor.<com.anduril.taskmanager.v1.CreateTaskRequest, com.anduril.taskmanager.v1.CreateTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.taskmanager.v1.CreateTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.taskmanager.v1.CreateTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskManagerAPIMethodDescriptorSupplier("CreateTask"))
              .build();
        }
      }
    }
    return getCreateTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.anduril.taskmanager.v1.GetTaskRequest,
      com.anduril.taskmanager.v1.GetTaskResponse> getGetTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTask",
      requestType = com.anduril.taskmanager.v1.GetTaskRequest.class,
      responseType = com.anduril.taskmanager.v1.GetTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.anduril.taskmanager.v1.GetTaskRequest,
      com.anduril.taskmanager.v1.GetTaskResponse> getGetTaskMethod() {
    io.grpc.MethodDescriptor<com.anduril.taskmanager.v1.GetTaskRequest, com.anduril.taskmanager.v1.GetTaskResponse> getGetTaskMethod;
    if ((getGetTaskMethod = TaskManagerAPIGrpc.getGetTaskMethod) == null) {
      synchronized (TaskManagerAPIGrpc.class) {
        if ((getGetTaskMethod = TaskManagerAPIGrpc.getGetTaskMethod) == null) {
          TaskManagerAPIGrpc.getGetTaskMethod = getGetTaskMethod =
              io.grpc.MethodDescriptor.<com.anduril.taskmanager.v1.GetTaskRequest, com.anduril.taskmanager.v1.GetTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.taskmanager.v1.GetTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.taskmanager.v1.GetTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskManagerAPIMethodDescriptorSupplier("GetTask"))
              .build();
        }
      }
    }
    return getGetTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.anduril.taskmanager.v1.QueryTasksRequest,
      com.anduril.taskmanager.v1.QueryTasksResponse> getQueryTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryTasks",
      requestType = com.anduril.taskmanager.v1.QueryTasksRequest.class,
      responseType = com.anduril.taskmanager.v1.QueryTasksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.anduril.taskmanager.v1.QueryTasksRequest,
      com.anduril.taskmanager.v1.QueryTasksResponse> getQueryTasksMethod() {
    io.grpc.MethodDescriptor<com.anduril.taskmanager.v1.QueryTasksRequest, com.anduril.taskmanager.v1.QueryTasksResponse> getQueryTasksMethod;
    if ((getQueryTasksMethod = TaskManagerAPIGrpc.getQueryTasksMethod) == null) {
      synchronized (TaskManagerAPIGrpc.class) {
        if ((getQueryTasksMethod = TaskManagerAPIGrpc.getQueryTasksMethod) == null) {
          TaskManagerAPIGrpc.getQueryTasksMethod = getQueryTasksMethod =
              io.grpc.MethodDescriptor.<com.anduril.taskmanager.v1.QueryTasksRequest, com.anduril.taskmanager.v1.QueryTasksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.taskmanager.v1.QueryTasksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.taskmanager.v1.QueryTasksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskManagerAPIMethodDescriptorSupplier("QueryTasks"))
              .build();
        }
      }
    }
    return getQueryTasksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.anduril.taskmanager.v1.UpdateStatusRequest,
      com.anduril.taskmanager.v1.UpdateStatusResponse> getUpdateStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateStatus",
      requestType = com.anduril.taskmanager.v1.UpdateStatusRequest.class,
      responseType = com.anduril.taskmanager.v1.UpdateStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.anduril.taskmanager.v1.UpdateStatusRequest,
      com.anduril.taskmanager.v1.UpdateStatusResponse> getUpdateStatusMethod() {
    io.grpc.MethodDescriptor<com.anduril.taskmanager.v1.UpdateStatusRequest, com.anduril.taskmanager.v1.UpdateStatusResponse> getUpdateStatusMethod;
    if ((getUpdateStatusMethod = TaskManagerAPIGrpc.getUpdateStatusMethod) == null) {
      synchronized (TaskManagerAPIGrpc.class) {
        if ((getUpdateStatusMethod = TaskManagerAPIGrpc.getUpdateStatusMethod) == null) {
          TaskManagerAPIGrpc.getUpdateStatusMethod = getUpdateStatusMethod =
              io.grpc.MethodDescriptor.<com.anduril.taskmanager.v1.UpdateStatusRequest, com.anduril.taskmanager.v1.UpdateStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.taskmanager.v1.UpdateStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.taskmanager.v1.UpdateStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskManagerAPIMethodDescriptorSupplier("UpdateStatus"))
              .build();
        }
      }
    }
    return getUpdateStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.anduril.taskmanager.v1.ListenAsAgentRequest,
      com.anduril.taskmanager.v1.ListenAsAgentResponse> getListenAsAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListenAsAgent",
      requestType = com.anduril.taskmanager.v1.ListenAsAgentRequest.class,
      responseType = com.anduril.taskmanager.v1.ListenAsAgentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.anduril.taskmanager.v1.ListenAsAgentRequest,
      com.anduril.taskmanager.v1.ListenAsAgentResponse> getListenAsAgentMethod() {
    io.grpc.MethodDescriptor<com.anduril.taskmanager.v1.ListenAsAgentRequest, com.anduril.taskmanager.v1.ListenAsAgentResponse> getListenAsAgentMethod;
    if ((getListenAsAgentMethod = TaskManagerAPIGrpc.getListenAsAgentMethod) == null) {
      synchronized (TaskManagerAPIGrpc.class) {
        if ((getListenAsAgentMethod = TaskManagerAPIGrpc.getListenAsAgentMethod) == null) {
          TaskManagerAPIGrpc.getListenAsAgentMethod = getListenAsAgentMethod =
              io.grpc.MethodDescriptor.<com.anduril.taskmanager.v1.ListenAsAgentRequest, com.anduril.taskmanager.v1.ListenAsAgentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListenAsAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.taskmanager.v1.ListenAsAgentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anduril.taskmanager.v1.ListenAsAgentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskManagerAPIMethodDescriptorSupplier("ListenAsAgent"))
              .build();
        }
      }
    }
    return getListenAsAgentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TaskManagerAPIStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskManagerAPIStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskManagerAPIStub>() {
        @java.lang.Override
        public TaskManagerAPIStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskManagerAPIStub(channel, callOptions);
        }
      };
    return TaskManagerAPIStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TaskManagerAPIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskManagerAPIBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskManagerAPIBlockingStub>() {
        @java.lang.Override
        public TaskManagerAPIBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskManagerAPIBlockingStub(channel, callOptions);
        }
      };
    return TaskManagerAPIBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TaskManagerAPIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskManagerAPIFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskManagerAPIFutureStub>() {
        @java.lang.Override
        public TaskManagerAPIFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskManagerAPIFutureStub(channel, callOptions);
        }
      };
    return TaskManagerAPIFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Task Manager is a service that performs state management associated with Tasks, and also the execution of Tasks
   * on their designated agents.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create a new Task.
     * </pre>
     */
    default void createTask(com.anduril.taskmanager.v1.CreateTaskRequest request,
        io.grpc.stub.StreamObserver<com.anduril.taskmanager.v1.CreateTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTaskMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an existing Task.
     * </pre>
     */
    default void getTask(com.anduril.taskmanager.v1.GetTaskRequest request,
        io.grpc.stub.StreamObserver<com.anduril.taskmanager.v1.GetTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTaskMethod(), responseObserver);
    }

    /**
     * <pre>
     * Find Tasks that match request criteria.
     * </pre>
     */
    default void queryTasks(com.anduril.taskmanager.v1.QueryTasksRequest request,
        io.grpc.stub.StreamObserver<com.anduril.taskmanager.v1.QueryTasksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryTasksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update the status of a Task.
     * </pre>
     */
    default void updateStatus(com.anduril.taskmanager.v1.UpdateStatusRequest request,
        io.grpc.stub.StreamObserver<com.anduril.taskmanager.v1.UpdateStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stream Tasks ready for RPC Agent execution that match agent selector (ex: entity_ids).
     * Intended for use by Taskable Agents that need to receive Tasks ready for execution by RPC
     * </pre>
     */
    default void listenAsAgent(com.anduril.taskmanager.v1.ListenAsAgentRequest request,
        io.grpc.stub.StreamObserver<com.anduril.taskmanager.v1.ListenAsAgentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListenAsAgentMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TaskManagerAPI.
   * <pre>
   * Task Manager is a service that performs state management associated with Tasks, and also the execution of Tasks
   * on their designated agents.
   * </pre>
   */
  public static abstract class TaskManagerAPIImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TaskManagerAPIGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TaskManagerAPI.
   * <pre>
   * Task Manager is a service that performs state management associated with Tasks, and also the execution of Tasks
   * on their designated agents.
   * </pre>
   */
  public static final class TaskManagerAPIStub
      extends io.grpc.stub.AbstractAsyncStub<TaskManagerAPIStub> {
    private TaskManagerAPIStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskManagerAPIStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskManagerAPIStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new Task.
     * </pre>
     */
    public void createTask(com.anduril.taskmanager.v1.CreateTaskRequest request,
        io.grpc.stub.StreamObserver<com.anduril.taskmanager.v1.CreateTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an existing Task.
     * </pre>
     */
    public void getTask(com.anduril.taskmanager.v1.GetTaskRequest request,
        io.grpc.stub.StreamObserver<com.anduril.taskmanager.v1.GetTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Find Tasks that match request criteria.
     * </pre>
     */
    public void queryTasks(com.anduril.taskmanager.v1.QueryTasksRequest request,
        io.grpc.stub.StreamObserver<com.anduril.taskmanager.v1.QueryTasksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update the status of a Task.
     * </pre>
     */
    public void updateStatus(com.anduril.taskmanager.v1.UpdateStatusRequest request,
        io.grpc.stub.StreamObserver<com.anduril.taskmanager.v1.UpdateStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stream Tasks ready for RPC Agent execution that match agent selector (ex: entity_ids).
     * Intended for use by Taskable Agents that need to receive Tasks ready for execution by RPC
     * </pre>
     */
    public void listenAsAgent(com.anduril.taskmanager.v1.ListenAsAgentRequest request,
        io.grpc.stub.StreamObserver<com.anduril.taskmanager.v1.ListenAsAgentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListenAsAgentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TaskManagerAPI.
   * <pre>
   * Task Manager is a service that performs state management associated with Tasks, and also the execution of Tasks
   * on their designated agents.
   * </pre>
   */
  public static final class TaskManagerAPIBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TaskManagerAPIBlockingStub> {
    private TaskManagerAPIBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskManagerAPIBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskManagerAPIBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new Task.
     * </pre>
     */
    public com.anduril.taskmanager.v1.CreateTaskResponse createTask(com.anduril.taskmanager.v1.CreateTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTaskMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an existing Task.
     * </pre>
     */
    public com.anduril.taskmanager.v1.GetTaskResponse getTask(com.anduril.taskmanager.v1.GetTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTaskMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Find Tasks that match request criteria.
     * </pre>
     */
    public com.anduril.taskmanager.v1.QueryTasksResponse queryTasks(com.anduril.taskmanager.v1.QueryTasksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryTasksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update the status of a Task.
     * </pre>
     */
    public com.anduril.taskmanager.v1.UpdateStatusResponse updateStatus(com.anduril.taskmanager.v1.UpdateStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stream Tasks ready for RPC Agent execution that match agent selector (ex: entity_ids).
     * Intended for use by Taskable Agents that need to receive Tasks ready for execution by RPC
     * </pre>
     */
    public java.util.Iterator<com.anduril.taskmanager.v1.ListenAsAgentResponse> listenAsAgent(
        com.anduril.taskmanager.v1.ListenAsAgentRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListenAsAgentMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TaskManagerAPI.
   * <pre>
   * Task Manager is a service that performs state management associated with Tasks, and also the execution of Tasks
   * on their designated agents.
   * </pre>
   */
  public static final class TaskManagerAPIFutureStub
      extends io.grpc.stub.AbstractFutureStub<TaskManagerAPIFutureStub> {
    private TaskManagerAPIFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskManagerAPIFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskManagerAPIFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new Task.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.anduril.taskmanager.v1.CreateTaskResponse> createTask(
        com.anduril.taskmanager.v1.CreateTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTaskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an existing Task.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.anduril.taskmanager.v1.GetTaskResponse> getTask(
        com.anduril.taskmanager.v1.GetTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTaskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Find Tasks that match request criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.anduril.taskmanager.v1.QueryTasksResponse> queryTasks(
        com.anduril.taskmanager.v1.QueryTasksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryTasksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update the status of a Task.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.anduril.taskmanager.v1.UpdateStatusResponse> updateStatus(
        com.anduril.taskmanager.v1.UpdateStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TASK = 0;
  private static final int METHODID_GET_TASK = 1;
  private static final int METHODID_QUERY_TASKS = 2;
  private static final int METHODID_UPDATE_STATUS = 3;
  private static final int METHODID_LISTEN_AS_AGENT = 4;

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
        case METHODID_CREATE_TASK:
          serviceImpl.createTask((com.anduril.taskmanager.v1.CreateTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.anduril.taskmanager.v1.CreateTaskResponse>) responseObserver);
          break;
        case METHODID_GET_TASK:
          serviceImpl.getTask((com.anduril.taskmanager.v1.GetTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.anduril.taskmanager.v1.GetTaskResponse>) responseObserver);
          break;
        case METHODID_QUERY_TASKS:
          serviceImpl.queryTasks((com.anduril.taskmanager.v1.QueryTasksRequest) request,
              (io.grpc.stub.StreamObserver<com.anduril.taskmanager.v1.QueryTasksResponse>) responseObserver);
          break;
        case METHODID_UPDATE_STATUS:
          serviceImpl.updateStatus((com.anduril.taskmanager.v1.UpdateStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.anduril.taskmanager.v1.UpdateStatusResponse>) responseObserver);
          break;
        case METHODID_LISTEN_AS_AGENT:
          serviceImpl.listenAsAgent((com.anduril.taskmanager.v1.ListenAsAgentRequest) request,
              (io.grpc.stub.StreamObserver<com.anduril.taskmanager.v1.ListenAsAgentResponse>) responseObserver);
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
          getCreateTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.anduril.taskmanager.v1.CreateTaskRequest,
              com.anduril.taskmanager.v1.CreateTaskResponse>(
                service, METHODID_CREATE_TASK)))
        .addMethod(
          getGetTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.anduril.taskmanager.v1.GetTaskRequest,
              com.anduril.taskmanager.v1.GetTaskResponse>(
                service, METHODID_GET_TASK)))
        .addMethod(
          getQueryTasksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.anduril.taskmanager.v1.QueryTasksRequest,
              com.anduril.taskmanager.v1.QueryTasksResponse>(
                service, METHODID_QUERY_TASKS)))
        .addMethod(
          getUpdateStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.anduril.taskmanager.v1.UpdateStatusRequest,
              com.anduril.taskmanager.v1.UpdateStatusResponse>(
                service, METHODID_UPDATE_STATUS)))
        .addMethod(
          getListenAsAgentMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.anduril.taskmanager.v1.ListenAsAgentRequest,
              com.anduril.taskmanager.v1.ListenAsAgentResponse>(
                service, METHODID_LISTEN_AS_AGENT)))
        .build();
  }

  private static abstract class TaskManagerAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TaskManagerAPIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.anduril.taskmanager.v1.TaskManagerGrpcapiPubProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TaskManagerAPI");
    }
  }

  private static final class TaskManagerAPIFileDescriptorSupplier
      extends TaskManagerAPIBaseDescriptorSupplier {
    TaskManagerAPIFileDescriptorSupplier() {}
  }

  private static final class TaskManagerAPIMethodDescriptorSupplier
      extends TaskManagerAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TaskManagerAPIMethodDescriptorSupplier(String methodName) {
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
      synchronized (TaskManagerAPIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TaskManagerAPIFileDescriptorSupplier())
              .addMethod(getCreateTaskMethod())
              .addMethod(getGetTaskMethod())
              .addMethod(getQueryTasksMethod())
              .addMethod(getUpdateStatusMethod())
              .addMethod(getListenAsAgentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
