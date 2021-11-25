package fr.epsi.b3.bdd.users;

import fr.epsi.b3.bdd.DataSourcePgSQL;
import fr.epsi.b3.model.User;
import fr.epsi.b3.model.UserScoreComparator;

import javax.servlet.http.HttpServlet;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CrudUsers extends HttpServlet {
    //    Declaration part
    private List<User> users;

    public CrudUsers() {
        this.setDataCrudUsers();
    }

    public void setDataCrudUsers(){
        this.users = new ArrayList<>();
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

                this.users.add(new User(
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

    public List<User> addUser(String pseudo, String email, Integer gamePlayed, Integer score, String password) {
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

            this.users.add(new User(
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
        return this.users;
    }

    public User updateUser(Integer id,String pseudo, String email, Integer gamePlayed, Integer score, String password){
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

            for (int i = 0; i < this.users.size(); i++){
                if(this.users.get(i).getId().equals(id)){
                    return this.users.get(i);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new User();
    }

    public User getUserById(Integer id){
        for (int i = 0; i < this.users.size(); i++){
            if(this.users.get(i).getId().equals(id)){
                return this.users.get(i);
            }
        }
        return new User();
    }

    public User getUserByEmail(String email){
        for (int i = 0; i < this.users.size(); i++){
            if(this.users.get(i).getEmail().equals(email)){
                return this.users.get(i);
            }
        }
        return new User();
    }

    public User getUserByPseudo(String pseudo){
        for (int i = 0; i < this.users.size(); i++){
            if(this.users.get(i).getEmail().equals(pseudo)){
                return this.users.get(i);
            }
        }
        return new User();
    }

    public void getRanking(){
        this.setDataCrudUsers();
        this.users = new ArrayList<>();
        Collections.sort(this.users,new UserScoreComparator());
    }

    public List<User> getUsers() {
        return this.users;
    }
}
