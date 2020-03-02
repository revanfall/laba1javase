import org.eclipse.jetty.server.Server;

public class ServerStarter {
    public static void main(String[] args) throws Exception {
    Server server=new Server(8888);
    server.setHandler(new HelloServer());
    server.start();
    server.join();
    }
}
