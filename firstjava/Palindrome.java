package firstjava;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = str.length();
        String reverse = "";

        for(int i = num-1;num>=0;num++){
            reverse = reverse + str.charAt(i);
        }

        if(str.equals(reverse)){
            System.out.println("Entered String/Number is a Palindrome");
        }
        else 
            System.out.println("Entered String/Number is NOT a Palindrome");
        
        
        sc.close();
    }
    
}



// Pseudo Code
// Step 1: Start 
// Step 2: Read String from user
// Step 3: Store length - len of String to a Variable
// Step 4: Repeat until i < len/2 as half of the comparision saves time 
//          Using if compare S[i] with S[i-len-1]
//          if same i++
//          else false
// Step 5: Close Scanner
// Step 6: Stop