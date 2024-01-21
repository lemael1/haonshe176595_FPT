/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hspace.lambda.core;

/**
 *
 * @author Admin
 */
@FunctionalInterface // là loại interface chỉ có duy nhất 1 hàm abstract
public interface Salutation {// vì chỉ có 1 hàm khi new()
                             // vùng ram chỉ có 1 hàm
                             // vì ko có sự nhầm lần giữa hàm này và hàm kia
                             // LamDA EXPRESSION CHỈ ĐƯỢC SỬ DỤNG KHI CHƠI VỚI FUNCTIONAL INTERFACE  
    public void sayHello(); // hàm không có code
    
}
