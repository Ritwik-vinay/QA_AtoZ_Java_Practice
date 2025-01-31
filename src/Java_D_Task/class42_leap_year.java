package Java_D_Task;

import java.util.Scanner;

public class class42_leap_year {
    public static void main(String[] args) {
        //input> take user input as integer and output will be String
        //Rough Logic if year is divisible by 400 then leap year else if year divisible by 4 but not by 100 then leap year
        // else not a leap year
        //Code Implementation
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year!");
        int year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " not a leap Year");
        }
        sc.close();

    }
}
