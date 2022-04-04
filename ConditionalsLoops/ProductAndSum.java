package com.javadsa.ConditionalsLoops;

import java.util.Scanner;

public class ProductAndSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int sum = 0 , temp = 0 , prod = 1, result = 0;

        while(num>0){
            temp = num % 10;

            sum = sum + temp;
            prod = prod * temp;
            num = num / 10; 
        }

        if(sum>prod){
            result = sum - prod;
        }else
            result = prod - sum;

        System.out.println(result);

        
        sc.close();
    }
    
}
