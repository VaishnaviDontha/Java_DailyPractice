package ConditionalsLoops;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double pie = 3.14;

        System.out.println("Area of a Circle " +pie*(radius*radius));
        sc.close();
    }
    
}
