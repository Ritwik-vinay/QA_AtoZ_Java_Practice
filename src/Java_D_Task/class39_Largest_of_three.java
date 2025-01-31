package Java_D_Task;

import java.util.Scanner;

public class class39_Largest_of_three {
    public static void main(String[] args) {
        //Find the Largest of Three Numbers.
        //input "3 integer" and Output "Any 1 int" which is the largest
        //Rough Logic: initialise 3 integer a, b,c check whether a>b and a>c if this condition satisfies then a is the
        //largest elseif a<b b>c the b is the largest and else c is the largest
        //Code Implementation
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer1!");
        int num1 = sc.nextInt();
        System.out.println("Enter the integer2!");
        int num2 = sc.nextInt();
        System.out.println("Enter the integer3!");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " 1st is the largest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " 2nd is the largest");
        } else {
            System.out.println(num3 + " 3rd is the largest");

        }
        sc.close();


    }
}