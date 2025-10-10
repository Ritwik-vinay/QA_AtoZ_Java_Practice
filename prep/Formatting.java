public class Formatting {
    public static void main(String[] args) {
        //Number formatting
        int a = 212300;
        //For the number formatting %,d -> denotes the thousand saperation
        System.out.printf("%,d%n", a);


        //Decimal formatting
        double b = 3.14159265359;
        System.out.printf("%.2f", b);

        System.out.printf("\n%8f", b);

        boolean v = false;
        System.out.printf("\n%b", v);
        System.out.println("");
        char c = 'A';
        System.out.printf("%C", c);
        System.out.println();
        System.out.printf("Hello\tWorld");
        System.out.println();
        System.out.printf("My New code is \n -> Working");


    }
}
