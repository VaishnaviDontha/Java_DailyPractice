package main.java.com.javadsa.functionsExamples;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        palindrome(num);
        

        sc.close();

    }

    private static String palindrome(int num) {
        int pa = num;
        int reverse_num = 0;
        int n = num;

        while(n>0){

            reverse_num = reverse_num * 10 + n % 10;
            n = n / 10;

        }

        if(pa == reverse_num){
            return "true";
        }
        else return "false";


    }
    
}
