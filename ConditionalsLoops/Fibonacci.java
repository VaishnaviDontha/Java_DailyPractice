package com.javadsa.ConditionalsLoops;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0 , b = 1;
        int num = sc.nextInt();

        for(int i = 2 ; i<= num ; i++){
            int temp = a;
            a = b;
            b = temp + a;
        }
        System.out.println(b);
        sc.close();
    }
    
}
