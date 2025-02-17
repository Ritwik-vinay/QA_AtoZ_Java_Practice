package Java_j_Task;

public class class92_oops2 {
    public static void main(String[] args) {
        vehicle v = new vehicle();
        v.speed();
        v.speed(230);
        car1 c = new car1();
        System.out.println("--------------");
        c.display();


    }

}

class car1 extends vehicle1 {
    private int speed = 300;

    car1() {
        super(10);
    }

    void display() {
        //super will display the speed of parent class
        System.out.println(super.speed);
        //this will display the speed of the same class
        System.out.println(this.speed);

    }

}

class vehicle1 {
    int speed = 180;

    vehicle1() {
        System.out.println("DC");
    }

    vehicle1(int a) {
        System.out.println("Parameterized Constructor" + a);
    }

    void speed() {
        System.out.println("Default Method having speed " + speed);
    }

    //method overloading
    void speed(int b) {
        System.out.println("Parameterized Method speed " + b);
    }
}