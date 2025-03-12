package Java_Q_Task;

public class class160_ExceptionNotHandled {
    public static void main(String[] args) {
        //Write a Java program that raises an unchecked exception (NullPointerException)
        // without handling it and observe the output.
        String name = null;
        int count = name.length();
        System.out.println(count);
    }
}
