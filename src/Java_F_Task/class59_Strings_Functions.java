package Java_F_Task;

public class class59_Strings_Functions {
    public static void main(String[] args) {
        //ALl the Functions used by strings
        //1. Strings declared in 4 ways
        //1.Immutable
        String name = "Ritwik";
        System.out.println(name);
        //2.Immutable
        String str = new String("Vinay");
        System.out.println(str);
        //3.Mutable
        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append("Software");
        System.out.println(sbuilder);
        StringBuilder rev = sbuilder.reverse();
        System.out.println(rev);
        //4. Mutable
        //it is fast it is not Thread safe
        StringBuffer sbuffer = new StringBuffer();
        sbuffer.append("Engineer");
        System.out.println(sbuffer);
        String revStr = sbuffer.reverse().toString();
        System.out.println(revStr);
        //it is slow it is ThreadSafe
    }
}
