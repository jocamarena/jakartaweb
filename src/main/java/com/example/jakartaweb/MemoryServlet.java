package com.example.jakartaweb;

import com.example.jakartaweb.model.Memory;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "memoryServlet", value = "/memory-servlet")
public class MemoryServlet extends HttpServlet {
    private String message;
    private List<Memory> memories = new ArrayList<>();

    public void init() {
        message = "Hello World!";
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("text/html");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/memory.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        String title = request.getParameter("title");
        String body = request.getParameter("body");
        Memory memory = Memory.builder().name(name).title(title).body(body).build();
        memories.add(memory);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/memory.jsp");
        request.setAttribute("memories", memories);
        requestDispatcher.forward(request, response);
        HibernateConfig.getInstance().persist(memory);
    }

    public void destroy() {
    }
}
