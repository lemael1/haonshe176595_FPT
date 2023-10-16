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
import model.Major;
import model.Student;

/**
 *
 * @author 1112v
 */
public class DAO extends DBContext {

    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        String sql = "select * from Student ";
        try {

            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Student s = new Student(rs.getInt("RollCode"), rs.getString("FullName"), rs.getString("DoB"), rs.getString("Gender"));
                list.add(s);

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;

    }

    public List<Major> getAllMajors() {
        List<Major> list = new ArrayList<>();
        String sql = "select * from Major";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Student s = getStudentbyID(rs.getInt("RollCode"));
                Major m = new Major(s, rs.getString("Major"));
                list.add(m);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    //Doc tu bang Major theo rollCode
    public List<Major> getAllMajorbyrollCode(int rollCode) {
        List<Major> list = new ArrayList<>();
        String sql = "SELECT [RollCode]\n"
                + "      ,[Major]\n"
                + "  FROM [dbo].[Major]\n"
                + "  where RollCode=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, rollCode);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Major m = new Major();
                Student s = getStudentbyID(rs.getInt("RollCode"));
                m.setStudent(s);
                m.setMajor(rs.getString("Major"));
                list.add(m);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;

    }

    public Student getStudentbyID(int id) {

        String sql = "select * from Student where id=?";
        try {

            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Student s = new Student(rs.getInt("RollCode"), rs.getString("FullName"), rs.getString("DoB"), rs.getString("Gender"));
                return s;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
}
