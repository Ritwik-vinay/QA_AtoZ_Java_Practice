public class PrintfExample {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 30;
        double salary = 55000.75;

        // Basic usage
        System.out.printf("Name: %s, Age: %d%n", name, age);

        // Formatting a double to two decimal places
        System.out.printf("Salary: %.2f%n", salary);

        // Left-justifying within a field width
        System.out.printf("|%-10s|%n", "Hello");
    }
}