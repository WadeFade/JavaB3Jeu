package fr.epsi.b3.bdd.users;

import fr.epsi.b3.utils.DataSourcePgSQL;
import fr.epsi.b3.model.User;
import fr.epsi.b3.utils.UserScoreComparator;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;

public class UserDao {
    //    Declaration part
    public static ArrayList<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<>();
        try {
            Connection conn = DataSourcePgSQL.initializationConnection();
            Statement st;
            st = conn.createStatement();
            ResultSet rs;
            rs = st.executeQuery("SELECT * FROM public.\"User\";");
            while (rs.next()) {
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
            return users;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public static void addUser(String pseudo, String email, Integer gamePlayed, Integer score, String password) {
        try {
            Connection conn = DataSourcePgSQL.initializationConnection();
            Statement st = null;
            assert conn != null;

            System.out.println("Insert into user");
            PreparedStatement ps = conn.prepareStatement("INSERT INTO public.\"User\" (pseudo, email, \"gamePlayed\", score, password) VALUES (?, ?, ?, ?, ?);");
            ps.setString(1, pseudo);
            ps.setString(2, email);
            ps.setInt(3, gamePlayed);
            ps.setInt(4, score);
            ps.setString(5, password);
            ps.executeQuery();
            conn.commit();
            assert false;
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void updateUser(Integer id, String pseudo, String email, Integer gamePlayed, Integer score, String
            password) {
        try {
            Connection conn = DataSourcePgSQL.initializationConnection();

            assert conn != null;
            PreparedStatement ps = conn.prepareStatement("UPDATE public.\"User\"" +
                    "\tSET \"pseudo\"=?, \"email\"=?, \"gamePlayed\"=?, \"score\"=?, \"password\"=?" +
                    "\tWHERE \"id\"=?;");
            ps.setString(1, pseudo);
            ps.setString(2, email);
            ps.setInt(3, gamePlayed);
            ps.setInt(4, score);
            ps.setString(5, password);
            ps.setInt(6, id);
            ps.executeUpdate();
            assert false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static User getUserByEmail(String email) {
        try {
            Connection conn = DataSourcePgSQL.initializationConnection();
            Statement st;

            st = conn.createStatement();

            ResultSet rs;
            assert st != null;
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM public.\"User\" WHERE \"email\"=?;");
            ps.setString(1, email);
            rs = ps.executeQuery();

            System.out.println("Get by email");
            User user = null;
            while (rs.next()) {
                user = new User(rs.getInt("id"),
                        rs.getString("pseudo"),
                        rs.getString("email"),
                        rs.getInt("gamePlayed"),
                        rs.getInt("score"),
                        rs.getString("password"));
            }
            System.out.println(user);
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static User getUserByPseudo(String pseudo) {
        try {
            Connection conn = DataSourcePgSQL.initializationConnection();
            Statement st;

            st = conn.createStatement();

            ResultSet rs;
            assert st != null;
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM public.\"User\" WHERE \"pseudo\"=?;");
            ps.setString(1, pseudo);
            rs = ps.executeQuery();

            System.out.println("Get by pseudo");
            User user = null;
            while (rs.next()) {
                user = new User(rs.getInt("id"),
                        rs.getString("pseudo"),
                        rs.getString("email"),
                        rs.getInt("gamePlayed"),
                        rs.getInt("score"),
                        rs.getString("password"));
            }
            System.out.println(user);
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    static public User getUserById(Integer id) {
        try {
            Connection conn = DataSourcePgSQL.initializationConnection();
            Statement st;

            st = conn.createStatement();

            ResultSet rs;
            assert st != null;
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM public.\"User\" WHERE \"id\"=?;");
            ps.setInt(1, id);
            rs = ps.executeQuery();

            User user = null;
            while (rs.next()) {
                user = new User(rs.getInt("id"),
                        rs.getString("pseudo"),
                        rs.getString("email"),
                        rs.getInt("gamePlayed"),
                        rs.getInt("score"),
                        rs.getString("password"));
            }
            System.out.println(user);
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static ArrayList<User> getRanking() {
        ArrayList<User> users = getAllUsers();
        Collections.sort(users, new UserScoreComparator());
        return users;
    }
}
