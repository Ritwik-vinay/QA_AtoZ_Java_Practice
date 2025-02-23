package Java_K_Task;

public class class110_overriding {
    public static void main(String[] args) {
        vehicle v = new car();
        v.move("Shwift");
    }
}

class car extends vehicle {
    @Override
    void move(String car_c) {
        String vehicle_name = car_c;
        System.out.println(vehicle_name + " of car class");
    }
}

class vehicle {
    void move(String car_c) {
        String vehicle_name = car_c;
        System.out.println(vehicle_name);
    }

    ;
}
