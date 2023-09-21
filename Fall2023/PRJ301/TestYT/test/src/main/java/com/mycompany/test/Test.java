/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.test;

/**
 *
 * @author 1112v
 */
public class Test {

    public static void main(String[] args) {
       String x=mergeAlternately("abcd","pq");
        System.out.println(x);
        
    }
    public static String mergeAlternately(String word1, String word2) {
            char[] w1 = word1.toCharArray();
            char[] w2 = word2.toCharArray();
            int m=word1.length();
            int n=word2.length();
            char[] result = new char[m+n];

            int k = 0;
            int l = 0;

            for (int i = 0; i < result.length; i++) {
                if (i % 2 == 0 && k < w1.length) {
                    result[i] = w1[k];
                    k++;
                } else if (l < w2.length) {
                    result[i] = w2[l];
                    l++;
                }
            }

            return new String(result);
        }
    
}
