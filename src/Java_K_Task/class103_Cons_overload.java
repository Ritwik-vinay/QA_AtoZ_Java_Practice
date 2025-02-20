package Java_K_Task;

public class class103_Cons_overload {
    public static void main(String[] args) {
        overloadCons cons = new overloadCons();
        overloadCons cons1 = new overloadCons("OverLoading Constructor");
    }
}

class overloadCons {
    String para;

    overloadCons() {
        System.out.println("I am default cons");
    }

    overloadCons(String paramerter) {
        this.para = paramerter;
        System.out.println("I am " + paramerter);

    }
}
