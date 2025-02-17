package Java_j_Task;

public class class93_oops_abst {
}

abstract class father {
    abstract void loan50k();

    void loan25k() {
        System.out.println("25k loan paid by Father");
    }
}

class child extends father {

    @Override
    void loan50k() {
        System.out.println("Paid the 50K loan by child");
    }
}
