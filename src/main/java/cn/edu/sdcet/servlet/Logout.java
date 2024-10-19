package cn.edu.sdcet.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "Logout", value = "/logout")
public class Logout implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest,
                        ServletResponse servletResponse)
            throws ServletException, IOException {

    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
