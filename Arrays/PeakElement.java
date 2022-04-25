/*

Description : 
An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).

*/

package Arrays;

import java.util.Scanner;

public class PeakElement {

    public static void main(String[] args) {

        initArray();

    }

    private static void initArray() {

        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();

        int[] arr = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {

            arr[i] = sc.nextInt();

        }

        // Displaying Array

        for (int i = 0; i < arraySize; i++) {
            System.out.print(arr[i]+" ");
        }

        peakElement(arr, arraySize);
        sc.close();

    }

    private static void peakElement(int[] arr, int size) {

        int peak = 0;

        for (int i = 0; i < size - 1; i++) {

            if (arr[i] < arr[i + 1]) {
                peak = i + 1;
            }
            

        }

        System.out.println(peak);

    }

}
