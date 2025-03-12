package Java_Q_Task;

public class class161_FinallyBlock_exeption {
    public static void main(String[] args) {
        //Write a Java program that prints a message after the finally block and also causes an exception inside finally.
        int a = 30;
        int b = 0;
        int c = 10;
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("error found Zero");
        }
        System.out.println(result = a * c);

    }
}
