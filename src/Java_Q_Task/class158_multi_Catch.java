package Java_Q_Task;

public class class158_multi_Catch {
    public static void main(String[] args) {
        //Write a Java program with multiple catch blocks handling ArithmeticException
        // and ArrayIndexOutOfBoundsException in the correct order.
        int[] arr1 = {2, 3, 5, 12, 14, 16, 18};
        int div = 2;
        int zeroDiv = 0;
        try {
            int result = arr1[0] / zeroDiv;
            System.out.println("Result: " + result);
            int result1 = arr1[7] / div;
            System.out.println("Result 1: " + result1);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
