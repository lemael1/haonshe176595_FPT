/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import DTO.MemberDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Group;

/**
 *
 * @author 1112v
 */
public class DAO extends DBContext {

    public List<Group> GetAllGroup() {
        String sql = "select * from GroupTBL";
        List<Group> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Group g = new Group();
                g.setGid(rs.getInt("gid"));
                g.setGname(rs.getString("gname"));
                list.add(g);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public List<MemberDTO> GetMemberbygid(int gid) {
        List<MemberDTO> list = new ArrayList<>();
        String sql = "SELECT [mid]\n"
                + "      ,[mname]\n"
                + "      ,[gender]\n"
                + "      ,[dob]\n"
                + "      ,[gid]\n"
                + "      ,[created_by]\n"
                + "  FROM [dbo].[MemberTBL] ";
        if (gid != 0) {
            sql = sql + " where gid=?";
        }
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, gid); // Sử dụng biến userid
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                MemberDTO m = new MemberDTO();
                m.setMid(rs.getInt(1));
                m.setMname(rs.getString(2));
                m.setGender(rs.getBoolean(3));
                m.setDob(rs.getDate(4));
                m.setGid(gid);
                m.setCreated_by(rs.getString(6));
                list.add(m);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;

    }

}
