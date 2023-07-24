package com.alfred.service1;

import com.alfred.service1.DCSProto.DataRequest;
import com.alfred.service1.DCSProto.DataResponse;

import io.grpc.stub.StreamObserver;

public class DataCollectionServiceImplementation extends DataCollectionServiceGrpc.DataCollectionServiceImplBase {

    @Override
    public void collectData(DataRequest request, StreamObserver<DataResponse> responseObserver) {
        String deviceId = request.getDeviceId();
        String dataType = request.getDataType();
        long timestamp = request.getTimestamp();

        // This service will return a dummy data value and data unit for given device, data type, and timestamp.
        // In real-world scenarios, the service would communicate with the device to get the actual data.
        String dataValue = "123.45";  // for example
        String dataUnit = "ppm";  // for example

        DataResponse response = DataResponse.newBuilder()
            .setDataValue(dataValue)
            .setDataUnit(dataUnit)
            .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    
}
