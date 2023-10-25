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
import model.Author;
import model.Paper;

/**
 *
 * @author 1112v
 */
public class DAO extends DBContext {

    public List<Author> getAllAuthors() {
        List<Author> list = new ArrayList<>();
        String sql = "select * from Author";
        try {

            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Author a = new Author();
                a.setAuthorid(rs.getInt("authorid"));
                a.setAuthorname(rs.getString("authorname"));

                list.add(a);

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;

    }

    public List<Paper> getAllPaperbyAuId(int id) {
        List<Paper> list = new ArrayList<>();
        String sql = "SELECT P.paperid, P.title, P.publisheddate\n"
                + "FROM Author_Paper AP\n"
                + "JOIN Paper P ON AP.paperid = P.paperid\n"
                + "WHERE AP.authorid =?";
        try {
            PreparedStatement st= connection.prepareStatement(sql);   
             st.setInt(1, id);
             ResultSet rs=st.executeQuery();
             while (rs.next()) {
                 Paper p= new Paper();
                 p.setPaperid(rs.getInt("paperid"));
                 p.setTitle(rs.getString("title"));
                 p.setPublishedDate(rs.getDate("publisheddate"));      
                 list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
  

    public static void main(String[] args) {
        DAO d = new DAO();
        System.out.println(d.getAllAuthors().get(0).getAuthorname());
    }
}
