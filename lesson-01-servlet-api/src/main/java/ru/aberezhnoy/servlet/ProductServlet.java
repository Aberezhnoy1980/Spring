package ru.aberezhnoy.servlet;

import ru.aberezhnoy.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {


    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setAttribute("product", products);
        getServletContext().getRequestDispatcher("/products.jsp")
                .forward(req, res);
    }

    ArrayList<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1L, "Product1", new BigDecimal("12.50")),
            new Product(2L, "Product2", new BigDecimal("123.65")),
            new Product(3L, "Product3", new BigDecimal("45.98")),
            new Product(4L, "Product4", new BigDecimal("92.65")),
            new Product(5L, "Product5", new BigDecimal("73.11")),
            new Product(6L, "Product6", new BigDecimal("56.99")),
            new Product(7L, "Product7", new BigDecimal("176.44")),
            new Product(8L, "Product8", new BigDecimal("10.00")),
            new Product(9L, "Product9", new BigDecimal("990.22")),
            new Product(10L, "Product10", new BigDecimal("999.99"))
    ));


}
