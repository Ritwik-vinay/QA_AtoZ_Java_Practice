package Java_C_Task;

public class class29_rev2 {
    public static void main(String[] args) {
        int original = 987654321;
        int rev = 0;
        while (original != 0) {
            rev = rev * 10;
            rev = rev + original % 10;
            original = original / 10;
        }
        System.out.println(rev);

    }
}
