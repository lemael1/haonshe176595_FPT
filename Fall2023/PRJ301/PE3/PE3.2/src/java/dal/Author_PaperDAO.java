package dal;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Author_PaperDAO extends DBContext{

    public void addAuthor_Paper(int paperId, int authorId) throws SQLException {
        String sql = "INSERT INTO [dbo].[Author_Paper] ([paperid], [authorid]) VALUES (?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, paperId);
        statement.setInt(2, authorId);

        statement.executeUpdate();

    }
}
