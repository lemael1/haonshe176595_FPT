/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1112v
 */

    public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 10000000; i++) {
            if (isValid(i) && isValid(i + 1)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isValid(int number) {
        String str = Integer.toString(number);
        int a = Character.getNumericValue(str.charAt(0));
        int b = Character.getNumericValue(str.charAt(1));
        int c = Character.getNumericValue(str.charAt(2));
        int d = Character.getNumericValue(str.charAt(3));
        int e = Character.getNumericValue(str.charAt(4));

        return a + e == b + c + d;
    }
}


