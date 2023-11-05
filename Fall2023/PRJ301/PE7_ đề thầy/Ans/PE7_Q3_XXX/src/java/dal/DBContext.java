package dal;

import dto.StudentDTO;
import dto.SubjectDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author FPT University - PRJ30X
 */
public class DBContext {

    protected Connection connection;

    public DBContext() {
        //@Students: You are allowed to edit user, pass, url variables to fit 
        //your system configuration
        //You can also add more methods for Database Interaction tasks. 
        //But we recommend you to do it in another class
        // For example : StudentDBContext extends DBContext , 
        //where StudentDBContext is located in dal package, 
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Y23SU1B5;encrypt=false;";
            String username = "sa";
            String password = "1111";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<SubjectDTO> getAllSubjects() throws SQLException {
        ArrayList<SubjectDTO> lst_sbjs = new ArrayList<>();
        String sql = "select * from Subjects";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            String id = rs.getString(1);
            String name = rs.getString(2);
            SubjectDTO u = new SubjectDTO(id, name);
            lst_sbjs.add(u);
        }
        return lst_sbjs;
    }
    
    
    public ArrayList<StudentDTO> getAllStudents() throws SQLException {
        ArrayList<StudentDTO> lst_stds = new ArrayList<>();
        String sql = "select su.StudentID, su.StudentName, su.BirthDate, su.Gender, s.SubjectName from Subjects s join Students su on s.SubjectID= su.SubjectID";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            String id = rs.getString(1);
            String name = rs.getString(2);
            Date dob = rs.getDate(3);
            Boolean gender = rs.getBoolean(4);
            String subject = rs.getString(5);
            StudentDTO u = new StudentDTO(id, name, subject, dob, gender);
            lst_stds.add(u);
        }
        return lst_stds;
    }
    
    public ArrayList<StudentDTO> getStudentBySb(String subject_code) throws SQLException {
        ArrayList<StudentDTO> lst_stds = new ArrayList<>();
        String sql = "select su.StudentID, su.StudentName, su.BirthDate, su.Gender, s.SubjectName from Subjects s join Students su on s.SubjectID= su.SubjectID where s.SubjectID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, subject_code);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            String id = rs.getString(1);
            String name = rs.getString(2);
            Date dob = rs.getDate(3);
            Boolean gender = rs.getBoolean(4);
            String subject = rs.getString(5);
            StudentDTO u = new StudentDTO(id, name, subject, dob, gender);
            lst_stds.add(u);
        }
        return lst_stds;
    }
    public StudentDTO getStudentByID(String student_code) throws SQLException {
        String sql = "select su.StudentID, su.StudentName, su.BirthDate, su.Gender, s.SubjectName from Subjects s join Students su on s.SubjectID= su.SubjectID where su.StudentID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, student_code);
        ResultSet rs = statement.executeQuery();
        StudentDTO u = null;
        while (rs.next()) {
            String id = rs.getString(1);
            String name = rs.getString(2);
            Date dob = rs.getDate(3);
            Boolean gender = rs.getBoolean(4);
            String subject = rs.getString(5);
            u = new StudentDTO(id, name, subject, dob, gender);
        }
        return u;
    }

    public static void main(String[] args) throws SQLException {
        DBContext db = new DBContext();
        db.getAllSubjects();
    }
}
