package Java_Q_Task;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class class155_checked {
    public static void main(String[] args) {
        //Write a Java program that demonstrates a checked exception (IOException)
        // and an unchecked exception (NullPointerException).
        try {
            FileInputStream fis = new FileInputStream("no_File.txt");
        } catch (FileNotFoundException e) {
            System.out.println("no file found");

        }
    }
}
