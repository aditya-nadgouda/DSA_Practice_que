package com.practice;

import java.util.Scanner;

public class P07_2_Patterns {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();


        //1
//        1
//        0 1
//        1 0 1
//        0 1 0 1

//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=n; j++) {
//                if (i>=j){
//                    if ( (i+j) % 2 == 0) {
//                        System.out.print("1 ");
//                    }
//                    else {
//                        System.out.print("0 ");
//                    }
//                }
//                else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//
//        }

        System.out.println();

        // 2

//              1
//            2 1 2
//          3 2 1 2 3
//        4 3 2 1 2 3 4


//        for (int i = 1; i <=n; i++) {
//            int x = i;
//            int y = 1;
//            for (int j = 1; j <=n*2-1; j++) {
//                if (i+j >= n+1 && j <=n ) {
//                    System.out.print(x-- + " ");
//
//                }
//                else if (j-i<=n-1 && j > n)   {
//                    System.out.print(++y + " ");
//                }
//                else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//
//        }
//
//        System.out.println();
//        //3
////        ****
////         ****
////          ****
////           ****
//
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=n*2-1; j++) {
//
//                if (j>=i && j-i <= n-1){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//
//                }
//            }
//            System.out.println();
//
//        }

        //4


        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n*2-1; j++) {

                if (j>=i && j-i <= n-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");

                }
            }
            System.out.println();

        }







    }





}
