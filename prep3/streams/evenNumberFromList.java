package streams;

import java.util.List;
import java.util.stream.Collectors;

public class evenNumberFromList {
    static void main() {
        List<Integer> number = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> even = number.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        System.out.println(even);
    }
}
