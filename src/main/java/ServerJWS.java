import WS.BanqueService;
import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:3000/", new BanqueService());
        System.out.println("Server started successfully AT http://localhost:3000/");
    }
}
