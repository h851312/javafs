package a0706;

public class Math_1 {
    public static void main(String[] args) {
        System.out.println(Math.ceil(10.0));
        System.out.println(Math.ceil(10.1));  //11
        System.out.println(Math.ceil(10.00000001));  //11

        System.out.println(Math.floor(10.00000001));  //10
        System.out.println(Math.floor(10.9));  //10

        System.out.println(Math.round(10.0));  //10
        System.out.println(Math.round(10.4));  //10
        System.out.println(Math.round(10.5));  //11
    }
}
