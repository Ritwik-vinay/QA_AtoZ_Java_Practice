package Java_E_Task;

import java.util.Scanner;

public class class53emp_Net_Salary {
    public static void main(String[] args) {
        //input: Salary ouput>> Net Salary after deduction
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salary");
        double salary = sc.nextDouble();
        double grossSalary = 0;
        double netSalary = 0;
        if (salary > 0 && salary <= 1200000) {
            if (salary >= 21000) {
                grossSalary = salary + (salary * 0.40) + (salary * 0.10);
                netSalary = grossSalary - ((grossSalary * 0.12) + (grossSalary * 0.0075));
                System.out.println(netSalary);
            } else {
                System.out.println("Salary is less than 21000 so no tax " + (salary - ((salary * 0.0075))));
            }

        } else if (salary > 1200000 && salary <= 2400000) {
            grossSalary = salary + (salary * 0.40) + (salary * 0.10);
            netSalary = grossSalary - ((grossSalary * 0.12) + (grossSalary * 0.10) + (grossSalary * 0.0075));
            System.out.println(netSalary);
        } else if (salary > 2400000) {
            grossSalary = salary + (salary * 0.40) + (salary * 0.10);
            netSalary = grossSalary - ((grossSalary * 0.30) + (grossSalary * 0.10) + (grossSalary * 0.0075));
            System.out.println(netSalary);
        } else {
            System.out.println("enter proper value");
        }
    }
}
