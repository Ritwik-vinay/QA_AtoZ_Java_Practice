public class swapTwoNumber_meth3 {
    public static void main(String[] args) {
        //Swap two number using exor
        int a = 20;
        int b = 10;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a);
        System.out.println(b);
    }
}
