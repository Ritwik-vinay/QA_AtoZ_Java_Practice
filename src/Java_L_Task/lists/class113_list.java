package Java_L_Task.lists;

import java.util.ArrayList;
import java.util.List;

public class class113_list {
    public static void main(String[] args) {
        List mylist = new ArrayList();
        mylist.add("Orange");
        mylist.add("Apple");
        mylist.add("Berry");
        mylist.add("Apple");
        List mylist2 = new ArrayList();
        mylist2.add("Santa");
        mylist2.add("seb");
        mylist2.add("kela");
        System.out.println(mylist.size());
        System.out.println(mylist);
        System.out.println(mylist.get(2));
        System.out.println(mylist.addAll(mylist2));
        System.out.println(mylist);


    }
}
