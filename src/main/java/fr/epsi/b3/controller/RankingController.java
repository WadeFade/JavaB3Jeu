package fr.epsi.b3.controller;

import fr.epsi.b3.bdd.users.CrudUsers;
import fr.epsi.b3.beans.Expression;
import fr.epsi.b3.model.User;

import javax.script.ScriptException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/rank")
public class RankingController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = CrudUsers.getRanking();

        req.setAttribute("users", users);

        req.getRequestDispatcher("/WEB-INF/views/ranking.jsp").forward(req, resp);
    }
}
