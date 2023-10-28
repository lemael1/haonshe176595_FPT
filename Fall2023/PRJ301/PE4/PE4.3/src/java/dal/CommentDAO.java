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
import model.Account;
import model.Comment;

/**
 *
 * @author 1112v
 */
// int cid;
//    String ctitle;
//    Account account;
//    Thread thread;
public class CommentDAO extends DBContext {

    public List<Comment> GetAllComment() {
        String sql = "select * from Comment";
        List<Comment> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Comment c = new Comment();
                c.setCid(rs.getInt("cid"));
                c.setCtitle(rs.getString("ctitle"));
                AccountDAO accDAO = new AccountDAO();
                Account a = accDAO.getAccoutbyUserID(rs.getString("userid"));
                c.setAccount(a);
                ThreadDAO thDAO = new ThreadDAO();
                model.Thread th = thDAO.getThreadById(rs.getInt("tid"));
                c.setThread(th);
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;

    }

    public void insertComment(int cid, String ctitle, String userid, int tid) throws SQLException {
        String sql = "INSERT INTO [dbo].[Comment]"
                + "([cid], [ctitle], [userid], [tid])"
                + "VALUES (?, ?, ?, ?)";
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, cid);
        st.setString(2, ctitle);
        st.setString(3, userid);
        st.setInt(4, tid);
        st.executeUpdate();
    }

    public int nextid() {
        int id;
        CommentDAO cmtDAO = new CommentDAO();
        List<Comment> list = cmtDAO.GetAllComment();
        id = list.get(list.size() - 1).getCid() + 1;
        return id;
    }

}
