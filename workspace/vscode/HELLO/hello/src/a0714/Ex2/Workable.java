package a0714.Ex2;

@FunctionalInterface
//함수형 Workable을 정의하고, Persin 클래스에서 해당 인터페이스를 활용
public interface Workable {
    void work(); // 단 한개의 추상 메소드 work가 있으므로
    //익명클래스를 생성하면서 work메소드를 재정의 해서 구현
    //work 추상 메소드를 저의
    //매개변수가 없고 실행문이 포함되어 있지만 반환값이 없는 메소드
}