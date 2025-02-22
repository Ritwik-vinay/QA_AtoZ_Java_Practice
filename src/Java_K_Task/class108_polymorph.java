package Java_K_Task;

public class class108_polymorph {
    public static void main(String[] args) {
        student st = new student();
        st.student_details("Ritwik", 3);
        st.student_details();
    }
}

class student {
    String name;
    int rollno;

    void student_details(String name_c, int rollNo_c) {
        name = name_c;
        rollno = rollNo_c;
        System.out.println(name + " " + rollno);

    }

    void student_details() {
        String address = "Kolkata";
        System.out.println(address);
    }
}
