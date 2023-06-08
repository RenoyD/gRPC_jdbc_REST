package com.demp.grpcjdbc;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: entity.proto")
public final class entityGrpc {

  private entityGrpc() {}

  public static final String SERVICE_NAME = "entity";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.demp.grpcjdbc.Entity.CreateStudentRequest,
      com.demp.grpcjdbc.Entity.APIResponse> getCreateStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createStudent",
      requestType = com.demp.grpcjdbc.Entity.CreateStudentRequest.class,
      responseType = com.demp.grpcjdbc.Entity.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.demp.grpcjdbc.Entity.CreateStudentRequest,
      com.demp.grpcjdbc.Entity.APIResponse> getCreateStudentMethod() {
    io.grpc.MethodDescriptor<com.demp.grpcjdbc.Entity.CreateStudentRequest, com.demp.grpcjdbc.Entity.APIResponse> getCreateStudentMethod;
    if ((getCreateStudentMethod = entityGrpc.getCreateStudentMethod) == null) {
      synchronized (entityGrpc.class) {
        if ((getCreateStudentMethod = entityGrpc.getCreateStudentMethod) == null) {
          entityGrpc.getCreateStudentMethod = getCreateStudentMethod = 
              io.grpc.MethodDescriptor.<com.demp.grpcjdbc.Entity.CreateStudentRequest, com.demp.grpcjdbc.Entity.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "entity", "createStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demp.grpcjdbc.Entity.CreateStudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demp.grpcjdbc.Entity.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new entityMethodDescriptorSupplier("createStudent"))
                  .build();
          }
        }
     }
     return getCreateStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.demp.grpcjdbc.Entity.ReadStudentRequest,
      com.demp.grpcjdbc.Entity.APIResponse> getReadStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "readStudent",
      requestType = com.demp.grpcjdbc.Entity.ReadStudentRequest.class,
      responseType = com.demp.grpcjdbc.Entity.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.demp.grpcjdbc.Entity.ReadStudentRequest,
      com.demp.grpcjdbc.Entity.APIResponse> getReadStudentMethod() {
    io.grpc.MethodDescriptor<com.demp.grpcjdbc.Entity.ReadStudentRequest, com.demp.grpcjdbc.Entity.APIResponse> getReadStudentMethod;
    if ((getReadStudentMethod = entityGrpc.getReadStudentMethod) == null) {
      synchronized (entityGrpc.class) {
        if ((getReadStudentMethod = entityGrpc.getReadStudentMethod) == null) {
          entityGrpc.getReadStudentMethod = getReadStudentMethod = 
              io.grpc.MethodDescriptor.<com.demp.grpcjdbc.Entity.ReadStudentRequest, com.demp.grpcjdbc.Entity.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "entity", "readStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demp.grpcjdbc.Entity.ReadStudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demp.grpcjdbc.Entity.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new entityMethodDescriptorSupplier("readStudent"))
                  .build();
          }
        }
     }
     return getReadStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.demp.grpcjdbc.Entity.StudentRequest,
      com.demp.grpcjdbc.Entity.APIResponse> getUpdateStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateStudent",
      requestType = com.demp.grpcjdbc.Entity.StudentRequest.class,
      responseType = com.demp.grpcjdbc.Entity.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.demp.grpcjdbc.Entity.StudentRequest,
      com.demp.grpcjdbc.Entity.APIResponse> getUpdateStudentMethod() {
    io.grpc.MethodDescriptor<com.demp.grpcjdbc.Entity.StudentRequest, com.demp.grpcjdbc.Entity.APIResponse> getUpdateStudentMethod;
    if ((getUpdateStudentMethod = entityGrpc.getUpdateStudentMethod) == null) {
      synchronized (entityGrpc.class) {
        if ((getUpdateStudentMethod = entityGrpc.getUpdateStudentMethod) == null) {
          entityGrpc.getUpdateStudentMethod = getUpdateStudentMethod = 
              io.grpc.MethodDescriptor.<com.demp.grpcjdbc.Entity.StudentRequest, com.demp.grpcjdbc.Entity.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "entity", "updateStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demp.grpcjdbc.Entity.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demp.grpcjdbc.Entity.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new entityMethodDescriptorSupplier("updateStudent"))
                  .build();
          }
        }
     }
     return getUpdateStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.demp.grpcjdbc.Entity.DeleteStudentRequest,
      com.demp.grpcjdbc.Entity.APIResponse> getDeleteStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteStudent",
      requestType = com.demp.grpcjdbc.Entity.DeleteStudentRequest.class,
      responseType = com.demp.grpcjdbc.Entity.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.demp.grpcjdbc.Entity.DeleteStudentRequest,
      com.demp.grpcjdbc.Entity.APIResponse> getDeleteStudentMethod() {
    io.grpc.MethodDescriptor<com.demp.grpcjdbc.Entity.DeleteStudentRequest, com.demp.grpcjdbc.Entity.APIResponse> getDeleteStudentMethod;
    if ((getDeleteStudentMethod = entityGrpc.getDeleteStudentMethod) == null) {
      synchronized (entityGrpc.class) {
        if ((getDeleteStudentMethod = entityGrpc.getDeleteStudentMethod) == null) {
          entityGrpc.getDeleteStudentMethod = getDeleteStudentMethod = 
              io.grpc.MethodDescriptor.<com.demp.grpcjdbc.Entity.DeleteStudentRequest, com.demp.grpcjdbc.Entity.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "entity", "deleteStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demp.grpcjdbc.Entity.DeleteStudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demp.grpcjdbc.Entity.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new entityMethodDescriptorSupplier("deleteStudent"))
                  .build();
          }
        }
     }
     return getDeleteStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.demp.grpcjdbc.Entity.CreateEmployeeRequest,
      com.demp.grpcjdbc.Entity.APIResponse> getCreateEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createEmployee",
      requestType = com.demp.grpcjdbc.Entity.CreateEmployeeRequest.class,
      responseType = com.demp.grpcjdbc.Entity.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.demp.grpcjdbc.Entity.CreateEmployeeRequest,
      com.demp.grpcjdbc.Entity.APIResponse> getCreateEmployeeMethod() {
    io.grpc.MethodDescriptor<com.demp.grpcjdbc.Entity.CreateEmployeeRequest, com.demp.grpcjdbc.Entity.APIResponse> getCreateEmployeeMethod;
    if ((getCreateEmployeeMethod = entityGrpc.getCreateEmployeeMethod) == null) {
      synchronized (entityGrpc.class) {
        if ((getCreateEmployeeMethod = entityGrpc.getCreateEmployeeMethod) == null) {
          entityGrpc.getCreateEmployeeMethod = getCreateEmployeeMethod = 
              io.grpc.MethodDescriptor.<com.demp.grpcjdbc.Entity.CreateEmployeeRequest, com.demp.grpcjdbc.Entity.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "entity", "createEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demp.grpcjdbc.Entity.CreateEmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demp.grpcjdbc.Entity.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new entityMethodDescriptorSupplier("createEmployee"))
                  .build();
          }
        }
     }
     return getCreateEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.demp.grpcjdbc.Entity.ReadEmployeeRequest,
      com.demp.grpcjdbc.Entity.APIResponse> getReadEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "readEmployee",
      requestType = com.demp.grpcjdbc.Entity.ReadEmployeeRequest.class,
      responseType = com.demp.grpcjdbc.Entity.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.demp.grpcjdbc.Entity.ReadEmployeeRequest,
      com.demp.grpcjdbc.Entity.APIResponse> getReadEmployeeMethod() {
    io.grpc.MethodDescriptor<com.demp.grpcjdbc.Entity.ReadEmployeeRequest, com.demp.grpcjdbc.Entity.APIResponse> getReadEmployeeMethod;
    if ((getReadEmployeeMethod = entityGrpc.getReadEmployeeMethod) == null) {
      synchronized (entityGrpc.class) {
        if ((getReadEmployeeMethod = entityGrpc.getReadEmployeeMethod) == null) {
          entityGrpc.getReadEmployeeMethod = getReadEmployeeMethod = 
              io.grpc.MethodDescriptor.<com.demp.grpcjdbc.Entity.ReadEmployeeRequest, com.demp.grpcjdbc.Entity.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "entity", "readEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demp.grpcjdbc.Entity.ReadEmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demp.grpcjdbc.Entity.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new entityMethodDescriptorSupplier("readEmployee"))
                  .build();
          }
        }
     }
     return getReadEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.demp.grpcjdbc.Entity.EmployeeRequest,
      com.demp.grpcjdbc.Entity.APIResponse> getUpdateEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateEmployee",
      requestType = com.demp.grpcjdbc.Entity.EmployeeRequest.class,
      responseType = com.demp.grpcjdbc.Entity.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.demp.grpcjdbc.Entity.EmployeeRequest,
      com.demp.grpcjdbc.Entity.APIResponse> getUpdateEmployeeMethod() {
    io.grpc.MethodDescriptor<com.demp.grpcjdbc.Entity.EmployeeRequest, com.demp.grpcjdbc.Entity.APIResponse> getUpdateEmployeeMethod;
    if ((getUpdateEmployeeMethod = entityGrpc.getUpdateEmployeeMethod) == null) {
      synchronized (entityGrpc.class) {
        if ((getUpdateEmployeeMethod = entityGrpc.getUpdateEmployeeMethod) == null) {
          entityGrpc.getUpdateEmployeeMethod = getUpdateEmployeeMethod = 
              io.grpc.MethodDescriptor.<com.demp.grpcjdbc.Entity.EmployeeRequest, com.demp.grpcjdbc.Entity.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "entity", "updateEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demp.grpcjdbc.Entity.EmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demp.grpcjdbc.Entity.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new entityMethodDescriptorSupplier("updateEmployee"))
                  .build();
          }
        }
     }
     return getUpdateEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.demp.grpcjdbc.Entity.DeleteEmployeeRequest,
      com.demp.grpcjdbc.Entity.APIResponse> getDeleteEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteEmployee",
      requestType = com.demp.grpcjdbc.Entity.DeleteEmployeeRequest.class,
      responseType = com.demp.grpcjdbc.Entity.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.demp.grpcjdbc.Entity.DeleteEmployeeRequest,
      com.demp.grpcjdbc.Entity.APIResponse> getDeleteEmployeeMethod() {
    io.grpc.MethodDescriptor<com.demp.grpcjdbc.Entity.DeleteEmployeeRequest, com.demp.grpcjdbc.Entity.APIResponse> getDeleteEmployeeMethod;
    if ((getDeleteEmployeeMethod = entityGrpc.getDeleteEmployeeMethod) == null) {
      synchronized (entityGrpc.class) {
        if ((getDeleteEmployeeMethod = entityGrpc.getDeleteEmployeeMethod) == null) {
          entityGrpc.getDeleteEmployeeMethod = getDeleteEmployeeMethod = 
              io.grpc.MethodDescriptor.<com.demp.grpcjdbc.Entity.DeleteEmployeeRequest, com.demp.grpcjdbc.Entity.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "entity", "deleteEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demp.grpcjdbc.Entity.DeleteEmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demp.grpcjdbc.Entity.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new entityMethodDescriptorSupplier("deleteEmployee"))
                  .build();
          }
        }
     }
     return getDeleteEmployeeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static entityStub newStub(io.grpc.Channel channel) {
    return new entityStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static entityBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new entityBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static entityFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new entityFutureStub(channel);
  }

  /**
   */
  public static abstract class entityImplBase implements io.grpc.BindableService {

    /**
     */
    public void createStudent(com.demp.grpcjdbc.Entity.CreateStudentRequest request,
        io.grpc.stub.StreamObserver<com.demp.grpcjdbc.Entity.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateStudentMethod(), responseObserver);
    }

    /**
     */
    public void readStudent(com.demp.grpcjdbc.Entity.ReadStudentRequest request,
        io.grpc.stub.StreamObserver<com.demp.grpcjdbc.Entity.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadStudentMethod(), responseObserver);
    }

    /**
     */
    public void updateStudent(com.demp.grpcjdbc.Entity.StudentRequest request,
        io.grpc.stub.StreamObserver<com.demp.grpcjdbc.Entity.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateStudentMethod(), responseObserver);
    }

    /**
     */
    public void deleteStudent(com.demp.grpcjdbc.Entity.DeleteStudentRequest request,
        io.grpc.stub.StreamObserver<com.demp.grpcjdbc.Entity.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteStudentMethod(), responseObserver);
    }

    /**
     */
    public void createEmployee(com.demp.grpcjdbc.Entity.CreateEmployeeRequest request,
        io.grpc.stub.StreamObserver<com.demp.grpcjdbc.Entity.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateEmployeeMethod(), responseObserver);
    }

    /**
     */
    public void readEmployee(com.demp.grpcjdbc.Entity.ReadEmployeeRequest request,
        io.grpc.stub.StreamObserver<com.demp.grpcjdbc.Entity.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadEmployeeMethod(), responseObserver);
    }

    /**
     */
    public void updateEmployee(com.demp.grpcjdbc.Entity.EmployeeRequest request,
        io.grpc.stub.StreamObserver<com.demp.grpcjdbc.Entity.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateEmployeeMethod(), responseObserver);
    }

    /**
     */
    public void deleteEmployee(com.demp.grpcjdbc.Entity.DeleteEmployeeRequest request,
        io.grpc.stub.StreamObserver<com.demp.grpcjdbc.Entity.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteEmployeeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateStudentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.demp.grpcjdbc.Entity.CreateStudentRequest,
                com.demp.grpcjdbc.Entity.APIResponse>(
                  this, METHODID_CREATE_STUDENT)))
          .addMethod(
            getReadStudentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.demp.grpcjdbc.Entity.ReadStudentRequest,
                com.demp.grpcjdbc.Entity.APIResponse>(
                  this, METHODID_READ_STUDENT)))
          .addMethod(
            getUpdateStudentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.demp.grpcjdbc.Entity.StudentRequest,
                com.demp.grpcjdbc.Entity.APIResponse>(
                  this, METHODID_UPDATE_STUDENT)))
          .addMethod(
            getDeleteStudentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.demp.grpcjdbc.Entity.DeleteStudentRequest,
                com.demp.grpcjdbc.Entity.APIResponse>(
                  this, METHODID_DELETE_STUDENT)))
          .addMethod(
            getCreateEmployeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.demp.grpcjdbc.Entity.CreateEmployeeRequest,
                com.demp.grpcjdbc.Entity.APIResponse>(
                  this, METHODID_CREATE_EMPLOYEE)))
          .addMethod(
            getReadEmployeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.demp.grpcjdbc.Entity.ReadEmployeeRequest,
                com.demp.grpcjdbc.Entity.APIResponse>(
                  this, METHODID_READ_EMPLOYEE)))
          .addMethod(
            getUpdateEmployeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.demp.grpcjdbc.Entity.EmployeeRequest,
                com.demp.grpcjdbc.Entity.APIResponse>(
                  this, METHODID_UPDATE_EMPLOYEE)))
          .addMethod(
            getDeleteEmployeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.demp.grpcjdbc.Entity.DeleteEmployeeRequest,
                com.demp.grpcjdbc.Entity.APIResponse>(
                  this, METHODID_DELETE_EMPLOYEE)))
          .build();
    }
  }

  /**
   */
  public static final class entityStub extends io.grpc.stub.AbstractStub<entityStub> {
    private entityStub(io.grpc.Channel channel) {
      super(channel);
    }

    private entityStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected entityStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new entityStub(channel, callOptions);
    }

    /**
     */
    public void createStudent(com.demp.grpcjdbc.Entity.CreateStudentRequest request,
        io.grpc.stub.StreamObserver<com.demp.grpcjdbc.Entity.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readStudent(com.demp.grpcjdbc.Entity.ReadStudentRequest request,
        io.grpc.stub.StreamObserver<com.demp.grpcjdbc.Entity.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateStudent(com.demp.grpcjdbc.Entity.StudentRequest request,
        io.grpc.stub.StreamObserver<com.demp.grpcjdbc.Entity.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteStudent(com.demp.grpcjdbc.Entity.DeleteStudentRequest request,
        io.grpc.stub.StreamObserver<com.demp.grpcjdbc.Entity.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createEmployee(com.demp.grpcjdbc.Entity.CreateEmployeeRequest request,
        io.grpc.stub.StreamObserver<com.demp.grpcjdbc.Entity.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readEmployee(com.demp.grpcjdbc.Entity.ReadEmployeeRequest request,
        io.grpc.stub.StreamObserver<com.demp.grpcjdbc.Entity.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEmployee(com.demp.grpcjdbc.Entity.EmployeeRequest request,
        io.grpc.stub.StreamObserver<com.demp.grpcjdbc.Entity.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEmployee(com.demp.grpcjdbc.Entity.DeleteEmployeeRequest request,
        io.grpc.stub.StreamObserver<com.demp.grpcjdbc.Entity.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteEmployeeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class entityBlockingStub extends io.grpc.stub.AbstractStub<entityBlockingStub> {
    private entityBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private entityBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected entityBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new entityBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.demp.grpcjdbc.Entity.APIResponse createStudent(com.demp.grpcjdbc.Entity.CreateStudentRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.demp.grpcjdbc.Entity.APIResponse readStudent(com.demp.grpcjdbc.Entity.ReadStudentRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.demp.grpcjdbc.Entity.APIResponse updateStudent(com.demp.grpcjdbc.Entity.StudentRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.demp.grpcjdbc.Entity.APIResponse deleteStudent(com.demp.grpcjdbc.Entity.DeleteStudentRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.demp.grpcjdbc.Entity.APIResponse createEmployee(com.demp.grpcjdbc.Entity.CreateEmployeeRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.demp.grpcjdbc.Entity.APIResponse readEmployee(com.demp.grpcjdbc.Entity.ReadEmployeeRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.demp.grpcjdbc.Entity.APIResponse updateEmployee(com.demp.grpcjdbc.Entity.EmployeeRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.demp.grpcjdbc.Entity.APIResponse deleteEmployee(com.demp.grpcjdbc.Entity.DeleteEmployeeRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteEmployeeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class entityFutureStub extends io.grpc.stub.AbstractStub<entityFutureStub> {
    private entityFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private entityFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected entityFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new entityFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.demp.grpcjdbc.Entity.APIResponse> createStudent(
        com.demp.grpcjdbc.Entity.CreateStudentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.demp.grpcjdbc.Entity.APIResponse> readStudent(
        com.demp.grpcjdbc.Entity.ReadStudentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.demp.grpcjdbc.Entity.APIResponse> updateStudent(
        com.demp.grpcjdbc.Entity.StudentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.demp.grpcjdbc.Entity.APIResponse> deleteStudent(
        com.demp.grpcjdbc.Entity.DeleteStudentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.demp.grpcjdbc.Entity.APIResponse> createEmployee(
        com.demp.grpcjdbc.Entity.CreateEmployeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateEmployeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.demp.grpcjdbc.Entity.APIResponse> readEmployee(
        com.demp.grpcjdbc.Entity.ReadEmployeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadEmployeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.demp.grpcjdbc.Entity.APIResponse> updateEmployee(
        com.demp.grpcjdbc.Entity.EmployeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateEmployeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.demp.grpcjdbc.Entity.APIResponse> deleteEmployee(
        com.demp.grpcjdbc.Entity.DeleteEmployeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteEmployeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_STUDENT = 0;
  private static final int METHODID_READ_STUDENT = 1;
  private static final int METHODID_UPDATE_STUDENT = 2;
  private static final int METHODID_DELETE_STUDENT = 3;
  private static final int METHODID_CREATE_EMPLOYEE = 4;
  private static final int METHODID_READ_EMPLOYEE = 5;
  private static final int METHODID_UPDATE_EMPLOYEE = 6;
  private static final int METHODID_DELETE_EMPLOYEE = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final entityImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(entityImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_STUDENT:
          serviceImpl.createStudent((com.demp.grpcjdbc.Entity.CreateStudentRequest) request,
              (io.grpc.stub.StreamObserver<com.demp.grpcjdbc.Entity.APIResponse>) responseObserver);
          break;
        case METHODID_READ_STUDENT:
          serviceImpl.readStudent((com.demp.grpcjdbc.Entity.ReadStudentRequest) request,
              (io.grpc.stub.StreamObserver<com.demp.grpcjdbc.Entity.APIResponse>) responseObserver);
          break;
        case METHODID_UPDATE_STUDENT:
          serviceImpl.updateStudent((com.demp.grpcjdbc.Entity.StudentRequest) request,
              (io.grpc.stub.StreamObserver<com.demp.grpcjdbc.Entity.APIResponse>) responseObserver);
          break;
        case METHODID_DELETE_STUDENT:
          serviceImpl.deleteStudent((com.demp.grpcjdbc.Entity.DeleteStudentRequest) request,
              (io.grpc.stub.StreamObserver<com.demp.grpcjdbc.Entity.APIResponse>) responseObserver);
          break;
        case METHODID_CREATE_EMPLOYEE:
          serviceImpl.createEmployee((com.demp.grpcjdbc.Entity.CreateEmployeeRequest) request,
              (io.grpc.stub.StreamObserver<com.demp.grpcjdbc.Entity.APIResponse>) responseObserver);
          break;
        case METHODID_READ_EMPLOYEE:
          serviceImpl.readEmployee((com.demp.grpcjdbc.Entity.ReadEmployeeRequest) request,
              (io.grpc.stub.StreamObserver<com.demp.grpcjdbc.Entity.APIResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EMPLOYEE:
          serviceImpl.updateEmployee((com.demp.grpcjdbc.Entity.EmployeeRequest) request,
              (io.grpc.stub.StreamObserver<com.demp.grpcjdbc.Entity.APIResponse>) responseObserver);
          break;
        case METHODID_DELETE_EMPLOYEE:
          serviceImpl.deleteEmployee((com.demp.grpcjdbc.Entity.DeleteEmployeeRequest) request,
              (io.grpc.stub.StreamObserver<com.demp.grpcjdbc.Entity.APIResponse>) responseObserver);
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

  private static abstract class entityBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    entityBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.demp.grpcjdbc.Entity.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("entity");
    }
  }

  private static final class entityFileDescriptorSupplier
      extends entityBaseDescriptorSupplier {
    entityFileDescriptorSupplier() {}
  }

  private static final class entityMethodDescriptorSupplier
      extends entityBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    entityMethodDescriptorSupplier(String methodName) {
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
      synchronized (entityGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new entityFileDescriptorSupplier())
              .addMethod(getCreateStudentMethod())
              .addMethod(getReadStudentMethod())
              .addMethod(getUpdateStudentMethod())
              .addMethod(getDeleteStudentMethod())
              .addMethod(getCreateEmployeeMethod())
              .addMethod(getReadEmployeeMethod())
              .addMethod(getUpdateEmployeeMethod())
              .addMethod(getDeleteEmployeeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
