package Java_Q_Task;

public class class162_multiExceptions {
    public static void main(String[] args) {
        //Write a Java program that catches IOException
        // and SQLException using a single catch block with the multi-catch feature.
        String name = null;
        int value = 0;
        try {
            System.out.println(name.length());
            System.out.println(value / 0);
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println(e.getMessage());


        }


    }
}
