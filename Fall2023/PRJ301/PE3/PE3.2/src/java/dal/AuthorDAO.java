package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Author;

public class AuthorDAO extends DBContext {

    public List<Author> getAuthors() {
        List<Author> authors = new ArrayList<>();
        try {
            String sql = "SELECT [authorid], [authorname] FROM [dbo].[Author]";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Author a = new Author();
                a.setAuthorid(rs.getInt("authorid"));
                a.setAuthorname(rs.getString("authorname"));

                authors.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return authors;
    }
}
