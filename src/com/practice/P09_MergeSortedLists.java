package com.practice;

import java.util.Arrays;
import java.util.Scanner;

// Used Arrays********* : Not valid solution for this question

public class P09_MergeSortedLists {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int[] list1 = {1,2,3,9};
        int[] list2 = {3,3,6,6,4};

        System.out.println(Arrays.toString(mergedList(list1,list2)));
    }

    public static int [] mergedList(int[] list1, int[] list2){

        int size = list1.length+list2.length;
        int [] result = new int[size];

        int i = 0;
       while (i < list1.length) {
            result[i]=list1[i];
            i++;
        }
       int j = 0;

       while (j< list2.length){
           result[i]= list2[j];
           j++;
           i++;
       }

       Arrays.sort(result);
       return result;
    }



}
