package a0714.Ex9;

import java.util.Arrays;
import java.util.List;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer>numbers = Arrays.asList(1, 2, 3, 4, 5);    
        //
        numbers.forEach(number -> System.out.print(numbers));
    }
}