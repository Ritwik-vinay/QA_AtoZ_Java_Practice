package Java_j_Task;

interface mother {
    void money();

    void m1();
}

interface father1 {
    void money();

    void f1();

}

public class class94_interface {
    public static void main(String[] args) {
        child1 c = new child1();
        c.f1();
        c.m1();
        c.money();
    }
}

class child1 implements mother, father1 {

    @Override
    public void f1() {
        System.out.println("Father's F1 method");

    }

    @Override
    public void money() {
        System.out.println("Fake method are created in both interface class");

    }

    @Override
    public void m1() {
        System.out.println("Mother's m1 method");

    }
}