package java_A;

import java.util.Scanner;

public class class08 {
    public static void main(String[] args) {
        //Right Triangle Star Pattern
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
