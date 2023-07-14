package a0714.Ex9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5);
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
                System.out.println(distinctNumbers); //중복
    }
}
