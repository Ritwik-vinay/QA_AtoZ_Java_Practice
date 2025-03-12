package Java_Q_Task;

import java.io.FileInputStream;
import java.io.IOException;

public class class159_throw {
    public static void main(String[] args) {
        //Write a Java program demonstrating throw by manually throwing an exception
        // and throws by declaring an exception in a method signature.
        try {
            execution_methods.method1(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            execution_methods.method2();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

class execution_methods {
    // Method using 'throw' to manually throw an IllegalArgumentException
    public static void method1(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        } else {
            System.out.println("valid number " + number);
        }

    }

    // Method using 'throws' to declare IOException
    public static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("No_FIS_present.txt");
        fis.read();

    }
}
