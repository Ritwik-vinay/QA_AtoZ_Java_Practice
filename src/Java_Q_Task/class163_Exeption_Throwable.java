package Java_Q_Task;

public class class163_Exeption_Throwable {
    public static void main(String[] args) {
        //Write a Java program that catches an exception using Exception
        // and another using Throwable to demonstrate their differences.

        try {
            int result = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            stackOverFlow();
        } catch (Throwable t) {
            System.out.println(t.getClass().getSimpleName());
        }
    }

    public static void stackOverFlow() {
        stackOverFlow();

    }
}
