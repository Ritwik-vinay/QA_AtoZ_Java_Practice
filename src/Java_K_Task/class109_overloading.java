package Java_K_Task;

public class class109_overloading {
    public static void main(String[] args) {
        person persn = new person("Ritwik");
        person detail2 = new person("Ritwik", 29);
        person detail3 = new person("Ritwik", 29, "kolkata");

    }

}

class person {
    //overloading constructor

    person(String name_c) {
        System.out.println(name_c);
    }

    person(String name, int age) {
        System.out.println(name + " " + age);
    }

    person(String name, int age, String address) {
        System.out.println(name + " " + age + " " + address);
    }
}