package cn.edu.sdcet.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Register", value = "/register")
public class Register extends GenericServlet {
    private String message;
    @Override
    public void init() throws ServletException {
        message = "注册成功!";
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8"); // 设置内容类型和编码
        response.setCharacterEncoding("UTF-8"); // 设置响应的字符编码

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }
}
