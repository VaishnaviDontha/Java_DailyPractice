package Arrays;

import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); 
        int[] a = new int[size];

        for(int j =0;j<size;j++){

            a[j] = sc.nextInt();
        }

        swap(a);
        sc.close();
    }

    private static void swap(int[]a) {

        //swapping last digit in array to first one

        int len = a.length;
        int temp;

        temp = a[len-1];
        a[len-1] = a[0];
        a[0] = temp;

        System.out.println(a[0]);
        System.out.println(a[len-1]);


    }
    
}
