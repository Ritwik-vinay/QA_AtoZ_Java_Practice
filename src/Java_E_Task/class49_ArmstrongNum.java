package Java_E_Task;

import java.util.Scanner;

public class class49_ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int oriNum = num;
        int sum = 0;
        int count = 0;
        int temp = num;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp = temp / 10;
            System.out.println(temp);
        }
        if (sum == oriNum) {
            System.out.println(oriNum + " is an Armstrong number! ");
        } else {
            System.out.println(oriNum + " is NOT an Armstrong number. ");
        }

        sc.close();
    }
}
