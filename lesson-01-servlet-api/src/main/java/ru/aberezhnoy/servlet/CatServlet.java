package ru.aberezhnoy.servlet;

import ru.aberezhnoy.model.Cat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CatServlet", urlPatterns = "/cat")
public class CatServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setAttribute("cat", createCat());
        getServletContext().getRequestDispatcher("/cat.jsp")
                .forward(req, res);
    }

    private Cat createCat() {
        List<Cat> cats = List.of(
                new Cat("Murzik", 1, null),
                new Cat("Snezhok", 1, null)
        );
        return Cat.builder()
                .name("Barsik")
                .age(3)
                .children(cats)
                .build();
    }
}
