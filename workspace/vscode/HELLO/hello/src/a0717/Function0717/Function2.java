package a0717.Function0717;
@FunctionalInterface
interface Calculator {
    int sum(int a, int b);
}
//여기서 주의해야 할 점은 Calculator 인터페이스의 메서드가 1개 이상이면 람다함수를 사용할 수 없다는 점이다.

public class Function2 {
    public static void main(String[] args) {
        Calculator mc = (int a, int b) -> a + b;
        int result = mc.sum(3,4);
        System.out.println(result);
    }
}
//괄호 사이의 int a, int b 는 Calculator 인터페이스의 sum함수의 입력항목에 해당하고
//-> 뒤의  a+b가 리턴값에 해당한다.
//이렇게 람다 함수를 사용하면
//MyCalculators와 같은 실제 클래스 없이도 Calculator 객체를 생성할 수 있다.
