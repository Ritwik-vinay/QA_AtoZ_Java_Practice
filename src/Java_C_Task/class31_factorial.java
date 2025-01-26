package Java_C_Task;

import java.math.BigInteger;
import java.util.Scanner;

public class class31_factorial {
    public static void main(String[] args) {
        //Factorial
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));

        }
        System.out.println("Factorial of " + num + " is-> " + factorial);

    }
}
