package Java_E_Task;

import java.util.Scanner;

public class class50_Loan_Eligibility {
    public static void main(String[] args) {
        //input: age(int), Salary(float) and Credit Score(integer)
        //Rough Logic: Age>> age>0; age>18;age<80
        //             Salary:Salary>0;salary>30000
        //             creditScore: creditScore>0 ;creditScore>650; creditScore<850
        Scanner sc = new Scanner(System.in);
        System.out.println("Age!!!");
        int age = sc.nextInt();
        System.out.println("Salary!!!");
        float salary = sc.nextFloat();
        System.out.println("CreditScore!!!");
        int creditScore = sc.nextInt();
        if (age > 0 && age > 18 && age < 80) {
            if (salary > 0 && salary > 30000) {
                if (creditScore > 0 && creditScore > 650 && creditScore < 850) {
                    System.out.println("Hurray!!! You are eligible for the Loan");
                } else
                    System.out.println("OPPS!!! You are not eligible for the Loan");
            } else
                System.out.println("OPPS!!! You are not eligible for the Loan");
        } else
            System.out.println("OPPS!!! You are not eligible for the Loan");


    }
}
