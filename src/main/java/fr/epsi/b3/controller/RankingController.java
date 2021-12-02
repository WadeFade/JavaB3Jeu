package fr.epsi.b3.controller;

import fr.epsi.b3.utils.DataSourcePgSQL;
import fr.epsi.b3.bdd.users.UserDao;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;

@WebServlet(urlPatterns = "/rank")
public class RankingController extends HttpServlet {
    @Resource(name = "PostgreSQL Database")
    private DataSource dataSource;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DataSourcePgSQL.initializationConnection(this.dataSource);
        req.setAttribute("users", UserDao.getRanking());
        req.getRequestDispatcher("/WEB-INF/views/ranking.jsp").forward(req, resp);
    }
}
