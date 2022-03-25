import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Lambda expression example
        ArrayList<String> a = new ArrayList<>();
        a.add("Michael");
        a.add("Dima");
        a.add("Roman");
        a.add("Anton");
        a.add("Ilia");
        Collections.sort(a,
                (s1, s2) -> s1.length() - s2.length());
        System.out.println(a);

        // Stream API example 1
        System.out.println(
                a.stream()
                        .map(String::length)
                        .collect(Collectors.toList()));

        // Stream API example 2
        System.out.println(a.stream().collect(
                Collectors.groupingBy(
                        String::length)));
    }
}
