package com.practice;

import java.util.Scanner;

public class P06_2_Patterns {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println("\n1st Pattern\n");

//        1

//        *
//        * *
//        * * *
//        * * * *


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i>= j){
                    System.out.print("*" + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\n2nd Pattern\n");

//        2
//
//        * * * *
//          * * *
//            * *
//              *

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i <= j){
                    System.out.print("*" + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\n3rd Pattern\n");

//        3

//        * * * *
//        * * *
//        * *
//        *

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i+j<=n+1){
                    System.out.print("*" + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\n4th pattern\n");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i+j>=n+1){
                    System.out.print("*" + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }



    }



}
