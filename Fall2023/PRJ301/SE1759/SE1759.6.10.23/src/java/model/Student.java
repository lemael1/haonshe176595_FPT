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
    int RollCode;
    String FullName;
    String DoB;
    String Gender;

    public Student() {
    }

    public Student(int RollCode, String FullName, String DoB, String Gender) {
        this.RollCode = RollCode;
        this.FullName = FullName;
        this.DoB = DoB;
        this.Gender = Gender;
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
  
    
   
    
}
