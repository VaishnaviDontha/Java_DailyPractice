package functionsExamples;

import java.util.Scanner;

public class factorial {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fact(num);
        sc.close();
    }

    private static void fact(int num) {

        int n = num;
        int fact = 1;
        for(int i = n ; i>0 ; i--){
            fact = i * fact;
        }
        System.out.println(fact);
    }
    
}
