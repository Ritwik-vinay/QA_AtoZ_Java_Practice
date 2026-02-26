package streams;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class flatterAList {
    static void main() {
        List<List<Integer>> list= List.of(
                List.of(1,2),
                List.of(3,4),
                List.of(5)
        );
        List<Integer> flatList= list.stream().flatMap(List::stream).collect(Collectors.toList());

        System.out.println(flatList);
    }
}
