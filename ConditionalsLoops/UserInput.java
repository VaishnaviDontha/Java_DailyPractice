package ConditionalsLoops;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = 0, sum = 0; 

        do{
            num = sc.nextInt();
            sum = sum + num;
        }while(num!=0);
        System.out.println(sum);
        sc.close();
    }
    
}
