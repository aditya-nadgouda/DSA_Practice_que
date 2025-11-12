package com.practice;

import java.util.Scanner;

public class P07_PalindromeSentence {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(isPalindrome(str));

    }

    public static boolean isPalindrome(String str){

        String strWithoutWhitespaces = str.toLowerCase().trim().replaceAll("\\s+","");
        StringBuilder strNew = new StringBuilder("");

        int l = strWithoutWhitespaces.length()-1;

        while (l>=0){
            char ch = strWithoutWhitespaces.charAt(l);
            strNew.append(ch);
            l--;
        }

        return strNew.toString().equals(strWithoutWhitespaces) ;
    }
}
