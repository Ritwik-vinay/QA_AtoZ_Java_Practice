package Java_L_Task.lists;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class class114_vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Shwift");
        v.add("Suzuki shwift");
        v.add("Baleno");
        v.add(54);
        v.add(86);
        v.add(true);
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
        System.out.println("-----------for each");
        for (Object o : v) {
            System.out.println(o);
        }
        System.out.println("---------iterator");
        Iterator i = v.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("----------Enumeration");
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());

        }
    }
}
