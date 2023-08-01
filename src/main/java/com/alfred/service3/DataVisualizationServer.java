package com.alfred.service3;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

public class DataVisualizationServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Build and start the gRPC server
        Server server = ServerBuilder.forPort(50053)  // Using a different port for this service
                .addService(new DataVizualizationServiceImplementation())
                .build()
                .start();

        System.out.println("Data Visualization Server started, listening on " + server.getPort());

        // Register the service to JmDNS
        try (JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost())) {
            ServiceInfo serviceInfo = ServiceInfo.create("_grpc._tcp.local.", "DataVisualizationService", 50053, "");
            jmdns.registerService(serviceInfo);

            System.out.println("Data Visualization Service registered to JmDNS successfully");
        }

        // Don't exit the application
        server.awaitTermination();
    }
}
