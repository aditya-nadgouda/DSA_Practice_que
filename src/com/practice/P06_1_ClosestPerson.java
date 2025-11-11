package com.practice;

import java.util.Scanner;

public class P06_1_ClosestPerson {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        System.out.println(closestPerson(x,y,z));

    }

    public static int closestPerson(int x, int y, int z){

        int diffA = Math.abs(z - x);
        int diffB = Math.abs(z - y);

        if (diffA > diffB){
            return 2;
        }
        else if (diffA <  diffB){
            return 1;
        }
        else {
            return 0;
        }
    }
}
