package a0712.ex1;

public class GenericExample {
    public static void main(String[] args) {
        //k는 TV로 대체 M은 String으로 대체
        Product<Tv, String> product1 = new Product<>();

        //Setter매개값은 반드시 Tv와 String을 제공
        product1.setKind(new Tv());
        product1.setModel("스마트TV");

        //Getter 리턴값은 Tv와String이 됨
        Tv tv = product1.getKind();
        String tvModel = product1.getModel();
        System.out.println("product1의 kind: " + tv);
        System.out.println("product1의 model: " + tvModel);

        //K는 Car로 대체, M은 String으로 대체
        Product<Car, String> product2 = new Product<>();

        //Setter 매개값은 반드시 Car와 String을 제공
        product2.setKind(new Car());
        product2.setModel("SUV자동차");

        //Getter 리턴값은 Car와 String이 됨
        Car car = product2.getKind();
        String carModel= product2.getModel();
        System.out.println("product2의 kind : " + car);
        System.out.println("product2의 model : " + carModel);

    }
}
//main 메서드에는 두개의 product 객체를 생성하고 사용하는 예제가 제시되어 있습니다.
// 1. Product객체를 product1은 Tv와 String을 타입 매개 변수로 지정하여 생성되었습니다.
// product1.setKind(new Tv())를 통해 kind에는 Tv객체가,
//product1.setModel("스마트Tv")을 통해 model에는 "스마트 Tv"문자열이 저장
//product1.getKind()를 호출하면 Tv객체가 반환
//product1.getModel()를 호출하면 "스마트Tv"문자열이 반환됩니다.
//2.Product객체 product2도 마찬가지로 Car와 String을 매개변수로 지정하여 생성되었습니다.product2.setKind(new Car())를 통해 kind에는 Car 객체가, product2.setModel("SUV자동차")을 통해 model에는"SUV자동차"문자열이 저장되었습니다. 이후 product2.getKind()호출하면 Car객체가 반환되고, product2.getModel()호출하면 "SUV자동차" 문자열이 반환됩니다.

// 제네릭을 사용하면 Product 클래스에서 다양한 종류의 제품을 다룰수 있으며, 타입안정성과 토드 재사용성을 높일수 있습니다.

