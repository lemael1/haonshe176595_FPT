/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

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
public class CandidateDAO extends DBContext {

    public List<Candidate> GetAllCandidates() {
        String sql = "select * from CandidateTBL";
        List<Candidate> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Candidate c = new Candidate();
                c.setCid(rs.getInt("cid"));
                c.setCname(rs.getString("cname"));
                c.setGender(rs.getInt("gender"));
                c.setDob(rs.getDate("dob"));
                GroupDAO gD = new GroupDAO();
                Group g = gD.getGroupbygid(rs.getInt("gid"));
                c.setGroup(g);
                c.setCreated_by(rs.getString("created_by"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

}
