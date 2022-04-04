package main.java.com.javadsa.functionsExamples;

public class varArgs {
    public static void main(String[] args) {
        fun("GeeksforGeeks", 100, 200);
        fun("CSPortal", 1, 2, 3, 4, 5);
        fun("forGeeks");
    }

    private static void fun(String string,int...a) {

        System.out.println("String : "+string);
        System.out.println("No of arguments : "+a.length);
        
        for (int i : a) {
            System.out.print(i + " ");
        }

        System.out.println();

    }


}
