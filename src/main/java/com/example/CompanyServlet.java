package com.example;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class CompanyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html><head>");
        out.println("<title>About Us - GP Corp</title>");
        out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css' rel='stylesheet'>");
        out.println("</head><body class='bg-white'>");

        out.println("<div class='container mt-5'>");
        out.println("<h1 class='text-center text-dark'>About GP Corporation</h1>");
        out.println("<p class='lead text-center'>We build innovative software solutions for businesses across the globe.</p>");
        out.println("<div class='text-center'><a href='/java-webapp/' class='btn btn-secondary'>Back to Home</a></div>");
        out.println("</div>");

        out.println("</body></html>");
    }
}
