package firstjava;
import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String output = num1<num2 ? num2+ " is greater than" + num1 : num1+ " is greater than" + num2 ;
        System.out.println(output);
        sc.close();
    }
    
}
