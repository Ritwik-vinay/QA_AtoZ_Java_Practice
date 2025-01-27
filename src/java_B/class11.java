package java_B;

import java.util.Scanner;

public class class11 {
    public static void main(String[] args) {
        //Print the Table from
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int i = scn.nextInt();
        int j = 0;
        for (j = 2; j <= 10; j++) {
            System.out.println(i * j);
        }
    }
}
