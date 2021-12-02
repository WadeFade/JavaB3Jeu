package fr.epsi.b3.controller;


import fr.epsi.b3.beans.Expression;

import javax.script.ScriptException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.*;

@WebServlet(urlPatterns = "/playing")
public class PlayingController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        HttpSession session = req.getSession();
        int resultatJoueur = Integer.parseInt(String.valueOf(req.getParameter("reponsePrecedente") == null || req.getParameter("reponsePrecedente").equals("") ? 0 : req.getParameter("reponsePrecedente")));

        int step = Integer.parseInt(String.valueOf(session.getAttribute("step") == null ? -1 : session.getAttribute("step")));
        if (step == 10) {
            // todo magie

            step = -1;
            session.setAttribute("step", step);
            resp.sendRedirect("playing-over");
        } else {
            step += 1;

            session.setAttribute("step", step);
            req.setAttribute("step", String.valueOf(step * 10));


            if (step == 0) {
                session.setAttribute("note", 0);
            } else {
                int pastResult = Integer.parseInt(String.valueOf(session.getAttribute("pastResult")));

                session.setAttribute("note", Float.parseFloat(String.valueOf(session.getAttribute("note"))) + Expression.noteExpression(resultatJoueur, pastResult));
            }


            Expression expression = null;
            try {
                expression = new Expression();
            } catch (ScriptException e) {
                e.printStackTrace();
            }

            assert expression != null;
            session.setAttribute("pastResult", expression.getResult());
            req.setAttribute("expression", expression.toString());


            req.getRequestDispatcher("/WEB-INF/views/playing.jsp").forward(req, resp);
        }
    }


}
