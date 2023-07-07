package a0707.ex4;

public class Archer {
    String name;
    String power;

    public Archer(String name, String power) {
        this.name = name;
        this.power = power;
    }

    // object라는 클래스는 모든 객체의 조상클라스
    public boolean equals(Object obj) {

        Archer temp = (Archer) obj;
        // object가 아처보다 더 좊은 부모이기 때문에 상속을 받을수 있다.
        //그래서 temp로 바꿀수 있다.
        if (name == temp.name && power == temp.power) {
            return true;
        } else {
            return false;
        }
    }

}
