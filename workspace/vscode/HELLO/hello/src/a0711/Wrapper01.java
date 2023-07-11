package a0711;

public class Wrapper01 {
    public static void main(String[] args) {
        //Integer num = new Integer(17); //박싱
        Integer num = Integer.valueOf(17); //박싱
        int n = num.intValue();   //언박싱
        System.out.println(n);

        Character ch = 'X';    // Character ch = new.Character('X');  : 오토박스   
        char c = ch;
        System.out.println(c); 
    }
}
