package ConditionalsLoops;

import java.util.Scanner;

public class UserInputLargeNumber {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = 0, lnum = 0; 

        do{
            num = sc.nextInt();
            if(lnum<num)
            lnum = num;
        }while(num!=0);
        System.out.println(lnum);
        sc.close();
    }
    
}
