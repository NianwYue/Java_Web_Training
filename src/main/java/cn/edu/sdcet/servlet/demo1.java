package cn.edu.sdcet.servlet;

import javax.jws.WebService;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "demo1", value = "/demo1")
public class demo1 extends GenericServlet {
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html; charset=UTF-8"); // 设置内容类型和编码
        servletResponse.setCharacterEncoding("UTF-8"); // 设置响应的字符编码

        // Hello
        PrintWriter out = servletResponse.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "我的第一个Servlet项目." + "</h1>");
        out.println("</body></html>");
    }
}
