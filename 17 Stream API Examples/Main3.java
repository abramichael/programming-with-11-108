import java.util.*;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("Dima");
        a.add("Kamila");
        a.add("Roman");
        a.add("Vladislav");
        a.add("Bylobyslav");
        List<String> b = a.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(b);
        System.out.println(a.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.joining(", "))
        );

        System.out.println(a.stream()
                .filter(s -> s.endsWith("slav"))
                .collect(Collectors.toList())
        );

        System.out.println(a.stream()
                .filter(s -> s.endsWith("slavna"))
                .findFirst()
                .orElse("Miroslav")
        );

        System.out.println(
                a.stream()
                .allMatch(s -> ('A' <= s.charAt(0) && s.charAt(0) <= 'Z'))
        );

        System.out.println(a.stream()
                .filter(s -> s.endsWith("slav"))
                .findAny()
                .orElse("Miroslav")
        );
        System.out.println(" =================== ");
        // 1
        a.stream()
                .forEach(System.out::println);
        // 2
        for (String s : a) {
            System.out.println(s);
        }

        System.out.println(a.stream()
                .reduce((s1, s2) -> s1 + ", " + s2)
                .orElse("No names provided. Add some.")
        );

        System.out.println(
                Arrays.toString(a.stream()
                .mapToInt(s -> s.length())
                .distinct()
                .toArray())
        );

    }
}
