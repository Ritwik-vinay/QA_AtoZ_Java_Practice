package Java_K_Task;

public class class111_tryCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        int d = a + b;

        System.out.println(d);
    }
}
