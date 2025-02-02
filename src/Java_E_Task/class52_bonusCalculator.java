package Java_E_Task;

import java.util.Scanner;

public class class52_bonusCalculator {
    public static void main(String[] args) {
        //input>> Salary as float and years of exp as double && output>> Salary * bonus%
        //if year of exp || Bonus
        //     exp<1     || 0 Bonus
        //exp>1 && exp<3 || 5% Bonus
        //exp>4 && exp<6 || 10% Bonus
        //exp>6          || 15% Bonus\
        //Code Implementation!!!!!!!!!!
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salary");
        double salary = sc.nextDouble();
        System.out.println("Years of Experience if any?");
        double yoE = sc.nextDouble();
        if (yoE < 1) {
            System.out.println(salary + " Sorry No Bonus this year");
        } else if (yoE >= 1 && yoE <= 3) {
            System.out.println(salary + (salary * 0.05) + " Hurray You got 5% Bonus");
        } else if (yoE > 4 && yoE <= 6) {
            System.out.println(salary + (salary * 0.10) + " Hurray You got 10% Bonus");
        } else if (yoE > 6) {
            System.out.println(salary + (salary * 0.15) + " Hurray You got 15% Bonus");
        } else {
            System.out.println("Input Error!!!!");
        }
    }
}
