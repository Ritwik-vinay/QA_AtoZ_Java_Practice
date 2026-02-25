package streams;

import java.util.List;
import java.util.stream.Collectors;

public class convertsListToUppercase {
    static void main() {
        List<String> name = List.of("java", "automation", "selenium", "playwright");
        List<String> upperCase = name.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCase);
    }
}
