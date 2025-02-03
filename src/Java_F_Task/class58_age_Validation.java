package Java_F_Task;

import java.util.Scanner;

public class class58_age_Validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = sc.nextInt();
        if (age > 0 && age < 12) {
            System.out.println("You are a Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a Teenager");
        } else if (age >= 20 && age <= 64) {
            System.out.println("You are Adult");
        } else {
            System.out.println("You are a Senior Citizen");
        }
        sc.close();
    }
}
