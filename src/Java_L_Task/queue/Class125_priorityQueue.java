package Java_L_Task.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Class125_priorityQueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add("Name");
        pq.add("Roll No");
        pq.add("Class");
        pq.add("Subject");
        System.out.println(pq);
        Iterator it = pq.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
        System.out.println("----------------------");
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
