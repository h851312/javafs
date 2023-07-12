package a0712.ex2;

public interface Rentable<P> {
    P rent();
}
//Rantable이라는 이터페이스는 제네릭 타입 p 를 받아서 rent()메서드를 선언
//rent()메서드는 p타입의 객체를 반환