import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.util.log.Slf4jLog;

import java.net.URL;

public class ServerStarter {
    public static void main(String[] args) throws Exception {
    Server server=new Server(8181);
    server.setHandler(new HelloServer());
        ContextHandler ch=new ContextHandler();
        ch.setContextPath("/resources");
        ResourceHandler resource_handler = new ResourceHandler();
        resource_handler.setDirectoriesListed(true);
        resource_handler.setResourceBase("C:\\Users\\Ilya\\Downloads\\springboot\\laba1javase\\src\\main\\resources");
        ch.setHandler(resource_handler);
        HandlerList handlers = new HandlerList();
        handlers.setHandlers(new Handler[] { ch, new HelloServer() });
        server.setHandler(handlers);
        
    server.start();
    server.join();
    }
}
