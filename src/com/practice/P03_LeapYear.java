package com.practice;

import java.util.Scanner;

public class P03_LeapYear {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        System.out.println(isLeapYear(year));
    }

    public static boolean isLeapYear(int year){

        if (year % 400 == 0){
            return true;
        } else if (year % 4 == 0 && year % 100 != 0 ) {
            return true;
        }else {
            return false;
        }
    }
}
