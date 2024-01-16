package com.javapatterns.state.login;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.Servlet.ServletRequest;
import javax.Servlet.http.*;
public class ContextServlet extends HttpServlet {
  private UserState userState = new LogoutState();
  public void doGet(HttpServletRequest request,
    HttpServletResponse response)
  throws ServletException, IOException {
    doService(request,response);
  }
  public void doPost(HttpServletRequest request,
    HttpServletResponse response)
  throws ServletException,IOException {
    doService(request,response);
  }
  public void doService(HttpServletRequest request,
    HttpServletResponse response)
  throws ServletException,IOException {
    String userId=request.getParameter("userid");
    String password=request.getParameter("password");
    String btnAction=request.getParameter("btnAction");
    if (btnAction.equalsIgnoreCase("log on")) {
      this.getState().login(userId,password);
    } else if (btnAction.equalsIgnoreCase("log out")) {
      this.getState().logout();
    }
    response.sendRedirect(this.getCurrentState().getNextPage());
  }
  /*状态的取值方法*/
  public UserState getState() { return userState.getCurrentState(); }
}
