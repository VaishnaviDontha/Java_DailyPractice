package functionsExamples;

import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        factor(num);
        sc.close();
    }

    private static void factor(int num) {

        int n = num ;
    
            for (int i = 1 ; i <= n ; i ++){

                if(n%i == 0){
                    System.out.println(i);
                }

            }
    }
    
}
