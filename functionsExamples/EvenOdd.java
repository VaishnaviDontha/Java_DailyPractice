package main.java.com.javadsa.functionsExamples;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        evenodd(num);
        sc.close();

    }

    static void evenodd(int num) {

        System.out.println(num%2==0 ? "Num is Even" : "Number is Odd");
        
    }

    
    
}
