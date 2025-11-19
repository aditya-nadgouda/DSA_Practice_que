package com.practice;

import java.util.Arrays;

public class P12_ReverseArray {

    public static void main(String[] args) {
        int [] arr = {1, 4, 3, 2, 6, 5};
        System.out.println(Arrays.toString(reversedArray(arr)));
    }
    public static int[] reversedArray(int [] arr){

        int start = 0;
        int end = arr.length-1;

        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
        return arr;
    }
}
