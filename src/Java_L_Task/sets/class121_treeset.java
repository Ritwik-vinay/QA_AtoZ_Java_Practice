package Java_L_Task.sets;

import java.util.Iterator;
import java.util.TreeSet;

public class class121_treeset {
    public static void main(String[] args) {
        TreeSet tset = new TreeSet();
        tset.add("Ram");
        tset.add("Mohan");
        tset.add("Roy");
        // tset.add(55.3);
        //  tset.add(23.12);
        Iterator it = tset.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-------------------------");
        for (int i = 0; i < tset.size(); i++) {
            System.out.println(tset.pollLast());
        }


    }
}
