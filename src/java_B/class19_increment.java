package java_B;

public class class19_increment {
    public static void main(String[] args) {
        int a= 10;
        //||Exp || Result
        //|| ++a || 11
        //|| a|| 11
        //|| a++ || 12
        //|| a   || 12
        //|| a++ || 13
        //11+11+12(++a + a + a)
        //34
        System.out.println(++a + a++ + a++);
        System.out.println(a);

    }
}
