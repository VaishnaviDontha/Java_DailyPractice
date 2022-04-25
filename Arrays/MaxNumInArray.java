package Arrays;

import java.util.Scanner;

public class MaxNumInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];

        for(int i=0;i<arrSize;i++){
            arr[i] = sc.nextInt();
        }
        
        maxNum(arr,arrSize);
        
        sc.close();
    }

    private static void maxNum(int[] arr, int arrSize) {

        int max = 0;

        for(int i=0;i<arrSize-1;i++){
            if(arr[i+1]>arr[i]){
                max = arr[i+1];                
            }
        }
        System.out.println(max);
    }

    
}
