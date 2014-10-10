package helloworld

import javax.servlet.http.{HttpServletResponse, HttpServletRequest}

import org.eclipse.jetty.server.{Request, Server}
import org.eclipse.jetty.server.handler.AbstractHandler

class HelloWorldHandler extends AbstractHandler {

  override def handle(target: String, baseRequest: Request, request: HttpServletRequest, response: HttpServletResponse): Unit = {
    response.setContentType("text/html;charset=utf-8");
    response.setStatus(HttpServletResponse.SC_OK);
    baseRequest.setHandled(true);
    response.getWriter().println("<h1>Hello World</h1>");
    response.getWriter().println("<p>Jorja is awesome</p>");
  }
}

object HelloWorld extends App {
  private val server: Server = new Server(8091)

  server.setHandler(new HelloWorldHandler())
  server.start()
  server.join()
}
