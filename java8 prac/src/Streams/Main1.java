package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main1 {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(31,24,34,7,6,76,5);

        Optional<Integer> i = l1.stream().min((i1, i2) -> - i1.compareTo(i2));
        System.out.println(l1);

        System.out.println(i);

        Consumer<Integer> c = j-> System.out.println(j);

        Integer[] integers = l1.stream().toArray(Integer[]::new);
        Stream.of(integers).forEach(System.out::println);

        List<String> l = Arrays.asList("A","F","B");

        String[] strings = l.stream().sorted().toArray(String[]::new);
        Stream s = Stream.of(strings);
        s.forEach(System.out::println);



    }
}
