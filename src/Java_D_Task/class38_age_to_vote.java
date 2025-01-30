package Java_D_Task;

import java.util.Scanner;

public class class38_age_to_vote {
    public static void main(String[] args) {
        //Input the age in Integer and output the String whether he/she is eligible to vote or not
        //rough logic: if age is greater or equal than 18 then eligible to vote and if not then not eligible to vote
        //Code Implementation
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age!");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to Vote as your age is " + age);
        } else
            System.out.println("You are not allowed to vote as your age is " + age);

    }
}
