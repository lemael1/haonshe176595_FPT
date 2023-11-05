/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import DTO.InfoDTO;
import DTO.Subject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1112v
 */
public class DAO extends DBContext {

    public List<Subject> GetAllSubject() {
        String sql = "select * from Subjects";
        List<Subject> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Subject u = new Subject();
                u.setSubjectid(rs.getString(1));
                u.setSubjectname(rs.getString(2));

                list.add(u);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public List<InfoDTO> getAllInfobySbjID(String subject_raw) {
        String sql = "select st.StudentID,st.StudentName,st.BirthDate,st.Gender,su.SubjectName from Students st join Subjects su on st.SubjectID=su.SubjectID where su.SubjectID=?";
    List<InfoDTO> list= new ArrayList<>();
        try {
            PreparedStatement st= connection.prepareStatement(sql);
            st.setString(1,subject_raw);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
             InfoDTO i= new InfoDTO();
             i.setStudentid(rs.getString(1));
             i.setStudentname(rs.getString(2));
             i.setBirthdate(rs.getDate(3));
            i.setGender(rs.getBoolean(4));
            i.setSubjectname(rs.getString(5));
            list.add(i);
             
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    public static void main(String[] args) {
        DAO d= new DAO();
        System.out.println(d.GetAllSubject().get(1).getSubjectname());
    }

}
