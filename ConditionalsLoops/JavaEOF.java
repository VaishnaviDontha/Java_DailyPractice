package main.java.com.javadsa.ConditionalsLoops;

import java.util.Scanner;

public class JavaEOF {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (sc.hasNext()) {
            i = i + 1;
            System.out.println(i + " " + sc.nextLine());
        
        }

        sc.close();

    }
}
