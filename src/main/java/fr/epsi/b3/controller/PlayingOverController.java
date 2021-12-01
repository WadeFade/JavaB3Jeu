package fr.epsi.b3.controller;

import fr.epsi.b3.bdd.users.UserDao;
import fr.epsi.b3.beans.Expression;
import fr.epsi.b3.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/playing-over")
public class PlayingOverController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        float note = Float.parseFloat(String.valueOf(session.getAttribute("note") == null ? 0 : session.getAttribute("note")));
        req.setAttribute("note", String.valueOf(note));

        if (note > 0) {
            User user = UserDao.getUserById((Integer) session.getAttribute("user"));
            assert user != null;
//            On update le score
            UserDao.updateUser(user.getId(), user.getPseudo(), user.getEmail(),
                    user.getGamePlayed(), (int) (user.getScore() + note), user.getPassword());
        }

        req.getRequestDispatcher("/WEB-INF/views/playing_over.jsp").forward(req, resp);
    }
}
