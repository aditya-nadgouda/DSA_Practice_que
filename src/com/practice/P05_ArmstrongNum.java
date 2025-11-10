package com.practice;

import java.util.Scanner;

public class P05_ArmstrongNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println(isArmstrong(num));
    }

    public static boolean isArmstrong(int n ){
        int originalNum = n;
        int size = String.valueOf(n).length();
        int sum = 0;

        // 1

//        while (n>0){
//            int last = n % 10;
//            n /=10;
//            int mul = 1;
//            int countLoop = size;
//            while (countLoop > 0){
//                mul = mul * last;
//                countLoop--;
//            }
//            sum +=mul;
//        }

        //2

        while (n > 0){
            int last = n %10;
            sum += Math.pow(last,size);
            n /=10;
        }

        return sum == originalNum;
    }


}
