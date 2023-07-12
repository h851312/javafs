package a0712.ex2;

public class GenelicExample {
    public static void main(String[] args) {
        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnLight();

        CarAgency carAgency = new CarAgency();
        Car car = carAgency.rent();
        car.run();
    }
}
//HomeAgency의 rent()메서드를 호출하여 Home객체를 얻고, 이후 turnOnLight()메서드를 호출하여 전등을 켭니다.
//CarAgency의 rent()메서드를 호출하여 Car객체를 얻고, 이후 run()메서드를 호출하여 자동차가 달립니다.
