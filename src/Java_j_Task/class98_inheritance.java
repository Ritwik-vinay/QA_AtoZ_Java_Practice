package Java_j_Task;

public class class98_inheritance {
    public static void main(String[] args) {
        childg cg = new childg();
        cg.method();
    }
}

class fatherG {
    void method() {
        System.out.println("Single Inheritance");
    }
}

class childg extends fatherG {
    @Override
    void method() {
        super.method();
    }
}
