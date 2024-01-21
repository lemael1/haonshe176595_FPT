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
        loichao.sayHello();
        
        // xài cách 2, éo thèm làm Class con Implements Cha
        // xài kiểu on-the-go/take- away:
        //ANONYMOUS CLASS CHỈ LÀ ÉO CẦN TẠO CLASS TƯỜNG MINH
        //CHỈ CẦN  NEW VÀ GÕ CODE THÔI
        
        Salutation helloEN= new Salutation() {
            @Override
            public void sayHello() {
                System.out.println("Trường 3 chữ ...FPT");
            }
        };
     helloEN.sayHello();
     
     // vì chỉ có 1 hàm trong interface, và cần có code cho hàm này
     // dù là anonymous hay làm class riêng
     // vì chỉ có 1 hàm duy nhất, mà lại cần code/ implement tại sao
     // không tập trug vào code, tại sao lại phải viết tên hàm
     // rút  gọn từ class riêng rẽ thành anonymous, bớt được tên class
                     // bớt luôn tên hàm cho gọn=> lambda expression
     // chỉ còn cái dây nịt- code của hàm mà thôi
     // chỉ đc xài khi chơi với funtional interface
     // interface chỉ có 1 hàm
     
     // chào bằng tiếng Hàn. Nhật
     // c1 : tradition 
     //c2: on the go - anonymous
     //c3: lambda
     
     Salutation helloJP= ()-> System.out.println("Say Arigato ");
     
     helloJP.sayHello();
     }        
}
         
        
    
    

