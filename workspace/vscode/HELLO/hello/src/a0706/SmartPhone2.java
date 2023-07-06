package a0706;

public class SmartPhone2 extends Phone2 {
    //자식생성자 선언
    public int weight;
    public SmartPhone2(String model, String color, int weight ) {
        super(model, color);
        this.weight = weight;

        System.out.println("SmartPhone2(String model, String color) 생성자 실행됨");
    }
}
