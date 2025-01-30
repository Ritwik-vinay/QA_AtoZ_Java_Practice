package Java_D_Task;

import java.util.Scanner;

public class class35_Odd_or_Even {
    public static void main(String[] args) {
        // input: user input >>integer and output is "string"
        //Rough logic if number is divisible by 2 then its and even number elseif the number is not divisible by 2 then
        // its an odd number 0 if the number is 0 then it is neither odd nor even its a natural number
        //Code Implementation
        Scanner sc = new Scanner(System.in);
        System.out.println("Check the Number is Odd, Even or Natural Number");
        int num = sc.nextInt();
        // if elseif condition
        if (num % 2 == 0 && num != 0) {
            System.out.println(num + " is  an Even Number");
        } else if (num == 0) {
            System.out.println(num + " is a Natural Number");
        } else {
            System.out.println(num + " is an Odd Number");
        }
        sc.close();

    }
}
