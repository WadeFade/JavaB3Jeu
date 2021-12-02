package fr.epsi.b3.controller;

import fr.epsi.b3.model.User;
import fr.epsi.b3.utils.DataSourcePgSQL;
import fr.epsi.b3.bdd.users.UserDao;
import org.mindrot.jbcrypt.BCrypt;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.util.Objects;

@WebServlet(urlPatterns = "/login")
public class LoginController extends HttpServlet {
    @Resource(name = "PostgreSQL Database")
    private DataSource dataSource;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DataSourcePgSQL.initializationConnection(this.dataSource);
        req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DataSourcePgSQL.initializationConnection(this.dataSource);

        String email = req.getParameter("email");
        String password = req.getParameter("password");

        User user = UserDao.getUserByEmail(email);
        if (user != null) {
            if (BCrypt.checkpw(password, user.getPassword())) {
                req.getSession().setAttribute("user", user.getId());
//                req.getRequestDispatcher("/accueil").forward(req, resp);
                req.getRequestDispatcher("/WEB-INF/views/accueil.jsp").forward(req, resp);
//                resp.sendRedirect(req.getContextPath() + "/accueil");
//                resp.sendRedirect("accueil");
            }
        }
        // error
        resp.sendRedirect(req.getContextPath() + "/login");
    }
}
