package com.alfred.service3;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * The Data Visualization Service (DVS) definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: dvs.proto")
public final class DataVisualizationServiceGrpc {

  private DataVisualizationServiceGrpc() {}

  public static final String SERVICE_NAME = "dvs.DataVisualizationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<DVSProto.DisplayRequest,
      DVSProto.DisplayResponse> getDisplayDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisplayData",
      requestType = DVSProto.DisplayRequest.class,
      responseType = DVSProto.DisplayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<DVSProto.DisplayRequest,
      DVSProto.DisplayResponse> getDisplayDataMethod() {
    io.grpc.MethodDescriptor<DVSProto.DisplayRequest, DVSProto.DisplayResponse> getDisplayDataMethod;
    if ((getDisplayDataMethod = DataVisualizationServiceGrpc.getDisplayDataMethod) == null) {
      synchronized (DataVisualizationServiceGrpc.class) {
        if ((getDisplayDataMethod = DataVisualizationServiceGrpc.getDisplayDataMethod) == null) {
          DataVisualizationServiceGrpc.getDisplayDataMethod = getDisplayDataMethod = 
              io.grpc.MethodDescriptor.<DVSProto.DisplayRequest, DVSProto.DisplayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "dvs.DataVisualizationService", "DisplayData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DVSProto.DisplayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DVSProto.DisplayResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DataVisualizationServiceMethodDescriptorSupplier("DisplayData"))
                  .build();
          }
        }
     }
     return getDisplayDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataVisualizationServiceStub newStub(io.grpc.Channel channel) {
    return new DataVisualizationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataVisualizationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DataVisualizationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataVisualizationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DataVisualizationServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The Data Visualization Service (DVS) definition.
   * </pre>
   */
  public static abstract class DataVisualizationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * A client streaming RPC that takes a stream of DisplayRequest and returns a DisplayResponse.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<DVSProto.DisplayRequest> displayData(
        io.grpc.stub.StreamObserver<DVSProto.DisplayResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getDisplayDataMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDisplayDataMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                DVSProto.DisplayRequest,
                DVSProto.DisplayResponse>(
                  this, METHODID_DISPLAY_DATA)))
          .build();
    }
  }

  /**
   * <pre>
   * The Data Visualization Service (DVS) definition.
   * </pre>
   */
  public static final class DataVisualizationServiceStub extends io.grpc.stub.AbstractStub<DataVisualizationServiceStub> {
    private DataVisualizationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataVisualizationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected DataVisualizationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataVisualizationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * A client streaming RPC that takes a stream of DisplayRequest and returns a DisplayResponse.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<DVSProto.DisplayRequest> displayData(
        io.grpc.stub.StreamObserver<DVSProto.DisplayResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getDisplayDataMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * The Data Visualization Service (DVS) definition.
   * </pre>
   */
  public static final class DataVisualizationServiceBlockingStub extends io.grpc.stub.AbstractStub<DataVisualizationServiceBlockingStub> {
    private DataVisualizationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataVisualizationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected DataVisualizationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataVisualizationServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * The Data Visualization Service (DVS) definition.
   * </pre>
   */
  public static final class DataVisualizationServiceFutureStub extends io.grpc.stub.AbstractStub<DataVisualizationServiceFutureStub> {
    private DataVisualizationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataVisualizationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected DataVisualizationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataVisualizationServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_DISPLAY_DATA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataVisualizationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataVisualizationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DISPLAY_DATA:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.displayData(
              (io.grpc.stub.StreamObserver<DVSProto.DisplayResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DataVisualizationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataVisualizationServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return DVSProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataVisualizationService");
    }
  }

  private static final class DataVisualizationServiceFileDescriptorSupplier
      extends DataVisualizationServiceBaseDescriptorSupplier {
    DataVisualizationServiceFileDescriptorSupplier() {}
  }

  private static final class DataVisualizationServiceMethodDescriptorSupplier
      extends DataVisualizationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataVisualizationServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DataVisualizationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataVisualizationServiceFileDescriptorSupplier())
              .addMethod(getDisplayDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
