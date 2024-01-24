/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hspace.mathutil.core;

/**
 *
 * @author Admin
 */
 public class MathUtil {

    // trong class này cung câp cho ai đó rất nhiều hàm sử lí toán học
    // clone class Math của JDK
    //hàm thư viện sài chung cho ai đó không cần lưu lại giá trị 
    // chọn thiết kế là hàm static
    // hàm tính giai thừa !!!
    // n!= 1.2.3..n
    // ko có giai thuqf âm
    // 0!=1!=1 quy ước
    // giai thừa hàm đồ thị dốc đứng, tăng rất nhanh về giá trị
    // 20 giai thừa 18 con số 0, vừa kụp đủ cho kiểu long của Java
    // bài này quy ước tính n! trong khoảng 0..20
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. N must be between 0 .. 20");
        }
        if (n == 0 || n == 1) {
            return 1;// kết thúc sớm néu nhận vào những đầu vào đặc biệt
        }
        long product = 1;//tích nhân dồn, thuật toán ốc bu dồn thịt
        for (int i = 2; i <= n; i++) 
            product *= i;      // product=product*i
                                 
        return product;
    }
}
