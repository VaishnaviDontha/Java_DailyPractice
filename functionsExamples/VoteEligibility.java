package main.java.com.javadsa.functionsExamples;

import java.util.Scanner;

public class VoteEligibility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        vote(age);
        sc.close();
    }

    static void vote(int age){
        System.out.println(age>=18 ? "Eligible to Vote" : "Not Eligible to Vote");
    }
    
}
