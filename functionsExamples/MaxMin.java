package main.java.com.javadsa.functionsExamples;

import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        max(a, b, c);
        min(a, b, c);

        sc.close();
    }

    static void max(int a, int b, int c) {
        int large;
        if (a < b && a < c) {
            large = (b < c) ? c : b;
            System.out.println(large);

        } else if (b < a && b < c) {
            large = (a < c) ? c : a;
            System.out.println(large);

        } else if (c < a && c < b) {
            large = (a < b) ? b : a;
            System.out.println(large);
        }

    }

    static void min(int a, int b, int c) {

        int small;
        if (a > b && a > c) {

            small = (b > c) ? c : b;
            System.out.println(small);

        } else if (b > a && b > c) {
            small = (a > c) ? c : a;
            System.out.println(small);

        } else if (c > a && c > b) {
            small = (a > b) ? b : a;
            System.out.println(small);
        }

    }

}
