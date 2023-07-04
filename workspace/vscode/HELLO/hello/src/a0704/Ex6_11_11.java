package a0704;

import java.util.Scanner;

public class Ex6_11_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("지금이 몇월인지 입력하세요.>");
        int num = scanner.nextInt();
        if(num == 12 || num == 1 || num == 2){
            System.out.println("겨울(winter)");
        } else if(num == 3 || num == 4 || num == 5){
            System.out.println("봄(spring)");
        } else if(num == 6 || num == 7 || num == 8){
            System.out.println("여름(summer)");
        } else if(num == 9 || num == 10 || num == 11){
            System.out.println("가을(Fall)");
        } else {
            System.out.println("잘못된 입력입니다.");
        }
    }
}
