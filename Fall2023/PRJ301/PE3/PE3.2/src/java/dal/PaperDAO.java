/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Paper;

/**
 *
 * @author 1112v
 */
public class PaperDAO extends DBContext {

    public void addPaper(Paper p) throws SQLException {
        String sql = "INSERT INTO [dbo].[Paper]\n"
                + "           ([paperid]\n"
                + "           ,[title]\n"
                + "           ,[publisheddate])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?)";
         PreparedStatement st= connection.prepareStatement(sql);
         st.setInt(1,p.getPaperid());
         st.setString(2,p.getTitle());
         st.setDate(3,p.getPublishedDate());
         st.executeUpdate();
    }
   
    

}
