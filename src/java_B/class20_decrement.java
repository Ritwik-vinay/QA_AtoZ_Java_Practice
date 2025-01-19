package java_B;

public class class20_decrement {
    public static void main(String[] args) {
        int a =20;
        //||Exp || Result
        //|| --a|| 19
        //|| a || 19
        //|| a++|| 10
        //||a || 20
        //|| a-- || 19
        //--a + a +a(19+19+20= 58)


        System.out.println(--a + a++ + a--);
        System.out.println(a);
    }
}
