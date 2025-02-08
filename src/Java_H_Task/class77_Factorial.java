package Java_H_Task;

import java.util.Scanner;

public class class77_Factorial {
    public static void main(String[] args) {
        //9. Factorial of a Number
        Scanner sc = new Scanner(System.in);
        System.out.println("Factorial of n is");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        System.out.println("Fact of n2");
        int n2 = sc.nextInt();
        int fact1 = 1;
        int j = 1;
        while (j <= n2) {
            fact1 = fact1 * j;
            j++;
        }
        System.out.println(fact1);
    }
}
