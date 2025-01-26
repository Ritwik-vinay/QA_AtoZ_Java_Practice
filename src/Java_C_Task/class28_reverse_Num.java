package Java_C_Task;

public class class28_reverse_Num {
    public static void main(String[] args) {
        int o = 12345;
        int r = 0;
        while (o != 0) {
            r = r * 10;
            r = r + o % 10;
            o = o / 10;
        }
        System.out.println(r);
    }

}
