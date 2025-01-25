package Java_C_Task;

public class class25_FizzBuZZ {
    public static void main(String[] args) {
        //Program to Write number from 1-100
        //Where number is divisible of 3 then print Fizz
        //Where number is divisible of 5 then print Buzz
        //Where number is divisible of 3 & 5 then print FizzBuzz
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            } else if (i % 3 == 0) {
                System.out.println("Fizz");

            } else {
                System.out.println(i);
            }

        }
    }
}
