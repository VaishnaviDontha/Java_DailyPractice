package main.java.com.javadsa.functionsExamples;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (prime(num))
            System.out.println("Prime");
 
        else
            System.out.println("Not Prime");
        sc.close();
    }

    private static boolean prime(int num) {

        if(num == 0 || num ==1){
            return false;
        }
        else if(num == 2){
            return true;
        }
        else 
        if(num%2==0){
               return false;
        }
        
        // for(int i =3; i<= Math.sqrt(num);i+=2){

        //     if(num%i == 0)
        //     return true;

        // }
        // return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
