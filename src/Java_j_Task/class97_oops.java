package Java_j_Task;

public class class97_oops {
    public static void main(String[] args) {
        sim sim = new mobileDetails("Apple", 956426456, "Jio");
        sim sim1 = new mobileDetails("Apple", 6543211, "Airtel");
    }
}

class mobileDetails extends sim {
    mobileDetails(String phoneModel_c, int number_c, String operator_c) {
        this.simdetails(phoneModel_c, number_c, operator_c);
    }

    @Override
    void simdetails(String phoneModel, int number, String operator) {
        System.out.println(phoneModel + "," + number + "," + operator);

    }
}

abstract class sim {
    abstract void simdetails(String phoneModel, int number, String operator);
}

