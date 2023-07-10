package a0710;

public class Main1 implements Dog, Cat{
    public static void main(String[] args) {
        Main1 main =  new Main1();
        main.crying();
        main.one();
        main.two();
        
    }

    @Override
    public void crying() {
        // TODO Auto-generated method stub
        System.out.println("월월");
        
    }

    @Override
    public void one() {
        // TODO Auto-generated method stub
        System.out.println("One");
        
    }

    @Override
    public void two() {
        // TODO Auto-generated method stub
        System.out.println("Two");
        
    }

 

}
