package firstjava;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a =0 ;
        int b = 1;           
        int c;
        int i =2;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        while(i<=n){
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            i++;
        }
        sc.close();
    }

    
}

// Pseudo Code
// Step 1: Start 
// Step 2: Declare variable a, b, c, n, i
// Step 3: Initialize variable a=0, b=1 and  i=2 
// Step 4: Read n from user 
// Step 5: Print a and b 
// Step 6: Repeat until i<=n : 
//            Step 6.1: c=a+b 
//            Step 6.2: print c 
//            Step 6.3: a=b, b=c 
//            Step 6.4: i=i+1 
// Step 7: Stop