package functionsExamples;

import java.util.Scanner;

public class PrimeBetweenTwo {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if(n2<n1 || n1==n2){
            System.out.println("Enter Valid numbers");
        }
        else{

            for(int i = n1; i < n2;i++){
                if(primebetweentwo(i)){
                        System.out.println(i);
                }
            }
        }
            
        sc.close();

    }

    private static boolean primebetweentwo(int n1) {

        int n = n1;

        if(n==0||n==1){
            return false;
        }
        else if(n==2){
            return true;
        }
        // else if(n%2==0){
        //     return false;
        // }
        // else{
        //     for(int i = 3;i<= Math.sqrt(n);i+=2){
        //         if(n%i==0)
        //         return true;
        //     }
        //     return false;
        // }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
        

    }     
    
}
