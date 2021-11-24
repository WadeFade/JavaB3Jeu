package fr.epsi.b3.bdd;

import fr.epsi.b3.model.User;

import javax.servlet.http.HttpServlet;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class InitializationUsers extends HttpServlet {
    //    Declaration part
    private List<User> users;

    public InitializationUsers() {
        Connection conn = DataSourcePgSQL.conn;
        Statement st = null;
        try {
            assert conn != null;
            st = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet rs = null;
        try {
            assert st != null;
            rs = st.executeQuery("SELECT * FROM public.\"User\";");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        while (true) {
            try {
                assert rs != null;
                if (!rs.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.print("Column 1 returned ");
            try {
                User user = new User(
                        rs.getInt("id"),
                        rs.getString("pseudo"),
                        rs.getString("email"),
                        rs.getInt("gamePlayed"),
                        rs.getInt("score"),
                        rs.getString("password"));
                this.users.add(user);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> getUsers() {
        return users;
    }
}
