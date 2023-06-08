import java.io.IOException;

import entity.EntityService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GRPCServer {

	public static void main(String[] args) throws IOException, InterruptedException{
		Server server = ServerBuilder.forPort(9093).addService(new EntityService()).build();
		server.start();
		System.out.println("Server has successfully started at port: "+server.getPort());
		server.awaitTermination();
	}

}
