package com.practice;

import java.util.Scanner;

public class P04_Factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        System.out.println(factorial(n));
        System.out.println(factorialRecurrsion(n));

    }

    public static int factorial(int n){
        int fact =1;
        if (n == 0){
            return fact;
        }
        else {
            while (n > 0){
                fact = fact*n;
                n--;
            }
        }
        return fact;
    }

    public static int factorialRecurrsion(int n ){
        if (n == 0 ){
            return 1;
        }
        return n * factorialRecurrsion(n-1);
    }
}
