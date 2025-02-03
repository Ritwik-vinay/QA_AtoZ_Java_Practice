package Java_F_Task;

import java.util.Scanner;

public class class56_convert_Days_years_Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Days");
        int days = sc.nextInt();
        if (days > 0) {
            int year = days / 365;
            int remainingDays = days % 365;
            int month = remainingDays / 30;
            days = remainingDays % 30;
            System.out.println(year + " year " + month + " Month and " + days + " Days");

        } else {
            System.out.println("Days should be greater than 0");
        }
        sc.close();


    }
}
