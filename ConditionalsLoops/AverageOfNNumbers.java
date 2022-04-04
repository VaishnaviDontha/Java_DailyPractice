package com.javadsa.ConditionalsLoops;

import java.util.Scanner;

public class AverageOfNNumbers {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int sum = 0 , count = 1, num;

        int n = sc.nextInt();
        while(count<=n){
            num = sc.nextInt();
            count++;
            sum = sum + num;
        }

        System.out.println(sum/n);

        sc.close();

    }
    
}
