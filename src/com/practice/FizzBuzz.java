package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Arrays.toString( fizzBuzz(n)));
    }

    public static String[] fizzBuzz ( int n){
        String [] outPutArr = new String[n];
        int j = 0;

        for (int i = 1; i <=n; i++) {
            if (i%3 ==0 && i%5==0){
                outPutArr[j]="FizzBuzz";
            } else if (i%3==0) {
                outPutArr[j]="Fizz";
            } else if (i%5 ==0) {
                outPutArr[j]="Buzz";
            }
            else {
                outPutArr[j]= Integer.toString(i);
            }
            j++;
        }

        return outPutArr;
    }
}
