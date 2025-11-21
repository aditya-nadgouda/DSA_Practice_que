package com.practice;

import java.util.Arrays;

public class P14_NextPermutation {

    public static void main(String[] args) {
        int [] arr = {3, 4, 2, 5, 1};
        System.out.println(Arrays.toString(nextPermutation(arr)));
    }

    public static int[] nextPermutation(int[] arr){

        int n = arr.length;

        int indexToRev = 0;
        for (int i = n-2; i >= 0; i--) {
            if (arr[i]<arr[i+1]){
                indexToRev = i+1;
                for (int j = n-1; j > i; j--) {
                    if (arr[j]>arr[i]){
                        int temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        break;
                    }
                }
                break;
            }
        }
       reverse(arr,indexToRev, n-1);

        return arr;
    }

    public static int [] reverse(int [] arr, int start, int end){

        while (start<end){

            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }

        return arr;
    }
}
