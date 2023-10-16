/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 1112v
 */
public class Student {
//    RollCode INT PRIMARY KEY,
//    FullName NVARCHAR(255),
//    DoB DATE,
//    Gender NVARCHAR(10)
    int RollCode;
    String FullName;
    String DoB;
    String Gender;
    Major major;

    public Student() {
    }

    public Student(int RollCode, String FullName, String DoB, String Gender, Major major) {
        this.RollCode = RollCode;
        this.FullName = FullName;
        this.DoB = DoB;
        this.Gender = Gender;
        this.major = major;
    }

    public int getRollCode() {
        return RollCode;
    }

    public void setRollCode(int RollCode) {
        this.RollCode = RollCode;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String DoB) {
        this.DoB = DoB;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }
}
