/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author 1112v
 */
public class Candidate {
//    [cid] [int] IDENTITY(1,1) NOT NULL,
//	[cname] [varchar](150) NOT NULL,
//	[gender] [bit] NOT NULL,
//	[dob] [date] NOT NULL,
//	[gid] [int] NOT NULL,
//	[created_by] [varchar](150) NOT NULL,
    int cid;
    String cname;
    int gender;
    Date dob;
    Group group;
    String created_by;

    public Candidate() {
    }

    public Candidate(int cid, String cname, int gender, Date dob, Group group, String created_by) {
        this.cid = cid;
        this.cname = cname;
        this.gender = gender;
        this.dob = dob;
        this.group = group;
        this.created_by = created_by;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }
     
    
   
}
