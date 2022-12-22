package com.skypro.isPalinrome;

public class Main {
    public static void main(String[] args) {
        //- Задача
        //Напишите программу, которая проверяет, является ли строка палиндромом.
        //(Слово или фраза, которые одинаково читаются слева направо и справа налево.)
        String str1 = "";
        String str2 = "1";
        String str3 = "шалаш";
        String str4 = "45565арв6434";

        System.out.println("isPalindrome(str1) = " + isPalindrome(str1));
        System.out.println("isPalindrome(str2) = " + isPalindrome(str2));
        System.out.println("isPalindrome(str3) = " + isPalindrome(str3));
        System.out.println("isPalindrome(str4) = " + isPalindrome(str4));
    }

    public static boolean isPalindrome(String str) {
        boolean b = true;
        if (str.length() == 0 || str.length() == 1) {
            b = true;

        } else {
            int start = 0;
            int end = str.length() - 1;
            while (start <= end) {
                if (str.charAt(start) != str.charAt(end)) {
                    b = false;
                }
                start++;
                end--;
            }
        }
        return b;
    }
}
