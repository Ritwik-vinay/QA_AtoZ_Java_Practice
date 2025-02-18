package Java_j_Task;

public class class99_inherit_multilevel {
    public static void main(String[] args) {
        child_mul_inherit ch = new child_mul_inherit();
        ch.GFathermethod("GFather");
        ch.father("Father");
        ch.child();
    }
}

class child_mul_inherit extends father_mul_inherit {

    @Override
    void father(String Fname) {
        super.father(Fname);
    }

    void child() {
        System.out.println("Child");
    }
}

class father_mul_inherit extends Gfather_mul_inherit {
    @Override
    void GFathermethod(String name) {
        super.GFathermethod(name);
    }

    void father(String Fname) {
        System.out.println("Father name is " + Fname);
    }
}

class Gfather_mul_inherit {
    void GFathermethod(String name) {
        System.out.println("Gfather name is " + name);
    }
}