/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Comment;
import model.Post;

/**
 *
 * @author admin
 */
public class AllDAO extends DBContext {

    public List<Post> getPosts() {
        List<Post> posts = new ArrayList<>();
        String sql = "select * from post order by id asc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                posts.add(new Post(rs.getInt(1), rs.getString(2), 
                        rs.getDate(3), rs.getBoolean(4), rs.getString(5)));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return posts;
    }
    
    public List<Comment> getCommentsByPID(int pid){
        List<Comment> comments = new ArrayList<>();
        String sql = "select * from comment where pid=? order by id asc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, pid);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                comments.add(new Comment(rs.getInt(1), rs.getString(2),pid));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return comments;
    }
    public int insertComment(String content,int pid){
        
        String sql = "INSERT [Comment] ([content], [pid]) VALUES (?, ?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, content);
            st.setInt(2, pid);
            return st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }
}
