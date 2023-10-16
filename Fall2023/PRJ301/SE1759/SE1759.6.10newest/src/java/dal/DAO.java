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
        String sql = "select s.RollCode,s.FullName,s.DoB,s.Gender,m.Major \n"
                + "from Student s join Major m on s.RollCode=m.RollCode";
        try {

            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Student s = new Student();
                s.setRollCode(rs.getInt("RollCode"));
                s.setFullName(rs.getString("FullName"));
                s.setDoB(rs.getString("DoB"));
                s.setGender(rs.getString("Gender"));
                Major m = new Major();
                m.setRollCode(rs.getInt("RollCode"));
                m.setMajor(rs.getString("Major"));
                s.setMajor(m);

                list.add(s);

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;

    }

    public Student getStudent(int rollCode) {
        String sql = "select s.RollCode,s.FullName,s.DoB,s.Gender,m.Major \n"
                + "from Student s join Major m on s.RollCode=m.RollCode where s.RollCode = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, rollCode);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Student s = new Student();
                s.setRollCode(rs.getInt("RollCode"));
                s.setFullName(rs.getString("FullName"));
                s.setDoB(rs.getString("DoB"));
                s.setGender(rs.getString("Gender"));
                Major m = new Major();
                m.setRollCode(rs.getInt("RollCode"));
                m.setMajor(rs.getString("Major"));
                s.setMajor(m);
                return s;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public boolean addStudent(Student student) throws SQLException {
        String sqlStudent = "INSERT INTO Student (RollCode, FullName, DoB, Gender) VALUES (?, ?, ?, ?)";
        String sqlMajor = "INSERT INTO Major (RollCode, Major) VALUES (?, ?)";
        PreparedStatement stStudent = connection.prepareStatement(sqlStudent);
        stStudent.setInt(1, student.getRollCode());
        stStudent.setString(2, student.getFullName());
        stStudent.setString(3, student.getDoB());
        stStudent.setString(4, student.getGender());
        stStudent.executeUpdate();
        PreparedStatement stMajor = connection.prepareStatement(sqlMajor);
        stMajor.setInt(1, student.getRollCode());
        stMajor.setString(2, student.getMajor().getMajor());
        stMajor.executeUpdate();

        return true;
    }

   public List<Student> getStudentsSortedByGender() {
    List<Student> list = new ArrayList<>();
    String sql = "SELECT s.RollCode, s.FullName, s.DoB, s.Gender, m.Major "
               + "FROM Student s JOIN Major m ON s.RollCode = m.RollCode "
               + "ORDER BY s.Gender";
    try {
        PreparedStatement st = connection.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            Student s = new Student();
            s.setRollCode(rs.getInt("RollCode"));
            s.setFullName(rs.getString("FullName"));
            s.setDoB(rs.getString("DoB"));
            s.setGender(rs.getString("Gender"));
            Major m = new Major();
            m.setRollCode(rs.getInt("RollCode"));
            m.setMajor(rs.getString("Major"));
            s.setMajor(m);
            list.add(s);
        }
    } catch (SQLException e) {
        System.out.println(e);
    }
    return list;
}

public List<Student> getStudentsSortedByMajor() {
    List<Student> list = new ArrayList<>();
    String sql = "SELECT s.RollCode, s.FullName, s.DoB, s.Gender, m.Major "
               + "FROM Student s JOIN Major m ON s.RollCode = m.RollCode "
               + "ORDER BY m.Major";
    try {
        PreparedStatement st = connection.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            Student s = new Student();
            s.setRollCode(rs.getInt("RollCode"));
            s.setFullName(rs.getString("FullName"));
            s.setDoB(rs.getString("DoB"));
            s.setGender(rs.getString("Gender"));
            Major m = new Major();
            m.setRollCode(rs.getInt("RollCode"));
            m.setMajor(rs.getString("Major"));
            s.setMajor(m);
            list.add(s);
        }
    } catch (SQLException e) {
        System.out.println(e);
    }
    return list;
}

}
