package Java_o_task;

public class class143_accessmod {
    public static void main(String[] args) {
        accessDemo accMod = new accessDemo();
        accMod.method1();
        accMod.method4();
        // accMod.method2();not accessible
        accMod.method3();
        System.out.println(accMod.pub_variable);
        System.out.println(accMod.def_variable);
        System.out.println(accMod.pro_variable);
        //System.out.println(accMod.pvt_variable); can't be accessed as it is private in nature
    }
}
//Creating all 4 access modifier methods and variables and access it in main class

class accessDemo {
    public int pub_variable = 10;
    protected int pro_variable = 30;
    //default variable
    int def_variable = 40;
    private int pvt_variable = 20;

    public void method1() {
        System.out.println("I am public in nature");
        System.out.println(pvt_variable);//only accessed within the class
    }

    private void method2() {
        System.out.println("I am pribate in nature");
    }

    protected void method3() {
        System.out.println("I am protected in nature");
    }

    void method4() {
        System.out.println("I am default acc mod");
    }
}