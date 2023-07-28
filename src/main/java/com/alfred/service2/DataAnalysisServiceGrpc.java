package com.alfred.service2;

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
 * The Data Analysis Service (DAS) definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: das.proto")
public final class DataAnalysisServiceGrpc {

  private DataAnalysisServiceGrpc() {}

  public static final String SERVICE_NAME = "das.DataAnalysisService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.alfred.service2.DASProto.AnalysisRequest,
      com.alfred.service2.DASProto.AnalysisResponse> getAnalyzeDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AnalyzeData",
      requestType = com.alfred.service2.DASProto.AnalysisRequest.class,
      responseType = com.alfred.service2.DASProto.AnalysisResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.alfred.service2.DASProto.AnalysisRequest,
      com.alfred.service2.DASProto.AnalysisResponse> getAnalyzeDataMethod() {
    io.grpc.MethodDescriptor<com.alfred.service2.DASProto.AnalysisRequest, com.alfred.service2.DASProto.AnalysisResponse> getAnalyzeDataMethod;
    if ((getAnalyzeDataMethod = DataAnalysisServiceGrpc.getAnalyzeDataMethod) == null) {
      synchronized (DataAnalysisServiceGrpc.class) {
        if ((getAnalyzeDataMethod = DataAnalysisServiceGrpc.getAnalyzeDataMethod) == null) {
          DataAnalysisServiceGrpc.getAnalyzeDataMethod = getAnalyzeDataMethod = 
              io.grpc.MethodDescriptor.<com.alfred.service2.DASProto.AnalysisRequest, com.alfred.service2.DASProto.AnalysisResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "das.DataAnalysisService", "AnalyzeData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alfred.service2.DASProto.AnalysisRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alfred.service2.DASProto.AnalysisResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DataAnalysisServiceMethodDescriptorSupplier("AnalyzeData"))
                  .build();
          }
        }
     }
     return getAnalyzeDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataAnalysisServiceStub newStub(io.grpc.Channel channel) {
    return new DataAnalysisServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataAnalysisServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DataAnalysisServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataAnalysisServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DataAnalysisServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The Data Analysis Service (DAS) definition.
   * </pre>
   */
  public static abstract class DataAnalysisServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * A simple RPC that takes an AnalysisRequest and returns an AnalysisResponse.
     * </pre>
     */
    public void analyzeData(com.alfred.service2.DASProto.AnalysisRequest request,
        io.grpc.stub.StreamObserver<com.alfred.service2.DASProto.AnalysisResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAnalyzeDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAnalyzeDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.alfred.service2.DASProto.AnalysisRequest,
                com.alfred.service2.DASProto.AnalysisResponse>(
                  this, METHODID_ANALYZE_DATA)))
          .build();
    }
  }

  /**
   * <pre>
   * The Data Analysis Service (DAS) definition.
   * </pre>
   */
  public static final class DataAnalysisServiceStub extends io.grpc.stub.AbstractStub<DataAnalysisServiceStub> {
    private DataAnalysisServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataAnalysisServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataAnalysisServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataAnalysisServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * A simple RPC that takes an AnalysisRequest and returns an AnalysisResponse.
     * </pre>
     */
    public void analyzeData(com.alfred.service2.DASProto.AnalysisRequest request,
        io.grpc.stub.StreamObserver<com.alfred.service2.DASProto.AnalysisResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAnalyzeDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Data Analysis Service (DAS) definition.
   * </pre>
   */
  public static final class DataAnalysisServiceBlockingStub extends io.grpc.stub.AbstractStub<DataAnalysisServiceBlockingStub> {
    private DataAnalysisServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataAnalysisServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataAnalysisServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataAnalysisServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * A simple RPC that takes an AnalysisRequest and returns an AnalysisResponse.
     * </pre>
     */
    public com.alfred.service2.DASProto.AnalysisResponse analyzeData(com.alfred.service2.DASProto.AnalysisRequest request) {
      return blockingUnaryCall(
          getChannel(), getAnalyzeDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Data Analysis Service (DAS) definition.
   * </pre>
   */
  public static final class DataAnalysisServiceFutureStub extends io.grpc.stub.AbstractStub<DataAnalysisServiceFutureStub> {
    private DataAnalysisServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataAnalysisServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataAnalysisServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataAnalysisServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * A simple RPC that takes an AnalysisRequest and returns an AnalysisResponse.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.alfred.service2.DASProto.AnalysisResponse> analyzeData(
        com.alfred.service2.DASProto.AnalysisRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAnalyzeDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ANALYZE_DATA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataAnalysisServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataAnalysisServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ANALYZE_DATA:
          serviceImpl.analyzeData((com.alfred.service2.DASProto.AnalysisRequest) request,
              (io.grpc.stub.StreamObserver<com.alfred.service2.DASProto.AnalysisResponse>) responseObserver);
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

  private static abstract class DataAnalysisServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataAnalysisServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.alfred.service2.DASProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataAnalysisService");
    }
  }

  private static final class DataAnalysisServiceFileDescriptorSupplier
      extends DataAnalysisServiceBaseDescriptorSupplier {
    DataAnalysisServiceFileDescriptorSupplier() {}
  }

  private static final class DataAnalysisServiceMethodDescriptorSupplier
      extends DataAnalysisServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataAnalysisServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DataAnalysisServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataAnalysisServiceFileDescriptorSupplier())
              .addMethod(getAnalyzeDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
