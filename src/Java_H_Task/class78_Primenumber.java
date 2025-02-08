package Java_H_Task;

public class class78_Primenumber {
    public static void main(String[] args) {
        //10. Check if a Number is Prime
        int num = 80;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("It is a Prime Number");
        } else
            System.out.println("It is not a Prime Number");

    }

}
