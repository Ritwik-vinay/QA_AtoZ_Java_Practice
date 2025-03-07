package Java_P_task.main;

public class class147_increa_accMod {
    public static void main(String[] args) {
        child clildclass = new child();
        clildclass.show();
    }
}

class child extends parentclass {
    @Override
    public void show() {
        System.out.println("I am child method");
    }
}

class parentclass {
    protected void show() {
        System.out.println("I am protected method");
    }
}
