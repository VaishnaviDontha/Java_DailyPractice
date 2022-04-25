package Arrays;

import java.util.Scanner;

public class ArrayReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int arr[] = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {

            arr[i] = sc.nextInt();

        }

        arrayReverse(arr, arrSize);
    }

    private static void arrayReverse(int[] arr, int arrSize) {

        int len = arrSize;

        for (int i = 0; i < arrSize; i++) {
            int temp = arr[i];
            arr[i] = arr[arrSize - 1];
            System.out.println(arr[i]);
            arr[arrSize - 1] = temp;
            System.out.println(arr[arrSize - 1]);

            arrSize--;

        }

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
