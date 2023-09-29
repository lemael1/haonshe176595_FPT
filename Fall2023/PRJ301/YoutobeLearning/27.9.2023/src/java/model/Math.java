/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author 1112v
 */
public class Math implements Serializable {

    String num1;
    String num2;
    String op;

    public Math() {
    }

    public Math(String num1, String num2, String op) {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String Result() {
        String rs = "";
        try {
            double a = Double.parseDouble(num1);
            double b = Double.parseDouble(num2);
            switch (op) {

                case "+":
                    rs = "Ket qua la " + (a + b);
                    break;
                case "-":
                    rs = "Ket qua la " + (a - b);
                    break;
                case "x":
                    rs = "Ket qua la " + (a * b);
                    break;
                case ":":
                    rs = "Ket qua la " + (a / b);
                    break;
            }
        } catch (NumberFormatException e) {
            rs = "Khong chuyen doi duoc";
        }
    }
}
