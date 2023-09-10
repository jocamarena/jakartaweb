package com.example.jakartaweb;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

//@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        String title = request.getParameter("title");
        String body = request.getParameter("body");

        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + " " + name  + "</h1>");
        out.println(String.format("<span>Welcome %s</span>", name));
        out.println(String.format("<span>Title: %s</span>", title));
        out.println(String.format("<span>body: %s</span>", body));
        out.println("</body></html>");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/memory.jsp");
        requestDispatcher.forward(request, response);
    }

    public void destroy() {
    }
}