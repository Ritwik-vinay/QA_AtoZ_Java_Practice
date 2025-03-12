package Java_Q_Task;

public class class154_Exception01 {
    public static void main(String[] args) {
        //Write a Java program that demonstrates an exception (ArithmeticException)
        // and an error (StackOverflowError).
        // calculateFactorial(100000);//StackOverflowErro
        try {
            int integerfirst = 54;
            int integersec = 0;
            int result = integerfirst / integersec;
            System.out.println(result);//this will create exception

        } catch (ArithmeticException e) {
            System.out.println("Divisible by Zero");
        }
    }


    public static long calculateFactorial(int n) {
        return n * calculateFactorial(n - 1); // Missing base case
    }
}


