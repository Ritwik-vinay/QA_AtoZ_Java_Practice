package Java_H_Task;

import java.util.Scanner;

public class class76_multiplication {
    public static void main(String[] args) {
        //8. Multiplication Table of a Given Number (take the input from user).
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
        System.out.println("Enter 2nd Integer");
        int m = sc.nextInt();
        int j = 1;
        while (j <= 10) {
            System.out.println(m * j);
            j++;
        }
    }
}
