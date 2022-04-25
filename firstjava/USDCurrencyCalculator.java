package firstjava;

import java.util.Scanner;

public class USDCurrencyCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Rupee to USD currency = " + num*75);
        sc.close();
    }

}
