/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import DTO.Info2DTO;
import DTO.InfoDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Candidate;
import model.Group;

/**
 *
 * @author 1112v
 */
public class DAO extends DBContext {

    public List<InfoDTO> GetAllInfo(String type) {
        String sql = null;
        if (type.equals("Candidate")) {
            sql = "select c.cid,c.cname,c.gender,c.dob,g.gname from CandidateTBL c join GroupTBL g on c.gid=g.gid";
        } else if (type.equals("Member")) {
            sql = " select m.mid,m.mname,m.gender,m.dob,g.gname from MemberTBL m join GroupTBL g on m.gid=g.gid";
        }
        List<InfoDTO> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                InfoDTO i = new InfoDTO();
                i.setId(rs.getInt(1));
                i.setName(rs.getString(2));
                i.setGender(rs.getBoolean(3));
                i.setDob(rs.getDate(4));
                i.setGroupname(rs.getString(5));
                list.add(i);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public Info2DTO GetAllInfo2(int id, String type) {
        String sql = null;
        if (type.equals("Candidate")) {
            sql = "select c.cname,c.gender,c.dob,g.gname,c.created_by from CandidateTBL c join GroupTBL g on c.gid=g.gid where c.cid=?";
        } else if (type.equals("Member")) {
            sql = " select m.mname,m.gender,m.dob,g.gname,m.created_by from MemberTBL m join GroupTBL g on m.gid=g.gid where m.mid=?";
        }
        Info2DTO i = new Info2DTO();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
           if(rs.next()) { // Ensure there is a result before accessing it
            i.setName(rs.getString(1));
            i.setGender(rs.getBoolean(2));
            i.setDob(rs.getDate(3));
            i.setGroupname(rs.getString(4));
            i.setCreated_by(rs.getString(5));
        }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return i;
    }

    public static void main(String[] args) {
        DAO d = new DAO();
        System.out.println(d.GetAllInfo2(1,"Candidate").getName());
    }
}
