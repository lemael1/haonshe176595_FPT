/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 1112v
 */
public class Account {
//    [userid] [varchar](150) NOT NULL,
//	[password] [varchar](150) NOT NULL,
//	[displayname] [varchar](150) NOT NULL,
    String userid;
    String password;
    String displayname;

    public Account() {
    }

    public Account(String userid, String password, String displayname) {
        this.userid = userid;
        this.password = password;
        this.displayname = displayname;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }
    
}
