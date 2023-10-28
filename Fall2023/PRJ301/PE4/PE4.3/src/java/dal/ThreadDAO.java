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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Thread;

/**
 *
 * @author 1112v
 */
public class ThreadDAO extends DBContext{
    public List<Thread> GetAllThread(){
        String sql="select * from Thread";
        List<Thread> list= new ArrayList<>();
        try {
            PreparedStatement st= connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while (rs.next()) {
              Thread t= new Thread();
              t.setTid(rs.getInt("tid"));
              t.setTcontent(rs.getString("tcontent"));
              list.add(t);               
            }           
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;        
    }
    public Thread getThreadById(int id) {
        Thread t = null;
        try {
            String sql = "SELECT [tid], [tcontent] "
                    + "FROM [dbo].[Thread] "
                    + "WHERE [tid] = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                t = new Thread();
                t.setTid(rs.getInt("tid"));
                t.setTcontent(rs.getString("tcontent"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return t;
    }
}
