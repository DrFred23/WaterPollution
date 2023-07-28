package com.alfred.service2;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

public class DataAnalysisServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Build and start the gRPC server
        Server server = ServerBuilder.forPort(50052)  // Using a different port for this service
                .addService(new DataAnalysisServiceImplementation())
                .build()
                .start();

        System.out.println("Data Analysis Server started, listening on " + server.getPort());

        // Register the service to JmDNS
        try (JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost())) {
            ServiceInfo serviceInfo = ServiceInfo.create("_grpc._tcp.local.", "DataAnalysisService", 50052, "");
            jmdns.registerService(serviceInfo);

            System.out.println("Data Analysis Service registered to JmDNS successfully");
        }

        // Don't exit the application
        server.awaitTermination();
    }
}
