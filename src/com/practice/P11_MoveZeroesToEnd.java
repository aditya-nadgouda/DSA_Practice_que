package com.practice;

import java.util.Arrays;

public class P11_MoveZeroesToEnd
{
    public static void main(String[] args) {

        int [] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        System.out.println(Arrays.toString(moveZeroesEnd(arr)));
    }

    public static int[] moveZeroesEnd(int [] arr){

        int n = arr.length;
        int i = 0;
        int j = 0;
        while (i<n){
            if (arr[i]!=0){
                arr[j]= arr[i];
                j++;
            }
            i++;
        }

        while (j<n){
            arr[j]=0;
            j++;
        }

        return arr;
    }
}
