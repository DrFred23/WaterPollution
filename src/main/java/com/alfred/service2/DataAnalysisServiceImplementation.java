package com.alfred.service2;

import com.alfred.service2.DASProto.AnalysisRequest;
import com.alfred.service2.DASProto.AnalysisResponse;

import io.grpc.stub.StreamObserver;

public class DataAnalysisServiceImplementation extends DataAnalysisServiceGrpc.DataAnalysisServiceImplBase {

    @Override
    public void analyzeData(AnalysisRequest request, StreamObserver<AnalysisResponse> responseObserver) {
        String dataValue = request.getDataValue();
        String dataUnit = request.getDataUnit();
        long timestamp = request.getTimestamp();

        // Assuming the dataValue is always a valid float number.
        // In a real-world application, you'd want to handle potential NumberFormatException.
        float analyzedValue = Float.parseFloat(dataValue) * 0.8f;  // apply some transformation for example
        String analysisSummary = "Data analysis completed for the given data";  // for example
        boolean alert = analyzedValue > 150;  // trigger an alert if the analyzed value exceeds 150

        AnalysisResponse response = AnalysisResponse.newBuilder()
            .setAnalyzedValue(Float.toString(analyzedValue))
            .setAnalysisSummary(analysisSummary)
            .setAlert(alert)
            .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
