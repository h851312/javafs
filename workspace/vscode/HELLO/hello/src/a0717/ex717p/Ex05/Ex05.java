package a0717.ex717p.Ex05;

import java.util.Arrays;
import java.util.List;

public class Ex05 {
    public static void main(String[] args) {
        List <String> list = Arrays.asList(
            "this is a javabook",
            "Lambda Expressions",
            "java8 supports lambda expressions"
        );
        
        list.stream()
        .filter(a -> a.toLowerCase().contains("java"))
        .forEach(a -> System.out.println(a));


    }
}
