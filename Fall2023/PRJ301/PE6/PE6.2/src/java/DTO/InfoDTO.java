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
public class InfoDTO{
   int id;
   String name;
   Boolean gender;
   Date dob;
   String groupname;

    public InfoDTO() {
    }

    public InfoDTO(int id, String name, Boolean gender, Date dob, String groupname) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.groupname = groupname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    

    
    
}
