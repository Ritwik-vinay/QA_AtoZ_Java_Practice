package java_B;

import java.util.Scanner;

public class class12 {
    public static <main> void main(String[] args) {

        //Prepare a Calculator
        Scanner scn = new Scanner(System.in);
        System.out.println("Number 1");
        int a = scn.nextInt();
        System.out.println("Number 2");
        int b = scn.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(main("Ritwik"));
        //Java <7 then it can take multiple main method
        // Java 8-21 main (Same identical main method should not be created)


    }

    public static boolean main(String args1) {


        return false;
    }
}
