package Java_Q_Task;

import java.io.FileInputStream;
import java.io.IOException;

public class class156_unchecked {
    public static void main(String[] args) {
        //Unchecked error
        try {
            FileInputStream fis = null;
            fis.read();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
