package functionsExamples;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a,b);

        sc.close();
    }


    private static void swap(int a, int b) {

        int temp = 0;

        temp = a;
        a = b;
        b = temp;

        System.out.println("Swap!" +a+ " "+b);
    }
}
