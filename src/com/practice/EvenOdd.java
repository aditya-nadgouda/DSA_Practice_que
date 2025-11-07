package com.practice;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check : ");
        if (in.nextInt()%2==0) {
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
