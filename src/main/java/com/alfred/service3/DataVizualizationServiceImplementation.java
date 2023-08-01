package com.alfred.service3;

import com.alfred.service3.DVSProto.DisplayRequest;
import com.alfred.service3.DVSProto.DisplayResponse;
import com.alfred.service3.DataVisualizationServiceGrpc.DataVisualizationServiceImplBase;
import io.grpc.stub.StreamObserver;

public class DataVizualizationServiceImplementation extends DataVisualizationServiceImplBase {

    @Override
    public StreamObserver<DisplayRequest> displayData(StreamObserver<DisplayResponse> responseObserver) {
        return new StreamObserver<DisplayRequest>() {
            @Override
            public void onNext(DisplayRequest request) {
                // In real-world application, here you would handle displaying the data.
                System.out.println("Received data to display: " + request);
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                // Send a status response when we have finished receiving all the data.
                DisplayResponse response = DisplayResponse.newBuilder()
                        .setStatus("Data display completed successfully")
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }
}
