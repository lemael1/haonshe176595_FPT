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
import model.Student;

/**
 *
 * @author 1112v
 */
public class DAO extends DBContext {

    public List<Student> GetAllStudents() {
        List<Student> list = new ArrayList<>();
        String sql = "select * from Student";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Student s = new Student();
                s.setSid(rs.getInt("sid"));
                s.setName(rs.getString("name"));
                s.setGender(rs.getInt("gender"));
                s.setDob(rs.getDate("dob"));
                list.add(s);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;

    }

    public static void main(String[] args) {
        DAO d = new DAO();
        List<Student> list = d.GetAllStudents();
        System.out.println(list.get(1).getName());
    }

    public List<Student> getStudentbyChar(String char_raw) {
        DAO d = new DAO();
        List<Student> fullList = d.GetAllStudents();
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < fullList.size(); i++) {
            if (fullList.get(i).getName().contains(char_raw)) {
                list.add(fullList.get(i));
            }
        }
        return list;

    }
}
