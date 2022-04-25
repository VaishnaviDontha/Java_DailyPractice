package functionsExamples;

import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Grade(num);
        sc.close();
    }

    private static void Grade(int num) {
        int sc = num;

        if(sc > 91 && sc <= 100){
            System.out.println("AA");
        } else if (sc > 81 && sc <= 90) {
            System.out.println("AB");
            
        } else if (sc > 71 && sc <= 80) {
            System.out.println("BB");
            
        } else if (sc > 61 && sc <= 70) {
            System.out.println("BC");
        
        } else if (sc > 51 && sc <= 60) {
            System.out.println("CD");
            
        } else if (sc > 41 && sc <= 50) {
            System.out.println("DD");
            
        } else if (sc<= 40) {
            System.out.println("Fail"); 
        }  else 
        System.out.println("Enter a Valid Number!");

    }

}
