package Java_j_Task;

public class class95_Static {
    public static void main(String[] args) {
        ATB s1 = new ATB(98763122, "Umesh");
        ATB s2 = new ATB(654123456, "naresh");

        System.out.println(s1.name);
        System.out.println(s1.phoneno);
        System.out.println(s1.course);
        System.out.println("------------");
        System.out.println(s2.name);
        System.out.println(s2.phoneno);
        System.out.println(s2.course);
    }
}

class ATB {
    static String course = "Automation SDET";
    int phoneno;
    String name;


    public ATB(int phoneno_c, String name_c) {
        this.phoneno = phoneno_c;
        this.name = name_c;

    }
}
