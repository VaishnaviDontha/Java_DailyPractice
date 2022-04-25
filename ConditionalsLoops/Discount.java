package ConditionalsLoops;

import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float discount = sc.nextFloat();
        int cost = sc.nextInt();
        System.out.println(discount*cost*0.01);
        sc.close();
    }
    
}
