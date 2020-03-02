import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServer extends AbstractHandler {

    public void handle(String s, Request request, HttpServletRequest httpServletRequest,
                       HttpServletResponse httpServletResponse)
            throws IOException, ServletException {
        httpServletResponse.setContentType("text/html;chatset=utf-8");
        httpServletResponse.setStatus(HttpServletResponse.SC_OK);
        request.setHandled(true);
        httpServletResponse.getWriter().println("<h1>Hello Server</h1>");
        httpServletResponse.getWriter().println(request.getHttpFields());
      //  httpServletResponse.sendRedirect("http://www.google.com/");

    }
}
