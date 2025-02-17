package Java_j_Task;

public class class91_oops {
    public static void main(String[] args) {
        vehicle v = new vehicle();
        v.speed();
        v.speed(230);
        vehicle v2 = new vehicle(10);


    }

}

class vehicle {
    vehicle() {
        System.out.println("DC");
    }

    vehicle(int a) {
        System.out.println("Parameterized Constructor" + a);
    }

    void speed() {
        int speed = 180;
        System.out.println("Default Method having speed " + speed);
    }

    //method overloading
    void speed(int b) {
        System.out.println("Parameterized Method speed " + b);
    }
}