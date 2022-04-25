package functionsExamples;

import java.util.Scanner;

public class ReverseANum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(reverse(num));
        sc.close();
    }

    private static int reverse(int num) {

        int n = num;
        int rev_num = 0;

        while(n>0){

            rev_num = rev_num * 10 + n % 10;
            n = n / 10;

        }

        return rev_num;
    }
    
}
