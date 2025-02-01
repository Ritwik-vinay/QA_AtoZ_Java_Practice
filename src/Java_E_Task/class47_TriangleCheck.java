package Java_E_Task;

import java.util.Scanner;

public class class47_TriangleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side 1!");
        final int a = sc.nextInt();
        System.out.println("Enter Side 2!");
        final int b = sc.nextInt();
        System.out.println("Enter side 3!");
        final int c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a && a != 0 && b != 0 && c != 0) {
            if (a == b && b == c) {
                System.out.println("It is an Equilateral Triangle");
            } else {
                System.out.println("It is a Triangle ");
            }
        } else {
            System.out.println("It is not a valid Triangle");
        }

    }
}

