package a0717.Function0717;
//여기서 주의해야 할 점은 Calculator 인터페이스의 메서드가 1개 이상이면 람다함수를 사용할 수 없다는 점이다.

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Function5 {
    public static void main(String[] args) {
        //Calculator mc = (int a, int b) -> a + b;
        BinaryOperator<Integer> mc = (a, b) ->  a + b;
        int result = mc.apply(3,4);
        System.out.println(result);
    }
}
//BiFunction의 <Integer, Integer,Integer>제네릭스는 순서대로 입력항목2개, 출력항목 1개를 의미한다.
//그리고 BiFunction 인터페이스의 apply 메서드를 호출하면 람다함수(a,b) -> a+b가 실행된다.
