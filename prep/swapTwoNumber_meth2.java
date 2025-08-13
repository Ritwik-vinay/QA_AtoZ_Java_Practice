public class swapTwoNumber_meth2 {
    public static void main(String[] args) {
        //swap without using temp
        int a = 45;
        int b = 55;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}
