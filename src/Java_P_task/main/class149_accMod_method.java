package Java_P_task.main;

public class class149_accMod_method {
    public static void main(String[] args) {
        accmod_under_method aum = new accmod_under_method();
        aum.method_wit_accMod();
        Child obj = new Child();
        obj.show();        // Calls Child's method (Allowed)
        obj.callShow();
    }
}

class accmod_under_method {
    void method_wit_accMod() {
        // private int age = 45;
        // protected int age1 =56;
        // public int age2=70;
    }
}

class Parent {
    // Private method, not accessible outside Parent
    private void show() {
        System.out.println("Private method in Parent");
    }

    public void callShow() {
        show();  // Can be called within Parent
    }
}

class Child extends Parent {
    // This is not overriding; it's a separate method
    public void show() {
        System.out.println("Public method in Child");
    }
}
