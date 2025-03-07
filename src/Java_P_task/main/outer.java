package Java_P_task.main;


public class outer {
    public void accessPrivateInner() {
        PrivateInner inner = new PrivateInner();  // ✔️ Accessible inside Outer
        inner.display();
    }

    private class PrivateInner {
        void display() {
            System.out.println("Private Inner Class");
        }
    }
}

