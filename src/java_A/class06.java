package java_A;

import java.sql.SQLOutput;
import java.util.Scanner;

public class class06 {
    public static void main(String[] args) {
        //Create a program that determines whether a given year is a leap year.
        // A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
        // Use an if-else statement to make this determination.
        Scanner sc = new Scanner(System.in);
        System.out.println("Year = ");
        int year =sc.nextInt();
        boolean isLeapyear =false;
        if((year%4==0 && year%100!=0)||(year%400==0)){
            isLeapyear = true;

        }
        if (isLeapyear){
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not Leap Year");
        }
    }
}
