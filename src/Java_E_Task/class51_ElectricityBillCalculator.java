package Java_E_Task;

import java.util.Scanner;

public class class51_ElectricityBillCalculator {
    public static void main(String[] args) {
        //Input >>Integer: No of unit consumed output: Integer >>No. of Units* rates defined as per the bracket
        //Rough Logic >> user consumption bracket(unit)||Rates
        //             ||       0 to 100               ||0.50 rs
        //             ||     101 to 200               ||0.75 rs
        //             ||     201 to 300               ||1.20 rs
        //             ||     300 and above            ||1.50 rs
        //codeImplementation
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Unit Consumed!!");
        double units = sc.nextDouble();
        if (units > 0 && units <= 100) {
            System.out.println(units * (0.50) + " Rs");
        } else if (units >= 101 && units <= 200) {
            System.out.println(units * (0.75) + " Rs");
        } else if (units >= 201 && units <= 300) {
            System.out.println(units * (1.20) + " Rs");
        } else if (units > 300) {
            System.out.println(units * (1.50) + " Rs");
        } else
            System.out.println("Check the Value again");

    }
}
