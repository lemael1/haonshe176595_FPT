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
public class SalutationVN implements Salutation{

    @Override
    public void sayHello(String msg) {
        System.out.println(msg);
    }
    
}
