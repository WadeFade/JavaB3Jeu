package fr.epsi.b3.controller;

import fr.epsi.b3.bdd.users.UserDao;
import fr.epsi.b3.utils.DataSourcePgSQL;
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

@WebServlet(urlPatterns = "/register")
public class RegisterController extends HttpServlet {
    @Resource(name = "PostgreSQL Database")
    private DataSource dataSource;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DataSourcePgSQL.initializationConnection(this.dataSource);
        req.getRequestDispatcher("/WEB-INF/views/register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DataSourcePgSQL.initializationConnection(this.dataSource);
        String email = req.getParameter("email");
        String pseudo = req.getParameter("pseudo");
        String password = req.getParameter("password");

//        generation du hash du password
        String hashPassword =  BCrypt.hashpw(password, BCrypt.gensalt(11));

        if(UserDao.getUserByEmail(email) == null && UserDao.getUserByPseudo(pseudo) == null){
            // on crée l'utilisateur
            System.out.println("add user and go login");
            UserDao.addUser(pseudo,email,0,0,hashPassword);
            resp.sendRedirect(req.getContextPath() + "/login");
//            req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
        } else{
            System.out.println("else register class");
        }
    }
}
