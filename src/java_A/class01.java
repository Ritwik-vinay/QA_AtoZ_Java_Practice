package java_A;

import java.util.Scanner;

public class class01 {
    public static void main(String args[]){
        // How to Take Input from Users?

        //You can take input from users using the Scanner class
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number");
       int a= scn.nextInt();
        System.out.println("Enter the number2");
        int b= scn.nextInt();
        String input = "Hello and Welcome to 1st sum Program ";
        System.out.println(input + (a+b));




    }

}
