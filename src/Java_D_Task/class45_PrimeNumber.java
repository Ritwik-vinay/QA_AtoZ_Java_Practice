package Java_D_Task;

import java.util.Scanner;

public class class45_PrimeNumber {
    public static void main(String[] args) {
        //Check whether the input is a Prime Number
        //input : integer and output : String
        //Rough Logic:: if the user is divisible by 1 and it self then it is a prime number else not a prime

        //Code Implementation
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num!");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;

            }
        }
        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
        sc.close();
    }

}

