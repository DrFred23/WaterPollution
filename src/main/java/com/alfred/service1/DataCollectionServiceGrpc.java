package com.alfred.service1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The data collection service (DCS) definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: dcs.proto")
public final class DataCollectionServiceGrpc {

  private DataCollectionServiceGrpc() {}

  public static final String SERVICE_NAME = "dcs.DataCollectionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<DCSProto.DataRequest,
      DCSProto.DataResponse> getCollectDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CollectData",
      requestType = DCSProto.DataRequest.class,
      responseType = DCSProto.DataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<DCSProto.DataRequest,
      DCSProto.DataResponse> getCollectDataMethod() {
    io.grpc.MethodDescriptor<DCSProto.DataRequest, DCSProto.DataResponse> getCollectDataMethod;
    if ((getCollectDataMethod = DataCollectionServiceGrpc.getCollectDataMethod) == null) {
      synchronized (DataCollectionServiceGrpc.class) {
        if ((getCollectDataMethod = DataCollectionServiceGrpc.getCollectDataMethod) == null) {
          DataCollectionServiceGrpc.getCollectDataMethod = getCollectDataMethod = 
              io.grpc.MethodDescriptor.<DCSProto.DataRequest, DCSProto.DataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dcs.DataCollectionService", "CollectData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DCSProto.DataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DCSProto.DataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DataCollectionServiceMethodDescriptorSupplier("CollectData"))
                  .build();
          }
        }
     }
     return getCollectDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataCollectionServiceStub newStub(io.grpc.Channel channel) {
    return new DataCollectionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataCollectionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DataCollectionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataCollectionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DataCollectionServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The data collection service (DCS) definition.
   * </pre>
   */
  public static abstract class DataCollectionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * A simple RPC that takes a DataRequest and returns a DataResponse.
     * </pre>
     */
    public void collectData(DCSProto.DataRequest request,
                            io.grpc.stub.StreamObserver<DCSProto.DataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCollectDataMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCollectDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                DCSProto.DataRequest,
                DCSProto.DataResponse>(
                  this, METHODID_COLLECT_DATA)))
          .build();
    }
  }

  /**
   * <pre>
   * The data collection service (DCS) definition.
   * </pre>
   */
  public static final class DataCollectionServiceStub extends io.grpc.stub.AbstractStub<DataCollectionServiceStub> {
    private DataCollectionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataCollectionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected DataCollectionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataCollectionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * A simple RPC that takes a DataRequest and returns a DataResponse.
     * </pre>
     */
    public void collectData(DCSProto.DataRequest request,
                            io.grpc.stub.StreamObserver<DCSProto.DataResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCollectDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The data collection service (DCS) definition.
   * </pre>
   */
  public static final class DataCollectionServiceBlockingStub extends io.grpc.stub.AbstractStub<DataCollectionServiceBlockingStub> {
    private DataCollectionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataCollectionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected DataCollectionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataCollectionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * A simple RPC that takes a DataRequest and returns a DataResponse.
     * </pre>
     */
    public DCSProto.DataResponse collectData(DCSProto.DataRequest request) {
      return blockingUnaryCall(
          getChannel(), getCollectDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The data collection service (DCS) definition.
   * </pre>
   */
  public static final class DataCollectionServiceFutureStub extends io.grpc.stub.AbstractStub<DataCollectionServiceFutureStub> {
    private DataCollectionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataCollectionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected DataCollectionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataCollectionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * A simple RPC that takes a DataRequest and returns a DataResponse.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<DCSProto.DataResponse> collectData(
        DCSProto.DataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCollectDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COLLECT_DATA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataCollectionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataCollectionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COLLECT_DATA:
          serviceImpl.collectData((DCSProto.DataRequest) request,
              (io.grpc.stub.StreamObserver<DCSProto.DataResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DataCollectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataCollectionServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return DCSProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataCollectionService");
    }
  }

  private static final class DataCollectionServiceFileDescriptorSupplier
      extends DataCollectionServiceBaseDescriptorSupplier {
    DataCollectionServiceFileDescriptorSupplier() {}
  }

  private static final class DataCollectionServiceMethodDescriptorSupplier
      extends DataCollectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataCollectionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DataCollectionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataCollectionServiceFileDescriptorSupplier())
              .addMethod(getCollectDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
