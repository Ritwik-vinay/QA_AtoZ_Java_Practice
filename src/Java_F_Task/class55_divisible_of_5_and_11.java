package Java_F_Task;

import java.util.Scanner;

public class class55_divisible_of_5_and_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println(num + " is divisible of 5 & 11");
        } else {
            System.out.println(num + " Not divisible of 5 & 11");
        }
        sc.close();
    }
}
