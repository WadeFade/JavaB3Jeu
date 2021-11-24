package fr.epsi.b3.controller;

import fr.epsi.b3.bdd.DataSourcePgSQL;
import fr.epsi.b3.bdd.InitializationUsers;
import fr.epsi.b3.model.User;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/accueil")
public class HomeController extends HttpServlet {
    @Resource(name = "PostgreSQL Database")
    private DataSource dataSource;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/accueil.jsp").forward(req, resp);
        DataSourcePgSQL.initializationConnection(this.dataSource);

        InitializationUsers initializationUsers = new InitializationUsers();
        initializationUsers.init();
        List<User> users = initializationUsers.getUsers();
        System.out.println(users.get(1).toString());
    }
}
