package com.practice;

import java.util.Arrays;

public class P13_RotateArray {

    public static void main(String[] args) {

        int [] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int d = 3;

        // 1 2 3 4 5

        // 2 3 4 5 1
        // 3 4 5 1 2

        System.out.println(Arrays.toString(rotatedArray(arr, d)));
    }

    public static int[] rotatedArray(int[] arr,int d){

        for (int i = 0; i < d; i++) {
            int ele = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
              arr[j]=arr[j+1];
            }
            arr[arr.length-1]= ele;
        }
        return arr;
    }
}
