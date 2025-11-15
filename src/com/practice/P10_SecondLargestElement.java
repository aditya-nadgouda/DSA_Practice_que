package com.practice;

public class P10_SecondLargestElement {


    public static void main(String[] args) {
        int [] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(secondLargest(arr));
    }

    public static int secondLargest(int[] arr){

        int largest = -1;
        int secLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest){
                secLargest= largest;
                largest = arr[i];
            }
            else if (arr[i]>secLargest && arr[i]<largest){
                secLargest = arr[i];
            }

        }

        return secLargest;
    }
}
