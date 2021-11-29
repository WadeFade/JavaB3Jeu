package fr.epsi.b3.controller;

import fr.epsi.b3.bdd.DataSourcePgSQL;
import fr.epsi.b3.bdd.users.CrudUsers;
import fr.epsi.b3.beans.Expression;
import fr.epsi.b3.model.User;

import javax.annotation.Resource;
import javax.script.ScriptException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/rank")
public class RankingController extends HttpServlet {
    @Resource(name = "PostgreSQL Database")
    private DataSource dataSource;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DataSourcePgSQL.initializationConnection(this.dataSource);
        req.setAttribute("users", CrudUsers.getRanking());
        req.getRequestDispatcher("/WEB-INF/views/ranking.jsp").forward(req, resp);
    }
}
