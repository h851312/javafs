package a0707.ani;

public class Main11 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.crying();
        cat.crying();
    }
}

//추상
//자바에서 일종의미완성의 클래스라고 할 수 있는 추상클래스 제공
//직접적으로 객체 인스턴스를 생설할 수 없음
//설계로서 틀을 갖추고 클래스를 작성할 수 있게 한다는 특징
//꼭 상속을 받아야 하고 모든 추상 메소드는 반드시 구현해야 한다.

//public - >abstract바꿔서 추상이라는 의미를 알려줌

// 추상으로 만들었던걸 반드시 상속 받아야함
