package Java_C_Task;

import java.util.Scanner;

public class class30_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year! ");
        int year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.println(year + " year is a Leap Year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " year is Leap Year");
        } else {
            System.out.println(year + " year is NOT a Leap Year");
        }
    }
}
