/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hspace.lambda.main;

import com.hspace.lambda.core.Salutation;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        
        // xài interface kiểu truyền thống- new Class Con đã Implements cha
        SalutationVN loichao= new SalutationVN();
        loichao.sayHello("Lệ phí đổi nghành 2m3");
        
        // xài cách 2, éo thèm làm Class con Implements Cha
        // xài kiểu on-the-go/take- away:
        //ANONYMOUS CLASS CHỈ LÀ ÉO CẦN TẠO CLASS TƯỜNG MINH
        //CHỈ CẦN  NEW VÀ GÕ CODE THÔI
        
        Salutation helloEN= new Salutation() {
            @Override
            public void sayHello(String msg) {
                System.out.println(msg);
            }
        };
     helloEN.sayHello("Trường 3 chữ ...");
     
    //Lamda Expression : code cho hàm abstract
    // gọi nó sau khi code xong
    // loại bỏ luôn cái tên hàm
    Salutation helloUK=  msg-> System.out.println(msg);
    helloUK.sayHello("Hello , arigato");
    
}
}   
        
    
    

