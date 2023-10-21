package dal;

import dto.Author;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBContext {
    protected Connection connection;

    public DBContext() {
        try {
            // Sử dụng tùy chọn để tắt SSL và bật chứng chỉ tự ký
            String url = "jdbc:sqlserver://localhost:1433;databaseName=PRJ321_FALL20_B5;encrypt=false;trustServerCertificate=true";
            String username = "sa";
            String password = "1111";

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }
    public List<Author> getAuthor() {
        List<Author> list = new ArrayList<>();
        String sql = "select * from Author";
        try {

            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Author a = new Author();
                a.setAuthorid(rs.getInt("authorid"));
                a.setAuthorname(rs.getString("authorname"));

                list.add(a);

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;

    }
}
