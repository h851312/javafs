package a0714.Ex5;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 실행문이 두개 이상일 경우
        person.action((x, y) -> {
            double result = x + y;
            return result;
        });

        // 리턴문이 하나만 있을 경우(연산식)
        // preson.action((x, y) -> {
        // return (x + y)
        // });
        person.action((x, y) -> (x + y));
        //리턴문이 하나만 있고 메서드 호출을 포함하는 
        //경우는 중괄호와 리턴 키워드를 생략할 수 있다.

        // 리턴문이 하나만 있을 경우(메소드 호출)
        // preson.action((x, y) -> {
        // return sum(x, y);
        // });
        person.action((x, y) -> sum(x, y));
        
        // //일반함수
        // person.action(new Calcuable() {
        //     @Override
        //     public double calc(double x, double y) {
        //         double result = x + y;
        //         return result;
        //     }
        // });
    }

    public static double sum(double x, double y) {
        return (x + y);
    }
}
