package functionsExamples;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(armstrong(num));

        sc.close();
        
    }

    private static boolean armstrong(int num) {
        
        int first = num % 100;

        int u = first%10;
        int t = first/10;
        int h = num/100;

        int armstrong = calcube(u)+calcube(t)+calcube(h) ;

        if(num==armstrong){

            return true;
        }
        
        else return false;

        
    }

    private static int calcube(int u) {

        return u*u*u;
    }

    
}
