package Arrays;

import java.util.Scanner;

public class MinNumInArray {
   
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];

        for(int i=0;i<arrSize;i++){
            arr[i] = sc.nextInt();
        }
        
        minNum(arr,arrSize);
        
        sc.close();
    }

    private static void minNum(int[] arr, int arrSize) {

        int min = 0;

        for(int i=0;i<arrSize-1;i++){
            if(arr[i+1]<arr[i]){
                min = arr[i+1];                
            }
        }
        System.out.println(min);
    }

}
