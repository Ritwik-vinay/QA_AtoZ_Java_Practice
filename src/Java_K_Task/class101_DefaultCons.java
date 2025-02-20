package Java_K_Task;

public class class101_DefaultCons {
    public static void main(String[] args) {
        cons c = new cons();
        System.out.println("Default Cons: i can be invoked automatically after the object is created and i don't have any parameters");
    }
}

class cons {
    cons() {
        System.out.println("I am default Constructor");
    }
}
