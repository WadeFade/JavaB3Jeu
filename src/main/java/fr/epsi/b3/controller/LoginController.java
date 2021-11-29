package fr.epsi.b3.controller;

import fr.epsi.b3.bdd.DataSourcePgSQL;
import fr.epsi.b3.bdd.users.CrudUsers;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.util.Objects;

@WebServlet(urlPatterns = "/")
public class LoginController extends HttpServlet {
    @Resource(name = "PostgreSQL Database")
    private DataSource dataSource;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
        DataSourcePgSQL.initializationConnection(this.dataSource);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String password = req.getParameter("password");

        if (Objects.equals(Objects.requireNonNull(CrudUsers.getUserByEmail(email)).getPassword(), password)) {
            req.getSession().setAttribute("user", Objects.requireNonNull(CrudUsers.getUserByEmail(email)).getId());
            System.out.println("ID : " + req.getSession().getAttribute("user"));
            System.out.println(req.getContextPath() + "/accueil");
//            req.getRequestDispatcher(req.getContextPath() + "/accueil").forward(req, resp);
            resp.sendRedirect(req.getContextPath() + "/accueil");
        } else {
            System.out.println("mauvais email/mdp");
        }
    }
}
