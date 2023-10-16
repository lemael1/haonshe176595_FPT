/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 1112v
 */
public class Major {
//      RollCode INT,
//    Major NVARCHAR(50),
    int RollCode;
    String Major;

    public Major(int RollCode, String Major) {
        this.RollCode = RollCode;
        this.Major = Major;
    }

    public Major() {
    }

    public int getRollCode() {
        return RollCode;
    }

    public void setRollCode(int RollCode) {
        this.RollCode = RollCode;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }
}
