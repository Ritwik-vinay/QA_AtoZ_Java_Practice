package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class removeDupeFromArrayList {
    static void main() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(9);
        arrayList.add(1);
        arrayList.add(6);
        arrayList.add(2);
        arrayList.add(5);
        ArrayList<Integer> uniqueList =
                removeDupe(arrayList);
        System.out.println("Uniquelist");
        for (int num : uniqueList) {
            System.out.print(num + " ");
        }

    }

    static ArrayList<Integer> removeDupe(ArrayList<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }
}
