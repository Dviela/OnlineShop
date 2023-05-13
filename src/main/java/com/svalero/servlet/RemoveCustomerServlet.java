package com.svalero.servlet;

import com.svalero.dao.CustomerDAO;

import com.svalero.dao.Database;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/remove-customer")
public class RemoveCustomerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int id = Integer.parseInt(request.getParameter("id"));

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Database.connect();

            Database.jdbi.withExtension(CustomerDAO.class, dao -> {
                dao.removeCustomer(id);
                return null;
            });
            //out.println("Customer removed");
            response.sendRedirect("delete-customer.jsp");
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
    }
}

