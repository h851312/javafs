package a0712.ex2;

public class HomeAgency implements Rentable<Home>{
    @Override
    public Home rent(){
        return new Home();
    }
    
}
