package Java_E_Task;

import java.util.Scanner;

public class class46_ATM_Simulation {
    public static void main(String[] args) {
        //Step 1>> initialize the Inputs
        final int balance = 677837387;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount !");
        int amount = sc.nextInt();
        //Step2>> condition1>>  amount should be greater than 0 and should be multiple of 100
        if (amount > 0) {
            if (amount % 100 == 0) {
                if (amount < balance) {
                    int FinalBalance = balance - amount;
                    System.out.println("Transaction Successfully Complete " + " Remaining Balance is" + FinalBalance);

                } else {
                    System.out.println("Warning!!!! Amount is greater then TOTAL BALANCE!!");
                }

            } else {
                System.out.println("Input error Check the Amount should be Multiple of 100");


            }

        } else {
            System.out.println("Warning!!! Amount is not Greater than 0");
        }


    }
}
