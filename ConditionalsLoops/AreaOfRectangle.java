package ConditionalsLoops;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int height = sc.nextInt();

        System.out.println("Area of Rectangle "+length*height);
        sc.close();
    }
    
}
