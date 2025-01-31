package Java_D_Task;

import java.util.Scanner;

public class class40_smallest_of_two {
    public static void main(String[] args) {
        //input > integer having user input a and b output>integer with string
        //Rough Logic> take 2 integer compare the integer and if a>b the print b is smaller and if a<b the print a is smaller

        //Code Implementation
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1!");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2!");
        int num2 = sc.nextInt();

        if (num1 < num2) {
            System.out.println(num1 + " num1 is the smallest");
        } else
            System.out.println(num2 + " num2 is the smallest");
        sc.close();

    }
}
