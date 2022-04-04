package com.javadsa.ConditionalsLoops;

import java.util.Scanner;

public class AreaOfTriangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int base = sc.nextInt();
        System.out.println("Area of a Triangle "+0.5*base*height );
        sc.close();
    }
}
