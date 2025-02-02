package Java_E_Task;

import java.util.Scanner;

public class class54_visa_Validity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your age?");
        int age = sc.nextInt();
        boolean visaStatus = false;
        if (age > 0 && age >= 18) {
            visaStatus = true;
            if (visaStatus == true) {
                System.out.println("Your age is " + age + " Your visaStatus is " + visaStatus + " Travel Allowed");
            }

        } else if (age < 18) {
            visaStatus = false;
            System.out.println("Your age is " + age + " Your visaStatus is " + visaStatus + " No Travel Allowance");
        }
    }
}
