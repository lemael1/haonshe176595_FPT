/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Group;

/**
 *
 * @author 1112v
 */
public class GroupDAO extends DBContext {

    public Group getGroupbygid(int gid) {
        Group g= new Group();
        String sql = "SELECT [gid]\n"
                + "      ,[gname]\n"
                + "  FROM [dbo].[GroupTBL]\n"
                + "   where gid=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, gid); // Sử dụng biến userid
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                g.setGid(rs.getInt("gid"));
                g.setGname(rs.getString("gname"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return g;
    }

}
