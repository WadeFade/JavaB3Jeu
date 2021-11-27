package fr.epsi.b3.bdd.users;

import fr.epsi.b3.bdd.DataSourcePgSQL;
import fr.epsi.b3.model.User;
import fr.epsi.b3.model.UserScoreComparator;

import javax.servlet.http.HttpServlet;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;

public class CrudUsers extends HttpServlet {
    //    Declaration part
    static ArrayList<User> users;

    static public void setDataCrudUsers() {
        users = new ArrayList<>();
        Connection conn = DataSourcePgSQL.initializationConnection();
        Statement st = null;
        try {
            assert conn != null;
            st = conn.createStatement();

            ResultSet rs;
            assert st != null;
            rs = st.executeQuery("SELECT * FROM public.\"User\";");
            while (true) {
                assert rs != null;
                if (!rs.next()) break;
                System.out.print("Column returned");

                users.add(new User(
                        rs.getInt("id"),
                        rs.getString("pseudo"),
                        rs.getString("email"),
                        rs.getInt("gamePlayed"),
                        rs.getInt("score"),
                        rs.getString("password")));
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static public ArrayList<User> addUser(String pseudo, String email, Integer gamePlayed, Integer score, String password) {
        Connection conn = DataSourcePgSQL.initializationConnection();
        Statement st = null;
        try {
            assert conn != null;
            PreparedStatement ps = conn.prepareStatement("INSERT INTO public.\"User\" (pseudo, email, gamePlayed, score, password) VALUES (?, ?, ?, ?, ?);");
            ps.setString(1, pseudo);
            ps.setString(2, email);
            ps.setInt(3, gamePlayed);
            ps.setInt(4, score);
            ps.setString(5, password);
            ResultSet rs = ps.executeQuery();
            conn.commit();

            users.add(new User(
                    rs.getInt("id"),
                    rs.getString("pseudo"),
                    rs.getString("email"),
                    rs.getInt("gamePlayed"),
                    rs.getInt("score"),
                    rs.getString("password")));

            rs.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    static public User updateUser(Integer id, String pseudo, String email, Integer gamePlayed, Integer score, String password) {
        Connection conn = DataSourcePgSQL.initializationConnection();
        Statement st = null;
        try {
            assert conn != null;
            PreparedStatement ps = conn.prepareStatement("UPDATE public.\"User\"" +
                    "\tSET \"pseudo\"=?, \"email\"=?, \"gamePlayed\"=?, \"score\"=?, \"password\"=?" +
                    "\tWHERE \"id\"=?;");
            ps.setString(1, pseudo);
            ps.setString(2, email);
            ps.setInt(3, gamePlayed);
            ps.setInt(4, score);
            ps.setString(5, password);
            int rs = ps.executeUpdate();
            conn.commit();
            st.close();

            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getId().equals(id)) {
                    users.set(i, new User(id,
                            pseudo,
                            email,
                            gamePlayed,
                            score,
                            password));
                    return users.get(i);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new User();
    }

    static public User getUserById(Integer id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)) {
                return users.get(i);
            }
        }
        return new User();
    }

    static public User getUserByEmail(String email) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getEmail().equals(email)) {
                return users.get(i);
            }
        }
        return new User();
    }

    static public User getUserByPseudo(String pseudo) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getEmail().equals(pseudo)) {
                return users.get(i);
            }
        }
        return new User();
    }

    static public ArrayList<User> getRanking() {
        setDataCrudUsers();
        Collections.sort(users, new UserScoreComparator());
        return users;
    }

    static public ArrayList<User> getUsers() {
        return users;
    }
}
