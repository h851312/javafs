package a0714.Ex9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream12 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "carrot", "banana", "eggplant");
        List<String> uniqueSortedStrings = strings.stream()
        .distinct()
        .sorted()
        .collect(Collectors.toList());
        System.out.println(uniqueSortedStrings);
    }
}
