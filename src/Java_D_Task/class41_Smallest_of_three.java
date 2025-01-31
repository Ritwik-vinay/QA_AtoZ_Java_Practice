package Java_D_Task;

import java.util.Scanner;

public class class41_Smallest_of_three {
    public static void main(String[] args) {
        //input > integer having user input a,b and c output>integer with string
        //Rough Logic> take 3 integer compare the integer and if a<b and a<c the print a is smaller
        // and if a>b and c>b the print b is smaller else c is smallest
        Scanner sc = new Scanner(System.in);
        System.out.println("Num1=");
        int a = sc.nextInt();
        System.out.println("Num2=");
        int b = sc.nextInt();
        System.out.println("Num3=");
        int c = sc.nextInt();
        if (a < b && a < c) {
            System.out.println("Num1 is the smallest " + a);
        } else if (b < a && b < c) {
            System.out.println("Num2 is the smallest " + b);
        } else if (a == b || b == c || c == a) {
            System.out.println("Enter all unique numbers");
        } else
            System.out.println("Num3 is the smallest " + c);
        sc.close();


    }
}
