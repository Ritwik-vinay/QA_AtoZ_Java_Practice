package Java_j_Task;

public class class90_Oops_cons {
    public static void main(String[] args) {
        car c = new car("Maruti Swift", 2025);
        System.out.println(c.carName);
        System.out.println(c.year_of_purchase);
        car c1 = new car("Tata Punch", 2024);
        System.out.println(c1.carName);
        System.out.println(c1.year_of_purchase);


    }

}

class car {
    String carName;
    int year_of_purchase;

    //Parameterized Constructor
    car(String model_Name_c, int year_of_launch) {
        this.carName = model_Name_c;
        this.year_of_purchase = year_of_launch;
    }

}
