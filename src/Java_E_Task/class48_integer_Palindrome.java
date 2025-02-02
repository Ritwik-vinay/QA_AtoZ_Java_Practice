package Java_E_Task;

import java.util.Scanner;

public class class48_integer_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer");
        int originalValue = sc.nextInt();
        int temp = originalValue;
        int rev = 0;

        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;

        }
        System.out.println(rev);
        if (rev == originalValue) {
            System.out.println(originalValue + " it is a palindrome as the rev of it is " + rev);
        } else {
            System.out.println(originalValue + " it is !!!NOT!!! palindrome as the rev of it is " + rev);
        }
        sc.close();

    }
}
