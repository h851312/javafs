package a0707.ex11;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요.>");
        int a = scanner.nextInt();
        System.out.println("두번째 숫자를 입력하세요.>");
        int b = scanner.nextInt();
        if( b%a == 0){
            System.out.printf("%d*%d=%d", a, b/a, b);
        }else if(a%b == 0){
            System.out.printf("%d*%d=%d", b, a/b, a);
        }else {
            System.out.println("none");
        }

    }

}
