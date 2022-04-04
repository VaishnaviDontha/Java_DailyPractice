package main.java.com.javadsa.functionsExamples;

import java.util.Scanner;

public class SumofN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sumOfN(num);
        sc.close();
    }

    private static void sumOfN(int num) {
        int n = num;
        int sum = 0;
        for(int i =0 ; i<=n ; i++){

            sum += i; 

        }
        System.out.println(sum);

    }
    
}
