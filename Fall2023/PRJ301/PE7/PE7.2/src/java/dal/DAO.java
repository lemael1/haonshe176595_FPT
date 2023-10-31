/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Candidate;
import model.Group;
import model.User;

/**
 *
 * @author 1112v
 */
public class DAO extends DBContext {

    public List<User> GetAllUser() {
        String sql = "select * from UserTBL";
        List<User> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                u.setDisplayname(rs.getString("displayname"));
                list.add(u);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public User getUser(String username, String password) {
        User u = new User();
        String sql = "SELECT [username]\n"
                + "      ,[password]\n"
                + "      ,[displayname]\n"
                + "  FROM [dbo].[UserTBL]\n"
                + "  where username=? and password=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                u.setDisplayname(rs.getString("displayname"));

            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return u;
    }

    public String CheckAccount(String username, String password) {
        String msg = "";

        DAO d = new DAO();
        List<User> list = d.GetAllUser();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(username) && list.get(i).getPassword().equals(password)) {
                msg = "Login successfully";
                break;
            } else {
                msg = "Login failed";
            }
        }
        return msg;
    }

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
public List<Candidate> GetAllCandidate() {
        String sql = "select * from CandidateTBL";
        List<Candidate> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Candidate c= new Candidate();
                c.setCid(rs.getInt("cid"));
                c.setCname(rs.getString("cname"));
                c.setGender(rs.getBoolean("gender"));
                c.setDob(rs.getDate("dob"));
                c.setGid(rs.getInt("gid"));
                c.setCreated_by(rs.getString("created_by"));
                list.add(c);
                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    public void insertCandidate(String name, int gender, String dob, int gid, String createdBy) {
        try {
            String sql ="INSERT INTO [CandidateTBL]\n" +
                        "           ([cname]\n" +
                        "           ,[gender]\n" +
                        "           ,[dob]\n" +
                        "           ,[gid]\n" +
                        "           ,[created_by])\n" +
                        "     VALUES\n" +
                        "           (?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, gender);
            ps.setString(3, dob);
            ps.setInt(4, gid);
            ps.setString(5, createdBy);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int nextid() {
        int id;
        DAO d= new DAO();
        List<Candidate> list = d.GetAllCandidate();
        id = list.get(list.size() - 1).getCid() + 1;
        return id;
    }
    public static void main(String[] args) {
        DAO d= new DAO();
        System.out.println(d.GetAllCandidate().get(0).getCname());
    }
}

//[cid] [int] IDENTITY(1,1) NOT NULL,
//	[cname] [varchar](150) NOT NULL,
//	[gender] [bit] NOT NULL,
//	[dob] [date] NOT NULL,
//	[gid] [int] NOT NULL,
//	[created_by] [varchar](150) NOT NULL,
