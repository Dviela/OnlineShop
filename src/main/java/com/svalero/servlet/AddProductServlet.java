package com.svalero.servlet;

import com.svalero.dao.Database;
import com.svalero.dao.ProductDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add-product")
public class AddProductServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        String name = request.getParameter("name");
        String description = request.getParameter("description");
        int price = Integer.parseInt(request.getParameter("price"));
        String imagePath = request.getServletContext().getInitParameter("image");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Database.connect();
            Database.jdbi.withExtension(ProductDAO.class, dao -> {
                dao.addProduct(name, description, price, imagePath);
                return null;
            });
            response.sendRedirect("insert-product.jsp");
        } catch (ClassNotFoundException cnef){
            cnef.printStackTrace();
        }

    }
}
