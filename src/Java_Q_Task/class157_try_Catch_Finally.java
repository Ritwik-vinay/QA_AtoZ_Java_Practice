package Java_Q_Task;

public class class157_try_Catch_Finally {
    public static void main(String[] args) {
        //Write a Java program that includes try, catch,
        // and finally blocks to handle an exception and ensure that the finally block executes
        int a = 12;
        int b = 0;
        int c = 2;
        try {
            int div = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {

            int div = a / c;
            System.out.println(div);
        }
    }
}
