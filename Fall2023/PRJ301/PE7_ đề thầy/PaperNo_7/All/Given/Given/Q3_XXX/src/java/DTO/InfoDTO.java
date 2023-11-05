/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.sql.Date;

/**
 *
 * @author 1112v
 */
public class InfoDTO {
//    [StudentID] [nvarchar](10) NOT NULL primary key,
//	[StudentName] [nvarchar](30) NOT NULL,
//	[BirthDate] datetime not NULL,
//	[Gender] [bit] NULL,
//	[SubjectID] [varchar](10) NULL references [Subjects](SubjectID)

    String studentid;
    String studentname;
    Date birthdate;
    Boolean gender;
    String subjectname;

    public InfoDTO() {
    }

    public InfoDTO(String studentid, String studentname, Date birthdate, Boolean gender, String subjectname) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.birthdate = birthdate;
        this.gender = gender;
        this.subjectname = subjectname;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

}
