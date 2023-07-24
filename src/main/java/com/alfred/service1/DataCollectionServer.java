package com.alfred.service1;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

public class DataCollectionServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Build and start the gRPC server
        Server server = ServerBuilder.forPort(50051)
                .addService(new DataCollectionServiceImplementation())
                .build()
                .start();

        System.out.println("Data Collection Server started, listening on " + server.getPort());

        // Register the service to JmDNS
        try (JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost())) {
            ServiceInfo serviceInfo = ServiceInfo.create("_grpc._tcp.local.", "DataCollectionService", 50051, "");
            jmdns.registerService(serviceInfo);

            System.out.println("Data Collection Service registered to JmDNS successfully");
        }

        // Don't exit the application
        server.awaitTermination();
    }
}
