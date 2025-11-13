package com.practice;

import java.util.Scanner;

public class P08_LongestCommonPrefix {
    public static void main(String[] args) {

        String[] str = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String [] str){

        // optimized code

        if (str == null || str.length == 0){return "";}
        String prefix = str[0];

        for (int i = 1 ; i < str.length ; i++){

            while (!str[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);
                if (prefix.isEmpty()){return "";}
            }
        }

        return prefix;








// bruit force method

//        StringBuilder prefix = new StringBuilder("");
//
//        int j = 0;
//        boolean bl = true;
//        while (bl){
//            int l = str.length-1;
//            int i = 0;
//            while (l>0){
//                if (str[i].charAt(j) == str[i+1].charAt(j)){
//                    i++;
//                }
//                else {
//                    bl = false;
//                    break;
//                }
//                l--;
//            }
//            if (bl){
//                prefix.append(str[i].charAt(j));
//            }
//            j++;
//        }

//        return prefix;
    }
}
