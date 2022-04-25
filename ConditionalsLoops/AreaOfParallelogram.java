package ConditionalsLoops;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int length = sc.nextInt();
        
        System.out.println("Area of Parallelogram "+width*length);
        sc.close();
    }
}
