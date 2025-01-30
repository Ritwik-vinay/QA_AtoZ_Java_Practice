package Java_D_Task;

import java.util.Scanner;

public class class34_P_or_N {
    public static void main(String[] args) {
        //input: user input as integer and output as String
        //rough logic: if the number is greater than 0 then it Positive number if equals to 0 then its a natural number
        //if less than 0 then it is negative number

        //Code implementation
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        //if condition
        if (num > 0) {
            System.out.println(num + " is Positive");
        } else if (num == 0) {
            System.out.println(num + " is Natutal Number");
        } else if (num < 0) {
            System.out.println(num + " is Negative");
        }
        sc.close();
    }
}
