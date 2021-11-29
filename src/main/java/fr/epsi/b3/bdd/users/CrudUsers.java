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
    private ArrayList<User> users;

    public CrudUsers() {
        this.setDataCrudUsers();
    }

    public void setDataCrudUsers(){
        this.users = new ArrayList<>();
        Connection conn = DataSourcePgSQL.initializationConnection();
        Statement st;
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

    static public void addUser(String pseudo, String email, Integer gamePlayed, Integer score, String password)  {
    public User addUser(String pseudo, String email, Integer gamePlayed, Integer score, String password) throws SQLException {
        Connection conn = DataSourcePgSQL.initializationConnection();
        Statement st = null;
        assert conn != null;

        PreparedStatement ps = conn.prepareStatement("INSERT INTO public.\"User\" (pseudo, email, gamePlayed, score, password) VALUES (?, ?, ?, ?, ?);");
        ps.setString(1, pseudo);
        ps.setString(2, email);
        ps.setInt(3, gamePlayed);
        ps.setInt(4, score);
        ps.setString(5, password);
        ResultSet rs = ps.executeQuery();
        conn.commit();
        User newUser = new User(
                rs.getInt("id"),
                rs.getString("pseudo"),
                rs.getString("email"),
                rs.getInt("gamePlayed"),
                rs.getInt("score"),
                rs.getString("password"));
        rs.close();
        st.close();

        return newUser;
    }

    public void updateUser(Integer id, String pseudo, String email, Integer gamePlayed, Integer score, String password) throws SQLException {
        Connection conn = DataSourcePgSQL.initializationConnection();
        Statement st = null;

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
    }

    public User getUserByEmail(String email) {
        try {
            Connection conn = DataSourcePgSQL.initializationConnection();
            Statement st;

            st = conn.createStatement();

            ResultSet rs;
            assert st != null;
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM public.\"User\" WHERE \"email\"=?;");
            ps.setString(1, email);
            rs = ps.executeQuery();
            rs.next();

            User user = new User(rs.getInt("id"),
                    rs.getString("pseudo"),
                    rs.getString("email"),
                    rs.getInt("gamePlayed"),
                    rs.getInt("score"),
                    rs.getString("password"));
            System.out.println(user);
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public User getUserById(Integer id) {
        try {
            Connection conn = DataSourcePgSQL.initializationConnection();
            Statement st;

            st = conn.createStatement();

            ResultSet rs;
            assert st != null;
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM public.\"User\" WHERE \"id\"=?;");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            rs.next();

            User user = new User(rs.getInt("id"),
                    rs.getString("pseudo"),
                    rs.getString("email"),
                    rs.getInt("gamePlayed"),
                    rs.getInt("score"),
                    rs.getString("password"));
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
            ps.setString(1, id);
            rs = ps.executeQuery();
            rs.next();

            User user = new User(rs.getInt("id"),
                    rs.getString("pseudo"),
                    rs.getString("email"),
                    rs.getInt("gamePlayed"),
                    rs.getInt("score"),
                    rs.getString("password"));
            System.out.println(user);
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    static public User getUserByEmail(String email) {
        try {
            Connection conn = DataSourcePgSQL.initializationConnection();
            Statement st;

            st = conn.createStatement();

            ResultSet rs;
            assert st != null;
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM public.\"User\" WHERE \"email\"=?;");
            ps.setString(1, email);
            rs = ps.executeQuery();
            rs.next();

            User user = new User(rs.getInt("id"),
                    rs.getString("pseudo"),
                    rs.getString("email"),
                    rs.getInt("gamePlayed"),
                    rs.getInt("score"),
                    rs.getString("password"));
            System.out.println(user);
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    static public ArrayList<User> getRanking() {
        setDataCrudUsers();
        Collections.sort(users, new UserScoreComparator());
    public ArrayList<User> getRanking() {
        this.setDataCrudUsers();
        Collections.sort(this.users, new UserScoreComparator());
        return users;
    }

    public ArrayList<User> getUsers() {
        return this.users;
    }
}
